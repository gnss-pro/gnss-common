package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809报警信息来源</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum Jt809AlarmSourceEnum {

    /**
     * 车载终端
     */
    TERMINAL(0x01, "0x01", "车载终端"),

    /**
     * 企业监控平台
     */
    COMPANY_PLATFORM(0x02, "0x02", "企业监控平台"),

    /**
     * 政府监管平台
     */
    GOV_PLATFORM(0x03, "0x03", "政府监管平台"),

    /**
     * 其他
     */
    OTHER(0x09, "0x09", "其他"),

    UNKNOWN(-1, "-1", "未知来源");

    private final int value;
    private final String hexValue;
    private final String desc;

    Jt809AlarmSourceEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static Jt809AlarmSourceEnum fromValue(int result) {
        for (Jt809AlarmSourceEnum alarmSourceEnum : values()) {
            if (result == alarmSourceEnum.getValue()) {
                return alarmSourceEnum;
            }
        }
        return UNKNOWN;
    }
}