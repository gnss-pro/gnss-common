package com.gnss.core.model.jt1078;

import com.gnss.core.constants.jt1078.AvItemTypeEnum;
import com.gnss.core.constants.jt1078.MemoryTypeEnum;
import com.gnss.core.constants.jt1078.StreamTypeEnum;
import com.gnss.core.utils.TimeUtil;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 音视频资源信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019-03-27
 */
@Data
public class AvResourceInfo {

    /**
     * 逻辑通道号
     */
    private int channelId;

    /**
     * 开始时间
     */
    private long startTime;

    /**
     * 结束时间
     */
    private long endTime;

    /**
     * 报警标志
     */
    private long alarmFlag;

    /**
     * 音视频资源类型
     */
    private AvItemTypeEnum avItemType;

    /**
     * 码流类型
     */
    private StreamTypeEnum streamType;

    /**
     * 存储器类型
     */
    private MemoryTypeEnum memoryType;

    /**
     * 文件大小
     */
    private long fileSize;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("逻辑通道号", channelId);
        items.put("开始时间", startTime == 0 ? "0" : TimeUtil.formatTime(startTime));
        items.put("结束时间", endTime == 0 ? "0" : TimeUtil.formatTime(endTime));
        items.put("报警标志", String.format("0x%08x", alarmFlag));
        items.put("音视频资源类型", String.format("%s:%s", avItemType.getValue(), avItemType.getDesc()));
        items.put("码流类型", String.format("%s:%s", streamType.getValue(), streamType.getDesc()));
        items.put("存储器类型", String.format("%s:%s", memoryType.getValue(), memoryType.getDesc()));
        items.put("文件大小", fileSize);
        return items.toString();
    }
}