package com.gnss.core.model;

import java.io.Serializable;

/**
 * <p>Description: 基础枚举</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/9/15
 */
public interface BaseEnum<T> extends Serializable {

    T getCode();

    default int getValue() {
        return -1;
    }
}