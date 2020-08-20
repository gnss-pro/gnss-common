package com.gnss.core.constants;

import lombok.Getter;

/**
 * <p>Description: 指令发送结果</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
@Getter
public enum CommandSendResultEnum {
    /**
     * 成功
     */
    SUCCESS(0, "成功"),

    /**
     * 失败
     */
    FAILED(1, "失败"),

    /**
     * 终端不在线
     */
    TERMINAL_OFFLINE(2, "终端不在线"),

    /**
     * 指令超时
     */
    TIMEOUT(3, "指令超时"),

    /**
     * 指令不支持
     */
    NOT_SUPPORT(4, "指令不支持"),

    /**
     * 内部服务错误
     */
    INTERNAL_SERVER_ERROR(5, "内部服务错误"),

    /**
     * 终端信息不存在
     */
    TERMINAL_NOT_FOUND(6, "终端信息不存在"),

    /**
     * 时效口令错误
     */
    AUTH_CODE_ERROR(7, "时效口令错误"),

    /**
     * 终端繁忙
     */
    TERMINAL_BUSY(8, "终端繁忙");

    private int code;

    private String desc;

    CommandSendResultEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
