package com.wlqq.he.common;

/**
 * Created by 69412 on 2018/3/8.
 */
public class JsonResponse {
    private JsonResponse.Status status;
    private Object content;
    private int errorCode;
    private String errorMsg;

    public JsonResponse() {
    }

    public JsonResponse(JsonResponse.Status status, Object content) {
        this.status = status;
        this.content = content;
    }

    public JsonResponse(JsonResponse.Status status, int errorCode, String errorMsg) {
        this.status = status;
        this.content = Integer.valueOf(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static JsonResponse ok() {
        return new JsonResponse(JsonResponse.Status.OK, "");
    }

    public static JsonResponse ok(Object content) {
        return new JsonResponse(JsonResponse.Status.OK, content);
    }

    public static JsonResponse error(int errorCode, String errorMsg) {
        return new JsonResponse(JsonResponse.Status.ERROR, errorCode, errorMsg);
    }

    public static JsonResponse error(ErrorCode code) {
        return new JsonResponse(JsonResponse.Status.ERROR, code.getCode(), code.getMessage());
    }

    public JsonResponse.Status getStatus() {
        return this.status;
    }

    public void setStatus(JsonResponse.Status status) {
        this.status = status;
    }

    public Object getContent() {
        return this.content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static enum Status {
        OK,
        ERROR;

        private Status() {
        }
    }
}
