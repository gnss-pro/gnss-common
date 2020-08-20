package com.gnss.core.model.jt808;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 终端升级结果</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class TerminalUpgradeResult {

    /**
     * 升级类型
     */
    private int upgradeType;

    /**
     * 升级结果
     */
    private int upgradeResult;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("升级类型", upgradeType);
        items.put("升级结果", upgradeResult);
        return items.toString();
    }
}