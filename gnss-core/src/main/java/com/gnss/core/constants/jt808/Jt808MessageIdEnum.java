package com.gnss.core.constants.jt808;

import lombok.Getter;

/**
 * <p>Description: JT808消息ID枚举</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
@Getter
public enum Jt808MessageIdEnum {

    /**
     * 平台通用应答
     */
    MSG_8001(0x8001, "平台通用应答"),

    /**
     * 补传分包请求
     */
    MSG_8003(0x8003, "补传分包请求"),

    /**
     * 查询服务器时间应答
     */
    MSG_8004(0x8004, "查询服务器时间应答"),

    /**
     * 终端注册应答
     */
    MSG_8100(0x8100, "终端注册应答"),

    /**
     * 多媒体数据上传应答
     */
    MSG_8800(0x8800, "多媒体数据上传应答"),

    /**
     * 文件上传完成消息应答
     */
    MSG_9212(0x9212, "文件上传完成消息应答"),

    /**
     * 报警附件上传指令
     */
    MSG_9208(0x9208, "报警附件上传指令");

    private int messageId;
    private String desc;

    Jt808MessageIdEnum(int messageId, String desc) {
        this.messageId = messageId;
        this.desc = desc;
    }
}