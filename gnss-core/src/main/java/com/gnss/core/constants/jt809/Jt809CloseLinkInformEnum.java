package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809下级/上级平台主动关闭主从链路通知关闭原因</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum Jt809CloseLinkInformEnum {

    /**
     * 网关重启
     */
    GATEWAY_RESTART(0x00, "0x00", "网关重启", "从链路断开"),

    /**
     * 其他原因
     */
    OTHER(0x01, "0x01", "其他原因", "其他原因"),

    /**
     * 其他
     */
    OTHER_2019(0xFF, "0xFF", "其他", "其他"),

    UNKNOWN(-1, "-1", "未知原因", "未知原因");

    private final int value;
    private final String hexValue;
    private final String desc;
    private final String desc2019;

    Jt809CloseLinkInformEnum(int value, String hexValue, String desc, String desc2019) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
        this.desc2019 = desc2019;
    }

    public static Jt809CloseLinkInformEnum fromValue(int result) {
        for (Jt809CloseLinkInformEnum closeLinkInformEnum : values()) {
            if (result == closeLinkInformEnum.getValue()) {
                return closeLinkInformEnum;
            }
        }
        return UNKNOWN;
    }
}