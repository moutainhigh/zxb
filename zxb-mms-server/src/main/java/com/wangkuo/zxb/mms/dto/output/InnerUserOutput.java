package com.wangkuo.zxb.mms.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/5/6 0006.
 */
public class InnerUserOutput  implements Serializable {

    private Long id;
    private String allocCentre;
    private String region;
    private Integer merchantType;
    private String customerName;
    private Integer status;
    private Integer merchantStatus;
    private String inviteName;
    private Integer tYear;
    private Integer tMonth;
    private Integer curSendGoodTotalNum;
    private Float curSendGoodTotalNumChainRate;
    private BigDecimal curSendGoodFee;
    private Float curSendGoodFeeChainRate;
    private Integer curCarrierTotalNum;
    private Float curCarrierTotalNumChainRate;
    private Integer curStowageTotalNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAllocCentre() {
        return allocCentre;
    }

    public void setAllocCentre(String allocCentre) {
        this.allocCentre = allocCentre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
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

    public Integer getCurSendGoodTotalNum() {
        return curSendGoodTotalNum;
    }

    public void setCurSendGoodTotalNum(Integer curSendGoodTotalNum) {
        this.curSendGoodTotalNum = curSendGoodTotalNum;
    }

    public Float getCurSendGoodTotalNumChainRate() {
        return curSendGoodTotalNumChainRate;
    }

    public void setCurSendGoodTotalNumChainRate(Float curSendGoodTotalNumChainRate) {
        this.curSendGoodTotalNumChainRate = curSendGoodTotalNumChainRate;
    }

    public BigDecimal getCurSendGoodFee() {
        return curSendGoodFee;
    }

    public void setCurSendGoodFee(BigDecimal curSendGoodFee) {
        this.curSendGoodFee = curSendGoodFee;
    }

    public Float getCurSendGoodFeeChainRate() {
        return curSendGoodFeeChainRate;
    }

    public void setCurSendGoodFeeChainRate(Float curSendGoodFeeChainRate) {
        this.curSendGoodFeeChainRate = curSendGoodFeeChainRate;
    }

    public Integer getCurCarrierTotalNum() {
        return curCarrierTotalNum;
    }

    public void setCurCarrierTotalNum(Integer curCarrierTotalNum) {
        this.curCarrierTotalNum = curCarrierTotalNum;
    }

    public Float getCurCarrierTotalNumChainRate() {
        return curCarrierTotalNumChainRate;
    }

    public void setCurCarrierTotalNumChainRate(Float curCarrierTotalNumChainRate) {
        this.curCarrierTotalNumChainRate = curCarrierTotalNumChainRate;
    }

    public Integer getCurStowageTotalNum() {
        return curStowageTotalNum;
    }

    public void setCurStowageTotalNum(Integer curStowageTotalNum) {
        this.curStowageTotalNum = curStowageTotalNum;
    }
}
