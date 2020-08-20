package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.jt808.Jt808MediaEventEnum;
import com.gnss.core.constants.jt808.Jt808MediaFormatEnum;
import com.gnss.core.constants.jt808.Jt808MediaTypeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>Description: 多媒体文件protobuf定义</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/4/13
 */
@Getter
@Setter
@ToString(exclude = {"mediaData"})
@ProtobufClass
public class MediaFileProto implements Serializable {

    /**
     * 终端信息
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 1, required = true)
    private TerminalProto terminalInfo;

    /**
     * 多媒体ID
     */
    @Protobuf(fieldType = FieldType.INT64, order = 2)
    private Long mediaId;

    /**
     * 多媒体类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 3)
    private Jt808MediaTypeEnum mediaType;

    /**
     * 多媒体格式编码
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 4)
    private Jt808MediaFormatEnum mediaFormatCode;

    /**
     * 事件项编码
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 5)
    private Jt808MediaEventEnum eventItemCode;

    /**
     * 通道ID
     */
    @Protobuf(fieldType = FieldType.INT32, order = 6)
    private Integer channelId;

    /**
     * 文件大小
     */
    @Protobuf(fieldType = FieldType.INT32, order = 7)
    private Integer fileSize;

    /**
     * 位置信息
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 8)
    private LocationProto location;

    /**
     * 多媒体数据
     */
    @Protobuf(fieldType = FieldType.BYTES, order = 9, required = true)
    private byte[] mediaData;
}