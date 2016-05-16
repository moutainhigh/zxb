package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.lsp.api.dto.input.AddStowageInput;
import com.wangkuo.zxb.lsp.api.dto.input.EditStowageInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryStowageListInput;
import com.wangkuo.zxb.lsp.api.dto.output.AllocCentreOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.dto.output.StowageOutput;
import com.wangkuo.zxb.lsp.api.service.IAllocCentreService;
import com.wangkuo.zxb.lsp.api.service.IStowageService;
import com.wangkuo.zxb.lsp.api.service.IZbSequenceNumberService;
import com.wangkuo.zxb.lsp.exchange.ExchangeUtils;
import com.wangkuo.zxb.lsp.exchange.event.ConfirmStowageEvent;
import com.wangkuo.zxb.lsp.exchange.event.UpdateConfirmStowageEvent;
import com.wangkuo.zxb.lsp.exchange.event.UpdateStowageEvent;
import com.wangkuo.zxb.lsp.provider.db.common.ProviderCommon;
import com.wangkuo.zxb.lsp.provider.db.common.SequenceNumberCode;
import com.wangkuo.zxb.lsp.provider.db.dao.*;
import com.wangkuo.zxb.lsp.provider.db.po.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by chazif on 2016/3/31.
 */
@Service
public class StowageServiceImpl implements IStowageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StowageServiceImpl.class);

    @Autowired
    IZbSequenceNumberService zbSequenceNumberService;
    @Autowired
    TSbStowageDao stowageDao;
    @Autowired
    TSbStowageBillGoodsLabelDao stowageBillGoodsLabelDao;
    @Autowired
    private TSbWaybillDao waybillDao;
    @Autowired
    TSbWaybillTrackDao trackDao;
    @Autowired
    TSbWaybillGoodLabelDao goodLabelDao;
    @Autowired
    TSbWaybillCustomerTrackDao customerTrackDao;
    @Autowired
    TSbWaybillReceiveDao receiveDao;
    @Autowired
    TSbWaybillReceiveTrackDao receiveTrackDao;
    @Autowired
    TFbAllotWaybillDao allotWaybillDao;
    @Autowired
    TlspUserDao userDao;
    @Autowired
    IAllocCentreService allocCentreService;
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private TSbWaybillFeeBalanceWithBenchmarkDao feeBalanceWithBenchmarkDao;

    @Override
    public PagedList<StowageOutput> getStowagePagedList(QueryStowageListInput input) {
        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        List<TSbStowage> stowages = stowageDao.selectListByCondition(input, pageable);
        return new PagedList<>(input, pageable.getCount(), BeanMapper.mapList(stowages, StowageOutput.class));
    }

    @Override
    public StowageOutput findOneStowage(Long id) {
        TSbStowage stowage = stowageDao.selectByPrimaryKey(id);
        return BeanMapper.map(stowage, StowageOutput.class);
    }

    @Override
    public int confirmDepart(Long id, Long userId) {
        TlspUser user = userDao.selectByPrimaryKey(userId);
        TSbStowage stowage = stowageDao.selectByPrimaryKey(id);
        if (stowage == null) {
            return -2;//配载单不存在
        }
        if (stowage.getStatus() != 0) {//0未发车
            return -4;//该状态不允许发车
        }
        //修改配载单状态为5已发车
        stowage.setId(id);
        stowage.setStatus(5);//5 已发车
        stowage.setDepartUserId(user.getId());//服务商id
        stowage.setDepartUserName(user.getRealUserName());//服务商姓名
        stowage.setDepartTime(new Date());
        stowageDao.updateByPrimaryKeySelective(stowage);
        TSbStowageBillGoodsLabelCriteria stowageLabelCriteria = new TSbStowageBillGoodsLabelCriteria();
        stowageLabelCriteria.createCriteria().andStowageBillIdEqualTo(id);
        List<TSbStowageBillGoodsLabel> stowageLabels = stowageBillGoodsLabelDao.selectByExample(stowageLabelCriteria);
        if (stowageLabels == null) {
            return -3;//配载标签不存在
        }
        //修改货物标签状态25已发车
        for (TSbStowageBillGoodsLabel stowageLabel : stowageLabels) {
            TSbWaybillGoodLabel goodLabel = new TSbWaybillGoodLabel();
            goodLabel.setId(stowageLabel.getWaybillGoodsLabelId());
            goodLabel.setStatus(25);//已发车
            goodLabelDao.updateByPrimaryKeySelective(goodLabel);
        }
        TSbStowageBillGoodsLabelCriteria stowageCriteria = new TSbStowageBillGoodsLabelCriteria();
        stowageCriteria.createCriteria().andStowageBillIdEqualTo(id);//配载单号
        List<TSbStowageBillGoodsLabel> billGoodsLabels = stowageBillGoodsLabelDao.selectByExample(stowageCriteria);
        if (billGoodsLabels == null) {
            return -3;//配载标签不存在
        }
        //如果标签全部配载，修改运单的状态为25
        for (TSbStowageBillGoodsLabel label : billGoodsLabels) {
            TSbWaybill waybill = waybillDao.selectByPrimaryKey(label.getWaybillId());
            //25已发车配载的货物标签等于货物标签，修改运单状态25已发车
            waybill.setId(label.getWaybillId());//运单号
            waybill.setStatus(25);//25已发车
            //修改运单状态25已发车
            waybillDao.updateByPrimaryKeySelective(waybill);
            //记录已发车的状态轨迹
            TSbWaybillTrack track = new TSbWaybillTrack();
            track.setStatus("已发车");
            //track.setWaybillSn(waybill.getSn());
            track.setWaybillId(label.getWaybillId());
            track.setCreateUserId(user.getId());//服务商id
            track.setCreateUserName(user.getRealUserName());//服务商姓名
            track.setCreateTime(new Date());
            track.setUserBodyType(SequenceNumberCode.BODY_TYPE);
            track.setUserBodyId(SequenceNumberCode.BODY_ID);
            trackDao.insertSelective(track);

            //运单跟踪信息（只指给客户看的跟踪记录-已发车）
            TSbWaybillCustomerTrack customerTrack = new TSbWaybillCustomerTrack();
            customerTrack.setWaybillId(label.getWaybillId());
            customerTrack.setWaybillSystemId(waybill.getDownId());
            customerTrack.setCreateName(user.getRealUserName());//服务商姓名
            customerTrack.setCreateTime(new Date());
            customerTrack.setMemo(user.getRealUserName() + "发车，前往" + waybill.getAllocCenterName());
            customerTrackDao.insertSelective(customerTrack);

             //如果有回单，新建一条回单跟踪信息(2016-4-25 此处代码挪到配载落货)
//            TSbWaybillReceiveCriteria receiveCriteria = new TSbWaybillReceiveCriteria();
//            receiveCriteria.createCriteria().andWaybillIdEqualTo(label.getWaybillId());//运单号
//            TSbWaybillReceive receive = receiveDao.selectWaybillReceive(receiveCriteria);
//            if (receive != null) {
//                receive.setReceiveTrack(11);//11服务商交付集散
//                receive.setReceivePosition(2);//集散
//                receive.setCreateTime(new Date());
//                receive.setLastFollowiMemo("服务商确认发车");
//                receiveDao.updateByPrimaryKeySelective(receive);
//                TSbWaybillReceiveTrack receiveTrack = new TSbWaybillReceiveTrack();
//                receiveTrack.setWaybillReceiveId(receive.getId());
//                receiveTrack.setWaybillId(waybill.getId());
//                receiveTrack.setWaybillSn(waybill.getSn());
//                receiveTrack.setReceiveTrack(11);//11服务商交付集散
//                receiveTrack.setReceivePosition(2);
//                receiveTrack.setMemo("服务商确认发车");
//                receiveTrack.setApplyBodyId(SequenceNumberCode.BODY_ID);
//                receiveTrack.setApplyBodyName(ProviderCommon.LSP);
//                receiveTrack.setApplyUserId(user.getId());//服务商id
//                receiveTrack.setApplyUserName(user.getRealUserName());//服务商姓名
//                receiveTrack.setApplyTime(new Date());
//                receiveTrackDao.insertSelective(receiveTrack);
//            }
        }
        //TODO 上行
        ExchangeUtils.afterCommit(applicationContext, new ConfirmStowageEvent(this, stowage.getId(), stowage.getBookerEmployeeName()));

        return 1;
    }

    @Override
    public int addStowage(final AddStowageInput input) {
        //TODO:验证暂时不做

        TlspUser user = userDao.selectByPrimaryKey(input.getLspId());
        if (null == user) {
            return -3;
        }

        AllocCentreOutput allocCentre = matchAllocCentre(input.getLspId(), input.getAllocCenterId());
        if (null == allocCentre) {
            return -4;
        }


        //生成配载单号
        String stowageSn = zbSequenceNumberService.createSequenceNumber(SequenceNumberCode.BODY_TYPE, SequenceNumberCode.BODY_ID, SequenceNumberCode.STOWAGE_CODE);

        TSbStowage stowage = BeanMapper.map(input, TSbStowage.class);
        stowage.setStowageSn(stowageSn);
        stowage.setStatus(0);//0 未发车
        stowage.setSiteName(ProviderCommon.LSP);
        stowage.setSiteId(SequenceNumberCode.BODY_ID);
        stowage.setMainLineFeeStatus(0);//干线运费核销状态0未提交
        stowage.setBookerEmployeeId(user.getId());//服务商id
        stowage.setBookerEmployeeName(user.getRealUserName());//服务商姓名
        stowage.setCreateTime(new Date());
        stowage.setIsChange(0);//未变更
        stowage.setLspId(user.getId());//服务商id
        stowage.setLspCompanyName(user.getCompanyName());//服务商公司
        stowage.setType(1);


        //集散中心属性赋值
        stowage.setAllocCenterId(allocCentre.getId());
        stowage.setAllocCenterAddress(allocCentre.getAddress());
        stowage.setAllocCenterLinkName(allocCentre.getLinkname());
        stowage.setAllocCenterLinkPhone(allocCentre.getLinkmanPhone());
        stowage.setAllocCenterName(allocCentre.getName());

        stowageDao.insertSelective(stowage);

        TSbWaybillCriteria waybillCriteria = new TSbWaybillCriteria();
        waybillCriteria.createCriteria().andIdIn(input.getWaybillIds());
        List<TSbWaybill> waybills = waybillDao.selectByExample(waybillCriteria);


        if (null == waybills || waybills.isEmpty()) {
            return -6;
        }

        for (TSbWaybill waybill : waybills) {

            if (!input.getLspId().equals(waybill.getLspId())) {
                return -5;
            }

            if (!input.getAllocCenterId().equals(waybill.getAllocCenterId())) {
                return -5;
            }

            if (null == waybill.getStatus() || 15 != waybill.getStatus()) {
                return -5;
            }

            if (feeBalanceWithBenchmarkDao.countLspUnPay(waybill.getId()) > 0) {
                return -5; //存在未支付运单
            }
            modifyWaybillAndTrack(stowage, waybill.getId(), user);
        }

        return 1;
    }


    @Override
    public int updateStowage(EditStowageInput input) {
        TSbStowage stowage = stowageDao.selectByPrimaryKey(input.getId());
        if (null == stowage) {
            return -1; //配载单不存在
        }

        if (null == stowage.getStatus() || stowage.getStatus() != 0) {
            return -2; //配载状态 只有未发车可以修改配载
        }

        TlspUser user = userDao.selectByPrimaryKey(stowage.getLspId());
        if (null == user) {
            return -3; //用户不存在
        }

        AllocCentreOutput allocCentre = matchAllocCentre(stowage.getLspId(), input.getAllocCenterId());
        if (null == allocCentre) {
            return -4; //集散中心不存在或不匹配
        }

        BeanMapper.copy(input, stowage);

        stowage.setAllocCenterId(allocCentre.getId());
        stowage.setAllocCenterAddress(allocCentre.getAddress());
        stowage.setAllocCenterLinkName(allocCentre.getLinkname());
        stowage.setAllocCenterLinkPhone(allocCentre.getLinkmanPhone());
        stowage.setAllocCenterName(allocCentre.getName());

        stowageDao.updateByPrimaryKeySelective(stowage);

        List<Long> newWaybillIds = input.getWaybillIds();


        List<Long> oldWaybillIds = stowageBillGoodsLabelDao.selectListByStowageBillId(stowage.getId());


        //新增缓存
        List<Long> waybillAdd = new ArrayList(CollectionUtils.subtract(newWaybillIds, oldWaybillIds));
        //删除缓存
        List<Long> waybillDel = new ArrayList(CollectionUtils.subtract(oldWaybillIds, newWaybillIds));


        TSbWaybillCriteria waybillCriteria = new TSbWaybillCriteria();
        waybillCriteria.createCriteria().andIdIn(input.getWaybillIds());
        List<TSbWaybill> waybills = waybillDao.selectByExample(waybillCriteria);


        if (null == waybills || waybills.isEmpty()) {
            return -6;
        }


        for (TSbWaybill waybill : waybills) {

            if (!stowage.getLspId().equals(waybill.getLspId())) {
                return -5;
            }

            if (!input.getAllocCenterId().equals(waybill.getAllocCenterId())) {
                return -5;
            }

            if (null == waybill.getStatus() || (15 != waybill.getStatus() && !oldWaybillIds.contains(waybill.getId()))) {
                return -5;
            }

            //判断现付金额是否已经支付
            int count = feeBalanceWithBenchmarkDao.countLspUnPay(waybill.getId());
            if (count > 0) {
                return -5;
            }
        }


        if (!waybillDel.isEmpty()) {
            removeStowageWaybill(waybillDel, stowage, user);
            ExchangeUtils.afterCommit(applicationContext, new UpdateStowageEvent(this, waybillDel, stowage.getBookerEmployeeName()));
        }

        if (!waybillAdd.isEmpty()) {
            for (Long waybillId : waybillAdd) {
                modifyWaybillAndTrack(stowage, waybillId, user);
            }
            ExchangeUtils.afterCommit(applicationContext, new UpdateConfirmStowageEvent(this, stowage.getId(), waybillAdd, stowage.getBookerEmployeeName()));
        }

        return 1;
    }


    /**
     * 匹配集散中心
     *
     * @param lspId         服务商id
     * @param allocCentreId 集散中心id
     * @return 匹配的集散中心
     */
    private AllocCentreOutput matchAllocCentre(final Long lspId, final Long allocCentreId) {
        List<AllocCentreOutput> allocCentres = allocCentreService.findAllocCentreByLspIdWithDefault(lspId);

        AllocCentreOutput allocCentre = (AllocCentreOutput) CollectionUtils.find(allocCentres, new Predicate() {
            @Override
            public boolean evaluate(Object object) {
                return ((AllocCentreOutput) object).getId().equals(allocCentreId);
            }
        });

        return allocCentre;
    }


    /**
     * 移除配载中的运单信息,并还原状态
     *
     * @param waybillDel
     * @param stowage
     * @param user
     */
    private void removeStowageWaybill(List<Long> waybillDel, TSbStowage stowage, TlspUser user) {
        //更新运单状态
        TSbWaybillCriteria waybillUpdateCriteria = new TSbWaybillCriteria();
        waybillUpdateCriteria.createCriteria().andLspIdEqualTo(stowage.getLspId())
                .andIdIn(waybillDel);
        TSbWaybill waybill4Update = new TSbWaybill();
        waybill4Update.setStatus(15);
        waybillDao.updateByExampleSelective(waybill4Update, waybillUpdateCriteria);

        //更新运单货物标签状态
        TSbWaybillGoodLabelCriteria waybillGoodLabelCriteria = new TSbWaybillGoodLabelCriteria();
        waybillGoodLabelCriteria.createCriteria().andWaybillIdIn(waybillDel);
        TSbWaybillGoodLabel goodLabel4Update = new TSbWaybillGoodLabel();
        goodLabel4Update.setStatus(15);
        goodLabelDao.updateByExampleSelective(goodLabel4Update, waybillGoodLabelCriteria);

        //删除配置运单货物标签
        TSbStowageBillGoodsLabelCriteria stowageGoodLabelCriteria = new TSbStowageBillGoodsLabelCriteria();
        stowageGoodLabelCriteria.createCriteria().andStowageBillIdEqualTo(stowage.getId()).andWaybillIdIn(waybillDel);
        stowageBillGoodsLabelDao.deleteByExample(stowageGoodLabelCriteria);


        for (Long waybillId : waybillDel) {
            TSbWaybillTrack track = new TSbWaybillTrack();
            track.setStatus("货已到站");
            //track.setWaybillSn(waybill.getSn());
            track.setWaybillId(waybillId);
            track.setCreateUserId(user.getId());//服务商id
            track.setCreateUserName(user.getRealUserName());//服务商姓名
            track.setCreateTime(new Date());
            track.setUserBodyType(SequenceNumberCode.BODY_TYPE);
            track.setUserBodyId(SequenceNumberCode.BODY_ID);
            trackDao.insertSelective(track);
        }
    }


    /**
     * 修改运单状态和增加运单轨迹
     *
     * @param waybillId
     * @param user
     */
    private void modifyWaybillAndTrack(TSbStowage stowage, Long waybillId, TlspUser user) {


        TSbWaybillGoodLabelCriteria criteria = new TSbWaybillGoodLabelCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId);//运单号
        List<TSbWaybillGoodLabel> goodLabels = goodLabelDao.selectByExample(criteria);

        for (TSbWaybillGoodLabel goodLabel : goodLabels) {
            //配载运单标签
            TSbStowageBillGoodsLabel stowageLabel = new TSbStowageBillGoodsLabel();
            stowageLabel.setStowageBillId(stowage.getId());
            stowageLabel.setWaybillId(waybillId);//运单号
            stowageLabel.setWaybillGoodsLabelId(goodLabel.getId());
            stowageBillGoodsLabelDao.insertSelective(stowageLabel);
            //运单标签状态改为已配载
            goodLabel.setId(goodLabel.getId());
            goodLabel.setStatus(20);//20已配载
            goodLabelDao.updateByPrimaryKeySelective(goodLabel);
        }


        //运单状态改为已配载
        TSbWaybill sbWaybill = new TSbWaybill();
        sbWaybill.setId(waybillId);//运单号
        sbWaybill.setStatus(20);//20已配载
        waybillDao.updateByPrimaryKeySelective(sbWaybill);

        //运单状态扭转轨迹
        TSbWaybillTrack track = new TSbWaybillTrack();
        track.setStatus("已配载");
        track.setWaybillId(waybillId);//运单号
        track.setCreateUserId(user.getId());//服务商id
        track.setCreateUserName(user.getRealUserName());//服务商姓名
        track.setCreateTime(new Date());
        track.setUserBodyType(SequenceNumberCode.BODY_TYPE);
        track.setUserBodyId(SequenceNumberCode.BODY_ID);
        trackDao.insertSelective(track);
    }
}