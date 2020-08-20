package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.CommandRequestTypeEnum;
import com.gnss.core.constants.CommandSendResultEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: 指令MQ传输信息, 用于应用程序间上行下行指令传输</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
@Data
@ProtobufClass
public class CommandProto implements Serializable {

    /**
     * 指令操作ID
     */
    @Protobuf(fieldType = FieldType.STRING, order = 1, required = true)
    private String operationId;

    /**
     * 终端信息
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 2, required = true)
    private TerminalProto terminalInfo;

    /**
     * 指令请求方式
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 3, required = true)
    private CommandRequestTypeEnum requestType = CommandRequestTypeEnum.ASYNC;

    /**
     * 下行指令ID
     */
    @Protobuf(fieldType = FieldType.STRING, order = 4, required = true)
    private String downCommandId;

    /**
     * 下行指令描述
     */
    @Protobuf(fieldType = FieldType.STRING, order = 5)
    private String downCommandDesc;

    /**
     * 下行参数描述,例如每个字段和值,方便网关打印日志查找问题
     */
    @Protobuf(fieldType = FieldType.STRING, order = 6)
    private String paramsDesc;

    /**
     * 响应指令ID
     */
    @Protobuf(fieldType = FieldType.STRING, order = 7)
    private String respCommandId;

    /**
     * 发送方节点
     */
    @Protobuf(fieldType = FieldType.STRING, order = 8, required = true)
    private String fromNode;

    /**
     * 接收方节点
     */
    @Protobuf(fieldType = FieldType.STRING, order = 9, required = true)
    private String toNode;

    /**
     * 开始时间
     */
    @Protobuf(fieldType = FieldType.INT64, order = 10, required = true)
    private Long startTime;

    /**
     * 等待应答超时时间
     */
    @Protobuf(fieldType = FieldType.INT32, order = 11)
    private Integer timeout;

    /**
     * 响应时间
     */
    @Protobuf(fieldType = FieldType.INT64, order = 12)
    private Long responseTime;

    /**
     * 下行的消息体是否为完整包,如果为完整包则网关收到后直接发给终端,如果为消息体则网关收到后需要封装为完整包再发送给终端
     */
    @Protobuf(fieldType = FieldType.BOOL, order = 13)
    private boolean isWholePacket = true;

    /**
     * 分包总包数(用于下发分包消息给终端,例如升级文件)
     */
    @Protobuf(fieldType = FieldType.INT32, order = 14)
    private Integer packetTotalCount;

    /**
     * 分包包序号(用于下发分包消息给终端,例如升级文件)
     */
    @Protobuf(fieldType = FieldType.INT32, order = 15)
    private Integer packetOrder;

    /**
     * 消息流水号
     */
    @Protobuf(fieldType = FieldType.INT32, order = 16)
    private Integer msgFlowId;

    /**
     * 透传消息体
     */
    @Protobuf(fieldType = FieldType.BYTES, order = 17)
    private byte[] messageBody;

    /**
     * 指令发送结果
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 18)
    private CommandSendResultEnum sendResult;

    /**
     * 响应参数
     */
    @Protobuf(fieldType = FieldType.STRING, order = 19)
    private String responseParams;
}