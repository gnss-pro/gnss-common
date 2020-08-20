package com.gnss.core.model.jt808;

import com.gnss.core.constants.ProtocolEnum;
import com.gnss.core.constants.jt808.Jt808LinkTypeEnum;
import com.gnss.core.model.BaseMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>Description: JT808消息模型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/9/15
 */
@Getter
@Setter
@ToString(exclude = {"phoneNumberArr"})
public class Jt808Message extends BaseMessage {

    /**
     * 链路类型
     */
    private Jt808LinkTypeEnum linkType;

    /**
     * 消息ID
     */
    private int msgId;

    /**
     * 消息ID描述
     */
    private String msgIdDesc;

    /**
     * 终端手机号
     */
    private String phoneNumber;

    /**
     * 终端手机号数组
     */
    private byte[] phoneNumberArr;

    /**
     * 协议版本号
     */
    private int protocolVersion;

    /**
     * 消息流水号
     */
    private int msgFlowId;

    /**
     * 是否分包
     */
    private boolean multiPacket;

    /**
     * 版本标识
     */
    private int versionFlag;

    /**
     * 加密方式，0：不加密，1：RSA加密
     */
    private int encryptType;

    /**
     * 消息总包数
     */
    private int packetTotalCount;

    /**
     * 包序号
     */
    private int packetOrder;

    /**
     * 协议类型
     */
    private ProtocolEnum protocolType;

}