package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.util.Date;

public class TSbGoodCategoryAllot implements Serializable {
    private Long id;

    private Long categoryId;

    private Integer status;

    private Long allocCenterId;

    private String allocCenterName;

    private Long applyEmployeeId;

    private String applyEmployeeName;

    private Date applyTime;

    private Long verifyEmployeeId;

    private String verifyEmployeeName;

    private Date verifyTime;

    private String memo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAllocCenterId() {
        return allocCenterId;
    }

    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    public String getAllocCenterName() {
        return allocCenterName;
    }

    public void setAllocCenterName(String allocCenterName) {
        this.allocCenterName = allocCenterName == null ? null : allocCenterName.trim();
    }

    public Long getApplyEmployeeId() {
        return applyEmployeeId;
    }

    public void setApplyEmployeeId(Long applyEmployeeId) {
        this.applyEmployeeId = applyEmployeeId;
    }

    public String getApplyEmployeeName() {
        return applyEmployeeName;
    }

    public void setApplyEmployeeName(String applyEmployeeName) {
        this.applyEmployeeName = applyEmployeeName == null ? null : applyEmployeeName.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Long getVerifyEmployeeId() {
        return verifyEmployeeId;
    }

    public void setVerifyEmployeeId(Long verifyEmployeeId) {
        this.verifyEmployeeId = verifyEmployeeId;
    }

    public String getVerifyEmployeeName() {
        return verifyEmployeeName;
    }

    public void setVerifyEmployeeName(String verifyEmployeeName) {
        this.verifyEmployeeName = verifyEmployeeName == null ? null : verifyEmployeeName.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}