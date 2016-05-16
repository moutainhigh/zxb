package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbStowageCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbStowageCriteria() {
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

        public Criteria andStowageSnIsNull() {
            addCriterion("stowage_sn is null");
            return (Criteria) this;
        }

        public Criteria andStowageSnIsNotNull() {
            addCriterion("stowage_sn is not null");
            return (Criteria) this;
        }

        public Criteria andStowageSnEqualTo(String value) {
            addCriterion("stowage_sn =", value, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnNotEqualTo(String value) {
            addCriterion("stowage_sn <>", value, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnGreaterThan(String value) {
            addCriterion("stowage_sn >", value, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnGreaterThanOrEqualTo(String value) {
            addCriterion("stowage_sn >=", value, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnLessThan(String value) {
            addCriterion("stowage_sn <", value, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnLessThanOrEqualTo(String value) {
            addCriterion("stowage_sn <=", value, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnLike(String value) {
            addCriterion("stowage_sn like", value, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnNotLike(String value) {
            addCriterion("stowage_sn not like", value, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnIn(List<String> values) {
            addCriterion("stowage_sn in", values, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnNotIn(List<String> values) {
            addCriterion("stowage_sn not in", values, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnBetween(String value1, String value2) {
            addCriterion("stowage_sn between", value1, value2, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andStowageSnNotBetween(String value1, String value2) {
            addCriterion("stowage_sn not between", value1, value2, "stowageSn");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andAllocCenterLinkIdIsNull() {
            addCriterion("alloc_center_link_id is null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdIsNotNull() {
            addCriterion("alloc_center_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdEqualTo(Long value) {
            addCriterion("alloc_center_link_id =", value, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdNotEqualTo(Long value) {
            addCriterion("alloc_center_link_id <>", value, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdGreaterThan(Long value) {
            addCriterion("alloc_center_link_id >", value, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("alloc_center_link_id >=", value, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdLessThan(Long value) {
            addCriterion("alloc_center_link_id <", value, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdLessThanOrEqualTo(Long value) {
            addCriterion("alloc_center_link_id <=", value, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdIn(List<Long> values) {
            addCriterion("alloc_center_link_id in", values, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdNotIn(List<Long> values) {
            addCriterion("alloc_center_link_id not in", values, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdBetween(Long value1, Long value2) {
            addCriterion("alloc_center_link_id between", value1, value2, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkIdNotBetween(Long value1, Long value2) {
            addCriterion("alloc_center_link_id not between", value1, value2, "allocCenterLinkId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameIsNull() {
            addCriterion("alloc_center_link_name is null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameIsNotNull() {
            addCriterion("alloc_center_link_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameEqualTo(String value) {
            addCriterion("alloc_center_link_name =", value, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameNotEqualTo(String value) {
            addCriterion("alloc_center_link_name <>", value, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameGreaterThan(String value) {
            addCriterion("alloc_center_link_name >", value, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("alloc_center_link_name >=", value, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameLessThan(String value) {
            addCriterion("alloc_center_link_name <", value, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameLessThanOrEqualTo(String value) {
            addCriterion("alloc_center_link_name <=", value, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameLike(String value) {
            addCriterion("alloc_center_link_name like", value, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameNotLike(String value) {
            addCriterion("alloc_center_link_name not like", value, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameIn(List<String> values) {
            addCriterion("alloc_center_link_name in", values, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameNotIn(List<String> values) {
            addCriterion("alloc_center_link_name not in", values, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameBetween(String value1, String value2) {
            addCriterion("alloc_center_link_name between", value1, value2, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkNameNotBetween(String value1, String value2) {
            addCriterion("alloc_center_link_name not between", value1, value2, "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneIsNull() {
            addCriterion("alloc_center_link_phone is null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneIsNotNull() {
            addCriterion("alloc_center_link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneEqualTo(String value) {
            addCriterion("alloc_center_link_phone =", value, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneNotEqualTo(String value) {
            addCriterion("alloc_center_link_phone <>", value, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneGreaterThan(String value) {
            addCriterion("alloc_center_link_phone >", value, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("alloc_center_link_phone >=", value, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneLessThan(String value) {
            addCriterion("alloc_center_link_phone <", value, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("alloc_center_link_phone <=", value, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneLike(String value) {
            addCriterion("alloc_center_link_phone like", value, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneNotLike(String value) {
            addCriterion("alloc_center_link_phone not like", value, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneIn(List<String> values) {
            addCriterion("alloc_center_link_phone in", values, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneNotIn(List<String> values) {
            addCriterion("alloc_center_link_phone not in", values, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneBetween(String value1, String value2) {
            addCriterion("alloc_center_link_phone between", value1, value2, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("alloc_center_link_phone not between", value1, value2, "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressIsNull() {
            addCriterion("alloc_center_address is null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressIsNotNull() {
            addCriterion("alloc_center_address is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressEqualTo(String value) {
            addCriterion("alloc_center_address =", value, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressNotEqualTo(String value) {
            addCriterion("alloc_center_address <>", value, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressGreaterThan(String value) {
            addCriterion("alloc_center_address >", value, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("alloc_center_address >=", value, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressLessThan(String value) {
            addCriterion("alloc_center_address <", value, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressLessThanOrEqualTo(String value) {
            addCriterion("alloc_center_address <=", value, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressLike(String value) {
            addCriterion("alloc_center_address like", value, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressNotLike(String value) {
            addCriterion("alloc_center_address not like", value, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressIn(List<String> values) {
            addCriterion("alloc_center_address in", values, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressNotIn(List<String> values) {
            addCriterion("alloc_center_address not in", values, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressBetween(String value1, String value2) {
            addCriterion("alloc_center_address between", value1, value2, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressNotBetween(String value1, String value2) {
            addCriterion("alloc_center_address not between", value1, value2, "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andStowageTimeIsNull() {
            addCriterion("stowage_time is null");
            return (Criteria) this;
        }

        public Criteria andStowageTimeIsNotNull() {
            addCriterion("stowage_time is not null");
            return (Criteria) this;
        }

        public Criteria andStowageTimeEqualTo(Date value) {
            addCriterion("stowage_time =", value, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeNotEqualTo(Date value) {
            addCriterion("stowage_time <>", value, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeGreaterThan(Date value) {
            addCriterion("stowage_time >", value, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stowage_time >=", value, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeLessThan(Date value) {
            addCriterion("stowage_time <", value, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeLessThanOrEqualTo(Date value) {
            addCriterion("stowage_time <=", value, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeIn(List<Date> values) {
            addCriterion("stowage_time in", values, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeNotIn(List<Date> values) {
            addCriterion("stowage_time not in", values, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeBetween(Date value1, Date value2) {
            addCriterion("stowage_time between", value1, value2, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andStowageTimeNotBetween(Date value1, Date value2) {
            addCriterion("stowage_time not between", value1, value2, "stowageTime");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("plate_number not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneIsNull() {
            addCriterion("driver_phone is null");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneIsNotNull() {
            addCriterion("driver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneEqualTo(String value) {
            addCriterion("driver_phone =", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotEqualTo(String value) {
            addCriterion("driver_phone <>", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneGreaterThan(String value) {
            addCriterion("driver_phone >", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("driver_phone >=", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLessThan(String value) {
            addCriterion("driver_phone <", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLessThanOrEqualTo(String value) {
            addCriterion("driver_phone <=", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLike(String value) {
            addCriterion("driver_phone like", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotLike(String value) {
            addCriterion("driver_phone not like", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneIn(List<String> values) {
            addCriterion("driver_phone in", values, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotIn(List<String> values) {
            addCriterion("driver_phone not in", values, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneBetween(String value1, String value2) {
            addCriterion("driver_phone between", value1, value2, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotBetween(String value1, String value2) {
            addCriterion("driver_phone not between", value1, value2, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andTruckLengthIsNull() {
            addCriterion("truck_length is null");
            return (Criteria) this;
        }

        public Criteria andTruckLengthIsNotNull() {
            addCriterion("truck_length is not null");
            return (Criteria) this;
        }

        public Criteria andTruckLengthEqualTo(String value) {
            addCriterion("truck_length =", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthNotEqualTo(String value) {
            addCriterion("truck_length <>", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthGreaterThan(String value) {
            addCriterion("truck_length >", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthGreaterThanOrEqualTo(String value) {
            addCriterion("truck_length >=", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthLessThan(String value) {
            addCriterion("truck_length <", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthLessThanOrEqualTo(String value) {
            addCriterion("truck_length <=", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthLike(String value) {
            addCriterion("truck_length like", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthNotLike(String value) {
            addCriterion("truck_length not like", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthIn(List<String> values) {
            addCriterion("truck_length in", values, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthNotIn(List<String> values) {
            addCriterion("truck_length not in", values, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthBetween(String value1, String value2) {
            addCriterion("truck_length between", value1, value2, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthNotBetween(String value1, String value2) {
            addCriterion("truck_length not between", value1, value2, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckModelIsNull() {
            addCriterion("truck_model is null");
            return (Criteria) this;
        }

        public Criteria andTruckModelIsNotNull() {
            addCriterion("truck_model is not null");
            return (Criteria) this;
        }

        public Criteria andTruckModelEqualTo(String value) {
            addCriterion("truck_model =", value, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelNotEqualTo(String value) {
            addCriterion("truck_model <>", value, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelGreaterThan(String value) {
            addCriterion("truck_model >", value, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelGreaterThanOrEqualTo(String value) {
            addCriterion("truck_model >=", value, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelLessThan(String value) {
            addCriterion("truck_model <", value, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelLessThanOrEqualTo(String value) {
            addCriterion("truck_model <=", value, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelLike(String value) {
            addCriterion("truck_model like", value, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelNotLike(String value) {
            addCriterion("truck_model not like", value, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelIn(List<String> values) {
            addCriterion("truck_model in", values, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelNotIn(List<String> values) {
            addCriterion("truck_model not in", values, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelBetween(String value1, String value2) {
            addCriterion("truck_model between", value1, value2, "truckModel");
            return (Criteria) this;
        }

        public Criteria andTruckModelNotBetween(String value1, String value2) {
            addCriterion("truck_model not between", value1, value2, "truckModel");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeIsNull() {
            addCriterion("main_line_fee is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeIsNotNull() {
            addCriterion("main_line_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeEqualTo(BigDecimal value) {
            addCriterion("main_line_fee =", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeNotEqualTo(BigDecimal value) {
            addCriterion("main_line_fee <>", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeGreaterThan(BigDecimal value) {
            addCriterion("main_line_fee >", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("main_line_fee >=", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeLessThan(BigDecimal value) {
            addCriterion("main_line_fee <", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("main_line_fee <=", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeIn(List<BigDecimal> values) {
            addCriterion("main_line_fee in", values, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeNotIn(List<BigDecimal> values) {
            addCriterion("main_line_fee not in", values, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_line_fee between", value1, value2, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_line_fee not between", value1, value2, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
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

        public Criteria andMainLineFeeStatusIsNull() {
            addCriterion("main_line_fee_status is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusIsNotNull() {
            addCriterion("main_line_fee_status is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusEqualTo(Integer value) {
            addCriterion("main_line_fee_status =", value, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusNotEqualTo(Integer value) {
            addCriterion("main_line_fee_status <>", value, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusGreaterThan(Integer value) {
            addCriterion("main_line_fee_status >", value, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_line_fee_status >=", value, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusLessThan(Integer value) {
            addCriterion("main_line_fee_status <", value, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("main_line_fee_status <=", value, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusIn(List<Integer> values) {
            addCriterion("main_line_fee_status in", values, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusNotIn(List<Integer> values) {
            addCriterion("main_line_fee_status not in", values, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusBetween(Integer value1, Integer value2) {
            addCriterion("main_line_fee_status between", value1, value2, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("main_line_fee_status not between", value1, value2, "mainLineFeeStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdIsNull() {
            addCriterion("main_line_fee_verifi_id is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdIsNotNull() {
            addCriterion("main_line_fee_verifi_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdEqualTo(Long value) {
            addCriterion("main_line_fee_verifi_id =", value, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdNotEqualTo(Long value) {
            addCriterion("main_line_fee_verifi_id <>", value, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdGreaterThan(Long value) {
            addCriterion("main_line_fee_verifi_id >", value, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("main_line_fee_verifi_id >=", value, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdLessThan(Long value) {
            addCriterion("main_line_fee_verifi_id <", value, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdLessThanOrEqualTo(Long value) {
            addCriterion("main_line_fee_verifi_id <=", value, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdIn(List<Long> values) {
            addCriterion("main_line_fee_verifi_id in", values, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdNotIn(List<Long> values) {
            addCriterion("main_line_fee_verifi_id not in", values, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdBetween(Long value1, Long value2) {
            addCriterion("main_line_fee_verifi_id between", value1, value2, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiIdNotBetween(Long value1, Long value2) {
            addCriterion("main_line_fee_verifi_id not between", value1, value2, "mainLineFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameIsNull() {
            addCriterion("main_line_fee_verifi_name is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameIsNotNull() {
            addCriterion("main_line_fee_verifi_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameEqualTo(String value) {
            addCriterion("main_line_fee_verifi_name =", value, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameNotEqualTo(String value) {
            addCriterion("main_line_fee_verifi_name <>", value, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameGreaterThan(String value) {
            addCriterion("main_line_fee_verifi_name >", value, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameGreaterThanOrEqualTo(String value) {
            addCriterion("main_line_fee_verifi_name >=", value, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameLessThan(String value) {
            addCriterion("main_line_fee_verifi_name <", value, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameLessThanOrEqualTo(String value) {
            addCriterion("main_line_fee_verifi_name <=", value, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameLike(String value) {
            addCriterion("main_line_fee_verifi_name like", value, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameNotLike(String value) {
            addCriterion("main_line_fee_verifi_name not like", value, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameIn(List<String> values) {
            addCriterion("main_line_fee_verifi_name in", values, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameNotIn(List<String> values) {
            addCriterion("main_line_fee_verifi_name not in", values, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameBetween(String value1, String value2) {
            addCriterion("main_line_fee_verifi_name between", value1, value2, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameNotBetween(String value1, String value2) {
            addCriterion("main_line_fee_verifi_name not between", value1, value2, "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeIsNull() {
            addCriterion("main_line_fee_verifi_time is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeIsNotNull() {
            addCriterion("main_line_fee_verifi_time is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeEqualTo(Date value) {
            addCriterion("main_line_fee_verifi_time =", value, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeNotEqualTo(Date value) {
            addCriterion("main_line_fee_verifi_time <>", value, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeGreaterThan(Date value) {
            addCriterion("main_line_fee_verifi_time >", value, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("main_line_fee_verifi_time >=", value, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeLessThan(Date value) {
            addCriterion("main_line_fee_verifi_time <", value, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeLessThanOrEqualTo(Date value) {
            addCriterion("main_line_fee_verifi_time <=", value, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeIn(List<Date> values) {
            addCriterion("main_line_fee_verifi_time in", values, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeNotIn(List<Date> values) {
            addCriterion("main_line_fee_verifi_time not in", values, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeBetween(Date value1, Date value2) {
            addCriterion("main_line_fee_verifi_time between", value1, value2, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiTimeNotBetween(Date value1, Date value2) {
            addCriterion("main_line_fee_verifi_time not between", value1, value2, "mainLineFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdIsNull() {
            addCriterion("main_line_fee_payment_id is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdIsNotNull() {
            addCriterion("main_line_fee_payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdEqualTo(Long value) {
            addCriterion("main_line_fee_payment_id =", value, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdNotEqualTo(Long value) {
            addCriterion("main_line_fee_payment_id <>", value, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdGreaterThan(Long value) {
            addCriterion("main_line_fee_payment_id >", value, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("main_line_fee_payment_id >=", value, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdLessThan(Long value) {
            addCriterion("main_line_fee_payment_id <", value, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("main_line_fee_payment_id <=", value, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdIn(List<Long> values) {
            addCriterion("main_line_fee_payment_id in", values, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdNotIn(List<Long> values) {
            addCriterion("main_line_fee_payment_id not in", values, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdBetween(Long value1, Long value2) {
            addCriterion("main_line_fee_payment_id between", value1, value2, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("main_line_fee_payment_id not between", value1, value2, "mainLineFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameIsNull() {
            addCriterion("main_line_fee_payment_name is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameIsNotNull() {
            addCriterion("main_line_fee_payment_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameEqualTo(String value) {
            addCriterion("main_line_fee_payment_name =", value, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameNotEqualTo(String value) {
            addCriterion("main_line_fee_payment_name <>", value, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameGreaterThan(String value) {
            addCriterion("main_line_fee_payment_name >", value, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameGreaterThanOrEqualTo(String value) {
            addCriterion("main_line_fee_payment_name >=", value, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameLessThan(String value) {
            addCriterion("main_line_fee_payment_name <", value, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameLessThanOrEqualTo(String value) {
            addCriterion("main_line_fee_payment_name <=", value, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameLike(String value) {
            addCriterion("main_line_fee_payment_name like", value, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameNotLike(String value) {
            addCriterion("main_line_fee_payment_name not like", value, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameIn(List<String> values) {
            addCriterion("main_line_fee_payment_name in", values, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameNotIn(List<String> values) {
            addCriterion("main_line_fee_payment_name not in", values, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameBetween(String value1, String value2) {
            addCriterion("main_line_fee_payment_name between", value1, value2, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameNotBetween(String value1, String value2) {
            addCriterion("main_line_fee_payment_name not between", value1, value2, "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeIsNull() {
            addCriterion("main_line_fee_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeIsNotNull() {
            addCriterion("main_line_fee_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeEqualTo(Date value) {
            addCriterion("main_line_fee_payment_time =", value, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeNotEqualTo(Date value) {
            addCriterion("main_line_fee_payment_time <>", value, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeGreaterThan(Date value) {
            addCriterion("main_line_fee_payment_time >", value, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("main_line_fee_payment_time >=", value, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeLessThan(Date value) {
            addCriterion("main_line_fee_payment_time <", value, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("main_line_fee_payment_time <=", value, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeIn(List<Date> values) {
            addCriterion("main_line_fee_payment_time in", values, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeNotIn(List<Date> values) {
            addCriterion("main_line_fee_payment_time not in", values, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeBetween(Date value1, Date value2) {
            addCriterion("main_line_fee_payment_time between", value1, value2, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("main_line_fee_payment_time not between", value1, value2, "mainLineFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusIsNull() {
            addCriterion("main_line_over_status is null");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusIsNotNull() {
            addCriterion("main_line_over_status is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusEqualTo(Integer value) {
            addCriterion("main_line_over_status =", value, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusNotEqualTo(Integer value) {
            addCriterion("main_line_over_status <>", value, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusGreaterThan(Integer value) {
            addCriterion("main_line_over_status >", value, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_line_over_status >=", value, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusLessThan(Integer value) {
            addCriterion("main_line_over_status <", value, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusLessThanOrEqualTo(Integer value) {
            addCriterion("main_line_over_status <=", value, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusIn(List<Integer> values) {
            addCriterion("main_line_over_status in", values, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusNotIn(List<Integer> values) {
            addCriterion("main_line_over_status not in", values, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusBetween(Integer value1, Integer value2) {
            addCriterion("main_line_over_status between", value1, value2, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("main_line_over_status not between", value1, value2, "mainLineOverStatus");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeIsNull() {
            addCriterion("main_line_over_time is null");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeIsNotNull() {
            addCriterion("main_line_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeEqualTo(Date value) {
            addCriterion("main_line_over_time =", value, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeNotEqualTo(Date value) {
            addCriterion("main_line_over_time <>", value, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeGreaterThan(Date value) {
            addCriterion("main_line_over_time >", value, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("main_line_over_time >=", value, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeLessThan(Date value) {
            addCriterion("main_line_over_time <", value, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("main_line_over_time <=", value, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeIn(List<Date> values) {
            addCriterion("main_line_over_time in", values, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeNotIn(List<Date> values) {
            addCriterion("main_line_over_time not in", values, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeBetween(Date value1, Date value2) {
            addCriterion("main_line_over_time between", value1, value2, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("main_line_over_time not between", value1, value2, "mainLineOverTime");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdIsNull() {
            addCriterion("main_line_over_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdIsNotNull() {
            addCriterion("main_line_over_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdEqualTo(Long value) {
            addCriterion("main_line_over_user_id =", value, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdNotEqualTo(Long value) {
            addCriterion("main_line_over_user_id <>", value, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdGreaterThan(Long value) {
            addCriterion("main_line_over_user_id >", value, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("main_line_over_user_id >=", value, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdLessThan(Long value) {
            addCriterion("main_line_over_user_id <", value, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdLessThanOrEqualTo(Long value) {
            addCriterion("main_line_over_user_id <=", value, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdIn(List<Long> values) {
            addCriterion("main_line_over_user_id in", values, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdNotIn(List<Long> values) {
            addCriterion("main_line_over_user_id not in", values, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdBetween(Long value1, Long value2) {
            addCriterion("main_line_over_user_id between", value1, value2, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserIdNotBetween(Long value1, Long value2) {
            addCriterion("main_line_over_user_id not between", value1, value2, "mainLineOverUserId");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameIsNull() {
            addCriterion("main_line_over_user_name is null");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameIsNotNull() {
            addCriterion("main_line_over_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameEqualTo(String value) {
            addCriterion("main_line_over_user_name =", value, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameNotEqualTo(String value) {
            addCriterion("main_line_over_user_name <>", value, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameGreaterThan(String value) {
            addCriterion("main_line_over_user_name >", value, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("main_line_over_user_name >=", value, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameLessThan(String value) {
            addCriterion("main_line_over_user_name <", value, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameLessThanOrEqualTo(String value) {
            addCriterion("main_line_over_user_name <=", value, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameLike(String value) {
            addCriterion("main_line_over_user_name like", value, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameNotLike(String value) {
            addCriterion("main_line_over_user_name not like", value, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameIn(List<String> values) {
            addCriterion("main_line_over_user_name in", values, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameNotIn(List<String> values) {
            addCriterion("main_line_over_user_name not in", values, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameBetween(String value1, String value2) {
            addCriterion("main_line_over_user_name between", value1, value2, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameNotBetween(String value1, String value2) {
            addCriterion("main_line_over_user_name not between", value1, value2, "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeIsNull() {
            addCriterion("ofgoods_fee is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeIsNotNull() {
            addCriterion("ofgoods_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeEqualTo(BigDecimal value) {
            addCriterion("ofgoods_fee =", value, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeNotEqualTo(BigDecimal value) {
            addCriterion("ofgoods_fee <>", value, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeGreaterThan(BigDecimal value) {
            addCriterion("ofgoods_fee >", value, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ofgoods_fee >=", value, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeLessThan(BigDecimal value) {
            addCriterion("ofgoods_fee <", value, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ofgoods_fee <=", value, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeIn(List<BigDecimal> values) {
            addCriterion("ofgoods_fee in", values, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeNotIn(List<BigDecimal> values) {
            addCriterion("ofgoods_fee not in", values, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ofgoods_fee between", value1, value2, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ofgoods_fee not between", value1, value2, "ofgoodsFee");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeIsNull() {
            addCriterion("ofgoods_time is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeIsNotNull() {
            addCriterion("ofgoods_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeEqualTo(Date value) {
            addCriterion("ofgoods_time =", value, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeNotEqualTo(Date value) {
            addCriterion("ofgoods_time <>", value, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeGreaterThan(Date value) {
            addCriterion("ofgoods_time >", value, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ofgoods_time >=", value, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeLessThan(Date value) {
            addCriterion("ofgoods_time <", value, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeLessThanOrEqualTo(Date value) {
            addCriterion("ofgoods_time <=", value, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeIn(List<Date> values) {
            addCriterion("ofgoods_time in", values, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeNotIn(List<Date> values) {
            addCriterion("ofgoods_time not in", values, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeBetween(Date value1, Date value2) {
            addCriterion("ofgoods_time between", value1, value2, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsTimeNotBetween(Date value1, Date value2) {
            addCriterion("ofgoods_time not between", value1, value2, "ofgoodsTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdIsNull() {
            addCriterion("ofgoods_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdIsNotNull() {
            addCriterion("ofgoods_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdEqualTo(Long value) {
            addCriterion("ofgoods_user_id =", value, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdNotEqualTo(Long value) {
            addCriterion("ofgoods_user_id <>", value, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdGreaterThan(Long value) {
            addCriterion("ofgoods_user_id >", value, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ofgoods_user_id >=", value, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdLessThan(Long value) {
            addCriterion("ofgoods_user_id <", value, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdLessThanOrEqualTo(Long value) {
            addCriterion("ofgoods_user_id <=", value, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdIn(List<Long> values) {
            addCriterion("ofgoods_user_id in", values, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdNotIn(List<Long> values) {
            addCriterion("ofgoods_user_id not in", values, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdBetween(Long value1, Long value2) {
            addCriterion("ofgoods_user_id between", value1, value2, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserIdNotBetween(Long value1, Long value2) {
            addCriterion("ofgoods_user_id not between", value1, value2, "ofgoodsUserId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameIsNull() {
            addCriterion("ofgoods_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameIsNotNull() {
            addCriterion("ofgoods_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameEqualTo(String value) {
            addCriterion("ofgoods_user_name =", value, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameNotEqualTo(String value) {
            addCriterion("ofgoods_user_name <>", value, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameGreaterThan(String value) {
            addCriterion("ofgoods_user_name >", value, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("ofgoods_user_name >=", value, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameLessThan(String value) {
            addCriterion("ofgoods_user_name <", value, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameLessThanOrEqualTo(String value) {
            addCriterion("ofgoods_user_name <=", value, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameLike(String value) {
            addCriterion("ofgoods_user_name like", value, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameNotLike(String value) {
            addCriterion("ofgoods_user_name not like", value, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameIn(List<String> values) {
            addCriterion("ofgoods_user_name in", values, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameNotIn(List<String> values) {
            addCriterion("ofgoods_user_name not in", values, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameBetween(String value1, String value2) {
            addCriterion("ofgoods_user_name between", value1, value2, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameNotBetween(String value1, String value2) {
            addCriterion("ofgoods_user_name not between", value1, value2, "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusIsNull() {
            addCriterion("ofgoods_fee_verifi_status is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusIsNotNull() {
            addCriterion("ofgoods_fee_verifi_status is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusEqualTo(Integer value) {
            addCriterion("ofgoods_fee_verifi_status =", value, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusNotEqualTo(Integer value) {
            addCriterion("ofgoods_fee_verifi_status <>", value, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusGreaterThan(Integer value) {
            addCriterion("ofgoods_fee_verifi_status >", value, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ofgoods_fee_verifi_status >=", value, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusLessThan(Integer value) {
            addCriterion("ofgoods_fee_verifi_status <", value, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ofgoods_fee_verifi_status <=", value, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusIn(List<Integer> values) {
            addCriterion("ofgoods_fee_verifi_status in", values, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusNotIn(List<Integer> values) {
            addCriterion("ofgoods_fee_verifi_status not in", values, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusBetween(Integer value1, Integer value2) {
            addCriterion("ofgoods_fee_verifi_status between", value1, value2, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ofgoods_fee_verifi_status not between", value1, value2, "ofgoodsFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdIsNull() {
            addCriterion("ofgoods_fee_verifi_id is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdIsNotNull() {
            addCriterion("ofgoods_fee_verifi_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdEqualTo(Long value) {
            addCriterion("ofgoods_fee_verifi_id =", value, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdNotEqualTo(Long value) {
            addCriterion("ofgoods_fee_verifi_id <>", value, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdGreaterThan(Long value) {
            addCriterion("ofgoods_fee_verifi_id >", value, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ofgoods_fee_verifi_id >=", value, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdLessThan(Long value) {
            addCriterion("ofgoods_fee_verifi_id <", value, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdLessThanOrEqualTo(Long value) {
            addCriterion("ofgoods_fee_verifi_id <=", value, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdIn(List<Long> values) {
            addCriterion("ofgoods_fee_verifi_id in", values, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdNotIn(List<Long> values) {
            addCriterion("ofgoods_fee_verifi_id not in", values, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdBetween(Long value1, Long value2) {
            addCriterion("ofgoods_fee_verifi_id between", value1, value2, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiIdNotBetween(Long value1, Long value2) {
            addCriterion("ofgoods_fee_verifi_id not between", value1, value2, "ofgoodsFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameIsNull() {
            addCriterion("ofgoods_fee_verifi_name is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameIsNotNull() {
            addCriterion("ofgoods_fee_verifi_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameEqualTo(String value) {
            addCriterion("ofgoods_fee_verifi_name =", value, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameNotEqualTo(String value) {
            addCriterion("ofgoods_fee_verifi_name <>", value, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameGreaterThan(String value) {
            addCriterion("ofgoods_fee_verifi_name >", value, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameGreaterThanOrEqualTo(String value) {
            addCriterion("ofgoods_fee_verifi_name >=", value, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameLessThan(String value) {
            addCriterion("ofgoods_fee_verifi_name <", value, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameLessThanOrEqualTo(String value) {
            addCriterion("ofgoods_fee_verifi_name <=", value, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameLike(String value) {
            addCriterion("ofgoods_fee_verifi_name like", value, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameNotLike(String value) {
            addCriterion("ofgoods_fee_verifi_name not like", value, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameIn(List<String> values) {
            addCriterion("ofgoods_fee_verifi_name in", values, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameNotIn(List<String> values) {
            addCriterion("ofgoods_fee_verifi_name not in", values, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameBetween(String value1, String value2) {
            addCriterion("ofgoods_fee_verifi_name between", value1, value2, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameNotBetween(String value1, String value2) {
            addCriterion("ofgoods_fee_verifi_name not between", value1, value2, "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeIsNull() {
            addCriterion("ofgoods_fee_verifi_time is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeIsNotNull() {
            addCriterion("ofgoods_fee_verifi_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeEqualTo(Date value) {
            addCriterion("ofgoods_fee_verifi_time =", value, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeNotEqualTo(Date value) {
            addCriterion("ofgoods_fee_verifi_time <>", value, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeGreaterThan(Date value) {
            addCriterion("ofgoods_fee_verifi_time >", value, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ofgoods_fee_verifi_time >=", value, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeLessThan(Date value) {
            addCriterion("ofgoods_fee_verifi_time <", value, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeLessThanOrEqualTo(Date value) {
            addCriterion("ofgoods_fee_verifi_time <=", value, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeIn(List<Date> values) {
            addCriterion("ofgoods_fee_verifi_time in", values, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeNotIn(List<Date> values) {
            addCriterion("ofgoods_fee_verifi_time not in", values, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeBetween(Date value1, Date value2) {
            addCriterion("ofgoods_fee_verifi_time between", value1, value2, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiTimeNotBetween(Date value1, Date value2) {
            addCriterion("ofgoods_fee_verifi_time not between", value1, value2, "ofgoodsFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdIsNull() {
            addCriterion("ofgoods_fee_payment_id is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdIsNotNull() {
            addCriterion("ofgoods_fee_payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdEqualTo(Long value) {
            addCriterion("ofgoods_fee_payment_id =", value, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdNotEqualTo(Long value) {
            addCriterion("ofgoods_fee_payment_id <>", value, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdGreaterThan(Long value) {
            addCriterion("ofgoods_fee_payment_id >", value, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ofgoods_fee_payment_id >=", value, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdLessThan(Long value) {
            addCriterion("ofgoods_fee_payment_id <", value, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("ofgoods_fee_payment_id <=", value, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdIn(List<Long> values) {
            addCriterion("ofgoods_fee_payment_id in", values, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdNotIn(List<Long> values) {
            addCriterion("ofgoods_fee_payment_id not in", values, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdBetween(Long value1, Long value2) {
            addCriterion("ofgoods_fee_payment_id between", value1, value2, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("ofgoods_fee_payment_id not between", value1, value2, "ofgoodsFeePaymentId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameIsNull() {
            addCriterion("ofgoods_fee_payment_name is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameIsNotNull() {
            addCriterion("ofgoods_fee_payment_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameEqualTo(String value) {
            addCriterion("ofgoods_fee_payment_name =", value, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameNotEqualTo(String value) {
            addCriterion("ofgoods_fee_payment_name <>", value, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameGreaterThan(String value) {
            addCriterion("ofgoods_fee_payment_name >", value, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameGreaterThanOrEqualTo(String value) {
            addCriterion("ofgoods_fee_payment_name >=", value, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameLessThan(String value) {
            addCriterion("ofgoods_fee_payment_name <", value, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameLessThanOrEqualTo(String value) {
            addCriterion("ofgoods_fee_payment_name <=", value, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameLike(String value) {
            addCriterion("ofgoods_fee_payment_name like", value, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameNotLike(String value) {
            addCriterion("ofgoods_fee_payment_name not like", value, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameIn(List<String> values) {
            addCriterion("ofgoods_fee_payment_name in", values, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameNotIn(List<String> values) {
            addCriterion("ofgoods_fee_payment_name not in", values, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameBetween(String value1, String value2) {
            addCriterion("ofgoods_fee_payment_name between", value1, value2, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameNotBetween(String value1, String value2) {
            addCriterion("ofgoods_fee_payment_name not between", value1, value2, "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeIsNull() {
            addCriterion("ofgoods_fee_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeIsNotNull() {
            addCriterion("ofgoods_fee_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeEqualTo(Date value) {
            addCriterion("ofgoods_fee_payment_time =", value, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeNotEqualTo(Date value) {
            addCriterion("ofgoods_fee_payment_time <>", value, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeGreaterThan(Date value) {
            addCriterion("ofgoods_fee_payment_time >", value, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ofgoods_fee_payment_time >=", value, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeLessThan(Date value) {
            addCriterion("ofgoods_fee_payment_time <", value, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("ofgoods_fee_payment_time <=", value, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeIn(List<Date> values) {
            addCriterion("ofgoods_fee_payment_time in", values, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeNotIn(List<Date> values) {
            addCriterion("ofgoods_fee_payment_time not in", values, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeBetween(Date value1, Date value2) {
            addCriterion("ofgoods_fee_payment_time between", value1, value2, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("ofgoods_fee_payment_time not between", value1, value2, "ofgoodsFeePaymentTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusIsNull() {
            addCriterion("ofgoods_fee_over_status is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusIsNotNull() {
            addCriterion("ofgoods_fee_over_status is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusEqualTo(Integer value) {
            addCriterion("ofgoods_fee_over_status =", value, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusNotEqualTo(Integer value) {
            addCriterion("ofgoods_fee_over_status <>", value, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusGreaterThan(Integer value) {
            addCriterion("ofgoods_fee_over_status >", value, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ofgoods_fee_over_status >=", value, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusLessThan(Integer value) {
            addCriterion("ofgoods_fee_over_status <", value, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ofgoods_fee_over_status <=", value, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusIn(List<Integer> values) {
            addCriterion("ofgoods_fee_over_status in", values, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusNotIn(List<Integer> values) {
            addCriterion("ofgoods_fee_over_status not in", values, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusBetween(Integer value1, Integer value2) {
            addCriterion("ofgoods_fee_over_status between", value1, value2, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ofgoods_fee_over_status not between", value1, value2, "ofgoodsFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeIsNull() {
            addCriterion("ofgoods_fee_over_time is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeIsNotNull() {
            addCriterion("ofgoods_fee_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeEqualTo(Date value) {
            addCriterion("ofgoods_fee_over_time =", value, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeNotEqualTo(Date value) {
            addCriterion("ofgoods_fee_over_time <>", value, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeGreaterThan(Date value) {
            addCriterion("ofgoods_fee_over_time >", value, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ofgoods_fee_over_time >=", value, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeLessThan(Date value) {
            addCriterion("ofgoods_fee_over_time <", value, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("ofgoods_fee_over_time <=", value, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeIn(List<Date> values) {
            addCriterion("ofgoods_fee_over_time in", values, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeNotIn(List<Date> values) {
            addCriterion("ofgoods_fee_over_time not in", values, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeBetween(Date value1, Date value2) {
            addCriterion("ofgoods_fee_over_time between", value1, value2, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("ofgoods_fee_over_time not between", value1, value2, "ofgoodsFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdIsNull() {
            addCriterion("ofgoods_fee_over_id is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdIsNotNull() {
            addCriterion("ofgoods_fee_over_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdEqualTo(Long value) {
            addCriterion("ofgoods_fee_over_id =", value, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdNotEqualTo(Long value) {
            addCriterion("ofgoods_fee_over_id <>", value, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdGreaterThan(Long value) {
            addCriterion("ofgoods_fee_over_id >", value, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ofgoods_fee_over_id >=", value, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdLessThan(Long value) {
            addCriterion("ofgoods_fee_over_id <", value, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdLessThanOrEqualTo(Long value) {
            addCriterion("ofgoods_fee_over_id <=", value, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdIn(List<Long> values) {
            addCriterion("ofgoods_fee_over_id in", values, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdNotIn(List<Long> values) {
            addCriterion("ofgoods_fee_over_id not in", values, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdBetween(Long value1, Long value2) {
            addCriterion("ofgoods_fee_over_id between", value1, value2, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverIdNotBetween(Long value1, Long value2) {
            addCriterion("ofgoods_fee_over_id not between", value1, value2, "ofgoodsFeeOverId");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameIsNull() {
            addCriterion("ofgoods_fee_over_name is null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameIsNotNull() {
            addCriterion("ofgoods_fee_over_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameEqualTo(String value) {
            addCriterion("ofgoods_fee_over_name =", value, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameNotEqualTo(String value) {
            addCriterion("ofgoods_fee_over_name <>", value, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameGreaterThan(String value) {
            addCriterion("ofgoods_fee_over_name >", value, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameGreaterThanOrEqualTo(String value) {
            addCriterion("ofgoods_fee_over_name >=", value, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameLessThan(String value) {
            addCriterion("ofgoods_fee_over_name <", value, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameLessThanOrEqualTo(String value) {
            addCriterion("ofgoods_fee_over_name <=", value, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameLike(String value) {
            addCriterion("ofgoods_fee_over_name like", value, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameNotLike(String value) {
            addCriterion("ofgoods_fee_over_name not like", value, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameIn(List<String> values) {
            addCriterion("ofgoods_fee_over_name in", values, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameNotIn(List<String> values) {
            addCriterion("ofgoods_fee_over_name not in", values, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameBetween(String value1, String value2) {
            addCriterion("ofgoods_fee_over_name between", value1, value2, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameNotBetween(String value1, String value2) {
            addCriterion("ofgoods_fee_over_name not between", value1, value2, "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andUnloadNumIsNull() {
            addCriterion("unload_num is null");
            return (Criteria) this;
        }

        public Criteria andUnloadNumIsNotNull() {
            addCriterion("unload_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadNumEqualTo(Integer value) {
            addCriterion("unload_num =", value, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumNotEqualTo(Integer value) {
            addCriterion("unload_num <>", value, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumGreaterThan(Integer value) {
            addCriterion("unload_num >", value, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unload_num >=", value, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumLessThan(Integer value) {
            addCriterion("unload_num <", value, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumLessThanOrEqualTo(Integer value) {
            addCriterion("unload_num <=", value, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumIn(List<Integer> values) {
            addCriterion("unload_num in", values, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumNotIn(List<Integer> values) {
            addCriterion("unload_num not in", values, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumBetween(Integer value1, Integer value2) {
            addCriterion("unload_num between", value1, value2, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andUnloadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("unload_num not between", value1, value2, "unloadNum");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(Date value) {
            addCriterion("arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(Date value) {
            addCriterion("arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(Date value) {
            addCriterion("arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(Date value) {
            addCriterion("arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<Date> values) {
            addCriterion("arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<Date> values) {
            addCriterion("arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(Date value1, Date value2) {
            addCriterion("arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrive_time not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdIsNull() {
            addCriterion("arrive_user_id is null");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdIsNotNull() {
            addCriterion("arrive_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdEqualTo(Long value) {
            addCriterion("arrive_user_id =", value, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdNotEqualTo(Long value) {
            addCriterion("arrive_user_id <>", value, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdGreaterThan(Long value) {
            addCriterion("arrive_user_id >", value, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("arrive_user_id >=", value, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdLessThan(Long value) {
            addCriterion("arrive_user_id <", value, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdLessThanOrEqualTo(Long value) {
            addCriterion("arrive_user_id <=", value, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdIn(List<Long> values) {
            addCriterion("arrive_user_id in", values, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdNotIn(List<Long> values) {
            addCriterion("arrive_user_id not in", values, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdBetween(Long value1, Long value2) {
            addCriterion("arrive_user_id between", value1, value2, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserIdNotBetween(Long value1, Long value2) {
            addCriterion("arrive_user_id not between", value1, value2, "arriveUserId");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameIsNull() {
            addCriterion("arrive_user_name is null");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameIsNotNull() {
            addCriterion("arrive_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameEqualTo(String value) {
            addCriterion("arrive_user_name =", value, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameNotEqualTo(String value) {
            addCriterion("arrive_user_name <>", value, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameGreaterThan(String value) {
            addCriterion("arrive_user_name >", value, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_user_name >=", value, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameLessThan(String value) {
            addCriterion("arrive_user_name <", value, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameLessThanOrEqualTo(String value) {
            addCriterion("arrive_user_name <=", value, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameLike(String value) {
            addCriterion("arrive_user_name like", value, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameNotLike(String value) {
            addCriterion("arrive_user_name not like", value, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameIn(List<String> values) {
            addCriterion("arrive_user_name in", values, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameNotIn(List<String> values) {
            addCriterion("arrive_user_name not in", values, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameBetween(String value1, String value2) {
            addCriterion("arrive_user_name between", value1, value2, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameNotBetween(String value1, String value2) {
            addCriterion("arrive_user_name not between", value1, value2, "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdIsNull() {
            addCriterion("depart_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdIsNotNull() {
            addCriterion("depart_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdEqualTo(Long value) {
            addCriterion("depart_user_id =", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdNotEqualTo(Long value) {
            addCriterion("depart_user_id <>", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdGreaterThan(Long value) {
            addCriterion("depart_user_id >", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("depart_user_id >=", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdLessThan(Long value) {
            addCriterion("depart_user_id <", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdLessThanOrEqualTo(Long value) {
            addCriterion("depart_user_id <=", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdIn(List<Long> values) {
            addCriterion("depart_user_id in", values, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdNotIn(List<Long> values) {
            addCriterion("depart_user_id not in", values, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdBetween(Long value1, Long value2) {
            addCriterion("depart_user_id between", value1, value2, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdNotBetween(Long value1, Long value2) {
            addCriterion("depart_user_id not between", value1, value2, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameIsNull() {
            addCriterion("depart_user_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameIsNotNull() {
            addCriterion("depart_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameEqualTo(String value) {
            addCriterion("depart_user_name =", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameNotEqualTo(String value) {
            addCriterion("depart_user_name <>", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameGreaterThan(String value) {
            addCriterion("depart_user_name >", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_user_name >=", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameLessThan(String value) {
            addCriterion("depart_user_name <", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameLessThanOrEqualTo(String value) {
            addCriterion("depart_user_name <=", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameLike(String value) {
            addCriterion("depart_user_name like", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameNotLike(String value) {
            addCriterion("depart_user_name not like", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameIn(List<String> values) {
            addCriterion("depart_user_name in", values, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameNotIn(List<String> values) {
            addCriterion("depart_user_name not in", values, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameBetween(String value1, String value2) {
            addCriterion("depart_user_name between", value1, value2, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameNotBetween(String value1, String value2) {
            addCriterion("depart_user_name not between", value1, value2, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIsNull() {
            addCriterion("depart_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIsNotNull() {
            addCriterion("depart_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartTimeEqualTo(Date value) {
            addCriterion("depart_time =", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotEqualTo(Date value) {
            addCriterion("depart_time <>", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeGreaterThan(Date value) {
            addCriterion("depart_time >", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("depart_time >=", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLessThan(Date value) {
            addCriterion("depart_time <", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLessThanOrEqualTo(Date value) {
            addCriterion("depart_time <=", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIn(List<Date> values) {
            addCriterion("depart_time in", values, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotIn(List<Date> values) {
            addCriterion("depart_time not in", values, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeBetween(Date value1, Date value2) {
            addCriterion("depart_time between", value1, value2, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotBetween(Date value1, Date value2) {
            addCriterion("depart_time not between", value1, value2, "departTime");
            return (Criteria) this;
        }

        public Criteria andStowageSnLikeInsensitive(String value) {
            addCriterion("upper(stowage_sn) like", value.toUpperCase(), "stowageSn");
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

        public Criteria andAllocCenterLinkNameLikeInsensitive(String value) {
            addCriterion("upper(alloc_center_link_name) like", value.toUpperCase(), "allocCenterLinkName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterLinkPhoneLikeInsensitive(String value) {
            addCriterion("upper(alloc_center_link_phone) like", value.toUpperCase(), "allocCenterLinkPhone");
            return (Criteria) this;
        }

        public Criteria andAllocCenterAddressLikeInsensitive(String value) {
            addCriterion("upper(alloc_center_address) like", value.toUpperCase(), "allocCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLikeInsensitive(String value) {
            addCriterion("upper(plate_number) like", value.toUpperCase(), "plateNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNameLikeInsensitive(String value) {
            addCriterion("upper(driver_name) like", value.toUpperCase(), "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLikeInsensitive(String value) {
            addCriterion("upper(driver_phone) like", value.toUpperCase(), "driverPhone");
            return (Criteria) this;
        }

        public Criteria andTruckLengthLikeInsensitive(String value) {
            addCriterion("upper(truck_length) like", value.toUpperCase(), "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckModelLikeInsensitive(String value) {
            addCriterion("upper(truck_model) like", value.toUpperCase(), "truckModel");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(booker_employee_name) like", value.toUpperCase(), "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeVerifiNameLikeInsensitive(String value) {
            addCriterion("upper(main_line_fee_verifi_name) like", value.toUpperCase(), "mainLineFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeePaymentNameLikeInsensitive(String value) {
            addCriterion("upper(main_line_fee_payment_name) like", value.toUpperCase(), "mainLineFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andMainLineOverUserNameLikeInsensitive(String value) {
            addCriterion("upper(main_line_over_user_name) like", value.toUpperCase(), "mainLineOverUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsUserNameLikeInsensitive(String value) {
            addCriterion("upper(ofgoods_user_name) like", value.toUpperCase(), "ofgoodsUserName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeVerifiNameLikeInsensitive(String value) {
            addCriterion("upper(ofgoods_fee_verifi_name) like", value.toUpperCase(), "ofgoodsFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeePaymentNameLikeInsensitive(String value) {
            addCriterion("upper(ofgoods_fee_payment_name) like", value.toUpperCase(), "ofgoodsFeePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfgoodsFeeOverNameLikeInsensitive(String value) {
            addCriterion("upper(ofgoods_fee_over_name) like", value.toUpperCase(), "ofgoodsFeeOverName");
            return (Criteria) this;
        }

        public Criteria andArriveUserNameLikeInsensitive(String value) {
            addCriterion("upper(arrive_user_name) like", value.toUpperCase(), "arriveUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameLikeInsensitive(String value) {
            addCriterion("upper(depart_user_name) like", value.toUpperCase(), "departUserName");
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