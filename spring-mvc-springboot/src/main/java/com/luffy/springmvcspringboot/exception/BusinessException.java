package com.luffy.springmvcspringboot.exception;


public class BusinessException extends RuntimeException {


    private static final long serialVersionUID = 1L;

    //异常信息
    private String message;

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
