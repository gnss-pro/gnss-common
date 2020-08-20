package com.gnss.core.model.jt808;

import lombok.Data;

/**
 * <p>Description: 电子运单信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class EwaybillInfo {

    /**
     * 电子运单内容
     */
    private byte[] ewaybillData;
}
