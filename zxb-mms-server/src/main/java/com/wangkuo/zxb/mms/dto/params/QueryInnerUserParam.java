package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/6 0006.
 */
public class QueryInnerUserParam extends PageParam implements Serializable {
    private Integer tYear;

    private Integer tMonth;

    private Integer merchantType;

    private Integer merchantStatus;

    private Integer status;

    private Long allocCentreId;

    private Long regionId;

    private String customerName;

    private String inviteName;

    public Integer getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
    }

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAllocCentreId() {
        return allocCentreId;
    }

    public void setAllocCentreId(Long allocCentreId) {
        this.allocCentreId = allocCentreId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInviteName() {
        return inviteName;
    }

    public void setInviteName(String inviteName) {
        this.inviteName = inviteName;
    }

    public Integer gettYear() {
        return tYear;
    }

    public void settYear(Integer tYear) {
        this.tYear = tYear;
    }

    public Integer gettMonth() {
        return tMonth;
    }

    public void settMonth(Integer tMonth) {
        this.tMonth = tMonth;
    }
}
