package com.gnss.core.proto;

import com.alibaba.fastjson.annotation.JSONType;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Ignore;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gnss.core.constants.AlarmTypeEnum;
import com.gnss.core.utils.TimeUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: 位置protobuf定义</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/4/13
 */
@Data
@ProtobufClass
@JsonIgnoreProperties({"gnssSourceData", "statusBitsJson", "alarmBitsJson", "jt1078AlarmBitsJson", "safetyAlarmListJson"})
@JSONType(ignores = {"gnssSourceData", "statusBitsJson", "alarmBitsJson", "jt1078AlarmBitsJson", "safetyAlarmListJson"})
public class LocationProto implements Serializable {
    /**
     * 是否定位：0未定位，1定位
     */
    @Protobuf(fieldType = FieldType.INT32, order = 2)
    private Integer gpsValid;

    /**
     * ACC状态：0关，1开
     */
    @Protobuf(fieldType = FieldType.INT32, order = 3)
    private Integer acc = 0;

    /**
     * 纬度
     */
    @Protobuf(fieldType = FieldType.DOUBLE, order = 4)
    private Double lat;

    /**
     * 经度
     */
    @Protobuf(fieldType = FieldType.DOUBLE, order = 5)
    private Double lon;

    /**
     * 高程
     */
    @Protobuf(fieldType = FieldType.INT32, order = 6)
    private Integer altitude;

    /**
     * 速度
     */
    @Protobuf(fieldType = FieldType.DOUBLE, order = 7)
    private Double speed;

    /**
     * 方向
     */
    @Protobuf(fieldType = FieldType.INT32, order = 8)
    private Integer direction;

    /**
     * 时间
     */
    @Protobuf(fieldType = FieldType.INT64, order = 9)
    private Long time;

    /**
     * 里程
     */
    @Protobuf(fieldType = FieldType.DOUBLE, order = 10)
    private Double mileage;

    /**
     * 油量
     */
    @Protobuf(fieldType = FieldType.DOUBLE, order = 11)
    private Double fuel;

    /**
     * 行驶记录仪速度
     */
    @Protobuf(fieldType = FieldType.DOUBLE, order = 12)
    private Double recoderSpeed;

    /**
     * 状态
     */
    @Protobuf(fieldType = FieldType.INT64, order = 13)
    private Long status = 0L;

    /**
     * 报警标志
     */
    @Protobuf(fieldType = FieldType.INT64, order = 14)
    private Long alarmFlag = 0L;

    /**
     * 视频报警
     */
    @Protobuf(fieldType = FieldType.INT64, order = 15)
    private Long jt1078AlarmFlag = 0L;

    /**
     * 接收时间
     */
    @Protobuf(fieldType = FieldType.INT64, order = 16)
    private Long receiveTime;

    /**
     * 附加信息
     */
    @Protobuf(fieldType = FieldType.STRING, order = 17)
    private String extraInfo;

    /**
     * 状态位
     */
    @Protobuf(fieldType = FieldType.INT32, order = 18)
    private List<Integer> statusBits = new ArrayList<>();

    /**
     * 报警列表
     */
    @Protobuf(fieldType = FieldType.INT32, order = 19)
    private List<Integer> alarmBits = new ArrayList<>();

    /**
     * JT1078报警列表
     */
    @Protobuf(fieldType = FieldType.INT32, order = 20)
    private List<Integer> jt1078AlarmBits = new ArrayList<>();

    /**
     * 主动安全报警列表
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 21)
    private List<AlarmTypeEnum> safetyAlarmTypeList = new ArrayList<>();

    /**
     * 主动安全报警信息列表
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 22)
    private List<ActiveSafetyAlarmProto> activeSafetyAlarms = new ArrayList<>();

    /**
     * GNSS原始数据
     */
    @Protobuf(fieldType = FieldType.BYTES, order = 23)
    private byte[] gnssSourceData;

    /**
     * 状态位列表(JSON字符串)
     */
    @Ignore
    private String statusBitsJson;

    /**
     * 报警位列表(JSON字符串)
     */
    @Ignore
    private String alarmBitsJson;

    /**
     * JT1078报警位列表(JSON字符串)
     */
    @Ignore
    private String jt1078AlarmBitsJson;

    /**
     * 主动安全报警列表(JSON字符串)
     */
    @Ignore
    private String safetyAlarmListJson;

    /**
     * 报警类型列表
     */
    @Ignore
    private List<AlarmTypeEnum> alarmTypeList;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("报警标志", String.format("0x%08x", alarmFlag));
        items.put("状态", String.format("0x%08x", status));
        items.put("纬度", lat);
        items.put("经度", lon);
        items.put("高程", altitude);
        items.put("速度", speed);
        items.put("方向", direction);
        items.put("时间", TimeUtil.formatTime(time));
        items.put("附加信息", extraInfo);
        items.put("视频报警", String.format("0x%08x", jt1078AlarmFlag));
        items.put("主动安全报警", activeSafetyAlarms);
        return items.toString();
    }
}