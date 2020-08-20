package com.gnss.core.model.jt808;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: 通用应答</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
@Data
public class CommonReplyParam {

    /**
     * 应答流水号
     */
    private int replyMsgFlowId;

    /**
     * 应答消息ID
     */
    private String replyMessageId;

    /**
     * 结果
     */
    private int result;

    /**
     * 附加信息
     */
    private Map<String, Object> extraInfo = new HashMap<>();

    public Map<String, Object> setExtraInfo(String key, Object value) {
        extraInfo.put(key, value);
        return extraInfo;
    }

    @Override
    public String toString() {
        return new StringBuilder("{")
                .append("应答流水号:").append(replyMsgFlowId)
                .append(",应答消息ID:").append("0x").append(replyMessageId)
                .append(",结果:").append(result)
                .append("}").toString();
    }
}
