package com.gnss.core.constants.jt1078;

import lombok.Getter;

/**
 * <p>Description: JT1078远程录像回放方式</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum PlaybackActionEnum {

    /**
     * 正常回放
     */
    ACTION_0(0x00, "0", "正常回放"),

    /**
     * 快进回放
     */
    ACTION_1(0x01, "1", "快进回放"),

    /**
     * 关键帧快退回放
     */
    ACTION_2(0x02, "2", "关键帧快退回放"),

    /**
     * 关键帧播放
     */
    ACTION_3(0x03, "3", "关键帧播放"),

    /**
     * 单帧上传
     */
    ACTION_4(0x04, "4", "单帧上传"),

    UNKNOWN(-1, "-1", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;

    PlaybackActionEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static PlaybackActionEnum fromValue(int result) {
        for (PlaybackActionEnum actionEnum : values()) {
            if (result == actionEnum.getValue()) {
                return actionEnum;
            }
        }
        return UNKNOWN;
    }
}