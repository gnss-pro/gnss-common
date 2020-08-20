package com.gnss.core.constants;

/**
 * <p>Description: 终端状态类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
public enum TerminalStatusEnum {

    /**
     * 终端离线
     */
    OFFLINE,

    /**
     * 终端在线
     */
    ONLINE,

    /**
     * 位置
     */
    LOCATION,

    /**
     * 带位置信息的报警（如GP系列的U01）
     */
    LOCATION_ALARM,

    /**
     * 电子锁位置
     */
    ELECTRONIC_LOCK_LOCATION,

    /**
     * 电子锁状态
     */
    ELECTRONIC_LOCK_STATUS,

    /**
     * 电子锁从机数据
     */
    SLAVE_MACHINE_DATA,

    /**
     * 盲区补报
     */
    HISTORY_LOCATION,

    /**
     * 车门状态
     */
    DOOR_STATUS,

    /**
     * 油电状态
     */
    FUEL_STATUS,

    /**
     * 服务器启动
     */
    SERVER_STARTUP,

    /**
     * 服务器关闭
     */
    SERVER_SHUTDOWN
}