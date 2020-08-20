package com.gnss.core.constants;

import com.gnss.core.exception.ApplicationException;
import lombok.Getter;

/**
 * <p>Description: 车辆状态</p>
 *
 * @author Pendy
 * @version 1.0.1
 * @date 2018-03-29
 */
@Getter
public enum VehicleStatusEnum {
    /**
     * 离线
     */
    OFFLINE(0, "离线"),

    /**
     * 行驶
     */
    RUNNING(1, "行驶"),

    /**
     * 停车
     */
    STOP(2, "停车"),

    /**
     * 怠速
     */
    IDLING(3, "怠速"),

    /**
     * 报警
     */
    ALARM(4, "报警"),

    /**
     * 未定位
     */
    NO_POSITION(5, "未定位"),

    /**
     * 在线
     */
    ONLINE(6, "在线");

    private final int value;

    private final String desc;

    VehicleStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static VehicleStatusEnum fromValue(int value) {
        for (VehicleStatusEnum vehicleStatus : values()) {
            if (vehicleStatus.getValue() == value) {
                return vehicleStatus;
            }
        }
        throw new ApplicationException("找不到车辆状态枚举:" + value);
    }
}