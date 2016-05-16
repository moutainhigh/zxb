package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TSbWaybillFeeCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillFeeCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andInsuredFeeIsNull() {
            addCriterion("insured_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeIsNotNull() {
            addCriterion("insured_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeEqualTo(BigDecimal value) {
            addCriterion("insured_fee =", value, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeNotEqualTo(BigDecimal value) {
            addCriterion("insured_fee <>", value, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeGreaterThan(BigDecimal value) {
            addCriterion("insured_fee >", value, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insured_fee >=", value, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeLessThan(BigDecimal value) {
            addCriterion("insured_fee <", value, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insured_fee <=", value, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeIn(List<BigDecimal> values) {
            addCriterion("insured_fee in", values, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeNotIn(List<BigDecimal> values) {
            addCriterion("insured_fee not in", values, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insured_fee between", value1, value2, "insuredFee");
            return (Criteria) this;
        }

        public Criteria andInsuredFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insured_fee not between", value1, value2, "insuredFee");
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

        public Criteria andActivePremiumFeeIsNull() {
            addCriterion("active_premium_fee is null");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeIsNotNull() {
            addCriterion("active_premium_fee is not null");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeEqualTo(BigDecimal value) {
            addCriterion("active_premium_fee =", value, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeNotEqualTo(BigDecimal value) {
            addCriterion("active_premium_fee <>", value, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeGreaterThan(BigDecimal value) {
            addCriterion("active_premium_fee >", value, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("active_premium_fee >=", value, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeLessThan(BigDecimal value) {
            addCriterion("active_premium_fee <", value, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("active_premium_fee <=", value, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeIn(List<BigDecimal> values) {
            addCriterion("active_premium_fee in", values, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeNotIn(List<BigDecimal> values) {
            addCriterion("active_premium_fee not in", values, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("active_premium_fee between", value1, value2, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andActivePremiumFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("active_premium_fee not between", value1, value2, "activePremiumFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIsNull() {
            addCriterion("freight_fee is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIsNotNull() {
            addCriterion("freight_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeEqualTo(BigDecimal value) {
            addCriterion("freight_fee =", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotEqualTo(BigDecimal value) {
            addCriterion("freight_fee <>", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeGreaterThan(BigDecimal value) {
            addCriterion("freight_fee >", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_fee >=", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeLessThan(BigDecimal value) {
            addCriterion("freight_fee <", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_fee <=", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIn(List<BigDecimal> values) {
            addCriterion("freight_fee in", values, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotIn(List<BigDecimal> values) {
            addCriterion("freight_fee not in", values, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_fee between", value1, value2, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_fee not between", value1, value2, "freightFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeIsNull() {
            addCriterion("business_fee is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeIsNotNull() {
            addCriterion("business_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeEqualTo(BigDecimal value) {
            addCriterion("business_fee =", value, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeNotEqualTo(BigDecimal value) {
            addCriterion("business_fee <>", value, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeGreaterThan(BigDecimal value) {
            addCriterion("business_fee >", value, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("business_fee >=", value, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeLessThan(BigDecimal value) {
            addCriterion("business_fee <", value, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("business_fee <=", value, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeIn(List<BigDecimal> values) {
            addCriterion("business_fee in", values, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeNotIn(List<BigDecimal> values) {
            addCriterion("business_fee not in", values, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("business_fee between", value1, value2, "businessFee");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("business_fee not between", value1, value2, "businessFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeIsNull() {
            addCriterion("all_fee is null");
            return (Criteria) this;
        }

        public Criteria andAllFeeIsNotNull() {
            addCriterion("all_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAllFeeEqualTo(BigDecimal value) {
            addCriterion("all_fee =", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeNotEqualTo(BigDecimal value) {
            addCriterion("all_fee <>", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeGreaterThan(BigDecimal value) {
            addCriterion("all_fee >", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_fee >=", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeLessThan(BigDecimal value) {
            addCriterion("all_fee <", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_fee <=", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeIn(List<BigDecimal> values) {
            addCriterion("all_fee in", values, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeNotIn(List<BigDecimal> values) {
            addCriterion("all_fee not in", values, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_fee between", value1, value2, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_fee not between", value1, value2, "allFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusIsNull() {
            addCriterion("freight_fee_status is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusIsNotNull() {
            addCriterion("freight_fee_status is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusEqualTo(Integer value) {
            addCriterion("freight_fee_status =", value, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusNotEqualTo(Integer value) {
            addCriterion("freight_fee_status <>", value, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusGreaterThan(Integer value) {
            addCriterion("freight_fee_status >", value, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_fee_status >=", value, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusLessThan(Integer value) {
            addCriterion("freight_fee_status <", value, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("freight_fee_status <=", value, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusIn(List<Integer> values) {
            addCriterion("freight_fee_status in", values, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusNotIn(List<Integer> values) {
            addCriterion("freight_fee_status not in", values, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusBetween(Integer value1, Integer value2) {
            addCriterion("freight_fee_status between", value1, value2, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_fee_status not between", value1, value2, "freightFeeStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdIsNull() {
            addCriterion("freight_fee_verifi_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdIsNotNull() {
            addCriterion("freight_fee_verifi_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdEqualTo(Long value) {
            addCriterion("freight_fee_verifi_user_id =", value, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdNotEqualTo(Long value) {
            addCriterion("freight_fee_verifi_user_id <>", value, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdGreaterThan(Long value) {
            addCriterion("freight_fee_verifi_user_id >", value, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("freight_fee_verifi_user_id >=", value, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdLessThan(Long value) {
            addCriterion("freight_fee_verifi_user_id <", value, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdLessThanOrEqualTo(Long value) {
            addCriterion("freight_fee_verifi_user_id <=", value, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdIn(List<Long> values) {
            addCriterion("freight_fee_verifi_user_id in", values, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdNotIn(List<Long> values) {
            addCriterion("freight_fee_verifi_user_id not in", values, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdBetween(Long value1, Long value2) {
            addCriterion("freight_fee_verifi_user_id between", value1, value2, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserIdNotBetween(Long value1, Long value2) {
            addCriterion("freight_fee_verifi_user_id not between", value1, value2, "freightFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameIsNull() {
            addCriterion("freight_fee_verifi_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameIsNotNull() {
            addCriterion("freight_fee_verifi_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameEqualTo(String value) {
            addCriterion("freight_fee_verifi_user_name =", value, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameNotEqualTo(String value) {
            addCriterion("freight_fee_verifi_user_name <>", value, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameGreaterThan(String value) {
            addCriterion("freight_fee_verifi_user_name >", value, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("freight_fee_verifi_user_name >=", value, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameLessThan(String value) {
            addCriterion("freight_fee_verifi_user_name <", value, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameLessThanOrEqualTo(String value) {
            addCriterion("freight_fee_verifi_user_name <=", value, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameLike(String value) {
            addCriterion("freight_fee_verifi_user_name like", value, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameNotLike(String value) {
            addCriterion("freight_fee_verifi_user_name not like", value, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameIn(List<String> values) {
            addCriterion("freight_fee_verifi_user_name in", values, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameNotIn(List<String> values) {
            addCriterion("freight_fee_verifi_user_name not in", values, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameBetween(String value1, String value2) {
            addCriterion("freight_fee_verifi_user_name between", value1, value2, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameNotBetween(String value1, String value2) {
            addCriterion("freight_fee_verifi_user_name not between", value1, value2, "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeIsNull() {
            addCriterion("freight_fee_verifi_time is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeIsNotNull() {
            addCriterion("freight_fee_verifi_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeEqualTo(Date value) {
            addCriterion("freight_fee_verifi_time =", value, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeNotEqualTo(Date value) {
            addCriterion("freight_fee_verifi_time <>", value, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeGreaterThan(Date value) {
            addCriterion("freight_fee_verifi_time >", value, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("freight_fee_verifi_time >=", value, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeLessThan(Date value) {
            addCriterion("freight_fee_verifi_time <", value, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeLessThanOrEqualTo(Date value) {
            addCriterion("freight_fee_verifi_time <=", value, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeIn(List<Date> values) {
            addCriterion("freight_fee_verifi_time in", values, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeNotIn(List<Date> values) {
            addCriterion("freight_fee_verifi_time not in", values, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeBetween(Date value1, Date value2) {
            addCriterion("freight_fee_verifi_time between", value1, value2, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiTimeNotBetween(Date value1, Date value2) {
            addCriterion("freight_fee_verifi_time not between", value1, value2, "freightFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusIsNull() {
            addCriterion("freight_fee_over_status is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusIsNotNull() {
            addCriterion("freight_fee_over_status is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusEqualTo(Integer value) {
            addCriterion("freight_fee_over_status =", value, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusNotEqualTo(Integer value) {
            addCriterion("freight_fee_over_status <>", value, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusGreaterThan(Integer value) {
            addCriterion("freight_fee_over_status >", value, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_fee_over_status >=", value, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusLessThan(Integer value) {
            addCriterion("freight_fee_over_status <", value, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusLessThanOrEqualTo(Integer value) {
            addCriterion("freight_fee_over_status <=", value, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusIn(List<Integer> values) {
            addCriterion("freight_fee_over_status in", values, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusNotIn(List<Integer> values) {
            addCriterion("freight_fee_over_status not in", values, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusBetween(Integer value1, Integer value2) {
            addCriterion("freight_fee_over_status between", value1, value2, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_fee_over_status not between", value1, value2, "freightFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeIsNull() {
            addCriterion("freight_fee_over_time is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeIsNotNull() {
            addCriterion("freight_fee_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeEqualTo(Date value) {
            addCriterion("freight_fee_over_time =", value, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeNotEqualTo(Date value) {
            addCriterion("freight_fee_over_time <>", value, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeGreaterThan(Date value) {
            addCriterion("freight_fee_over_time >", value, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("freight_fee_over_time >=", value, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeLessThan(Date value) {
            addCriterion("freight_fee_over_time <", value, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("freight_fee_over_time <=", value, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeIn(List<Date> values) {
            addCriterion("freight_fee_over_time in", values, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeNotIn(List<Date> values) {
            addCriterion("freight_fee_over_time not in", values, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeBetween(Date value1, Date value2) {
            addCriterion("freight_fee_over_time between", value1, value2, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("freight_fee_over_time not between", value1, value2, "freightFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdIsNull() {
            addCriterion("freight_fee_over_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdIsNotNull() {
            addCriterion("freight_fee_over_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdEqualTo(Long value) {
            addCriterion("freight_fee_over_user_id =", value, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdNotEqualTo(Long value) {
            addCriterion("freight_fee_over_user_id <>", value, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdGreaterThan(Long value) {
            addCriterion("freight_fee_over_user_id >", value, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("freight_fee_over_user_id >=", value, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdLessThan(Long value) {
            addCriterion("freight_fee_over_user_id <", value, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdLessThanOrEqualTo(Long value) {
            addCriterion("freight_fee_over_user_id <=", value, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdIn(List<Long> values) {
            addCriterion("freight_fee_over_user_id in", values, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdNotIn(List<Long> values) {
            addCriterion("freight_fee_over_user_id not in", values, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdBetween(Long value1, Long value2) {
            addCriterion("freight_fee_over_user_id between", value1, value2, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserIdNotBetween(Long value1, Long value2) {
            addCriterion("freight_fee_over_user_id not between", value1, value2, "freightFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameIsNull() {
            addCriterion("freight_fee_over_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameIsNotNull() {
            addCriterion("freight_fee_over_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameEqualTo(String value) {
            addCriterion("freight_fee_over_user_name =", value, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameNotEqualTo(String value) {
            addCriterion("freight_fee_over_user_name <>", value, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameGreaterThan(String value) {
            addCriterion("freight_fee_over_user_name >", value, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("freight_fee_over_user_name >=", value, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameLessThan(String value) {
            addCriterion("freight_fee_over_user_name <", value, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameLessThanOrEqualTo(String value) {
            addCriterion("freight_fee_over_user_name <=", value, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameLike(String value) {
            addCriterion("freight_fee_over_user_name like", value, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameNotLike(String value) {
            addCriterion("freight_fee_over_user_name not like", value, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameIn(List<String> values) {
            addCriterion("freight_fee_over_user_name in", values, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameNotIn(List<String> values) {
            addCriterion("freight_fee_over_user_name not in", values, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameBetween(String value1, String value2) {
            addCriterion("freight_fee_over_user_name between", value1, value2, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameNotBetween(String value1, String value2) {
            addCriterion("freight_fee_over_user_name not between", value1, value2, "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusIsNull() {
            addCriterion("business_fee_status is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusIsNotNull() {
            addCriterion("business_fee_status is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusEqualTo(Integer value) {
            addCriterion("business_fee_status =", value, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusNotEqualTo(Integer value) {
            addCriterion("business_fee_status <>", value, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusGreaterThan(Integer value) {
            addCriterion("business_fee_status >", value, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_fee_status >=", value, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusLessThan(Integer value) {
            addCriterion("business_fee_status <", value, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("business_fee_status <=", value, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusIn(List<Integer> values) {
            addCriterion("business_fee_status in", values, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusNotIn(List<Integer> values) {
            addCriterion("business_fee_status not in", values, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusBetween(Integer value1, Integer value2) {
            addCriterion("business_fee_status between", value1, value2, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("business_fee_status not between", value1, value2, "businessFeeStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdIsNull() {
            addCriterion("business_fee_verifi_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdIsNotNull() {
            addCriterion("business_fee_verifi_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdEqualTo(Long value) {
            addCriterion("business_fee_verifi_user_id =", value, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdNotEqualTo(Long value) {
            addCriterion("business_fee_verifi_user_id <>", value, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdGreaterThan(Long value) {
            addCriterion("business_fee_verifi_user_id >", value, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_fee_verifi_user_id >=", value, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdLessThan(Long value) {
            addCriterion("business_fee_verifi_user_id <", value, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdLessThanOrEqualTo(Long value) {
            addCriterion("business_fee_verifi_user_id <=", value, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdIn(List<Long> values) {
            addCriterion("business_fee_verifi_user_id in", values, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdNotIn(List<Long> values) {
            addCriterion("business_fee_verifi_user_id not in", values, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdBetween(Long value1, Long value2) {
            addCriterion("business_fee_verifi_user_id between", value1, value2, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserIdNotBetween(Long value1, Long value2) {
            addCriterion("business_fee_verifi_user_id not between", value1, value2, "businessFeeVerifiUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameIsNull() {
            addCriterion("business_fee_verifi_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameIsNotNull() {
            addCriterion("business_fee_verifi_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameEqualTo(String value) {
            addCriterion("business_fee_verifi_user_name =", value, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameNotEqualTo(String value) {
            addCriterion("business_fee_verifi_user_name <>", value, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameGreaterThan(String value) {
            addCriterion("business_fee_verifi_user_name >", value, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_fee_verifi_user_name >=", value, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameLessThan(String value) {
            addCriterion("business_fee_verifi_user_name <", value, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameLessThanOrEqualTo(String value) {
            addCriterion("business_fee_verifi_user_name <=", value, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameLike(String value) {
            addCriterion("business_fee_verifi_user_name like", value, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameNotLike(String value) {
            addCriterion("business_fee_verifi_user_name not like", value, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameIn(List<String> values) {
            addCriterion("business_fee_verifi_user_name in", values, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameNotIn(List<String> values) {
            addCriterion("business_fee_verifi_user_name not in", values, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameBetween(String value1, String value2) {
            addCriterion("business_fee_verifi_user_name between", value1, value2, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameNotBetween(String value1, String value2) {
            addCriterion("business_fee_verifi_user_name not between", value1, value2, "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeIsNull() {
            addCriterion("business_fee_verifi_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeIsNotNull() {
            addCriterion("business_fee_verifi_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeEqualTo(Date value) {
            addCriterion("business_fee_verifi_time =", value, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeNotEqualTo(Date value) {
            addCriterion("business_fee_verifi_time <>", value, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeGreaterThan(Date value) {
            addCriterion("business_fee_verifi_time >", value, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_fee_verifi_time >=", value, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeLessThan(Date value) {
            addCriterion("business_fee_verifi_time <", value, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_fee_verifi_time <=", value, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeIn(List<Date> values) {
            addCriterion("business_fee_verifi_time in", values, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeNotIn(List<Date> values) {
            addCriterion("business_fee_verifi_time not in", values, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeBetween(Date value1, Date value2) {
            addCriterion("business_fee_verifi_time between", value1, value2, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_fee_verifi_time not between", value1, value2, "businessFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdIsNull() {
            addCriterion("business_payment_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdIsNotNull() {
            addCriterion("business_payment_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdEqualTo(Long value) {
            addCriterion("business_payment_user_id =", value, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdNotEqualTo(Long value) {
            addCriterion("business_payment_user_id <>", value, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdGreaterThan(Long value) {
            addCriterion("business_payment_user_id >", value, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_payment_user_id >=", value, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdLessThan(Long value) {
            addCriterion("business_payment_user_id <", value, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdLessThanOrEqualTo(Long value) {
            addCriterion("business_payment_user_id <=", value, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdIn(List<Long> values) {
            addCriterion("business_payment_user_id in", values, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdNotIn(List<Long> values) {
            addCriterion("business_payment_user_id not in", values, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdBetween(Long value1, Long value2) {
            addCriterion("business_payment_user_id between", value1, value2, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserIdNotBetween(Long value1, Long value2) {
            addCriterion("business_payment_user_id not between", value1, value2, "businessPaymentUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameIsNull() {
            addCriterion("business_payment_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameIsNotNull() {
            addCriterion("business_payment_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameEqualTo(String value) {
            addCriterion("business_payment_user_name =", value, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameNotEqualTo(String value) {
            addCriterion("business_payment_user_name <>", value, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameGreaterThan(String value) {
            addCriterion("business_payment_user_name >", value, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_payment_user_name >=", value, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameLessThan(String value) {
            addCriterion("business_payment_user_name <", value, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameLessThanOrEqualTo(String value) {
            addCriterion("business_payment_user_name <=", value, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameLike(String value) {
            addCriterion("business_payment_user_name like", value, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameNotLike(String value) {
            addCriterion("business_payment_user_name not like", value, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameIn(List<String> values) {
            addCriterion("business_payment_user_name in", values, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameNotIn(List<String> values) {
            addCriterion("business_payment_user_name not in", values, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameBetween(String value1, String value2) {
            addCriterion("business_payment_user_name between", value1, value2, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameNotBetween(String value1, String value2) {
            addCriterion("business_payment_user_name not between", value1, value2, "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeIsNull() {
            addCriterion("business_payment_user_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeIsNotNull() {
            addCriterion("business_payment_user_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeEqualTo(Date value) {
            addCriterion("business_payment_user_time =", value, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeNotEqualTo(Date value) {
            addCriterion("business_payment_user_time <>", value, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeGreaterThan(Date value) {
            addCriterion("business_payment_user_time >", value, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_payment_user_time >=", value, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeLessThan(Date value) {
            addCriterion("business_payment_user_time <", value, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_payment_user_time <=", value, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeIn(List<Date> values) {
            addCriterion("business_payment_user_time in", values, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeNotIn(List<Date> values) {
            addCriterion("business_payment_user_time not in", values, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeBetween(Date value1, Date value2) {
            addCriterion("business_payment_user_time between", value1, value2, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_payment_user_time not between", value1, value2, "businessPaymentUserTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusIsNull() {
            addCriterion("business_fee_over_status is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusIsNotNull() {
            addCriterion("business_fee_over_status is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusEqualTo(Integer value) {
            addCriterion("business_fee_over_status =", value, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusNotEqualTo(Integer value) {
            addCriterion("business_fee_over_status <>", value, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusGreaterThan(Integer value) {
            addCriterion("business_fee_over_status >", value, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_fee_over_status >=", value, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusLessThan(Integer value) {
            addCriterion("business_fee_over_status <", value, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusLessThanOrEqualTo(Integer value) {
            addCriterion("business_fee_over_status <=", value, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusIn(List<Integer> values) {
            addCriterion("business_fee_over_status in", values, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusNotIn(List<Integer> values) {
            addCriterion("business_fee_over_status not in", values, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusBetween(Integer value1, Integer value2) {
            addCriterion("business_fee_over_status between", value1, value2, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("business_fee_over_status not between", value1, value2, "businessFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeIsNull() {
            addCriterion("business_fee_over_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeIsNotNull() {
            addCriterion("business_fee_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeEqualTo(Date value) {
            addCriterion("business_fee_over_time =", value, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeNotEqualTo(Date value) {
            addCriterion("business_fee_over_time <>", value, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeGreaterThan(Date value) {
            addCriterion("business_fee_over_time >", value, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_fee_over_time >=", value, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeLessThan(Date value) {
            addCriterion("business_fee_over_time <", value, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_fee_over_time <=", value, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeIn(List<Date> values) {
            addCriterion("business_fee_over_time in", values, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeNotIn(List<Date> values) {
            addCriterion("business_fee_over_time not in", values, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeBetween(Date value1, Date value2) {
            addCriterion("business_fee_over_time between", value1, value2, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_fee_over_time not between", value1, value2, "businessFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdIsNull() {
            addCriterion("business_fee_over_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdIsNotNull() {
            addCriterion("business_fee_over_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdEqualTo(Long value) {
            addCriterion("business_fee_over_user_id =", value, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdNotEqualTo(Long value) {
            addCriterion("business_fee_over_user_id <>", value, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdGreaterThan(Long value) {
            addCriterion("business_fee_over_user_id >", value, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_fee_over_user_id >=", value, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdLessThan(Long value) {
            addCriterion("business_fee_over_user_id <", value, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdLessThanOrEqualTo(Long value) {
            addCriterion("business_fee_over_user_id <=", value, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdIn(List<Long> values) {
            addCriterion("business_fee_over_user_id in", values, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdNotIn(List<Long> values) {
            addCriterion("business_fee_over_user_id not in", values, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdBetween(Long value1, Long value2) {
            addCriterion("business_fee_over_user_id between", value1, value2, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserIdNotBetween(Long value1, Long value2) {
            addCriterion("business_fee_over_user_id not between", value1, value2, "businessFeeOverUserId");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameIsNull() {
            addCriterion("business_fee_over_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameIsNotNull() {
            addCriterion("business_fee_over_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameEqualTo(String value) {
            addCriterion("business_fee_over_user_name =", value, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameNotEqualTo(String value) {
            addCriterion("business_fee_over_user_name <>", value, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameGreaterThan(String value) {
            addCriterion("business_fee_over_user_name >", value, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_fee_over_user_name >=", value, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameLessThan(String value) {
            addCriterion("business_fee_over_user_name <", value, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameLessThanOrEqualTo(String value) {
            addCriterion("business_fee_over_user_name <=", value, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameLike(String value) {
            addCriterion("business_fee_over_user_name like", value, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameNotLike(String value) {
            addCriterion("business_fee_over_user_name not like", value, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameIn(List<String> values) {
            addCriterion("business_fee_over_user_name in", values, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameNotIn(List<String> values) {
            addCriterion("business_fee_over_user_name not in", values, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameBetween(String value1, String value2) {
            addCriterion("business_fee_over_user_name between", value1, value2, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameNotBetween(String value1, String value2) {
            addCriterion("business_fee_over_user_name not between", value1, value2, "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeIsNull() {
            addCriterion("xfyf_fee is null");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeIsNotNull() {
            addCriterion("xfyf_fee is not null");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeEqualTo(BigDecimal value) {
            addCriterion("xfyf_fee =", value, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeNotEqualTo(BigDecimal value) {
            addCriterion("xfyf_fee <>", value, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeGreaterThan(BigDecimal value) {
            addCriterion("xfyf_fee >", value, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("xfyf_fee >=", value, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeLessThan(BigDecimal value) {
            addCriterion("xfyf_fee <", value, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("xfyf_fee <=", value, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeIn(List<BigDecimal> values) {
            addCriterion("xfyf_fee in", values, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeNotIn(List<BigDecimal> values) {
            addCriterion("xfyf_fee not in", values, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xfyf_fee between", value1, value2, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xfyf_fee not between", value1, value2, "xfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeIsNull() {
            addCriterion("dfyf_fee is null");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeIsNotNull() {
            addCriterion("dfyf_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeEqualTo(BigDecimal value) {
            addCriterion("dfyf_fee =", value, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeNotEqualTo(BigDecimal value) {
            addCriterion("dfyf_fee <>", value, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeGreaterThan(BigDecimal value) {
            addCriterion("dfyf_fee >", value, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dfyf_fee >=", value, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeLessThan(BigDecimal value) {
            addCriterion("dfyf_fee <", value, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dfyf_fee <=", value, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeIn(List<BigDecimal> values) {
            addCriterion("dfyf_fee in", values, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeNotIn(List<BigDecimal> values) {
            addCriterion("dfyf_fee not in", values, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dfyf_fee between", value1, value2, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dfyf_fee not between", value1, value2, "dfyfFee");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbIsNull() {
            addCriterion("xfyf_fee_with_zb is null");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbIsNotNull() {
            addCriterion("xfyf_fee_with_zb is not null");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbEqualTo(BigDecimal value) {
            addCriterion("xfyf_fee_with_zb =", value, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbNotEqualTo(BigDecimal value) {
            addCriterion("xfyf_fee_with_zb <>", value, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbGreaterThan(BigDecimal value) {
            addCriterion("xfyf_fee_with_zb >", value, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("xfyf_fee_with_zb >=", value, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbLessThan(BigDecimal value) {
            addCriterion("xfyf_fee_with_zb <", value, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("xfyf_fee_with_zb <=", value, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbIn(List<BigDecimal> values) {
            addCriterion("xfyf_fee_with_zb in", values, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbNotIn(List<BigDecimal> values) {
            addCriterion("xfyf_fee_with_zb not in", values, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xfyf_fee_with_zb between", value1, value2, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andXfyfFeeWithZbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xfyf_fee_with_zb not between", value1, value2, "xfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbIsNull() {
            addCriterion("dfyf_fee_with_zb is null");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbIsNotNull() {
            addCriterion("dfyf_fee_with_zb is not null");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbEqualTo(BigDecimal value) {
            addCriterion("dfyf_fee_with_zb =", value, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbNotEqualTo(BigDecimal value) {
            addCriterion("dfyf_fee_with_zb <>", value, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbGreaterThan(BigDecimal value) {
            addCriterion("dfyf_fee_with_zb >", value, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dfyf_fee_with_zb >=", value, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbLessThan(BigDecimal value) {
            addCriterion("dfyf_fee_with_zb <", value, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dfyf_fee_with_zb <=", value, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbIn(List<BigDecimal> values) {
            addCriterion("dfyf_fee_with_zb in", values, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbNotIn(List<BigDecimal> values) {
            addCriterion("dfyf_fee_with_zb not in", values, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dfyf_fee_with_zb between", value1, value2, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andDfyfFeeWithZbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dfyf_fee_with_zb not between", value1, value2, "dfyfFeeWithZb");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeIsNull() {
            addCriterion("checkouted_business_fee is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeIsNotNull() {
            addCriterion("checkouted_business_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeEqualTo(BigDecimal value) {
            addCriterion("checkouted_business_fee =", value, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeNotEqualTo(BigDecimal value) {
            addCriterion("checkouted_business_fee <>", value, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeGreaterThan(BigDecimal value) {
            addCriterion("checkouted_business_fee >", value, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("checkouted_business_fee >=", value, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeLessThan(BigDecimal value) {
            addCriterion("checkouted_business_fee <", value, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("checkouted_business_fee <=", value, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeIn(List<BigDecimal> values) {
            addCriterion("checkouted_business_fee in", values, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeNotIn(List<BigDecimal> values) {
            addCriterion("checkouted_business_fee not in", values, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("checkouted_business_fee between", value1, value2, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andCheckoutedBusinessFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("checkouted_business_fee not between", value1, value2, "checkoutedBusinessFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIsNull() {
            addCriterion("invoice_fee is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIsNotNull() {
            addCriterion("invoice_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeEqualTo(BigDecimal value) {
            addCriterion("invoice_fee =", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("invoice_fee <>", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeGreaterThan(BigDecimal value) {
            addCriterion("invoice_fee >", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_fee >=", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeLessThan(BigDecimal value) {
            addCriterion("invoice_fee <", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_fee <=", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIn(List<BigDecimal> values) {
            addCriterion("invoice_fee in", values, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("invoice_fee not in", values, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_fee between", value1, value2, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_fee not between", value1, value2, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeIsNull() {
            addCriterion("online_pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeIsNotNull() {
            addCriterion("online_pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeEqualTo(BigDecimal value) {
            addCriterion("online_pay_fee =", value, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeNotEqualTo(BigDecimal value) {
            addCriterion("online_pay_fee <>", value, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeGreaterThan(BigDecimal value) {
            addCriterion("online_pay_fee >", value, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("online_pay_fee >=", value, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeLessThan(BigDecimal value) {
            addCriterion("online_pay_fee <", value, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("online_pay_fee <=", value, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeIn(List<BigDecimal> values) {
            addCriterion("online_pay_fee in", values, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeNotIn(List<BigDecimal> values) {
            addCriterion("online_pay_fee not in", values, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_pay_fee between", value1, value2, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andOnlinePayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_pay_fee not between", value1, value2, "onlinePayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeIsNull() {
            addCriterion("receive_timeout_pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeIsNotNull() {
            addCriterion("receive_timeout_pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeEqualTo(BigDecimal value) {
            addCriterion("receive_timeout_pay_fee =", value, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("receive_timeout_pay_fee <>", value, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeGreaterThan(BigDecimal value) {
            addCriterion("receive_timeout_pay_fee >", value, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receive_timeout_pay_fee >=", value, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeLessThan(BigDecimal value) {
            addCriterion("receive_timeout_pay_fee <", value, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receive_timeout_pay_fee <=", value, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeIn(List<BigDecimal> values) {
            addCriterion("receive_timeout_pay_fee in", values, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("receive_timeout_pay_fee not in", values, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receive_timeout_pay_fee between", value1, value2, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receive_timeout_pay_fee not between", value1, value2, "receiveTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeIsNull() {
            addCriterion("waybill_timeout_pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeIsNotNull() {
            addCriterion("waybill_timeout_pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeEqualTo(BigDecimal value) {
            addCriterion("waybill_timeout_pay_fee =", value, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("waybill_timeout_pay_fee <>", value, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeGreaterThan(BigDecimal value) {
            addCriterion("waybill_timeout_pay_fee >", value, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("waybill_timeout_pay_fee >=", value, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeLessThan(BigDecimal value) {
            addCriterion("waybill_timeout_pay_fee <", value, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("waybill_timeout_pay_fee <=", value, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeIn(List<BigDecimal> values) {
            addCriterion("waybill_timeout_pay_fee in", values, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("waybill_timeout_pay_fee not in", values, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("waybill_timeout_pay_fee between", value1, value2, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("waybill_timeout_pay_fee not between", value1, value2, "waybillTimeoutPayFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeIsNull() {
            addCriterion("site_pay_to_zb_late_fee is null");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeIsNotNull() {
            addCriterion("site_pay_to_zb_late_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeEqualTo(BigDecimal value) {
            addCriterion("site_pay_to_zb_late_fee =", value, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeNotEqualTo(BigDecimal value) {
            addCriterion("site_pay_to_zb_late_fee <>", value, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeGreaterThan(BigDecimal value) {
            addCriterion("site_pay_to_zb_late_fee >", value, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("site_pay_to_zb_late_fee >=", value, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeLessThan(BigDecimal value) {
            addCriterion("site_pay_to_zb_late_fee <", value, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("site_pay_to_zb_late_fee <=", value, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeIn(List<BigDecimal> values) {
            addCriterion("site_pay_to_zb_late_fee in", values, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeNotIn(List<BigDecimal> values) {
            addCriterion("site_pay_to_zb_late_fee not in", values, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("site_pay_to_zb_late_fee between", value1, value2, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andSitePayToZbLateFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("site_pay_to_zb_late_fee not between", value1, value2, "sitePayToZbLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeIsNull() {
            addCriterion("zb_pay_to_site_late_fee is null");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeIsNotNull() {
            addCriterion("zb_pay_to_site_late_fee is not null");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeEqualTo(BigDecimal value) {
            addCriterion("zb_pay_to_site_late_fee =", value, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeNotEqualTo(BigDecimal value) {
            addCriterion("zb_pay_to_site_late_fee <>", value, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeGreaterThan(BigDecimal value) {
            addCriterion("zb_pay_to_site_late_fee >", value, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_pay_to_site_late_fee >=", value, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeLessThan(BigDecimal value) {
            addCriterion("zb_pay_to_site_late_fee <", value, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_pay_to_site_late_fee <=", value, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeIn(List<BigDecimal> values) {
            addCriterion("zb_pay_to_site_late_fee in", values, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeNotIn(List<BigDecimal> values) {
            addCriterion("zb_pay_to_site_late_fee not in", values, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_pay_to_site_late_fee between", value1, value2, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbPayToSiteLateFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_pay_to_site_late_fee not between", value1, value2, "zbPayToSiteLateFee");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusIsNull() {
            addCriterion("zb_receipt_verify_status is null");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusIsNotNull() {
            addCriterion("zb_receipt_verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusEqualTo(Integer value) {
            addCriterion("zb_receipt_verify_status =", value, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusNotEqualTo(Integer value) {
            addCriterion("zb_receipt_verify_status <>", value, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusGreaterThan(Integer value) {
            addCriterion("zb_receipt_verify_status >", value, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_receipt_verify_status >=", value, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusLessThan(Integer value) {
            addCriterion("zb_receipt_verify_status <", value, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("zb_receipt_verify_status <=", value, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusIn(List<Integer> values) {
            addCriterion("zb_receipt_verify_status in", values, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusNotIn(List<Integer> values) {
            addCriterion("zb_receipt_verify_status not in", values, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("zb_receipt_verify_status between", value1, value2, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_receipt_verify_status not between", value1, value2, "zbReceiptVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdIsNull() {
            addCriterion("zb_receipt_verify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdIsNotNull() {
            addCriterion("zb_receipt_verify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdEqualTo(Long value) {
            addCriterion("zb_receipt_verify_user_id =", value, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdNotEqualTo(Long value) {
            addCriterion("zb_receipt_verify_user_id <>", value, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdGreaterThan(Long value) {
            addCriterion("zb_receipt_verify_user_id >", value, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("zb_receipt_verify_user_id >=", value, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdLessThan(Long value) {
            addCriterion("zb_receipt_verify_user_id <", value, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdLessThanOrEqualTo(Long value) {
            addCriterion("zb_receipt_verify_user_id <=", value, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdIn(List<Long> values) {
            addCriterion("zb_receipt_verify_user_id in", values, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdNotIn(List<Long> values) {
            addCriterion("zb_receipt_verify_user_id not in", values, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdBetween(Long value1, Long value2) {
            addCriterion("zb_receipt_verify_user_id between", value1, value2, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserIdNotBetween(Long value1, Long value2) {
            addCriterion("zb_receipt_verify_user_id not between", value1, value2, "zbReceiptVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameIsNull() {
            addCriterion("zb_receipt_verify_user_name is null");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameIsNotNull() {
            addCriterion("zb_receipt_verify_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameEqualTo(String value) {
            addCriterion("zb_receipt_verify_user_name =", value, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameNotEqualTo(String value) {
            addCriterion("zb_receipt_verify_user_name <>", value, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameGreaterThan(String value) {
            addCriterion("zb_receipt_verify_user_name >", value, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_receipt_verify_user_name >=", value, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameLessThan(String value) {
            addCriterion("zb_receipt_verify_user_name <", value, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameLessThanOrEqualTo(String value) {
            addCriterion("zb_receipt_verify_user_name <=", value, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameLike(String value) {
            addCriterion("zb_receipt_verify_user_name like", value, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameNotLike(String value) {
            addCriterion("zb_receipt_verify_user_name not like", value, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameIn(List<String> values) {
            addCriterion("zb_receipt_verify_user_name in", values, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameNotIn(List<String> values) {
            addCriterion("zb_receipt_verify_user_name not in", values, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameBetween(String value1, String value2) {
            addCriterion("zb_receipt_verify_user_name between", value1, value2, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameNotBetween(String value1, String value2) {
            addCriterion("zb_receipt_verify_user_name not between", value1, value2, "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeIsNull() {
            addCriterion("zb_receipt_verify_time is null");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeIsNotNull() {
            addCriterion("zb_receipt_verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeEqualTo(Date value) {
            addCriterion("zb_receipt_verify_time =", value, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeNotEqualTo(Date value) {
            addCriterion("zb_receipt_verify_time <>", value, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeGreaterThan(Date value) {
            addCriterion("zb_receipt_verify_time >", value, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zb_receipt_verify_time >=", value, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeLessThan(Date value) {
            addCriterion("zb_receipt_verify_time <", value, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("zb_receipt_verify_time <=", value, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeIn(List<Date> values) {
            addCriterion("zb_receipt_verify_time in", values, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeNotIn(List<Date> values) {
            addCriterion("zb_receipt_verify_time not in", values, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("zb_receipt_verify_time between", value1, value2, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("zb_receipt_verify_time not between", value1, value2, "zbReceiptVerifyTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeIsNull() {
            addCriterion("zb_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeIsNotNull() {
            addCriterion("zb_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeEqualTo(Date value) {
            addCriterion("zb_receive_time =", value, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeNotEqualTo(Date value) {
            addCriterion("zb_receive_time <>", value, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeGreaterThan(Date value) {
            addCriterion("zb_receive_time >", value, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zb_receive_time >=", value, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeLessThan(Date value) {
            addCriterion("zb_receive_time <", value, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("zb_receive_time <=", value, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeIn(List<Date> values) {
            addCriterion("zb_receive_time in", values, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeNotIn(List<Date> values) {
            addCriterion("zb_receive_time not in", values, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("zb_receive_time between", value1, value2, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("zb_receive_time not between", value1, value2, "zbReceiveTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeIsNull() {
            addCriterion("zb_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeIsNotNull() {
            addCriterion("zb_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeEqualTo(Date value) {
            addCriterion("zb_payment_time =", value, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeNotEqualTo(Date value) {
            addCriterion("zb_payment_time <>", value, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeGreaterThan(Date value) {
            addCriterion("zb_payment_time >", value, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zb_payment_time >=", value, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeLessThan(Date value) {
            addCriterion("zb_payment_time <", value, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("zb_payment_time <=", value, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeIn(List<Date> values) {
            addCriterion("zb_payment_time in", values, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeNotIn(List<Date> values) {
            addCriterion("zb_payment_time not in", values, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("zb_payment_time between", value1, value2, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("zb_payment_time not between", value1, value2, "zbPaymentTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusIsNull() {
            addCriterion("zb_with_site_balance_status is null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusIsNotNull() {
            addCriterion("zb_with_site_balance_status is not null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusEqualTo(Integer value) {
            addCriterion("zb_with_site_balance_status =", value, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusNotEqualTo(Integer value) {
            addCriterion("zb_with_site_balance_status <>", value, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusGreaterThan(Integer value) {
            addCriterion("zb_with_site_balance_status >", value, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_with_site_balance_status >=", value, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusLessThan(Integer value) {
            addCriterion("zb_with_site_balance_status <", value, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("zb_with_site_balance_status <=", value, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusIn(List<Integer> values) {
            addCriterion("zb_with_site_balance_status in", values, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusNotIn(List<Integer> values) {
            addCriterion("zb_with_site_balance_status not in", values, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusBetween(Integer value1, Integer value2) {
            addCriterion("zb_with_site_balance_status between", value1, value2, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_with_site_balance_status not between", value1, value2, "zbWithSiteBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdIsNull() {
            addCriterion("zb_with_site_balance_user_id is null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdIsNotNull() {
            addCriterion("zb_with_site_balance_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdEqualTo(Long value) {
            addCriterion("zb_with_site_balance_user_id =", value, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdNotEqualTo(Long value) {
            addCriterion("zb_with_site_balance_user_id <>", value, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdGreaterThan(Long value) {
            addCriterion("zb_with_site_balance_user_id >", value, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("zb_with_site_balance_user_id >=", value, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdLessThan(Long value) {
            addCriterion("zb_with_site_balance_user_id <", value, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdLessThanOrEqualTo(Long value) {
            addCriterion("zb_with_site_balance_user_id <=", value, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdIn(List<Long> values) {
            addCriterion("zb_with_site_balance_user_id in", values, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdNotIn(List<Long> values) {
            addCriterion("zb_with_site_balance_user_id not in", values, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdBetween(Long value1, Long value2) {
            addCriterion("zb_with_site_balance_user_id between", value1, value2, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserIdNotBetween(Long value1, Long value2) {
            addCriterion("zb_with_site_balance_user_id not between", value1, value2, "zbWithSiteBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameIsNull() {
            addCriterion("zb_with_site_balance_user_name is null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameIsNotNull() {
            addCriterion("zb_with_site_balance_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameEqualTo(String value) {
            addCriterion("zb_with_site_balance_user_name =", value, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameNotEqualTo(String value) {
            addCriterion("zb_with_site_balance_user_name <>", value, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameGreaterThan(String value) {
            addCriterion("zb_with_site_balance_user_name >", value, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_with_site_balance_user_name >=", value, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameLessThan(String value) {
            addCriterion("zb_with_site_balance_user_name <", value, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameLessThanOrEqualTo(String value) {
            addCriterion("zb_with_site_balance_user_name <=", value, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameLike(String value) {
            addCriterion("zb_with_site_balance_user_name like", value, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameNotLike(String value) {
            addCriterion("zb_with_site_balance_user_name not like", value, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameIn(List<String> values) {
            addCriterion("zb_with_site_balance_user_name in", values, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameNotIn(List<String> values) {
            addCriterion("zb_with_site_balance_user_name not in", values, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameBetween(String value1, String value2) {
            addCriterion("zb_with_site_balance_user_name between", value1, value2, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameNotBetween(String value1, String value2) {
            addCriterion("zb_with_site_balance_user_name not between", value1, value2, "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeIsNull() {
            addCriterion("zb_with_site_balance_time is null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeIsNotNull() {
            addCriterion("zb_with_site_balance_time is not null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeEqualTo(Date value) {
            addCriterionForJDBCDate("zb_with_site_balance_time =", value, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("zb_with_site_balance_time <>", value, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("zb_with_site_balance_time >", value, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zb_with_site_balance_time >=", value, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeLessThan(Date value) {
            addCriterionForJDBCDate("zb_with_site_balance_time <", value, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zb_with_site_balance_time <=", value, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("zb_with_site_balance_time in", values, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("zb_with_site_balance_time not in", values, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zb_with_site_balance_time between", value1, value2, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zb_with_site_balance_time not between", value1, value2, "zbWithSiteBalanceTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusIsNull() {
            addCriterion("late_fee_status is null");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusIsNotNull() {
            addCriterion("late_fee_status is not null");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusEqualTo(Integer value) {
            addCriterion("late_fee_status =", value, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusNotEqualTo(Integer value) {
            addCriterion("late_fee_status <>", value, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusGreaterThan(Integer value) {
            addCriterion("late_fee_status >", value, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("late_fee_status >=", value, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusLessThan(Integer value) {
            addCriterion("late_fee_status <", value, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("late_fee_status <=", value, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusIn(List<Integer> values) {
            addCriterion("late_fee_status in", values, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusNotIn(List<Integer> values) {
            addCriterion("late_fee_status not in", values, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusBetween(Integer value1, Integer value2) {
            addCriterion("late_fee_status between", value1, value2, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("late_fee_status not between", value1, value2, "lateFeeStatus");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdIsNull() {
            addCriterion("late_fee_verify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdIsNotNull() {
            addCriterion("late_fee_verify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdEqualTo(Long value) {
            addCriterion("late_fee_verify_user_id =", value, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdNotEqualTo(Long value) {
            addCriterion("late_fee_verify_user_id <>", value, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdGreaterThan(Long value) {
            addCriterion("late_fee_verify_user_id >", value, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("late_fee_verify_user_id >=", value, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdLessThan(Long value) {
            addCriterion("late_fee_verify_user_id <", value, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdLessThanOrEqualTo(Long value) {
            addCriterion("late_fee_verify_user_id <=", value, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdIn(List<Long> values) {
            addCriterion("late_fee_verify_user_id in", values, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdNotIn(List<Long> values) {
            addCriterion("late_fee_verify_user_id not in", values, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdBetween(Long value1, Long value2) {
            addCriterion("late_fee_verify_user_id between", value1, value2, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserIdNotBetween(Long value1, Long value2) {
            addCriterion("late_fee_verify_user_id not between", value1, value2, "lateFeeVerifyUserId");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameIsNull() {
            addCriterion("late_fee_verify_user_name is null");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameIsNotNull() {
            addCriterion("late_fee_verify_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameEqualTo(String value) {
            addCriterion("late_fee_verify_user_name =", value, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameNotEqualTo(String value) {
            addCriterion("late_fee_verify_user_name <>", value, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameGreaterThan(String value) {
            addCriterion("late_fee_verify_user_name >", value, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("late_fee_verify_user_name >=", value, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameLessThan(String value) {
            addCriterion("late_fee_verify_user_name <", value, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameLessThanOrEqualTo(String value) {
            addCriterion("late_fee_verify_user_name <=", value, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameLike(String value) {
            addCriterion("late_fee_verify_user_name like", value, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameNotLike(String value) {
            addCriterion("late_fee_verify_user_name not like", value, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameIn(List<String> values) {
            addCriterion("late_fee_verify_user_name in", values, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameNotIn(List<String> values) {
            addCriterion("late_fee_verify_user_name not in", values, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameBetween(String value1, String value2) {
            addCriterion("late_fee_verify_user_name between", value1, value2, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameNotBetween(String value1, String value2) {
            addCriterion("late_fee_verify_user_name not between", value1, value2, "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeIsNull() {
            addCriterion("late_fee_verify_time is null");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeIsNotNull() {
            addCriterion("late_fee_verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeEqualTo(Date value) {
            addCriterion("late_fee_verify_time =", value, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeNotEqualTo(Date value) {
            addCriterion("late_fee_verify_time <>", value, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeGreaterThan(Date value) {
            addCriterion("late_fee_verify_time >", value, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("late_fee_verify_time >=", value, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeLessThan(Date value) {
            addCriterion("late_fee_verify_time <", value, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("late_fee_verify_time <=", value, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeIn(List<Date> values) {
            addCriterion("late_fee_verify_time in", values, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeNotIn(List<Date> values) {
            addCriterion("late_fee_verify_time not in", values, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("late_fee_verify_time between", value1, value2, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("late_fee_verify_time not between", value1, value2, "lateFeeVerifyTime");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbIsNull() {
            addCriterion("premium_rate_with_zb is null");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbIsNotNull() {
            addCriterion("premium_rate_with_zb is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbEqualTo(Float value) {
            addCriterion("premium_rate_with_zb =", value, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbNotEqualTo(Float value) {
            addCriterion("premium_rate_with_zb <>", value, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbGreaterThan(Float value) {
            addCriterion("premium_rate_with_zb >", value, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbGreaterThanOrEqualTo(Float value) {
            addCriterion("premium_rate_with_zb >=", value, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbLessThan(Float value) {
            addCriterion("premium_rate_with_zb <", value, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbLessThanOrEqualTo(Float value) {
            addCriterion("premium_rate_with_zb <=", value, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbIn(List<Float> values) {
            addCriterion("premium_rate_with_zb in", values, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbNotIn(List<Float> values) {
            addCriterion("premium_rate_with_zb not in", values, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbBetween(Float value1, Float value2) {
            addCriterion("premium_rate_with_zb between", value1, value2, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andPremiumRateWithZbNotBetween(Float value1, Float value2) {
            addCriterion("premium_rate_with_zb not between", value1, value2, "premiumRateWithZb");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusIsNull() {
            addCriterion("zb_with_site_month_balance_status is null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusIsNotNull() {
            addCriterion("zb_with_site_month_balance_status is not null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusEqualTo(Integer value) {
            addCriterion("zb_with_site_month_balance_status =", value, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusNotEqualTo(Integer value) {
            addCriterion("zb_with_site_month_balance_status <>", value, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusGreaterThan(Integer value) {
            addCriterion("zb_with_site_month_balance_status >", value, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_with_site_month_balance_status >=", value, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusLessThan(Integer value) {
            addCriterion("zb_with_site_month_balance_status <", value, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("zb_with_site_month_balance_status <=", value, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusIn(List<Integer> values) {
            addCriterion("zb_with_site_month_balance_status in", values, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusNotIn(List<Integer> values) {
            addCriterion("zb_with_site_month_balance_status not in", values, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusBetween(Integer value1, Integer value2) {
            addCriterion("zb_with_site_month_balance_status between", value1, value2, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_with_site_month_balance_status not between", value1, value2, "zbWithSiteMonthBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdIsNull() {
            addCriterion("zb_with_site_month_balance_user_id is null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdIsNotNull() {
            addCriterion("zb_with_site_month_balance_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdEqualTo(Long value) {
            addCriterion("zb_with_site_month_balance_user_id =", value, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdNotEqualTo(Long value) {
            addCriterion("zb_with_site_month_balance_user_id <>", value, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdGreaterThan(Long value) {
            addCriterion("zb_with_site_month_balance_user_id >", value, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("zb_with_site_month_balance_user_id >=", value, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdLessThan(Long value) {
            addCriterion("zb_with_site_month_balance_user_id <", value, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdLessThanOrEqualTo(Long value) {
            addCriterion("zb_with_site_month_balance_user_id <=", value, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdIn(List<Long> values) {
            addCriterion("zb_with_site_month_balance_user_id in", values, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdNotIn(List<Long> values) {
            addCriterion("zb_with_site_month_balance_user_id not in", values, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdBetween(Long value1, Long value2) {
            addCriterion("zb_with_site_month_balance_user_id between", value1, value2, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserIdNotBetween(Long value1, Long value2) {
            addCriterion("zb_with_site_month_balance_user_id not between", value1, value2, "zbWithSiteMonthBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameIsNull() {
            addCriterion("zb_with_site_month_balance_user_name is null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameIsNotNull() {
            addCriterion("zb_with_site_month_balance_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameEqualTo(String value) {
            addCriterion("zb_with_site_month_balance_user_name =", value, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameNotEqualTo(String value) {
            addCriterion("zb_with_site_month_balance_user_name <>", value, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameGreaterThan(String value) {
            addCriterion("zb_with_site_month_balance_user_name >", value, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_with_site_month_balance_user_name >=", value, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameLessThan(String value) {
            addCriterion("zb_with_site_month_balance_user_name <", value, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameLessThanOrEqualTo(String value) {
            addCriterion("zb_with_site_month_balance_user_name <=", value, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameLike(String value) {
            addCriterion("zb_with_site_month_balance_user_name like", value, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameNotLike(String value) {
            addCriterion("zb_with_site_month_balance_user_name not like", value, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameIn(List<String> values) {
            addCriterion("zb_with_site_month_balance_user_name in", values, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameNotIn(List<String> values) {
            addCriterion("zb_with_site_month_balance_user_name not in", values, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameBetween(String value1, String value2) {
            addCriterion("zb_with_site_month_balance_user_name between", value1, value2, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameNotBetween(String value1, String value2) {
            addCriterion("zb_with_site_month_balance_user_name not between", value1, value2, "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeIsNull() {
            addCriterion("zb_with_site_month_balance_time is null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeIsNotNull() {
            addCriterion("zb_with_site_month_balance_time is not null");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeEqualTo(Date value) {
            addCriterion("zb_with_site_month_balance_time =", value, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeNotEqualTo(Date value) {
            addCriterion("zb_with_site_month_balance_time <>", value, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeGreaterThan(Date value) {
            addCriterion("zb_with_site_month_balance_time >", value, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zb_with_site_month_balance_time >=", value, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeLessThan(Date value) {
            addCriterion("zb_with_site_month_balance_time <", value, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("zb_with_site_month_balance_time <=", value, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeIn(List<Date> values) {
            addCriterion("zb_with_site_month_balance_time in", values, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeNotIn(List<Date> values) {
            addCriterion("zb_with_site_month_balance_time not in", values, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeBetween(Date value1, Date value2) {
            addCriterion("zb_with_site_month_balance_time between", value1, value2, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("zb_with_site_month_balance_time not between", value1, value2, "zbWithSiteMonthBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusIsNull() {
            addCriterion("receive_timeout_balance_status is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusIsNotNull() {
            addCriterion("receive_timeout_balance_status is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusEqualTo(Integer value) {
            addCriterion("receive_timeout_balance_status =", value, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusNotEqualTo(Integer value) {
            addCriterion("receive_timeout_balance_status <>", value, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusGreaterThan(Integer value) {
            addCriterion("receive_timeout_balance_status >", value, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_timeout_balance_status >=", value, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusLessThan(Integer value) {
            addCriterion("receive_timeout_balance_status <", value, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("receive_timeout_balance_status <=", value, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusIn(List<Integer> values) {
            addCriterion("receive_timeout_balance_status in", values, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusNotIn(List<Integer> values) {
            addCriterion("receive_timeout_balance_status not in", values, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusBetween(Integer value1, Integer value2) {
            addCriterion("receive_timeout_balance_status between", value1, value2, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_timeout_balance_status not between", value1, value2, "receiveTimeoutBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdIsNull() {
            addCriterion("receive_timeout_balance_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdIsNotNull() {
            addCriterion("receive_timeout_balance_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdEqualTo(Long value) {
            addCriterion("receive_timeout_balance_user_id =", value, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdNotEqualTo(Long value) {
            addCriterion("receive_timeout_balance_user_id <>", value, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdGreaterThan(Long value) {
            addCriterion("receive_timeout_balance_user_id >", value, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_timeout_balance_user_id >=", value, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdLessThan(Long value) {
            addCriterion("receive_timeout_balance_user_id <", value, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdLessThanOrEqualTo(Long value) {
            addCriterion("receive_timeout_balance_user_id <=", value, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdIn(List<Long> values) {
            addCriterion("receive_timeout_balance_user_id in", values, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdNotIn(List<Long> values) {
            addCriterion("receive_timeout_balance_user_id not in", values, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdBetween(Long value1, Long value2) {
            addCriterion("receive_timeout_balance_user_id between", value1, value2, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserIdNotBetween(Long value1, Long value2) {
            addCriterion("receive_timeout_balance_user_id not between", value1, value2, "receiveTimeoutBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameIsNull() {
            addCriterion("receive_timeout_balance_user_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameIsNotNull() {
            addCriterion("receive_timeout_balance_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameEqualTo(String value) {
            addCriterion("receive_timeout_balance_user_name =", value, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameNotEqualTo(String value) {
            addCriterion("receive_timeout_balance_user_name <>", value, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameGreaterThan(String value) {
            addCriterion("receive_timeout_balance_user_name >", value, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_timeout_balance_user_name >=", value, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameLessThan(String value) {
            addCriterion("receive_timeout_balance_user_name <", value, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameLessThanOrEqualTo(String value) {
            addCriterion("receive_timeout_balance_user_name <=", value, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameLike(String value) {
            addCriterion("receive_timeout_balance_user_name like", value, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameNotLike(String value) {
            addCriterion("receive_timeout_balance_user_name not like", value, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameIn(List<String> values) {
            addCriterion("receive_timeout_balance_user_name in", values, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameNotIn(List<String> values) {
            addCriterion("receive_timeout_balance_user_name not in", values, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameBetween(String value1, String value2) {
            addCriterion("receive_timeout_balance_user_name between", value1, value2, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameNotBetween(String value1, String value2) {
            addCriterion("receive_timeout_balance_user_name not between", value1, value2, "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeIsNull() {
            addCriterion("receive_timeout_balance_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeIsNotNull() {
            addCriterion("receive_timeout_balance_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeEqualTo(Date value) {
            addCriterion("receive_timeout_balance_time =", value, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeNotEqualTo(Date value) {
            addCriterion("receive_timeout_balance_time <>", value, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeGreaterThan(Date value) {
            addCriterion("receive_timeout_balance_time >", value, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_timeout_balance_time >=", value, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeLessThan(Date value) {
            addCriterion("receive_timeout_balance_time <", value, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_timeout_balance_time <=", value, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeIn(List<Date> values) {
            addCriterion("receive_timeout_balance_time in", values, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeNotIn(List<Date> values) {
            addCriterion("receive_timeout_balance_time not in", values, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeBetween(Date value1, Date value2) {
            addCriterion("receive_timeout_balance_time between", value1, value2, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_timeout_balance_time not between", value1, value2, "receiveTimeoutBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusIsNull() {
            addCriterion("damager_fee_balance_status is null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusIsNotNull() {
            addCriterion("damager_fee_balance_status is not null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusEqualTo(Integer value) {
            addCriterion("damager_fee_balance_status =", value, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusNotEqualTo(Integer value) {
            addCriterion("damager_fee_balance_status <>", value, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusGreaterThan(Integer value) {
            addCriterion("damager_fee_balance_status >", value, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("damager_fee_balance_status >=", value, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusLessThan(Integer value) {
            addCriterion("damager_fee_balance_status <", value, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("damager_fee_balance_status <=", value, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusIn(List<Integer> values) {
            addCriterion("damager_fee_balance_status in", values, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusNotIn(List<Integer> values) {
            addCriterion("damager_fee_balance_status not in", values, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusBetween(Integer value1, Integer value2) {
            addCriterion("damager_fee_balance_status between", value1, value2, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("damager_fee_balance_status not between", value1, value2, "damagerFeeBalanceStatus");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdIsNull() {
            addCriterion("damager_fee_balance_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdIsNotNull() {
            addCriterion("damager_fee_balance_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdEqualTo(Long value) {
            addCriterion("damager_fee_balance_user_id =", value, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdNotEqualTo(Long value) {
            addCriterion("damager_fee_balance_user_id <>", value, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdGreaterThan(Long value) {
            addCriterion("damager_fee_balance_user_id >", value, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("damager_fee_balance_user_id >=", value, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdLessThan(Long value) {
            addCriterion("damager_fee_balance_user_id <", value, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdLessThanOrEqualTo(Long value) {
            addCriterion("damager_fee_balance_user_id <=", value, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdIn(List<Long> values) {
            addCriterion("damager_fee_balance_user_id in", values, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdNotIn(List<Long> values) {
            addCriterion("damager_fee_balance_user_id not in", values, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdBetween(Long value1, Long value2) {
            addCriterion("damager_fee_balance_user_id between", value1, value2, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserIdNotBetween(Long value1, Long value2) {
            addCriterion("damager_fee_balance_user_id not between", value1, value2, "damagerFeeBalanceUserId");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameIsNull() {
            addCriterion("damager_fee_balance_user_name is null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameIsNotNull() {
            addCriterion("damager_fee_balance_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameEqualTo(String value) {
            addCriterion("damager_fee_balance_user_name =", value, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameNotEqualTo(String value) {
            addCriterion("damager_fee_balance_user_name <>", value, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameGreaterThan(String value) {
            addCriterion("damager_fee_balance_user_name >", value, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("damager_fee_balance_user_name >=", value, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameLessThan(String value) {
            addCriterion("damager_fee_balance_user_name <", value, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameLessThanOrEqualTo(String value) {
            addCriterion("damager_fee_balance_user_name <=", value, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameLike(String value) {
            addCriterion("damager_fee_balance_user_name like", value, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameNotLike(String value) {
            addCriterion("damager_fee_balance_user_name not like", value, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameIn(List<String> values) {
            addCriterion("damager_fee_balance_user_name in", values, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameNotIn(List<String> values) {
            addCriterion("damager_fee_balance_user_name not in", values, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameBetween(String value1, String value2) {
            addCriterion("damager_fee_balance_user_name between", value1, value2, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameNotBetween(String value1, String value2) {
            addCriterion("damager_fee_balance_user_name not between", value1, value2, "damagerFeeBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeIsNull() {
            addCriterion("damager_fee_balance_time is null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeIsNotNull() {
            addCriterion("damager_fee_balance_time is not null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeEqualTo(Date value) {
            addCriterion("damager_fee_balance_time =", value, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeNotEqualTo(Date value) {
            addCriterion("damager_fee_balance_time <>", value, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeGreaterThan(Date value) {
            addCriterion("damager_fee_balance_time >", value, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("damager_fee_balance_time >=", value, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeLessThan(Date value) {
            addCriterion("damager_fee_balance_time <", value, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("damager_fee_balance_time <=", value, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeIn(List<Date> values) {
            addCriterion("damager_fee_balance_time in", values, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeNotIn(List<Date> values) {
            addCriterion("damager_fee_balance_time not in", values, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeBetween(Date value1, Date value2) {
            addCriterion("damager_fee_balance_time between", value1, value2, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("damager_fee_balance_time not between", value1, value2, "damagerFeeBalanceTime");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumIsNull() {
            addCriterion("change_fee_sum is null");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumIsNotNull() {
            addCriterion("change_fee_sum is not null");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumEqualTo(BigDecimal value) {
            addCriterion("change_fee_sum =", value, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumNotEqualTo(BigDecimal value) {
            addCriterion("change_fee_sum <>", value, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumGreaterThan(BigDecimal value) {
            addCriterion("change_fee_sum >", value, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_fee_sum >=", value, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumLessThan(BigDecimal value) {
            addCriterion("change_fee_sum <", value, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_fee_sum <=", value, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumIn(List<BigDecimal> values) {
            addCriterion("change_fee_sum in", values, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumNotIn(List<BigDecimal> values) {
            addCriterion("change_fee_sum not in", values, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_fee_sum between", value1, value2, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andChangeFeeSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_fee_sum not between", value1, value2, "changeFeeSum");
            return (Criteria) this;
        }

        public Criteria andFreightFeeVerifiUserNameLikeInsensitive(String value) {
            addCriterion("upper(freight_fee_verifi_user_name) like", value.toUpperCase(), "freightFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andFreightFeeOverUserNameLikeInsensitive(String value) {
            addCriterion("upper(freight_fee_over_user_name) like", value.toUpperCase(), "freightFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeVerifiUserNameLikeInsensitive(String value) {
            addCriterion("upper(business_fee_verifi_user_name) like", value.toUpperCase(), "businessFeeVerifiUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentUserNameLikeInsensitive(String value) {
            addCriterion("upper(business_payment_user_name) like", value.toUpperCase(), "businessPaymentUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessFeeOverUserNameLikeInsensitive(String value) {
            addCriterion("upper(business_fee_over_user_name) like", value.toUpperCase(), "businessFeeOverUserName");
            return (Criteria) this;
        }

        public Criteria andZbReceiptVerifyUserNameLikeInsensitive(String value) {
            addCriterion("upper(zb_receipt_verify_user_name) like", value.toUpperCase(), "zbReceiptVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteBalanceUserNameLikeInsensitive(String value) {
            addCriterion("upper(zb_with_site_balance_user_name) like", value.toUpperCase(), "zbWithSiteBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andLateFeeVerifyUserNameLikeInsensitive(String value) {
            addCriterion("upper(late_fee_verify_user_name) like", value.toUpperCase(), "lateFeeVerifyUserName");
            return (Criteria) this;
        }

        public Criteria andZbWithSiteMonthBalanceUserNameLikeInsensitive(String value) {
            addCriterion("upper(zb_with_site_month_balance_user_name) like", value.toUpperCase(), "zbWithSiteMonthBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutBalanceUserNameLikeInsensitive(String value) {
            addCriterion("upper(receive_timeout_balance_user_name) like", value.toUpperCase(), "receiveTimeoutBalanceUserName");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBalanceUserNameLikeInsensitive(String value) {
            addCriterion("upper(damager_fee_balance_user_name) like", value.toUpperCase(), "damagerFeeBalanceUserName");
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