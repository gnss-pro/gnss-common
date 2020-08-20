package com.gnss.core.constants;

import lombok.Getter;

/**
 * <p>Description: 角色类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/6/19
 */
@Getter
public enum RoleTypeEnum {

    /**
     * 超级管理员
     */
    SUPER_ADMIN("超级管理员"),

    /**
     * 普通管理员
     */
    ADMIN("普通管理员"),

    /**
     * 普通用户
     */
    USER("普通用户"),

    /**
     * 游客
     */
    GUEST("游客");

    /**
     * 描述
     */
    private String desc;

    RoleTypeEnum(String desc) {
        this.desc = desc;
    }

}
