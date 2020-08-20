package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.AlarmTypeEnum;
import com.gnss.core.constants.safety.ActiveSafetyEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Description: 主动安全报警</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019-03-24
 */
@Data
@ProtobufClass
public class ActiveSafetyAlarmProto implements Serializable {

    /**
     * 报警ID
     */
    @Protobuf(fieldType = FieldType.INT64, order = 1)
    private Long alarmId;

    /**
     * 标志状态
     */
    @Protobuf(fieldType = FieldType.INT32, order = 2)
    private Integer flagStatus;

    /**
     * 报警/事件类型
     */
    @Protobuf(fieldType = FieldType.INT32, order = 3)
    private Integer eventType;

    /**
     * 报警级别
     */
    @Protobuf(fieldType = FieldType.INT32, order = 4)
    private Integer alarmLevel;

    /**
     * 车速,单位Km/h,范围0~250
     */
    @Protobuf(fieldType = FieldType.INT32, order = 5)
    private Integer speed;

    /**
     * 高程,海拔高度,单位为米
     */
    @Protobuf(fieldType = FieldType.INT32, order = 6)
    private Integer altitude;

    /**
     * 纬度
     */
    @Protobuf(fieldType = FieldType.DOUBLE, order = 7)
    private Double lat;

    /**
     * 经度
     */
    @Protobuf(fieldType = FieldType.DOUBLE, order = 8)
    private Double lon;

    /**
     * GMT+8时间戳
     */
    @Protobuf(fieldType = FieldType.INT64, order = 9)
    private Long timestamp;

    /**
     * 字符串时间
     */
    @Protobuf(fieldType = FieldType.STRING, order = 10)
    private String time;

    /**
     * 车辆状态
     */
    @Protobuf(fieldType = FieldType.INT32, order = 11)
    private Integer vehicleStatus;

    /**
     * 车辆状态位
     */
    @Protobuf(fieldType = FieldType.INT32, order = 12)
    private List<Integer> vehicleStatusBits;

    /**
     * 附件数量
     */
    @Protobuf(fieldType = FieldType.INT32, order = 13)
    private Integer attachmentCount;

    /**
     * 报警标识号
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 14)
    private AlarmFlagProto alarmFlag;

    /**
     * 扩展数据
     */
    @Protobuf(fieldType = FieldType.STRING, order = 15)
    private String extraData;

    /**
     * 主动安全类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 16, required = true)
    private ActiveSafetyEnum activeSafetyType;

    /**
     * 报警类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 17)
    private AlarmTypeEnum alarmType;
}
