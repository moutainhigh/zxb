package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;

/**
 * Created by sanshao on 16-4-13.
 */
public class WaybillGoodOutput  implements Serializable {
    private Long id;

    private Long waybillId;

    private String goodName;

    private String pack;

    private Integer num;

    private Float offerWeight;

    private Float offerVolume;

    private Float runWeight;

    private Float runVolume;

    private String format;

    private String goodMomo;

    private Integer isCategory;

    private Long goodCategoryId;

    private String goodCategoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack == null ? null : pack.trim();
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

    public Float getRunWeight() {
        return runWeight;
    }

    public void setRunWeight(Float runWeight) {
        this.runWeight = runWeight;
    }

    public Float getRunVolume() {
        return runVolume;
    }

    public void setRunVolume(Float runVolume) {
        this.runVolume = runVolume;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getGoodMomo() {
        return goodMomo;
    }

    public void setGoodMomo(String goodMomo) {
        this.goodMomo = goodMomo == null ? null : goodMomo.trim();
    }

    public Integer getIsCategory() {
        return isCategory;
    }

    public void setIsCategory(Integer isCategory) {
        this.isCategory = isCategory;
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
        this.goodCategoryName = goodCategoryName == null ? null : goodCategoryName.trim();
    }

}
