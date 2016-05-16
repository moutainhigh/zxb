package com.wangkuo.zxb.lsp.api.dto.input;

import java.util.Date;

/**
 *
 * 运单查询入口参数, 扩展了分页参数.
 *
 * 支持查询参数看属性定义
 *
 * @author levitch
 * @date 16/4/5
 * @versioin 1.0
 **/
public class QueryWaybillConditionInput extends PageInput {


    /**
     * 服务商ID
     */
    private Long lspId;

    /**
     * 开单起始时间
     */
    private Date operationTimeBegin;

    /**
     * 开单结束时间
     */
    private Date operationTimeEnd;


    /**
     * 查询串
     */
    private String searchString;

    /**
     * 运单号(支持模糊查询 %sn%)
     */
//    private String sn;

    /**
     * 货物名称(支持模糊查询 %goodName%)
     */
//    private String goodName;

    /**
     * 发货人/联系方式(支持发货人和联系方式字段的模糊查询 %shipperLink%)
     */
//    private String shipperLink;

    /**
     * 收货人/联系方式(支持收货人和联系方式字段的模糊查询 %receiveLink%)
     */
//    private String receiveLink;

    /**
     * 收货地址(支持模糊查询 %receiveAddress%)
     */
//    private String receiveAddress;


    /**
     * 运单状态(支持多个状态  '&&' 查询)
     */
    private Integer waybillStatus;

    /**
     * 费用状态
     */
    private Integer feeStatus;

    public Long getLspId() {
        return lspId;
    }

    public void setLspId(Long lspId) {
        this.lspId = lspId;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public Integer getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(Integer waybillStatus) {
        this.waybillStatus = waybillStatus;
    }

    public Integer getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(Integer feeStatus) {
        this.feeStatus = feeStatus;
    }

    public Date getOperationTimeBegin() {
        return operationTimeBegin;
    }

    public void setOperationTimeBegin(Date operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
    }

    public Date getOperationTimeEnd() {
        return operationTimeEnd;
    }

    public void setOperationTimeEnd(Date operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
    }
}
