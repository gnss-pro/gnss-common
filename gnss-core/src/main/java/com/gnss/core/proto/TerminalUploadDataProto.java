package com.gnss.core.proto;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.gnss.core.constants.UploadDataTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: 终端上传数据 protobuf定义</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Data
@ProtobufClass
public class TerminalUploadDataProto implements Serializable {

    /**
     * 终端信息
     */
    @Protobuf(fieldType = FieldType.OBJECT, order = 1, required = true)
    private TerminalProto terminalInfo;

    /**
     * 上传类型
     */
    @Protobuf(fieldType = FieldType.ENUM, order = 2, required = true)
    private UploadDataTypeEnum uploadDataType;

    /**
     * 内容
     */
    @Protobuf(fieldType = FieldType.STRING, order = 3)
    private String content;

    public TerminalUploadDataProto() {
    }

    public TerminalUploadDataProto(TerminalProto terminalInfo, UploadDataTypeEnum uploadDataType, String content) {
        this.terminalInfo = terminalInfo;
        this.uploadDataType = uploadDataType;
        this.content = content;
    }
}
