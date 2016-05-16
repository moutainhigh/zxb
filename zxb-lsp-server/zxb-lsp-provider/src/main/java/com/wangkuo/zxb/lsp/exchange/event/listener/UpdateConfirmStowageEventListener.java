package com.wangkuo.zxb.lsp.exchange.event.listener;

import com.wangkuo.dec.data.wdtoyy.WaybillStowage;
import com.wangkuo.zxb.lsp.exchange.IExChangeSendDataService;
import com.wangkuo.zxb.lsp.exchange.event.UpdateConfirmStowageEvent;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbStowageBillGoodsLabelDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbStowageDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TZbAllocCentreDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbStowage;
import com.wangkuo.zxb.lsp.provider.db.po.TSbStowageBillGoodsLabel;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybill;
import com.wangkuo.zxb.lsp.provider.db.po.TZbAllocCentre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 配载修改确认发车的消息处理监听
 *
 * Created by dan on 14-12-8.
 */
@Component
public class UpdateConfirmStowageEventListener implements ApplicationListener<UpdateConfirmStowageEvent> {

    @Autowired
    private TSbWaybillDao sbWaybillDao;
    @Autowired
    private TSbStowageDao sbStowageDao;
    @Autowired
    private TSbStowageBillGoodsLabelDao sbStowageBillGoodsLabelDao;
    @Autowired
    private IExChangeSendDataService exChangeSendDataService;
    @Autowired
    private TZbAllocCentreDao zbAllocCentreDao;


    @Override
    public void onApplicationEvent(UpdateConfirmStowageEvent event) {
        TSbStowage stowage = sbStowageDao.selectByPrimaryKey(event.getStowageId());
        for(Long id : event.getWaybillId()){
            TSbWaybill waybill = sbWaybillDao.selectByPrimaryKey(id);
            WaybillStowage  waybillStowage = new WaybillStowage();

            waybillStowage.setSystemId(waybill.getDownId());

            if(waybill.getAllocCenterId() != null){
                TZbAllocCentre allocCentre=zbAllocCentreDao.selectByPrimaryKey(waybill.getAllocCenterId());
                waybillStowage.setAllocCenterSystemId(allocCentre.getDownId());
                waybillStowage.setTruckCode(stowage.getPlateNumber());
                waybillStowage.setDriverName(stowage.getDriverName());
                waybillStowage.setMobile(stowage.getDriverPhone());
                waybillStowage.setIsStowage(1);
                waybillStowage.setOperateEmployee(event.getOperateEmployee());
                waybillStowage.setStowageTime(new Date());

                exChangeSendDataService.addToSendQueue(waybillStowage);
            }
        }
    }
}
