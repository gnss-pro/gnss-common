package com.gnss.core.constants;

import com.fasterxml.jackson.annotation.JsonValue;
import com.gnss.core.model.BaseEnum;
import lombok.Getter;

/**
 * <p>Description: 透传消息类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
@Getter
public enum TransparentTypeEnum implements BaseEnum<String> {

    /**
     * GNSS模块详细定位数据
     */
    TYPE_00(0x00, "0", "GNSS模块详细定位数据"),

    /**
     * 道路运输证IC卡信息
     */
    TYPE_0B(0x0B, "11", "道路运输证IC卡信息"),

    /**
     * 串口1透传
     */
    TYPE_41(0x41, "65", "串口1透传"),

    /**
     * 串口2透传
     */
    TYPE_42(0x42, "66", "串口2透传"),

    /**
     * 状态查询
     */
    TYPE_F7(0xF7, "247", "状态查询"),

    /**
     * 信息查询
     */
    TYPE_F8(0xF8, "248", "信息查询");

    private final int value;

    private final String code;

    private final String desc;

    @Override
    @JsonValue
    public int getValue() {
        return value;
    }

    TransparentTypeEnum(int value, String code, String desc) {
        this.value = value;
        this.code = code;
        this.desc = desc;
    }

    public static TransparentTypeEnum fromValue(int value) {
        for (TransparentTypeEnum transparentTypeEnum : values()) {
            if (transparentTypeEnum.getValue() == value) {
                return transparentTypeEnum;
            }
        }
        return null;
    }
}