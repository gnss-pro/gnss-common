package com.gnss.core.constants.jt808;

/**
 * <p>Description: JT808常量</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
public class Jt808Constant {

    private Jt808Constant() {
    }

    /**
     * 读空闲超时时间(秒)
     */
    public static final int READER_IDLE_TIME = 1800;

    /**
     * 消息头尾标识位
     */
    public static final byte MSG_HEAD_TAIL_FLAG = 0x7E;

    /**
     * 不包含消息体的基本长度
     */
    public static final int MSG_BASE_LENGTH = 15;

    /**
     * JT808-2019不包含消息体的基本长度
     */
    public static final int JT2019_MSG_BASE_LENGTH = 20;

    /**
     * 消息最大长度
     */
    public static final int MSG_MAX_LENGTH = 102400;

    /**
     * RabbitMQ下行指令队列
     */
    public static final String DOWN_COMMAND_QUEUE = "%s-down-command";
}