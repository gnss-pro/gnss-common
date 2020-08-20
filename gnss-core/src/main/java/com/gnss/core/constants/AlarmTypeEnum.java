package com.gnss.core.constants;

import com.fasterxml.jackson.annotation.JsonValue;
import com.gnss.core.model.BaseEnum;
import lombok.Getter;

/**
 * <p>Description: 终端报警类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018-12-26
 */
public enum AlarmTypeEnum implements BaseEnum<String> {

    //JT808报警
    ALARM_0("紧急报警", 0, "0"),
    ALARM_1("超速报警", 1, "1"),
    ALARM_2("疲劳驾驶", 2, "2"),
    ALARM_3("危险预警", 3, "3"),
    ALARM_4("GNSS模块发生故障", 4, "4"),
    ALARM_5("GNSS天线未接或被剪断", 5, "5"),
    ALARM_6("GNSS天线短路", 6, "6"),
    ALARM_7("终端主电源欠压", 7, "7"),
    ALARM_8("终端主电源掉电", 8, "8"),
    ALARM_9("终端LCD或显示器故障", 9, "9"),
    ALARM_10("TTS模块故障", 10, "10"),
    ALARM_11("摄像头故障", 11, "11"),
    ALARM_12("道路运输证IC卡模块故障", 12, "12"),
    ALARM_13("超速预警", 13, "13"),
    ALARM_14("疲劳驾驶预警", 14, "14"),
    ALARM_18("当天累计驾驶超时", 18, "18"),
    ALARM_19("超时停车", 19, "19"),
    ALARM_20("进出区域", 20, "20"),
    ALARM_21("进出路线", 21, "21"),
    ALARM_22("路段行驶时间不足/过长", 22, "22"),
    ALARM_23("路线偏离报警", 23, "23"),
    ALARM_24("车辆VSS故障", 24, "24"),
    ALARM_25("车辆油量异常", 25, "25"),
    ALARM_26("车辆被盗", 26, "26"),
    ALARM_27("车辆非法点火", 27, "27"),
    ALARM_28("车辆非法位移", 28, "28"),
    ALARM_29("碰撞预警", 29, "29"),
    ALARM_30("侧翻预警", 30, "30"),
    ALARM_31("非法开门报警", 31, "31"),

    //JT1078视频报警
    JT1078_ALARM_0("视频信号丢失报警", 32, "32"),
    JT1078_ALARM_1("视频信号遮挡报警", 33, "33"),
    JT1078_ALARM_2("存储单元故障报警", 34, "34"),
    JT1078_ALARM_3("其他视频设备故障报警", 35, "35"),
    JT1078_ALARM_4("客车超员报警", 36, "36"),
    JT1078_ALARM_5("异常驾驶行为报警", 37, "37"),
    JT1078_ALARM_6("特殊报警录像达到存储阈值报警", 38, "38"),

    //主动安全高级驾驶辅助系统ADAS报警
    ADAS_ALARM_1("前向碰撞报警", 64, "64"),
    ADAS_ALARM_2("车道偏离报警", 65, "65"),
    ADAS_ALARM_3("车距过近报警", 66, "66"),
    ADAS_ALARM_4("行人碰撞报警", 67, "67"),
    ADAS_ALARM_5("频繁变道报警", 68, "68"),
    ADAS_ALARM_6("道路标识超限报警", 69, "69"),
    ADAS_ALARM_7("障碍物报警", 70, "70"),
    ADAS_ALARM_16("道路标志识别事件", 71, "71"),
    ADAS_ALARM_17("主动抓拍事件", 72, "72"),

    //驾驶员状态监测系统DSM报警
    DSM_ALARM_1("疲劳驾驶报警", 92, "92"),
    DSM_ALARM_2("接打电话报警", 93, "93"),
    DSM_ALARM_3("抽烟报警", 94, "94"),
    DSM_ALARM_4("分神驾驶报警", 95, "95"),
    DSM_ALARM_5("驾驶员异常报警", 96, "96"),
    DSM_ALARM_16("自动抓拍事件", 97, "97"),
    DSM_ALARM_17("驾驶员变更事件", 98, "98"),

    //胎压监测系统TPMS报警
    TPMS_ALARM("胎压报警", 110, "110"),

    //盲区监测系统BSD报警
    BSD_ALARM_1("后方接近报警", 125, "125"),
    BSD_ALARM_2("左侧后方接近报警", 126, "126"),
    BSD_ALARM_3("右侧后方接近报警", 127, "127"),

    //电子锁报警
    LOCK_ALARM_1("锁绳剪断", 640, "640"),
    LOCK_ALARM_2("震动", 641, "641"),
    LOCK_ALARM_3("长时间开锁", 642, "642"),
    LOCK_ALARM_4("开锁密码连续5次错误", 643, "643"),
    LOCK_ALARM_5("刷非法卡", 644, "644"),
    LOCK_ALARM_6("低电量", 645, "645"),
    LOCK_ALARM_7("开后盖", 646, "646"),
    LOCK_ALARM_8("卡锁", 647, "647"),
    LOCK_ALARM_9("进区域报警", 648, "648"),
    LOCK_ALARM_10("出区域报警", 649, "649"),

    //GP系列
    GP_ALARM_1("启用后备电池", 650, "650"),
    GP_ALARM_2("SOS", 651, "651"),
    GP_ALARM_3("拖吊报警", 652, "652"),
    GP_ALARM_4("劫警", 653, "653"),
    GP_ALARM_5("油位报警", 654, "654"),
    GP_ALARM_6("进热点报警", 655, "655"),
    GP_ALARM_7("出热点报警", 656, "656"),
    GP_ALARM_8("进道路报警", 657, "657"),
    GP_ALARM_9("出道路报警", 658, "658"),
    GP_ALARM_10("提前到达", 659, "659"),
    GP_ALARM_11("未在规定时间到达", 660, "660"),
    GP_ALARM_12("规定时间内到达", 661, "661"),
    GP_ALARM_13("万能端口的脉冲计数报警", 662, "662"),
    GP_ALARM_14("温湿度报警", 663, "663"),
    GP_ALARM_15("安全带报警", 664, "664"),
    GP_ALARM_16("紧急刹车报警", 665, "665"),
    GP_ALARM_17("空挡滑行", 666, "666"),
    GP_ALARM_18("GPRS重连", 667, "667"),
    GP_ALARM_19("调度屏连接", 668, "668"),
    GP_ALARM_20("调度屏断开", 669, "669"),
    GP_ALARM_21("CANBUS断开连接报警", 670, "670"),
    GP_ALARM_22("CANBUS故障码上传报警", 671, "671"),
    GP_ALARM_23("限制开车报警", 672, "672"),

    UNKNOWN("未知报警类型", -1, "-1");

    @Getter
    private final String desc;

    @Getter
    private final int value;

    private final String code;

    AlarmTypeEnum(String desc, int value, String code) {
        this.desc = desc;
        this.value = value;
        this.code = code;
    }

    @JsonValue
    @Override
    public String getCode() {
        return code;
    }

    public static AlarmTypeEnum fromValue(Integer value) {
        for (AlarmTypeEnum alarmTypeEnum : values()) {
            if (alarmTypeEnum.getValue() == value) {
                return alarmTypeEnum;
            }
        }
        return UNKNOWN;
    }

    public static AlarmTypeEnum fromValue(String code) {
        for (AlarmTypeEnum alarmTypeEnum : values()) {
            if (alarmTypeEnum.getCode().equals(code)) {
                return alarmTypeEnum;
            }
        }
        return UNKNOWN;
    }

}