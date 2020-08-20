package com.gnss.core.constants.jt1078;

import lombok.Getter;

/**
 * <p>Description: JT1078实时音视频控制指令类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Getter
public enum RealAvControlTypeEnum {

    /**
     * 关闭音视频传输指令
     */
    CLOSE_AV(0x00, "0", "关闭音视频传输指令"),

    /**
     * 切换码流
     */
    CHANGE_STREAM(0x01, "1", "切换码流"),

    /**
     * 暂停该通道所有流的发送
     */
    PAUSE(0x02, "2", "暂停该通道所有流的发送"),

    /**
     * 恢复暂停前流的发送
     */
    RESUME(0x03, "3", "恢复暂停前流的发送"),

    /**
     * 关闭双向对讲
     */
    CLOSE_TALK(0x04, "4", "关闭双向对讲"),

    UNKNOWN(-1, "-1", "未知类型");

    private final int value;
    private final String hexValue;
    private final String desc;

    RealAvControlTypeEnum(int value, String hexValue, String desc) {
        this.value = value;
        this.hexValue = hexValue;
        this.desc = desc;
    }

    public static RealAvControlTypeEnum fromValue(int result) {
        for (RealAvControlTypeEnum realAvControlTypeEnum : values()) {
            if (result == realAvControlTypeEnum.getValue()) {
                return realAvControlTypeEnum;
            }
        }
        return UNKNOWN;
    }
}