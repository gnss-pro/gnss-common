package com.gnss.core.model.jt808;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: CAN总线数据</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Getter
@Setter
public class CanBusData {

    /**
     * 数据项个数
     */
    private int itemCount;

    /**
     * 接收时间(5个字节BCD字符串)
     */
    private String receiveTime;

    /**
     * CAN总线数据项
     */
    private List<CanBusItem> itemList = new ArrayList<>();

    public void putCanItem(int canId, byte[] canData) {
        CanBusItem canBusItem = new CanBusItem();
        canBusItem.setCanId(canId);
        canBusItem.setCanData(canData);
        itemList.add(canBusItem);
    }

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("数据项个数", itemCount);
        items.put("CAN总线数据接收时间", receiveTime);
        items.put("CAN总线数据项", itemList.toString());
        return items.toString();
    }
}