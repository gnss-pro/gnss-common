package com.gnss.core.constants.jt1078;

import lombok.Getter;

/**
 * <p>Description: JT1078存储器类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum MemoryTypeEnum {

    /**
     * 所有存储器
     */
    ALL(0x00, "0x00", "所有存储器"),

    /**
     * 主存储器
     */
    MAIN_MEMORY(0x01, "0x01", "主存储器"),

    /**
     * 备灾存储器
     */
    BACKUP_MEMORY(0x02, "0x02", "备灾存储器"),

    UNKNOWN(-1, "-1", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;

    MemoryTypeEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static MemoryTypeEnum fromValue(int result) {
        for (MemoryTypeEnum memoryTypeEnum : values()) {
            if (result == memoryTypeEnum.getValue()) {
                return memoryTypeEnum;
            }
        }
        return UNKNOWN;
    }
}