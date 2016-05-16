package com.wangkuo.zxb.lsp.exchange.event.listener;

import com.wangkuo.dec.data.wdtoyy.WaybillStowageCancel;
import com.wangkuo.zxb.lsp.exchange.IExChangeSendDataService;
import com.wangkuo.zxb.lsp.exchange.event.UpdateStowageEvent;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 运单配载发⻋车取消的消息处理监听
 *
 * Created by dan on 14-12-9.
 */
@Component
public class UpdateStowageEventListener implements ApplicationListener<UpdateStowageEvent> {

    @Autowired
    private IExChangeSendDataService exChangeSendDataService;
    @Autowired
    private TSbWaybillDao sbWaybillDao;

    @Override
    public void onApplicationEvent(UpdateStowageEvent event) {
        for(Long id :event.getWaybillIds()){
            TSbWaybill waybill = sbWaybillDao.selectByPrimaryKey(id);
            WaybillStowageCancel cancel = new WaybillStowageCancel();
            cancel.setSystemId(waybill.getDownId());
            cancel.setOperateEmployee(event.getOperateEmployee());
            cancel.setCancelTime(new Date());
            exChangeSendDataService.addToSendQueue(cancel);
        }
    }
}
