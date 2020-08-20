package com.gnss.core.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.gnss.core.model.BaseEnum;
import lombok.Getter;

import java.util.Objects;

/**
 * @author Pendy
 * @date 2018/1/5
 * @desc 车牌颜色
 **/
public enum VehiclePlateColorEnum implements BaseEnum<String> {
    /**
     * 蓝色
     */
    BLUE("蓝色", 1, "1"),
    /**
     * 黄色
     */
    YELLOW("黄色", 2, "2"),
    /**
     * 黑色
     */
    BLACK("黑色", 3, "3"),
    /**
     * 白色
     */
    WHITE("白色", 4, "4"),
    /**
     * 绿色
     */
    GREEN("绿色", 5, "5"),
    /**
     * 其他
     */
    OTHER("其他", 9, "9");

    @Getter
    private final String desc;

    @Getter
    private final int value;

    private final String code;

    VehiclePlateColorEnum(String desc, int value, String code) {
        this.desc = desc;
        this.value = value;
        this.code = code;
    }

    @JsonValue
    @Override
    public String getCode() {
        return code;
    }

    @JsonCreator
    public static VehiclePlateColorEnum fromCode(String name) {
        try {
            return VehiclePlateColorEnum.valueOf(name);
        } catch (IllegalArgumentException e) {
            for (VehiclePlateColorEnum vehiclePlateColorEnum : VehiclePlateColorEnum.values()) {
                if (Objects.equals(vehiclePlateColorEnum.code, name)) {
                    return vehiclePlateColorEnum;
                }
            }
        }
        throw new IllegalArgumentException("No element matches " + name);
    }

    public static VehiclePlateColorEnum fromValue(int value) {
        for (VehiclePlateColorEnum vehiclePlateColorEnum : values()) {
            if (vehiclePlateColorEnum.value == value) {
                return vehiclePlateColorEnum;
            }
        }
        return null;
    }

}