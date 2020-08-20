package com.gnss.core.model.config;

import lombok.Data;

/**
 * <p>Description: 配置项</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/5/16
 */
@Data
public class ConfigItem {

    /**
     * TCP端口
     */
    private int tcpPort;

    /**
     * UDP端口
     */
    private int udpPort;

    /**
     * 是否开启服务
     */
    private boolean isEnable = true;
}