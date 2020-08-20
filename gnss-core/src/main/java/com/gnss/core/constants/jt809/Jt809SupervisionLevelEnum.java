package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809督办级别</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum Jt809SupervisionLevelEnum {

    /**
     * 紧急
     */
    LEVEL_0(0x00, "0x00", "紧急"),

    /**
     * 一般
     */
    LEVEL_1(0x01, "0x01", "一般"),

    UNKNOWN(-1, "-1", "未知级别");

    private final int value;
    private final String hexValue;
    private final String desc;

    Jt809SupervisionLevelEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static Jt809SupervisionLevelEnum fromValue(int result) {
        for (Jt809SupervisionLevelEnum supervisionLevelEnum : values()) {
            if (result == supervisionLevelEnum.getValue()) {
                return supervisionLevelEnum;
            }
        }
        return UNKNOWN;
    }
}