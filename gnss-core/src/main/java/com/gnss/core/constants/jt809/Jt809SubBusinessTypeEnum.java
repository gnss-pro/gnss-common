package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809子业务类型枚举</p>
 *
 * @author Pendy
 * @version 1.0.1
 * @date 2019/10/28
 */
@Getter
public enum Jt809SubBusinessTypeEnum {

    //信息统计类
    DOWN_MANAGE_MSG_REQ(0x9102, "平台链路连接情况与车辆定位消息传输情况上报请求消息", Jt809MessageIdEnum.DOWN_MANAGE_MSG_REQ),
    UP_MANAGE_MSG_RSP(0x1102, "平台链路连接情况与车辆定位消息传输情况上报应答消息", Jt809MessageIdEnum.UP_MANAGE_MSG_RSP),
    DOWN_MANAGE_MSG_SN_INFORM(0x9103, "下发平台间消息序列号通知消息", Jt809MessageIdEnum.DOWN_MANAGE_MSG_SN_INFORM),
    UP_MANAGE_MSG_SN_INFORM(0x1103, "上传平台间消息序列号通知消息", Jt809MessageIdEnum.UP_MANAGE_MSG_SN_INFORM),

    //主链路动态信息交换消息UP_EXG_MSG
    UP_EXG_MSG_REGISTER(0x1201, "上传车辆注册信息", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_REAL_LOCATION(0x1202, "实时上传车辆定位信息", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_HISTORY_LOCATION(0x1203, "车辆定位信息自动补报", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_RETURN_STARTUP_ACK(0x1205, "启动车辆定位信息交换应答", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_RETURN_END_ACK(0x1206, "结束车辆定位信息交换应答", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_APPLY_FOR_MONITOR_STARTUP(0x1207, "申请交换指定车辆定位信息请求", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_APPLY_FOR_MONITOR_END(0x1208, "取消交换指定车辆定位信息请求", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_APPLY_HISGNSSDATA_REQ(0x1209, "补发车辆定位信息请求", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_REPORT_DRIVER_INFO_ACK(0x120A, "上报驾驶员身份信息应答", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_TAKE_EWAYBILL_ACK(0x120B, "上报车辆电子运单应答", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_REPORT_DRIVER_INFO(0x120C, "主动上报驾驶员身份信息", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_REPORT_EWAYBILL_INFO(0x120D, "主动上报车辆电子运单信息", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_BASE_MSG_REPORT_DRVLINE_INFO(0x120E, "主动上报车辆行驶路线信息", Jt809MessageIdEnum.UP_EXG_MSG),
    UP_EXG_MSG_SAFETY_TERMINAL(0x1240, "主动上传车辆主动安全智能防控终端安装信息", Jt809MessageIdEnum.UP_EXG_MSG),

    //从链路动态信息交换消息DOWN_EXG_MSG
    DOWN_EXG_MSG_REGISTER_ACK(0x9201, "车辆注册信息应答", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_CAR_LOCATION(0x9202, "交换车辆定位信息", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_HISTORY_ARCOSSAREA(0x9203, "车辆定位信息交换补发", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_CAR_INFO(0x9204, "交换车辆静态信息", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_RETURN_STARTUP(0x9205, "启动车辆定位信息交换请求", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_RETURN_END(0x9206, "结束车辆定位信息交换请求", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_APPLY_FOR_MONITOR_STARTUP_ACK(0x9207, "申请交换指定车辆定位信息应答", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_APPLY_FOR_MONITOR_END_ACK(0x9208, "取消交换指定车辆定位信息应答", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_APPLY_HISGNSSDATA_ACK(0x9209, "补发车辆定位信息应答", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_REPORT_DRIVER_INFO(0x920A, "上报驾驶员身份信息请求", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_EXG_MSG_TAKE_EWAYBILL_REQ(0x920B, "上报车辆电子运单请求", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_BASE_MSG_DRVLINE_REQ(0x920C, "上报车辆行驶路线请求", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_BASE_MSG_DRVLINE_ACK(0x920D, "车辆行驶路线请求应答", Jt809MessageIdEnum.DOWN_EXG_MSG),
    DOWN_BASE_MSG_DRVLINE_INFO(0x920E, "交换车辆行驶路线信息", Jt809MessageIdEnum.DOWN_EXG_MSG),

    //主链路平台间信息交互消息UP_PLATFORM_MSG
    UP_PLATFORM_MSG_POST_QUERY_ACK(0x1301, "平台查岗应答", Jt809MessageIdEnum.UP_PLATFORM_MSG),
    UP_PLATFORM_MSG_INFO_ACK(0x1302, "下发平台间报文应答", Jt809MessageIdEnum.UP_PLATFORM_MSG),

    //从链路平台间信息交互消息DOWN_PLATFORM_MSG
    DOWN_PLATFORM_MSG_POST_QUERY_REQ(0x9301, "平台查岗请求", Jt809MessageIdEnum.DOWN_PLATFORM_MSG),
    DOWN_PLATFORM_MSG_INFO_REQ(0x9302, "下发平台间报文请求", Jt809MessageIdEnum.DOWN_PLATFORM_MSG),

    //主链路报警信息交互消息UP_WARN_MSG
    UP_WARN_MSG_URGE_TODO_ACK(0x1401, "报警督办应答", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_ADPT_INFO(0x1402, "上报报警信息", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_ADPT_TODO_INFO(0x1403, "主动上报报警处理结果信息", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_URGE_TODO_ACK_INFO(0x1411, "上报报警督办应答消息", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_ADPT_TODO_INFO_2019(0x1412, "主动上报报警处理结果信息", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_URGE_TODO_REQ_INFO(0x1413, "上报报警督办请求消息", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_INFORM_TIPS(0x1403, "上报报警预警消息", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_FILELIST_ACK(0x1404, "主动安全报警附件目录请求应答", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_CHECK_ACK(0x1405, "报警信息核查请求应答", Jt809MessageIdEnum.UP_WARN_MSG),
    UP_WARN_MSG_STATICS_ACK(0x1406, "报警统计核查请求应答", Jt809MessageIdEnum.UP_WARN_MSG),

    //从链路报警信息交互消息DOWN_WARN_MSG
    DOWN_WARN_MSG_URGE_TODO_REQ(0x9401, "报警督办请求", Jt809MessageIdEnum.DOWN_WARN_MSG),
    DOWN_WARN_MSG_INFORM_TIPS(0x9402, "报警预警", Jt809MessageIdEnum.DOWN_WARN_MSG),
    DOWN_WARN_MSG_EXG_INFORM(0x9403, "实时交换报警信息", Jt809MessageIdEnum.DOWN_WARN_MSG),
    DOWN_WARN_MSG_FILELIST_REQ(0x9404, "主动安全报警附件目录请求消息", Jt809MessageIdEnum.DOWN_WARN_MSG),
    DOWN_WARN_MSG_CHECK_REQ(0x9405, "报警信息核查请求消息", Jt809MessageIdEnum.DOWN_WARN_MSG),
    DOWN_WARN_MSG_STATICS_REQ(0x9406, "报警统计核查请求消息", Jt809MessageIdEnum.DOWN_WARN_MSG),

    //主链路车辆监管消息UP_CTRL_MSG
    UP_CTRL_MSG_MONITOR_VEHICLE_ACK(0x1501, "车辆单向监听应答", Jt809MessageIdEnum.UP_CTRL_MSG),
    UP_CTRL_MSG_TAKE_PHOTO_ACK(0x1502, "车辆拍照应答", Jt809MessageIdEnum.UP_CTRL_MSG),
    UP_CTRL_MSG_TEXT_INFO_ACK(0x1503, "下发车辆报文应答", Jt809MessageIdEnum.UP_CTRL_MSG),
    UP_CTRL_MSG_TAKE_TRAVEL_ACK(0x1504, "上报车辆行驶记录应答", Jt809MessageIdEnum.UP_CTRL_MSG),
    UP_CTRL_MSG_EMERGENCY_MONITORING_ACK(0x1505, "车辆应急接入监管平台应答消息", Jt809MessageIdEnum.UP_CTRL_MSG),

    //从链路车辆监管消息DOWN_CTRL_MSG
    DOWN_CTRL_MSG_MONITOR_VEHICLE_REQ(0x9501, "车辆单向监听请求", Jt809MessageIdEnum.DOWN_CTRL_MSG),
    DOWN_CTRL_MSG_TAKE_PHOTO_REQ(0x9502, "车辆拍照请求", Jt809MessageIdEnum.DOWN_CTRL_MSG),
    DOWN_CTRL_MSG_TEXE_INFO(0x9503, "下发车辆报文请求", Jt809MessageIdEnum.DOWN_CTRL_MSG),
    DOWN_CTRL_MSG_TAKE_TRAVEL_REQ(0x9504, "上报车辆行驶记录请求", Jt809MessageIdEnum.DOWN_CTRL_MSG),
    DOWN_CTRL_MSG_EMERGENCY_MONITORING_REQ(0x9505, "车辆应急接入监管平台请求消息", Jt809MessageIdEnum.DOWN_CTRL_MSG),

    //主链路静态信息交换消息UP_BASE_MSG
    UP_BASE_MSG_VEHICLE_ADDED_ACK(0x1601, "补报车辆静态信息应答", Jt809MessageIdEnum.UP_BASE_MSG),
    UP_BASE_MSG_DRVLINE_ADDED_REQ(0x1602, "补报车辆行驶路线信息应答", Jt809MessageIdEnum.UP_BASE_MSG),

    //从链路静态信息交换消息DOWN_BASE_MSG
    DOWN_BASE_MSG_VEHICLE_ADDED(0x9601, "补报车辆静态信息请求", Jt809MessageIdEnum.DOWN_BASE_MSG),

    //主链路时效口令业务类消息UP_AUTHORIZE_MSG
    UP_AUTHORIZE_MSG_STARTUP(0x1701, "时效口令上报消息", Jt809MessageIdEnum.UP_AUTHORIZE_MSG),
    UP_AUTHORIZE_MSG_STARTUP_REQ(0x1702, "时效口令请求消息", Jt809MessageIdEnum.UP_AUTHORIZE_MSG),

    //从链路时效口令业务类消息DOWN_AUTHORIZE_MSG
    DOWN_AUTHORIZE_MSG_STARTUP_REQ_ACK(0x9702, "时效口令请求应答消息", Jt809MessageIdEnum.DOWN_AUTHORIZE_MSG),

    //主链路实时音视频交互消息UP_REALVIDEO_MSG
    UP_REALVIDEO_MSG_STARTUP_ACK(0x1801, "实时音视频请求应答消息", Jt809MessageIdEnum.UP_REALVIDEO_MSG),
    UP_REALVIDEO_MSG_END_ACK(0x1802, "主动请求停止实时音视频传输应答消息", Jt809MessageIdEnum.UP_REALVIDEO_MSG),

    //从链路实时音视频交互消息DOWN_REALVIDEO_MSG
    DOWN_REALVIDEO_MSG_STARTUP(0x9801, "实时音视频请求消息", Jt809MessageIdEnum.DOWN_REALVIDEO_MSG),
    DOWN_REALVIDEO_MSG_END(0x9802, "主动请求停止实时音视频传输消息", Jt809MessageIdEnum.DOWN_REALVIDEO_MSG),

    //主链路远程录像检索交互消息UP_SEARCH_MSG
    UP_FILELIST_MSG(0x1901, "主动上传音视频资源目录信息消息", Jt809MessageIdEnum.UP_SEARCH_MSG),
    UP_REALVIDEO_FILELIST_REQ_ACK(0x1902, "查询音视频资源目录应答消息", Jt809MessageIdEnum.UP_SEARCH_MSG),

    //从链路远程录像检索交互消息DOWN_SEARCH_MSG
    DOWN_FILELIST_MSG_ACK(0x9901, "主动上传音视频资源目录信息应答消息", Jt809MessageIdEnum.DOWN_SEARCH_MSG),
    DOWN_REALVIDEO_FILELIST_REQ(0x9902, "查询音视频资源目录请求消息", Jt809MessageIdEnum.DOWN_SEARCH_MSG),

    //主链路远程录像回放交互消息UP_PLAYBACK_MSG
    UP_PLAYBACK_MSG_STARTUP_ACK(0x1A01, "远程录像回放请求应答消息", Jt809MessageIdEnum.UP_PLAYBACK_MSG),
    UP_PLAYBACK_MSG_CONTROL_ACK(0x1A02, "远程录像回放控制应答消息", Jt809MessageIdEnum.UP_PLAYBACK_MSG),

    //从链路远程录像回放交互消息DOWN_PLAYBACK_MSG
    DOWN_PLAYBACK_MSG_STARTUP(0x9A01, "远程录像回放请求消息", Jt809MessageIdEnum.DOWN_PLAYBACK_MSG),
    DOWN_PLAYBACK_MSG_CONTROL(0x9A02, "远程录像回放控制消息", Jt809MessageIdEnum.DOWN_PLAYBACK_MSG),

    //主链路远程录像下载交互消息UP_DOWNLOAD_MSG
    UP_DOWNLOAD_MSG_STARTUP_ACK(0x1B01, "远程录像下载请求应答消息", Jt809MessageIdEnum.UP_DOWNLOAD_MSG),
    UP_DOWNLOAD_MSG_END_INFORM(0x1B02, "远程录像下载完成通知消息", Jt809MessageIdEnum.UP_DOWNLOAD_MSG),
    UP_DOWNLOAD_MSG_CONTROL_ACK(0x1B03, "远程录像下载控制应答消息", Jt809MessageIdEnum.UP_DOWNLOAD_MSG),

    //从链路远程录像下载交互消息DOWN_DOWNLOAD_MSG
    DOWN_DOWNLOAD_MSG_STARTUP(0x9B01, "远程录像下载请求消息", Jt809MessageIdEnum.DOWN_DOWNLOAD_MSG),
    UP_DOWNLOAD_MSG_END_INFORM_ACK(0x9B02, "远程录像下载完成通知应答消息", Jt809MessageIdEnum.DOWN_DOWNLOAD_MSG),
    DOWN_DOWNLOAD_MSG_CONTROL(0x9B03, "远程录像下载控制消息", Jt809MessageIdEnum.DOWN_DOWNLOAD_MSG),

    NULL(-2, "null", Jt809MessageIdEnum.UNSUPPORTED_MSG),

    /**
     * 未知子业务类型
     */
    UNKNOWN_BUSINESS_TYPE(-1, "未知子业务类型", Jt809MessageIdEnum.UNSUPPORTED_MSG);

    private final int value;
    private final String hexValue;
    private final String desc;
    private final Jt809MessageIdEnum parentType;

    Jt809SubBusinessTypeEnum(int value, String desc, Jt809MessageIdEnum parentType) {
        this.value = value;
        this.hexValue = String.format("0x%04x", value);
        this.desc = desc;
        this.parentType = parentType;
    }

    public static Jt809SubBusinessTypeEnum fromSubBusinessType(int subBusinessType) {
        for (Jt809SubBusinessTypeEnum subBusinessTypeEnum : values()) {
            if (subBusinessType == subBusinessTypeEnum.getValue()) {
                return subBusinessTypeEnum;
            }
        }
        return UNKNOWN_BUSINESS_TYPE;
    }
}