package com.gnss.core.model.config;

import com.gnss.core.constants.jt1078.ChannelTypeEnum;
import lombok.Data;

import java.util.Map;

/**
 * <p>Description: 流媒体服务器配置</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author Pendy
 * @version 1.0.1
 * @date 2019/9/15
 */
@Data
public class MediaServerConfig extends BaseServerConfig {

    /**
     * http-flv端口
     */
    private int httpFlvPort;

    /**
     * websocket-flv端口
     */
    private int wsFlvPort;

    /**
     * RTMP端口
     */
    private int rtmpPort;

    /**
     * yml配置文件的服务器列表
     */
    private Map<ChannelTypeEnum, ConfigItem> servers;
}