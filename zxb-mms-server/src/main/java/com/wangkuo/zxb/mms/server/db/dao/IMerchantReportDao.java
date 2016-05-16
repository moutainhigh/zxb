package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.dto.output.MerchantReportOutput;
import com.wangkuo.zxb.mms.dto.params.QueryMerchantReportParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by mark on 16/5/7.
 */
@MyBatisDao
public interface IMerchantReportDao extends GenericDao {
    List<MerchantReportOutput> report(@Param("param")QueryMerchantReportParam param, @Param("page")PageableImpl pageable);
}
