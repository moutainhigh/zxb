package com.wangkuo.zxb.lsp.exchange.event.listener;

import com.wangkuo.dec.data.wdtoyy.WaybillTakeGoodsArrival;
import com.wangkuo.zxb.lsp.exchange.IExChangeSendDataService;
import com.wangkuo.zxb.lsp.exchange.event.WaybillGoodArriveEvent;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 *
 * 确认到站消息处理监听
 *
 * Created by levitch on 14/11/24.
 */
@Component
public class WaybillGoodArriveEventListener implements ApplicationListener<WaybillGoodArriveEvent> {


    @Autowired
    private TSbWaybillDao sbWaybillDao;
    @Autowired
    private IExChangeSendDataService exChangeSendDataService;

    @Override
    public void onApplicationEvent(WaybillGoodArriveEvent event) {
        TSbWaybill waybill = sbWaybillDao.selectByPrimaryKey(event.getWaybillId());
        WaybillTakeGoodsArrival arrive = new WaybillTakeGoodsArrival();
        arrive.setSystemId(waybill.getDownId());
        arrive.setOperateEmployee(event.getOperateEmployee());
        arrive.setArrivalTime(new Date());
        exChangeSendDataService.addToSendQueue(arrive);
    }
}
