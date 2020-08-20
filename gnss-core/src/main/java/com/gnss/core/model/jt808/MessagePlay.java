package com.gnss.core.model.jt808;

import lombok.Data;

/**
 * <p>Description: 信息点播/取消</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class MessagePlay {

    /**
     * 信息类型
     */
    private int msgType;

    /**
     * 点播/取消标志(0:取消,1:点播)
     */
    private int flag;
}
