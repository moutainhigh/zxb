package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mark on 16/4/14.
 */
public class CreatePaymentInput implements Serializable {
    private Long waybillId;
    private Long benchmarkId;
    private Long bookerId;
    private String bookerName;
    private Date createTime;

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public Long getBenchmarkId() {
        return benchmarkId;
    }

    public void setBenchmarkId(Long benchmarkId) {
        this.benchmarkId = benchmarkId;
    }

    public Long getBookerId() {
        return bookerId;
    }

    public void setBookerId(Long bookerId) {
        this.bookerId = bookerId;
    }

    public String getBookerName() {
        return bookerName;
    }

    public void setBookerName(String bookerName) {
        this.bookerName = bookerName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
