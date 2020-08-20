package com.gnss.core.model.safety;

import com.gnss.core.constants.safety.ActiveSafetyEnum;
import com.gnss.core.constants.safety.WorkingStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: 外设状态信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/7/2
 */
@Getter
@Setter
public class DeviceStatusInfo {

    /**
     * 外设ID
     */
    private ActiveSafetyEnum activeSafetyType;

    /**
     * 工作状态
     */
    private WorkingStatusEnum workingStatus;

    /**
     * 报警状态
     */
    private long alarmStatus;

    /**
     * 报警状态位
     */
    private List<Integer> alarmStatusBits;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("外设ID", String.format("0x%02X:%s", activeSafetyType.getCode(), activeSafetyType.getDesc()));
        items.put("工作状态", String.format("%s:%s", workingStatus.getHexValue(), workingStatus.getDesc()));
        items.put("报警状态", String.format("0x%08X", alarmStatus));
        return items.toString();
    }
}