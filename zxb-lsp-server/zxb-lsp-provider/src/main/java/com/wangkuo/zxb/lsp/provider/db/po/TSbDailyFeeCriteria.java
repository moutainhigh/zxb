package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbDailyFeeCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbDailyFeeCriteria() {
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

        public Criteria andApplyBodyTypeIsNull() {
            addCriterion("apply_body_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeIsNotNull() {
            addCriterion("apply_body_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeEqualTo(String value) {
            addCriterion("apply_body_type =", value, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeNotEqualTo(String value) {
            addCriterion("apply_body_type <>", value, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeGreaterThan(String value) {
            addCriterion("apply_body_type >", value, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_body_type >=", value, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeLessThan(String value) {
            addCriterion("apply_body_type <", value, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_body_type <=", value, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeLike(String value) {
            addCriterion("apply_body_type like", value, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeNotLike(String value) {
            addCriterion("apply_body_type not like", value, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeIn(List<String> values) {
            addCriterion("apply_body_type in", values, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeNotIn(List<String> values) {
            addCriterion("apply_body_type not in", values, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeBetween(String value1, String value2) {
            addCriterion("apply_body_type between", value1, value2, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeNotBetween(String value1, String value2) {
            addCriterion("apply_body_type not between", value1, value2, "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andTypeContextIsNull() {
            addCriterion("type_context is null");
            return (Criteria) this;
        }

        public Criteria andTypeContextIsNotNull() {
            addCriterion("type_context is not null");
            return (Criteria) this;
        }

        public Criteria andTypeContextEqualTo(String value) {
            addCriterion("type_context =", value, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextNotEqualTo(String value) {
            addCriterion("type_context <>", value, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextGreaterThan(String value) {
            addCriterion("type_context >", value, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextGreaterThanOrEqualTo(String value) {
            addCriterion("type_context >=", value, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextLessThan(String value) {
            addCriterion("type_context <", value, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextLessThanOrEqualTo(String value) {
            addCriterion("type_context <=", value, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextLike(String value) {
            addCriterion("type_context like", value, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextNotLike(String value) {
            addCriterion("type_context not like", value, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextIn(List<String> values) {
            addCriterion("type_context in", values, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextNotIn(List<String> values) {
            addCriterion("type_context not in", values, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextBetween(String value1, String value2) {
            addCriterion("type_context between", value1, value2, "typeContext");
            return (Criteria) this;
        }

        public Criteria andTypeContextNotBetween(String value1, String value2) {
            addCriterion("type_context not between", value1, value2, "typeContext");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
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

        public Criteria andApplyBodyIdIsNull() {
            addCriterion("apply_body_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdIsNotNull() {
            addCriterion("apply_body_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdEqualTo(Long value) {
            addCriterion("apply_body_id =", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdNotEqualTo(Long value) {
            addCriterion("apply_body_id <>", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdGreaterThan(Long value) {
            addCriterion("apply_body_id >", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_body_id >=", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdLessThan(Long value) {
            addCriterion("apply_body_id <", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_body_id <=", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdIn(List<Long> values) {
            addCriterion("apply_body_id in", values, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdNotIn(List<Long> values) {
            addCriterion("apply_body_id not in", values, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdBetween(Long value1, Long value2) {
            addCriterion("apply_body_id between", value1, value2, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_body_id not between", value1, value2, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameIsNull() {
            addCriterion("apply_body_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameIsNotNull() {
            addCriterion("apply_body_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameEqualTo(String value) {
            addCriterion("apply_body_name =", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameNotEqualTo(String value) {
            addCriterion("apply_body_name <>", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameGreaterThan(String value) {
            addCriterion("apply_body_name >", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_body_name >=", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameLessThan(String value) {
            addCriterion("apply_body_name <", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameLessThanOrEqualTo(String value) {
            addCriterion("apply_body_name <=", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameLike(String value) {
            addCriterion("apply_body_name like", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameNotLike(String value) {
            addCriterion("apply_body_name not like", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameIn(List<String> values) {
            addCriterion("apply_body_name in", values, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameNotIn(List<String> values) {
            addCriterion("apply_body_name not in", values, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameBetween(String value1, String value2) {
            addCriterion("apply_body_name between", value1, value2, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameNotBetween(String value1, String value2) {
            addCriterion("apply_body_name not between", value1, value2, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNull() {
            addCriterion("apply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNotNull() {
            addCriterion("apply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdEqualTo(Long value) {
            addCriterion("apply_user_id =", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotEqualTo(Long value) {
            addCriterion("apply_user_id <>", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThan(Long value) {
            addCriterion("apply_user_id >", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_user_id >=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThan(Long value) {
            addCriterion("apply_user_id <", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_user_id <=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIn(List<Long> values) {
            addCriterion("apply_user_id in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotIn(List<Long> values) {
            addCriterion("apply_user_id not in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdBetween(Long value1, Long value2) {
            addCriterion("apply_user_id between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_user_id not between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNull() {
            addCriterion("apply_user_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNotNull() {
            addCriterion("apply_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameEqualTo(String value) {
            addCriterion("apply_user_name =", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotEqualTo(String value) {
            addCriterion("apply_user_name <>", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThan(String value) {
            addCriterion("apply_user_name >", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_name >=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThan(String value) {
            addCriterion("apply_user_name <", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("apply_user_name <=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLike(String value) {
            addCriterion("apply_user_name like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotLike(String value) {
            addCriterion("apply_user_name not like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIn(List<String> values) {
            addCriterion("apply_user_name in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotIn(List<String> values) {
            addCriterion("apply_user_name not in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameBetween(String value1, String value2) {
            addCriterion("apply_user_name between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotBetween(String value1, String value2) {
            addCriterion("apply_user_name not between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusIsNull() {
            addCriterion("verifi_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusIsNotNull() {
            addCriterion("verifi_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusEqualTo(Integer value) {
            addCriterion("verifi_status =", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusNotEqualTo(Integer value) {
            addCriterion("verifi_status <>", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusGreaterThan(Integer value) {
            addCriterion("verifi_status >", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verifi_status >=", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusLessThan(Integer value) {
            addCriterion("verifi_status <", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("verifi_status <=", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusIn(List<Integer> values) {
            addCriterion("verifi_status in", values, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusNotIn(List<Integer> values) {
            addCriterion("verifi_status not in", values, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusBetween(Integer value1, Integer value2) {
            addCriterion("verifi_status between", value1, value2, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("verifi_status not between", value1, value2, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdIsNull() {
            addCriterion("verifi_user_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdIsNotNull() {
            addCriterion("verifi_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdEqualTo(Long value) {
            addCriterion("verifi_user_id =", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdNotEqualTo(Long value) {
            addCriterion("verifi_user_id <>", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdGreaterThan(Long value) {
            addCriterion("verifi_user_id >", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("verifi_user_id >=", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdLessThan(Long value) {
            addCriterion("verifi_user_id <", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdLessThanOrEqualTo(Long value) {
            addCriterion("verifi_user_id <=", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdIn(List<Long> values) {
            addCriterion("verifi_user_id in", values, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdNotIn(List<Long> values) {
            addCriterion("verifi_user_id not in", values, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdBetween(Long value1, Long value2) {
            addCriterion("verifi_user_id between", value1, value2, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdNotBetween(Long value1, Long value2) {
            addCriterion("verifi_user_id not between", value1, value2, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameIsNull() {
            addCriterion("verifi_user_name is null");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameIsNotNull() {
            addCriterion("verifi_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameEqualTo(String value) {
            addCriterion("verifi_user_name =", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameNotEqualTo(String value) {
            addCriterion("verifi_user_name <>", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameGreaterThan(String value) {
            addCriterion("verifi_user_name >", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("verifi_user_name >=", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameLessThan(String value) {
            addCriterion("verifi_user_name <", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameLessThanOrEqualTo(String value) {
            addCriterion("verifi_user_name <=", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameLike(String value) {
            addCriterion("verifi_user_name like", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameNotLike(String value) {
            addCriterion("verifi_user_name not like", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameIn(List<String> values) {
            addCriterion("verifi_user_name in", values, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameNotIn(List<String> values) {
            addCriterion("verifi_user_name not in", values, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameBetween(String value1, String value2) {
            addCriterion("verifi_user_name between", value1, value2, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameNotBetween(String value1, String value2) {
            addCriterion("verifi_user_name not between", value1, value2, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeIsNull() {
            addCriterion("verifi_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeIsNotNull() {
            addCriterion("verifi_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeEqualTo(Date value) {
            addCriterion("verifi_time =", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeNotEqualTo(Date value) {
            addCriterion("verifi_time <>", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeGreaterThan(Date value) {
            addCriterion("verifi_time >", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verifi_time >=", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeLessThan(Date value) {
            addCriterion("verifi_time <", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeLessThanOrEqualTo(Date value) {
            addCriterion("verifi_time <=", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeIn(List<Date> values) {
            addCriterion("verifi_time in", values, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeNotIn(List<Date> values) {
            addCriterion("verifi_time not in", values, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeBetween(Date value1, Date value2) {
            addCriterion("verifi_time between", value1, value2, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeNotBetween(Date value1, Date value2) {
            addCriterion("verifi_time not between", value1, value2, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoIsNull() {
            addCriterion("verifi_memo is null");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoIsNotNull() {
            addCriterion("verifi_memo is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoEqualTo(String value) {
            addCriterion("verifi_memo =", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoNotEqualTo(String value) {
            addCriterion("verifi_memo <>", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoGreaterThan(String value) {
            addCriterion("verifi_memo >", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoGreaterThanOrEqualTo(String value) {
            addCriterion("verifi_memo >=", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoLessThan(String value) {
            addCriterion("verifi_memo <", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoLessThanOrEqualTo(String value) {
            addCriterion("verifi_memo <=", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoLike(String value) {
            addCriterion("verifi_memo like", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoNotLike(String value) {
            addCriterion("verifi_memo not like", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoIn(List<String> values) {
            addCriterion("verifi_memo in", values, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoNotIn(List<String> values) {
            addCriterion("verifi_memo not in", values, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoBetween(String value1, String value2) {
            addCriterion("verifi_memo between", value1, value2, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoNotBetween(String value1, String value2) {
            addCriterion("verifi_memo not between", value1, value2, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdIsNull() {
            addCriterion("payment_uesr_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdIsNotNull() {
            addCriterion("payment_uesr_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdEqualTo(Long value) {
            addCriterion("payment_uesr_id =", value, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdNotEqualTo(Long value) {
            addCriterion("payment_uesr_id <>", value, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdGreaterThan(Long value) {
            addCriterion("payment_uesr_id >", value, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_uesr_id >=", value, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdLessThan(Long value) {
            addCriterion("payment_uesr_id <", value, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdLessThanOrEqualTo(Long value) {
            addCriterion("payment_uesr_id <=", value, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdIn(List<Long> values) {
            addCriterion("payment_uesr_id in", values, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdNotIn(List<Long> values) {
            addCriterion("payment_uesr_id not in", values, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdBetween(Long value1, Long value2) {
            addCriterion("payment_uesr_id between", value1, value2, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrIdNotBetween(Long value1, Long value2) {
            addCriterion("payment_uesr_id not between", value1, value2, "paymentUesrId");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameIsNull() {
            addCriterion("payment_uesr_name is null");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameIsNotNull() {
            addCriterion("payment_uesr_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameEqualTo(String value) {
            addCriterion("payment_uesr_name =", value, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameNotEqualTo(String value) {
            addCriterion("payment_uesr_name <>", value, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameGreaterThan(String value) {
            addCriterion("payment_uesr_name >", value, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameGreaterThanOrEqualTo(String value) {
            addCriterion("payment_uesr_name >=", value, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameLessThan(String value) {
            addCriterion("payment_uesr_name <", value, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameLessThanOrEqualTo(String value) {
            addCriterion("payment_uesr_name <=", value, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameLike(String value) {
            addCriterion("payment_uesr_name like", value, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameNotLike(String value) {
            addCriterion("payment_uesr_name not like", value, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameIn(List<String> values) {
            addCriterion("payment_uesr_name in", values, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameNotIn(List<String> values) {
            addCriterion("payment_uesr_name not in", values, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameBetween(String value1, String value2) {
            addCriterion("payment_uesr_name between", value1, value2, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameNotBetween(String value1, String value2) {
            addCriterion("payment_uesr_name not between", value1, value2, "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeIsNull() {
            addCriterion("payment_uesr_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeIsNotNull() {
            addCriterion("payment_uesr_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeEqualTo(Date value) {
            addCriterion("payment_uesr_time =", value, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeNotEqualTo(Date value) {
            addCriterion("payment_uesr_time <>", value, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeGreaterThan(Date value) {
            addCriterion("payment_uesr_time >", value, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_uesr_time >=", value, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeLessThan(Date value) {
            addCriterion("payment_uesr_time <", value, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_uesr_time <=", value, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeIn(List<Date> values) {
            addCriterion("payment_uesr_time in", values, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeNotIn(List<Date> values) {
            addCriterion("payment_uesr_time not in", values, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeBetween(Date value1, Date value2) {
            addCriterion("payment_uesr_time between", value1, value2, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_uesr_time not between", value1, value2, "paymentUesrTime");
            return (Criteria) this;
        }

        public Criteria andOverStatusIsNull() {
            addCriterion("over_status is null");
            return (Criteria) this;
        }

        public Criteria andOverStatusIsNotNull() {
            addCriterion("over_status is not null");
            return (Criteria) this;
        }

        public Criteria andOverStatusEqualTo(Integer value) {
            addCriterion("over_status =", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotEqualTo(Integer value) {
            addCriterion("over_status <>", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusGreaterThan(Integer value) {
            addCriterion("over_status >", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("over_status >=", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusLessThan(Integer value) {
            addCriterion("over_status <", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusLessThanOrEqualTo(Integer value) {
            addCriterion("over_status <=", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusIn(List<Integer> values) {
            addCriterion("over_status in", values, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotIn(List<Integer> values) {
            addCriterion("over_status not in", values, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusBetween(Integer value1, Integer value2) {
            addCriterion("over_status between", value1, value2, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("over_status not between", value1, value2, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNull() {
            addCriterion("over_time is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNotNull() {
            addCriterion("over_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEqualTo(Date value) {
            addCriterion("over_time =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(Date value) {
            addCriterion("over_time <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(Date value) {
            addCriterion("over_time >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("over_time >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(Date value) {
            addCriterion("over_time <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("over_time <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<Date> values) {
            addCriterion("over_time in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<Date> values) {
            addCriterion("over_time not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(Date value1, Date value2) {
            addCriterion("over_time between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("over_time not between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverUserIdIsNull() {
            addCriterion("over_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOverUserIdIsNotNull() {
            addCriterion("over_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverUserIdEqualTo(Long value) {
            addCriterion("over_user_id =", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdNotEqualTo(Long value) {
            addCriterion("over_user_id <>", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdGreaterThan(Long value) {
            addCriterion("over_user_id >", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("over_user_id >=", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdLessThan(Long value) {
            addCriterion("over_user_id <", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdLessThanOrEqualTo(Long value) {
            addCriterion("over_user_id <=", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdIn(List<Long> values) {
            addCriterion("over_user_id in", values, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdNotIn(List<Long> values) {
            addCriterion("over_user_id not in", values, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdBetween(Long value1, Long value2) {
            addCriterion("over_user_id between", value1, value2, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdNotBetween(Long value1, Long value2) {
            addCriterion("over_user_id not between", value1, value2, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserNameIsNull() {
            addCriterion("over_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOverUserNameIsNotNull() {
            addCriterion("over_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOverUserNameEqualTo(String value) {
            addCriterion("over_user_name =", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameNotEqualTo(String value) {
            addCriterion("over_user_name <>", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameGreaterThan(String value) {
            addCriterion("over_user_name >", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("over_user_name >=", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameLessThan(String value) {
            addCriterion("over_user_name <", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameLessThanOrEqualTo(String value) {
            addCriterion("over_user_name <=", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameLike(String value) {
            addCriterion("over_user_name like", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameNotLike(String value) {
            addCriterion("over_user_name not like", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameIn(List<String> values) {
            addCriterion("over_user_name in", values, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameNotIn(List<String> values) {
            addCriterion("over_user_name not in", values, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameBetween(String value1, String value2) {
            addCriterion("over_user_name between", value1, value2, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameNotBetween(String value1, String value2) {
            addCriterion("over_user_name not between", value1, value2, "overUserName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyTypeLikeInsensitive(String value) {
            addCriterion("upper(apply_body_type) like", value.toUpperCase(), "applyBodyType");
            return (Criteria) this;
        }

        public Criteria andTypeContextLikeInsensitive(String value) {
            addCriterion("upper(type_context) like", value.toUpperCase(), "typeContext");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameLikeInsensitive(String value) {
            addCriterion("upper(apply_body_name) like", value.toUpperCase(), "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLikeInsensitive(String value) {
            addCriterion("upper(apply_user_name) like", value.toUpperCase(), "applyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameLikeInsensitive(String value) {
            addCriterion("upper(verifi_user_name) like", value.toUpperCase(), "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoLikeInsensitive(String value) {
            addCriterion("upper(verifi_memo) like", value.toUpperCase(), "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentUesrNameLikeInsensitive(String value) {
            addCriterion("upper(payment_uesr_name) like", value.toUpperCase(), "paymentUesrName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameLikeInsensitive(String value) {
            addCriterion("upper(over_user_name) like", value.toUpperCase(), "overUserName");
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