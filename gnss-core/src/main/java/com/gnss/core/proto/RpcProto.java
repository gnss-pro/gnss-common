package com.gnss.core.proto;

import com.alibaba.fastjson.JSON;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.MessageSendResultEnum;
import com.gnss.core.constants.RpcEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: RPC protobuf定义</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
@Data
@ProtobufClass
public class RpcProto implements Serializable {

    /**
     * RPC类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 1, required = true)
    private RpcEnum rpcType;

    /**
     * RPC发送结果
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 2)
    private MessageSendResultEnum rpcResult;

    /**
     * 内容
     */
    @Protobuf(fieldType = FieldType.STRING, order = 3)
    private String content;

    /**
     * 错误消息
     */
    @Protobuf(fieldType = FieldType.STRING, order = 4)
    private String errorMsg;

    public RpcProto() {
    }

    public RpcProto(RpcEnum rpcType, Object obj) {
        this.rpcType = rpcType;
        if (obj != null) {
            this.content = JSON.toJSONString(obj);
        }
    }
}