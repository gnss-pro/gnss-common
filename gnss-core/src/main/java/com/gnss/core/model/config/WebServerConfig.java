package com.gnss.core.model.config;

import com.gnss.core.model.DownCommandInfo;
import lombok.Data;

import java.util.List;

/**
 * <p>Description: Web服务器配置</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author Pendy
 * @version 1.0.1
 * @date 2019/9/15
 */
@Data
public class WebServerConfig extends BaseServerConfig {

    /**
     * http端口
     */
    private int httpPort;

    /**
     * 已支持的下行指令列表
     */
    private List<DownCommandInfo> supportedDownCommands;
}