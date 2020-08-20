package com.gnss.core.constants;

import java.nio.charset.Charset;
import java.time.ZoneId;

/**
 * <p>Description: 公共常量</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/2/3
 */
public class CommonConstant {

    private CommonConstant() {
    }

    /**
     * 中国时区
     */
    public static final ZoneId ZONE_GMT8 = ZoneId.of("GMT+8");

    public static final int YES = 1;

    public static final int NO = 0;

    /**
     * 默认消息ID
     */
    public static final int DEFAULT_MESSAGE_ID = -999;

    /**
     * 不支持的整型指令ID
     */
    public static final int UNSUPPORT_MESSAGE_ID = -1;

    /**
     * 不支持的字符串指令ID
     */
    public static final String UNSUPPORTED_STR_MESSAGE_ID = "unsupported";

    /**
     * 默认编码
     */
    public static final String DEFAULT_CHARSET_NAME = "GBK";

    /**
     * 默认编码
     */
    public static final Charset DEFAULT_CHARSET = Charset.forName(DEFAULT_CHARSET_NAME);

}
