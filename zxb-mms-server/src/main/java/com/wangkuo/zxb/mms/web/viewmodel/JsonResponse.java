package com.wangkuo.zxb.mms.web.viewmodel;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-27
 */
public class JsonResponse implements Serializable {

    private int code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;


    public JsonResponse() {
    }

    public JsonResponse(int code) {
        this(code, null, null);
    }

    public JsonResponse(int code, String msg) {
        this(code, msg, null);
    }

    public JsonResponse(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * Getter for property 'code'.
     *
     * @return Value for property 'code'.
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter for property 'code'.
     *
     * @param code Value to set for property 'code'.
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Getter for property 'msg'.
     *
     * @return Value for property 'msg'.
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Setter for property 'msg'.
     *
     * @param msg Value to set for property 'msg'.
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Getter for property 'data'.
     *
     * @return Value for property 'data'.
     */
    public Object getData() {
        return data;
    }

    /**
     * Setter for property 'data'.
     *
     * @param data Value to set for property 'data'.
     */
    public void setData(Object data) {
        this.data = data;
    }
}
