package com.wangkuo.zxb.mms.server.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCustomerChainStatisticExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerChainStatisticExample() {
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

        public Criteria andMmsCustomerIdIsNull() {
            addCriterion("mms_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdIsNotNull() {
            addCriterion("mms_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdEqualTo(Long value) {
            addCriterion("mms_customer_id =", value, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdNotEqualTo(Long value) {
            addCriterion("mms_customer_id <>", value, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdGreaterThan(Long value) {
            addCriterion("mms_customer_id >", value, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mms_customer_id >=", value, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdLessThan(Long value) {
            addCriterion("mms_customer_id <", value, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("mms_customer_id <=", value, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdIn(List<Long> values) {
            addCriterion("mms_customer_id in", values, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdNotIn(List<Long> values) {
            addCriterion("mms_customer_id not in", values, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdBetween(Long value1, Long value2) {
            addCriterion("mms_customer_id between", value1, value2, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andMmsCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("mms_customer_id not between", value1, value2, "mmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andTYearIsNull() {
            addCriterion("t_year is null");
            return (Criteria) this;
        }

        public Criteria andTYearIsNotNull() {
            addCriterion("t_year is not null");
            return (Criteria) this;
        }

        public Criteria andTYearEqualTo(Integer value) {
            addCriterion("t_year =", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotEqualTo(Integer value) {
            addCriterion("t_year <>", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThan(Integer value) {
            addCriterion("t_year >", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_year >=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThan(Integer value) {
            addCriterion("t_year <", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThanOrEqualTo(Integer value) {
            addCriterion("t_year <=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearIn(List<Integer> values) {
            addCriterion("t_year in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotIn(List<Integer> values) {
            addCriterion("t_year not in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearBetween(Integer value1, Integer value2) {
            addCriterion("t_year between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotBetween(Integer value1, Integer value2) {
            addCriterion("t_year not between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTMonthIsNull() {
            addCriterion("t_month is null");
            return (Criteria) this;
        }

        public Criteria andTMonthIsNotNull() {
            addCriterion("t_month is not null");
            return (Criteria) this;
        }

        public Criteria andTMonthEqualTo(Integer value) {
            addCriterion("t_month =", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthNotEqualTo(Integer value) {
            addCriterion("t_month <>", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthGreaterThan(Integer value) {
            addCriterion("t_month >", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_month >=", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthLessThan(Integer value) {
            addCriterion("t_month <", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthLessThanOrEqualTo(Integer value) {
            addCriterion("t_month <=", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthIn(List<Integer> values) {
            addCriterion("t_month in", values, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthNotIn(List<Integer> values) {
            addCriterion("t_month not in", values, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthBetween(Integer value1, Integer value2) {
            addCriterion("t_month between", value1, value2, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("t_month not between", value1, value2, "tMonth");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumIsNull() {
            addCriterion("cur_send_good_total_num is null");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumIsNotNull() {
            addCriterion("cur_send_good_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumEqualTo(Integer value) {
            addCriterion("cur_send_good_total_num =", value, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumNotEqualTo(Integer value) {
            addCriterion("cur_send_good_total_num <>", value, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumGreaterThan(Integer value) {
            addCriterion("cur_send_good_total_num >", value, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_send_good_total_num >=", value, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumLessThan(Integer value) {
            addCriterion("cur_send_good_total_num <", value, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("cur_send_good_total_num <=", value, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumIn(List<Integer> values) {
            addCriterion("cur_send_good_total_num in", values, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumNotIn(List<Integer> values) {
            addCriterion("cur_send_good_total_num not in", values, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("cur_send_good_total_num between", value1, value2, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_send_good_total_num not between", value1, value2, "curSendGoodTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateIsNull() {
            addCriterion("cur_send_good_total_num_chain_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateIsNotNull() {
            addCriterion("cur_send_good_total_num_chain_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateEqualTo(Float value) {
            addCriterion("cur_send_good_total_num_chain_rate =", value, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateNotEqualTo(Float value) {
            addCriterion("cur_send_good_total_num_chain_rate <>", value, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateGreaterThan(Float value) {
            addCriterion("cur_send_good_total_num_chain_rate >", value, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateGreaterThanOrEqualTo(Float value) {
            addCriterion("cur_send_good_total_num_chain_rate >=", value, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateLessThan(Float value) {
            addCriterion("cur_send_good_total_num_chain_rate <", value, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateLessThanOrEqualTo(Float value) {
            addCriterion("cur_send_good_total_num_chain_rate <=", value, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateIn(List<Float> values) {
            addCriterion("cur_send_good_total_num_chain_rate in", values, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateNotIn(List<Float> values) {
            addCriterion("cur_send_good_total_num_chain_rate not in", values, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateBetween(Float value1, Float value2) {
            addCriterion("cur_send_good_total_num_chain_rate between", value1, value2, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodTotalNumChainRateNotBetween(Float value1, Float value2) {
            addCriterion("cur_send_good_total_num_chain_rate not between", value1, value2, "curSendGoodTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeIsNull() {
            addCriterion("cur_send_good_fee is null");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeIsNotNull() {
            addCriterion("cur_send_good_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeEqualTo(BigDecimal value) {
            addCriterion("cur_send_good_fee =", value, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeNotEqualTo(BigDecimal value) {
            addCriterion("cur_send_good_fee <>", value, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeGreaterThan(BigDecimal value) {
            addCriterion("cur_send_good_fee >", value, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_send_good_fee >=", value, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeLessThan(BigDecimal value) {
            addCriterion("cur_send_good_fee <", value, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_send_good_fee <=", value, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeIn(List<BigDecimal> values) {
            addCriterion("cur_send_good_fee in", values, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeNotIn(List<BigDecimal> values) {
            addCriterion("cur_send_good_fee not in", values, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_send_good_fee between", value1, value2, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_send_good_fee not between", value1, value2, "curSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateIsNull() {
            addCriterion("cur_send_good_fee_chain_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateIsNotNull() {
            addCriterion("cur_send_good_fee_chain_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateEqualTo(Float value) {
            addCriterion("cur_send_good_fee_chain_rate =", value, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateNotEqualTo(Float value) {
            addCriterion("cur_send_good_fee_chain_rate <>", value, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateGreaterThan(Float value) {
            addCriterion("cur_send_good_fee_chain_rate >", value, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateGreaterThanOrEqualTo(Float value) {
            addCriterion("cur_send_good_fee_chain_rate >=", value, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateLessThan(Float value) {
            addCriterion("cur_send_good_fee_chain_rate <", value, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateLessThanOrEqualTo(Float value) {
            addCriterion("cur_send_good_fee_chain_rate <=", value, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateIn(List<Float> values) {
            addCriterion("cur_send_good_fee_chain_rate in", values, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateNotIn(List<Float> values) {
            addCriterion("cur_send_good_fee_chain_rate not in", values, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateBetween(Float value1, Float value2) {
            addCriterion("cur_send_good_fee_chain_rate between", value1, value2, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurSendGoodFeeChainRateNotBetween(Float value1, Float value2) {
            addCriterion("cur_send_good_fee_chain_rate not between", value1, value2, "curSendGoodFeeChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumIsNull() {
            addCriterion("cur_carrier_total_num is null");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumIsNotNull() {
            addCriterion("cur_carrier_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumEqualTo(Integer value) {
            addCriterion("cur_carrier_total_num =", value, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumNotEqualTo(Integer value) {
            addCriterion("cur_carrier_total_num <>", value, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumGreaterThan(Integer value) {
            addCriterion("cur_carrier_total_num >", value, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_carrier_total_num >=", value, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumLessThan(Integer value) {
            addCriterion("cur_carrier_total_num <", value, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("cur_carrier_total_num <=", value, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumIn(List<Integer> values) {
            addCriterion("cur_carrier_total_num in", values, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumNotIn(List<Integer> values) {
            addCriterion("cur_carrier_total_num not in", values, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("cur_carrier_total_num between", value1, value2, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_carrier_total_num not between", value1, value2, "curCarrierTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateIsNull() {
            addCriterion("cur_carrier_total_num_chain_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateIsNotNull() {
            addCriterion("cur_carrier_total_num_chain_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateEqualTo(Float value) {
            addCriterion("cur_carrier_total_num_chain_rate =", value, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateNotEqualTo(Float value) {
            addCriterion("cur_carrier_total_num_chain_rate <>", value, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateGreaterThan(Float value) {
            addCriterion("cur_carrier_total_num_chain_rate >", value, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateGreaterThanOrEqualTo(Float value) {
            addCriterion("cur_carrier_total_num_chain_rate >=", value, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateLessThan(Float value) {
            addCriterion("cur_carrier_total_num_chain_rate <", value, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateLessThanOrEqualTo(Float value) {
            addCriterion("cur_carrier_total_num_chain_rate <=", value, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateIn(List<Float> values) {
            addCriterion("cur_carrier_total_num_chain_rate in", values, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateNotIn(List<Float> values) {
            addCriterion("cur_carrier_total_num_chain_rate not in", values, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateBetween(Float value1, Float value2) {
            addCriterion("cur_carrier_total_num_chain_rate between", value1, value2, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurCarrierTotalNumChainRateNotBetween(Float value1, Float value2) {
            addCriterion("cur_carrier_total_num_chain_rate not between", value1, value2, "curCarrierTotalNumChainRate");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumIsNull() {
            addCriterion("cur_stowage_total_num is null");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumIsNotNull() {
            addCriterion("cur_stowage_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumEqualTo(Integer value) {
            addCriterion("cur_stowage_total_num =", value, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumNotEqualTo(Integer value) {
            addCriterion("cur_stowage_total_num <>", value, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumGreaterThan(Integer value) {
            addCriterion("cur_stowage_total_num >", value, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_stowage_total_num >=", value, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumLessThan(Integer value) {
            addCriterion("cur_stowage_total_num <", value, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("cur_stowage_total_num <=", value, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumIn(List<Integer> values) {
            addCriterion("cur_stowage_total_num in", values, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumNotIn(List<Integer> values) {
            addCriterion("cur_stowage_total_num not in", values, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("cur_stowage_total_num between", value1, value2, "curStowageTotalNum");
            return (Criteria) this;
        }

        public Criteria andCurStowageTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_stowage_total_num not between", value1, value2, "curStowageTotalNum");
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