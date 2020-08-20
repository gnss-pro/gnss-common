package com.gnss.core.constants.jt808;

import lombok.Getter;

/**
 * <p>Description: JT808多媒体格式编码</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Getter
public enum Jt808MediaFormatEnum {
    /**
     * JPEG
     */
    JPEG(0, "JPEG"),

    /**
     * TIF
     */
    TIF(1, "TIF"),

    /**
     * MP3
     */
    MP3(2, "MP3"),

    /**
     * WAV
     */
    WAV(3, "WAV"),

    /**
     * WMV
     */
    WMV(4, "WMV"),

    /**
     * 其他保留
     */
    OTHER(-1, "其他");

    private final int value;
    private final String desc;

    Jt808MediaFormatEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static Jt808MediaFormatEnum fromValue(int result) {
        for (Jt808MediaFormatEnum mediaFormatEnum : values()) {
            if (result == mediaFormatEnum.getValue()) {
                return mediaFormatEnum;
            }
        }
        return OTHER;
    }
}