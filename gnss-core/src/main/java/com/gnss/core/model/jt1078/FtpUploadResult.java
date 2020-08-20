package com.gnss.core.model.jt1078;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: FTP文件上传完成通知</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class FtpUploadResult {

    /**
     * 应答流水号
     */
    private int replyMsgFlowId;

    /**
     * 结果
     */
    private int result;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("应答流水号", replyMsgFlowId);
        items.put("结果", result);
        return items.toString();
    }
}