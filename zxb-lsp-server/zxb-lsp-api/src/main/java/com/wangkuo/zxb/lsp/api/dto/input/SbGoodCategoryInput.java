package com.wangkuo.zxb.lsp.api.dto.input;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-30
 */
public class SbGoodCategoryInput extends PageInput implements Serializable {
    private Long id;
    @NotBlank
    private String name;

    private String code;

    private Long siteId;

    private String siteName;
    @NotNull
    private Float rateHeavy;
    @NotNull
    private Float rateLight;
    @NotBlank
    private String pack;
    @NotNull
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

    private Long allocCenterId;

    private Integer status;

    private Long endCityId;

    private Long endCountryId;

    private Long endProvinceId;

    private static final long serialVersionUID = 1L;

    public Long getEndCityId() {
        return endCityId;
    }

    public void setEndCityId(Long endCityId) {
        this.endCityId = endCityId;
    }

    public Long getEndCountryId() {
        return endCountryId;
    }

    public void setEndCountryId(Long endCountryId) {
        this.endCountryId = endCountryId;
    }

    public Long getEndProvinceId() {
        return endProvinceId;
    }

    public void setEndProvinceId(Long endProvinceId) {
        this.endProvinceId = endProvinceId;
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
