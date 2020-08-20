package com.gnss.core.constants.jt808;

import lombok.Getter;

/**
 * <p>Description: JT808参数设置枚举</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/6/24
 */
@Getter
public enum ParamSettingEnum {

    PARAM_0001(0x0001, "终端心跳发送间隔", Integer.class),
    PARAM_0002(0x0002, "TCP消息应答超时时间", Integer.class),
    PARAM_0003(0x0003, "TCP消息重传次数", Integer.class),
    PARAM_0004(0x0004, "UDP消息应答超时时间", Integer.class),
    PARAM_0005(0x0005, "UDP消息重传次数", Integer.class),
    PARAM_0006(0x0006, "SMS消息应答超时时间", Integer.class),
    PARAM_0007(0x0007, "SMS消息重传次数", Integer.class),
    PARAM_0010(0x0010, "主服务器APN", String.class),
    PARAM_0011(0x0011, "主服务器无线通信拨号用户名", String.class),
    PARAM_0012(0x0012, "主服务器无线通信拨号密码", String.class),
    PARAM_0013(0x0013, "主服务器地址,IP或域名", String.class),
    PARAM_0014(0x0014, "备份服务器APN", String.class),
    PARAM_0015(0x0015, "备份服务器无线通信拨号用户名", String.class),
    PARAM_0016(0x0016, "备份服务器无线通信拨号密码", String.class),
    PARAM_0017(0x0017, "备份服务器地址,IP或域名", String.class),
    PARAM_0018(0x0018, "服务器TCP端口", Integer.class),
    PARAM_0019(0x0019, "服务器UDP端口", Integer.class),
    PARAM_001A(0x001A, "道路运输证IC卡认证主服务器IP地址或域名", String.class),
    PARAM_001B(0x001B, "道路运输证IC卡认证主服务器TCP端口", Integer.class),
    PARAM_001C(0x001C, "道路运输证IC卡认证主服务器UDP端口", Integer.class),
    PARAM_001D(0x001D, "道路运输证IC卡认证备份服务器IP地址或域名", String.class),
    PARAM_0020(0x0020, "位置汇报策略", Integer.class),
    PARAM_0021(0x0021, "位置汇报方案", Integer.class),
    PARAM_0022(0x0022, "驾驶员未登录汇报时间间隔", Integer.class),
    PARAM_0023(0x0023, "从服务器APN", String.class),
    PARAM_0024(0x0024, "从服务器无线通信拨号用户名", String.class),
    PARAM_0025(0x0025, "从服务器无线通信拨号密码", String.class),
    PARAM_0026(0x0026, "从服务器备份地址,IP或域名", String.class),
    PARAM_0027(0x0027, "休眠时汇报时间间隔", Integer.class),
    PARAM_0028(0x0028, "紧急报警时汇报时间间隔", Integer.class),
    PARAM_0029(0x0029, "缺省时间汇报间隔", Integer.class),
    PARAM_002C(0x002C, "缺省距离汇报间隔", Integer.class),
    PARAM_002D(0x002D, "驾驶员未登录汇报距离间隔", Integer.class),
    PARAM_002E(0x002E, "休眠时汇报距离间隔", Integer.class),
    PARAM_002F(0x002F, "紧急报警时汇报距离间隔", Integer.class),
    PARAM_0030(0x0030, "拐点补传角度", Integer.class),
    PARAM_0031(0x0031, "电子围栏半径(非法位移阈值)", Short.class),
    PARAM_0032(0x0032, "违规行驶时段范围", byte[].class),
    PARAM_0040(0x0040, "监控平台电话号码", String.class),
    PARAM_0041(0x0041, "复位电话号码", String.class),
    PARAM_0042(0x0042, "恢复出厂设置电话号码", String.class),
    PARAM_0043(0x0043, "监控平台SMS电话号码", String.class),
    PARAM_0044(0x0044, "接收终端SMS文本报警号码", String.class),
    PARAM_0045(0x0045, "终端电话接听策略", Integer.class),
    PARAM_0046(0x0046, "每次最长通话时间", Integer.class),
    PARAM_0047(0x0047, "当月最长通话时间", Integer.class),
    PARAM_0048(0x0048, "监听电话号码", String.class),
    PARAM_0049(0x0049, "监管平台特权短信号码", String.class),
    PARAM_0050(0x0050, "报警屏蔽字", Integer.class),
    PARAM_0051(0x0051, "报警发送文本SMS开关", Integer.class),
    PARAM_0052(0x0052, "报警拍摄开关", Integer.class),
    PARAM_0053(0x0053, "报警拍摄存储标志", Integer.class),
    PARAM_0054(0x0054, "关键标志", Integer.class),
    PARAM_0055(0x0055, "最高速度", Integer.class),
    PARAM_0056(0x0056, "超速持续时间", Integer.class),
    PARAM_0057(0x0057, "连续驾驶时间门限", Integer.class),
    PARAM_0058(0x0058, "当天累计驾驶时间门限", Integer.class),
    PARAM_0059(0x0059, "最小休息时间", Integer.class),
    PARAM_005A(0x005A, "最长停车时间", Integer.class),
    PARAM_005B(0x005B, "超速预警差值", Short.class),
    PARAM_005C(0x005C, "疲劳驾驶预警差值", Short.class),
    PARAM_005D(0x005D, "碰撞报警参数设置", Short.class),
    PARAM_005E(0x005E, "侧翻报警参数设置", Short.class),
    PARAM_0064(0x0064, "定时拍照设置", Integer.class),
    PARAM_0065(0x0065, "定距拍照设置", Integer.class),
    PARAM_0070(0x0070, "图像/视频质量", Integer.class),
    PARAM_0071(0x0071, "亮度", Integer.class),
    PARAM_0072(0x0072, "对比度", Integer.class),
    PARAM_0073(0x0073, "饱和度", Integer.class),
    PARAM_0074(0x0074, "色度", Integer.class),
    PARAM_0075(0x0075, "音视频参数设置", byte[].class),
    PARAM_0076(0x0076, "音视频通道列表设置", byte[].class),
    PARAM_0077(0x0077, "单独视频通道参数设置", byte[].class),
    PARAM_0079(0x0079, "特殊报警录像参数设置", byte[].class),
    PARAM_007A(0x007A, "视频报警屏蔽字", Integer.class),
    PARAM_007B(0x007B, "图像分析报警参数设置", byte[].class),
    PARAM_007C(0x007C, "终端休眠唤醒模式设置", byte[].class),
    PARAM_0080(0x0080, "车辆里程表读数", Integer.class),
    PARAM_0081(0x0081, "车辆所在的省域ID", Short.class),
    PARAM_0082(0x0082, "车辆所在的市域ID", Short.class),
    PARAM_0083(0x0083, "车牌号码", String.class),
    PARAM_0084(0x0084, "车牌颜色", Byte.class),
    PARAM_0090(0x0090, "GNSS定位模式", Byte.class),
    PARAM_0091(0x0091, "GNSS波特率", Byte.class),
    PARAM_0092(0x0092, "GNSS模块输出频率", Byte.class),
    PARAM_0093(0x0093, "GNSS模块采集频率", Byte.class),
    PARAM_0094(0x0094, "GNSS数据上传方式", Byte.class),
    PARAM_0095(0x0095, "GNSS数据上传设置", Byte.class),
    PARAM_0100(0x0100, "CAN通道1采集间隔", Integer.class),
    PARAM_0101(0x0101, "CAN通道1上传间隔", Short.class),
    PARAM_0102(0x0102, "CAN通道2采集间隔", Integer.class),
    PARAM_0103(0x0103, "CAN通道2上传间隔", Short.class),
    PARAM_0110(0x0110, "CAN总线ID单独采集设置", byte[].class),
    PARAM_F364(0xF364, "高级驾驶辅助系统参数", byte[].class),
    PARAM_F365(0xF365, "驾驶员状态监测系统参数", byte[].class),
    PARAM_F366(0xF366, "胎压监测系统参数", byte[].class),
    PARAM_F367(0xF367, "盲区监测系统参数", byte[].class),

    UNKNOWN(-1,  "未知参数", null);

    private final long value;

    private final String desc;

    private final Class<?> clazz;

    ParamSettingEnum(long value, String desc, Class<?> clazz) {
        this.value = value;
        this.desc = desc;
        this.clazz = clazz;
    }

    public static ParamSettingEnum fromValue(long value) {
        for (ParamSettingEnum paramSettingEnum : values()) {
            if (value == paramSettingEnum.getValue()) {
                return paramSettingEnum;
            }
        }
        return UNKNOWN;
    }
}