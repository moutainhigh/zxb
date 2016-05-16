package com.wangkuo.zxb.smart.show.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by john on 2016/4/15.
 */
public class BaseDataOutput implements Serializable {
    //总交易票数
    private Integer totalDeal;
    //总累计交易额
    private BigDecimal totalFee;
    //总发货体积
    private BigDecimal totalVolume;
    //总发货重量
    private BigDecimal totalWeight;
    //当月交易票数
    private BigDecimal totalDealMonth;
    //当月交易额
    private BigDecimal totalFeeMonth;
    //全国运力中心
    private Integer transportCenterCount;
    //全国服务网点数
    private Integer serviceBranchCount;
    //专线供应商数
    private Integer lineSuppliersCount;

    public Integer getTotalDeal() {
        return totalDeal;
    }

    public void setTotalDeal(Integer totalDeal) {
        this.totalDeal = totalDeal;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public BigDecimal getTotalDealMonth() {
        return totalDealMonth;
    }

    public void setTotalDealMonth(BigDecimal totalDealMonth) {
        this.totalDealMonth = totalDealMonth;
    }

    public BigDecimal getTotalFeeMonth() {
        return totalFeeMonth;
    }

    public void setTotalFeeMonth(BigDecimal totalFeeMonth) {
        this.totalFeeMonth = totalFeeMonth;
    }

    public Integer getTransportCenterCount() {
        return transportCenterCount;
    }

    public void setTransportCenterCount(Integer transportCenterCount) {
        this.transportCenterCount = transportCenterCount;
    }

    public Integer getServiceBranchCount() {
        return serviceBranchCount;
    }

    public void setServiceBranchCount(Integer serviceBranchCount) {
        this.serviceBranchCount = serviceBranchCount;
    }

    public Integer getLineSuppliersCount() {
        return lineSuppliersCount;
    }

    public void setLineSuppliersCount(Integer lineSuppliersCount) {
        this.lineSuppliersCount = lineSuppliersCount;
    }
}
