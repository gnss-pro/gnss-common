package com.gnss.core.annotations;

import com.gnss.core.constants.CommonConstant;
import com.gnss.core.constants.ProtocolEnum;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Description: 下行指令注解</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018-10-20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DownCommand {

    /**
     * 协议类型
     *
     * @return
     */
    ProtocolEnum protocol() default ProtocolEnum.JT808_2011;

    /**
     * 指令类型
     *
     * @return
     */
    int messageId() default CommonConstant.DEFAULT_MESSAGE_ID;

    /**
     * 字符串指令类型
     *
     * @return
     */
    String strMessageId() default "";

    /**
     * 响应指令类型
     *
     * @return
     */
    int respMessageId() default CommonConstant.DEFAULT_MESSAGE_ID;

    /**
     * 字符串响应指令类型
     *
     * @return
     */
    String strRespMessageId() default "";

    /**
     * 消息类型描述
     *
     * @return
     */
    String desc() default "不支持消息";

}