package com.gnss.core.model.jt808;

import com.gnss.core.proto.LocationProto;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 带应答流水号和位置的应答(0x0201位置信息查询应答,0x0500车辆控制应答)</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class LocationResponse {

    /**
     * 应答流水号
     */
    private int replyMsgFlowId;

    /**
     * 位置
     */
    private LocationProto location;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("应答流水号", replyMsgFlowId);
        items.put("位置", location.toString());
        return items.toString();
    }
}