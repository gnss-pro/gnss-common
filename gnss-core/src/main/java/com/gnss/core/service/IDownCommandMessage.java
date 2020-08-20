package com.gnss.core.service;

import com.gnss.core.proto.TerminalProto;

/**
 * <p>Description: 下行指令消息基类</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/11/5
 */
public interface IDownCommandMessage {

    default byte[] buildMessageBody(TerminalProto terminalInfo) throws Exception {
        return null;
    }
}
