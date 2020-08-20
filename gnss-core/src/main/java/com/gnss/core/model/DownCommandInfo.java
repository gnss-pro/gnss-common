package com.gnss.core.model;

import lombok.Data;

/**
 * @author Pendy
 * @date 2018/9/25
 * @desc
 **/
@Data
public class DownCommandInfo {

    /**
     * 下行指令ID
     */
    private String downCommandId;

    /**
     * 响应指令ID
     */
    private String respCommandId;

    /**
     * 指令描述
     */
    private String desc;

    /**
     * 指令参数对应的Class
     */
    private Class<?> commandParamClass;

    /**
     * 指令是否可以重复
     */
    private boolean repeat;
}
