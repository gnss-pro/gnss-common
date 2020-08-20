package com.gnss.core.constants;

import lombok.Getter;

/**
 * <p>Description: 区域类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/6/19
 */
@Getter
public enum RegionTypeEnum {
    /**
     * 圆形
     */
    CIRCLE(1, "圆形"),

    /**
     * 矩形
     */
    RECTANGLE(2, "矩形"),

    /**
     * 多边形
     */
    POLYGON(3, "多边形"),

    /**
     * 线路
     */
    LINE(4, "线路");

    private final int code;

    private final String desc;

    RegionTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
