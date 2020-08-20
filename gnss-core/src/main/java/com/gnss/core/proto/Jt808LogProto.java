package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.ProtocolEnum;
import com.gnss.core.constants.jt808.Jt808LinkTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: JT808日志 protobuf定义</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/9/15
 */
@Data
@ProtobufClass
public class Jt808LogProto implements Serializable {

    /**
     * 时间
     */
    @Protobuf(fieldType = FieldType.INT64, order = 1, required = true)
    private Long time;

    /**
     * 协议类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 2, required = true)
    private ProtocolEnum protocolType;

    /**
     * 16进制消息ID
     */
    @Protobuf(fieldType = FieldType.STRING, order = 3)
    private String msgIdHex;

    /**
     * 消息ID描述
     */
    @Protobuf(fieldType = FieldType.STRING, order = 4)
    private String msgIdDesc;

    /**
     * 终端手机号
     */
    @Protobuf(fieldType = FieldType.STRING, order = 5, required = true)
    private String phoneNumber;

    /**
     * 消息流水号
     */
    @Protobuf(fieldType = FieldType.INT32, order = 6)
    private Integer msgFlowId;

    /**
     * 加密方式，0：不加密，1：RSA加密
     */
    @Protobuf(fieldType = FieldType.INT32, order = 7)
    private Integer encryptType;

    /**
     * 消息体描述
     */
    @Protobuf(fieldType = FieldType.STRING, order = 8)
    private String msgBodyDesc;

    /**
     * 错误消息
     */
    @Protobuf(fieldType = FieldType.STRING, order = 9)
    private String errorMsg;

    /**
     * 终端信息
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 10)
    private TerminalProto terminalInfo;

    /**
     * 链路类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 11)
    private Jt808LinkTypeEnum linkType;
}