package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.TerminalStatusEnum;
import com.gnss.core.constants.VehicleStatusEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: 终端状态protobuf定义</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/4/15
 */
@Data
@ProtobufClass
public class TerminalStatusProto implements Serializable {

    /**
     * 节点名称
     */
    @Protobuf(fieldType = FieldType.STRING, order = 1, required = true)
    private String nodeName;

    /**
     * 终端信息
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 2)
    private TerminalProto terminalInfo;

    /**
     * 终端状态
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 3, required = true)
    private TerminalStatusEnum terminalStatus = TerminalStatusEnum.ONLINE;

    /**
     * 车辆状态
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 4)
    private VehicleStatusEnum vehicleStatus;

    /**
     * 位置信息
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 5)
    private LocationProto location;

    /**
     * 消息流水号
     */
    @Protobuf(fieldType = FieldType.INT32, order = 6)
    private Integer msgFlowId;

    /**
     * 服务器状态信息
     */
    @Protobuf(fieldType = FieldType.STRING, order = 7)
    private String serverStatus;
}