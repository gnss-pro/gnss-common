package com.gnss.core.constants.jt1078;

import lombok.Getter;

import java.util.Objects;

/**
 * <p>Description: 通道类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author menghuan
 * @version 1.0.1
 * @date 2018-01-08
 */
@Getter
public enum ChannelTypeEnum {

    /**
     * 主码流音视频
     */
    MAIN_VIDEO_AUDIO("main", 10, "主码流音视频"),

    /**
     * 音视频
     */
    VIDEO_AUDIO("live", 0, "音视频"),

    /**
     * 视频
     */
    VIDEO("video", 1, "视频"),

    /**
     * 双向对讲
     */
    TALK("talk", 2, "双向对讲"),

    /**
     * 监听
     */
    LISTEN("monitor", 3, "监听"),

    /**
     * 中心广播
     */
    CENTER_BROADCAST("broadcast", 4, "中心广播"),

    /**
     * 透传
     */
    TRANSFER("trans", 5, "透传"),

    /**
     * 录像回放
     */
    PLAYBACK("record", 6, "录像回放");

    private final String appName;
    private final int value;
    private final String desc;

    ChannelTypeEnum(String appName, int value, String desc) {
        this.appName = appName;
        this.value = value;
        this.desc = desc;
    }

    /**
     * 根据appName获取枚举类型
     *
     * @param appName
     * @return
     */
    public static ChannelTypeEnum fromAppName(String appName) {
        for (ChannelTypeEnum channelTypeEnum : values()) {
            if (Objects.equals(channelTypeEnum.getAppName(), appName)) {
                return channelTypeEnum;
            }
        }
        return null;
    }
}