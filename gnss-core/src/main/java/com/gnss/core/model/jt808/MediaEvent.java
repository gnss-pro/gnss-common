package com.gnss.core.model.jt808;

import com.gnss.core.constants.jt808.Jt808MediaEventEnum;
import com.gnss.core.constants.jt808.Jt808MediaFormatEnum;
import com.gnss.core.constants.jt808.Jt808MediaTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 多媒体事件信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Getter
@Setter
public class MediaEvent {

    /**
     * 多媒体数据ID
     */
    private long mediaId;

    /**
     * 多媒体类型
     */
    private Jt808MediaTypeEnum mediaType;

    /**
     * 多媒体格式编码
     */
    private Jt808MediaFormatEnum mediaFormatCode;

    /**
     * 事件项编码
     */
    private Jt808MediaEventEnum eventItemCode;

    /**
     * 通道ID
     */
    private int channelId;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("多媒体数据ID", mediaId);
        items.put("多媒体类型", String.format("%s:%s", mediaType.getValue(), mediaType.getDesc()));
        items.put("多媒体格式编码", String.format("%s:%s", mediaFormatCode.getValue(), mediaFormatCode.getDesc()));
        items.put("事件项编码", String.format("%s:%s", eventItemCode.getValue(), eventItemCode.getDesc()));
        items.put("通道ID", channelId);
        return items.toString();
    }
}