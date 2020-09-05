package com.gnss.core.model.jt1078;

import com.gnss.core.constants.MediaDataTypeEnum;
import com.gnss.core.constants.jt1078.RecordActionEnum;
import com.gnss.core.constants.jt1078.StreamTypeEnum;
import com.gnss.core.proto.TerminalProto;
import lombok.Data;

import java.util.List;

/**
 * <p>Description: 流媒体录像信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/3/31
 */
@Data
public class MediaRecordInfo {

    /**
     * 操作类型
     */
    private RecordActionEnum recordAction;

    /**
     * 服务端录像文件ID
     */
    private String recordFileId;

    /**
     * 终端信息
     */
    private TerminalProto terminalInfo;

    /**
     * 数据类型
     */
    private MediaDataTypeEnum dataType;

    /**
     * 码流类型(0:主码流,1:子码流)
     */
    private StreamTypeEnum streamType;

    /**
     * 流地址
     */
    private String streamUrl;

    /**
     * 通道ID
     */
    private int channelId;

    /**
     * 录像时长
     */
    private Integer recordDuration;

    /**
     * 文件存储路径
     */
    private String filePath;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 异常信息
     */
    private String exceptionMsg;

    /**
     * 删除的录像文件路径列表
     */
    private List<String> filePathList;
}