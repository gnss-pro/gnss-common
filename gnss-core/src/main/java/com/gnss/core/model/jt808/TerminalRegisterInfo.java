package com.gnss.core.model.jt808;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: JT808终端注册信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class TerminalRegisterInfo {

    /**
     * 省域ID
     */
    private int provinceId;

    /**
     * 市县域ID
     */
    private int cityId;

    /**
     * 制造商ID
     */
    private String producerId;

    /**
     * 终端型号
     */
    private String terminalModelType;

    /**
     * 终端ID
     */
    private String terminalCode;

    /**
     * 车牌颜色
     */
    private int vehiclePlateColor;

    /**
     * 车牌号
     */
    private String vehicleNo;

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

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("省域ID", provinceId);
        items.put("市县域ID", cityId);
        items.put("制造商ID", producerId);
        items.put("终端型号", terminalModelType);
        items.put("终端ID", terminalCode);
        items.put("车牌颜色", vehiclePlateColor);
        items.put("车牌号", vehicleNo);
        items.put("省域ID", provinceId);
        return items.toString();
    }
}