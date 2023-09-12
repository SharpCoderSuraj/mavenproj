package com.estudo.restestudo.handler;

public class BusinessException extends Exception{
    public BusinessException(String msg){
        super(msg);
    }

    public BusinessException(String msg, Object... params){
        super(String.format(msg, params));
    }
}
