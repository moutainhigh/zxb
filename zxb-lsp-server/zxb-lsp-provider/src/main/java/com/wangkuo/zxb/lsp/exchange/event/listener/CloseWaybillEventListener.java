package com.wangkuo.zxb.lsp.exchange.event.listener;

import com.wangkuo.dec.data.wdtoyy.WaybillClose;
import com.wangkuo.zxb.lsp.exchange.IExChangeSendDataService;
import com.wangkuo.zxb.lsp.exchange.event.CloseWaybillEvent;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 *
 * 修改网点的消息处理监听
 *
 * Created by levitch on 14/11/24.
 */
@Component
public class CloseWaybillEventListener implements ApplicationListener<CloseWaybillEvent> {



    @Resource
    private TSbWaybillDao sbWaybillDao;
    @Autowired
    private IExChangeSendDataService exChangeSendDataService;

    @Override
    public void onApplicationEvent(CloseWaybillEvent closeWaybillEvent) {

        TSbWaybill waybill = sbWaybillDao.selectByPrimaryKey(closeWaybillEvent.getWaybillId());
        WaybillClose close = new WaybillClose();
        close.setSystemId(waybill.getDownId());
        close.setCreateTime(new Date());

        close.setOperateEmployee(closeWaybillEvent.getCloseUserName());
        close.setReason(waybill.getDeleteReasonId()==null?"0":waybill.getDeleteReasonId().toString());
        close.setReasonDes(waybill.getDeleteReasonMemo());
        exChangeSendDataService.addToSendQueue(close);
    }
}
