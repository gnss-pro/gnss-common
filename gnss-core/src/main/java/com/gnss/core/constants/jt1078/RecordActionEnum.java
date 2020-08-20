package com.gnss.core.constants.jt1078;

/**
 * <p>Description: 录像操作类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/3/31
 */
public enum RecordActionEnum {

    /**
     * 开始录像
     */
    START,

    /**
     * 停止录像
     */
    STOP,

    /**
     * 完成录像
     */
    COMPLETED,

    /**
     * 异常
     */
    EXCEPTION,

    /**
     * 删除录像文件
     */
    DELETE_FILE
}