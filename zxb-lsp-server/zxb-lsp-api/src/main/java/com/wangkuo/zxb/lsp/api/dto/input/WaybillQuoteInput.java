package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sanshao on 16-4-18.
 */
public class WaybillQuoteInput  implements Serializable {

    private Long waybillId;

    private String systemSn;

    private String sn;

    private String shipperProvinceName;
    private String shipperCityName;
    private String shipperCountryName;
    private String shipperTownName;
    private String shipperAddress;
    private String receiveProvinceName;
    private String receiveCityName;
    private String receiveCountryName;
    private String receiveAddress;
    private String offerWeight;
    private String offerVolume;

    private BigDecimal freightFee;
    private BigDecimal sendGoodFee;
    private BigDecimal upstairsFee;
    private BigDecimal unloadFee;
    private BigDecimal enterFee;
    private BigDecimal signedReceiveFee;
    private BigDecimal premiumFee;
    private BigDecimal invoiceFee;
    private BigDecimal expressFee;
    private BigDecimal allFee;

    private Long createId;
    private String CreateName;
    private Date CreateTime;

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public String getSystemSn() {
        return systemSn;
    }

    public void setSystemSn(String systemSn) {
        this.systemSn = systemSn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getShipperProvinceName() {
        return shipperProvinceName;
    }

    public void setShipperProvinceName(String shipperProvinceName) {
        this.shipperProvinceName = shipperProvinceName;
    }

    public String getShipperCityName() {
        return shipperCityName;
    }

    public void setShipperCityName(String shipperCityName) {
        this.shipperCityName = shipperCityName;
    }

    public String getShipperCountryName() {
        return shipperCountryName;
    }

    public void setShipperCountryName(String shipperCountryName) {
        this.shipperCountryName = shipperCountryName;
    }

    public String getShipperTownName() {
        return shipperTownName;
    }

    public void setShipperTownName(String shipperTownName) {
        this.shipperTownName = shipperTownName;
    }

    public String getShipperAddress() {
        return shipperAddress;
    }

    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    public String getReceiveProvinceName() {
        return receiveProvinceName;
    }

    public void setReceiveProvinceName(String receiveProvinceName) {
        this.receiveProvinceName = receiveProvinceName;
    }

    public String getReceiveCityName() {
        return receiveCityName;
    }

    public void setReceiveCityName(String receiveCityName) {
        this.receiveCityName = receiveCityName;
    }

    public String getReceiveCountryName() {
        return receiveCountryName;
    }

    public void setReceiveCountryName(String receiveCountryName) {
        this.receiveCountryName = receiveCountryName;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getOfferWeight() {
        return offerWeight;
    }

    public void setOfferWeight(String offerWeight) {
        this.offerWeight = offerWeight;
    }

    public String getOfferVolume() {
        return offerVolume;
    }

    public void setOfferVolume(String offerVolume) {
        this.offerVolume = offerVolume;
    }

    public BigDecimal getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(BigDecimal freightFee) {
        this.freightFee = freightFee;
    }

    public BigDecimal getSendGoodFee() {
        return sendGoodFee;
    }

    public void setSendGoodFee(BigDecimal sendGoodFee) {
        this.sendGoodFee = sendGoodFee;
    }

    public BigDecimal getUpstairsFee() {
        return upstairsFee;
    }

    public void setUpstairsFee(BigDecimal upstairsFee) {
        this.upstairsFee = upstairsFee;
    }

    public BigDecimal getUnloadFee() {
        return unloadFee;
    }

    public void setUnloadFee(BigDecimal unloadFee) {
        this.unloadFee = unloadFee;
    }

    public BigDecimal getEnterFee() {
        return enterFee;
    }

    public void setEnterFee(BigDecimal enterFee) {
        this.enterFee = enterFee;
    }

    public BigDecimal getSignedReceiveFee() {
        return signedReceiveFee;
    }

    public void setSignedReceiveFee(BigDecimal signedReceiveFee) {
        this.signedReceiveFee = signedReceiveFee;
    }

    public BigDecimal getPremiumFee() {
        return premiumFee;
    }

    public void setPremiumFee(BigDecimal premiumFee) {
        this.premiumFee = premiumFee;
    }

    public BigDecimal getInvoiceFee() {
        return invoiceFee;
    }

    public void setInvoiceFee(BigDecimal invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    public BigDecimal getAllFee() {
        return allFee;
    }

    public void setAllFee(BigDecimal allFee) {
        this.allFee = allFee;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String createName) {
        CreateName = createName;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

}
