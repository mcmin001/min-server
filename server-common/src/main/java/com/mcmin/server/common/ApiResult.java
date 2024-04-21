package com.mcmin.server.common;

import lombok.Data;

@Data
public class ApiResult<T> {
    private int code;
    private String message;
    private T data;

    public ApiResult(){

    }

    public ApiResult (int code, T data){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(1);
        apiResult.setData(data);
    }

    public static <T> ApiResult success(T data){
        return new ApiResult(1, data);
    }

    public static ApiResult failed(String errMsg){
        return new ApiResult(0, errMsg);
    }


}
