package com.gnss.core.model.jt808;

import com.gnss.core.model.safety.DeviceStatusInfo;
import com.gnss.core.model.safety.DeviceSystemInfo;
import lombok.Data;

import java.util.List;

/**
 * <p>Description: 透传数据</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class PassthroughData {

    /**
     * 透传消息类型
     */
    private int msgType;

    /**
     * 透传消息内容
     */
    private byte[] msgContent;

    /**
     * 消息列表总数
     */
    private Integer itemCount;

    /**
     * 主动安全外设状态信息
     */
    private List<DeviceStatusInfo> deviceStatusInfoList;

    /**
     * 主动安全外设系统信息
     */
    private List<DeviceSystemInfo> deviceSystemInfoList;
}