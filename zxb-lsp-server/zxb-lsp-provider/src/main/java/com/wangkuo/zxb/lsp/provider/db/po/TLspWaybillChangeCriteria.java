package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TLspWaybillChangeCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLspWaybillChangeCriteria() {
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

        public Criteria andWaybillIdIsNull() {
            addCriterion("waybill_id is null");
            return (Criteria) this;
        }

        public Criteria andWaybillIdIsNotNull() {
            addCriterion("waybill_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillIdEqualTo(Long value) {
            addCriterion("waybill_id =", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotEqualTo(Long value) {
            addCriterion("waybill_id <>", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdGreaterThan(Long value) {
            addCriterion("waybill_id >", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("waybill_id >=", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLessThan(Long value) {
            addCriterion("waybill_id <", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLessThanOrEqualTo(Long value) {
            addCriterion("waybill_id <=", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdIn(List<Long> values) {
            addCriterion("waybill_id in", values, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotIn(List<Long> values) {
            addCriterion("waybill_id not in", values, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdBetween(Long value1, Long value2) {
            addCriterion("waybill_id between", value1, value2, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotBetween(Long value1, Long value2) {
            addCriterion("waybill_id not between", value1, value2, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillSnIsNull() {
            addCriterion("waybill_sn is null");
            return (Criteria) this;
        }

        public Criteria andWaybillSnIsNotNull() {
            addCriterion("waybill_sn is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillSnEqualTo(String value) {
            addCriterion("waybill_sn =", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnNotEqualTo(String value) {
            addCriterion("waybill_sn <>", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnGreaterThan(String value) {
            addCriterion("waybill_sn >", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_sn >=", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnLessThan(String value) {
            addCriterion("waybill_sn <", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnLessThanOrEqualTo(String value) {
            addCriterion("waybill_sn <=", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnLike(String value) {
            addCriterion("waybill_sn like", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnNotLike(String value) {
            addCriterion("waybill_sn not like", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnIn(List<String> values) {
            addCriterion("waybill_sn in", values, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnNotIn(List<String> values) {
            addCriterion("waybill_sn not in", values, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnBetween(String value1, String value2) {
            addCriterion("waybill_sn between", value1, value2, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnNotBetween(String value1, String value2) {
            addCriterion("waybill_sn not between", value1, value2, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
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

        public Criteria andVerifyIdIsNull() {
            addCriterion("verify_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifyIdIsNotNull() {
            addCriterion("verify_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyIdEqualTo(Long value) {
            addCriterion("verify_id =", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdNotEqualTo(Long value) {
            addCriterion("verify_id <>", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdGreaterThan(Long value) {
            addCriterion("verify_id >", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("verify_id >=", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdLessThan(Long value) {
            addCriterion("verify_id <", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdLessThanOrEqualTo(Long value) {
            addCriterion("verify_id <=", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdIn(List<Long> values) {
            addCriterion("verify_id in", values, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdNotIn(List<Long> values) {
            addCriterion("verify_id not in", values, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdBetween(Long value1, Long value2) {
            addCriterion("verify_id between", value1, value2, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdNotBetween(Long value1, Long value2) {
            addCriterion("verify_id not between", value1, value2, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyNameIsNull() {
            addCriterion("verify_name is null");
            return (Criteria) this;
        }

        public Criteria andVerifyNameIsNotNull() {
            addCriterion("verify_name is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyNameEqualTo(String value) {
            addCriterion("verify_name =", value, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameNotEqualTo(String value) {
            addCriterion("verify_name <>", value, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameGreaterThan(String value) {
            addCriterion("verify_name >", value, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("verify_name >=", value, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameLessThan(String value) {
            addCriterion("verify_name <", value, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameLessThanOrEqualTo(String value) {
            addCriterion("verify_name <=", value, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameLike(String value) {
            addCriterion("verify_name like", value, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameNotLike(String value) {
            addCriterion("verify_name not like", value, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameIn(List<String> values) {
            addCriterion("verify_name in", values, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameNotIn(List<String> values) {
            addCriterion("verify_name not in", values, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameBetween(String value1, String value2) {
            addCriterion("verify_name between", value1, value2, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameNotBetween(String value1, String value2) {
            addCriterion("verify_name not between", value1, value2, "verifyName");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
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

        public Criteria andSumFeeIsNull() {
            addCriterion("sum_fee is null");
            return (Criteria) this;
        }

        public Criteria andSumFeeIsNotNull() {
            addCriterion("sum_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSumFeeEqualTo(BigDecimal value) {
            addCriterion("sum_fee =", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotEqualTo(BigDecimal value) {
            addCriterion("sum_fee <>", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeGreaterThan(BigDecimal value) {
            addCriterion("sum_fee >", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_fee >=", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeLessThan(BigDecimal value) {
            addCriterion("sum_fee <", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_fee <=", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeIn(List<BigDecimal> values) {
            addCriterion("sum_fee in", values, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotIn(List<BigDecimal> values) {
            addCriterion("sum_fee not in", values, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_fee between", value1, value2, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_fee not between", value1, value2, "sumFee");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdIsNull() {
            addCriterion("benchmark_id is null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdIsNotNull() {
            addCriterion("benchmark_id is not null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdEqualTo(Long value) {
            addCriterion("benchmark_id =", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotEqualTo(Long value) {
            addCriterion("benchmark_id <>", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdGreaterThan(Long value) {
            addCriterion("benchmark_id >", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("benchmark_id >=", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdLessThan(Long value) {
            addCriterion("benchmark_id <", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdLessThanOrEqualTo(Long value) {
            addCriterion("benchmark_id <=", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdIn(List<Long> values) {
            addCriterion("benchmark_id in", values, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotIn(List<Long> values) {
            addCriterion("benchmark_id not in", values, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdBetween(Long value1, Long value2) {
            addCriterion("benchmark_id between", value1, value2, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotBetween(Long value1, Long value2) {
            addCriterion("benchmark_id not between", value1, value2, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andWaybillSnLikeInsensitive(String value) {
            addCriterion("upper(waybill_sn) like", value.toUpperCase(), "waybillSn");
            return (Criteria) this;
        }

        public Criteria andCreateNameLikeInsensitive(String value) {
            addCriterion("upper(create_name) like", value.toUpperCase(), "createName");
            return (Criteria) this;
        }

        public Criteria andVerifyNameLikeInsensitive(String value) {
            addCriterion("upper(verify_name) like", value.toUpperCase(), "verifyName");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
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