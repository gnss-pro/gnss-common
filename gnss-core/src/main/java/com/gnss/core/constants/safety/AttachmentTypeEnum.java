package com.gnss.core.constants.safety;

import lombok.Getter;

/**
 * <p>Description: 附件文件类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/6/19
 */
@Getter
public enum AttachmentTypeEnum {
    /**
     * 图片
     */
    IMAGE(0, "0x00", "图片"),

    /**
     * 音频
     */
    AUDIO(1, "0x01", "音频"),

    /**
     * 视频
     */
    VIDEO(2, "0x02", "视频"),

    /**
     * 文本
     */
    TEXT(3, "0x03", "文本"),

    /**
     * 其他
     */
    OTHER(4, "0x04", "其他"),

    UNKNOWN(-1, "-1", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;

    AttachmentTypeEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static AttachmentTypeEnum fromValue(int value) {
        for (AttachmentTypeEnum attachmentTypeEnum : values()) {
            if (value == attachmentTypeEnum.getValue()) {
                return attachmentTypeEnum;
            }
        }
        return UNKNOWN;
    }
}