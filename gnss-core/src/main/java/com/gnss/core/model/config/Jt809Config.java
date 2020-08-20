package com.gnss.core.model.config;

import com.gnss.core.constants.ProtocolEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: JT809平台配置</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2019/2/3
 */
@Data
public class Jt809Config implements Serializable {

    /**
     * 配置ID
     */
    private Long id;

    /**
     * JT809平台名称
     */
    private String name;

    /**
     * 是否启用(0禁用,1启用)
     */
    private int enable;

    /**
     * 控制模式:0人工控制,1自动上传
     */
    private int ctrlMode;

    /**
     * 协议类型
     */
    private ProtocolEnum protocolType;

    /**
     * 上级平台IP
     */
    private String superiorIp;

    /**
     * 上级平台端口
     */
    private Integer superiorPort;

    /**
     * 本地IP
     */
    private String localIp;

    /**
     * 本地端口
     */
    private Integer localPort;

    /**
     * 下级平台IP
     */
    private String inferiorIp;

    /**
     * 接入码
     */
    private Long centerId;

    /**
     * 用户名
     */
    private Integer userId;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否加密(0表示不加密,1表示加密)
     */
    private int encryptFlag;

    /**
     * 加密密钥
     */
    private Integer cryptoKey;

    /**
     * 加密元素M1
     */
    private int m1;

    /**
     * 加密元素IA1
     */
    private int ia1;

    /**
     * 加密元素IC1
     */
    private int ic1;

    /**
     * 平台编码
     */
    private String platformId;

    /**
     * 版本标识
     */
    private String version;

    /**
     * 版本标识字节数组
     */
    private byte[] versionArr;
}
