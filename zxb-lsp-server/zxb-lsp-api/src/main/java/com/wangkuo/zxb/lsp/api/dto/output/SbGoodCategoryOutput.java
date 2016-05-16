package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-30
 */
public class SbGoodCategoryOutput implements Serializable {
    private Long id;

    private String name;

    private String code;

    private Long siteId;

    private String siteName;

    private Float rateHeavy;

    private Float rateLight;

    private String pack;

    private Integer loadUnloadType;

    private String stackRequire;

    private String memo;

    private Integer goodType;

    private Integer isStandard;

    private Long bookEmployeeId;

    private String bookEmployeeName;

    private Date createTime;

    private Long lspUserId;

    private String lspUserName;

    private Integer type;

    private Date applyTime;

    private String allocCenterName;

    private Long allocCenterId;

    private  Integer status;

    private Long allotId;

    private String fileUrl;

    private String allotMemo;

    private Integer endCityId;

    private String endCityName;

    private Integer endCountryId;

    private String endCountryName;

    private Integer endProvinceId;

    private String endProvinceName;

    private Long goodCategoryPriceId;

    private  Integer maxSize;

    private Long goodCategoryAllotId;

    private Integer chargeType;
    /**上浮比例*/
    private BigDecimal floatRateCountry;
    /**上浮固定值*/
    private BigDecimal floatFixedCountry;
    /**上浮方式*/
    private Integer floatType;
    /**件数计费方式*/
    private Integer pieceType;
    /**站到站价格/件*/
    private BigDecimal pieceSiteToSiteFeeCountry;
    /**站到站送货费*/
    private BigDecimal pieceSiteToSiteSendGoodFeeCountry;
    /**站到们价格/件*/
    private BigDecimal pieceSiteToDoorFeeCountry;


    /**价格区间*/
    private List<String> priceTitle;
    /**对应的价格*/
    private List<BigDecimal> prices;

    private static final long serialVersionUID = 1L;

    public BigDecimal getFloatRateCountry() {
        return floatRateCountry;
    }

    public void setFloatRateCountry(BigDecimal floatRateCountry) {
        this.floatRateCountry = floatRateCountry;
    }

    public BigDecimal getFloatFixedCountry() {
        return floatFixedCountry;
    }

    public void setFloatFixedCountry(BigDecimal floatFixedCountry) {
        this.floatFixedCountry = floatFixedCountry;
    }

    public Integer getFloatType() {
        return floatType;
    }

    public void setFloatType(Integer floatType) {
        this.floatType = floatType;
    }

    public Integer getPieceType() {
        return pieceType;
    }

    public void setPieceType(Integer pieceType) {
        this.pieceType = pieceType;
    }

    public BigDecimal getPieceSiteToSiteFeeCountry() {
        return pieceSiteToSiteFeeCountry;
    }

    public void setPieceSiteToSiteFeeCountry(BigDecimal pieceSiteToSiteFeeCountry) {
        this.pieceSiteToSiteFeeCountry = pieceSiteToSiteFeeCountry;
    }

    public BigDecimal getPieceSiteToSiteSendGoodFeeCountry() {
        return pieceSiteToSiteSendGoodFeeCountry;
    }

    public void setPieceSiteToSiteSendGoodFeeCountry(BigDecimal pieceSiteToSiteSendGoodFeeCountry) {
        this.pieceSiteToSiteSendGoodFeeCountry = pieceSiteToSiteSendGoodFeeCountry;
    }

    public BigDecimal getPieceSiteToDoorFeeCountry() {
        return pieceSiteToDoorFeeCountry;
    }

    public void setPieceSiteToDoorFeeCountry(BigDecimal pieceSiteToDoorFeeCountry) {
        this.pieceSiteToDoorFeeCountry = pieceSiteToDoorFeeCountry;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Long getGoodCategoryAllotId() {
        return goodCategoryAllotId;
    }

    public void setGoodCategoryAllotId(Long goodCategoryAllotId) {
        this.goodCategoryAllotId = goodCategoryAllotId;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public List<String> getPriceTitle() {
        return priceTitle;
    }

    public void setPriceTitle(List<String> priceTitle) {
        this.priceTitle = priceTitle;
    }

    public List<BigDecimal> getPrices() {
        return prices;
    }

    public void setPrices(List<BigDecimal> prices) {
        this.prices = prices;
    }

    public Long getGoodCategoryPriceId() {
        return goodCategoryPriceId;
    }

    public void setGoodCategoryPriceId(Long goodCategoryPriceId) {
        this.goodCategoryPriceId = goodCategoryPriceId;
    }

    public Integer getEndCityId() {
        return endCityId;
    }

    public void setEndCityId(Integer endCityId) {
        this.endCityId = endCityId;
    }

    public String getEndCityName() {
        return endCityName;
    }

    public void setEndCityName(String endCityName) {
        this.endCityName = endCityName;
    }

    public Integer getEndCountryId() {
        return endCountryId;
    }

    public void setEndCountryId(Integer endCountryId) {
        this.endCountryId = endCountryId;
    }

    public String getEndCountryName() {
        return endCountryName;
    }

    public void setEndCountryName(String endCountryName) {
        this.endCountryName = endCountryName;
    }

    public Integer getEndProvinceId() {
        return endProvinceId;
    }

    public void setEndProvinceId(Integer endProvinceId) {
        this.endProvinceId = endProvinceId;
    }

    public String getEndProvinceName() {
        return endProvinceName;
    }

    public void setEndProvinceName(String endProvinceName) {
        this.endProvinceName = endProvinceName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getAllotMemo() {
        return allotMemo;
    }

    public void setAllotMemo(String allotMemo) {
        this.allotMemo = allotMemo;
    }

    public Long getAllotId() {
        return allotId;
    }

    public void setAllotId(Long allotId) {
        this.allotId = allotId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getAllocCenterName() {
        return allocCenterName;
    }

    public void setAllocCenterName(String allocCenterName) {
        this.allocCenterName = allocCenterName;
    }

    public Long getAllocCenterId() {
        return allocCenterId;
    }

    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public Float getRateHeavy() {
        return rateHeavy;
    }

    public void setRateHeavy(Float rateHeavy) {
        this.rateHeavy = rateHeavy;
    }

    public Float getRateLight() {
        return rateLight;
    }

    public void setRateLight(Float rateLight) {
        this.rateLight = rateLight;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack == null ? null : pack.trim();
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
        this.stackRequire = stackRequire == null ? null : stackRequire.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getGoodType() {
        return goodType;
    }

    public void setGoodType(Integer goodType) {
        this.goodType = goodType;
    }

    public Integer getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(Integer isStandard) {
        this.isStandard = isStandard;
    }

    public Long getBookEmployeeId() {
        return bookEmployeeId;
    }

    public void setBookEmployeeId(Long bookEmployeeId) {
        this.bookEmployeeId = bookEmployeeId;
    }

    public String getBookEmployeeName() {
        return bookEmployeeName;
    }

    public void setBookEmployeeName(String bookEmployeeName) {
        this.bookEmployeeName = bookEmployeeName == null ? null : bookEmployeeName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLspUserId() {
        return lspUserId;
    }

    public void setLspUserId(Long lspUserId) {
        this.lspUserId = lspUserId;
    }

    public String getLspUserName() {
        return lspUserName;
    }

    public void setLspUserName(String lspUserName) {
        this.lspUserName = lspUserName == null ? null : lspUserName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
