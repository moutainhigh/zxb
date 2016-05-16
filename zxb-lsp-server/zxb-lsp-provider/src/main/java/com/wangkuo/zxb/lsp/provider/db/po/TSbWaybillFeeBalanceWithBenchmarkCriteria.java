package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbWaybillFeeBalanceWithBenchmarkCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillFeeBalanceWithBenchmarkCriteria() {
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

        public Criteria andZbReceiveAllFeeIsNull() {
            addCriterion("zb_receive_all_fee is null");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeIsNotNull() {
            addCriterion("zb_receive_all_fee is not null");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeEqualTo(BigDecimal value) {
            addCriterion("zb_receive_all_fee =", value, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeNotEqualTo(BigDecimal value) {
            addCriterion("zb_receive_all_fee <>", value, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeGreaterThan(BigDecimal value) {
            addCriterion("zb_receive_all_fee >", value, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_receive_all_fee >=", value, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeLessThan(BigDecimal value) {
            addCriterion("zb_receive_all_fee <", value, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_receive_all_fee <=", value, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeIn(List<BigDecimal> values) {
            addCriterion("zb_receive_all_fee in", values, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeNotIn(List<BigDecimal> values) {
            addCriterion("zb_receive_all_fee not in", values, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_receive_all_fee between", value1, value2, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveAllFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_receive_all_fee not between", value1, value2, "zbReceiveAllFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeIsNull() {
            addCriterion("zb_receive_benchmark_fee is null");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeIsNotNull() {
            addCriterion("zb_receive_benchmark_fee is not null");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeEqualTo(BigDecimal value) {
            addCriterion("zb_receive_benchmark_fee =", value, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeNotEqualTo(BigDecimal value) {
            addCriterion("zb_receive_benchmark_fee <>", value, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeGreaterThan(BigDecimal value) {
            addCriterion("zb_receive_benchmark_fee >", value, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_receive_benchmark_fee >=", value, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeLessThan(BigDecimal value) {
            addCriterion("zb_receive_benchmark_fee <", value, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_receive_benchmark_fee <=", value, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeIn(List<BigDecimal> values) {
            addCriterion("zb_receive_benchmark_fee in", values, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeNotIn(List<BigDecimal> values) {
            addCriterion("zb_receive_benchmark_fee not in", values, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_receive_benchmark_fee between", value1, value2, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveBenchmarkFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_receive_benchmark_fee not between", value1, value2, "zbReceiveBenchmarkFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeIsNull() {
            addCriterion("zb_receive_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeIsNotNull() {
            addCriterion("zb_receive_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeEqualTo(BigDecimal value) {
            addCriterion("zb_receive_service_fee =", value, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("zb_receive_service_fee <>", value, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("zb_receive_service_fee >", value, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_receive_service_fee >=", value, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeLessThan(BigDecimal value) {
            addCriterion("zb_receive_service_fee <", value, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_receive_service_fee <=", value, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeIn(List<BigDecimal> values) {
            addCriterion("zb_receive_service_fee in", values, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("zb_receive_service_fee not in", values, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_receive_service_fee between", value1, value2, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiveServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_receive_service_fee not between", value1, value2, "zbReceiveServiceFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeIsNull() {
            addCriterion("premium_fee is null");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeIsNotNull() {
            addCriterion("premium_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeEqualTo(BigDecimal value) {
            addCriterion("premium_fee =", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeNotEqualTo(BigDecimal value) {
            addCriterion("premium_fee <>", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeGreaterThan(BigDecimal value) {
            addCriterion("premium_fee >", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premium_fee >=", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeLessThan(BigDecimal value) {
            addCriterion("premium_fee <", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premium_fee <=", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeIn(List<BigDecimal> values) {
            addCriterion("premium_fee in", values, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeNotIn(List<BigDecimal> values) {
            addCriterion("premium_fee not in", values, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premium_fee between", value1, value2, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premium_fee not between", value1, value2, "premiumFee");
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

        public Criteria andFreeSingleIdIsNull() {
            addCriterion("free_single_id is null");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdIsNotNull() {
            addCriterion("free_single_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdEqualTo(Long value) {
            addCriterion("free_single_id =", value, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdNotEqualTo(Long value) {
            addCriterion("free_single_id <>", value, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdGreaterThan(Long value) {
            addCriterion("free_single_id >", value, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("free_single_id >=", value, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdLessThan(Long value) {
            addCriterion("free_single_id <", value, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdLessThanOrEqualTo(Long value) {
            addCriterion("free_single_id <=", value, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdIn(List<Long> values) {
            addCriterion("free_single_id in", values, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdNotIn(List<Long> values) {
            addCriterion("free_single_id not in", values, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdBetween(Long value1, Long value2) {
            addCriterion("free_single_id between", value1, value2, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleIdNotBetween(Long value1, Long value2) {
            addCriterion("free_single_id not between", value1, value2, "freeSingleId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameIsNull() {
            addCriterion("free_single_name is null");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameIsNotNull() {
            addCriterion("free_single_name is not null");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameEqualTo(String value) {
            addCriterion("free_single_name =", value, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameNotEqualTo(String value) {
            addCriterion("free_single_name <>", value, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameGreaterThan(String value) {
            addCriterion("free_single_name >", value, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameGreaterThanOrEqualTo(String value) {
            addCriterion("free_single_name >=", value, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameLessThan(String value) {
            addCriterion("free_single_name <", value, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameLessThanOrEqualTo(String value) {
            addCriterion("free_single_name <=", value, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameLike(String value) {
            addCriterion("free_single_name like", value, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameNotLike(String value) {
            addCriterion("free_single_name not like", value, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameIn(List<String> values) {
            addCriterion("free_single_name in", values, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameNotIn(List<String> values) {
            addCriterion("free_single_name not in", values, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameBetween(String value1, String value2) {
            addCriterion("free_single_name between", value1, value2, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameNotBetween(String value1, String value2) {
            addCriterion("free_single_name not between", value1, value2, "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andFreeTimeIsNull() {
            addCriterion("free_time is null");
            return (Criteria) this;
        }

        public Criteria andFreeTimeIsNotNull() {
            addCriterion("free_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreeTimeEqualTo(Date value) {
            addCriterion("free_time =", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeNotEqualTo(Date value) {
            addCriterion("free_time <>", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeGreaterThan(Date value) {
            addCriterion("free_time >", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("free_time >=", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeLessThan(Date value) {
            addCriterion("free_time <", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeLessThanOrEqualTo(Date value) {
            addCriterion("free_time <=", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeIn(List<Date> values) {
            addCriterion("free_time in", values, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeNotIn(List<Date> values) {
            addCriterion("free_time not in", values, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeBetween(Date value1, Date value2) {
            addCriterion("free_time between", value1, value2, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeNotBetween(Date value1, Date value2) {
            addCriterion("free_time not between", value1, value2, "freeTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
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

        public Criteria andBookerTimeIsNull() {
            addCriterion("booker_time is null");
            return (Criteria) this;
        }

        public Criteria andBookerTimeIsNotNull() {
            addCriterion("booker_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookerTimeEqualTo(Date value) {
            addCriterion("booker_time =", value, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeNotEqualTo(Date value) {
            addCriterion("booker_time <>", value, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeGreaterThan(Date value) {
            addCriterion("booker_time >", value, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("booker_time >=", value, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeLessThan(Date value) {
            addCriterion("booker_time <", value, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeLessThanOrEqualTo(Date value) {
            addCriterion("booker_time <=", value, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeIn(List<Date> values) {
            addCriterion("booker_time in", values, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeNotIn(List<Date> values) {
            addCriterion("booker_time not in", values, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeBetween(Date value1, Date value2) {
            addCriterion("booker_time between", value1, value2, "bookerTime");
            return (Criteria) this;
        }

        public Criteria andBookerTimeNotBetween(Date value1, Date value2) {
            addCriterion("booker_time not between", value1, value2, "bookerTime");
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

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdIsNull() {
            addCriterion("waybill_change_big_id is null");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdIsNotNull() {
            addCriterion("waybill_change_big_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdEqualTo(Long value) {
            addCriterion("waybill_change_big_id =", value, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdNotEqualTo(Long value) {
            addCriterion("waybill_change_big_id <>", value, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdGreaterThan(Long value) {
            addCriterion("waybill_change_big_id >", value, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("waybill_change_big_id >=", value, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdLessThan(Long value) {
            addCriterion("waybill_change_big_id <", value, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdLessThanOrEqualTo(Long value) {
            addCriterion("waybill_change_big_id <=", value, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdIn(List<Long> values) {
            addCriterion("waybill_change_big_id in", values, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdNotIn(List<Long> values) {
            addCriterion("waybill_change_big_id not in", values, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdBetween(Long value1, Long value2) {
            addCriterion("waybill_change_big_id between", value1, value2, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andWaybillChangeBigIdNotBetween(Long value1, Long value2) {
            addCriterion("waybill_change_big_id not between", value1, value2, "waybillChangeBigId");
            return (Criteria) this;
        }

        public Criteria andFreeSingleNameLikeInsensitive(String value) {
            addCriterion("upper(free_single_name) like", value.toUpperCase(), "freeSingleName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(booker_employee_name) like", value.toUpperCase(), "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andFreeReasonLikeInsensitive(String value) {
            addCriterion("upper(free_reason) like", value.toUpperCase(), "freeReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLikeInsensitive(String value) {
            addCriterion("upper(cancel_reason) like", value.toUpperCase(), "cancelReason");
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