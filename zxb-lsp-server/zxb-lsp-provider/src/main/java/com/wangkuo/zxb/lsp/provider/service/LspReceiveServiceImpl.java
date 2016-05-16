package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.lsp.api.dto.input.LspReceiveSendOffInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspReceiveSendOffWaybillMsgInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryLspReceiveInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspReceiveOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.service.ILspReceiveService;
import com.wangkuo.zxb.lsp.provider.db.dao.TLspWaybillReceiveAndCourierDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TLspWaybillReceiveRelationDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbDailyFeeDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillReceiveDao;
import com.wangkuo.zxb.lsp.provider.db.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by sanshao on 16-4-5.
 */
@Service
public class LspReceiveServiceImpl implements ILspReceiveService{

    @Autowired
    private TSbWaybillReceiveDao waybillReceiveDao;

    @Autowired
    private TLspWaybillReceiveAndCourierDao  waybillReceiveAndCourierDao;

    @Autowired
    private TLspWaybillReceiveRelationDao waybillReceiveRelationDao;

    @Autowired
    private TSbDailyFeeDao dailyFeeDao;

    @Override
    public PagedList<LspReceiveOutput> listLspReceive(QueryLspReceiveInput input) {
        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        List<LspReceiveOutput> outputs = waybillReceiveDao.listLspReceive(input, pageable);
        return new PagedList<>(input, pageable.getCount(), BeanMapper.mapList(outputs, LspReceiveOutput.class));
    }

    @Override
    public int sendOffReceive(LspReceiveSendOffInput input) {
        if(input.getReceiveSendOffBaseMsgInput() == null){
            return -1;
        }
        if(input.getReceiveSendOffBaseMsgInput().getCouriername().trim().equals("")||input.getReceiveSendOffBaseMsgInput().getCouriernumber().trim().equals("")){
            return -1;
        }
        if(input.getLspReceiveSendOffWaybillMsgInputs() == null){
            return -2;
        }
        if(input.getLspReceiveSendOffWaybillMsgInputs() != null && input.getLspReceiveSendOffWaybillMsgInputs().size() <= 0){
            return -2;
        }
        TLspWaybillReceiveAndCourier courier = new TLspWaybillReceiveAndCourier();
        BeanMapper.copy(input.getReceiveSendOffBaseMsgInput(),courier);
        waybillReceiveAndCourierDao.insertSelective(courier);
        for(LspReceiveSendOffWaybillMsgInput waybillMsgInput : input.getLspReceiveSendOffWaybillMsgInputs()){
            TLspWaybillReceiveRelation receiveRelation = new TLspWaybillReceiveRelation();
            receiveRelation.setLspWaybillCourierId(courier.getId());
            receiveRelation.setWaybillReceiveId(waybillMsgInput.getReceiveId());
            waybillReceiveRelationDao.insertSelective(receiveRelation);
            TSbWaybillReceive receive = waybillReceiveDao.selectByPrimaryKey(waybillMsgInput.getReceiveId());
            receive.setIsSendOff(1);
            waybillReceiveDao.updateByPrimaryKeySelective(receive);
        }
        //生成日常费用信息
        TSbDailyFee  dailyFee = new TSbDailyFee();
        dailyFee.setApplyBodyType("2");
        dailyFee.setTypeContext("服务商回单寄出");
        dailyFee.setFee(input.getReceiveSendOffBaseMsgInput().getCourierfee());
        dailyFee.setApplyUserId(input.getReceiveSendOffBaseMsgInput().getCreateUserId());
        dailyFee.setApplyUserName(input.getReceiveSendOffBaseMsgInput().getCreateUserName());
        dailyFee.setApplyTime(new Date());
        dailyFee.setApplyBodyId(input.getReceiveSendOffBaseMsgInput().getAllotCenterId());
        dailyFee.setApplyBodyName(input.getReceiveSendOffBaseMsgInput().getAllotCenterName());
        dailyFee.setVerifiStatus(5);
        dailyFeeDao.insertSelective(dailyFee);

        return 1;
    }

}
