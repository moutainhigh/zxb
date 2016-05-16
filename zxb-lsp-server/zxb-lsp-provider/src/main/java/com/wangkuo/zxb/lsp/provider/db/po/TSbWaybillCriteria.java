package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbWaybillCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSystemSnIsNull() {
            addCriterion("system_sn is null");
            return (Criteria) this;
        }

        public Criteria andSystemSnIsNotNull() {
            addCriterion("system_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSystemSnEqualTo(String value) {
            addCriterion("system_sn =", value, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnNotEqualTo(String value) {
            addCriterion("system_sn <>", value, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnGreaterThan(String value) {
            addCriterion("system_sn >", value, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnGreaterThanOrEqualTo(String value) {
            addCriterion("system_sn >=", value, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnLessThan(String value) {
            addCriterion("system_sn <", value, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnLessThanOrEqualTo(String value) {
            addCriterion("system_sn <=", value, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnLike(String value) {
            addCriterion("system_sn like", value, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnNotLike(String value) {
            addCriterion("system_sn not like", value, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnIn(List<String> values) {
            addCriterion("system_sn in", values, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnNotIn(List<String> values) {
            addCriterion("system_sn not in", values, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnBetween(String value1, String value2) {
            addCriterion("system_sn between", value1, value2, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSystemSnNotBetween(String value1, String value2) {
            addCriterion("system_sn not between", value1, value2, "systemSn");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("operation_time is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(Date value) {
            addCriterion("operation_time =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(Date value) {
            addCriterion("operation_time <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(Date value) {
            addCriterion("operation_time >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operation_time >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(Date value) {
            addCriterion("operation_time <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("operation_time <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<Date> values) {
            addCriterion("operation_time in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<Date> values) {
            addCriterion("operation_time not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(Date value1, Date value2) {
            addCriterion("operation_time between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("operation_time not between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Long value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Long value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Long value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Long value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Long> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Long> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Long value1, Long value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("site_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("site_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("site_name =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("site_name <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("site_name >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_name >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("site_name <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("site_name <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("site_name like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("site_name not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("site_name in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("site_name not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("site_name between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("site_name not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andLspIdIsNull() {
            addCriterion("lsp_id is null");
            return (Criteria) this;
        }

        public Criteria andLspIdIsNotNull() {
            addCriterion("lsp_id is not null");
            return (Criteria) this;
        }

        public Criteria andLspIdEqualTo(Long value) {
            addCriterion("lsp_id =", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotEqualTo(Long value) {
            addCriterion("lsp_id <>", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdGreaterThan(Long value) {
            addCriterion("lsp_id >", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lsp_id >=", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLessThan(Long value) {
            addCriterion("lsp_id <", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLessThanOrEqualTo(Long value) {
            addCriterion("lsp_id <=", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdIn(List<Long> values) {
            addCriterion("lsp_id in", values, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotIn(List<Long> values) {
            addCriterion("lsp_id not in", values, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdBetween(Long value1, Long value2) {
            addCriterion("lsp_id between", value1, value2, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotBetween(Long value1, Long value2) {
            addCriterion("lsp_id not between", value1, value2, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameIsNull() {
            addCriterion("lsp_company_name is null");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameIsNotNull() {
            addCriterion("lsp_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameEqualTo(String value) {
            addCriterion("lsp_company_name =", value, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameNotEqualTo(String value) {
            addCriterion("lsp_company_name <>", value, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameGreaterThan(String value) {
            addCriterion("lsp_company_name >", value, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("lsp_company_name >=", value, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameLessThan(String value) {
            addCriterion("lsp_company_name <", value, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("lsp_company_name <=", value, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameLike(String value) {
            addCriterion("lsp_company_name like", value, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameNotLike(String value) {
            addCriterion("lsp_company_name not like", value, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameIn(List<String> values) {
            addCriterion("lsp_company_name in", values, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameNotIn(List<String> values) {
            addCriterion("lsp_company_name not in", values, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameBetween(String value1, String value2) {
            addCriterion("lsp_company_name between", value1, value2, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameNotBetween(String value1, String value2) {
            addCriterion("lsp_company_name not between", value1, value2, "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdIsNull() {
            addCriterion("alloc_center_id is null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdIsNotNull() {
            addCriterion("alloc_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdEqualTo(Long value) {
            addCriterion("alloc_center_id =", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdNotEqualTo(Long value) {
            addCriterion("alloc_center_id <>", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdGreaterThan(Long value) {
            addCriterion("alloc_center_id >", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("alloc_center_id >=", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdLessThan(Long value) {
            addCriterion("alloc_center_id <", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("alloc_center_id <=", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdIn(List<Long> values) {
            addCriterion("alloc_center_id in", values, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdNotIn(List<Long> values) {
            addCriterion("alloc_center_id not in", values, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdBetween(Long value1, Long value2) {
            addCriterion("alloc_center_id between", value1, value2, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("alloc_center_id not between", value1, value2, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameIsNull() {
            addCriterion("alloc_center_name is null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameIsNotNull() {
            addCriterion("alloc_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameEqualTo(String value) {
            addCriterion("alloc_center_name =", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameNotEqualTo(String value) {
            addCriterion("alloc_center_name <>", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameGreaterThan(String value) {
            addCriterion("alloc_center_name >", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("alloc_center_name >=", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLessThan(String value) {
            addCriterion("alloc_center_name <", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLessThanOrEqualTo(String value) {
            addCriterion("alloc_center_name <=", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLike(String value) {
            addCriterion("alloc_center_name like", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameNotLike(String value) {
            addCriterion("alloc_center_name not like", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameIn(List<String> values) {
            addCriterion("alloc_center_name in", values, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameNotIn(List<String> values) {
            addCriterion("alloc_center_name not in", values, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameBetween(String value1, String value2) {
            addCriterion("alloc_center_name between", value1, value2, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameNotBetween(String value1, String value2) {
            addCriterion("alloc_center_name not between", value1, value2, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdIsNull() {
            addCriterion("shipper_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdIsNotNull() {
            addCriterion("shipper_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdEqualTo(Long value) {
            addCriterion("shipper_customer_id =", value, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdNotEqualTo(Long value) {
            addCriterion("shipper_customer_id <>", value, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdGreaterThan(Long value) {
            addCriterion("shipper_customer_id >", value, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shipper_customer_id >=", value, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdLessThan(Long value) {
            addCriterion("shipper_customer_id <", value, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("shipper_customer_id <=", value, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdIn(List<Long> values) {
            addCriterion("shipper_customer_id in", values, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdNotIn(List<Long> values) {
            addCriterion("shipper_customer_id not in", values, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdBetween(Long value1, Long value2) {
            addCriterion("shipper_customer_id between", value1, value2, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("shipper_customer_id not between", value1, value2, "shipperCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeIsNull() {
            addCriterion("shipper_customer_code is null");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeIsNotNull() {
            addCriterion("shipper_customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeEqualTo(String value) {
            addCriterion("shipper_customer_code =", value, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeNotEqualTo(String value) {
            addCriterion("shipper_customer_code <>", value, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeGreaterThan(String value) {
            addCriterion("shipper_customer_code >", value, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_customer_code >=", value, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeLessThan(String value) {
            addCriterion("shipper_customer_code <", value, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("shipper_customer_code <=", value, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeLike(String value) {
            addCriterion("shipper_customer_code like", value, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeNotLike(String value) {
            addCriterion("shipper_customer_code not like", value, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeIn(List<String> values) {
            addCriterion("shipper_customer_code in", values, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeNotIn(List<String> values) {
            addCriterion("shipper_customer_code not in", values, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeBetween(String value1, String value2) {
            addCriterion("shipper_customer_code between", value1, value2, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("shipper_customer_code not between", value1, value2, "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameIsNull() {
            addCriterion("shipper_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameIsNotNull() {
            addCriterion("shipper_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameEqualTo(String value) {
            addCriterion("shipper_customer_name =", value, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameNotEqualTo(String value) {
            addCriterion("shipper_customer_name <>", value, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameGreaterThan(String value) {
            addCriterion("shipper_customer_name >", value, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_customer_name >=", value, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameLessThan(String value) {
            addCriterion("shipper_customer_name <", value, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("shipper_customer_name <=", value, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameLike(String value) {
            addCriterion("shipper_customer_name like", value, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameNotLike(String value) {
            addCriterion("shipper_customer_name not like", value, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameIn(List<String> values) {
            addCriterion("shipper_customer_name in", values, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameNotIn(List<String> values) {
            addCriterion("shipper_customer_name not in", values, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameBetween(String value1, String value2) {
            addCriterion("shipper_customer_name between", value1, value2, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameNotBetween(String value1, String value2) {
            addCriterion("shipper_customer_name not between", value1, value2, "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdIsNull() {
            addCriterion("shipper_province_id is null");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdIsNotNull() {
            addCriterion("shipper_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdEqualTo(Long value) {
            addCriterion("shipper_province_id =", value, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdNotEqualTo(Long value) {
            addCriterion("shipper_province_id <>", value, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdGreaterThan(Long value) {
            addCriterion("shipper_province_id >", value, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shipper_province_id >=", value, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdLessThan(Long value) {
            addCriterion("shipper_province_id <", value, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("shipper_province_id <=", value, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdIn(List<Long> values) {
            addCriterion("shipper_province_id in", values, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdNotIn(List<Long> values) {
            addCriterion("shipper_province_id not in", values, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdBetween(Long value1, Long value2) {
            addCriterion("shipper_province_id between", value1, value2, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("shipper_province_id not between", value1, value2, "shipperProvinceId");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameIsNull() {
            addCriterion("shipper_province_name is null");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameIsNotNull() {
            addCriterion("shipper_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameEqualTo(String value) {
            addCriterion("shipper_province_name =", value, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameNotEqualTo(String value) {
            addCriterion("shipper_province_name <>", value, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameGreaterThan(String value) {
            addCriterion("shipper_province_name >", value, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_province_name >=", value, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameLessThan(String value) {
            addCriterion("shipper_province_name <", value, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("shipper_province_name <=", value, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameLike(String value) {
            addCriterion("shipper_province_name like", value, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameNotLike(String value) {
            addCriterion("shipper_province_name not like", value, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameIn(List<String> values) {
            addCriterion("shipper_province_name in", values, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameNotIn(List<String> values) {
            addCriterion("shipper_province_name not in", values, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameBetween(String value1, String value2) {
            addCriterion("shipper_province_name between", value1, value2, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameNotBetween(String value1, String value2) {
            addCriterion("shipper_province_name not between", value1, value2, "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdIsNull() {
            addCriterion("shipper_city_id is null");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdIsNotNull() {
            addCriterion("shipper_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdEqualTo(Long value) {
            addCriterion("shipper_city_id =", value, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdNotEqualTo(Long value) {
            addCriterion("shipper_city_id <>", value, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdGreaterThan(Long value) {
            addCriterion("shipper_city_id >", value, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shipper_city_id >=", value, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdLessThan(Long value) {
            addCriterion("shipper_city_id <", value, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdLessThanOrEqualTo(Long value) {
            addCriterion("shipper_city_id <=", value, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdIn(List<Long> values) {
            addCriterion("shipper_city_id in", values, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdNotIn(List<Long> values) {
            addCriterion("shipper_city_id not in", values, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdBetween(Long value1, Long value2) {
            addCriterion("shipper_city_id between", value1, value2, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityIdNotBetween(Long value1, Long value2) {
            addCriterion("shipper_city_id not between", value1, value2, "shipperCityId");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameIsNull() {
            addCriterion("shipper_city_name is null");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameIsNotNull() {
            addCriterion("shipper_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameEqualTo(String value) {
            addCriterion("shipper_city_name =", value, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameNotEqualTo(String value) {
            addCriterion("shipper_city_name <>", value, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameGreaterThan(String value) {
            addCriterion("shipper_city_name >", value, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_city_name >=", value, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameLessThan(String value) {
            addCriterion("shipper_city_name <", value, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameLessThanOrEqualTo(String value) {
            addCriterion("shipper_city_name <=", value, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameLike(String value) {
            addCriterion("shipper_city_name like", value, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameNotLike(String value) {
            addCriterion("shipper_city_name not like", value, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameIn(List<String> values) {
            addCriterion("shipper_city_name in", values, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameNotIn(List<String> values) {
            addCriterion("shipper_city_name not in", values, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameBetween(String value1, String value2) {
            addCriterion("shipper_city_name between", value1, value2, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameNotBetween(String value1, String value2) {
            addCriterion("shipper_city_name not between", value1, value2, "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdIsNull() {
            addCriterion("shipper_country_id is null");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdIsNotNull() {
            addCriterion("shipper_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdEqualTo(Long value) {
            addCriterion("shipper_country_id =", value, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdNotEqualTo(Long value) {
            addCriterion("shipper_country_id <>", value, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdGreaterThan(Long value) {
            addCriterion("shipper_country_id >", value, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shipper_country_id >=", value, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdLessThan(Long value) {
            addCriterion("shipper_country_id <", value, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("shipper_country_id <=", value, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdIn(List<Long> values) {
            addCriterion("shipper_country_id in", values, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdNotIn(List<Long> values) {
            addCriterion("shipper_country_id not in", values, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdBetween(Long value1, Long value2) {
            addCriterion("shipper_country_id between", value1, value2, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("shipper_country_id not between", value1, value2, "shipperCountryId");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameIsNull() {
            addCriterion("shipper_country_name is null");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameIsNotNull() {
            addCriterion("shipper_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameEqualTo(String value) {
            addCriterion("shipper_country_name =", value, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameNotEqualTo(String value) {
            addCriterion("shipper_country_name <>", value, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameGreaterThan(String value) {
            addCriterion("shipper_country_name >", value, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_country_name >=", value, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameLessThan(String value) {
            addCriterion("shipper_country_name <", value, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameLessThanOrEqualTo(String value) {
            addCriterion("shipper_country_name <=", value, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameLike(String value) {
            addCriterion("shipper_country_name like", value, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameNotLike(String value) {
            addCriterion("shipper_country_name not like", value, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameIn(List<String> values) {
            addCriterion("shipper_country_name in", values, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameNotIn(List<String> values) {
            addCriterion("shipper_country_name not in", values, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameBetween(String value1, String value2) {
            addCriterion("shipper_country_name between", value1, value2, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameNotBetween(String value1, String value2) {
            addCriterion("shipper_country_name not between", value1, value2, "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdIsNull() {
            addCriterion("shipper_town_id is null");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdIsNotNull() {
            addCriterion("shipper_town_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdEqualTo(Long value) {
            addCriterion("shipper_town_id =", value, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdNotEqualTo(Long value) {
            addCriterion("shipper_town_id <>", value, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdGreaterThan(Long value) {
            addCriterion("shipper_town_id >", value, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shipper_town_id >=", value, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdLessThan(Long value) {
            addCriterion("shipper_town_id <", value, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdLessThanOrEqualTo(Long value) {
            addCriterion("shipper_town_id <=", value, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdIn(List<Long> values) {
            addCriterion("shipper_town_id in", values, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdNotIn(List<Long> values) {
            addCriterion("shipper_town_id not in", values, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdBetween(Long value1, Long value2) {
            addCriterion("shipper_town_id between", value1, value2, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownIdNotBetween(Long value1, Long value2) {
            addCriterion("shipper_town_id not between", value1, value2, "shipperTownId");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameIsNull() {
            addCriterion("shipper_town_name is null");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameIsNotNull() {
            addCriterion("shipper_town_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameEqualTo(String value) {
            addCriterion("shipper_town_name =", value, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameNotEqualTo(String value) {
            addCriterion("shipper_town_name <>", value, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameGreaterThan(String value) {
            addCriterion("shipper_town_name >", value, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_town_name >=", value, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameLessThan(String value) {
            addCriterion("shipper_town_name <", value, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameLessThanOrEqualTo(String value) {
            addCriterion("shipper_town_name <=", value, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameLike(String value) {
            addCriterion("shipper_town_name like", value, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameNotLike(String value) {
            addCriterion("shipper_town_name not like", value, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameIn(List<String> values) {
            addCriterion("shipper_town_name in", values, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameNotIn(List<String> values) {
            addCriterion("shipper_town_name not in", values, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameBetween(String value1, String value2) {
            addCriterion("shipper_town_name between", value1, value2, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameNotBetween(String value1, String value2) {
            addCriterion("shipper_town_name not between", value1, value2, "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperAddressIsNull() {
            addCriterion("shipper_address is null");
            return (Criteria) this;
        }

        public Criteria andShipperAddressIsNotNull() {
            addCriterion("shipper_address is not null");
            return (Criteria) this;
        }

        public Criteria andShipperAddressEqualTo(String value) {
            addCriterion("shipper_address =", value, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressNotEqualTo(String value) {
            addCriterion("shipper_address <>", value, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressGreaterThan(String value) {
            addCriterion("shipper_address >", value, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_address >=", value, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressLessThan(String value) {
            addCriterion("shipper_address <", value, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressLessThanOrEqualTo(String value) {
            addCriterion("shipper_address <=", value, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressLike(String value) {
            addCriterion("shipper_address like", value, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressNotLike(String value) {
            addCriterion("shipper_address not like", value, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressIn(List<String> values) {
            addCriterion("shipper_address in", values, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressNotIn(List<String> values) {
            addCriterion("shipper_address not in", values, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressBetween(String value1, String value2) {
            addCriterion("shipper_address between", value1, value2, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperAddressNotBetween(String value1, String value2) {
            addCriterion("shipper_address not between", value1, value2, "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameIsNull() {
            addCriterion("shipper_link_name is null");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameIsNotNull() {
            addCriterion("shipper_link_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameEqualTo(String value) {
            addCriterion("shipper_link_name =", value, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameNotEqualTo(String value) {
            addCriterion("shipper_link_name <>", value, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameGreaterThan(String value) {
            addCriterion("shipper_link_name >", value, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_link_name >=", value, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameLessThan(String value) {
            addCriterion("shipper_link_name <", value, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameLessThanOrEqualTo(String value) {
            addCriterion("shipper_link_name <=", value, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameLike(String value) {
            addCriterion("shipper_link_name like", value, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameNotLike(String value) {
            addCriterion("shipper_link_name not like", value, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameIn(List<String> values) {
            addCriterion("shipper_link_name in", values, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameNotIn(List<String> values) {
            addCriterion("shipper_link_name not in", values, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameBetween(String value1, String value2) {
            addCriterion("shipper_link_name between", value1, value2, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameNotBetween(String value1, String value2) {
            addCriterion("shipper_link_name not between", value1, value2, "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneIsNull() {
            addCriterion("shipper_link_phone is null");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneIsNotNull() {
            addCriterion("shipper_link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneEqualTo(String value) {
            addCriterion("shipper_link_phone =", value, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneNotEqualTo(String value) {
            addCriterion("shipper_link_phone <>", value, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneGreaterThan(String value) {
            addCriterion("shipper_link_phone >", value, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_link_phone >=", value, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneLessThan(String value) {
            addCriterion("shipper_link_phone <", value, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("shipper_link_phone <=", value, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneLike(String value) {
            addCriterion("shipper_link_phone like", value, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneNotLike(String value) {
            addCriterion("shipper_link_phone not like", value, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneIn(List<String> values) {
            addCriterion("shipper_link_phone in", values, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneNotIn(List<String> values) {
            addCriterion("shipper_link_phone not in", values, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneBetween(String value1, String value2) {
            addCriterion("shipper_link_phone between", value1, value2, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("shipper_link_phone not between", value1, value2, "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdIsNull() {
            addCriterion("receive_province_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdIsNotNull() {
            addCriterion("receive_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdEqualTo(Long value) {
            addCriterion("receive_province_id =", value, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdNotEqualTo(Long value) {
            addCriterion("receive_province_id <>", value, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdGreaterThan(Long value) {
            addCriterion("receive_province_id >", value, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_province_id >=", value, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdLessThan(Long value) {
            addCriterion("receive_province_id <", value, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("receive_province_id <=", value, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdIn(List<Long> values) {
            addCriterion("receive_province_id in", values, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdNotIn(List<Long> values) {
            addCriterion("receive_province_id not in", values, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdBetween(Long value1, Long value2) {
            addCriterion("receive_province_id between", value1, value2, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("receive_province_id not between", value1, value2, "receiveProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameIsNull() {
            addCriterion("receive_province_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameIsNotNull() {
            addCriterion("receive_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameEqualTo(String value) {
            addCriterion("receive_province_name =", value, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameNotEqualTo(String value) {
            addCriterion("receive_province_name <>", value, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameGreaterThan(String value) {
            addCriterion("receive_province_name >", value, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_province_name >=", value, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameLessThan(String value) {
            addCriterion("receive_province_name <", value, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("receive_province_name <=", value, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameLike(String value) {
            addCriterion("receive_province_name like", value, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameNotLike(String value) {
            addCriterion("receive_province_name not like", value, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameIn(List<String> values) {
            addCriterion("receive_province_name in", values, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameNotIn(List<String> values) {
            addCriterion("receive_province_name not in", values, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameBetween(String value1, String value2) {
            addCriterion("receive_province_name between", value1, value2, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameNotBetween(String value1, String value2) {
            addCriterion("receive_province_name not between", value1, value2, "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdIsNull() {
            addCriterion("receive_city_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdIsNotNull() {
            addCriterion("receive_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdEqualTo(Long value) {
            addCriterion("receive_city_id =", value, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdNotEqualTo(Long value) {
            addCriterion("receive_city_id <>", value, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdGreaterThan(Long value) {
            addCriterion("receive_city_id >", value, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_city_id >=", value, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdLessThan(Long value) {
            addCriterion("receive_city_id <", value, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdLessThanOrEqualTo(Long value) {
            addCriterion("receive_city_id <=", value, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdIn(List<Long> values) {
            addCriterion("receive_city_id in", values, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdNotIn(List<Long> values) {
            addCriterion("receive_city_id not in", values, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdBetween(Long value1, Long value2) {
            addCriterion("receive_city_id between", value1, value2, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIdNotBetween(Long value1, Long value2) {
            addCriterion("receive_city_id not between", value1, value2, "receiveCityId");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameIsNull() {
            addCriterion("receive_city_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameIsNotNull() {
            addCriterion("receive_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameEqualTo(String value) {
            addCriterion("receive_city_name =", value, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameNotEqualTo(String value) {
            addCriterion("receive_city_name <>", value, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameGreaterThan(String value) {
            addCriterion("receive_city_name >", value, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_city_name >=", value, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameLessThan(String value) {
            addCriterion("receive_city_name <", value, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameLessThanOrEqualTo(String value) {
            addCriterion("receive_city_name <=", value, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameLike(String value) {
            addCriterion("receive_city_name like", value, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameNotLike(String value) {
            addCriterion("receive_city_name not like", value, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameIn(List<String> values) {
            addCriterion("receive_city_name in", values, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameNotIn(List<String> values) {
            addCriterion("receive_city_name not in", values, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameBetween(String value1, String value2) {
            addCriterion("receive_city_name between", value1, value2, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameNotBetween(String value1, String value2) {
            addCriterion("receive_city_name not between", value1, value2, "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdIsNull() {
            addCriterion("receive_country_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdIsNotNull() {
            addCriterion("receive_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdEqualTo(Long value) {
            addCriterion("receive_country_id =", value, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdNotEqualTo(Long value) {
            addCriterion("receive_country_id <>", value, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdGreaterThan(Long value) {
            addCriterion("receive_country_id >", value, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_country_id >=", value, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdLessThan(Long value) {
            addCriterion("receive_country_id <", value, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("receive_country_id <=", value, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdIn(List<Long> values) {
            addCriterion("receive_country_id in", values, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdNotIn(List<Long> values) {
            addCriterion("receive_country_id not in", values, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdBetween(Long value1, Long value2) {
            addCriterion("receive_country_id between", value1, value2, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("receive_country_id not between", value1, value2, "receiveCountryId");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameIsNull() {
            addCriterion("receive_country_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameIsNotNull() {
            addCriterion("receive_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameEqualTo(String value) {
            addCriterion("receive_country_name =", value, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameNotEqualTo(String value) {
            addCriterion("receive_country_name <>", value, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameGreaterThan(String value) {
            addCriterion("receive_country_name >", value, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_country_name >=", value, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameLessThan(String value) {
            addCriterion("receive_country_name <", value, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameLessThanOrEqualTo(String value) {
            addCriterion("receive_country_name <=", value, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameLike(String value) {
            addCriterion("receive_country_name like", value, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameNotLike(String value) {
            addCriterion("receive_country_name not like", value, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameIn(List<String> values) {
            addCriterion("receive_country_name in", values, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameNotIn(List<String> values) {
            addCriterion("receive_country_name not in", values, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameBetween(String value1, String value2) {
            addCriterion("receive_country_name between", value1, value2, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameNotBetween(String value1, String value2) {
            addCriterion("receive_country_name not between", value1, value2, "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNull() {
            addCriterion("receive_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNotNull() {
            addCriterion("receive_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressEqualTo(String value) {
            addCriterion("receive_address =", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotEqualTo(String value) {
            addCriterion("receive_address <>", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThan(String value) {
            addCriterion("receive_address >", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receive_address >=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThan(String value) {
            addCriterion("receive_address <", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("receive_address <=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLike(String value) {
            addCriterion("receive_address like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotLike(String value) {
            addCriterion("receive_address not like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIn(List<String> values) {
            addCriterion("receive_address in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotIn(List<String> values) {
            addCriterion("receive_address not in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressBetween(String value1, String value2) {
            addCriterion("receive_address between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("receive_address not between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameIsNull() {
            addCriterion("receive_link_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameIsNotNull() {
            addCriterion("receive_link_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameEqualTo(String value) {
            addCriterion("receive_link_name =", value, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameNotEqualTo(String value) {
            addCriterion("receive_link_name <>", value, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameGreaterThan(String value) {
            addCriterion("receive_link_name >", value, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_link_name >=", value, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameLessThan(String value) {
            addCriterion("receive_link_name <", value, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameLessThanOrEqualTo(String value) {
            addCriterion("receive_link_name <=", value, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameLike(String value) {
            addCriterion("receive_link_name like", value, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameNotLike(String value) {
            addCriterion("receive_link_name not like", value, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameIn(List<String> values) {
            addCriterion("receive_link_name in", values, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameNotIn(List<String> values) {
            addCriterion("receive_link_name not in", values, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameBetween(String value1, String value2) {
            addCriterion("receive_link_name between", value1, value2, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameNotBetween(String value1, String value2) {
            addCriterion("receive_link_name not between", value1, value2, "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneIsNull() {
            addCriterion("receive_link_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneIsNotNull() {
            addCriterion("receive_link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneEqualTo(String value) {
            addCriterion("receive_link_phone =", value, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneNotEqualTo(String value) {
            addCriterion("receive_link_phone <>", value, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneGreaterThan(String value) {
            addCriterion("receive_link_phone >", value, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_link_phone >=", value, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneLessThan(String value) {
            addCriterion("receive_link_phone <", value, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("receive_link_phone <=", value, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneLike(String value) {
            addCriterion("receive_link_phone like", value, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneNotLike(String value) {
            addCriterion("receive_link_phone not like", value, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneIn(List<String> values) {
            addCriterion("receive_link_phone in", values, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneNotIn(List<String> values) {
            addCriterion("receive_link_phone not in", values, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneBetween(String value1, String value2) {
            addCriterion("receive_link_phone between", value1, value2, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("receive_link_phone not between", value1, value2, "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andIsDamageIsNull() {
            addCriterion("is_damage is null");
            return (Criteria) this;
        }

        public Criteria andIsDamageIsNotNull() {
            addCriterion("is_damage is not null");
            return (Criteria) this;
        }

        public Criteria andIsDamageEqualTo(Integer value) {
            addCriterion("is_damage =", value, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageNotEqualTo(Integer value) {
            addCriterion("is_damage <>", value, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageGreaterThan(Integer value) {
            addCriterion("is_damage >", value, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_damage >=", value, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageLessThan(Integer value) {
            addCriterion("is_damage <", value, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageLessThanOrEqualTo(Integer value) {
            addCriterion("is_damage <=", value, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageIn(List<Integer> values) {
            addCriterion("is_damage in", values, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageNotIn(List<Integer> values) {
            addCriterion("is_damage not in", values, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageBetween(Integer value1, Integer value2) {
            addCriterion("is_damage between", value1, value2, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsDamageNotBetween(Integer value1, Integer value2) {
            addCriterion("is_damage not between", value1, value2, "isDamage");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNull() {
            addCriterion("is_change is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNotNull() {
            addCriterion("is_change is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeEqualTo(Integer value) {
            addCriterion("is_change =", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotEqualTo(Integer value) {
            addCriterion("is_change <>", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThan(Integer value) {
            addCriterion("is_change >", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_change >=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThan(Integer value) {
            addCriterion("is_change <", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThanOrEqualTo(Integer value) {
            addCriterion("is_change <=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeIn(List<Integer> values) {
            addCriterion("is_change in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotIn(List<Integer> values) {
            addCriterion("is_change not in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeBetween(Integer value1, Integer value2) {
            addCriterion("is_change between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_change not between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdIsNull() {
            addCriterion("delete_reason_id is null");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdIsNotNull() {
            addCriterion("delete_reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdEqualTo(Long value) {
            addCriterion("delete_reason_id =", value, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdNotEqualTo(Long value) {
            addCriterion("delete_reason_id <>", value, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdGreaterThan(Long value) {
            addCriterion("delete_reason_id >", value, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("delete_reason_id >=", value, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdLessThan(Long value) {
            addCriterion("delete_reason_id <", value, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdLessThanOrEqualTo(Long value) {
            addCriterion("delete_reason_id <=", value, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdIn(List<Long> values) {
            addCriterion("delete_reason_id in", values, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdNotIn(List<Long> values) {
            addCriterion("delete_reason_id not in", values, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdBetween(Long value1, Long value2) {
            addCriterion("delete_reason_id between", value1, value2, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIdNotBetween(Long value1, Long value2) {
            addCriterion("delete_reason_id not between", value1, value2, "deleteReasonId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIsNull() {
            addCriterion("delete_reason is null");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIsNotNull() {
            addCriterion("delete_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonEqualTo(String value) {
            addCriterion("delete_reason =", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonNotEqualTo(String value) {
            addCriterion("delete_reason <>", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonGreaterThan(String value) {
            addCriterion("delete_reason >", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonGreaterThanOrEqualTo(String value) {
            addCriterion("delete_reason >=", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonLessThan(String value) {
            addCriterion("delete_reason <", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonLessThanOrEqualTo(String value) {
            addCriterion("delete_reason <=", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonLike(String value) {
            addCriterion("delete_reason like", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonNotLike(String value) {
            addCriterion("delete_reason not like", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIn(List<String> values) {
            addCriterion("delete_reason in", values, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonNotIn(List<String> values) {
            addCriterion("delete_reason not in", values, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonBetween(String value1, String value2) {
            addCriterion("delete_reason between", value1, value2, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonNotBetween(String value1, String value2) {
            addCriterion("delete_reason not between", value1, value2, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoIsNull() {
            addCriterion("delete_reason_memo is null");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoIsNotNull() {
            addCriterion("delete_reason_memo is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoEqualTo(String value) {
            addCriterion("delete_reason_memo =", value, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoNotEqualTo(String value) {
            addCriterion("delete_reason_memo <>", value, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoGreaterThan(String value) {
            addCriterion("delete_reason_memo >", value, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoGreaterThanOrEqualTo(String value) {
            addCriterion("delete_reason_memo >=", value, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoLessThan(String value) {
            addCriterion("delete_reason_memo <", value, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoLessThanOrEqualTo(String value) {
            addCriterion("delete_reason_memo <=", value, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoLike(String value) {
            addCriterion("delete_reason_memo like", value, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoNotLike(String value) {
            addCriterion("delete_reason_memo not like", value, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoIn(List<String> values) {
            addCriterion("delete_reason_memo in", values, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoNotIn(List<String> values) {
            addCriterion("delete_reason_memo not in", values, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoBetween(String value1, String value2) {
            addCriterion("delete_reason_memo between", value1, value2, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoNotBetween(String value1, String value2) {
            addCriterion("delete_reason_memo not between", value1, value2, "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andConnectTypeIsNull() {
            addCriterion("connect_type is null");
            return (Criteria) this;
        }

        public Criteria andConnectTypeIsNotNull() {
            addCriterion("connect_type is not null");
            return (Criteria) this;
        }

        public Criteria andConnectTypeEqualTo(Integer value) {
            addCriterion("connect_type =", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeNotEqualTo(Integer value) {
            addCriterion("connect_type <>", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeGreaterThan(Integer value) {
            addCriterion("connect_type >", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("connect_type >=", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeLessThan(Integer value) {
            addCriterion("connect_type <", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("connect_type <=", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeIn(List<Integer> values) {
            addCriterion("connect_type in", values, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeNotIn(List<Integer> values) {
            addCriterion("connect_type not in", values, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeBetween(Integer value1, Integer value2) {
            addCriterion("connect_type between", value1, value2, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("connect_type not between", value1, value2, "connectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeIsNull() {
            addCriterion("other_connect_type is null");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeIsNotNull() {
            addCriterion("other_connect_type is not null");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeEqualTo(String value) {
            addCriterion("other_connect_type =", value, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeNotEqualTo(String value) {
            addCriterion("other_connect_type <>", value, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeGreaterThan(String value) {
            addCriterion("other_connect_type >", value, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("other_connect_type >=", value, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeLessThan(String value) {
            addCriterion("other_connect_type <", value, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeLessThanOrEqualTo(String value) {
            addCriterion("other_connect_type <=", value, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeLike(String value) {
            addCriterion("other_connect_type like", value, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeNotLike(String value) {
            addCriterion("other_connect_type not like", value, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeIn(List<String> values) {
            addCriterion("other_connect_type in", values, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeNotIn(List<String> values) {
            addCriterion("other_connect_type not in", values, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeBetween(String value1, String value2) {
            addCriterion("other_connect_type between", value1, value2, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeNotBetween(String value1, String value2) {
            addCriterion("other_connect_type not between", value1, value2, "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIsNull() {
            addCriterion("balance_type is null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIsNotNull() {
            addCriterion("balance_type is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeEqualTo(Integer value) {
            addCriterion("balance_type =", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotEqualTo(Integer value) {
            addCriterion("balance_type <>", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeGreaterThan(Integer value) {
            addCriterion("balance_type >", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_type >=", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeLessThan(Integer value) {
            addCriterion("balance_type <", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("balance_type <=", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIn(List<Integer> values) {
            addCriterion("balance_type in", values, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotIn(List<Integer> values) {
            addCriterion("balance_type not in", values, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeBetween(Integer value1, Integer value2) {
            addCriterion("balance_type between", value1, value2, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_type not between", value1, value2, "balanceType");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptIsNull() {
            addCriterion("is_need_receipt is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptIsNotNull() {
            addCriterion("is_need_receipt is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptEqualTo(Integer value) {
            addCriterion("is_need_receipt =", value, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptNotEqualTo(Integer value) {
            addCriterion("is_need_receipt <>", value, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptGreaterThan(Integer value) {
            addCriterion("is_need_receipt >", value, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_need_receipt >=", value, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptLessThan(Integer value) {
            addCriterion("is_need_receipt <", value, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptLessThanOrEqualTo(Integer value) {
            addCriterion("is_need_receipt <=", value, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptIn(List<Integer> values) {
            addCriterion("is_need_receipt in", values, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptNotIn(List<Integer> values) {
            addCriterion("is_need_receipt not in", values, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptBetween(Integer value1, Integer value2) {
            addCriterion("is_need_receipt between", value1, value2, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsNeedReceiptNotBetween(Integer value1, Integer value2) {
            addCriterion("is_need_receipt not between", value1, value2, "isNeedReceipt");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketIsNull() {
            addCriterion("is_open_ticket is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketIsNotNull() {
            addCriterion("is_open_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketEqualTo(Integer value) {
            addCriterion("is_open_ticket =", value, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketNotEqualTo(Integer value) {
            addCriterion("is_open_ticket <>", value, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketGreaterThan(Integer value) {
            addCriterion("is_open_ticket >", value, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_open_ticket >=", value, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketLessThan(Integer value) {
            addCriterion("is_open_ticket <", value, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketLessThanOrEqualTo(Integer value) {
            addCriterion("is_open_ticket <=", value, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketIn(List<Integer> values) {
            addCriterion("is_open_ticket in", values, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketNotIn(List<Integer> values) {
            addCriterion("is_open_ticket not in", values, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketBetween(Integer value1, Integer value2) {
            addCriterion("is_open_ticket between", value1, value2, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andIsOpenTicketNotBetween(Integer value1, Integer value2) {
            addCriterion("is_open_ticket not between", value1, value2, "isOpenTicket");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNull() {
            addCriterion("ticket_name is null");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNotNull() {
            addCriterion("ticket_name is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNameEqualTo(String value) {
            addCriterion("ticket_name =", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotEqualTo(String value) {
            addCriterion("ticket_name <>", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThan(String value) {
            addCriterion("ticket_name >", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_name >=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThan(String value) {
            addCriterion("ticket_name <", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThanOrEqualTo(String value) {
            addCriterion("ticket_name <=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLike(String value) {
            addCriterion("ticket_name like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotLike(String value) {
            addCriterion("ticket_name not like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameIn(List<String> values) {
            addCriterion("ticket_name in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotIn(List<String> values) {
            addCriterion("ticket_name not in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameBetween(String value1, String value2) {
            addCriterion("ticket_name between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotBetween(String value1, String value2) {
            addCriterion("ticket_name not between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeIsNull() {
            addCriterion("load_unload_type is null");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeIsNotNull() {
            addCriterion("load_unload_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeEqualTo(Integer value) {
            addCriterion("load_unload_type =", value, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeNotEqualTo(Integer value) {
            addCriterion("load_unload_type <>", value, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeGreaterThan(Integer value) {
            addCriterion("load_unload_type >", value, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_unload_type >=", value, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeLessThan(Integer value) {
            addCriterion("load_unload_type <", value, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeLessThanOrEqualTo(Integer value) {
            addCriterion("load_unload_type <=", value, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeIn(List<Integer> values) {
            addCriterion("load_unload_type in", values, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeNotIn(List<Integer> values) {
            addCriterion("load_unload_type not in", values, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeBetween(Integer value1, Integer value2) {
            addCriterion("load_unload_type between", value1, value2, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("load_unload_type not between", value1, value2, "loadUnloadType");
            return (Criteria) this;
        }

        public Criteria andStackRequireIsNull() {
            addCriterion("stack_require is null");
            return (Criteria) this;
        }

        public Criteria andStackRequireIsNotNull() {
            addCriterion("stack_require is not null");
            return (Criteria) this;
        }

        public Criteria andStackRequireEqualTo(String value) {
            addCriterion("stack_require =", value, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireNotEqualTo(String value) {
            addCriterion("stack_require <>", value, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireGreaterThan(String value) {
            addCriterion("stack_require >", value, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireGreaterThanOrEqualTo(String value) {
            addCriterion("stack_require >=", value, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireLessThan(String value) {
            addCriterion("stack_require <", value, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireLessThanOrEqualTo(String value) {
            addCriterion("stack_require <=", value, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireLike(String value) {
            addCriterion("stack_require like", value, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireNotLike(String value) {
            addCriterion("stack_require not like", value, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireIn(List<String> values) {
            addCriterion("stack_require in", values, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireNotIn(List<String> values) {
            addCriterion("stack_require not in", values, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireBetween(String value1, String value2) {
            addCriterion("stack_require between", value1, value2, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andStackRequireNotBetween(String value1, String value2) {
            addCriterion("stack_require not between", value1, value2, "stackRequire");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(Integer value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(Integer value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(Integer value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(Integer value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<Integer> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<Integer> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeIsNull() {
            addCriterion("trans_confir_time is null");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeIsNotNull() {
            addCriterion("trans_confir_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeEqualTo(Date value) {
            addCriterion("trans_confir_time =", value, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeNotEqualTo(Date value) {
            addCriterion("trans_confir_time <>", value, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeGreaterThan(Date value) {
            addCriterion("trans_confir_time >", value, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trans_confir_time >=", value, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeLessThan(Date value) {
            addCriterion("trans_confir_time <", value, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeLessThanOrEqualTo(Date value) {
            addCriterion("trans_confir_time <=", value, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeIn(List<Date> values) {
            addCriterion("trans_confir_time in", values, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeNotIn(List<Date> values) {
            addCriterion("trans_confir_time not in", values, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeBetween(Date value1, Date value2) {
            addCriterion("trans_confir_time between", value1, value2, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andTransConfirTimeNotBetween(Date value1, Date value2) {
            addCriterion("trans_confir_time not between", value1, value2, "transConfirTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeIsNull() {
            addCriterion("arrange_delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeIsNotNull() {
            addCriterion("arrange_delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeEqualTo(Date value) {
            addCriterion("arrange_delivery_time =", value, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeNotEqualTo(Date value) {
            addCriterion("arrange_delivery_time <>", value, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeGreaterThan(Date value) {
            addCriterion("arrange_delivery_time >", value, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrange_delivery_time >=", value, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeLessThan(Date value) {
            addCriterion("arrange_delivery_time <", value, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrange_delivery_time <=", value, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeIn(List<Date> values) {
            addCriterion("arrange_delivery_time in", values, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeNotIn(List<Date> values) {
            addCriterion("arrange_delivery_time not in", values, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("arrange_delivery_time between", value1, value2, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrange_delivery_time not between", value1, value2, "arrangeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeIsNull() {
            addCriterion("good_station_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeIsNotNull() {
            addCriterion("good_station_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeEqualTo(Date value) {
            addCriterion("good_station_time =", value, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeNotEqualTo(Date value) {
            addCriterion("good_station_time <>", value, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeGreaterThan(Date value) {
            addCriterion("good_station_time >", value, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("good_station_time >=", value, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeLessThan(Date value) {
            addCriterion("good_station_time <", value, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeLessThanOrEqualTo(Date value) {
            addCriterion("good_station_time <=", value, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeIn(List<Date> values) {
            addCriterion("good_station_time in", values, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeNotIn(List<Date> values) {
            addCriterion("good_station_time not in", values, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeBetween(Date value1, Date value2) {
            addCriterion("good_station_time between", value1, value2, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andGoodStationTimeNotBetween(Date value1, Date value2) {
            addCriterion("good_station_time not between", value1, value2, "goodStationTime");
            return (Criteria) this;
        }

        public Criteria andTimeRequireIsNull() {
            addCriterion("time_require is null");
            return (Criteria) this;
        }

        public Criteria andTimeRequireIsNotNull() {
            addCriterion("time_require is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRequireEqualTo(Float value) {
            addCriterion("time_require =", value, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireNotEqualTo(Float value) {
            addCriterion("time_require <>", value, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireGreaterThan(Float value) {
            addCriterion("time_require >", value, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireGreaterThanOrEqualTo(Float value) {
            addCriterion("time_require >=", value, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireLessThan(Float value) {
            addCriterion("time_require <", value, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireLessThanOrEqualTo(Float value) {
            addCriterion("time_require <=", value, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireIn(List<Float> values) {
            addCriterion("time_require in", values, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireNotIn(List<Float> values) {
            addCriterion("time_require not in", values, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireBetween(Float value1, Float value2) {
            addCriterion("time_require between", value1, value2, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andTimeRequireNotBetween(Float value1, Float value2) {
            addCriterion("time_require not between", value1, value2, "timeRequire");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeIsNull() {
            addCriterion("expect_arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeIsNotNull() {
            addCriterion("expect_arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeEqualTo(Date value) {
            addCriterion("expect_arrival_time =", value, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeNotEqualTo(Date value) {
            addCriterion("expect_arrival_time <>", value, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeGreaterThan(Date value) {
            addCriterion("expect_arrival_time >", value, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_arrival_time >=", value, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeLessThan(Date value) {
            addCriterion("expect_arrival_time <", value, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("expect_arrival_time <=", value, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeIn(List<Date> values) {
            addCriterion("expect_arrival_time in", values, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeNotIn(List<Date> values) {
            addCriterion("expect_arrival_time not in", values, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("expect_arrival_time between", value1, value2, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("expect_arrival_time not between", value1, value2, "expectArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeIsNull() {
            addCriterion("expect_stowage_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeIsNotNull() {
            addCriterion("expect_stowage_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeEqualTo(Date value) {
            addCriterion("expect_stowage_time =", value, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeNotEqualTo(Date value) {
            addCriterion("expect_stowage_time <>", value, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeGreaterThan(Date value) {
            addCriterion("expect_stowage_time >", value, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_stowage_time >=", value, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeLessThan(Date value) {
            addCriterion("expect_stowage_time <", value, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeLessThanOrEqualTo(Date value) {
            addCriterion("expect_stowage_time <=", value, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeIn(List<Date> values) {
            addCriterion("expect_stowage_time in", values, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeNotIn(List<Date> values) {
            addCriterion("expect_stowage_time not in", values, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeBetween(Date value1, Date value2) {
            addCriterion("expect_stowage_time between", value1, value2, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andExpectStowageTimeNotBetween(Date value1, Date value2) {
            addCriterion("expect_stowage_time not between", value1, value2, "expectStowageTime");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andBackStatusIsNull() {
            addCriterion("back_status is null");
            return (Criteria) this;
        }

        public Criteria andBackStatusIsNotNull() {
            addCriterion("back_status is not null");
            return (Criteria) this;
        }

        public Criteria andBackStatusEqualTo(Integer value) {
            addCriterion("back_status =", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotEqualTo(Integer value) {
            addCriterion("back_status <>", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusGreaterThan(Integer value) {
            addCriterion("back_status >", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_status >=", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusLessThan(Integer value) {
            addCriterion("back_status <", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusLessThanOrEqualTo(Integer value) {
            addCriterion("back_status <=", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusIn(List<Integer> values) {
            addCriterion("back_status in", values, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotIn(List<Integer> values) {
            addCriterion("back_status not in", values, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusBetween(Integer value1, Integer value2) {
            addCriterion("back_status between", value1, value2, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("back_status not between", value1, value2, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackMemoIsNull() {
            addCriterion("back_memo is null");
            return (Criteria) this;
        }

        public Criteria andBackMemoIsNotNull() {
            addCriterion("back_memo is not null");
            return (Criteria) this;
        }

        public Criteria andBackMemoEqualTo(String value) {
            addCriterion("back_memo =", value, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoNotEqualTo(String value) {
            addCriterion("back_memo <>", value, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoGreaterThan(String value) {
            addCriterion("back_memo >", value, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoGreaterThanOrEqualTo(String value) {
            addCriterion("back_memo >=", value, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoLessThan(String value) {
            addCriterion("back_memo <", value, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoLessThanOrEqualTo(String value) {
            addCriterion("back_memo <=", value, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoLike(String value) {
            addCriterion("back_memo like", value, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoNotLike(String value) {
            addCriterion("back_memo not like", value, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoIn(List<String> values) {
            addCriterion("back_memo in", values, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoNotIn(List<String> values) {
            addCriterion("back_memo not in", values, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoBetween(String value1, String value2) {
            addCriterion("back_memo between", value1, value2, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackMemoNotBetween(String value1, String value2) {
            addCriterion("back_memo not between", value1, value2, "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdIsNull() {
            addCriterion("back_submit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdIsNotNull() {
            addCriterion("back_submit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdEqualTo(Long value) {
            addCriterion("back_submit_user_id =", value, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdNotEqualTo(Long value) {
            addCriterion("back_submit_user_id <>", value, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdGreaterThan(Long value) {
            addCriterion("back_submit_user_id >", value, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("back_submit_user_id >=", value, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdLessThan(Long value) {
            addCriterion("back_submit_user_id <", value, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdLessThanOrEqualTo(Long value) {
            addCriterion("back_submit_user_id <=", value, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdIn(List<Long> values) {
            addCriterion("back_submit_user_id in", values, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdNotIn(List<Long> values) {
            addCriterion("back_submit_user_id not in", values, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdBetween(Long value1, Long value2) {
            addCriterion("back_submit_user_id between", value1, value2, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserIdNotBetween(Long value1, Long value2) {
            addCriterion("back_submit_user_id not between", value1, value2, "backSubmitUserId");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameIsNull() {
            addCriterion("back_submit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameIsNotNull() {
            addCriterion("back_submit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameEqualTo(String value) {
            addCriterion("back_submit_user_name =", value, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameNotEqualTo(String value) {
            addCriterion("back_submit_user_name <>", value, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameGreaterThan(String value) {
            addCriterion("back_submit_user_name >", value, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("back_submit_user_name >=", value, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameLessThan(String value) {
            addCriterion("back_submit_user_name <", value, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameLessThanOrEqualTo(String value) {
            addCriterion("back_submit_user_name <=", value, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameLike(String value) {
            addCriterion("back_submit_user_name like", value, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameNotLike(String value) {
            addCriterion("back_submit_user_name not like", value, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameIn(List<String> values) {
            addCriterion("back_submit_user_name in", values, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameNotIn(List<String> values) {
            addCriterion("back_submit_user_name not in", values, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameBetween(String value1, String value2) {
            addCriterion("back_submit_user_name between", value1, value2, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameNotBetween(String value1, String value2) {
            addCriterion("back_submit_user_name not between", value1, value2, "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeIsNull() {
            addCriterion("back_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeIsNotNull() {
            addCriterion("back_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeEqualTo(Date value) {
            addCriterion("back_submit_time =", value, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeNotEqualTo(Date value) {
            addCriterion("back_submit_time <>", value, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeGreaterThan(Date value) {
            addCriterion("back_submit_time >", value, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("back_submit_time >=", value, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeLessThan(Date value) {
            addCriterion("back_submit_time <", value, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("back_submit_time <=", value, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeIn(List<Date> values) {
            addCriterion("back_submit_time in", values, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeNotIn(List<Date> values) {
            addCriterion("back_submit_time not in", values, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("back_submit_time between", value1, value2, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("back_submit_time not between", value1, value2, "backSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdIsNull() {
            addCriterion("back_receive_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdIsNotNull() {
            addCriterion("back_receive_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdEqualTo(Long value) {
            addCriterion("back_receive_user_id =", value, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdNotEqualTo(Long value) {
            addCriterion("back_receive_user_id <>", value, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdGreaterThan(Long value) {
            addCriterion("back_receive_user_id >", value, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("back_receive_user_id >=", value, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdLessThan(Long value) {
            addCriterion("back_receive_user_id <", value, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdLessThanOrEqualTo(Long value) {
            addCriterion("back_receive_user_id <=", value, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdIn(List<Long> values) {
            addCriterion("back_receive_user_id in", values, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdNotIn(List<Long> values) {
            addCriterion("back_receive_user_id not in", values, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdBetween(Long value1, Long value2) {
            addCriterion("back_receive_user_id between", value1, value2, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserIdNotBetween(Long value1, Long value2) {
            addCriterion("back_receive_user_id not between", value1, value2, "backReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameIsNull() {
            addCriterion("back_receive_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameIsNotNull() {
            addCriterion("back_receive_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameEqualTo(String value) {
            addCriterion("back_receive_user_name =", value, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameNotEqualTo(String value) {
            addCriterion("back_receive_user_name <>", value, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameGreaterThan(String value) {
            addCriterion("back_receive_user_name >", value, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("back_receive_user_name >=", value, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameLessThan(String value) {
            addCriterion("back_receive_user_name <", value, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameLessThanOrEqualTo(String value) {
            addCriterion("back_receive_user_name <=", value, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameLike(String value) {
            addCriterion("back_receive_user_name like", value, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameNotLike(String value) {
            addCriterion("back_receive_user_name not like", value, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameIn(List<String> values) {
            addCriterion("back_receive_user_name in", values, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameNotIn(List<String> values) {
            addCriterion("back_receive_user_name not in", values, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameBetween(String value1, String value2) {
            addCriterion("back_receive_user_name between", value1, value2, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameNotBetween(String value1, String value2) {
            addCriterion("back_receive_user_name not between", value1, value2, "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeIsNull() {
            addCriterion("back_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeIsNotNull() {
            addCriterion("back_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeEqualTo(Date value) {
            addCriterion("back_receive_time =", value, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeNotEqualTo(Date value) {
            addCriterion("back_receive_time <>", value, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeGreaterThan(Date value) {
            addCriterion("back_receive_time >", value, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("back_receive_time >=", value, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeLessThan(Date value) {
            addCriterion("back_receive_time <", value, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("back_receive_time <=", value, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeIn(List<Date> values) {
            addCriterion("back_receive_time in", values, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeNotIn(List<Date> values) {
            addCriterion("back_receive_time not in", values, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("back_receive_time between", value1, value2, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBackReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("back_receive_time not between", value1, value2, "backReceiveTime");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdIsNull() {
            addCriterion("booker_employee_id is null");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdIsNotNull() {
            addCriterion("booker_employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdEqualTo(Long value) {
            addCriterion("booker_employee_id =", value, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdNotEqualTo(Long value) {
            addCriterion("booker_employee_id <>", value, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdGreaterThan(Long value) {
            addCriterion("booker_employee_id >", value, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("booker_employee_id >=", value, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdLessThan(Long value) {
            addCriterion("booker_employee_id <", value, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("booker_employee_id <=", value, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdIn(List<Long> values) {
            addCriterion("booker_employee_id in", values, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdNotIn(List<Long> values) {
            addCriterion("booker_employee_id not in", values, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("booker_employee_id between", value1, value2, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("booker_employee_id not between", value1, value2, "bookerEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameIsNull() {
            addCriterion("booker_employee_name is null");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameIsNotNull() {
            addCriterion("booker_employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameEqualTo(String value) {
            addCriterion("booker_employee_name =", value, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameNotEqualTo(String value) {
            addCriterion("booker_employee_name <>", value, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameGreaterThan(String value) {
            addCriterion("booker_employee_name >", value, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("booker_employee_name >=", value, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLessThan(String value) {
            addCriterion("booker_employee_name <", value, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("booker_employee_name <=", value, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLike(String value) {
            addCriterion("booker_employee_name like", value, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameNotLike(String value) {
            addCriterion("booker_employee_name not like", value, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameIn(List<String> values) {
            addCriterion("booker_employee_name in", values, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameNotIn(List<String> values) {
            addCriterion("booker_employee_name not in", values, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameBetween(String value1, String value2) {
            addCriterion("booker_employee_name between", value1, value2, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("booker_employee_name not between", value1, value2, "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Long value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Long value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Long value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Long value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Long value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Long> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Long> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Long value1, Long value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Long value1, Long value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsIsNull() {
            addCriterion("is_receive_send_sms is null");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsIsNotNull() {
            addCriterion("is_receive_send_sms is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsEqualTo(Integer value) {
            addCriterion("is_receive_send_sms =", value, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsNotEqualTo(Integer value) {
            addCriterion("is_receive_send_sms <>", value, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsGreaterThan(Integer value) {
            addCriterion("is_receive_send_sms >", value, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_receive_send_sms >=", value, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsLessThan(Integer value) {
            addCriterion("is_receive_send_sms <", value, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsLessThanOrEqualTo(Integer value) {
            addCriterion("is_receive_send_sms <=", value, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsIn(List<Integer> values) {
            addCriterion("is_receive_send_sms in", values, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsNotIn(List<Integer> values) {
            addCriterion("is_receive_send_sms not in", values, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsBetween(Integer value1, Integer value2) {
            addCriterion("is_receive_send_sms between", value1, value2, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andIsReceiveSendSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_receive_send_sms not between", value1, value2, "isReceiveSendSms");
            return (Criteria) this;
        }

        public Criteria andDownIdIsNull() {
            addCriterion("down_id is null");
            return (Criteria) this;
        }

        public Criteria andDownIdIsNotNull() {
            addCriterion("down_id is not null");
            return (Criteria) this;
        }

        public Criteria andDownIdEqualTo(String value) {
            addCriterion("down_id =", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotEqualTo(String value) {
            addCriterion("down_id <>", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdGreaterThan(String value) {
            addCriterion("down_id >", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdGreaterThanOrEqualTo(String value) {
            addCriterion("down_id >=", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLessThan(String value) {
            addCriterion("down_id <", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLessThanOrEqualTo(String value) {
            addCriterion("down_id <=", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLike(String value) {
            addCriterion("down_id like", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotLike(String value) {
            addCriterion("down_id not like", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdIn(List<String> values) {
            addCriterion("down_id in", values, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotIn(List<String> values) {
            addCriterion("down_id not in", values, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdBetween(String value1, String value2) {
            addCriterion("down_id between", value1, value2, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotBetween(String value1, String value2) {
            addCriterion("down_id not between", value1, value2, "downId");
            return (Criteria) this;
        }

        public Criteria andIsLocalIsNull() {
            addCriterion("is_local is null");
            return (Criteria) this;
        }

        public Criteria andIsLocalIsNotNull() {
            addCriterion("is_local is not null");
            return (Criteria) this;
        }

        public Criteria andIsLocalEqualTo(Integer value) {
            addCriterion("is_local =", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotEqualTo(Integer value) {
            addCriterion("is_local <>", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalGreaterThan(Integer value) {
            addCriterion("is_local >", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_local >=", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalLessThan(Integer value) {
            addCriterion("is_local <", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalLessThanOrEqualTo(Integer value) {
            addCriterion("is_local <=", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalIn(List<Integer> values) {
            addCriterion("is_local in", values, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotIn(List<Integer> values) {
            addCriterion("is_local not in", values, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalBetween(Integer value1, Integer value2) {
            addCriterion("is_local between", value1, value2, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotBetween(Integer value1, Integer value2) {
            addCriterion("is_local not between", value1, value2, "isLocal");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusIsNull() {
            addCriterion("balance_status is null");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusIsNotNull() {
            addCriterion("balance_status is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusEqualTo(Integer value) {
            addCriterion("balance_status =", value, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusNotEqualTo(Integer value) {
            addCriterion("balance_status <>", value, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusGreaterThan(Integer value) {
            addCriterion("balance_status >", value, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_status >=", value, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusLessThan(Integer value) {
            addCriterion("balance_status <", value, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("balance_status <=", value, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusIn(List<Integer> values) {
            addCriterion("balance_status in", values, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusNotIn(List<Integer> values) {
            addCriterion("balance_status not in", values, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusBetween(Integer value1, Integer value2) {
            addCriterion("balance_status between", value1, value2, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_status not between", value1, value2, "balanceStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayLockedIsNull() {
            addCriterion("pay_locked is null");
            return (Criteria) this;
        }

        public Criteria andPayLockedIsNotNull() {
            addCriterion("pay_locked is not null");
            return (Criteria) this;
        }

        public Criteria andPayLockedEqualTo(Integer value) {
            addCriterion("pay_locked =", value, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedNotEqualTo(Integer value) {
            addCriterion("pay_locked <>", value, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedGreaterThan(Integer value) {
            addCriterion("pay_locked >", value, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_locked >=", value, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedLessThan(Integer value) {
            addCriterion("pay_locked <", value, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedLessThanOrEqualTo(Integer value) {
            addCriterion("pay_locked <=", value, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedIn(List<Integer> values) {
            addCriterion("pay_locked in", values, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedNotIn(List<Integer> values) {
            addCriterion("pay_locked not in", values, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedBetween(Integer value1, Integer value2) {
            addCriterion("pay_locked between", value1, value2, "payLocked");
            return (Criteria) this;
        }

        public Criteria andPayLockedNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_locked not between", value1, value2, "payLocked");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNull() {
            addCriterion("receipt_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNotNull() {
            addCriterion("receipt_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeEqualTo(Integer value) {
            addCriterion("receipt_time =", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotEqualTo(Integer value) {
            addCriterion("receipt_time <>", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThan(Integer value) {
            addCriterion("receipt_time >", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("receipt_time >=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThan(Integer value) {
            addCriterion("receipt_time <", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThanOrEqualTo(Integer value) {
            addCriterion("receipt_time <=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIn(List<Integer> values) {
            addCriterion("receipt_time in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotIn(List<Integer> values) {
            addCriterion("receipt_time not in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeBetween(Integer value1, Integer value2) {
            addCriterion("receipt_time between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("receipt_time not between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotIsNull() {
            addCriterion("is_need_enter_depot is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotIsNotNull() {
            addCriterion("is_need_enter_depot is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotEqualTo(Integer value) {
            addCriterion("is_need_enter_depot =", value, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotNotEqualTo(Integer value) {
            addCriterion("is_need_enter_depot <>", value, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotGreaterThan(Integer value) {
            addCriterion("is_need_enter_depot >", value, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_need_enter_depot >=", value, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotLessThan(Integer value) {
            addCriterion("is_need_enter_depot <", value, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotLessThanOrEqualTo(Integer value) {
            addCriterion("is_need_enter_depot <=", value, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotIn(List<Integer> values) {
            addCriterion("is_need_enter_depot in", values, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotNotIn(List<Integer> values) {
            addCriterion("is_need_enter_depot not in", values, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotBetween(Integer value1, Integer value2) {
            addCriterion("is_need_enter_depot between", value1, value2, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andIsNeedEnterDepotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_need_enter_depot not between", value1, value2, "isNeedEnterDepot");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignUserIdIsNull() {
            addCriterion("sign_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSignUserIdIsNotNull() {
            addCriterion("sign_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignUserIdEqualTo(Long value) {
            addCriterion("sign_user_id =", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdNotEqualTo(Long value) {
            addCriterion("sign_user_id <>", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdGreaterThan(Long value) {
            addCriterion("sign_user_id >", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sign_user_id >=", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdLessThan(Long value) {
            addCriterion("sign_user_id <", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdLessThanOrEqualTo(Long value) {
            addCriterion("sign_user_id <=", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdIn(List<Long> values) {
            addCriterion("sign_user_id in", values, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdNotIn(List<Long> values) {
            addCriterion("sign_user_id not in", values, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdBetween(Long value1, Long value2) {
            addCriterion("sign_user_id between", value1, value2, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdNotBetween(Long value1, Long value2) {
            addCriterion("sign_user_id not between", value1, value2, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserNameIsNull() {
            addCriterion("sign_user_name is null");
            return (Criteria) this;
        }

        public Criteria andSignUserNameIsNotNull() {
            addCriterion("sign_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andSignUserNameEqualTo(String value) {
            addCriterion("sign_user_name =", value, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameNotEqualTo(String value) {
            addCriterion("sign_user_name <>", value, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameGreaterThan(String value) {
            addCriterion("sign_user_name >", value, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("sign_user_name >=", value, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameLessThan(String value) {
            addCriterion("sign_user_name <", value, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameLessThanOrEqualTo(String value) {
            addCriterion("sign_user_name <=", value, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameLike(String value) {
            addCriterion("sign_user_name like", value, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameNotLike(String value) {
            addCriterion("sign_user_name not like", value, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameIn(List<String> values) {
            addCriterion("sign_user_name in", values, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameNotIn(List<String> values) {
            addCriterion("sign_user_name not in", values, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameBetween(String value1, String value2) {
            addCriterion("sign_user_name between", value1, value2, "signUserName");
            return (Criteria) this;
        }

        public Criteria andSignUserNameNotBetween(String value1, String value2) {
            addCriterion("sign_user_name not between", value1, value2, "signUserName");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbIsNull() {
            addCriterion("balance_type_with_zb is null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbIsNotNull() {
            addCriterion("balance_type_with_zb is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbEqualTo(Integer value) {
            addCriterion("balance_type_with_zb =", value, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbNotEqualTo(Integer value) {
            addCriterion("balance_type_with_zb <>", value, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbGreaterThan(Integer value) {
            addCriterion("balance_type_with_zb >", value, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_type_with_zb >=", value, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbLessThan(Integer value) {
            addCriterion("balance_type_with_zb <", value, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbLessThanOrEqualTo(Integer value) {
            addCriterion("balance_type_with_zb <=", value, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbIn(List<Integer> values) {
            addCriterion("balance_type_with_zb in", values, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbNotIn(List<Integer> values) {
            addCriterion("balance_type_with_zb not in", values, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbBetween(Integer value1, Integer value2) {
            addCriterion("balance_type_with_zb between", value1, value2, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeWithZbNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_type_with_zb not between", value1, value2, "balanceTypeWithZb");
            return (Criteria) this;
        }

        public Criteria andFreeReasonIsNull() {
            addCriterion("free_reason is null");
            return (Criteria) this;
        }

        public Criteria andFreeReasonIsNotNull() {
            addCriterion("free_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFreeReasonEqualTo(String value) {
            addCriterion("free_reason =", value, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonNotEqualTo(String value) {
            addCriterion("free_reason <>", value, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonGreaterThan(String value) {
            addCriterion("free_reason >", value, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("free_reason >=", value, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonLessThan(String value) {
            addCriterion("free_reason <", value, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonLessThanOrEqualTo(String value) {
            addCriterion("free_reason <=", value, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonLike(String value) {
            addCriterion("free_reason like", value, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonNotLike(String value) {
            addCriterion("free_reason not like", value, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonIn(List<String> values) {
            addCriterion("free_reason in", values, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonNotIn(List<String> values) {
            addCriterion("free_reason not in", values, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonBetween(String value1, String value2) {
            addCriterion("free_reason between", value1, value2, "freeReason");
            return (Criteria) this;
        }

        public Criteria andFreeReasonNotBetween(String value1, String value2) {
            addCriterion("free_reason not between", value1, value2, "freeReason");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterIsNull() {
            addCriterion("is_service_inter is null");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterIsNotNull() {
            addCriterion("is_service_inter is not null");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterEqualTo(Integer value) {
            addCriterion("is_service_inter =", value, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterNotEqualTo(Integer value) {
            addCriterion("is_service_inter <>", value, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterGreaterThan(Integer value) {
            addCriterion("is_service_inter >", value, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_service_inter >=", value, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterLessThan(Integer value) {
            addCriterion("is_service_inter <", value, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterLessThanOrEqualTo(Integer value) {
            addCriterion("is_service_inter <=", value, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterIn(List<Integer> values) {
            addCriterion("is_service_inter in", values, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterNotIn(List<Integer> values) {
            addCriterion("is_service_inter not in", values, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterBetween(Integer value1, Integer value2) {
            addCriterion("is_service_inter between", value1, value2, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andIsServiceInterNotBetween(Integer value1, Integer value2) {
            addCriterion("is_service_inter not between", value1, value2, "isServiceInter");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNull() {
            addCriterion("pay_success_time is null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNotNull() {
            addCriterion("pay_success_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeEqualTo(Date value) {
            addCriterion("pay_success_time =", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotEqualTo(Date value) {
            addCriterion("pay_success_time <>", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThan(Date value) {
            addCriterion("pay_success_time >", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_success_time >=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThan(Date value) {
            addCriterion("pay_success_time <", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_success_time <=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIn(List<Date> values) {
            addCriterion("pay_success_time in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotIn(List<Date> values) {
            addCriterion("pay_success_time not in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeBetween(Date value1, Date value2) {
            addCriterion("pay_success_time between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_success_time not between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeIsNull() {
            addCriterion("arrival_station_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeIsNotNull() {
            addCriterion("arrival_station_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeEqualTo(Date value) {
            addCriterion("arrival_station_time =", value, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeNotEqualTo(Date value) {
            addCriterion("arrival_station_time <>", value, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeGreaterThan(Date value) {
            addCriterion("arrival_station_time >", value, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_station_time >=", value, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeLessThan(Date value) {
            addCriterion("arrival_station_time <", value, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrival_station_time <=", value, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeIn(List<Date> values) {
            addCriterion("arrival_station_time in", values, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeNotIn(List<Date> values) {
            addCriterion("arrival_station_time not in", values, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeBetween(Date value1, Date value2) {
            addCriterion("arrival_station_time between", value1, value2, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrival_station_time not between", value1, value2, "arrivalStationTime");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdIsNull() {
            addCriterion("arrival_station_user_id is null");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdIsNotNull() {
            addCriterion("arrival_station_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdEqualTo(Long value) {
            addCriterion("arrival_station_user_id =", value, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdNotEqualTo(Long value) {
            addCriterion("arrival_station_user_id <>", value, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdGreaterThan(Long value) {
            addCriterion("arrival_station_user_id >", value, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("arrival_station_user_id >=", value, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdLessThan(Long value) {
            addCriterion("arrival_station_user_id <", value, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdLessThanOrEqualTo(Long value) {
            addCriterion("arrival_station_user_id <=", value, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdIn(List<Long> values) {
            addCriterion("arrival_station_user_id in", values, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdNotIn(List<Long> values) {
            addCriterion("arrival_station_user_id not in", values, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdBetween(Long value1, Long value2) {
            addCriterion("arrival_station_user_id between", value1, value2, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserIdNotBetween(Long value1, Long value2) {
            addCriterion("arrival_station_user_id not between", value1, value2, "arrivalStationUserId");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameIsNull() {
            addCriterion("arrival_station_user_name is null");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameIsNotNull() {
            addCriterion("arrival_station_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameEqualTo(String value) {
            addCriterion("arrival_station_user_name =", value, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameNotEqualTo(String value) {
            addCriterion("arrival_station_user_name <>", value, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameGreaterThan(String value) {
            addCriterion("arrival_station_user_name >", value, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_station_user_name >=", value, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameLessThan(String value) {
            addCriterion("arrival_station_user_name <", value, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameLessThanOrEqualTo(String value) {
            addCriterion("arrival_station_user_name <=", value, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameLike(String value) {
            addCriterion("arrival_station_user_name like", value, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameNotLike(String value) {
            addCriterion("arrival_station_user_name not like", value, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameIn(List<String> values) {
            addCriterion("arrival_station_user_name in", values, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameNotIn(List<String> values) {
            addCriterion("arrival_station_user_name not in", values, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameBetween(String value1, String value2) {
            addCriterion("arrival_station_user_name between", value1, value2, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameNotBetween(String value1, String value2) {
            addCriterion("arrival_station_user_name not between", value1, value2, "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayIsNull() {
            addCriterion("waybill_outtime_day is null");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayIsNotNull() {
            addCriterion("waybill_outtime_day is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayEqualTo(Integer value) {
            addCriterion("waybill_outtime_day =", value, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayNotEqualTo(Integer value) {
            addCriterion("waybill_outtime_day <>", value, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayGreaterThan(Integer value) {
            addCriterion("waybill_outtime_day >", value, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("waybill_outtime_day >=", value, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayLessThan(Integer value) {
            addCriterion("waybill_outtime_day <", value, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayLessThanOrEqualTo(Integer value) {
            addCriterion("waybill_outtime_day <=", value, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayIn(List<Integer> values) {
            addCriterion("waybill_outtime_day in", values, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayNotIn(List<Integer> values) {
            addCriterion("waybill_outtime_day not in", values, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayBetween(Integer value1, Integer value2) {
            addCriterion("waybill_outtime_day between", value1, value2, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeDayNotBetween(Integer value1, Integer value2) {
            addCriterion("waybill_outtime_day not between", value1, value2, "waybillOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameIsNull() {
            addCriterion("pay_success_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameIsNotNull() {
            addCriterion("pay_success_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameEqualTo(String value) {
            addCriterion("pay_success_user_name =", value, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameNotEqualTo(String value) {
            addCriterion("pay_success_user_name <>", value, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameGreaterThan(String value) {
            addCriterion("pay_success_user_name >", value, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_success_user_name >=", value, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameLessThan(String value) {
            addCriterion("pay_success_user_name <", value, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameLessThanOrEqualTo(String value) {
            addCriterion("pay_success_user_name <=", value, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameLike(String value) {
            addCriterion("pay_success_user_name like", value, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameNotLike(String value) {
            addCriterion("pay_success_user_name not like", value, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameIn(List<String> values) {
            addCriterion("pay_success_user_name in", values, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameNotIn(List<String> values) {
            addCriterion("pay_success_user_name not in", values, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameBetween(String value1, String value2) {
            addCriterion("pay_success_user_name between", value1, value2, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameNotBetween(String value1, String value2) {
            addCriterion("pay_success_user_name not between", value1, value2, "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeIsNull() {
            addCriterion("is_allow_waybill_outtime is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeIsNotNull() {
            addCriterion("is_allow_waybill_outtime is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeEqualTo(Integer value) {
            addCriterion("is_allow_waybill_outtime =", value, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeNotEqualTo(Integer value) {
            addCriterion("is_allow_waybill_outtime <>", value, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeGreaterThan(Integer value) {
            addCriterion("is_allow_waybill_outtime >", value, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_allow_waybill_outtime >=", value, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeLessThan(Integer value) {
            addCriterion("is_allow_waybill_outtime <", value, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeLessThanOrEqualTo(Integer value) {
            addCriterion("is_allow_waybill_outtime <=", value, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeIn(List<Integer> values) {
            addCriterion("is_allow_waybill_outtime in", values, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeNotIn(List<Integer> values) {
            addCriterion("is_allow_waybill_outtime not in", values, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeBetween(Integer value1, Integer value2) {
            addCriterion("is_allow_waybill_outtime between", value1, value2, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andIsAllowWaybillOuttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_allow_waybill_outtime not between", value1, value2, "isAllowWaybillOuttime");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameIsNull() {
            addCriterion("current_process_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameIsNotNull() {
            addCriterion("current_process_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameEqualTo(String value) {
            addCriterion("current_process_name =", value, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameNotEqualTo(String value) {
            addCriterion("current_process_name <>", value, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameGreaterThan(String value) {
            addCriterion("current_process_name >", value, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("current_process_name >=", value, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameLessThan(String value) {
            addCriterion("current_process_name <", value, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameLessThanOrEqualTo(String value) {
            addCriterion("current_process_name <=", value, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameLike(String value) {
            addCriterion("current_process_name like", value, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameNotLike(String value) {
            addCriterion("current_process_name not like", value, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameIn(List<String> values) {
            addCriterion("current_process_name in", values, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameNotIn(List<String> values) {
            addCriterion("current_process_name not in", values, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameBetween(String value1, String value2) {
            addCriterion("current_process_name between", value1, value2, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameNotBetween(String value1, String value2) {
            addCriterion("current_process_name not between", value1, value2, "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateIsNull() {
            addCriterion("required_arrival_date is null");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateIsNotNull() {
            addCriterion("required_arrival_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateEqualTo(Date value) {
            addCriterion("required_arrival_date =", value, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateNotEqualTo(Date value) {
            addCriterion("required_arrival_date <>", value, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateGreaterThan(Date value) {
            addCriterion("required_arrival_date >", value, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("required_arrival_date >=", value, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateLessThan(Date value) {
            addCriterion("required_arrival_date <", value, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateLessThanOrEqualTo(Date value) {
            addCriterion("required_arrival_date <=", value, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateIn(List<Date> values) {
            addCriterion("required_arrival_date in", values, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateNotIn(List<Date> values) {
            addCriterion("required_arrival_date not in", values, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateBetween(Date value1, Date value2) {
            addCriterion("required_arrival_date between", value1, value2, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andRequiredArrivalDateNotBetween(Date value1, Date value2) {
            addCriterion("required_arrival_date not between", value1, value2, "requiredArrivalDate");
            return (Criteria) this;
        }

        public Criteria andIsStandardIsNull() {
            addCriterion("is_standard is null");
            return (Criteria) this;
        }

        public Criteria andIsStandardIsNotNull() {
            addCriterion("is_standard is not null");
            return (Criteria) this;
        }

        public Criteria andIsStandardEqualTo(Integer value) {
            addCriterion("is_standard =", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotEqualTo(Integer value) {
            addCriterion("is_standard <>", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardGreaterThan(Integer value) {
            addCriterion("is_standard >", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_standard >=", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLessThan(Integer value) {
            addCriterion("is_standard <", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLessThanOrEqualTo(Integer value) {
            addCriterion("is_standard <=", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardIn(List<Integer> values) {
            addCriterion("is_standard in", values, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotIn(List<Integer> values) {
            addCriterion("is_standard not in", values, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardBetween(Integer value1, Integer value2) {
            addCriterion("is_standard between", value1, value2, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotBetween(Integer value1, Integer value2) {
            addCriterion("is_standard not between", value1, value2, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreIsNull() {
            addCriterion("is_upstairs_incre is null");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreIsNotNull() {
            addCriterion("is_upstairs_incre is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreEqualTo(Integer value) {
            addCriterion("is_upstairs_incre =", value, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreNotEqualTo(Integer value) {
            addCriterion("is_upstairs_incre <>", value, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreGreaterThan(Integer value) {
            addCriterion("is_upstairs_incre >", value, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_upstairs_incre >=", value, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreLessThan(Integer value) {
            addCriterion("is_upstairs_incre <", value, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreLessThanOrEqualTo(Integer value) {
            addCriterion("is_upstairs_incre <=", value, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreIn(List<Integer> values) {
            addCriterion("is_upstairs_incre in", values, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreNotIn(List<Integer> values) {
            addCriterion("is_upstairs_incre not in", values, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreBetween(Integer value1, Integer value2) {
            addCriterion("is_upstairs_incre between", value1, value2, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUpstairsIncreNotBetween(Integer value1, Integer value2) {
            addCriterion("is_upstairs_incre not between", value1, value2, "isUpstairsIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreIsNull() {
            addCriterion("is_unload_incre is null");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreIsNotNull() {
            addCriterion("is_unload_incre is not null");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreEqualTo(Integer value) {
            addCriterion("is_unload_incre =", value, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreNotEqualTo(Integer value) {
            addCriterion("is_unload_incre <>", value, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreGreaterThan(Integer value) {
            addCriterion("is_unload_incre >", value, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_unload_incre >=", value, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreLessThan(Integer value) {
            addCriterion("is_unload_incre <", value, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreLessThanOrEqualTo(Integer value) {
            addCriterion("is_unload_incre <=", value, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreIn(List<Integer> values) {
            addCriterion("is_unload_incre in", values, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreNotIn(List<Integer> values) {
            addCriterion("is_unload_incre not in", values, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreBetween(Integer value1, Integer value2) {
            addCriterion("is_unload_incre between", value1, value2, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andIsUnloadIncreNotBetween(Integer value1, Integer value2) {
            addCriterion("is_unload_incre not between", value1, value2, "isUnloadIncre");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioIsNull() {
            addCriterion("service_fee_return_ratio is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioIsNotNull() {
            addCriterion("service_fee_return_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioEqualTo(BigDecimal value) {
            addCriterion("service_fee_return_ratio =", value, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioNotEqualTo(BigDecimal value) {
            addCriterion("service_fee_return_ratio <>", value, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioGreaterThan(BigDecimal value) {
            addCriterion("service_fee_return_ratio >", value, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee_return_ratio >=", value, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioLessThan(BigDecimal value) {
            addCriterion("service_fee_return_ratio <", value, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee_return_ratio <=", value, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioIn(List<BigDecimal> values) {
            addCriterion("service_fee_return_ratio in", values, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioNotIn(List<BigDecimal> values) {
            addCriterion("service_fee_return_ratio not in", values, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee_return_ratio between", value1, value2, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andServiceFeeReturnRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee_return_ratio not between", value1, value2, "serviceFeeReturnRatio");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonIsNull() {
            addCriterion("waybill_outtime_reason is null");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonIsNotNull() {
            addCriterion("waybill_outtime_reason is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonEqualTo(String value) {
            addCriterion("waybill_outtime_reason =", value, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonNotEqualTo(String value) {
            addCriterion("waybill_outtime_reason <>", value, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonGreaterThan(String value) {
            addCriterion("waybill_outtime_reason >", value, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_outtime_reason >=", value, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonLessThan(String value) {
            addCriterion("waybill_outtime_reason <", value, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonLessThanOrEqualTo(String value) {
            addCriterion("waybill_outtime_reason <=", value, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonLike(String value) {
            addCriterion("waybill_outtime_reason like", value, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonNotLike(String value) {
            addCriterion("waybill_outtime_reason not like", value, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonIn(List<String> values) {
            addCriterion("waybill_outtime_reason in", values, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonNotIn(List<String> values) {
            addCriterion("waybill_outtime_reason not in", values, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonBetween(String value1, String value2) {
            addCriterion("waybill_outtime_reason between", value1, value2, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonNotBetween(String value1, String value2) {
            addCriterion("waybill_outtime_reason not between", value1, value2, "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileIsNull() {
            addCriterion("shipper_link_mobile is null");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileIsNotNull() {
            addCriterion("shipper_link_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileEqualTo(String value) {
            addCriterion("shipper_link_mobile =", value, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileNotEqualTo(String value) {
            addCriterion("shipper_link_mobile <>", value, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileGreaterThan(String value) {
            addCriterion("shipper_link_mobile >", value, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_link_mobile >=", value, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileLessThan(String value) {
            addCriterion("shipper_link_mobile <", value, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileLessThanOrEqualTo(String value) {
            addCriterion("shipper_link_mobile <=", value, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileLike(String value) {
            addCriterion("shipper_link_mobile like", value, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileNotLike(String value) {
            addCriterion("shipper_link_mobile not like", value, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileIn(List<String> values) {
            addCriterion("shipper_link_mobile in", values, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileNotIn(List<String> values) {
            addCriterion("shipper_link_mobile not in", values, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileBetween(String value1, String value2) {
            addCriterion("shipper_link_mobile between", value1, value2, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileNotBetween(String value1, String value2) {
            addCriterion("shipper_link_mobile not between", value1, value2, "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileIsNull() {
            addCriterion("receive_link_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileIsNotNull() {
            addCriterion("receive_link_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileEqualTo(String value) {
            addCriterion("receive_link_mobile =", value, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileNotEqualTo(String value) {
            addCriterion("receive_link_mobile <>", value, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileGreaterThan(String value) {
            addCriterion("receive_link_mobile >", value, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receive_link_mobile >=", value, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileLessThan(String value) {
            addCriterion("receive_link_mobile <", value, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileLessThanOrEqualTo(String value) {
            addCriterion("receive_link_mobile <=", value, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileLike(String value) {
            addCriterion("receive_link_mobile like", value, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileNotLike(String value) {
            addCriterion("receive_link_mobile not like", value, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileIn(List<String> values) {
            addCriterion("receive_link_mobile in", values, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileNotIn(List<String> values) {
            addCriterion("receive_link_mobile not in", values, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileBetween(String value1, String value2) {
            addCriterion("receive_link_mobile between", value1, value2, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileNotBetween(String value1, String value2) {
            addCriterion("receive_link_mobile not between", value1, value2, "receiveLinkMobile");
            return (Criteria) this;
        }

        public Criteria andIsElevatorIsNull() {
            addCriterion("is_elevator is null");
            return (Criteria) this;
        }

        public Criteria andIsElevatorIsNotNull() {
            addCriterion("is_elevator is not null");
            return (Criteria) this;
        }

        public Criteria andIsElevatorEqualTo(Integer value) {
            addCriterion("is_elevator =", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorNotEqualTo(Integer value) {
            addCriterion("is_elevator <>", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorGreaterThan(Integer value) {
            addCriterion("is_elevator >", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_elevator >=", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorLessThan(Integer value) {
            addCriterion("is_elevator <", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorLessThanOrEqualTo(Integer value) {
            addCriterion("is_elevator <=", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorIn(List<Integer> values) {
            addCriterion("is_elevator in", values, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorNotIn(List<Integer> values) {
            addCriterion("is_elevator not in", values, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorBetween(Integer value1, Integer value2) {
            addCriterion("is_elevator between", value1, value2, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorNotBetween(Integer value1, Integer value2) {
            addCriterion("is_elevator not between", value1, value2, "isElevator");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNull() {
            addCriterion("floor_num is null");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNotNull() {
            addCriterion("floor_num is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNumEqualTo(Integer value) {
            addCriterion("floor_num =", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotEqualTo(Integer value) {
            addCriterion("floor_num <>", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThan(Integer value) {
            addCriterion("floor_num >", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_num >=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThan(Integer value) {
            addCriterion("floor_num <", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThanOrEqualTo(Integer value) {
            addCriterion("floor_num <=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumIn(List<Integer> values) {
            addCriterion("floor_num in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotIn(List<Integer> values) {
            addCriterion("floor_num not in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumBetween(Integer value1, Integer value2) {
            addCriterion("floor_num between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_num not between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andIsExpressIsNull() {
            addCriterion("is_express is null");
            return (Criteria) this;
        }

        public Criteria andIsExpressIsNotNull() {
            addCriterion("is_express is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpressEqualTo(Integer value) {
            addCriterion("is_express =", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressNotEqualTo(Integer value) {
            addCriterion("is_express <>", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressGreaterThan(Integer value) {
            addCriterion("is_express >", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_express >=", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressLessThan(Integer value) {
            addCriterion("is_express <", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressLessThanOrEqualTo(Integer value) {
            addCriterion("is_express <=", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressIn(List<Integer> values) {
            addCriterion("is_express in", values, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressNotIn(List<Integer> values) {
            addCriterion("is_express not in", values, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressBetween(Integer value1, Integer value2) {
            addCriterion("is_express between", value1, value2, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressNotBetween(Integer value1, Integer value2) {
            addCriterion("is_express not between", value1, value2, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentIsNull() {
            addCriterion("is_have_attachment is null");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentIsNotNull() {
            addCriterion("is_have_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentEqualTo(Integer value) {
            addCriterion("is_have_attachment =", value, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentNotEqualTo(Integer value) {
            addCriterion("is_have_attachment <>", value, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentGreaterThan(Integer value) {
            addCriterion("is_have_attachment >", value, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_have_attachment >=", value, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentLessThan(Integer value) {
            addCriterion("is_have_attachment <", value, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentLessThanOrEqualTo(Integer value) {
            addCriterion("is_have_attachment <=", value, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentIn(List<Integer> values) {
            addCriterion("is_have_attachment in", values, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentNotIn(List<Integer> values) {
            addCriterion("is_have_attachment not in", values, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentBetween(Integer value1, Integer value2) {
            addCriterion("is_have_attachment between", value1, value2, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andIsHaveAttachmentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_have_attachment not between", value1, value2, "isHaveAttachment");
            return (Criteria) this;
        }

        public Criteria andChangeTimesIsNull() {
            addCriterion("change_times is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimesIsNotNull() {
            addCriterion("change_times is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimesEqualTo(Integer value) {
            addCriterion("change_times =", value, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesNotEqualTo(Integer value) {
            addCriterion("change_times <>", value, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesGreaterThan(Integer value) {
            addCriterion("change_times >", value, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_times >=", value, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesLessThan(Integer value) {
            addCriterion("change_times <", value, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("change_times <=", value, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesIn(List<Integer> values) {
            addCriterion("change_times in", values, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesNotIn(List<Integer> values) {
            addCriterion("change_times not in", values, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesBetween(Integer value1, Integer value2) {
            addCriterion("change_times between", value1, value2, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andChangeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("change_times not between", value1, value2, "changeTimes");
            return (Criteria) this;
        }

        public Criteria andSystemSnLikeInsensitive(String value) {
            addCriterion("upper(system_sn) like", value.toUpperCase(), "systemSn");
            return (Criteria) this;
        }

        public Criteria andSnLikeInsensitive(String value) {
            addCriterion("upper(sn) like", value.toUpperCase(), "sn");
            return (Criteria) this;
        }

        public Criteria andSiteNameLikeInsensitive(String value) {
            addCriterion("upper(site_name) like", value.toUpperCase(), "siteName");
            return (Criteria) this;
        }

        public Criteria andLspCompanyNameLikeInsensitive(String value) {
            addCriterion("upper(lsp_company_name) like", value.toUpperCase(), "lspCompanyName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLikeInsensitive(String value) {
            addCriterion("upper(alloc_center_name) like", value.toUpperCase(), "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerCodeLikeInsensitive(String value) {
            addCriterion("upper(shipper_customer_code) like", value.toUpperCase(), "shipperCustomerCode");
            return (Criteria) this;
        }

        public Criteria andShipperCustomerNameLikeInsensitive(String value) {
            addCriterion("upper(shipper_customer_name) like", value.toUpperCase(), "shipperCustomerName");
            return (Criteria) this;
        }

        public Criteria andShipperProvinceNameLikeInsensitive(String value) {
            addCriterion("upper(shipper_province_name) like", value.toUpperCase(), "shipperProvinceName");
            return (Criteria) this;
        }

        public Criteria andShipperCityNameLikeInsensitive(String value) {
            addCriterion("upper(shipper_city_name) like", value.toUpperCase(), "shipperCityName");
            return (Criteria) this;
        }

        public Criteria andShipperCountryNameLikeInsensitive(String value) {
            addCriterion("upper(shipper_country_name) like", value.toUpperCase(), "shipperCountryName");
            return (Criteria) this;
        }

        public Criteria andShipperTownNameLikeInsensitive(String value) {
            addCriterion("upper(shipper_town_name) like", value.toUpperCase(), "shipperTownName");
            return (Criteria) this;
        }

        public Criteria andShipperAddressLikeInsensitive(String value) {
            addCriterion("upper(shipper_address) like", value.toUpperCase(), "shipperAddress");
            return (Criteria) this;
        }

        public Criteria andShipperLinkNameLikeInsensitive(String value) {
            addCriterion("upper(shipper_link_name) like", value.toUpperCase(), "shipperLinkName");
            return (Criteria) this;
        }

        public Criteria andShipperLinkPhoneLikeInsensitive(String value) {
            addCriterion("upper(shipper_link_phone) like", value.toUpperCase(), "shipperLinkPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLikeInsensitive(String value) {
            addCriterion("upper(receive_name) like", value.toUpperCase(), "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNameLikeInsensitive(String value) {
            addCriterion("upper(receive_province_name) like", value.toUpperCase(), "receiveProvinceName");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNameLikeInsensitive(String value) {
            addCriterion("upper(receive_city_name) like", value.toUpperCase(), "receiveCityName");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNameLikeInsensitive(String value) {
            addCriterion("upper(receive_country_name) like", value.toUpperCase(), "receiveCountryName");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLikeInsensitive(String value) {
            addCriterion("upper(receive_address) like", value.toUpperCase(), "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkNameLikeInsensitive(String value) {
            addCriterion("upper(receive_link_name) like", value.toUpperCase(), "receiveLinkName");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkPhoneLikeInsensitive(String value) {
            addCriterion("upper(receive_link_phone) like", value.toUpperCase(), "receiveLinkPhone");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonLikeInsensitive(String value) {
            addCriterion("upper(delete_reason) like", value.toUpperCase(), "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonMemoLikeInsensitive(String value) {
            addCriterion("upper(delete_reason_memo) like", value.toUpperCase(), "deleteReasonMemo");
            return (Criteria) this;
        }

        public Criteria andOtherConnectTypeLikeInsensitive(String value) {
            addCriterion("upper(other_connect_type) like", value.toUpperCase(), "otherConnectType");
            return (Criteria) this;
        }

        public Criteria andTicketNameLikeInsensitive(String value) {
            addCriterion("upper(ticket_name) like", value.toUpperCase(), "ticketName");
            return (Criteria) this;
        }

        public Criteria andStackRequireLikeInsensitive(String value) {
            addCriterion("upper(stack_require) like", value.toUpperCase(), "stackRequire");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andBackMemoLikeInsensitive(String value) {
            addCriterion("upper(back_memo) like", value.toUpperCase(), "backMemo");
            return (Criteria) this;
        }

        public Criteria andBackSubmitUserNameLikeInsensitive(String value) {
            addCriterion("upper(back_submit_user_name) like", value.toUpperCase(), "backSubmitUserName");
            return (Criteria) this;
        }

        public Criteria andBackReceiveUserNameLikeInsensitive(String value) {
            addCriterion("upper(back_receive_user_name) like", value.toUpperCase(), "backReceiveUserName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(booker_employee_name) like", value.toUpperCase(), "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLikeInsensitive(String value) {
            addCriterion("upper(business_name) like", value.toUpperCase(), "businessName");
            return (Criteria) this;
        }

        public Criteria andDownIdLikeInsensitive(String value) {
            addCriterion("upper(down_id) like", value.toUpperCase(), "downId");
            return (Criteria) this;
        }

        public Criteria andSignUserNameLikeInsensitive(String value) {
            addCriterion("upper(sign_user_name) like", value.toUpperCase(), "signUserName");
            return (Criteria) this;
        }

        public Criteria andFreeReasonLikeInsensitive(String value) {
            addCriterion("upper(free_reason) like", value.toUpperCase(), "freeReason");
            return (Criteria) this;
        }

        public Criteria andArrivalStationUserNameLikeInsensitive(String value) {
            addCriterion("upper(arrival_station_user_name) like", value.toUpperCase(), "arrivalStationUserName");
            return (Criteria) this;
        }

        public Criteria andPaySuccessUserNameLikeInsensitive(String value) {
            addCriterion("upper(pay_success_user_name) like", value.toUpperCase(), "paySuccessUserName");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessNameLikeInsensitive(String value) {
            addCriterion("upper(current_process_name) like", value.toUpperCase(), "currentProcessName");
            return (Criteria) this;
        }

        public Criteria andWaybillOuttimeReasonLikeInsensitive(String value) {
            addCriterion("upper(waybill_outtime_reason) like", value.toUpperCase(), "waybillOuttimeReason");
            return (Criteria) this;
        }

        public Criteria andShipperLinkMobileLikeInsensitive(String value) {
            addCriterion("upper(shipper_link_mobile) like", value.toUpperCase(), "shipperLinkMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkMobileLikeInsensitive(String value) {
            addCriterion("upper(receive_link_mobile) like", value.toUpperCase(), "receiveLinkMobile");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}