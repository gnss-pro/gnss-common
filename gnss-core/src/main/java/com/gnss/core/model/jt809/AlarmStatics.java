package com.gnss.core.model.jt809;

import com.gnss.core.constants.jt809.Jt809AlarmTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 主动安全报警统计信息</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/6/3
 */
@Getter
@Setter
public class AlarmStatics {

    /**
     * 报警类型
     */
    private Jt809AlarmTypeEnum alarmType;

    /**
     * 报警数量
     */
    private int alarmCount;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("报警类型", String.format("%s:%s", alarmType.getHexValue(), alarmType.getDesc()));
        items.put("报警数量", alarmCount);
        return items.toString();
    }
}