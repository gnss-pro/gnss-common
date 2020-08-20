package com.gnss.core.constants;

import lombok.Getter;

/**
 * <p>Description: 通信协议</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/6/19
 */
@Getter
public enum ProtocolEnum {
    /**
     * 部标JT808-2011
     */
    JT808_2011(808, "JT808-2011"),

    /**
     * 北斗部标JT808
     */
    JT808_2013(808, "JT808-2013"),

    /**
     * 国标JT808-2019
     */
    JT808_2019(808, "JT808-2019"),

    /**
     * 车租车JT905
     */
    JT905(905, "JT905"),

    /**
     * JT809-2011
     */
    JT809_2011(809, "JT809-2011"),

    /**
     * JT809-2019
     */
    JT809_2019(809, "JT809-2019"),

    /**
     * 苏标JT809
     */
    JT809_SUBIAO(809, "JT809-SuBiao"),

    /**
     * 物联电子锁JT701
     */
    JT701(701, "JT701"),

    /**
     * 物联GP6000
     */
    GP6000(600, "GP6000"),

    /**
     * 物联GP6000F
     */
    GP6000F(601, "GP6000F");

    private final int code;

    private final String desc;

    ProtocolEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
