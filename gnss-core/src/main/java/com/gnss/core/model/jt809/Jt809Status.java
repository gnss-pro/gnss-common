package com.gnss.core.model.jt809;

import com.gnss.core.constants.ProtocolEnum;
import com.gnss.core.model.config.Jt809Config;
import com.gnss.core.proto.LocationProto;
import com.gnss.core.proto.TerminalProto;
import io.netty.channel.ChannelHandlerContext;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: JT809状态</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019-06-16
 */
@Data
public class Jt809Status implements Serializable {

    /**
     * JT809配置信息
     */
    private Jt809Config jt809Config;

    /**
     * 协议类型
     */
    private ProtocolEnum protocolType;

    /**
     * 校验码
     */
    private Long verifyCode;

    /**
     * 主链路是否登录
     */
    private boolean mainLinkLogin;

    /**
     * 主链路socket上下文
     */
    private ChannelHandlerContext mainLinkCtx;

    /**
     * 从链路是否登录
     */
    private boolean subLinkLogin;

    /**
     * 从链路socket上下文
     */
    private ChannelHandlerContext subLinkCtx;

    /**
     * 下级平台IP
     */
    private String downLinkIp;

    /**
     * 下级平台端口
     */
    private Integer downLinkPort;

    /**
     * 归属地区政府平台使用的时效口令
     */
    private String authCode1;

    /**
     * 跨域地区政府平台使用的时效口令
     */
    private String authCode2;

    /**
     * TCP客户端
     */
    private Object TcpClient;

    /**
     * 历史位置信息
     */
    private Map<String, List<LocationProto>> historyGnssMap = new HashMap<>();

    public Jt809Status() {
    }

    public Jt809Status(Jt809Config jt809Config) {
        this.jt809Config = jt809Config;
    }

    public void putHistoryGnss(TerminalProto terminalInfo, LocationProto location) {
        String key = String.format("%s_%d", terminalInfo.getVehicleNum(), terminalInfo.getVehiclePlateColor().getValue());
        historyGnssMap.computeIfAbsent(key, k -> new ArrayList<>()).add(location);
    }

}