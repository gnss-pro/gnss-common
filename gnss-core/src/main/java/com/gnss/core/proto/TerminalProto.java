package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.ProtocolEnum;
import com.gnss.core.constants.VehiclePlateColorEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: 终端protobuf定义</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/9/15
 */
@Data
@ProtobufClass
public class TerminalProto implements Serializable {

    /**
     * 节点名称
     */
    @Protobuf(fieldType = FieldType.STRING, order = 1)
    private String nodeName;

    /**
     * 协议类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 2)
    private ProtocolEnum protocolType;

    /**
     * 终端ID
     */
    @Protobuf(fieldType = FieldType.INT64, order = 3)
    private Long terminalId;

    /**
     * 终端字符串ID
     */
    @Protobuf(fieldType = FieldType.STRING, order = 4, required = true)
    private String terminalStrId;

    /**
     * 终端手机号
     */
    @Protobuf(fieldType = FieldType.STRING, order = 5)
    private String terminalSimCode;

    /**
     * 终端号码
     */
    @Protobuf(fieldType = FieldType.STRING, order = 6)
    private String terminalNum;

    /**
     * 车牌号码
     */
    @Protobuf(fieldType = FieldType.STRING, order = 7)
    private String vehicleNum;

    /**
     * 车牌颜色
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 8)
    private VehiclePlateColorEnum vehiclePlateColor = VehiclePlateColorEnum.OTHER;

    /**
     * 车辆ID
     */
    @Protobuf(fieldType = FieldType.STRING, order = 9)
    private String vehicleId;

    /**
     * 所属组织ID
     */
    @Protobuf(fieldType = FieldType.STRING, order = 10)
    private String orgId;

    /**
     * 所属组织名称
     */
    @Protobuf(fieldType = FieldType.STRING, order = 11)
    private String orgName;

    /**
     * 终端厂商编码
     */
    @Protobuf(fieldType = FieldType.STRING, order = 12)
    private String producerId;

    /**
     * 终端型号
     */
    @Protobuf(fieldType = FieldType.STRING, order = 13)
    private String terminalModelType;

    /**
     * 终端编号(JT809上传车辆注册信息,2011为7个字节,2019为30个字节,大小字母和数字组成)
     */
    @Protobuf(fieldType = FieldType.STRING, order = 14)
    private String terminalCode;

    /**
     * IMEI码(JT809上传车辆注册信息,2011无此字段,2019为15个字节)
     */
    @Protobuf(fieldType = FieldType.STRING, order = 15)
    private String imei;

    /**
     * 登录账号
     */
    @Protobuf(fieldType = FieldType.STRING, order = 16)
    private String loginName;

    /**
     * 登录密码
     */
    @Protobuf(fieldType = FieldType.STRING, order = 17)
    private String password;
}