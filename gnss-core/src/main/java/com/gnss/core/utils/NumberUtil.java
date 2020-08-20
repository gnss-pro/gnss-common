package com.gnss.core.utils;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: 数字工具类</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/16
 */
public class NumberUtil {

    private NumberUtil() {
    }

    /**
     * 坐标精度
     */
    public static final BigDecimal COORDINATE_PRECISION = new BigDecimal("0.000001");

    /**
     * 坐标因数
     */
    public static final BigDecimal COORDINATE_FACTOR = new BigDecimal("1000000");

    /**
     * 小数点一位精度
     */
    public static final BigDecimal ONE_PRECISION = new BigDecimal("0.1");

    /**
     * 格式化int(转成0xXXXX)
     *
     * @param num 数字
     * @return 格式化字符串
     */
    public static String formatIntNum(int num) {
        return num < 0 ? String.valueOf(num) : String.format("0x%04X", num);
    }

    /**
     * 格式化短数字
     *
     * @param num 数字
     * @return 格式化字符串
     */
    public static String formatShortNum(int num) {
        return num < 0 ? String.valueOf(num) : String.format("0x%02X", num);
    }

    /**
     * 转4位的十六进制字符串
     *
     * @param num 数字
     * @return 格式化字符串
     */
    public static String hexStr(int num) {
        return String.format("%04X", num);
    }

    /**
     * 转十六进制字符串
     *
     * @param num  数字
     * @param size 长度
     * @return 格式化字符串
     */
    public static String hexStr(int num, int size) {
        return StringUtils.leftPad(Integer.toHexString(num).toUpperCase(), size, '0');
    }

    /**
     * 解析short类型的值,获取值为1的位数
     *
     * @param number
     * @return
     */
    public static List<Integer> parseShortBits(int number) {
        List<Integer> bits = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            if (getBitValue(number, i) == 1) {
                bits.add(i);
            }
        }
        return bits;
    }

    /**
     * 解析int类型的值,获取值为1的位数
     *
     * @param number
     * @return
     */
    public static List<Integer> parseIntegerBits(long number) {
        List<Integer> bits = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            if (getBitValue(number, i) == 1) {
                bits.add(i);
            }
        }
        return bits;
    }

    /**
     * 获取二进制第index位的值
     *
     * @param number
     * @param index
     * @return
     */
    public static int getBitValue(long number, int index) {
        return (number & (1 << index)) > 0 ? 1 : 0;
    }

    /**
     * bit列表转int
     *
     * @param bits
     * @param len
     * @return
     */
    public static int bitsToInt(List<Integer> bits, int len) {
        if (bits == null || bits.isEmpty()) {
            return 0;
        }

        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            char value = bits.contains(i) ? '1' : '0';
            chars[len - 1 - i] = value;
        }
        int result = Integer.parseInt(new String(chars), 2);
        return result;
    }

    /**
     * bit列表转long
     *
     * @param bits
     * @param len
     * @return
     */
    public static long bitsToLong(List<Integer> bits, int len) {
        if (bits == null || bits.isEmpty()) {
            return 0L;
        }

        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            char value = bits.contains(i) ? '1' : '0';
            chars[len - 1 - i] = value;
        }
        long result = Long.parseLong(new String(chars), 2);
        return result;
    }

    /**
     * BigDecimal乘法
     *
     * @param longNum
     * @param precision
     * @return
     */
    public static double multiply(long longNum, BigDecimal precision) {
        return new BigDecimal(String.valueOf(longNum)).multiply(precision).doubleValue();
    }

    /**
     * BigDecimal乘法
     *
     * @param longNum
     * @param precision
     * @return
     */
    public static double multiply(int longNum, BigDecimal precision) {
        return new BigDecimal(String.valueOf(longNum)).multiply(precision).doubleValue();
    }

}