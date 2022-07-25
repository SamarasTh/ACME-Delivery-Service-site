package com.acme.eshop.utils;

public class BusinessException extends Exception {
    public BusinessException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public BusinessException(final String msg) {
        super(msg);
    }
}
