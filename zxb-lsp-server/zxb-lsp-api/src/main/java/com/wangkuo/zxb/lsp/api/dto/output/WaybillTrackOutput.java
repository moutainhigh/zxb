package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sanshao on 16-4-13.
 */
public class WaybillTrackOutput implements Serializable {

    private Long id;

    private Long waybillId;

    private String waybillSn;

    private String status;

    private String memo;

    private Long createUserId;

    private String createUserName;

    private Date createTime;

    private Integer userBodyType;

    private Long userBodyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public String getWaybillSn() {
        return waybillSn;
    }

    public void setWaybillSn(String waybillSn) {
        this.waybillSn = waybillSn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserBodyType() {
        return userBodyType;
    }

    public void setUserBodyType(Integer userBodyType) {
        this.userBodyType = userBodyType;
    }

    public Long getUserBodyId() {
        return userBodyId;
    }

    public void setUserBodyId(Long userBodyId) {
        this.userBodyId = userBodyId;
    }
}
