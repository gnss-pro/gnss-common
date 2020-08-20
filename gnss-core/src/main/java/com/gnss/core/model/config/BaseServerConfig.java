package com.gnss.core.model.config;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>Description: 服务器基础配置</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/8/14
 */
@Data
public class BaseServerConfig {

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 服务器名称
     */
    private String serverName;

    /**
     * 服务器公网IP
     */
    private String wanIp;

    /**
     * 服务器内网IP
     */
    private String lanIp;

    /**
     * 是否运行中
     */
    private Boolean isRunning;

    /**
     * 启动时间
     */
    private LocalDateTime startupTime;

    /**
     * 关闭时间
     */
    private LocalDateTime shutdownTime;
}