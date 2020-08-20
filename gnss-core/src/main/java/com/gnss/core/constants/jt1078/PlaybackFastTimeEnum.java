package com.gnss.core.constants.jt1078;

import lombok.Getter;

/**
 * <p>Description: JT1078远程录像回放快进或快退倍数类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum PlaybackFastTimeEnum {

    /**
     * 无效
     */
    FAST_TIME_0(0x00, "0x00", "无效"),

    /**
     * 1倍
     */
    FAST_TIME_1(0x01, "0x01", "1倍"),

    /**
     * 2倍
     */
    FAST_TIME_2(0x02, "0x02", "2倍"),

    /**
     * 4倍
     */
    FAST_TIME_4(0x03, "0x03", "4倍"),

    /**
     * 8倍
     */
    FAST_TIME_8(0x04, "0x04", "8倍"),

    /**
     * 16倍
     */
    FAST_TIME_16(0x05, "0x05", "16倍"),

    UNKNOWN(-1, "-1", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;

    PlaybackFastTimeEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static PlaybackFastTimeEnum fromValue(int result) {
        for (PlaybackFastTimeEnum fastTimeEnum : values()) {
            if (result == fastTimeEnum.getValue()) {
                return fastTimeEnum;
            }
        }
        return UNKNOWN;
    }
}