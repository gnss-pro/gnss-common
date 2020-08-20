package com.gnss.core.constants;

import com.fasterxml.jackson.annotation.JsonValue;
import com.gnss.core.model.BaseEnum;
import lombok.Getter;

/**
 * @author HyoJung
 */
public enum EventTypeEnum implements BaseEnum<String> {

    //电子锁从机事件（JT709）
    LockEvent_0("关锁", 0, "0"),
    LockEvent_1("蓝牙开锁", 1, "1"),
    LockEvent_2("NFC开锁", 2, "2"),
    LockEvent_3("Lora开锁", 3, "3"),
    LockEvent_4("锁剪断", 4, "4"),
    LockEvent_5("按键唤醒", 5, "5"),
    LockEvent_6("定时上报", 6, "6"),
    LockEvent_7("充电上报", 7, "7"),

    //GP系列事件
    GPEvent_0("信号监测", 10, "10");

    @Getter
    private final String desc;

    @Getter
    private final int value;

    private final String code;

    EventTypeEnum(String desc, int value, String code) {
        this.desc = desc;
        this.value = value;
        this.code = code;
    }

    @JsonValue
    @Override
    public String getCode() {
        return code;
    }

    public static EventTypeEnum fromValue(Integer value) {
        for (EventTypeEnum eventTypeEnum : values()) {
            if (eventTypeEnum.getValue() == value) {
                return eventTypeEnum;
            }
        }
        return null;
    }

    public static EventTypeEnum fromValue(String code) {
        for (EventTypeEnum eventTypeEnum : values()) {
            if (eventTypeEnum.getCode().equals(code)) {
                return eventTypeEnum;
            }
        }
        return null;
    }
}
