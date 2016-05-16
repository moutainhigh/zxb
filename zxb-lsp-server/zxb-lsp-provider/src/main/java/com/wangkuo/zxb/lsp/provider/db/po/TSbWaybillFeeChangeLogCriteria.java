package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSbWaybillFeeChangeLogCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillFeeChangeLogCriteria() {
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

        public Criteria andIsChangeAllFreightFeeIsNull() {
            addCriterion("is_change_all_freight_fee is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeIsNotNull() {
            addCriterion("is_change_all_freight_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeEqualTo(Integer value) {
            addCriterion("is_change_all_freight_fee =", value, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeNotEqualTo(Integer value) {
            addCriterion("is_change_all_freight_fee <>", value, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeGreaterThan(Integer value) {
            addCriterion("is_change_all_freight_fee >", value, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_change_all_freight_fee >=", value, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeLessThan(Integer value) {
            addCriterion("is_change_all_freight_fee <", value, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeLessThanOrEqualTo(Integer value) {
            addCriterion("is_change_all_freight_fee <=", value, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeIn(List<Integer> values) {
            addCriterion("is_change_all_freight_fee in", values, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeNotIn(List<Integer> values) {
            addCriterion("is_change_all_freight_fee not in", values, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeBetween(Integer value1, Integer value2) {
            addCriterion("is_change_all_freight_fee between", value1, value2, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeAllFreightFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_change_all_freight_fee not between", value1, value2, "isChangeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeIsNull() {
            addCriterion("before_all_freight_fee is null");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeIsNotNull() {
            addCriterion("before_all_freight_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeEqualTo(BigDecimal value) {
            addCriterion("before_all_freight_fee =", value, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeNotEqualTo(BigDecimal value) {
            addCriterion("before_all_freight_fee <>", value, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeGreaterThan(BigDecimal value) {
            addCriterion("before_all_freight_fee >", value, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_all_freight_fee >=", value, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeLessThan(BigDecimal value) {
            addCriterion("before_all_freight_fee <", value, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_all_freight_fee <=", value, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeIn(List<BigDecimal> values) {
            addCriterion("before_all_freight_fee in", values, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeNotIn(List<BigDecimal> values) {
            addCriterion("before_all_freight_fee not in", values, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_all_freight_fee between", value1, value2, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andBeforeAllFreightFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_all_freight_fee not between", value1, value2, "beforeAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeIsNull() {
            addCriterion("after_all_freight_fee is null");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeIsNotNull() {
            addCriterion("after_all_freight_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeEqualTo(BigDecimal value) {
            addCriterion("after_all_freight_fee =", value, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeNotEqualTo(BigDecimal value) {
            addCriterion("after_all_freight_fee <>", value, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeGreaterThan(BigDecimal value) {
            addCriterion("after_all_freight_fee >", value, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("after_all_freight_fee >=", value, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeLessThan(BigDecimal value) {
            addCriterion("after_all_freight_fee <", value, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("after_all_freight_fee <=", value, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeIn(List<BigDecimal> values) {
            addCriterion("after_all_freight_fee in", values, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeNotIn(List<BigDecimal> values) {
            addCriterion("after_all_freight_fee not in", values, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_all_freight_fee between", value1, value2, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andAfterAllFreightFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_all_freight_fee not between", value1, value2, "afterAllFreightFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeIsNull() {
            addCriterion("is_change_ransit_fee is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeIsNotNull() {
            addCriterion("is_change_ransit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeEqualTo(Integer value) {
            addCriterion("is_change_ransit_fee =", value, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeNotEqualTo(Integer value) {
            addCriterion("is_change_ransit_fee <>", value, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeGreaterThan(Integer value) {
            addCriterion("is_change_ransit_fee >", value, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_change_ransit_fee >=", value, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeLessThan(Integer value) {
            addCriterion("is_change_ransit_fee <", value, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeLessThanOrEqualTo(Integer value) {
            addCriterion("is_change_ransit_fee <=", value, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeIn(List<Integer> values) {
            addCriterion("is_change_ransit_fee in", values, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeNotIn(List<Integer> values) {
            addCriterion("is_change_ransit_fee not in", values, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeBetween(Integer value1, Integer value2) {
            addCriterion("is_change_ransit_fee between", value1, value2, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeRansitFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_change_ransit_fee not between", value1, value2, "isChangeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeIsNull() {
            addCriterion("before_ransit_fee is null");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeIsNotNull() {
            addCriterion("before_ransit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeEqualTo(BigDecimal value) {
            addCriterion("before_ransit_fee =", value, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeNotEqualTo(BigDecimal value) {
            addCriterion("before_ransit_fee <>", value, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeGreaterThan(BigDecimal value) {
            addCriterion("before_ransit_fee >", value, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_ransit_fee >=", value, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeLessThan(BigDecimal value) {
            addCriterion("before_ransit_fee <", value, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_ransit_fee <=", value, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeIn(List<BigDecimal> values) {
            addCriterion("before_ransit_fee in", values, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeNotIn(List<BigDecimal> values) {
            addCriterion("before_ransit_fee not in", values, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_ransit_fee between", value1, value2, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andBeforeRansitFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_ransit_fee not between", value1, value2, "beforeRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeIsNull() {
            addCriterion("after_ransit_fee is null");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeIsNotNull() {
            addCriterion("after_ransit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeEqualTo(BigDecimal value) {
            addCriterion("after_ransit_fee =", value, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeNotEqualTo(BigDecimal value) {
            addCriterion("after_ransit_fee <>", value, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeGreaterThan(BigDecimal value) {
            addCriterion("after_ransit_fee >", value, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("after_ransit_fee >=", value, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeLessThan(BigDecimal value) {
            addCriterion("after_ransit_fee <", value, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("after_ransit_fee <=", value, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeIn(List<BigDecimal> values) {
            addCriterion("after_ransit_fee in", values, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeNotIn(List<BigDecimal> values) {
            addCriterion("after_ransit_fee not in", values, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_ransit_fee between", value1, value2, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andAfterRansitFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_ransit_fee not between", value1, value2, "afterRansitFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeIsNull() {
            addCriterion("is_change_information_fee is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeIsNotNull() {
            addCriterion("is_change_information_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeEqualTo(Integer value) {
            addCriterion("is_change_information_fee =", value, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeNotEqualTo(Integer value) {
            addCriterion("is_change_information_fee <>", value, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeGreaterThan(Integer value) {
            addCriterion("is_change_information_fee >", value, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_change_information_fee >=", value, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeLessThan(Integer value) {
            addCriterion("is_change_information_fee <", value, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeLessThanOrEqualTo(Integer value) {
            addCriterion("is_change_information_fee <=", value, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeIn(List<Integer> values) {
            addCriterion("is_change_information_fee in", values, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeNotIn(List<Integer> values) {
            addCriterion("is_change_information_fee not in", values, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeBetween(Integer value1, Integer value2) {
            addCriterion("is_change_information_fee between", value1, value2, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeInformationFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_change_information_fee not between", value1, value2, "isChangeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeIsNull() {
            addCriterion("before_information_fee is null");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeIsNotNull() {
            addCriterion("before_information_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeEqualTo(BigDecimal value) {
            addCriterion("before_information_fee =", value, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeNotEqualTo(BigDecimal value) {
            addCriterion("before_information_fee <>", value, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeGreaterThan(BigDecimal value) {
            addCriterion("before_information_fee >", value, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_information_fee >=", value, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeLessThan(BigDecimal value) {
            addCriterion("before_information_fee <", value, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_information_fee <=", value, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeIn(List<BigDecimal> values) {
            addCriterion("before_information_fee in", values, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeNotIn(List<BigDecimal> values) {
            addCriterion("before_information_fee not in", values, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_information_fee between", value1, value2, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andBeforeInformationFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_information_fee not between", value1, value2, "beforeInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeIsNull() {
            addCriterion("after_information_fee is null");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeIsNotNull() {
            addCriterion("after_information_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeEqualTo(BigDecimal value) {
            addCriterion("after_information_fee =", value, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeNotEqualTo(BigDecimal value) {
            addCriterion("after_information_fee <>", value, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeGreaterThan(BigDecimal value) {
            addCriterion("after_information_fee >", value, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("after_information_fee >=", value, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeLessThan(BigDecimal value) {
            addCriterion("after_information_fee <", value, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("after_information_fee <=", value, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeIn(List<BigDecimal> values) {
            addCriterion("after_information_fee in", values, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeNotIn(List<BigDecimal> values) {
            addCriterion("after_information_fee not in", values, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_information_fee between", value1, value2, "afterInformationFee");
            return (Criteria) this;
        }

        public Criteria andAfterInformationFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_information_fee not between", value1, value2, "afterInformationFee");
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