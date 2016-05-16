package com.wangkuo.zxb.lsp.exchange;


import com.wangkuo.zxb.lsp.provider.db.po.ExchSendData;

public interface IExChangeSendDataService {
    /**
     * 发送
     */
    boolean send(ExchSendData tSendData)throws Exception;

    /**
     * 添加到发送队列
     *
     * @param actionType 类型
     * @param sendObj    数据对象
     * @return
     */
    int addToSendQueue(String actionType, Object sendObj);


    /**
     *
     * 添加到发送队列,并且使用对象的类名称作为 actionType
     *
     * @param sendObj
     * @return
     */
    int addToSendQueue(Object sendObj);


}
