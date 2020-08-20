package com.gnss.core.model.config;

import com.gnss.core.constants.ProtocolEnum;
import lombok.Data;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>Description: JT808服务器配置</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/11/5
 */
@Data
public class Jt808ServerConfig extends BaseServerConfig {

    /**
     * 是否严格模式,严格模式采用过检的要求校验终端注册信息
     */
    private Boolean strictMode = false;

    /**
     * 是否上传JT808日志
     */
    private Boolean uploadLog = false;

    /**
     * 日志不打印的消息ID列表
     */
    private Set<Integer> filterMsgIdList = new HashSet<>();

    /**
     * 已支持的指令列表
     */
    private Map<String, String> supportedMessage;

    /**
     * yml配置文件的服务器列表
     */
    private Map<ProtocolEnum, ConfigItem> servers;
}