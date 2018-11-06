package com.shop.common;


import com.shop.utils.JsonUtils;

/**
 * Created By Lizhengyuan on 18-11-6
 */
public class RespResult {

    private final static int DEFAULT_SUCCESS_CODE = 200;
    private final static String DEFAULT_SUCCESS_MSG = "SUCCESS";

    private final static int DEFAULT_ERROR_CODE = 200;
    private final static String DEFAULT_ERROR_MSG = "ERROR";

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;


    RespResult(){

    }

    RespResult(Integer status, String msg, Object data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Object buildSuccessJson(Object data){
        return buildJson(DEFAULT_SUCCESS_CODE, DEFAULT_ERROR_MSG, data);
    }

    public Object buildErrorJson(Object data){
        return buildJson(DEFAULT_ERROR_CODE, DEFAULT_ERROR_MSG, data);
    }

    private Object buildJson(Integer code, String msg, Object data){
        return JsonUtils.asMap("code",code, "msg", msg, "data",data);
    }

    public Boolean isOK() {
        return this.status == 200;
    }

}
