package com.gnss.core.model.jt1078;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: 终端音视频属性</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/6/30
 */
@Data
public class AvProperty {

    /**
     * 输入音频编码格式
     */
    private int inputAudioFormat;

    /**
     * 输入音频声道数
     */
    private int inputAudioChannelNum;

    /**
     * 输入音频采样率
     */
    private int inputAudioSamplingRate;

    /**
     * 输入音频采样位数
     */
    private int inputAudioSamplingBits;

    /**
     * 音频帧长度
     */
    private int audioFrameLen;

    /**
     * 是否支持音频输出
     */
    private int audioOutputSupport;

    /**
     * 视频编码方式
     */
    private int videoFormat;

    /**
     * 终端支持的最大音频物理通道数量
     */
    private int audioMaxChannel;

    /**
     * 终端支持的最大视频物理通道数量
     */
    private int videoMaxChannel;

    @Override
    public String toString() {
        Map<String, Object> items = new LinkedHashMap<>();
        items.put("输入音频编码格式", inputAudioFormat);
        items.put("输入音频声道数", inputAudioChannelNum);
        items.put("输入音频采样率", inputAudioSamplingRate);
        items.put("输入音频采样位数", inputAudioSamplingBits);
        items.put("音频帧长度", audioFrameLen);
        items.put("是否支持音频输出", audioOutputSupport);
        items.put("视频编码方式", videoFormat);
        items.put("终端支持的最大音频物理通道数量", audioMaxChannel);
        items.put("终端支持的最大视频物理通道数量", videoMaxChannel);
        return items.toString();
    }
}