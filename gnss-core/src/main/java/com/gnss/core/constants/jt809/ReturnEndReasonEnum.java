package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809结束车辆定位信息交换原因</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum ReturnEndReasonEnum {

    /**
     * 车辆离开指定区域
     */
    REASON_0(0x00, "0x00", 0x00, "0x00", "车辆离开指定区域"),

    /**
     * 人工停止交换
     */
    REASON_1(0x01, "0x01", 0x01, "0x01", "人工停止交换"),

    /**
     * 紧急监控完成
     */
    REASON_2(0x02, "0x02", 0x02, "0x02", "紧急监控完成"),

    /**
     * 车辆离线
     */
    REASON_3(0x03, "0x03", 0x03, "0x03", "车辆离线"),

    /**
     * 其他
     */
    OTHER(0x04, "0x04", 0xFF, "0xFF", "其他"),

    /**
     * 未知
     */
    UNKNOWN(-1, "-1", -1, "-1", "未知");

    private final int value;
    private final String hexValue;
    private final int value2019;
    private final String hexValue2019;
    private final String desc;

    ReturnEndReasonEnum(int value, String hexValue, int value2019, String hexValue2019, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.value2019 = value2019;
        this.hexValue2019 = hexValue2019;
        this.desc = desc;
    }

    public static ReturnEndReasonEnum fromValue(int result) {
        for (ReturnEndReasonEnum returnEndReasonEnum : values()) {
            if (result == returnEndReasonEnum.getValue()) {
                return returnEndReasonEnum;
            }
        }
        return UNKNOWN;
    }

    public static ReturnEndReasonEnum fromValue2019(int result2019) {
        for (ReturnEndReasonEnum returnEndReasonEnum : values()) {
            if (result2019 == returnEndReasonEnum.getValue2019()) {
                return returnEndReasonEnum;
            }
        }
        return UNKNOWN;
    }
}