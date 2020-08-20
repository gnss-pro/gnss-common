package com.gnss.core.model.jt808;

import com.gnss.core.constants.jt808.Jt808MediaEventEnum;
import com.gnss.core.constants.jt808.Jt808MediaTypeEnum;
import com.gnss.core.proto.LocationProto;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class MediaDataRetrievalItem {

    /**
     * 多媒体数据ID
     */
    private long mediaId;

    /**
     * 多媒体类型
     */
    private Jt808MediaTypeEnum mediaType;

    /**
     * 通道ID
     */
    private int channelId;

    /**
     * 事件项编码
     */
    private Jt808MediaEventEnum eventItemCode;

    /**
     * 位置信息
     */
    private LocationProto location;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("多媒体数据ID", mediaId);
        items.put("多媒体类型", String.format("%d:%s", mediaType.getValue(), mediaType.getDesc()));
        items.put("通道ID", channelId);
        items.put("事件项编码", String.format("%d:%s", eventItemCode.getValue(), eventItemCode.getDesc()));
        items.put("位置", location.toString());
        return items.toString();
    }
}