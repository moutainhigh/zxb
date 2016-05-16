package com.wangkuo.zxb.lsp.api.dto.input;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by chaizf on 2016/4/9.
 */
public class SbWaybillGoodInput implements Serializable {
    private Long waybillId;
    @NotBlank
    private String goodName;
    @NotBlank
    private String pack;
    @NotNull
    private Integer num;
    @NotNull
    private Float offerWeight;
    @NotNull
    private Float offerVolume;
    @NotNull
    private Long goodCategoryId;
    @NotBlank
    private String goodCategoryName;

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
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
}
