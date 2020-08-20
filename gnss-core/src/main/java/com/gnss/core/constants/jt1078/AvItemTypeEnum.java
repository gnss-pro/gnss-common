package com.gnss.core.constants.jt1078;

import lombok.Getter;

/**
 * <p>Description: JT1078音视频类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum AvItemTypeEnum {

    /**
     * 音视频
     */
    AV(0x00, "0x00", "音视频", "关闭该通道有关的音视频数据"),

    /**
     * 音频
     */
    AUDIO(0x01, "0x01", "音频", "关闭该通道有关的音频,保留视频"),

    /**
     * 视频
     */
    VIDEO(0x02, "0x02", "视频", "关闭该通道有关的视频,保留音频"),

    /**
     * 视频或音视频
     */
    VIDEO_OR_AV(0x03, "0x03", "视频或音视频", null),

    UNKNOWN(-1, "-1", "未知类型", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;
    private final String closeStreamDesc;

    AvItemTypeEnum(int value, String hexValue, String desc, String closeStreamDesc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
        this.closeStreamDesc = closeStreamDesc;
    }

    public static AvItemTypeEnum fromValue(int result) {
        for (AvItemTypeEnum avItemTypeEnum : values()) {
            if (result == avItemTypeEnum.getValue()) {
                return avItemTypeEnum;
            }
        }
        return UNKNOWN;
    }
}