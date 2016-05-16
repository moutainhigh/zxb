package com.wangkuo.zxb.lsp.web.common;

import java.io.Serializable;

/**
 * ajax请求结果
 * wjh
 * 2016-04-05
 */
public class AjaxResponse<T> implements Serializable {

    /**
     * 成功
     */
    public static final int AJAX_SUCCESS = 1;
    /**
     * 失败
     */
    public static final int AJAX_FAILED = -1;

    /**
     * 参数错误
     */
    public static final int PARAM_INVALID = 400;

    private Integer status;
    private String msg;
    private T data;

    public AjaxResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public AjaxResponse(Integer status) {
        this.status = status;
    }

    public AjaxResponse(String msg) {
        this.msg = msg;
    }

    public AjaxResponse() {
    }


    public static AjaxResponse success(String msg) {
        return new AjaxResponse(AJAX_SUCCESS, msg);
    }

    public static AjaxResponse success() {
        return new AjaxResponse(AJAX_SUCCESS);
    }

    public static AjaxResponse failed(String msg) {
        return new AjaxResponse(AJAX_FAILED, msg);
    }

    public static AjaxResponse failed() {
        return new AjaxResponse(AJAX_FAILED);
    }

    public static AjaxResponse paramInvalid() {
        return new AjaxResponse(PARAM_INVALID, "参数错误");
    }

    public static AjaxResponse paramInvalid(String msg) {
        return new AjaxResponse(PARAM_INVALID, msg);
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
