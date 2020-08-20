package com.gnss.core.model.jt808;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description: 终端属性
 *
 * <p>Company: www.gps-pro.cn
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/9/15
 */
@Data
public class TerminalProperty {

    /**
     * 终端类型
     */
    private int terminalType;

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
     * 终端SIM卡ICCID
     */
    private String iccid;

    /**
     * 终端硬件版本号
     */
    private String hardwareVersion;

    /**
     * 终端固件版本号
     */
    private String firmwareVersion;

    /**
     * GNSS模块属性
     */
    private int gnssModelProperty;

    /**
     * 通信模块属性
     */
    private int commModelProperty;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("终端类型", terminalType);
        items.put("制造商ID", producerId);
        items.put("终端型号", terminalModelType);
        items.put("终端ID", terminalCode);
        items.put("终端SIM卡ICCID", iccid);
        items.put("终端硬件版本号", hardwareVersion);
        items.put("终端固件版本号", firmwareVersion);
        items.put("GNSS模块属性", gnssModelProperty);
        items.put("通信模块属性", commModelProperty);
        return items.toString();
    }

}