package com.wangkuo.zxb.lsp.exchange.event.listener;

import com.wangkuo.dec.data.wdtoyy.WaybillQuote;
import com.wangkuo.zxb.lsp.exchange.IExChangeSendDataService;
import com.wangkuo.zxb.lsp.exchange.event.WaybillQuoteEvent;
import com.wangkuo.zxb.lsp.provider.db.dao.TFbAllotWaybillDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillFeeDao;
import com.wangkuo.zxb.lsp.provider.db.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * 网点报价
 *
 * Created by zhangxs on 14/11/24.
 */
@Component
public class WaybillQuoteEventListener implements ApplicationListener<WaybillQuoteEvent> {

    @Autowired
    private TSbWaybillDao sbWaybillDao;
    @Autowired
    private TFbAllotWaybillDao fbAllotWaybillDao;
    @Autowired
    private IExChangeSendDataService exChangeSendDataService;
    @Autowired
    private TSbWaybillFeeDao sbWaybillFeeDao;

    @Override
    public void onApplicationEvent(WaybillQuoteEvent event) {
        TSbWaybill waybill = sbWaybillDao.selectByPrimaryKey(event.getWaybillId());
        TSbWaybillFeeCriteria sbWaybillFeeCriteria=new TSbWaybillFeeCriteria();
        sbWaybillFeeCriteria.createCriteria().andWaybillIdEqualTo(waybill.getId());
        TSbWaybillFee fee = sbWaybillFeeDao.selectByExample(sbWaybillFeeCriteria).get(0);
        TFbAllotWaybillCriteria fbAllotWaybillCriteria=new TFbAllotWaybillCriteria();
        fbAllotWaybillCriteria.createCriteria().andWaybillIdEqualTo(waybill.getId());
        TFbAllotWaybill allotWaybill =fbAllotWaybillDao.selectAllotWaybill(fbAllotWaybillCriteria);
        WaybillQuote quote = new WaybillQuote();
        quote.setSystemId(waybill.getDownId());

        quote.setFreightFee(fee.getFreightFee().add(null == fee.getBusinessFee() ? BigDecimal.ZERO : fee.getBusinessFee()));
        quote.setOperateEmployee(event.getOperateEmployee());
        quote.setDays(allotWaybill.getRunTime()==null?0:allotWaybill.getRunTime());
        quote.setQuoteTime(new Date());
        exChangeSendDataService.addToSendQueue(quote);
    }
}
