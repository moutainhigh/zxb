package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by chaizf on 2016/4/7.
 */
public class CalculateFeeInput implements Serializable {
    private Long hCategoryId;
    private Long hAllocCenterId;
    private Long hReceiveProvinceId;
    private String hReceiveProvinceName;
    private Long hReceiveCityId;
    private String hReceiveCityName;
    private Long hReceiveCountryId;
    private String hReceiveCountryName;
    private String hReceiveAddress;
    private Float hWeight;
    private Float hVolume;
    private Integer hNum;
    private String hPack;
    private Integer hIsStandard;
    private Integer hConnectType;
    private Integer hBalanceTypeWithZb;
    private BigDecimal hDfyfFeeWithZb;
    private BigDecimal hPremiumFee;//保费
    private Integer hIsOpenTicket;
    private Integer hIsNeedEnterDepot;//是否进仓
    private Integer hDepotType;//仓库类型
    private Integer hIsElevator;//电梯
    private Integer hFloorNum;//楼层
    private Integer hIsNeedReceipt;//签回单
    private Integer hIsExpress;//加急
    private Integer hIsUpstairsIncre;//是否上楼
    private Integer hIsUnloadIncre;//是否卸货
    private BigDecimal hInsuredFee;//货物价值

    public Integer gethNum() {
        return hNum;
    }

    public void sethNum(Integer hNum) {
        this.hNum = hNum;
    }

    public Long gethCategoryId() {
        return hCategoryId;
    }

    public void sethCategoryId(Long hCategoryId) {
        this.hCategoryId = hCategoryId;
    }

    public Long gethAllocCenterId() {
        return hAllocCenterId;
    }

    public void sethAllocCenterId(Long hAllocCenterId) {
        this.hAllocCenterId = hAllocCenterId;
    }

    public Long gethReceiveProvinceId() {
        return hReceiveProvinceId;
    }

    public void sethReceiveProvinceId(Long hReceiveProvinceId) {
        this.hReceiveProvinceId = hReceiveProvinceId;
    }

    public String gethReceiveProvinceName() {
        return hReceiveProvinceName;
    }

    public void sethReceiveProvinceName(String hReceiveProvinceName) {
        this.hReceiveProvinceName = hReceiveProvinceName;
    }

    public String gethReceiveCityName() {
        return hReceiveCityName;
    }

    public void sethReceiveCityName(String hReceiveCityName) {
        this.hReceiveCityName = hReceiveCityName;
    }

    public String gethReceiveCountryName() {
        return hReceiveCountryName;
    }

    public void sethReceiveCountryName(String hReceiveCountryName) {
        this.hReceiveCountryName = hReceiveCountryName;
    }

    public String gethReceiveAddress() {
        return hReceiveAddress;
    }

    public void sethReceiveAddress(String hReceiveAddress) {
        this.hReceiveAddress = hReceiveAddress;
    }

    public Long gethReceiveCityId() {
        return hReceiveCityId;
    }

    public void sethReceiveCityId(Long hReceiveCityId) {
        this.hReceiveCityId = hReceiveCityId;
    }

    public Long gethReceiveCountryId() {
        return hReceiveCountryId;
    }

    public void sethReceiveCountryId(Long hReceiveCountryId) {
        this.hReceiveCountryId = hReceiveCountryId;
    }

    public Float gethWeight() {
        return hWeight;
    }

    public void sethWeight(Float hWeight) {
        this.hWeight = hWeight;
    }

    public Float gethVolume() {
        return hVolume;
    }

    public void sethVolume(Float hVolume) {
        this.hVolume = hVolume;
    }

    public Integer gethConnectType() {
        return hConnectType;
    }

    public void sethConnectType(Integer hConnectType) {
        this.hConnectType = hConnectType;
    }

    public Integer gethBalanceTypeWithZb() {
        return hBalanceTypeWithZb;
    }

    public void sethBalanceTypeWithZb(Integer hBalanceTypeWithZb) {
        this.hBalanceTypeWithZb = hBalanceTypeWithZb;
    }

    public BigDecimal gethDfyfFeeWithZb() {
        return hDfyfFeeWithZb;
    }

    public void sethDfyfFeeWithZb(BigDecimal hDfyfFeeWithZb) {
        this.hDfyfFeeWithZb = hDfyfFeeWithZb;
    }

    public BigDecimal gethPremiumFee() {
        return hPremiumFee;
    }

    public void sethPremiumFee(BigDecimal hPremiumFee) {
        this.hPremiumFee = hPremiumFee;
    }

    public String gethPack() {
        return hPack;
    }

    public void sethPack(String hPack) {
        this.hPack = hPack;
    }

    public Integer gethIsStandard() {
        return hIsStandard;
    }

    public void sethIsStandard(Integer hIsStandard) {
        this.hIsStandard = hIsStandard;
    }

    public Integer gethIsOpenTicket() {
        return hIsOpenTicket;
    }

    public void sethIsOpenTicket(Integer hIsOpenTicketFee) {
        this.hIsOpenTicket = hIsOpenTicketFee;
    }

    public Integer gethDepotType() {
        return hDepotType;
    }

    public void sethDepotType(Integer hDepotType) {
        this.hDepotType = hDepotType;
    }

    public Integer gethIsElevator() {
        return hIsElevator;
    }

    public void sethIsElevator(Integer hIsElevator) {
        this.hIsElevator = hIsElevator;
    }

    public Integer gethFloorNum() {
        return hFloorNum;
    }

    public void sethFloorNum(Integer hFloorNum) {
        this.hFloorNum = hFloorNum;
    }

    public Integer gethIsNeedReceipt() {
        return hIsNeedReceipt;
    }

    public void sethIsNeedReceipt(Integer hIsNeedReceipt) {
        this.hIsNeedReceipt = hIsNeedReceipt;
    }

    public Integer gethIsNeedEnterDepot() {
        return hIsNeedEnterDepot;
    }

    public void sethIsNeedEnterDepot(Integer hIsNeedEnterDepot) {
        this.hIsNeedEnterDepot = hIsNeedEnterDepot;
    }

    public Integer gethIsExpress() {
        return hIsExpress;
    }

    public void sethIsExpress(Integer hIsExpress) {
        this.hIsExpress = hIsExpress;
    }

    public Integer gethIsUpstairsIncre() {
        return hIsUpstairsIncre;
    }

    public void sethIsUpstairsIncre(Integer hIsUpstairsIncre) {
        this.hIsUpstairsIncre = hIsUpstairsIncre;
    }

    public Integer gethIsUnloadIncre() {
        return hIsUnloadIncre;
    }

    public void sethIsUnloadIncre(Integer hIsUnloadIncre) {
        this.hIsUnloadIncre = hIsUnloadIncre;
    }

    public BigDecimal gethInsuredFee() {
        return hInsuredFee;
    }

    public void sethInsuredFee(BigDecimal hInsuredFee) {
        this.hInsuredFee = hInsuredFee;
    }
}
