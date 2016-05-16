package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sanshao on 16-4-13.
 */
public class WaybillDepotOutput implements Serializable {
    private Long id;

    private Long waybillId;

    private Long depotId;

    private String depotName;

    private Date enterTime;

    private String enterSn;

    private BigDecimal enterFee;

    private Integer type;

    private static final long serialVersionUID = 1L;

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

    public Long getDepotId() {
        return depotId;
    }

    public void setDepotId(Long depotId) {
        this.depotId = depotId;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName == null ? null : depotName.trim();
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public String getEnterSn() {
        return enterSn;
    }

    public void setEnterSn(String enterSn) {
        this.enterSn = enterSn == null ? null : enterSn.trim();
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
}
