package com.gnss.core.proto;

import com.alibaba.fastjson.annotation.JSONType;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>Description: 报警标识号</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019-03-04
 */
@Getter
@Setter
@ToString(exclude = {"sourceData"})
@ProtobufClass
@JsonIgnoreProperties({"sourceData"})
@JSONType(ignores = {"sourceData"})
public class AlarmFlagProto implements Serializable {

    /**
     * 终端ID
     */
    @Protobuf(fieldType = FieldType.STRING, order = 1)
    private String terminalId;

    /**
     * 时间戳
     */
    @Protobuf(fieldType = FieldType.INT64, order = 2)
    private Long timestamp;

    /**
     * 字符串时间
     */
    @Protobuf(fieldType = FieldType.STRING, order = 3)
    private String time;

    /**
     * 序号
     */
    @Protobuf(fieldType = FieldType.INT32, order = 4)
    private Integer seq;

    /**
     * 附件数量
     */
    @Protobuf(fieldType = FieldType.INT32, order = 5)
    private Integer attachmentCount;

    /**
     * 报警标识号原始数据
     */
    @Protobuf(fieldType = FieldType.BYTES, order = 6)
    private byte[] sourceData;
}