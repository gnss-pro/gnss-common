package com.gnss.core.model.safety;

import com.gnss.core.constants.safety.ActiveSafetyEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 外设系统信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/7/2
 */
@Getter
@Setter
public class DeviceSystemInfo {

    /**
     * 外设ID
     */
    private ActiveSafetyEnum activeSafetyType;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 产品型号
     */
    private String productModel;

    /**
     * 硬件版本号
     */
    private String hardwareVersion;

    /**
     * 软件版本号
     */
    private String softwareVersion;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 客户代码
     */
    private String customerCode;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("外设ID", String.format("0x%02X:%s", activeSafetyType.getCode(), activeSafetyType.getDesc()));
        items.put("公司名称", companyName);
        items.put("产品型号", productModel);
        items.put("硬件版本号", hardwareVersion);
        items.put("软件版本号", softwareVersion);
        items.put("设备ID", deviceId);
        items.put("客户代码", customerCode);
        return items.toString();
    }
}