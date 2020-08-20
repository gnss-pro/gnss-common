package com.gnss.core.model.jt808;

import lombok.Data;

/**
 * <p>Description: 数据压缩上报</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class ZipData {

    /**
     * 压缩消息长度
     */
    private int zipDataLen;

    /**
     * 压缩消息体
     */
    private byte[] zipData;
}