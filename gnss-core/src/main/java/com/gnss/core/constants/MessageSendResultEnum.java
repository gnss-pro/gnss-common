package com.gnss.core.constants;

import lombok.Getter;

/**
 * <p>Description: 消息发送结果</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/9/15
 */
@Getter
public enum MessageSendResultEnum {

    /**
     * 成功/确认
     */
    SUCCESS(0, "成功/确认"),

    /**
     * 失败
     */
    FAILED(1, "失败"),

    /**
     * 异常
     */
    EXCEPTION(3, "异常"),

    /**
     * 不存在
     */
    JT809_STATUS_NOT_EXISTS(4, "JT809状态不存在"),

    /**
     * 链路未连接
     */
    LINK_DISCONNECT(5, "链路未连接"),

    /**
     * 主链路未连接
     */
    MAINLINK_DISCONNECT(6, "主链路未连接"),

    /**
     * 从链路未连接
     */
    SUBLINK_DISCONNECT(7, "从链路未连接"),

    /**
     * 消息未路由到队列中
     */
    NO_ROUTE(8, "目标程序未启动"),

    /**
     * 响应超时
     */
    TIMEOUT(9, "响应超时"),

    /**
     * 不支持
     */
    NOT_SUPPORT(10, "不支持"),

    NULL(-1, "null");

    private final int value;
    private final String desc;

    MessageSendResultEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static MessageSendResultEnum fromValue(int result) {
        for (MessageSendResultEnum sendResultEnum : values()) {
            if (result == sendResultEnum.getValue()) {
                return sendResultEnum;
            }
        }
        return NULL;
    }
}