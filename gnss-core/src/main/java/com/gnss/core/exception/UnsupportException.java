package com.gnss.core.exception;

/**
 * <p>Description: 未支持异常</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/9/15
 */
public class UnsupportException extends RuntimeException {

    public UnsupportException() {
    }

    public UnsupportException(String message) {
        super(message);
    }

    public UnsupportException(Throwable cause) {
        super(cause);
    }

    public UnsupportException(String message, Throwable cause) {
        super(message, cause);
    }

    protected UnsupportException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}