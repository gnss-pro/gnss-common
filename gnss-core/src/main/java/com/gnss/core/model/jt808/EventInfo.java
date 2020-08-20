package com.gnss.core.model.jt808;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * <p>Description: 报警/事件信息</p>
 * <p>Company: www.car-eye.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019-03-04
 */
@Getter
@Setter
@ToString
public class EventInfo {

    /**
     * 胎压报警位置,报警轮胎位置编号
     */
    private int tireNum;

    /**
     * 报警/事件类型
     */
    private int eventType;

    /**
     * 报警/事件类型位
     */
    private List<Integer> eventTypeBits;

    /**
     * 胎压,单位Kpa
     */
    private int tirePressure;

    /**
     * 胎温,单位°C
     */
    private int tireTemperature;

    /**
     * 电池电量,单位%
     */
    private int batteryPower;
}
