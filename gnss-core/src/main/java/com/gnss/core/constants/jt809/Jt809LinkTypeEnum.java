package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809链路类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum Jt809LinkTypeEnum {

    MAIN_LINK("主链路", null),

    SUB_LINK("从链路", null),

    MAIN_LINK_UP("主链路", "下级平台->上级平台"),

    MAIN_LINK_DOWN("主链路", "上级平台->下级平台"),

    SUB_LINK_UP("从链路", "下级平台->上级平台"),

    SUB_LINK_DOWN("从链路", "上级平台->下级平台");

    /**
     * 链路类型
     */
    private String linkType;

    /**
     * 消息流向
     */
    private String msgDirection;

    Jt809LinkTypeEnum(String linkType, String msgDirection) {
        this.linkType = linkType;
        this.msgDirection = msgDirection;
    }
}
