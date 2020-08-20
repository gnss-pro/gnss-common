package com.gnss.core.constants.jt808;

import lombok.Getter;

/**
 * <p>Description: JT808注册结果枚举</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/9/15
 */
@Getter
public enum Jt808RegisterResultEnum {
    /**
     * 成功
     */
    SUCCESS(0, "成功"),

    /**
     * 车辆已被注册
     */
    VEHICLE_REGISTERED(1, "车辆已被注册"),

    /**
     * 数据库中无该车辆
     */
    VEHICLE_NOT_IN_DB(2, "数据库中无该车辆"),

    /**
     * 终端已被注册
     */
    TERMINAL_REGISTERED(3, "终端已被注册"),

    /**
     * 数据库中无该终端
     */
    TERMINAL_NOT_IN_DB(4, "数据库中无该终端"),

    UNKNOWN(-1, "未知结果");

    private final int value;
    private final String desc;

    Jt808RegisterResultEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

}
