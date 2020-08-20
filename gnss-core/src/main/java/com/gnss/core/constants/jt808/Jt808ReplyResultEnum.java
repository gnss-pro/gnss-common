package com.gnss.core.constants.jt808;

import lombok.Getter;

/**
 * <p>Description: JT808应答结果枚举</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/9/15
 */
@Getter
public enum Jt808ReplyResultEnum {
    /**
     * 成功/确认
     */
    SUCCESS(0, "成功/确认"),

    /**
     * 失败
     */
    FAILED(1, "失败"),

    /**
     * 消息有误
     */
    MSG_ERROR(2, "消息有误"),

    /**
     * 不支持
     */
    NOT_SUPPORT(3, "不支持"),

    /**
     * 报警处理确认
     */
    ALARM_PROCESSING_CONFIRM(4, "报警处理确认"),

    UNKNOWN(-1, "未知结果");

    private final int value;
    private final String desc;

    Jt808ReplyResultEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static Jt808ReplyResultEnum fromValue(int result) {
        for (Jt808ReplyResultEnum resultEnum : values()) {
            if (result == resultEnum.getValue()) {
                return resultEnum;
            }
        }
        return UNKNOWN;
    }

}