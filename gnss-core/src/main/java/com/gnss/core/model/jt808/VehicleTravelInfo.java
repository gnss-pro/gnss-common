package com.gnss.core.model.jt808;

import io.netty.buffer.ByteBufUtil;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 车辆行驶记录信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author Pendy
 * @version 1.0.1
 * @date 2019/10/31
 */
@Data
public class VehicleTravelInfo {

    /**
     * 应答流水号
     */
    private int replyMsgFlowId;

    /**
     * 命令字
     */
    private int commandType;

    /**
     * 数据块
     */
    private byte[] travelDataInfo;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("应答流水号", replyMsgFlowId);
        items.put("命令字", commandType);
        items.put("数据块", travelDataInfo == null ? "" : ByteBufUtil.hexDump(travelDataInfo));
        return items.toString();
    }
}
