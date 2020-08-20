package com.gnss.core.constants.jt1078;

import lombok.Getter;

/**
 * <p>Description: JT1078码流类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum StreamTypeEnum {

    /**
     * 所有码流
     */
    ALL(0x00, "0x00", "所有码流"),

    /**
     * 主码流
     */
    MAIN_STREAM(0x01, "0x01", "主码流"),

    /**
     * 子码流
     */
    SUB_STREAM(0x02, "0x02", "子码流"),

    UNKNOWN(-1, "-1", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;

    StreamTypeEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static StreamTypeEnum fromValue(int result) {
        for (StreamTypeEnum streamTypeEnum : values()) {
            if (result == streamTypeEnum.getValue()) {
                return streamTypeEnum;
            }
        }
        return UNKNOWN;
    }
}