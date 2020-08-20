package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.MessageSendResultEnum;
import com.gnss.core.constants.ProtocolEnum;
import com.gnss.core.constants.jt809.Jt809LinkTypeEnum;
import com.gnss.core.constants.jt809.Jt809MessageIdEnum;
import com.gnss.core.constants.jt809.Jt809SubBusinessTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: JT809日志 protobuf定义</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Data
@ProtobufClass
public class Jt809LogProto implements Serializable {

    /**
     * JT809配置ID
     */
    @Protobuf(fieldType = FieldType.INT64, order = 1)
    private Long jt809ConfigId;

    /**
     * 协议类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 2, required = true)
    private ProtocolEnum protocolType;

    /**
     * 时间
     */
    @Protobuf(fieldType = FieldType.INT64, order = 3, required = true)
    private Long time;

    /**
     * 链路类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 4, required = true)
    private Jt809LinkTypeEnum linkType;

    /**
     * 消息ID
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 5)
    private Jt809MessageIdEnum msgIdEnum = Jt809MessageIdEnum.NULL;

    /**
     * 消息流水号
     */
    @Protobuf(fieldType = FieldType.INT64, order = 6)
    private Long msgSeqNum;

    /**
     * 消息体描述
     */
    @Protobuf(fieldType = FieldType.STRING, order = 7)
    private String msgBodyDesc;

    /**
     * 子业务类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 8)
    private Jt809SubBusinessTypeEnum subBusinessTypeEnum = Jt809SubBusinessTypeEnum.NULL;

    /**
     * 车牌号
     */
    @Protobuf(fieldType = FieldType.STRING, order = 9)
    private String vehicleNum;

    /**
     * 消息发送结果
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 10)
    private MessageSendResultEnum sendResult = MessageSendResultEnum.NULL;

    /**
     * 错误消息
     */
    @Protobuf(fieldType = FieldType.STRING, order = 11)
    private String errorMsg;
}