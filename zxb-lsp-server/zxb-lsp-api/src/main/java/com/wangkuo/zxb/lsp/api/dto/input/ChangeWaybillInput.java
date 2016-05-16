package com.wangkuo.zxb.lsp.api.dto.input;

import com.wangkuo.zxb.lsp.api.service.ChangeProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mark on 16/4/7.
 */
public class ChangeWaybillInput implements Serializable {//waybill//waybill_good//waybill_fee//fb_allot_waybill//sb_waybill_depot
    private Long id;//waybill

    private String systemSn;//waybill

    private String sn;//waybill


    @ChangeProperty(name="货物名称",from="waybill_good")
    private String goodName;//waybill_good

    @ChangeProperty(name="goodCategoryId",from="waybill_good")
    private Long goodCategoryId;//waybill_good

    @ChangeProperty(name="品类",from="waybill_good")
    private String goodCategoryName;//waybill_good

    @ChangeProperty(name="货物性质")
    private Integer goodType;

    @ChangeProperty(name="件数",from="waybill_good")
    private Integer num;//waybill_good

    @ChangeProperty(name="重量",from="waybill_good")
    private Float offerWeight;//waybill_good

    @ChangeProperty(name="体积",from="waybill_good")
    private Float offerVolume;//waybill_good

    @ChangeProperty(name="包装",from="waybill_good")
    private String pack;//waybill_good

    @ChangeProperty(name="是否标准件",from="waybill",key = {"null","0","1"},value = {"否","否","是"})
    private Integer isStandard;//waybill

    @ChangeProperty(name="送货方式",from="waybill",key = {"0","1"},value = {"到站自提","送货上门"})
    private Integer connectType;//waybill

    @ChangeProperty(name="其他送货方式声明",from="waybill")
    private String otherConnectType;//waybill

    @ChangeProperty(name="卸货方式",from="waybill",key = {"0","1","2"},value = {"人工搬运","吊车作业","叉车作业"})
    private Integer loadUnloadType;//waybill

    @ChangeProperty(name="堆放要求",from="waybill")
    private String stackRequire;//waybill


    @ChangeProperty(name="货物价值",from="waybill_fee")
    private BigDecimal insuredFee;//waybill_fee

    @ChangeProperty(name="支付方式",from="waybill",key = {"null","0","1"},value = {"现付","现付","到付"})
    private Integer balanceTypeWithZb;//waybill

    @ChangeProperty(name="注意事项",from="waybill")
    private String memo;//waybill

    @ChangeProperty(name="发货公司名称",from="waybill")
    private String shipperCustomerName;//waybill

    @ChangeProperty(name="shipperProvinceId",from="waybill")
    private Long shipperProvinceId;//waybill

    @ChangeProperty(name="发货省",from="waybill")
    private String shipperProvinceName;//waybill

    @ChangeProperty(name="shipperCityId",from="waybill")
    private Long shipperCityId;//waybill

    @ChangeProperty(name="发货市",from="waybill")
    private String shipperCityName;//waybill

    @ChangeProperty(name="shipperCountryId",from="waybill")
    private Long shipperCountryId;//waybill

    @ChangeProperty(name="发货区",from="waybill")
    private String shipperCountryName;//waybill

    @ChangeProperty(name="发货详细地址",from="waybill")
    private String shipperAddress;//waybill

    @ChangeProperty(name="发货人",from="waybill")
    private String shipperLinkName;//waybill

    @ChangeProperty(name="发货人座机",from="waybill")
    private String shipperLinkPhone;//waybill

    @ChangeProperty(name="发货人手机",from="waybill")
    private String shipperLinkMobile;//waybill


    @ChangeProperty(name="收货公司名称",from="waybill")
    private String receiveName;//waybill

    @ChangeProperty(name="receiveProvinceId",from="waybill")
    private Long receiveProvinceId;//waybill

    @ChangeProperty(name="收货省",from="waybill")
    private String receiveProvinceName;//waybill

    @ChangeProperty(name="receiveCityId",from="waybill")
    private Long receiveCityId;//waybill

    @ChangeProperty(name="收货市",from="waybill")
    private String receiveCityName;//waybill

    @ChangeProperty(name="receiveCountryId",from="waybill")
    private Long receiveCountryId;//waybill

    @ChangeProperty(name="收货区",from="waybill")
    private String receiveCountryName;//waybill

    @ChangeProperty(name="收货详细地址",from="waybill")
    private String receiveAddress;//waybill

    @ChangeProperty(name="收货人",from="waybill")
    private String receiveLinkName;//waybill

    @ChangeProperty(name="收货人座机",from="waybill")
    private String receiveLinkPhone;//waybill

    @ChangeProperty(name="收货人手机",from="waybill")
    private String receiveLinkMobile;//waybill


    @ChangeProperty(name="是否进仓",from="waybill",key = {"null","0","1"},value = {"否","否","是"})
    private Integer isNeedEnterDepot;//waybill

    @ChangeProperty(name="进仓费",from="allot_waybill",isLeadToVerify = true,needPersistent = true)
    private BigDecimal enterFee;//fb_allot_waybill

    @ChangeProperty(name="进仓类型",from="waybill_depot")
    private Integer type;//sb_waybill_depot

    @ChangeProperty(name="是否上楼",from="waybill",key = {"null","0","1"},value = {"否","否","是"})
    private Integer isUpstairsIncre;//waybill

    @ChangeProperty(name="上楼费",from="allot_waybill",isLeadToVerify = true,needPersistent = true)
    private BigDecimal upstairsFee;//fb_allot_waybill

    @ChangeProperty(name="有无电梯",from="waybill",key = {"null","0","1"},value = {"无","无","有"})
    private Integer isElevator;//waybill

    @ChangeProperty(name="上楼层数",from="waybill")
    private Integer floorNum;//waybill

    @ChangeProperty(name="是否卸货",from="waybill",key = {"null","0","1"},value = {"否","否","是"})
    private Integer isUnloadIncre;//waybill

    @ChangeProperty(name="卸货费",from="allot_waybill",isLeadToVerify = true,needPersistent = true)
    private BigDecimal unloadFee;//fb_allot_waybill

    @ChangeProperty(name="是否签收短信通知",from="waybill",key = {"null","0","1"},value = {"否","否","是"})
    private Integer isReceiveSendSms;//waybill

    @ChangeProperty(name="是否签回单",from="waybill",key = {"null","0","1"},value = {"否","否","是"})
    private Integer isNeedReceipt;//waybill

    @ChangeProperty(name="签回单费",from="allot_waybill",isLeadToVerify = true,needPersistent = true)
    private BigDecimal signedReceiveFee;//fb_allot_waybill

    @ChangeProperty(name="是否加急",from="waybill",key = {"null","0","1"},value = {"否","否","是"})
    private Integer isExpress;//waybill

    @ChangeProperty(name="加急费",from="allot_waybill",isLeadToVerify = true,needPersistent = true)
    private BigDecimal expressFee;//fb_allot_waybill

    @ChangeProperty(name="运费",from="waybill_fee",isLeadToVerify = true,needPersistent = true)
    private BigDecimal freightFee;//waybill_fee

    @ChangeProperty(name="送货费",from="allot_waybill",isLeadToVerify = true,needPersistent = true)
    private BigDecimal sendGoodFee;//fb_allot_waybill

    @ChangeProperty(name="保费",from="waybill_fee",isLeadToVerify = true,needPersistent = true)
    private BigDecimal premiumFee;//waybill_fee

    @ChangeProperty(name="开票费",from="waybill_fee",isLeadToVerify = true,needPersistent = true)
    private BigDecimal invoiceFee;//waybill_fee

    @ChangeProperty(name="增值费")
    private BigDecimal allVasFee;//增值服务费用总计

    @ChangeProperty(name="费用总计",from="waybill_fee",isLeadToVerify = true,needPersistent = true)
    private BigDecimal allFee;//waybill_fee

    @ChangeProperty(name="应收差价")
    private BigDecimal difFee;

    @ChangeProperty(name="现付费用",from="waybill_fee",isLeadToVerify = true,needPersistent = true)
    private BigDecimal xfyfFeeWithZb;//waybill_fee

    @ChangeProperty(name="到付费用",from="waybill_fee",isLeadToVerify = true,needPersistent = true)
    private BigDecimal dfyfFeeWithZb;//waybill_fee


    @ChangeProperty(name="是否开发票",from="waybill",key = {"null","0","1"},value = {"否","否","是"})
    private Integer isOpenTicket;//waybill

    @ChangeProperty(name="发票抬头",from="waybill_invoice")
    private String companyName;//waybill_invoice

    @ChangeProperty(name="收票人",from="waybill_invoice")
    private String consigneeName;

    @ChangeProperty(name="手机",from="waybill_invoice")
    private String consigneeMobile;

    @ChangeProperty(name="详细地址",from="waybill_invoice")
    private String consigneeAddress;

    @ChangeProperty(name="收票省",from="waybill_invoice")
    private String consigneeProvince;

    @ChangeProperty(name="consigneeProvinceId",from="waybill_invoice")
    private Long consigneeProvinceId;

    @ChangeProperty(name="收票市",from="waybill_invoice")
    private String consigneeCity;

    @ChangeProperty(name="consigneeCityId",from="waybill_invoice")
    private Long consigneeCityId;

    @ChangeProperty(name="收票区",from="waybill_invoice")
    private String consigneeCounty;

    @ChangeProperty(name="consigneeCountyId",from="waybill_invoice")
    private Long consigneeCountyId;

    private BigDecimal changeWaybillFee;

    private Long createId;
    private String CreateName;
    private Date CreateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Long getGoodCategoryId() {
        return goodCategoryId;
    }

    public void setGoodCategoryId(Long goodCategoryId) {
        this.goodCategoryId = goodCategoryId;
    }

    public String getGoodCategoryName() {
        return goodCategoryName;
    }

    public void setGoodCategoryName(String goodCategoryName) {
        this.goodCategoryName = goodCategoryName;
    }

    public Integer getGoodType() {
        return goodType;
    }

    public void setGoodType(Integer goodType) {
        this.goodType = goodType;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getOfferWeight() {
        return offerWeight;
    }

    public void setOfferWeight(Float offerWeight) {
        this.offerWeight = offerWeight;
    }

    public Float getOfferVolume() {
        return offerVolume;
    }

    public void setOfferVolume(Float offerVolume) {
        this.offerVolume = offerVolume;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public Integer getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(Integer isStandard) {
        this.isStandard = isStandard;
    }

    public Integer getConnectType() {
        return connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public String getOtherConnectType() {
        return otherConnectType;
    }

    public void setOtherConnectType(String otherConnectType) {
        this.otherConnectType = otherConnectType;
    }

    public Integer getLoadUnloadType() {
        return loadUnloadType;
    }

    public void setLoadUnloadType(Integer loadUnloadType) {
        this.loadUnloadType = loadUnloadType;
    }

    public String getStackRequire() {
        return stackRequire;
    }

    public void setStackRequire(String stackRequire) {
        this.stackRequire = stackRequire;
    }

    public BigDecimal getInsuredFee() {
        return insuredFee;
    }

    public void setInsuredFee(BigDecimal insuredFee) {
        this.insuredFee = insuredFee;
    }

    public Integer getBalanceTypeWithZb() {
        return balanceTypeWithZb;
    }

    public void setBalanceTypeWithZb(Integer balanceTypeWithZb) {
        this.balanceTypeWithZb = balanceTypeWithZb;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getShipperCustomerName() {
        return shipperCustomerName;
    }

    public void setShipperCustomerName(String shipperCustomerName) {
        this.shipperCustomerName = shipperCustomerName;
    }

    public Long getShipperProvinceId() {
        return shipperProvinceId;
    }

    public void setShipperProvinceId(Long shipperProvinceId) {
        this.shipperProvinceId = shipperProvinceId;
    }

    public String getShipperProvinceName() {
        return shipperProvinceName;
    }

    public void setShipperProvinceName(String shipperProvinceName) {
        this.shipperProvinceName = shipperProvinceName;
    }

    public Long getShipperCityId() {
        return shipperCityId;
    }

    public void setShipperCityId(Long shipperCityId) {
        this.shipperCityId = shipperCityId;
    }

    public String getShipperCityName() {
        return shipperCityName;
    }

    public void setShipperCityName(String shipperCityName) {
        this.shipperCityName = shipperCityName;
    }

    public Long getShipperCountryId() {
        return shipperCountryId;
    }

    public void setShipperCountryId(Long shipperCountryId) {
        this.shipperCountryId = shipperCountryId;
    }

    public String getShipperCountryName() {
        return shipperCountryName;
    }

    public void setShipperCountryName(String shipperCountryName) {
        this.shipperCountryName = shipperCountryName;
    }

    public String getShipperAddress() {
        return shipperAddress;
    }

    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    public String getShipperLinkName() {
        return shipperLinkName;
    }

    public void setShipperLinkName(String shipperLinkName) {
        this.shipperLinkName = shipperLinkName;
    }

    public String getShipperLinkPhone() {
        return shipperLinkPhone;
    }

    public void setShipperLinkPhone(String shipperLinkPhone) {
        this.shipperLinkPhone = shipperLinkPhone;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public Long getReceiveProvinceId() {
        return receiveProvinceId;
    }

    public void setReceiveProvinceId(Long receiveProvinceId) {
        this.receiveProvinceId = receiveProvinceId;
    }

    public String getReceiveProvinceName() {
        return receiveProvinceName;
    }

    public void setReceiveProvinceName(String receiveProvinceName) {
        this.receiveProvinceName = receiveProvinceName;
    }

    public Long getReceiveCityId() {
        return receiveCityId;
    }

    public void setReceiveCityId(Long receiveCityId) {
        this.receiveCityId = receiveCityId;
    }

    public String getReceiveCityName() {
        return receiveCityName;
    }

    public void setReceiveCityName(String receiveCityName) {
        this.receiveCityName = receiveCityName;
    }

    public Long getReceiveCountryId() {
        return receiveCountryId;
    }

    public void setReceiveCountryId(Long receiveCountryId) {
        this.receiveCountryId = receiveCountryId;
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

    public String getReceiveLinkName() {
        return receiveLinkName;
    }

    public void setReceiveLinkName(String receiveLinkName) {
        this.receiveLinkName = receiveLinkName;
    }

    public String getReceiveLinkPhone() {
        return receiveLinkPhone;
    }

    public void setReceiveLinkPhone(String receiveLinkPhone) {
        this.receiveLinkPhone = receiveLinkPhone;
    }

    public Integer getIsNeedEnterDepot() {
        return isNeedEnterDepot;
    }

    public void setIsNeedEnterDepot(Integer isNeedEnterDepot) {
        this.isNeedEnterDepot = isNeedEnterDepot;
    }

    public BigDecimal getEnterFee() {
        return enterFee;
    }

    public void setEnterFee(BigDecimal enterFee) {
        this.enterFee = enterFee;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsUpstairsIncre() {
        return isUpstairsIncre;
    }

    public void setIsUpstairsIncre(Integer isUpstairsIncre) {
        this.isUpstairsIncre = isUpstairsIncre;
    }

    public BigDecimal getUpstairsFee() {
        return upstairsFee;
    }

    public void setUpstairsFee(BigDecimal upstairsFee) {
        this.upstairsFee = upstairsFee;
    }

    public Integer getIsElevator() {
        return isElevator;
    }

    public void setIsElevator(Integer isElevator) {
        this.isElevator = isElevator;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    public Integer getIsUnloadIncre() {
        return isUnloadIncre;
    }

    public void setIsUnloadIncre(Integer isUnloadIncre) {
        this.isUnloadIncre = isUnloadIncre;
    }

    public BigDecimal getUnloadFee() {
        return unloadFee;
    }

    public void setUnloadFee(BigDecimal unloadFee) {
        this.unloadFee = unloadFee;
    }

    public Integer getIsReceiveSendSms() {
        return isReceiveSendSms;
    }

    public void setIsReceiveSendSms(Integer isReceiveSendSms) {
        this.isReceiveSendSms = isReceiveSendSms;
    }

    public Integer getIsNeedReceipt() {
        return isNeedReceipt;
    }

    public void setIsNeedReceipt(Integer isNeedReceipt) {
        this.isNeedReceipt = isNeedReceipt;
    }

    public BigDecimal getSignedReceiveFee() {
        return signedReceiveFee;
    }

    public void setSignedReceiveFee(BigDecimal signedReceiveFee) {
        this.signedReceiveFee = signedReceiveFee;
    }

    public Integer getIsExpress() {
        return isExpress;
    }

    public void setIsExpress(Integer isExpress) {
        this.isExpress = isExpress;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
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

    public BigDecimal getAllVasFee() {
        return allVasFee;
    }

    public void setAllVasFee(BigDecimal allVasFee) {
        this.allVasFee = allVasFee;
    }

    public BigDecimal getAllFee() {
        return allFee;
    }

    public void setAllFee(BigDecimal allFee) {
        this.allFee = allFee;
    }

    public BigDecimal getDifFee() {
        return difFee;
    }

    public void setDifFee(BigDecimal difFee) {
        this.difFee = difFee;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince;
    }

    public Long getConsigneeProvinceId() {
        return consigneeProvinceId;
    }

    public void setConsigneeProvinceId(Long consigneeProvinceId) {
        this.consigneeProvinceId = consigneeProvinceId;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public Long getConsigneeCityId() {
        return consigneeCityId;
    }

    public void setConsigneeCityId(Long consigneeCityId) {
        this.consigneeCityId = consigneeCityId;
    }

    public String getConsigneeCounty() {
        return consigneeCounty;
    }

    public void setConsigneeCounty(String consigneeCounty) {
        this.consigneeCounty = consigneeCounty;
    }

    public Long getConsigneeCountyId() {
        return consigneeCountyId;
    }

    public void setConsigneeCountyId(Long consigneeCountyId) {
        this.consigneeCountyId = consigneeCountyId;
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

    public String getShipperLinkMobile() {
        return shipperLinkMobile;
    }

    public void setShipperLinkMobile(String shipperLinkMobile) {
        this.shipperLinkMobile = shipperLinkMobile;
    }

    public String getReceiveLinkMobile() {
        return receiveLinkMobile;
    }

    public void setReceiveLinkMobile(String receiveLinkMobile) {
        this.receiveLinkMobile = receiveLinkMobile;
    }

    public BigDecimal getChangeWaybillFee() {
        return changeWaybillFee;
    }

    public void setChangeWaybillFee(BigDecimal changeWaybillFee) {
        this.changeWaybillFee = changeWaybillFee;
    }

    public Integer getIsOpenTicket() {
        return isOpenTicket;
    }

    public void setIsOpenTicket(Integer isOpenTicket) {
        this.isOpenTicket = isOpenTicket;
    }
}
