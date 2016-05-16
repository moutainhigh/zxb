package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.input.LspReceiverShipperInfoInput;
import com.wangkuo.zxb.lsp.provider.db.po.TLspReceiverShipperInfo;
import com.wangkuo.zxb.lsp.provider.db.po.TLspReceiverShipperInfoCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@MyBatisDao
public interface TLspReceiverShipperInfoDao extends GenericDao<TLspReceiverShipperInfo, Long, TLspReceiverShipperInfoCriteria> {
    List<TLspReceiverShipperInfo> selectByMobileOrlinkName(@Param("example")LspReceiverShipperInfoInput lspuser, @Param("page")PageableImpl pageable);

    TLspReceiverShipperInfo selectLspReceiverShipperInfo(TLspReceiverShipperInfoCriteria criteria);

    List<TLspReceiverShipperInfo> queryReceiverShipperInfoByLspId(Map paramMap);
}