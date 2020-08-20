package com.gnss.core.constants.safety;

import lombok.Getter;

/**
 * <p>Description: 主动安全类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/3
 */
@Getter
public enum ActiveSafetyEnum {

    /**
     * 高级驾驶辅助系统
     */
    ADAS(0x64, 0xF364, "高级驾驶辅助系统"),

    /**
     * 驾驶员状态监测系统
     */
    DSM(0x65, 0xF365, "驾驶员状态监测系统"),

    /**
     * 胎压监测系统
     */
    TPMS(0x66, 0xF366, "胎压监测系统"),

    /**
     * 盲区监测系统
     */
    BSD(0x67, 0xF367, "盲区监测系统"),

    UNKNOWN(-1, -1, "未知类型");

    private int code;

    private int paramId;

    private String desc;

    ActiveSafetyEnum(Integer code, Integer paramId, String desc) {
        this.code = code;
        this.paramId = paramId;
        this.desc = desc;
    }

    public static ActiveSafetyEnum fromValue(int value) {
        for (ActiveSafetyEnum activeSafetyEnum : values()) {
            if (value == activeSafetyEnum.getCode()) {
                return activeSafetyEnum;
            }
        }
        return UNKNOWN;
    }
}