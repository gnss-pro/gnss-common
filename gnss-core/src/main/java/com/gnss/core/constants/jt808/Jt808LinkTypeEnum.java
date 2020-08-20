package com.gnss.core.constants.jt808;

import lombok.Getter;

/**
 * <p>Description: JT808链路类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum Jt808LinkTypeEnum {

    /**
     * 终端->平台
     */
    TERMINAL_UP("终端->平台"),

    /**
     * 平台->终端
     */
    PLATFORM_DOWN("平台->终端"),

    /**
     * protobuf传输枚举时如果值为空设置为NULL
     */
    NULL("");

    /**
     * 消息流向
     */
    private final String msgDirection;

    Jt808LinkTypeEnum(String msgDirection) {
        this.msgDirection = msgDirection;
    }
}