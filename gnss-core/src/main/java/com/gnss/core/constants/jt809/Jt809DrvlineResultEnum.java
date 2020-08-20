package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809车辆行驶路线处理结果</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum Jt809DrvlineResultEnum {

    /**
     * 完成记录
     */
    RESULT_0(0x00, "0x00", "完成记录"),

    /**
     * 审核通过,完成记录
     */
    RESULT_1(0x01, "0x01", "审核通过,完成记录"),

    /**
     * 信息错误,未完成记录
     */
    RESULT_2(0x02, "0x02", "信息错误,未完成记录"),

    /**
     * 审核未通过,未完成记录
     */
    RESULT_3(0x03, "0x03", "审核未通过,未完成记录"),

    UNKNOWN(-1, "-1", "未知级别");

    private final int value;
    private final String hexValue;
    private final String desc;

    Jt809DrvlineResultEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static Jt809DrvlineResultEnum fromValue(int result) {
        for (Jt809DrvlineResultEnum resultEnum : values()) {
            if (result == resultEnum.getValue()) {
                return resultEnum;
            }
        }
        return UNKNOWN;
    }
}