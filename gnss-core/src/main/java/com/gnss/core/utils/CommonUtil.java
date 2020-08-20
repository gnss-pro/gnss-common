package com.gnss.core.utils;

import com.gnss.core.constants.CommonConstant;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 * <p>Description: 工具类</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/16
 */
@Slf4j
public class CommonUtil {

    private CommonUtil() {
    }

    /**
     * 获取客户端IP
     *
     * @param ctx ChannelHandlerContext
     * @return 返回IP
     */
    public static String getClientIp(ChannelHandlerContext ctx) {
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        return insocket.getAddress().getHostAddress();
    }

    /**
     * 获取客户端端口
     *
     * @param ctx ChannelHandlerContext
     * @return 返回端口
     */
    public static int getClientPort(ChannelHandlerContext ctx) {
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        return insocket.getPort();
    }

    /**
     * 获取客户端IP信息
     *
     * @param ctx ChannelHandlerContext
     * @return 返回IP
     */
    public static String getClientAddress(ChannelHandlerContext ctx) {
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        return String.format("%s:%d", insocket.getAddress().getHostAddress(), insocket.getPort());
    }

    /**
     * 打印版权信息
     */
    public static void printCopyright() {
        log.info("====================================================================================");
        log.info("此程序未经授权不得擅自复制、传播、修改，如有上述行为我司均保留追究法律责任的权利。");
        log.info("@Copyright: " + LocalDate.now().getYear() + " www.gps-pro.cn All rights reserved.");
        log.info("====================================================================================");
    }

    /**
     * 每个字节进行异或求值
     *
     * @param buf
     * @return
     */
    public static int xor(ByteBuf buf) {
        int checksum = 0;
        while (buf.readableBytes() > 0) {
            checksum ^= buf.readUnsignedByte();
        }
        return checksum;
    }

    /**
     * GBK字符串写入ByteBuf
     *
     * @param buf
     * @param str
     * @param len
     * @throws Exception
     */
    public static void writeGbkString(ByteBuf buf, String str, int len) throws Exception {
        byte[] arr = str.getBytes(CommonConstant.DEFAULT_CHARSET_NAME);
        buf.writeBytes(arr);
        if (arr.length < len) {
            byte[] paddingArr = new byte[len - arr.length];
            buf.writeBytes(paddingArr);
        }
    }

    /**
     * ByteBuf读取GBK字符串
     *
     * @param buf
     * @param len
     * @return
     */
    public static String readGbkString(ByteBuf buf, int len) {
        return buf.readCharSequence(len, CommonConstant.DEFAULT_CHARSET).toString().trim();
    }

}