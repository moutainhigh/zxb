package com.wangkuo.zxb.lsp.exchange.event.listener;

import com.wangkuo.dec.data.wdtoyy.WaybillConfirmTrade;
import com.wangkuo.zxb.lsp.exchange.IExChangeSendDataService;
import com.wangkuo.zxb.lsp.exchange.event.WaybillConfirmTradeEvent;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 *
 *
 *
 * Created by levitch on 14/11/24.
 */
@Component
public class WaybillconfirmTradeEventListener implements ApplicationListener<WaybillConfirmTradeEvent> {

    @Autowired
    private TSbWaybillDao sbWaybillDao;
    @Autowired
    private IExChangeSendDataService exChangeSendDataService;

    @Override
    public void onApplicationEvent(WaybillConfirmTradeEvent event) {
        TSbWaybill waybill = sbWaybillDao.selectByPrimaryKey(event.getWaybillId());
        WaybillConfirmTrade trade = new WaybillConfirmTrade();
        trade.setSystemId(waybill.getDownId());
        trade.setOperateEmployee(event.getOperateEmployee());
        trade.setTradeTime(waybill.getTransConfirTime());
        trade.setCreateTime(new Date());
        exChangeSendDataService.addToSendQueue(trade);
    }
}
