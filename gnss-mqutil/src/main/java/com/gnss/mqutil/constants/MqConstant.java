package com.gnss.mqutil.constants;

/**
 * <p>Description: MQ常量</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/14
 */
public class MqConstant {

    private MqConstant() {
    }

    /**
     * 实时状态
     */
    public static final String TERMINAL_STATUS_EXCHANGE = "terminal.status.exchange";
    public static final String TERMINAL_STATUS_ROUTING_KEY = "*.*.terminal.status";

    /**
     * 多媒体文件
     */
    public static final String MEDIA_FILE_EXCHANGE = "media.file.exchange";
    public static final String MEDIA_FILE_ROUTING_KEY = "*.*.media.file";

    /**
     * 上行指令
     */
    public static final String UP_COMMAND_EXCHANGE = "up.command.exchange";

    /**
     * 下行指令
     */
    public static final String DOWN_COMMAND_EXCHANGE = "down.command.exchange";
    public static final String DOWN_COMMAND_ROUTING_KEY = "#.down.command";

    /**
     * RPC调用
     */
    public static final String RPC_EXCHANGE = "rpc.exchange";
    public static final String WEB_RPC_ROUTING_KEY = "web.rpc";
    public static final String JT808_RPC_ROUTING_KEY = "jt808.rpc";
    public static final String JT809_RPC_ROUTING_KEY = "jt809.rpc";
    public static final String FILE_SERVER_RPC_ROUTING_KEY = "file-server.rpc";

    /**
     * 上传数据供Web订阅
     */
    public static final String WEB_UPLOAD_DATA_EXCHANGE = "web.upload.data.exchange";
    public static final String WEB_UPLOAD_DATA_ROUTING_KEY = "#.web.upload.data";

    /**
     * 上传数据供JT809订阅
     */
    public static final String JT809_UPLOAD_DATA_EXCHANGE = "jt809.upload.data.exchange";
    public static final String JT809_UPLOAD_DATA_ROUTING_KEY = "#.jt809.upload.data";

    /**
     * 主动安全报警附件
     */
    public static final String ATTACHMENT_EXCHANGE = "attachment.exchange";
    public static final String ATTACHMENT_ROUTING_KEY = "#.attachment";

    /**
     * JT808日志
     */
    public static final String JT808_LOG_EXCHANGE = "jt808.log.exchange";
    public static final String JT808_LOG_ROUTING_KEY = "#.jt808.log";

    /**
     * JT809日志
     */
    public static final String JT809_LOG_EXCHANGE = "jt809.log.exchange";
    public static final String JT809_LOG_ROUTING_KEY = "#.jt809.log";
}