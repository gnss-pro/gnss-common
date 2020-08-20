package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809消息ID枚举</p>
 *
 * @author Pendy
 * @version 1.0.1
 * @date 2019/10/28
 */
@Getter
public enum Jt809MessageIdEnum {

    //链路管理类
    UP_CONNECT_REQ(0x1001, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路登录请求消息"),
    UP_CONNECT_RSP(0x1002, Jt809LinkTypeEnum.MAIN_LINK_DOWN, "主链路登录应答消息"),
    UP_DISCONNECT_REQ(0x1003, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路注销请求消息"),
    UP_DISCONNECT_RSP(0x1004, Jt809LinkTypeEnum.MAIN_LINK_DOWN, "主链路注销应答消息"),
    UP_LINKTEST_REQ(0x1005, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路连接保持请求消息"),
    UP_LINKTEST_RSP(0x1006, Jt809LinkTypeEnum.MAIN_LINK_DOWN, "主链路连接保持应答消息"),
    UP_DISCONNECT_INFORM(0x1007, Jt809LinkTypeEnum.SUB_LINK_UP, "主链路断开通知消息"),
    UP_CLOSELINK_INFORM(0x1008, Jt809LinkTypeEnum.SUB_LINK_UP, "下级平台主动关闭链路通知消息"),
    DOWN_CONNECT_REQ(0x9001, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路连接请求消息"),
    DOWN_CONNECT_RSP(0x9002, Jt809LinkTypeEnum.SUB_LINK_UP, "从链路连接应答消息"),
    DOWN_DISCONNECT_REQ(0x9003, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路注销请求消息"),
    DOWN_DISCONNECT_RSP(0x9004, Jt809LinkTypeEnum.SUB_LINK_UP, "从链路注销应答消息"),
    DOWN_LINKTEST_REQ(0x9005, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路连接保持请求消息"),
    DOWN_LINKTEST_RSP(0x9006, Jt809LinkTypeEnum.SUB_LINK_UP, "从链路连接保持应答消息"),
    DOWN_DISCONNECT_INFORM(0x9007, Jt809LinkTypeEnum.MAIN_LINK_DOWN, "从链路断开通知消息"),
    DOWN_CLOSELINK_INFORM(0x9008, Jt809LinkTypeEnum.MAIN_LINK_DOWN, "上级平台主动关闭链路通知消息"),

    //信息统计类
    DOWN_TOTAL_RECV_BACK_MSG(0x9101, Jt809LinkTypeEnum.SUB_LINK_DOWN, "接收定位信息数量通知消息"),
    UP_MANAGE_TOTAL_RECV_BACK_MSG(0x9101, Jt809LinkTypeEnum.MAIN_LINK_UP, "发送车辆定位信息数量通知消息"),
    DOWN_MANAGE_MSG_REQ(0x9102, Jt809LinkTypeEnum.SUB_LINK_DOWN, "平台链路连接情况与车辆定位消息传输情况上报请求消息"),
    UP_MANAGE_MSG_RSP(0x1102, Jt809LinkTypeEnum.MAIN_LINK_UP, "平台链路连接情况与车辆定位消息传输情况上报应答消息"),
    DOWN_MANAGE_MSG_SN_INFORM(0x9103, Jt809LinkTypeEnum.SUB_LINK_DOWN, "下发平台间消息序列号通知消息"),
    UP_MANAGE_MSG_SN_INFORM(0x1103, Jt809LinkTypeEnum.MAIN_LINK_UP, "上传平台间消息序列号通知消息"),

    //车辆动态信息交换类
    UP_EXG_MSG(0x1200, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路动态信息交换消息"),
    DOWN_EXG_MSG(0x9200, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路动态信息交换消息"),

    //平台间信息交互类
    UP_PLATFORM_MSG(0x1300, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路平台间信息交互消息"),
    DOWN_PLATFORM_MSG(0x9300, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路平台间信息交互消息"),

    //车辆报警信息交互类
    UP_WARN_MSG(0x1400, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路报警信息交互消息"),
    DOWN_WARN_MSG(0x9400, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路报警信息交互消息"),

    //车辆监管类
    UP_CTRL_MSG(0x1500, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路车辆监管消息"),
    DOWN_CTRL_MSG(0x9500, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路车辆监管消息"),

    //车辆静态信息交换类
    UP_BASE_MSG(0x1600, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路静态信息交换消息"),
    DOWN_BASE_MSG(0x9600, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路静态信息交换消息"),

    //时效口令业务类
    UP_AUTHORIZE_MSG(0x1700, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路时效口令交互消息"),
    DOWN_AUTHORIZE_MSG(0x9700, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路时效口令交互消息"),

    //实时音视频业务类
    UP_REALVIDEO_MSG(0x1800, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路实时音视频交互消息"),
    DOWN_REALVIDEO_MSG(0x9800, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路实时音视频交互消息"),

    //远程录像检索
    UP_SEARCH_MSG(0x1900, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路远程录像检索交互消息"),
    DOWN_SEARCH_MSG(0x9900, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路远程录像检索交互消息"),

    //远程录像回放
    UP_PLAYBACK_MSG(0x1A00, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路远程录像回放交互消息"),
    DOWN_PLAYBACK_MSG(0x9A00, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路远程录像回放交互消息"),

    //远程录像下载
    UP_DOWNLOAD_MSG(0x1B00, Jt809LinkTypeEnum.MAIN_LINK_UP, "主链路远程录像下载交互消息"),
    DOWN_DOWNLOAD_MSG(0x9B00, Jt809LinkTypeEnum.SUB_LINK_DOWN, "从链路远程录像下载交互消息"),

    NULL(-2, null, "null"),

    UNSUPPORTED_MSG(-1, null, "不支持消息");

    private final int value;
    private final String hexValue;
    private final Jt809LinkTypeEnum linkType;
    private final String desc;

    Jt809MessageIdEnum(int value, Jt809LinkTypeEnum linkType, String desc) {
        this.value = value;
        this.hexValue = String.format("0x%04x", value);
        this.linkType = linkType;
        this.desc = desc;
    }

    public static Jt809MessageIdEnum fromMessageId(int messageId) {
        for (Jt809MessageIdEnum messageIdEnum : values()) {
            if (messageId == messageIdEnum.getValue()) {
                return messageIdEnum;
            }
        }
        return UNSUPPORTED_MSG;
    }

}