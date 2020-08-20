package com.gnss.core.model.jt1078;

import lombok.Data;

/**
 * <p>Description: 乘客流量</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/8/18
 */
@Data
public class PassengerFlow {

    /**
     * 起始时间
     */
    private long startTime;

    /**
     * 十六进制起始时间
     */
    private String startTimeHex;

    /**
     * 结束时间
     */
    private long endTime;

    /**
     * 十六进制结束时间
     */
    private String endTimeHex;

    /**
     * 上车人数
     */
    private int getonNum;

    /**
     * 下车人数
     */
    private int getoffNum;
}