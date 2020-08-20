package com.gnss.core.model.jt808;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: 多媒体数据检索应答</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class MediaDataRetrievalResponse {

    /**
     * 应答流水号
     */
    private int replyMsgFlowId;

    /**
     * 多媒体数据总项数
     */
    private int itemCount;

    /**
     * 检索项
     */
    private List<MediaDataRetrievalItem> itemList = new ArrayList<>();

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("应答流水号", replyMsgFlowId);
        items.put("多媒体数据总项数", itemCount);
        items.put("检索项", itemList.toString());
        return items.toString();
    }
}