package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbGoodCategoryCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbGoodCategoryCriteria() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andRateHeavyIsNull() {
            addCriterion("rate_heavy is null");
            return (Criteria) this;
        }

        public Criteria andRateHeavyIsNotNull() {
            addCriterion("rate_heavy is not null");
            return (Criteria) this;
        }

        public Criteria andRateHeavyEqualTo(Float value) {
            addCriterion("rate_heavy =", value, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyNotEqualTo(Float value) {
            addCriterion("rate_heavy <>", value, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyGreaterThan(Float value) {
            addCriterion("rate_heavy >", value, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyGreaterThanOrEqualTo(Float value) {
            addCriterion("rate_heavy >=", value, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyLessThan(Float value) {
            addCriterion("rate_heavy <", value, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyLessThanOrEqualTo(Float value) {
            addCriterion("rate_heavy <=", value, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyIn(List<Float> values) {
            addCriterion("rate_heavy in", values, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyNotIn(List<Float> values) {
            addCriterion("rate_heavy not in", values, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyBetween(Float value1, Float value2) {
            addCriterion("rate_heavy between", value1, value2, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateHeavyNotBetween(Float value1, Float value2) {
            addCriterion("rate_heavy not between", value1, value2, "rateHeavy");
            return (Criteria) this;
        }

        public Criteria andRateLightIsNull() {
            addCriterion("rate_light is null");
            return (Criteria) this;
        }

        public Criteria andRateLightIsNotNull() {
            addCriterion("rate_light is not null");
            return (Criteria) this;
        }

        public Criteria andRateLightEqualTo(Float value) {
            addCriterion("rate_light =", value, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightNotEqualTo(Float value) {
            addCriterion("rate_light <>", value, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightGreaterThan(Float value) {
            addCriterion("rate_light >", value, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightGreaterThanOrEqualTo(Float value) {
            addCriterion("rate_light >=", value, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightLessThan(Float value) {
            addCriterion("rate_light <", value, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightLessThanOrEqualTo(Float value) {
            addCriterion("rate_light <=", value, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightIn(List<Float> values) {
            addCriterion("rate_light in", values, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightNotIn(List<Float> values) {
            addCriterion("rate_light not in", values, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightBetween(Float value1, Float value2) {
            addCriterion("rate_light between", value1, value2, "rateLight");
            return (Criteria) this;
        }

        public Criteria andRateLightNotBetween(Float value1, Float value2) {
            addCriterion("rate_light not between", value1, value2, "rateLight");
            return (Criteria) this;
        }

        public Criteria andPackIsNull() {
            addCriterion("pack is null");
            return (Criteria) this;
        }

        public Criteria andPackIsNotNull() {
            addCriterion("pack is not null");
            return (Criteria) this;
        }

        public Criteria andPackEqualTo(String value) {
            addCriterion("pack =", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotEqualTo(String value) {
            addCriterion("pack <>", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThan(String value) {
            addCriterion("pack >", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThanOrEqualTo(String value) {
            addCriterion("pack >=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThan(String value) {
            addCriterion("pack <", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThanOrEqualTo(String value) {
            addCriterion("pack <=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLike(String value) {
            addCriterion("pack like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotLike(String value) {
            addCriterion("pack not like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackIn(List<String> values) {
            addCriterion("pack in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotIn(List<String> values) {
            addCriterion("pack not in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackBetween(String value1, String value2) {
            addCriterion("pack between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotBetween(String value1, String value2) {
            addCriterion("pack not between", value1, value2, "pack");
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

        public Criteria andGoodTypeIsNull() {
            addCriterion("good_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNotNull() {
            addCriterion("good_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeEqualTo(Integer value) {
            addCriterion("good_type =", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotEqualTo(Integer value) {
            addCriterion("good_type <>", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThan(Integer value) {
            addCriterion("good_type >", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_type >=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThan(Integer value) {
            addCriterion("good_type <", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThanOrEqualTo(Integer value) {
            addCriterion("good_type <=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIn(List<Integer> values) {
            addCriterion("good_type in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotIn(List<Integer> values) {
            addCriterion("good_type not in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeBetween(Integer value1, Integer value2) {
            addCriterion("good_type between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("good_type not between", value1, value2, "goodType");
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

        public Criteria andBookEmployeeIdIsNull() {
            addCriterion("book_employee_id is null");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdIsNotNull() {
            addCriterion("book_employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdEqualTo(Long value) {
            addCriterion("book_employee_id =", value, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdNotEqualTo(Long value) {
            addCriterion("book_employee_id <>", value, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdGreaterThan(Long value) {
            addCriterion("book_employee_id >", value, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("book_employee_id >=", value, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdLessThan(Long value) {
            addCriterion("book_employee_id <", value, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("book_employee_id <=", value, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdIn(List<Long> values) {
            addCriterion("book_employee_id in", values, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdNotIn(List<Long> values) {
            addCriterion("book_employee_id not in", values, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("book_employee_id between", value1, value2, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("book_employee_id not between", value1, value2, "bookEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameIsNull() {
            addCriterion("book_employee_name is null");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameIsNotNull() {
            addCriterion("book_employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameEqualTo(String value) {
            addCriterion("book_employee_name =", value, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameNotEqualTo(String value) {
            addCriterion("book_employee_name <>", value, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameGreaterThan(String value) {
            addCriterion("book_employee_name >", value, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_employee_name >=", value, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameLessThan(String value) {
            addCriterion("book_employee_name <", value, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("book_employee_name <=", value, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameLike(String value) {
            addCriterion("book_employee_name like", value, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameNotLike(String value) {
            addCriterion("book_employee_name not like", value, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameIn(List<String> values) {
            addCriterion("book_employee_name in", values, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameNotIn(List<String> values) {
            addCriterion("book_employee_name not in", values, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameBetween(String value1, String value2) {
            addCriterion("book_employee_name between", value1, value2, "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBookEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("book_employee_name not between", value1, value2, "bookEmployeeName");
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

        public Criteria andChargeTypeIsNull() {
            addCriterion("charge_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(Integer value) {
            addCriterion("charge_type =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(Integer value) {
            addCriterion("charge_type <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(Integer value) {
            addCriterion("charge_type >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_type >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(Integer value) {
            addCriterion("charge_type <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("charge_type <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<Integer> values) {
            addCriterion("charge_type in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<Integer> values) {
            addCriterion("charge_type not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(Integer value1, Integer value2) {
            addCriterion("charge_type between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_type not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andLspUserIdIsNull() {
            addCriterion("lsp_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLspUserIdIsNotNull() {
            addCriterion("lsp_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLspUserIdEqualTo(Long value) {
            addCriterion("lsp_user_id =", value, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdNotEqualTo(Long value) {
            addCriterion("lsp_user_id <>", value, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdGreaterThan(Long value) {
            addCriterion("lsp_user_id >", value, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lsp_user_id >=", value, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdLessThan(Long value) {
            addCriterion("lsp_user_id <", value, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdLessThanOrEqualTo(Long value) {
            addCriterion("lsp_user_id <=", value, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdIn(List<Long> values) {
            addCriterion("lsp_user_id in", values, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdNotIn(List<Long> values) {
            addCriterion("lsp_user_id not in", values, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdBetween(Long value1, Long value2) {
            addCriterion("lsp_user_id between", value1, value2, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserIdNotBetween(Long value1, Long value2) {
            addCriterion("lsp_user_id not between", value1, value2, "lspUserId");
            return (Criteria) this;
        }

        public Criteria andLspUserNameIsNull() {
            addCriterion("lsp_user_name is null");
            return (Criteria) this;
        }

        public Criteria andLspUserNameIsNotNull() {
            addCriterion("lsp_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andLspUserNameEqualTo(String value) {
            addCriterion("lsp_user_name =", value, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameNotEqualTo(String value) {
            addCriterion("lsp_user_name <>", value, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameGreaterThan(String value) {
            addCriterion("lsp_user_name >", value, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("lsp_user_name >=", value, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameLessThan(String value) {
            addCriterion("lsp_user_name <", value, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameLessThanOrEqualTo(String value) {
            addCriterion("lsp_user_name <=", value, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameLike(String value) {
            addCriterion("lsp_user_name like", value, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameNotLike(String value) {
            addCriterion("lsp_user_name not like", value, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameIn(List<String> values) {
            addCriterion("lsp_user_name in", values, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameNotIn(List<String> values) {
            addCriterion("lsp_user_name not in", values, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameBetween(String value1, String value2) {
            addCriterion("lsp_user_name between", value1, value2, "lspUserName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameNotBetween(String value1, String value2) {
            addCriterion("lsp_user_name not between", value1, value2, "lspUserName");
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

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andSiteNameLikeInsensitive(String value) {
            addCriterion("upper(site_name) like", value.toUpperCase(), "siteName");
            return (Criteria) this;
        }

        public Criteria andPackLikeInsensitive(String value) {
            addCriterion("upper(pack) like", value.toUpperCase(), "pack");
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

        public Criteria andBookEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(book_employee_name) like", value.toUpperCase(), "bookEmployeeName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameLikeInsensitive(String value) {
            addCriterion("upper(lsp_user_name) like", value.toUpperCase(), "lspUserName");
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