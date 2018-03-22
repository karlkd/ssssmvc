package com.wlqq.he.common;

/**
 * Created by 69412 on 2018/3/8.
 */
public enum ErrorCode {
    SYSTEM_INTERNAL_ERROR(0, 100000, "服务器暂时无法处理您的请求，请稍候再试"),
    SYSTEM_INVALID_PARAM(3, 100001, "参数错误，请检查输入"),
    SYSTEM_CONNECT_TIMEOUT(100002, 100002, "连接超时，请稍候重试"),
    SYSTEM_BUSY_ERROR(0, 100003, "服务器繁忙，请稍候再试"),
    AA_ACCESS_DENIED(4, 1000001, "拒绝访问您没有权限访问此资源"),
    AA_INVALID_PARAM(3, 1000002, "拒绝访问参数列表不符合类型"),
    AA_DISABLED_USER(3, 1000003, "拒绝访问用户已禁用"),
    AA_BAD_CREDENTIAL(4, 1000004, "拒绝访问非法域"),
    AA_BAD_SIGNATURE(4, 1000005, "拒绝访问非法数据");

    private int legacyCode;
    private int code;
    private String message;

    private ErrorCode(int legacyCode, int code, String message) {
        this.legacyCode = legacyCode;
        this.code = code;
        this.message = message;
    }

    public static ErrorCode getByCode(int code) {
        ErrorCode[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ErrorCode errorCode = arr$[i$];
            if(errorCode.getCode() == code) {
                return errorCode;
            }
        }

        return null;
    }

    public static ErrorCode getByLegacyCode(int legacyCode) {
        ErrorCode[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ErrorCode errorCode = arr$[i$];
            if(errorCode.getLegacyCode() == legacyCode) {
                return errorCode;
            }
        }

        return null;
    }

    public int getLegacyCode() {
        return this.legacyCode;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
