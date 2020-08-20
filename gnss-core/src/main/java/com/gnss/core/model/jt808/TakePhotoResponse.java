package com.gnss.core.model.jt808;

import lombok.Data;

import java.util.List;

/**
 * <p>Description: 摄像头立即拍摄命令应答</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class TakePhotoResponse {

    /**
     * 应答流水号
     */
    private int replyMsgFlowId;

    /**
     * 结果
     */
    private int result;

    /**
     * ID个数
     */
    private int idCount;

    /**
     * ID列表
     */
    private List<Integer> idList;
}