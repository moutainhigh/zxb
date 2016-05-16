package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sanshao on 16-4-11.
 */
public class LspWaybillChangeVerifyInput implements Serializable {

    private Long waybillId;
    private Long lspChangeId;
    private Integer status;
    private String memo;
    private Long verifyId;
    private String verifyName;
    private Date verifyTime;

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public Long getLspChangeId() {
        return lspChangeId;
    }

    public void setLspChangeId(Long lspChangeId) {
        this.lspChangeId = lspChangeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getVerifyId() {
        return verifyId;
    }

    public void setVerifyId(Long verifyId) {
        this.verifyId = verifyId;
    }

    public String getVerifyName() {
        return verifyName;
    }

    public void setVerifyName(String verifyName) {
        this.verifyName = verifyName;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }
}
