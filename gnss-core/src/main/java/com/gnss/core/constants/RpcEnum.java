package com.gnss.core.constants;

import lombok.Getter;

/**
 * <p>Description: RPC消息类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
@Getter
public enum RpcEnum {

    APP_CTRL("程序控制"),

    CREATE_FILE_PATH("创建文件路径"),

    DELETE_FTP_FILE("删除FTP文件"),

    DELETE_ATTACHMENT("删除主动安全附件"),

    SUPERIOR_CONFIG("上级平台配置"),

    JT809_STATUS("JT809状态"),

    LINK_MANAGE("链路管理"),

    INFO_STATISTICS("信息统计"),

    VEHICLE_DYNAMIC_INFO("车辆动态信息交互"),

    UP_PLATFORM_MSG_POST_QUERY_ACK("平台查岗应答"),

    UP_PLATFORM_MSG_INFO_ACK("下发平台间报文应答"),

    VEHICLE_ALARM_INFO("车辆报警信息交互"),

    VEHICLE_MONITOR("车辆监管"),

    VEHICLE_STATIC_INFO("车辆静态信息交互");

    private String name;

    RpcEnum(String name) {
        this.name = name;
    }
}
