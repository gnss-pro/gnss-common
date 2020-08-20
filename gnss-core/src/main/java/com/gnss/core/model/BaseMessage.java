package com.gnss.core.model;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 网关消息基类</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Getter
@Setter
public class BaseMessage implements Serializable {

    /**
     * 消息体
     */
    private ByteBuf msgBody;

    /**
     * 消息体字节数组
     */
    private byte[] msgBodyArr;

    /**
     * 消息体项
     */
    private Map<String, Object> msgBodyItems = new LinkedHashMap<>();

    /**
     * 消息接收时间戳
     */
    private long receiveTime = System.currentTimeMillis();

    /**
     * 设置消息体项
     *
     * @param name
     * @param value
     */
    public void putMessageBodyItem(String name, Object value) {
        msgBodyItems.put(name, value);
    }
}
