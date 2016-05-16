package com.wangkuo.zxb.lsp.provider.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/4/12.
 */
@Component
public class Setting {
    @Value("#{settings['mapKey']}")
    private String mapKey;//地图key

    @Value("#{settings['premiumRate']}")
    private Float premiumRate;//保费费率

    @Value("#{settings['palletRate']}")
    private Float palletRate;//托盘比率

    @Value("#{settings['computeWeightUnit']}")
    private Float computeWeightUnit;//运费计算重量

    @Value("#{settings['computeVolumeUnit']}")
    private Float computeVolumeUnit;//运费计算体积

    @Value("#{settings['noStandaraRate']}")
    private Float noStandaraRate;//非标件上浮比例

    @Value("#{settings['openTicketRate']}")
    private Float openTicketRate;//开票费率

    @Value("#{settings['signedReceiveFee']}")
    private Float signedReceiveFee;//签回单费用（10元/票）

    @Value("#{settings['sendMaxDistance']}")
    private Float sendMaxDistance;//送货最大距离

    @Value("#{settings['freeSendWeight']}")
    private Float freeSendWeight;//#免费送货重量

    @Value("#{settings['freeSendVolume']}")
    private Float freeSendVolume;//#免费送货体积

    @Value("#{settings['freeSendDistance']}")
    private Float freeSendDistance;//#免费送货距离

    @Value("#{settings['ecommerceEnterFee']}")
    private Float ecommerceEnterFee;//#电商仓进仓费25/方

    @Value("#{settings['foreignEnterFee']}")
    private Float foreignEnterFee;//#外贸仓进仓费15/方

    @Value("#{settings['forkliftFee']}")
    private Float forkliftFee;//#叉车费

    @Value("#{settings['forkliftUnit']}")
    private Float forkliftUnit;//#叉车费单位

    @Value("#{settings['upstairsElevatorFee1']}")
    private Float upstairsElevatorFee1;//#上楼费，有电梯，重货50/吨

    @Value("#{settings['upstairsElevatorFee3']}")
    private Float upstairsElevatorFee3;//#上楼费，有电梯，抛货10元/方

    @Value("#{settings['upstairsNoElevatorFee1']}")
    private Float upstairsNoElevatorFee1;//#上楼费，无电梯，重货50/层/吨

    @Value("#{settings['upstairsNoElevatorFee3']}")
    private Float upstairsNoElevatorFee3;//#上楼费，无电梯，抛货15元/层/方

    @Value("#{settings['freeUnloadWeight']}")
    private Float freeUnloadWeight;//#免卸货费重量

    @Value("#{settings['freeUnloadVolume']}")
    private Float freeUnloadVolume;//#免卸货费体积

    @Value("#{settings['unloadFee1']}")
    private Float unloadFee1;//#卸货费，重货50/吨

    @Value("#{settings['unloadFee3']}")
    private Float unloadFee3;//#卸货费，抛货15元/方

    public Float getPremiumRate() {
        return premiumRate;
    }

    public void setPremiumRate(Float premiumRate) {
        this.premiumRate = premiumRate;
    }

    public Float getFreeUnloadWeight() {
        return freeUnloadWeight;
    }

    public void setFreeUnloadWeight(Float freeUnloadWeight) {
        this.freeUnloadWeight = freeUnloadWeight;
    }

    public Float getFreeUnloadVolume() {
        return freeUnloadVolume;
    }

    public void setFreeUnloadVolume(Float freeUnloadVolume) {
        this.freeUnloadVolume = freeUnloadVolume;
    }

    public Float getUpstairsElevatorFee1() {
        return upstairsElevatorFee1;
    }

    public void setUpstairsElevatorFee1(Float upstairsElevatorFee1) {
        this.upstairsElevatorFee1 = upstairsElevatorFee1;
    }

    public Float getUpstairsElevatorFee3() {
        return upstairsElevatorFee3;
    }

    public void setUpstairsElevatorFee3(Float upstairsElevatorFee3) {
        this.upstairsElevatorFee3 = upstairsElevatorFee3;
    }

    public Float getUpstairsNoElevatorFee1() {
        return upstairsNoElevatorFee1;
    }

    public void setUpstairsNoElevatorFee1(Float upstairsNoElevatorFee1) {
        this.upstairsNoElevatorFee1 = upstairsNoElevatorFee1;
    }

    public Float getUpstairsNoElevatorFee3() {
        return upstairsNoElevatorFee3;
    }

    public void setUpstairsNoElevatorFee3(Float upstairsNoElevatorFee3) {
        this.upstairsNoElevatorFee3 = upstairsNoElevatorFee3;
    }

    public Float getUnloadFee1() {
        return unloadFee1;
    }

    public void setUnloadFee1(Float unloadFee1) {
        this.unloadFee1 = unloadFee1;
    }

    public Float getUnloadFee3() {
        return unloadFee3;
    }

    public void setUnloadFee3(Float unloadFee3) {
        this.unloadFee3 = unloadFee3;
    }

    public Float getForkliftFee() {
        return forkliftFee;
    }

    public void setForkliftFee(Float forkliftFee) {
        this.forkliftFee = forkliftFee;
    }

    public Float getForkliftUnit() {
        return forkliftUnit;
    }

    public void setForkliftUnit(Float forkliftUnit) {
        this.forkliftUnit = forkliftUnit;
    }

    public Float getEcommerceEnterFee() {
        return ecommerceEnterFee;
    }

    public void setEcommerceEnterFee(Float ecommerceEnterFee) {
        this.ecommerceEnterFee = ecommerceEnterFee;
    }

    public Float getForeignEnterFee() {
        return foreignEnterFee;
    }

    public void setForeignEnterFee(Float foreignEnterFee) {
        this.foreignEnterFee = foreignEnterFee;
    }

    public Float getFreeSendWeight() {
        return freeSendWeight;
    }

    public void setFreeSendWeight(Float freeSendWeight) {
        this.freeSendWeight = freeSendWeight;
    }

    public Float getFreeSendVolume() {
        return freeSendVolume;
    }

    public void setFreeSendVolume(Float freeSendVolume) {
        this.freeSendVolume = freeSendVolume;
    }

    public Float getFreeSendDistance() {
        return freeSendDistance;
    }

    public void setFreeSendDistance(Float freeSendDistance) {
        this.freeSendDistance = freeSendDistance;
    }

    public Float getSendMaxDistance() {
        return sendMaxDistance;
    }

    public void setSendMaxDistance(Float sendMaxDistance) {
        this.sendMaxDistance = sendMaxDistance;
    }

    public Float getSignedReceiveFee() {
        return signedReceiveFee;
    }

    public void setSignedReceiveFee(Float signedReceiveFee) {
        this.signedReceiveFee = signedReceiveFee;
    }

    public Float getOpenTicketRate() {
        return openTicketRate;
    }

    public void setOpenTicketRate(Float openTicketRate) {
        this.openTicketRate = openTicketRate;
    }

    public String getMapKey() {
        return mapKey;
    }

    public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
    }

    public Float getPalletRate() {
        return palletRate;
    }

    public void setPalletRate(Float palletRate) {
        this.palletRate = palletRate;
    }

    public Float getComputeWeightUnit() {
        return computeWeightUnit;
    }

    public void setComputeWeightUnit(Float computeWeightUnit) {
        this.computeWeightUnit = computeWeightUnit;
    }

    public Float getComputeVolumeUnit() {
        return computeVolumeUnit;
    }

    public void setComputeVolumeUnit(Float computeVolumeUnit) {
        this.computeVolumeUnit = computeVolumeUnit;
    }

    public Float getNoStandaraRate() {
        return noStandaraRate;
    }

    public void setNoStandaraRate(Float noStandaraRate) {
        this.noStandaraRate = noStandaraRate;
    }
}
