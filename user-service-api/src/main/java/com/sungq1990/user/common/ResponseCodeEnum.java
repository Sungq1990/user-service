package com.sungq1990.user.common;

public enum ResponseCodeEnum {
    SUCCESS("00000", "success"),
    FAIL("99999", "系统错误"),
    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID("10001", "参数为空"),
    PARAM_IS_ILLEGALITY("10002", "非法的参数"),

    /* 业务错误：20001-29999 */
    BIZ_USER_NOT_EXIST("20001", "用户不存在");

    private String code;
    private String desc;

    ResponseCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
