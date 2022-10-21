package com.video.common.enums;

public enum FailCode {

    /**
     * 用户未找到
     */
    USER_NOT_FOUND(-200, "用户未找到");

    private Integer code;
    private String message;

    FailCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
