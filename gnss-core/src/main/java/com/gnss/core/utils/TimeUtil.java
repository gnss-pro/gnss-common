package com.gnss.core.utils;

import com.gnss.core.constants.CommonConstant;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>Description: 时间工具类</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/16
 */
@Slf4j
public class TimeUtil {

    private TimeUtil() {
    }

    /**
     * 解析BCD时间
     *
     * @param buf 字节缓冲区
     * @return
     */
    public static long parseBcdTime(ByteBuf buf) {
        byte[] timeArr = new byte[6];
        buf.readBytes(timeArr);
        return parseBcdTime(timeArr);
    }

    /**
     * 解析BCD日期
     *
     * @param buf 字节缓冲区
     * @return
     */
    public static Long parseBcdDate(ByteBuf buf) {
        byte[] dateArr = new byte[4];
        buf.readBytes(dateArr);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        try {
            LocalDateTime localDateTime = LocalDateTime.parse(ByteBufUtil.hexDump(dateArr), formatter);
            ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, CommonConstant.ZONE_GMT8);
            return zonedDateTime.toInstant().toEpochMilli();
        } catch (Exception e) {
            log.error("转换BCD日期异常:{}", ByteBufUtil.hexDump(dateArr));
            return null;
        }
    }

    /**
     * 解析BCD时间
     *
     * @param bcdTimeArr BCD时间字节数组
     * @return
     */
    public static long parseBcdTime(byte[] bcdTimeArr) {
        return parseBcdTime(bcdTimeArr, "yyMMddHHmmss");
    }

    /**
     * 解析BCD时间
     *
     * @param bcdTimeArr      BCD时间字节数组
     * @param dateTimeFormate 时间格式
     * @return
     */
    public static long parseBcdTime(byte[] bcdTimeArr, String dateTimeFormate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateTimeFormate);
        LocalDateTime localDateTime = LocalDateTime.parse(ByteBufUtil.hexDump(bcdTimeArr), formatter);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, CommonConstant.ZONE_GMT8);
        long time = zonedDateTime.toInstant().toEpochMilli();
        return time;
    }

    /**
     * 时间戳转BCD时间
     *
     * @param timestamp
     * @return
     */
    public static byte[] timestampToBcdTime(long timestamp) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String timeStr = formatter.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), CommonConstant.ZONE_GMT8));
        byte[] timeArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            timeArr[i] = (byte) (Integer.parseInt(timeStr.substring(i * 2, i * 2 + 2), 16));
        }
        return timeArr;
    }

    /**
     * 时间戳格式化
     *
     * @param timestamp
     * @return
     */
    public static String formatTime(Long timestamp) {
        if (timestamp == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return formatter.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()));
    }
}
