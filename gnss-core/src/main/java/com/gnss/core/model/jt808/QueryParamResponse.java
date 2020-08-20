package com.gnss.core.model.jt808;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 查询参数设置应答</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/9/15
 */
@Data
public class QueryParamResponse {

    /**
     * 应答流水号
     */
    private int replyMsgFlowId;

    /**
     * 应答参数个数
     */
    private int itemCount;

    /**
     * 参数项列表
     */
    Map<Long, Object> itemMap;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("应答流水号", replyMsgFlowId);
        items.put("应答参数个数", itemCount);
        items.put("参数项列表", itemMap);
        return items.toString();
    }
}