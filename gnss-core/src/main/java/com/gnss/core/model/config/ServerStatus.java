package com.gnss.core.model.config;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * <p>Description: 服务器状态信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/8/18
 */
@Data
public class ServerStatus<T extends BaseServerConfig> {

    public ServerStatus() {
    }

    public ServerStatus(String nodeName, T serverConfig) {
        this.nodeName = nodeName;
        this.clazz = serverConfig.getClass();
        this.serverConfigJson = JSON.toJSONString(serverConfig);
    }

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 服务器配置信息
     */
    private String serverConfigJson;

    /**
     * 类名
     */
    private Class<?> clazz;
}