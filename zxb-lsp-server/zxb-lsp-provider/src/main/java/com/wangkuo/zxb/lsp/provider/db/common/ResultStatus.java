package com.wangkuo.zxb.lsp.provider.db.common;

/**
 * Created by sanshao on 16-4-11.
 */
public class ResultStatus {

    /**
     * 成功
     */
    public static final int SUCCESS = 1;

    /**
     * 失败
     */
    public static final int FAIL = 0;

    /**
     * 记录不存在
     */
    public static final int RECORD_DOES_NOT_EXIST = -2;

    /**
     * 状态不允许操作
     */
    public static final int STATE_NOT_ALLOWED = -3;

    /**
     * 记录未审核
     */
    public static final int RECORD_NOT_AUDITED = -4;


}
