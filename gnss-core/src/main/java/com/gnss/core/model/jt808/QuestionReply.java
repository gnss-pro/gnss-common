package com.gnss.core.model.jt808;

import lombok.Data;

/**
 * <p>Description: 提问应答</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class QuestionReply {

    /**
     * 应答流水号
     */
    private int replyMsgFlowId;

    /**
     * 答案ID
     */
    private int answerId;
}