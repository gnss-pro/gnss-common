package com.gnss.core.model;

import com.gnss.core.model.jt808.DriverReportInfo;
import com.gnss.core.model.jt808.EwaybillInfo;
import com.gnss.core.model.jt808.TerminalRegisterInfo;
import lombok.Data;

/**
 * <p>Description: 终端附加状态</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/4/17
 */
@Data
public class TerminalExtraStatus {

    /**
     * 终端注册信息
     */
    private TerminalRegisterInfo registerInfo;

    /**
     * 驾驶员身份信息采集上报
     */
    private DriverReportInfo driverReportInfo;

    /**
     * 电子运单信息
     */
    private EwaybillInfo ewaybillInfo;
}