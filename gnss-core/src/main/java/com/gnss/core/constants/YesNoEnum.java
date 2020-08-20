package com.gnss.core.constants;

import com.fasterxml.jackson.annotation.JsonValue;
import com.gnss.core.exception.ApplicationException;
import com.gnss.core.model.BaseEnum;
import lombok.Getter;

import java.util.Objects;

/**
 * <p>Description: YES/NO标识</p>
 *
 * @author Pendy
 * @version 1.0.1
 * @date 2018-03-29
 */
public enum YesNoEnum implements BaseEnum<String> {

    /**
     * NO标识
     */
    NO("N", 0, "0"),

    /**
     * YES标识
     */
    YES("Y", 1, "1");

    @Getter
    private final String desc;

    @Getter
    private final int value;

    private final String code;

    YesNoEnum(String desc, int value, String code) {
        this.desc = desc;
        this.value = value;
        this.code = code;
    }

    @JsonValue
    @Override
    public String getCode() {
        return code;
    }

    public static YesNoEnum fromValue(int value) {
        for (YesNoEnum yesNoEnum : values()) {
            if (yesNoEnum.getValue() == value) {
                return yesNoEnum;
            }
        }
        throw new ApplicationException("找不到枚举" + value);
    }

    public static YesNoEnum fromValue(String value) {
        for (YesNoEnum yesNoEnum : values()) {
            if (Objects.equals(value, yesNoEnum.getValue())) {
                return yesNoEnum;
            }
        }
        throw new ApplicationException("找不到枚举" + value);
    }
}