package com.gnss.core.model.jt808;

import lombok.Data;

/**
 * <p>Description: 终端RSA公钥</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
@Data
public class TerminalRsaPublicKey {

    /**
     * 终端RSA公钥{e, n}中的e
     */
    private int itemE;

    /**
     * RSA公钥{e, n}中的n
     */
    private byte[] itemN;
}