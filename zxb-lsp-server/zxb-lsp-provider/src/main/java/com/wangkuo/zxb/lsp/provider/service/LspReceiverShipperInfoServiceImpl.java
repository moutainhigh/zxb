package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.lsp.api.dto.input.LspReceiverShipperInfoInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspReceiverShipperInfoOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.dto.output.SbGoodCategoryOutput;
import com.wangkuo.zxb.lsp.api.service.ILspReceiverShipperInfoService;
import com.wangkuo.zxb.lsp.provider.db.dao.TLspReceiverShipperInfoDao;
import com.wangkuo.zxb.lsp.provider.db.po.TLspReceiverShipperInfo;
import com.wangkuo.zxb.lsp.provider.db.po.TLspReceiverShipperInfoCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-03-27
 */
@Service
public class LspReceiverShipperInfoServiceImpl implements ILspReceiverShipperInfoService {

    @Autowired
    private TLspReceiverShipperInfoDao lspReceiverShipperInfoDao;

    @Override
    public PagedList<LspReceiverShipperInfoOutput> getPagedList(LspReceiverShipperInfoInput input) {
        TLspReceiverShipperInfoCriteria criteria = new TLspReceiverShipperInfoCriteria();
        TLspReceiverShipperInfoCriteria criteria1 = new TLspReceiverShipperInfoCriteria();

        TLspReceiverShipperInfoCriteria.Criteria shipperctriteria = criteria.createCriteria();
        TLspReceiverShipperInfoCriteria.Criteria shipperctriteria1 = criteria1.createCriteria();

        shipperctriteria.andLspUserIdEqualTo(input.getLspUserId()).andTypeEqualTo(input.getType());
        shipperctriteria1.andLspUserIdEqualTo(input.getLspUserId()).andTypeEqualTo(input.getType());

        if (input.getLinkName() != null) {
            shipperctriteria.andLinkNameLike("%" + input.getLinkName().trim() + "%");
            shipperctriteria1.andMobileLike("%" + input.getLinkName().trim() + "%");
            criteria.or(shipperctriteria1);
        }

        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        List<TLspReceiverShipperInfo> branches = lspReceiverShipperInfoDao.selectByExample(criteria, pageable);
        List<LspReceiverShipperInfoOutput> lspReceiverShipperInfoOutputS = BeanMapper.mapList(branches, LspReceiverShipperInfoOutput.class);
        return new PagedList<LspReceiverShipperInfoOutput>(input, pageable.getCount(), lspReceiverShipperInfoOutputS);
    }

    @Override
    public int addreceiverShipper(LspReceiverShipperInfoInput input) {
        TLspReceiverShipperInfo info = new TLspReceiverShipperInfo();
        BeanMapper.copy(input, info);
        return lspReceiverShipperInfoDao.insertSelective(info);
    }

    @Override
    public LspReceiverShipperInfoOutput findOneRecord(Long id) {
        TLspReceiverShipperInfo info = lspReceiverShipperInfoDao.selectByPrimaryKey(id);
        LspReceiverShipperInfoOutput output = new LspReceiverShipperInfoOutput();
        BeanMapper.copy(info, output);
        return output;
    }

    @Override
    public int updateById(LspReceiverShipperInfoInput input) {
        TLspReceiverShipperInfo info = new TLspReceiverShipperInfo();
        BeanMapper.copy(input, info);
        return lspReceiverShipperInfoDao.updateByPrimaryKeySelective(info);
    }

    @Override
    public int updateByExample(LspReceiverShipperInfoInput input) {
        TLspReceiverShipperInfo info = new TLspReceiverShipperInfo();
        BeanMapper.copy(input, info);
        TLspReceiverShipperInfoCriteria criteria = new TLspReceiverShipperInfoCriteria();
        criteria.createCriteria().andLspUserIdEqualTo(input.getLspUserId()).andTypeEqualTo(input.getType());
        return lspReceiverShipperInfoDao.updateByExampleSelective(info, criteria);
    }

    @Override
    public int deleteById(Long id) {
        return lspReceiverShipperInfoDao.deleteByPrimaryKey(id);
    }

    @Override
    public int setDefalut(Long id) {
        LspReceiverShipperInfoOutput output = findOneRecord(id);
        /**先修改该服务商名下所有发货/收货人的默认状态为0*/
        LspReceiverShipperInfoInput input = new LspReceiverShipperInfoInput();
        //input.setId(id);
        input.setLspUserId(output.getLspUserId());
        input.setType(output.getType());
        input.setDefaultAddress(0);
        updateByExample(input);

        /**然后设置该条记录为默认*/
        input = new LspReceiverShipperInfoInput();
        input.setId(id);
        input.setDefaultAddress(1);

        return updateById(input);
    }

    @Override
    public List<LspReceiverShipperInfoOutput> findReceiverShipperInfoByLspId(Long lspId,String userName,Integer type){
        Map paramMap=new HashMap();
        paramMap.put("userName",userName);
        paramMap.put("lspId",lspId);
        paramMap.put("type",type);
        List<TLspReceiverShipperInfo> infoList = lspReceiverShipperInfoDao.queryReceiverShipperInfoByLspId(paramMap);
        List<LspReceiverShipperInfoOutput> infos = BeanMapper.mapList(infoList, LspReceiverShipperInfoOutput.class);
        return infos;
    }
}
