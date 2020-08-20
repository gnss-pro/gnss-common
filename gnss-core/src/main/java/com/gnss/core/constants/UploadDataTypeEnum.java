package com.gnss.core.constants;

/**
 * <p>Description: 终端上报数据类型</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2017/6/19
 */
public enum UploadDataTypeEnum {

    /**
     * 终端注册信息
     */
    TERMINAL_REGISTER,

    /**
     * 终端鉴权
     */
    TERMINAL_AUTH,

    /**
     * 终端注销
     */
    TERMINAL_CANCEL,

    /**
     * 终端升级结果
     */
    TERMINAL_UPGRADE_RESULT,

    /**
     * 事件报告
     */
    EVENT_REPORT,

    /**
     * 提问应答
     */
    QUESTION_REPLY,

    /**
     * 信息点播/取消
     */
    MESSAGE_PLAY,

    /**
     * 驾驶员身份信息采集
     */
    DRIVER_INFO,

    /**
     * 电子运单
     */
    EWAYBILL,

    /**
     * 行驶记录数据
     */
    VEHICLE_TRAVEL,

    /**
     * CAN总线数据
     */
    CAN_BUS_DATA,

    /**
     * 多媒体事件信息
     */
    MEDIA_EVENT,

    /**
     * 摄像头立即拍摄命令应答
     */
    TAKE_PHOTO_RESPONSE,

    /**
     * 数据上行透传
     */
    PASSTHROUGH,

    /**
     * 数据压缩
     */
    ZIP_DATA,

    /**
     * 终端RSA公钥
     */
    TERMINAL_RSA_PUBLIC_KEY,

    /**
     * 乘客流量
     */
    PASSENGER_FLOW,

    /**
     * 音视频资源列表
     */
    MEDIA_RESOURCE_LIST,

    /**
     * FTP文件上传完成通知
     */
    FTP_UPLOAD_RESULT,

    /**
     * 文件服务器FTP上传完成信息
     */
    FTP_UPLOADED_INFO,

    /**
     * 未支持的JT808消息
     */
    UNSUPPORT_JT808_MSG,

    /**
     * 电子锁
     */
    ELECTRONIC_LOCK,

    /**
     * 流媒体录像
     */
    MEDIA_RECORD,

    /**
     * 其他
     */
    OTHER
}