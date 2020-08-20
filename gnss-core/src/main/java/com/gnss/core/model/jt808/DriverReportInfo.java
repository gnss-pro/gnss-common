package com.gnss.core.model.jt808;

import lombok.Data;

/**
 * <p>Description: 驾驶员身份信息采集上报</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class DriverReportInfo {

    /**
     * 状态
     */
    private Integer status;

    /**
     * 时间
     */
    private Long time;

    /**
     * IC卡读取结果
     */
    private Integer cardReadResult;

    /**
     * 驾驶员姓名
     */
    private String driverName;

    /**
     * 从业资格证编码
     */
    private String licence;

    /**
     * 发证机构名称
     */
    private String orgName;

    /**
     * 证件有效期
     */
    private String validDate;

    /**
     * 驾驶员身份证号
     */
    private String driverId;
}