package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;

/**
 * 服务商回单返回
 * Created by sanshao on 16-4-5.
 */
public class LspReceiveOutput implements Serializable {

    private Long id;

    private Long waybillId;

    private String waybillSn;

    private String originatingSource;

    private String lspCompanyName;

    private String goodName;

    private String transportName;

    private String receiveName;

    private Integer isSendOff;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWaybillSn() {
        return waybillSn;
    }

    public void setWaybillSn(String waybillSn) {
        this.waybillSn = waybillSn;
    }

    public String getOriginatingSource() {
        return originatingSource;
    }

    public void setOriginatingSource(String originatingSource) {
        this.originatingSource = originatingSource;
    }

    public String getLspCompanyName() {
        return lspCompanyName;
    }

    public void setLspCompanyName(String lspCompanyName) {
        this.lspCompanyName = lspCompanyName;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public Integer getIsSendOff() {
        return isSendOff;
    }

    public void setIsSendOff(Integer isSendOff) {
        this.isSendOff = isSendOff;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }
}
