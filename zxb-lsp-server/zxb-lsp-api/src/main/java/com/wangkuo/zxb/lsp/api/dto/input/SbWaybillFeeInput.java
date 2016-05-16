package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2016/4/12.
 */
public class SbWaybillFeeInput implements Serializable {
    private Long waybillId;

    private BigDecimal insuredFee;

    private BigDecimal premiumFee;

    private BigDecimal activePremiumFee;

    private BigDecimal freightFee;

    private BigDecimal businessFee;

    private BigDecimal allFee;

    private Integer freightFeeStatus;

    private Long freightFeeVerifiUserId;

    private String freightFeeVerifiUserName;

    private Date freightFeeVerifiTime;

    private Integer freightFeeOverStatus;

    private Date freightFeeOverTime;

    private Long freightFeeOverUserId;

    private String freightFeeOverUserName;

    private Integer businessFeeStatus;

    private Long businessFeeVerifiUserId;

    private String businessFeeVerifiUserName;

    private Date businessFeeVerifiTime;

    private Long businessPaymentUserId;

    private String businessPaymentUserName;

    private Date businessPaymentUserTime;

    private Integer businessFeeOverStatus;

    private Date businessFeeOverTime;

    private Long businessFeeOverUserId;

    private String businessFeeOverUserName;

    private BigDecimal xfyfFee;

    private BigDecimal dfyfFee;

    private BigDecimal xfyfFeeWithZb;

    private BigDecimal dfyfFeeWithZb;

    private BigDecimal checkoutedBusinessFee;

    private BigDecimal invoiceFee;

    private BigDecimal onlinePayFee;

    private BigDecimal receiveTimeoutPayFee;

    private BigDecimal waybillTimeoutPayFee;

    private BigDecimal sitePayToZbLateFee;

    private BigDecimal zbPayToSiteLateFee;

    private Integer zbReceiptVerifyStatus;

    private Long zbReceiptVerifyUserId;

    private String zbReceiptVerifyUserName;

    private Date zbReceiptVerifyTime;

    private Date zbReceiveTime;

    private Date zbPaymentTime;

    private Integer zbWithSiteBalanceStatus;

    private Long zbWithSiteBalanceUserId;

    private String zbWithSiteBalanceUserName;

    private Date zbWithSiteBalanceTime;

    private Integer lateFeeStatus;

    private Long lateFeeVerifyUserId;

    private String lateFeeVerifyUserName;

    private Date lateFeeVerifyTime;

    private Float premiumRateWithZb;

    private Integer zbWithSiteMonthBalanceStatus;

    private Long zbWithSiteMonthBalanceUserId;

    private String zbWithSiteMonthBalanceUserName;

    private Date zbWithSiteMonthBalanceTime;

    private Integer receiveTimeoutBalanceStatus;

    private Long receiveTimeoutBalanceUserId;

    private String receiveTimeoutBalanceUserName;

    private Date receiveTimeoutBalanceTime;

    private Integer damagerFeeBalanceStatus;

    private Long damagerFeeBalanceUserId;

    private String damagerFeeBalanceUserName;

    private Date damagerFeeBalanceTime;

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public BigDecimal getInsuredFee() {
        return insuredFee;
    }

    public void setInsuredFee(BigDecimal insuredFee) {
        this.insuredFee = insuredFee;
    }

    public BigDecimal getPremiumFee() {
        return premiumFee;
    }

    public void setPremiumFee(BigDecimal premiumFee) {
        this.premiumFee = premiumFee;
    }

    public BigDecimal getActivePremiumFee() {
        return activePremiumFee;
    }

    public void setActivePremiumFee(BigDecimal activePremiumFee) {
        this.activePremiumFee = activePremiumFee;
    }

    public BigDecimal getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(BigDecimal freightFee) {
        this.freightFee = freightFee;
    }

    public BigDecimal getBusinessFee() {
        return businessFee;
    }

    public void setBusinessFee(BigDecimal businessFee) {
        this.businessFee = businessFee;
    }

    public BigDecimal getAllFee() {
        return allFee;
    }

    public void setAllFee(BigDecimal allFee) {
        this.allFee = allFee;
    }

    public Integer getFreightFeeStatus() {
        return freightFeeStatus;
    }

    public void setFreightFeeStatus(Integer freightFeeStatus) {
        this.freightFeeStatus = freightFeeStatus;
    }

    public Long getFreightFeeVerifiUserId() {
        return freightFeeVerifiUserId;
    }

    public void setFreightFeeVerifiUserId(Long freightFeeVerifiUserId) {
        this.freightFeeVerifiUserId = freightFeeVerifiUserId;
    }

    public String getFreightFeeVerifiUserName() {
        return freightFeeVerifiUserName;
    }

    public void setFreightFeeVerifiUserName(String freightFeeVerifiUserName) {
        this.freightFeeVerifiUserName = freightFeeVerifiUserName;
    }

    public Date getFreightFeeVerifiTime() {
        return freightFeeVerifiTime;
    }

    public void setFreightFeeVerifiTime(Date freightFeeVerifiTime) {
        this.freightFeeVerifiTime = freightFeeVerifiTime;
    }

    public Integer getFreightFeeOverStatus() {
        return freightFeeOverStatus;
    }

    public void setFreightFeeOverStatus(Integer freightFeeOverStatus) {
        this.freightFeeOverStatus = freightFeeOverStatus;
    }

    public Date getFreightFeeOverTime() {
        return freightFeeOverTime;
    }

    public void setFreightFeeOverTime(Date freightFeeOverTime) {
        this.freightFeeOverTime = freightFeeOverTime;
    }

    public Long getFreightFeeOverUserId() {
        return freightFeeOverUserId;
    }

    public void setFreightFeeOverUserId(Long freightFeeOverUserId) {
        this.freightFeeOverUserId = freightFeeOverUserId;
    }

    public String getFreightFeeOverUserName() {
        return freightFeeOverUserName;
    }

    public void setFreightFeeOverUserName(String freightFeeOverUserName) {
        this.freightFeeOverUserName = freightFeeOverUserName;
    }

    public Integer getBusinessFeeStatus() {
        return businessFeeStatus;
    }

    public void setBusinessFeeStatus(Integer businessFeeStatus) {
        this.businessFeeStatus = businessFeeStatus;
    }

    public Long getBusinessFeeVerifiUserId() {
        return businessFeeVerifiUserId;
    }

    public void setBusinessFeeVerifiUserId(Long businessFeeVerifiUserId) {
        this.businessFeeVerifiUserId = businessFeeVerifiUserId;
    }

    public String getBusinessFeeVerifiUserName() {
        return businessFeeVerifiUserName;
    }

    public void setBusinessFeeVerifiUserName(String businessFeeVerifiUserName) {
        this.businessFeeVerifiUserName = businessFeeVerifiUserName;
    }

    public Date getBusinessFeeVerifiTime() {
        return businessFeeVerifiTime;
    }

    public void setBusinessFeeVerifiTime(Date businessFeeVerifiTime) {
        this.businessFeeVerifiTime = businessFeeVerifiTime;
    }

    public Long getBusinessPaymentUserId() {
        return businessPaymentUserId;
    }

    public void setBusinessPaymentUserId(Long businessPaymentUserId) {
        this.businessPaymentUserId = businessPaymentUserId;
    }

    public String getBusinessPaymentUserName() {
        return businessPaymentUserName;
    }

    public void setBusinessPaymentUserName(String businessPaymentUserName) {
        this.businessPaymentUserName = businessPaymentUserName;
    }

    public Date getBusinessPaymentUserTime() {
        return businessPaymentUserTime;
    }

    public void setBusinessPaymentUserTime(Date businessPaymentUserTime) {
        this.businessPaymentUserTime = businessPaymentUserTime;
    }

    public Integer getBusinessFeeOverStatus() {
        return businessFeeOverStatus;
    }

    public void setBusinessFeeOverStatus(Integer businessFeeOverStatus) {
        this.businessFeeOverStatus = businessFeeOverStatus;
    }

    public Date getBusinessFeeOverTime() {
        return businessFeeOverTime;
    }

    public void setBusinessFeeOverTime(Date businessFeeOverTime) {
        this.businessFeeOverTime = businessFeeOverTime;
    }

    public Long getBusinessFeeOverUserId() {
        return businessFeeOverUserId;
    }

    public void setBusinessFeeOverUserId(Long businessFeeOverUserId) {
        this.businessFeeOverUserId = businessFeeOverUserId;
    }

    public String getBusinessFeeOverUserName() {
        return businessFeeOverUserName;
    }

    public void setBusinessFeeOverUserName(String businessFeeOverUserName) {
        this.businessFeeOverUserName = businessFeeOverUserName;
    }

    public BigDecimal getXfyfFee() {
        return xfyfFee;
    }

    public void setXfyfFee(BigDecimal xfyfFee) {
        this.xfyfFee = xfyfFee;
    }

    public BigDecimal getDfyfFee() {
        return dfyfFee;
    }

    public void setDfyfFee(BigDecimal dfyfFee) {
        this.dfyfFee = dfyfFee;
    }

    public BigDecimal getXfyfFeeWithZb() {
        return xfyfFeeWithZb;
    }

    public void setXfyfFeeWithZb(BigDecimal xfyfFeeWithZb) {
        this.xfyfFeeWithZb = xfyfFeeWithZb;
    }

    public BigDecimal getDfyfFeeWithZb() {
        return dfyfFeeWithZb;
    }

    public void setDfyfFeeWithZb(BigDecimal dfyfFeeWithZb) {
        this.dfyfFeeWithZb = dfyfFeeWithZb;
    }

    public BigDecimal getCheckoutedBusinessFee() {
        return checkoutedBusinessFee;
    }

    public void setCheckoutedBusinessFee(BigDecimal checkoutedBusinessFee) {
        this.checkoutedBusinessFee = checkoutedBusinessFee;
    }

    public BigDecimal getInvoiceFee() {
        return invoiceFee;
    }

    public void setInvoiceFee(BigDecimal invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    public BigDecimal getOnlinePayFee() {
        return onlinePayFee;
    }

    public void setOnlinePayFee(BigDecimal onlinePayFee) {
        this.onlinePayFee = onlinePayFee;
    }

    public BigDecimal getReceiveTimeoutPayFee() {
        return receiveTimeoutPayFee;
    }

    public void setReceiveTimeoutPayFee(BigDecimal receiveTimeoutPayFee) {
        this.receiveTimeoutPayFee = receiveTimeoutPayFee;
    }

    public BigDecimal getWaybillTimeoutPayFee() {
        return waybillTimeoutPayFee;
    }

    public void setWaybillTimeoutPayFee(BigDecimal waybillTimeoutPayFee) {
        this.waybillTimeoutPayFee = waybillTimeoutPayFee;
    }

    public BigDecimal getSitePayToZbLateFee() {
        return sitePayToZbLateFee;
    }

    public void setSitePayToZbLateFee(BigDecimal sitePayToZbLateFee) {
        this.sitePayToZbLateFee = sitePayToZbLateFee;
    }

    public BigDecimal getZbPayToSiteLateFee() {
        return zbPayToSiteLateFee;
    }

    public void setZbPayToSiteLateFee(BigDecimal zbPayToSiteLateFee) {
        this.zbPayToSiteLateFee = zbPayToSiteLateFee;
    }

    public Integer getZbReceiptVerifyStatus() {
        return zbReceiptVerifyStatus;
    }

    public void setZbReceiptVerifyStatus(Integer zbReceiptVerifyStatus) {
        this.zbReceiptVerifyStatus = zbReceiptVerifyStatus;
    }

    public Long getZbReceiptVerifyUserId() {
        return zbReceiptVerifyUserId;
    }

    public void setZbReceiptVerifyUserId(Long zbReceiptVerifyUserId) {
        this.zbReceiptVerifyUserId = zbReceiptVerifyUserId;
    }

    public String getZbReceiptVerifyUserName() {
        return zbReceiptVerifyUserName;
    }

    public void setZbReceiptVerifyUserName(String zbReceiptVerifyUserName) {
        this.zbReceiptVerifyUserName = zbReceiptVerifyUserName;
    }

    public Date getZbReceiptVerifyTime() {
        return zbReceiptVerifyTime;
    }

    public void setZbReceiptVerifyTime(Date zbReceiptVerifyTime) {
        this.zbReceiptVerifyTime = zbReceiptVerifyTime;
    }

    public Date getZbReceiveTime() {
        return zbReceiveTime;
    }

    public void setZbReceiveTime(Date zbReceiveTime) {
        this.zbReceiveTime = zbReceiveTime;
    }

    public Date getZbPaymentTime() {
        return zbPaymentTime;
    }

    public void setZbPaymentTime(Date zbPaymentTime) {
        this.zbPaymentTime = zbPaymentTime;
    }

    public Integer getZbWithSiteBalanceStatus() {
        return zbWithSiteBalanceStatus;
    }

    public void setZbWithSiteBalanceStatus(Integer zbWithSiteBalanceStatus) {
        this.zbWithSiteBalanceStatus = zbWithSiteBalanceStatus;
    }

    public Long getZbWithSiteBalanceUserId() {
        return zbWithSiteBalanceUserId;
    }

    public void setZbWithSiteBalanceUserId(Long zbWithSiteBalanceUserId) {
        this.zbWithSiteBalanceUserId = zbWithSiteBalanceUserId;
    }

    public String getZbWithSiteBalanceUserName() {
        return zbWithSiteBalanceUserName;
    }

    public void setZbWithSiteBalanceUserName(String zbWithSiteBalanceUserName) {
        this.zbWithSiteBalanceUserName = zbWithSiteBalanceUserName;
    }

    public Date getZbWithSiteBalanceTime() {
        return zbWithSiteBalanceTime;
    }

    public void setZbWithSiteBalanceTime(Date zbWithSiteBalanceTime) {
        this.zbWithSiteBalanceTime = zbWithSiteBalanceTime;
    }

    public Integer getLateFeeStatus() {
        return lateFeeStatus;
    }

    public void setLateFeeStatus(Integer lateFeeStatus) {
        this.lateFeeStatus = lateFeeStatus;
    }

    public Long getLateFeeVerifyUserId() {
        return lateFeeVerifyUserId;
    }

    public void setLateFeeVerifyUserId(Long lateFeeVerifyUserId) {
        this.lateFeeVerifyUserId = lateFeeVerifyUserId;
    }

    public String getLateFeeVerifyUserName() {
        return lateFeeVerifyUserName;
    }

    public void setLateFeeVerifyUserName(String lateFeeVerifyUserName) {
        this.lateFeeVerifyUserName = lateFeeVerifyUserName;
    }

    public Date getLateFeeVerifyTime() {
        return lateFeeVerifyTime;
    }

    public void setLateFeeVerifyTime(Date lateFeeVerifyTime) {
        this.lateFeeVerifyTime = lateFeeVerifyTime;
    }

    public Float getPremiumRateWithZb() {
        return premiumRateWithZb;
    }

    public void setPremiumRateWithZb(Float premiumRateWithZb) {
        this.premiumRateWithZb = premiumRateWithZb;
    }

    public Integer getZbWithSiteMonthBalanceStatus() {
        return zbWithSiteMonthBalanceStatus;
    }

    public void setZbWithSiteMonthBalanceStatus(Integer zbWithSiteMonthBalanceStatus) {
        this.zbWithSiteMonthBalanceStatus = zbWithSiteMonthBalanceStatus;
    }

    public Long getZbWithSiteMonthBalanceUserId() {
        return zbWithSiteMonthBalanceUserId;
    }

    public void setZbWithSiteMonthBalanceUserId(Long zbWithSiteMonthBalanceUserId) {
        this.zbWithSiteMonthBalanceUserId = zbWithSiteMonthBalanceUserId;
    }

    public String getZbWithSiteMonthBalanceUserName() {
        return zbWithSiteMonthBalanceUserName;
    }

    public void setZbWithSiteMonthBalanceUserName(String zbWithSiteMonthBalanceUserName) {
        this.zbWithSiteMonthBalanceUserName = zbWithSiteMonthBalanceUserName;
    }

    public Date getZbWithSiteMonthBalanceTime() {
        return zbWithSiteMonthBalanceTime;
    }

    public void setZbWithSiteMonthBalanceTime(Date zbWithSiteMonthBalanceTime) {
        this.zbWithSiteMonthBalanceTime = zbWithSiteMonthBalanceTime;
    }

    public Integer getReceiveTimeoutBalanceStatus() {
        return receiveTimeoutBalanceStatus;
    }

    public void setReceiveTimeoutBalanceStatus(Integer receiveTimeoutBalanceStatus) {
        this.receiveTimeoutBalanceStatus = receiveTimeoutBalanceStatus;
    }

    public Long getReceiveTimeoutBalanceUserId() {
        return receiveTimeoutBalanceUserId;
    }

    public void setReceiveTimeoutBalanceUserId(Long receiveTimeoutBalanceUserId) {
        this.receiveTimeoutBalanceUserId = receiveTimeoutBalanceUserId;
    }

    public String getReceiveTimeoutBalanceUserName() {
        return receiveTimeoutBalanceUserName;
    }

    public void setReceiveTimeoutBalanceUserName(String receiveTimeoutBalanceUserName) {
        this.receiveTimeoutBalanceUserName = receiveTimeoutBalanceUserName;
    }

    public Date getReceiveTimeoutBalanceTime() {
        return receiveTimeoutBalanceTime;
    }

    public void setReceiveTimeoutBalanceTime(Date receiveTimeoutBalanceTime) {
        this.receiveTimeoutBalanceTime = receiveTimeoutBalanceTime;
    }

    public Integer getDamagerFeeBalanceStatus() {
        return damagerFeeBalanceStatus;
    }

    public void setDamagerFeeBalanceStatus(Integer damagerFeeBalanceStatus) {
        this.damagerFeeBalanceStatus = damagerFeeBalanceStatus;
    }

    public Long getDamagerFeeBalanceUserId() {
        return damagerFeeBalanceUserId;
    }

    public void setDamagerFeeBalanceUserId(Long damagerFeeBalanceUserId) {
        this.damagerFeeBalanceUserId = damagerFeeBalanceUserId;
    }

    public String getDamagerFeeBalanceUserName() {
        return damagerFeeBalanceUserName;
    }

    public void setDamagerFeeBalanceUserName(String damagerFeeBalanceUserName) {
        this.damagerFeeBalanceUserName = damagerFeeBalanceUserName;
    }

    public Date getDamagerFeeBalanceTime() {
        return damagerFeeBalanceTime;
    }

    public void setDamagerFeeBalanceTime(Date damagerFeeBalanceTime) {
        this.damagerFeeBalanceTime = damagerFeeBalanceTime;
    }
}
