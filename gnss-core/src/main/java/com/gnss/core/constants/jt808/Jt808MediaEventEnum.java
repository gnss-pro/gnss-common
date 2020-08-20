package com.gnss.core.constants.jt808;

import lombok.Getter;

/**
 * <p>Description: JT808多媒体事件项编码枚举</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Getter
public enum Jt808MediaEventEnum {
    /**
     * 平台下发指令
     */
    PLATFORM_DOWN_CMD(0, "平台下发指令"),

    /**
     * 定时动作
     */
    TIMER_ACTION(1, "定时动作"),

    /**
     * 抢劫报警触发
     */
    ROBBERY_ALARM(2, "抢劫报警触发"),

    /**
     * 碰撞侧翻报警触发
     */
    COLLISION_ROLLOVER_ALARM(3, "碰撞侧翻报警触发"),

    /**
     * 门开拍照
     */
    OPEN_DOOR(4, "门开拍照"),

    /**
     * 门关拍照
     */
    CLOSE_DOOR(5, "门关拍照"),

    /**
     * 车门由开变关,车速从小于20km到超过20km
     */
    CHANGE(6, "车门由开变关,车速从小于20km到超过20km"),

    /**
     * 定距拍照
     */
    FIXED_DISTANCE(7, "定距拍照"),

    UNKNOWN(-1, "未知事件");

    private final int value;
    private final String desc;

    Jt808MediaEventEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static Jt808MediaEventEnum fromValue(int result) {
        for (Jt808MediaEventEnum mediaEventEnum : values()) {
            if (result == mediaEventEnum.getValue()) {
                return mediaEventEnum;
            }
        }
        return UNKNOWN;
    }

}