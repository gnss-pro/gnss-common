package com.gnss.core.constants.jt1078;

import lombok.Getter;

/**
 * <p>Description: JT1078远程录像回放控制类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum PlaybackControlTypeEnum {

    /**
     * 正常回放
     */
    CTRL_TYPE_0(0x00, "0x00", "正常回放"),

    /**
     * 暂停回放
     */
    CTRL_TYPE_1(0x01, "0x01", "暂停回放"),

    /**
     * 结束回放
     */
    CTRL_TYPE_2(0x02, "0x02", "结束回放"),

    /**
     * 快进回放
     */
    CTRL_TYPE_3(0x03, "0x03", "快进回放"),

    /**
     * 关键帧快退回放
     */
    CTRL_TYPE_4(0x04, "0x04", "关键帧快退回放"),

    /**
     * 拖动回放
     */
    CTRL_TYPE_5(0x05, "0x05", "拖动回放"),

    /**
     * 关键帧播放
     */
    CTRL_TYPE_6(0x06, "0x06", "关键帧播放"),

    UNKNOWN(-1, "-1", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;

    PlaybackControlTypeEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static PlaybackControlTypeEnum fromValue(int result) {
        for (PlaybackControlTypeEnum controlTypeEnum : values()) {
            if (result == controlTypeEnum.getValue()) {
                return controlTypeEnum;
            }
        }
        return UNKNOWN;
    }
}