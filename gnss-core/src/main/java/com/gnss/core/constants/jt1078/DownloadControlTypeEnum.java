package com.gnss.core.constants.jt1078;

import lombok.Getter;

/**
 * <p>Description: JT1078远程录像下载控制类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum DownloadControlTypeEnum {

    /**
     * 暂停
     */
    CTRL_TYPE_0(0x00, "0x00", "暂停"),

    /**
     * 继续
     */
    CTRL_TYPE_1(0x01, "0x01", "继续"),

    /**
     * 取消
     */
    CTRL_TYPE_2(0x02, "0x02", "取消"),

    UNKNOWN(-1, "-1", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;

    DownloadControlTypeEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static DownloadControlTypeEnum fromValue(int result) {
        for (DownloadControlTypeEnum controlTypeEnum : values()) {
            if (result == controlTypeEnum.getValue()) {
                return controlTypeEnum;
            }
        }
        return UNKNOWN;
    }
}