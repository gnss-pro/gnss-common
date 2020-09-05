package com.gnss.core.model.config;

import lombok.Data;

import java.util.Map;

/**
 * <p>Description: 文件服务器配置</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/8/15
 */
@Data
public class FileServerConfig extends BaseServerConfig {

    /**
     * 已支持的指令列表
     */
    private Map<String, String> supportedMessage;

    /**
     * HTTP端口,处理文件的播放、下载
     */
    private int httpPort;

    /**
     * HTTP主路径
     */
    private String httpContextPath;

    /**
     * 主动安全报警附件上传端口
     */
    private int attachmentPort;

    /**
     * 主动安全报警附件存储目录
     */
    private String attachmentPath;

    /**
     * FTP端口
     */
    private int ftpPort;

    /**
     * FTP被动模式端口范围
     */
    private String ftpPassivePorts;

    /**
     * FTP用户名
     */
    private String ftpUsername;

    /**
     * FTP密码
     */
    private String ftpPassword;

    /**
     * FTP文件存储目录
     */
    private String ftpPath;
}