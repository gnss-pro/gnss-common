package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Ignore;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: 附件信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019-03-26
 */
@Data
@ProtobufClass
public class AttachmentInfoProto implements Serializable {

    /**
     * 文件名称
     */
    @Protobuf(fieldType = FieldType.STRING, order = 1)
    private String fileName;

    /**
     * 文件大小
     */
    @Protobuf(fieldType = FieldType.INT32, order = 2)
    private Integer fileSize;

    /**
     * 文件类型
     */
    @Protobuf(fieldType = FieldType.INT32, order = 3)
    private Integer fileType;

    /**
     * 文件路径
     */
    @Protobuf(fieldType = FieldType.STRING, order = 4)
    private String filePath;

    /**
     * 报警编号
     */
    @Protobuf(fieldType = FieldType.STRING, order = 5)
    private String safetyAlarmNum;

    /**
     * 终端信息
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 6)
    private TerminalProto terminalInfo;

    /**
     * 文件名称数组
     */
    @Ignore
    private byte[] fileNameArr;
}
