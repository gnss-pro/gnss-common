package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809主链路/从链路断开通知错误代码</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum Jt809DisconnectInformEnum {

    /**
     * 主链路断开
     */
    MAIN_LINK_DISCONNECT(0x00, "0x00", "主链路断开", Jt809LinkTypeEnum.SUB_LINK),

    /**
     * 其他原因
     */
    MAIN_LINK_DISCONNECT_OTHER(0x01, "0x01", "其他原因", Jt809LinkTypeEnum.SUB_LINK),

    /**
     * 无法连接下级平台指定的服务IP与端口
     */
    CONNECT_INFERIOR_IP_ERROR(0x00, "0x00", "无法连接下级平台指定的服务IP与端口", Jt809LinkTypeEnum.MAIN_LINK),

    /**
     * 上级平台客户端与下级平台服务端断开
     */
    SUB_LINK_DISCONNECT(0x01, "0x01", "上级平台客户端与下级平台服务端断开", Jt809LinkTypeEnum.MAIN_LINK),

    /**
     * 其他原因
     */
    SUB_LINK_DISCONNECT_OTHER(0x02, "0x02", "其他原因", Jt809LinkTypeEnum.MAIN_LINK),

    /**
     * 其他
     */
    SUB_LINK_DISCONNECT_OTHER_2019(0xFF, "0xFF", "其他", Jt809LinkTypeEnum.MAIN_LINK),

    UNKNOWN(-1, "-1", "未知错误", null);

    private final int value;
    private final String hexValue;
    private final String desc;
    private final Jt809LinkTypeEnum linkType;

    Jt809DisconnectInformEnum(int value, String hexValue, String desc, Jt809LinkTypeEnum linkType) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
        this.linkType = linkType;
    }

    public static Jt809DisconnectInformEnum fromValue(int result, Jt809LinkTypeEnum linkType) {
        for (Jt809DisconnectInformEnum disconnectInformEnum : values()) {
            if (result == disconnectInformEnum.getValue() && linkType == disconnectInformEnum.getLinkType()) {
                return disconnectInformEnum;
            }
        }
        return UNKNOWN;
    }
}