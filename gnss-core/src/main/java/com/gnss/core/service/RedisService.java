package com.gnss.core.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.gnss.core.constants.RedisConstant;
import com.gnss.core.proto.LocationProto;
import com.gnss.core.proto.TerminalProto;
import com.gnss.core.proto.TerminalStatusProto;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>Description: Redis服务</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/11/5
 */
public class RedisService {

    private StringRedisTemplate redisTemplate;

    private ValueOperations<String, String> valueOperations;

    private HashOperations<String, String, String> hashOperations;

    public RedisService(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.valueOperations = redisTemplate.opsForValue();
        this.hashOperations = redisTemplate.opsForHash();
    }

    /**
     * 缓存在线终端
     *
     * @param terminalInfo 终端信息
     */
    public void putOnlineTerminal(TerminalProto terminalInfo) {
        String jsonStr = JSON.toJSONString(terminalInfo);
        hashOperations.put(RedisConstant.TERMINAL_ONLINE_REDIS_KEY, terminalInfo.getTerminalStrId(), jsonStr);
    }

    /**
     * 获取在线终端
     *
     * @param terminalStrId 终端ID
     * @return 终端信息
     */
    public TerminalProto getOnlineTerminal(String terminalStrId) {
        String jsonStr = hashOperations.get(RedisConstant.TERMINAL_ONLINE_REDIS_KEY, terminalStrId);
        if (jsonStr == null) {
            return null;
        }
        return JSON.parseObject(jsonStr, TerminalProto.class);
    }

    /**
     * 删除在线终端
     *
     * @param terminalInfo 终端信息
     */
    public void deleteOnlineTerminal(TerminalProto terminalInfo) {
        hashOperations.delete(RedisConstant.TERMINAL_ONLINE_REDIS_KEY, terminalInfo.getTerminalStrId());
    }

    /**
     * 删除某个节点的所有在线终端
     *
     * @param nodeName 节点名称
     */
    public void deleteAllOnlineTerminals(String nodeName) {
        Map<String, String> map = hashOperations.entries(RedisConstant.TERMINAL_ONLINE_REDIS_KEY);
        map.forEach((k, v) -> {
            TerminalProto terminalInfo = JSON.parseObject(v, TerminalProto.class);
            if (Objects.equals(nodeName, terminalInfo.getNodeName())) {
                hashOperations.delete(RedisConstant.TERMINAL_ONLINE_REDIS_KEY, k);
            }
        });
    }

    /**
     * 缓存终端信息
     *
     * @param terminalInfo 终端信息
     */
    public void putTerminalInfo(TerminalProto terminalInfo) {
        String jsonStr = JSON.toJSONString(terminalInfo);
        hashOperations.put(RedisConstant.TERMINAL_INFO_REDIS_KEY, terminalInfo.getTerminalStrId(), jsonStr);
        hashOperations.put(RedisConstant.SIMCARD_REDIS_KEY, terminalInfo.getTerminalSimCode(), jsonStr);
        hashOperations.put(RedisConstant.TERMINAL_NUM_REDIS_KEY, terminalInfo.getTerminalNum(), jsonStr);
        hashOperations.put(RedisConstant.VEHICLE_NUM_REDIS_KEY, terminalInfo.getVehicleNum(), jsonStr);
    }

    /**
     * 更新终端信息
     *
     * @param terminalInfo
     */
    public void updateTerminalInfo(TerminalProto terminalInfo) {
        TerminalProto oldTerminalInfo = getTerminalInfo(terminalInfo.getTerminalStrId());
        //删除以前的终端信息
        if (oldTerminalInfo != null) {
            hashOperations.delete(RedisConstant.TERMINAL_INFO_REDIS_KEY, oldTerminalInfo.getTerminalStrId());
            hashOperations.delete(RedisConstant.SIMCARD_REDIS_KEY, oldTerminalInfo.getTerminalSimCode());
            hashOperations.delete(RedisConstant.TERMINAL_NUM_REDIS_KEY, oldTerminalInfo.getTerminalNum());
            hashOperations.delete(RedisConstant.VEHICLE_NUM_REDIS_KEY, oldTerminalInfo.getVehicleNum());
        }
        putTerminalInfo(terminalInfo);
    }

    /**
     * 批量缓存终端信息
     *
     * @param terminalInfoList
     */
    public void batchPutTerminalInfo(List<TerminalProto> terminalInfoList) {
        if (terminalInfoList == null || terminalInfoList.isEmpty()) {
            return;
        }
        int size = terminalInfoList.size();
        Map<String, String> terminalIdMap = new HashMap<>(size);
        Map<String, String> simcardMap = new HashMap<>(size);
        Map<String, String> terminalNumMap = new HashMap<>(size);
        Map<String, String> vehicleNumMap = new HashMap<>(size);
        terminalInfoList.forEach(terminalInfo -> {
            String jsonStr = JSON.toJSONString(terminalInfo);
            if (terminalInfo.getTerminalStrId() != null) {
                terminalIdMap.put(terminalInfo.getTerminalStrId(), jsonStr);
            }
            if (terminalInfo.getTerminalSimCode() != null) {
                simcardMap.put(terminalInfo.getTerminalSimCode(), jsonStr);
            }
            if (terminalInfo.getTerminalNum() != null) {
                terminalNumMap.put(terminalInfo.getTerminalNum(), jsonStr);
            }
            if (terminalInfo.getVehicleNum() != null) {
                vehicleNumMap.put(terminalInfo.getVehicleNum(), jsonStr);
            }
        });
        hashOperations.putAll(RedisConstant.TERMINAL_INFO_REDIS_KEY, terminalIdMap);
        hashOperations.putAll(RedisConstant.SIMCARD_REDIS_KEY, simcardMap);
        hashOperations.putAll(RedisConstant.TERMINAL_NUM_REDIS_KEY, terminalNumMap);
        hashOperations.putAll(RedisConstant.VEHICLE_NUM_REDIS_KEY, vehicleNumMap);
    }

    /**
     * 删除所有终端信息
     */
    public void deleteAllTerminalInfo() {
        deleteAll(RedisConstant.TERMINAL_INFO_REDIS_KEY);
        deleteAll(RedisConstant.SIMCARD_REDIS_KEY);
        deleteAll(RedisConstant.TERMINAL_NUM_REDIS_KEY);
        deleteAll(RedisConstant.VEHICLE_NUM_REDIS_KEY);
    }

    /**
     * 删除Redis某个Key的所有值
     *
     * @param redisKey
     */
    private void deleteAll(String redisKey) {
        Set<String> keys = hashOperations.keys(redisKey);
        if (keys != null && !keys.isEmpty()) {
            String[] keyArr = new String[keys.size()];
            hashOperations.delete(redisKey, keys.toArray(keyArr));
        }
    }

    /**
     * 获取终端信息
     *
     * @param terminalStrId 终端ID
     * @return 终端信息
     */
    public TerminalProto getTerminalInfo(String terminalStrId) {
        String jsonStr = hashOperations.get(RedisConstant.TERMINAL_INFO_REDIS_KEY, terminalStrId);
        if (jsonStr == null) {
            return null;
        }
        return JSON.parseObject(jsonStr, TerminalProto.class);
    }

    /**
     * 获取终端信息
     *
     * @param simCode 终端手机号
     * @return 终端信息
     */
    public TerminalProto getTerminalInfoBySimCode(String simCode) {
        String jsonStr = hashOperations.get(RedisConstant.SIMCARD_REDIS_KEY, simCode);
        if (jsonStr == null) {
            return null;
        }
        return JSON.parseObject(jsonStr, TerminalProto.class);
    }

    /**
     * 获取终端信息
     *
     * @param terminalNum 终端号码
     * @return 终端信息
     */
    public TerminalProto getTerminalInfoByTerminalNum(String terminalNum) {
        String jsonStr = hashOperations.get(RedisConstant.TERMINAL_NUM_REDIS_KEY, terminalNum);
        if (jsonStr == null) {
            return null;
        }
        return JSON.parseObject(jsonStr, TerminalProto.class);
    }

    /**
     * 获取终端信息
     *
     * @param vehicleNum 车牌号码
     * @return 终端信息
     */
    public TerminalProto getTerminalInfoByVehicleNum(String vehicleNum) {
        String jsonStr = hashOperations.get(RedisConstant.VEHICLE_NUM_REDIS_KEY, vehicleNum);
        if (jsonStr == null) {
            return null;
        }
        return JSON.parseObject(jsonStr, TerminalProto.class);
    }

    /**
     * 缓存终端状态
     *
     * @param terminalStatusProto 终端状态
     */
    public void putTerminalStatus(TerminalStatusProto terminalStatusProto) {
        String jsonStr = JSON.toJSONString(terminalStatusProto);
        hashOperations.put(RedisConstant.TERMINAL_STATUS_REDIS_KEY, terminalStatusProto.getTerminalInfo().getTerminalStrId(), jsonStr);
    }

    /**
     * 获取终端状态
     *
     * @param terminalStrId 终端ID
     * @return
     */
    public TerminalStatusProto getTerminalStatus(String terminalStrId) {
        String jsonStr = hashOperations.get(RedisConstant.TERMINAL_STATUS_REDIS_KEY, terminalStrId);
        if (jsonStr == null) {
            return null;
        }
        return JSON.parseObject(jsonStr, TerminalStatusProto.class);
    }

    /**
     * 批量获取终端状态
     *
     * @param terminalIdList
     * @return
     */
    public List<TerminalStatusProto> multiGetTerminalStatus(List<String> terminalIdList) {
        List<String> jsonStrList = hashOperations.multiGet(RedisConstant.TERMINAL_STATUS_REDIS_KEY, terminalIdList);
        List<TerminalStatusProto> list = jsonStrList.stream()
                .map(jsonStr -> jsonStr == null ? null : JSON.parseObject(jsonStr, TerminalStatusProto.class))
                .collect(Collectors.toList());
        return list;
    }

    /**
     * 缓存终端位置
     *
     * @param terminalStatusProto 位置信息
     */
    public void putLastLocation(TerminalStatusProto terminalStatusProto) {
        String jsonStr = JSON.toJSONString(terminalStatusProto.getLocation());
        hashOperations.put(RedisConstant.LOCATION_REDIS_KEY, terminalStatusProto.getTerminalInfo().getTerminalStrId(), jsonStr);
    }

    /**
     * 获取终端最新位置
     *
     * @param terminalStrId 终端ID
     * @return
     */
    public LocationProto getLastLocation(String terminalStrId) {
        String jsonStr = hashOperations.get(RedisConstant.LOCATION_REDIS_KEY, terminalStrId);
        if (jsonStr == null) {
            return null;
        }
        return JSON.parseObject(jsonStr, LocationProto.class);
    }

    /**
     * 删除所有JT809配置
     */
    public void deleteAllJt809Config() {
        deleteAll(RedisConstant.JT809_CONFIG_REDIS_KEY);
    }

    /**
     * 获取JT809平台与终端关联关系
     *
     * @param terminalStrId
     * @return
     */
    public List<Long> getJt809TerminalRel(String terminalStrId) {
        String jsonStr = hashOperations.get(RedisConstant.JT809_TERMINAL_REL_REDIS_KEY, terminalStrId);
        if (jsonStr == null) {
            return null;
        }
        return JSON.parseObject(jsonStr, new TypeReference<List<Long>>() {
        });
    }

    /**
     * 批量缓存JT809平台与终端关联关系
     *
     * @param jt809TerminalRelMap
     */
    public void batchPutJt809TerminalRel(Map<String, List<Long>> jt809TerminalRelMap) {
        if (jt809TerminalRelMap == null || jt809TerminalRelMap.isEmpty()) {
            return;
        }
        Map<String, String> map = jt809TerminalRelMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> JSON.toJSONString(e.getValue())));
        hashOperations.putAll(RedisConstant.JT809_TERMINAL_REL_REDIS_KEY, map);
    }

    /**
     * 缓存JT809平台与终端关联关系
     *
     * @param jt809ConfigIdList
     */
    public void putJt809TerminalRel(String terminalStrId, List<Long> jt809ConfigIdList) {
        hashOperations.put(RedisConstant.JT809_TERMINAL_REL_REDIS_KEY, terminalStrId, JSON.toJSONString(jt809ConfigIdList));
    }

    /**
     * 删除JT809平台与终端关联关系
     *
     * @param terminalStrId 终端ID
     */
    public void deleteJt809TerminalRel(String terminalStrId) {
        hashOperations.delete(RedisConstant.JT809_TERMINAL_REL_REDIS_KEY, terminalStrId);
    }

    /**
     * 删除所有JT809平台与终端关联关系
     */
    public void deleteAllJt809TerminalRel() {
        deleteAll(RedisConstant.JT809_TERMINAL_REL_REDIS_KEY);
    }

    /**
     * 缓存服务器配置信息
     *
     * @param nodeName
     * @param serverInfo
     */
    public void putServerInfo(String nodeName, String serverInfo) {
        hashOperations.put(RedisConstant.SERVER_INFO_REDIS_KEY, nodeName, serverInfo);
    }

    /**
     * 获取服务器配置信息
     *
     * @param nodeName
     * @return
     */
    public String getServerInfo(String nodeName) {
        return hashOperations.get(RedisConstant.SERVER_INFO_REDIS_KEY, nodeName);
    }

    /**
     * 获取所有服务器配置信息
     *
     * @return
     */
    public Map<String, String> getAllServerInfo() {
        return hashOperations.entries(RedisConstant.SERVER_INFO_REDIS_KEY);
    }
}