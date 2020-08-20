package com.gnss.core.model.jt808;

import io.netty.buffer.ByteBufUtil;
import lombok.Data;

/**
 * <p>Description: CAN总线数据</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class CanBusItem {

    /**
     * CAN ID
     */
    private int canId;

    /**
     * CAN数据
     */
    private byte[] canData;

    @Override
    public String toString() {
        return new StringBuilder("{")
                .append("CAN ID:").append(canId)
                .append(",CAN数据:").append(ByteBufUtil.hexDump(canData))
                .append("}").toString();
    }
}