package com.sungq1990.user.common;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * 通用请求
 */
public class CommonRequest<T> implements Serializable {

    private static final long serialVersionUID = 3789984867198995813L;

    /**
     * 非必填字段 登录态-用户id
     */
    private Integer userId = null;

    private T requestData = null;

    public T getRequestData() {
        return requestData;
    }

    public void setRequestData(T requestData) {
        this.requestData = requestData;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}