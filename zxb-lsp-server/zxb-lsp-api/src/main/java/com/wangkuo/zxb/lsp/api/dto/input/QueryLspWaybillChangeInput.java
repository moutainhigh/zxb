package com.wangkuo.zxb.lsp.api.dto.input;

import java.util.Date;

/**
 * Created by sanshao on 16-4-9.
 */
public class QueryLspWaybillChangeInput extends PageInput{

    private Date startDate;

    private Date endDate;

    private String systemSn;

    private String sn;

    private String lspCompanyName;

    private Integer status;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public String getLspCompanyName() {
        return lspCompanyName;
    }

    public void setLspCompanyName(String lspCompanyName) {
        this.lspCompanyName = lspCompanyName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
