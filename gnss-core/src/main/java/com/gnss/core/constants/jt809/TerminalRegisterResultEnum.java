package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809终端注册信息处理结果</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum TerminalRegisterResultEnum {

    /**
     * 完成注册,加注释
     */
    RESULT_0(0x00, "0x00", "完成注册,加注释"),

    /**
     * 审核通过,完成注册
     */
    RESULT_1(0x01, "0x01", "审核通过,完成注册"),

    /**
     * 信息错误,未完成注册
     */
    RESULT_2(0x02, "0x02", "信息错误,未完成注册"),

    /**
     * 审核未通过,未完成注册
     */
    RESULT_3(0x03, "0x03", "审核未通过,未完成注册"),

    UNKNOWN(-1, "-1", "未知结果");

    private final int value;
    private final String hexValue;
    private final String desc;

    TerminalRegisterResultEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static TerminalRegisterResultEnum fromValue(int result) {
        for (TerminalRegisterResultEnum registerResultEnum : values()) {
            if (result == registerResultEnum.getValue()) {
                return registerResultEnum;
            }
        }
        return UNKNOWN;
    }
}