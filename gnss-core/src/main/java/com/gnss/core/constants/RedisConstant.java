package com.gnss.core.constants;

/**
 * <p>Description: Redis常量</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/8/14
 */
public class RedisConstant {
    
    public RedisConstant() {
    }

    /**
     * Redis在线终端缓存Key
     */
    public static final String TERMINAL_ONLINE_REDIS_KEY = "terminal_online";

    /**
     * Redis终端信息缓存Key
     */
    public static final String TERMINAL_INFO_REDIS_KEY = "terminal_info";

    /**
     * Redis手机号缓存Key
     */
    public static final String SIMCARD_REDIS_KEY = "simcard";

    /**
     * Redis终端号码缓存Key
     */
    public static final String TERMINAL_NUM_REDIS_KEY = "terminal_num";

    /**
     * Redis车牌号码缓存Key
     */
    public static final String VEHICLE_NUM_REDIS_KEY = "vehicle_num";

    /**
     * Redis终端位置缓存Key
     */
    public static final String LOCATION_REDIS_KEY = "location";

    /**
     * Redis终端状态缓存Key
     */
    public static final String TERMINAL_STATUS_REDIS_KEY = "terminal_status";

    /**
     * Redis JT809配置缓存Key
     */
    public static final String JT809_CONFIG_REDIS_KEY = "jt809_config";

    /**
     * Redis JT809平台与终端关联关系缓存Key
     */
    public static final String JT809_TERMINAL_REL_REDIS_KEY = "jt809_terminal_rel";

    /**
     * Redis 流媒体服务器配置缓存Key
     */
    public static final String MEDIA_SERVER_CONFIG_REDIS_KEY = "media_server_config";

    /**
     * Redis 文件服务器配置缓存Key
     */
    public static final String FILE_SERVER_CONFIG_REDIS_KEY = "file_server_config";

    /**
     * Redis服务器信息缓存Key
     */
    public static final String SERVER_INFO_REDIS_KEY = "server_info";
}