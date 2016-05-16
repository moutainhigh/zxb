package com.wangkuo.zxb.lsp.provider.db.po;

/**
 * Created by cuihe on 16/3/25.
 */
public class TSequenceNumberGenerateResult {

    private String maxSequenceNumber;

    private Integer indexLength;

    private Integer suffixLength;

    public String getMaxSequenceNumber() {
        return maxSequenceNumber;
    }

    public void setMaxSequenceNumber(String maxSequenceNumber) {
        this.maxSequenceNumber = maxSequenceNumber;
    }

    public Integer getIndexLength() {
        return indexLength;
    }

    public void setIndexLength(Integer indexLength) {
        this.indexLength = indexLength;
    }

    public Integer getSuffixLength() {
        return suffixLength;
    }

    public void setSuffixLength(Integer suffixLength) {
        this.suffixLength = suffixLength;
    }
}
