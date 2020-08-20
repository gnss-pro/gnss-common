package com.gnss.core.constants.jt808;

import lombok.Getter;

/**
 * <p>Description: JT808多媒体类型枚举</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Getter
public enum Jt808MediaTypeEnum {
    /**
     * 图像
     */
    IMAGE(0, "图像"),

    /**
     * 音频
     */
    AUDIO(1, "音频"),

    /**
     * 视频
     */
    VIDEO(2, "视频"),

    UNKNOWN(-1, "未知类型");

    private final int value;
    private final String desc;

    Jt808MediaTypeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static Jt808MediaTypeEnum fromValue(int result) {
        for (Jt808MediaTypeEnum mediaTypeEnum : values()) {
            if (result == mediaTypeEnum.getValue()) {
                return mediaTypeEnum;
            }
        }
        return UNKNOWN;
    }

}