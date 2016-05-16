package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.AllotCenterOutput;
import com.wangkuo.zxb.mms.dto.params.QueryAllotCenterParam;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TAllocCentreDao extends GenericDao<TAllocCentre, Long, TAllocCentreExample> {
     List<AllotCenterOutput> findListByParams(@Param("query")QueryAllotCenterParam param, @Param("page") PageableImpl pageable);

     List<AllotCenterOutput> findListByParams(@Param("query")QueryAllotCenterParam param);

     List<TAllocCentre> selectListByUserAndPermissionCode(@Param("userId") Long userId,@Param("permissionCode") String permissionCode);
}