package com.gnss.core.rpc;

import lombok.Data;

import java.util.Set;

/**
 * <p>Description: JT808网关控制指令</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/11/5
 */
@Data
public class Jt808AppCommand {

    /**
     * 是否严格模式,严格模式采用过检的要求校验终端注册信息
     */
    private Boolean strictMode;

    /**
     * 是否上传JT808日志
     */
    private Boolean uploadLog;

    /**
     * 日志不打印的消息ID列表
     */
    private Set<Integer> filterMsgIdList;

    /**
     * 关闭程序
     */
    private Boolean shutdown;
}