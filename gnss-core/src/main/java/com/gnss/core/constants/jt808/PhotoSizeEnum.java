package com.gnss.core.constants.jt808;

import com.fasterxml.jackson.annotation.JsonValue;
import com.gnss.core.model.BaseEnum;
import lombok.Getter;

/**
 * <p>Description: JT808拍照图片分辨率</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
public enum PhotoSizeEnum implements BaseEnum<String> {

    /**
     * 最低分辨率
     */
    SIZE_0x00(0x00, "0x00", "0", "最低分辨率"),

    /**
     * 320 x 240
     */
    SIZE_320_240(0x01, "0x01", "1", "320x240"),

    /**
     * 640 x 480
     */
    SIZE_640_480(0x02, "0x02", "2", "640x480"),

    /**
     * 800 x 600
     */
    SIZE_800_600(0x03, "0x03", "3", "800x600"),

    /**
     * 1024 x 768
     */
    SIZE_1024_768(0x04, "0x04", "4", "1024x768"),

    /**
     * 176 x 144[QCIF]
     */
    SIZE_176_144(0x05, "0x05", "5", "176x144[QCIF]"),

    /**
     * 352 x 288[CIF]
     */
    SIZE_352_288(0x06, "0x06", "6", "352x288[CIF]"),

    /**
     * 704 x 288[HALF D1]
     */
    SIZE_704_288(0x07, "0x07", "7", "704x288[HALF D1]"),

    /**
     * 704 x 576[D1]
     */
    SIZE_704_576(0x08, "0x08", "8", "704x576[D1]"),

    /**
     * 最高分辨率
     */
    SIZE_0xFF(0xFF, "0xFF", "255", "最高分辨率"),

    UNKNOWN(-1, "-1", "-1", "未知分辨率");

    private final int value;

    @Getter
    private final String hexValue;

    @Getter
    private final String code;

    @Getter
    private final String desc;

    PhotoSizeEnum(int value, String hexValue, String code, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.code = code;
        this.desc = desc;
    }

    @Override
    @JsonValue
    public int getValue() {
        return value;
    }

    public static PhotoSizeEnum fromValue(int value) {
        for (PhotoSizeEnum photoSize : values()) {
            if (value == photoSize.getValue()) {
                return photoSize;
            }
        }
        return UNKNOWN;
    }
}