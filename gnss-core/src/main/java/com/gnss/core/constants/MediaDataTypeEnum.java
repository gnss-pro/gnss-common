package com.gnss.core.constants;

import lombok.Getter;

/**
 * <p>Description: 流媒体数据类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/9/15
 */
@Getter
public enum MediaDataTypeEnum {
    /**
     * 音视频
     */
    AV(0, "音视频"),

    /**
     * 视频
     */
    VIDEO(1, "视频"),

    /**
     * 双向对讲
     */
    TALK(2, "双向对讲"),

    /**
     * 监听
     */
    MONITOR(3, "监听"),

    /**
     * 中心广播
     */
    BROADCAST(4, "中心广播"),

    /**
     * 中心广播
     */
    TRANSFER(5, "透传");

    private int value;
    private String desc;

    MediaDataTypeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static MediaDataTypeEnum fromValue(int value) {
        for (MediaDataTypeEnum mediaDataType : values()) {
            if (mediaDataType.getValue() == value) {
                return mediaDataType;
            }
        }
        return AV;
    }
}