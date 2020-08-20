package com.gnss.core.model.jt808;

import lombok.Data;

/**
 * <p>Description: JT808终端鉴权信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class TerminalAuthInfo {

    /**
     * 鉴权码
     */
    private String authCode;

    /**
     * 终端IMEI
     */
    private String imeiCode;

    /**
     * 软件版本号
     */
    private String softwareVersion;
}