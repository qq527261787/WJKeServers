package com.swjtu.WJKeServers.web.exception.base;


public class ServletRequestBindingException extends CustomException {
    public ServletRequestBindingException(){

    }
    public ServletRequestBindingException(String message){
        super(message);
    }
}
