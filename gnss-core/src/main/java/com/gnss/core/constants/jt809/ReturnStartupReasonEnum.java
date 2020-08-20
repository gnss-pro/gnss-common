package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809启动车辆定位信息交换原因</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum ReturnStartupReasonEnum {

    /**
     * 车辆进入指定区域
     */
    REASON_0(0x00, "0x00", 0x00, "0x00", "车辆进入指定区域"),

    /**
     * 人工指定交换
     */
    REASON_1(0x01, "0x01", 0x01, "0x01", "人工指定交换"),

    /**
     * 应急状态下车辆定位信息回传
     */
    REASON_2(0x02, "0x02", 0x02, "0x02", "应急状态下车辆定位信息回传"),

    /**
     * 其他
     */
    OTHER(0x03, "0x03", 0xFF, "0xFF", "其他"),

    /**
     * 未知
     */
    UNKNOWN(-1, "-1", -1, "-1", "未知");

    private final int value;
    private final String hexValue;
    private final int value2019;
    private final String hexValue2019;
    private final String desc;

    ReturnStartupReasonEnum(int value, String hexValue, int value2019, String hexValue2019, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.value2019 = value2019;
        this.hexValue2019 = hexValue2019;
        this.desc = desc;
    }

    public static ReturnStartupReasonEnum fromValue(int result) {
        for (ReturnStartupReasonEnum returnStartupReasonEnum : values()) {
            if (result == returnStartupReasonEnum.getValue()) {
                return returnStartupReasonEnum;
            }
        }
        return UNKNOWN;
    }

    public static ReturnStartupReasonEnum fromValue2019(int result2019) {
        for (ReturnStartupReasonEnum returnStartupReasonEnum : values()) {
            if (result2019 == returnStartupReasonEnum.getValue2019()) {
                return returnStartupReasonEnum;
            }
        }
        return UNKNOWN;
    }
}