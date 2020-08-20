package com.gnss.core.rpc;

import com.gnss.core.proto.TerminalProto;
import lombok.Data;

/**
 * <p>Description: FTP上传文件指令</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/8/8
 */
@Data
public class FtpUploadCommand {

    /**
     * 终端信息
     */
    private TerminalProto terminalInfo;

    /**
     * 录像文件ID
     */
    private String recordFileId;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * FTP主目录
     */
    private String ftpHomeDir;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件大小
     */
    private Long fileSize;
}