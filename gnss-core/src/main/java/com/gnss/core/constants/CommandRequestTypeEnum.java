package com.gnss.core.constants;

import lombok.Getter;

/**
 * <p>Description: 指令请求方式</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
@Getter
public enum CommandRequestTypeEnum {
    /**
     * 同步方式
     */
    SYNC("同步方式"),

    /**
     * 异步方式
     */
    ASYNC("异步方式");

    private String name;

    CommandRequestTypeEnum(String name) {
        this.name = name;
    }
}
