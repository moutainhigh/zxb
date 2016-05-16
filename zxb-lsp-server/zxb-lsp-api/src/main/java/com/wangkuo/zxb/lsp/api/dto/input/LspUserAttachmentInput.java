package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mark on 16/4/13.
 */
public class LspUserAttachmentInput implements Serializable {

    private Integer busiType;

    private Long busiId;

    private Integer fileType;

    private String fileName;

    private String fileUrl;

    private Date createTime;

    private Long bookerEmployeeId;

    private String bookerEmployeeName;

    private Integer userBodyType;

    private Long userBodyId;

    private String fileSuffix;

    private static final long serialVersionUID = 1L;

    public Integer getBusiType() {
        return busiType;
    }

    public void setBusiType(Integer busiType) {
        this.busiType = busiType;
    }

    public Long getBusiId() {
        return busiId;
    }

    public void setBusiId(Long busiId) {
        this.busiId = busiId;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getBookerEmployeeId() {
        return bookerEmployeeId;
    }

    public void setBookerEmployeeId(Long bookerEmployeeId) {
        this.bookerEmployeeId = bookerEmployeeId;
    }

    public String getBookerEmployeeName() {
        return bookerEmployeeName;
    }

    public void setBookerEmployeeName(String bookerEmployeeName) {
        this.bookerEmployeeName = bookerEmployeeName == null ? null : bookerEmployeeName.trim();
    }

    public Integer getUserBodyType() {
        return userBodyType;
    }

    public void setUserBodyType(Integer userBodyType) {
        this.userBodyType = userBodyType;
    }

    public Long getUserBodyId() {
        return userBodyId;
    }

    public void setUserBodyId(Long userBodyId) {
        this.userBodyId = userBodyId;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }
}
