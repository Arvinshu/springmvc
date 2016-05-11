package com.arvin.controller;

/**
 * Created by Arvin on 2016/5/10.
 */
//处理添加用户时出现的
public class SpringException extends RuntimeException {
    private String exceptionMsg;

    public SpringException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public void setExceptionMsg (String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
