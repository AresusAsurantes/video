package com.video.common.vo;

public class ResultVO<T> {
    private Integer code;
    private String message;
    private T data;

    private ResultVO(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResultVO<T> success(T data){
        return new ResultVO<>(200, "success", data);
    }

    public static <T> ResultVO<T> fail(Integer code, String message){
        return new ResultVO<>(code, message, null);
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
