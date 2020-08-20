package com.gnss.core.constants.safety;

import lombok.Getter;

/**
 * <p>Description: 外设工作状态</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/3
 */
@Getter
public enum WorkingStatusEnum {

    /**
     * 正常工作
     */
    STATUS_1(0x01, "0x01", "正常工作"),

    /**
     * 待机状态
     */
    STATUS_2(0x02, "0x02", "待机状态"),

    /**
     * 升级维护
     */
    STATUS_3(0x03, "0x03", "升级维护"),

    /**
     * 设备异常
     */
    STATUS_4(0x04, "0x04", "设备异常"),

    /**
     * 断开连接
     */
    STATUS_10(0x10, "0x10", "断开连接"),

    UNKNOWN(-1, "-1", "未知状态");

    private int value;

    private String hexValue;

    private String desc;

    WorkingStatusEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static WorkingStatusEnum fromValue(int value) {
        for (WorkingStatusEnum workingStatusEnum : values()) {
            if (value == workingStatusEnum.getValue()) {
                return workingStatusEnum;
            }
        }
        return UNKNOWN;
    }
}