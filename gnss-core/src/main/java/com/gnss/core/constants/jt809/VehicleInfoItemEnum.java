package com.gnss.core.constants.jt809;

import lombok.Getter;

/**
 * <p>Description: JT809车辆静态信息字段</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/2/3
 */
@Getter
public enum VehicleInfoItemEnum {

    VIN("VIN", "车牌号"),

    VEHICLE_COLOR("VEHICLE_COLOR", "车牌颜色"),

    VEHICLE_TYPE("VEHICLE_TYPE", "车辆类型"),

    TRANS_TYPE("TRANS_TYPE", "运输行业编码"),

    VEHICLE_NATIONALITY("VEHICLE_NATIONALITY", "车籍地"),

    BUSINESSSCOPECODE("BUSINESSSCOPECODE", "经营范围代码"),

    OWERS_ID("OWERS_ID", "业户ID"),

    OWERS_NAME("OWERS_NAME", "业户名称"),

    OWERS_TEL("OWERS_TEL", "业户联系电话");

    private String itemCode;

    private String itemName;

    VehicleInfoItemEnum(String itemCode, String itemName) {
        this.itemCode = itemCode;
        this.itemName = itemName;
    }
}