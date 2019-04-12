package com.sungq1990.user.common;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = 4050628818114902827L;

    public final static String OK = "00000";
    public final static String ERROR = "99999";
    public final static String ERROR_MSG = "系统异常";

    private String code = OK;

    private String message = "success";

    private T data;

    public CommonResponse() {
    }

    public CommonResponse(T data) {
        this.code = OK;
        this.message = "";
        this.data = data;
    }

    public static CommonResponse fail(String code, String msg) {
        if (code == null || code.isEmpty()) {
            code = ERROR;
        }
        if (null == msg || msg.isEmpty()) {
            msg = ERROR_MSG;
        }
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(code);
        commonResponse.setMessage(msg);
        return commonResponse;
    }

    public static CommonResponse fail(ResponseCodeEnum errorResponseEnum) {
        if (errorResponseEnum == null) {
            errorResponseEnum = ResponseCodeEnum.FAIL;
        }
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(errorResponseEnum.getCode());
        commonResponse.setMessage(errorResponseEnum.getDesc());
        return commonResponse;
    }

    public CommonResponse<T> success() {
        setCode(ResponseCodeEnum.SUCCESS.getCode());
        setMessage(ResponseCodeEnum.SUCCESS.getDesc());
        return this;
    }

    public CommonResponse<T> withError() {
        setCode(ResponseCodeEnum.FAIL.getCode());
        setMessage(ResponseCodeEnum.FAIL.getDesc());
        return this;
    }

    public CommonResponse<T> withMsg(ResponseCodeEnum error) {
        setCode(error.getCode());
        setMessage(error.getDesc());
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean hasError() {
        return !OK.equals(getCode());
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
