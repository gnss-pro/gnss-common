package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809报警处理结果</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum AlarmHandleResultEnum {

    /**
     * 处理中
     */
    COMPLETING(0x00, "0x00", "处理中"),

    /**
     * 已处理完毕
     */
    COMPLETED(0x01, "0x01", "已处理完毕"),

    /**
     * 不作处理
     */
    NO_HANDLE(0x02, "0x02", "不作处理"),

    /**
     * 将来处理
     */
    FUTURE_HANDLE(0x03, "0x03", "将来处理"),

    /**
     * 未处理
     */
    UNHANDLE(0xFF, "0xFF", "未处理"),

    UNKNOWN(-1, "-1", "未知结果");

    private final int value;
    private final String hexValue;
    private final String desc;

    AlarmHandleResultEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static AlarmHandleResultEnum fromValue(int result) {
        for (AlarmHandleResultEnum alarmHandleResultEnum : values()) {
            if (result == alarmHandleResultEnum.getValue()) {
                return alarmHandleResultEnum;
            }
        }
        return UNKNOWN;
    }
}