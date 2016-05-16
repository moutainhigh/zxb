package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbWaybillDepotCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillDepotCriteria() {
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

        public Criteria andDepotIdIsNull() {
            addCriterion("depot_id is null");
            return (Criteria) this;
        }

        public Criteria andDepotIdIsNotNull() {
            addCriterion("depot_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepotIdEqualTo(Long value) {
            addCriterion("depot_id =", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotEqualTo(Long value) {
            addCriterion("depot_id <>", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThan(Long value) {
            addCriterion("depot_id >", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThanOrEqualTo(Long value) {
            addCriterion("depot_id >=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThan(Long value) {
            addCriterion("depot_id <", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThanOrEqualTo(Long value) {
            addCriterion("depot_id <=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdIn(List<Long> values) {
            addCriterion("depot_id in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotIn(List<Long> values) {
            addCriterion("depot_id not in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdBetween(Long value1, Long value2) {
            addCriterion("depot_id between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotBetween(Long value1, Long value2) {
            addCriterion("depot_id not between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotNameIsNull() {
            addCriterion("depot_name is null");
            return (Criteria) this;
        }

        public Criteria andDepotNameIsNotNull() {
            addCriterion("depot_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepotNameEqualTo(String value) {
            addCriterion("depot_name =", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameNotEqualTo(String value) {
            addCriterion("depot_name <>", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameGreaterThan(String value) {
            addCriterion("depot_name >", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameGreaterThanOrEqualTo(String value) {
            addCriterion("depot_name >=", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameLessThan(String value) {
            addCriterion("depot_name <", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameLessThanOrEqualTo(String value) {
            addCriterion("depot_name <=", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameLike(String value) {
            addCriterion("depot_name like", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameNotLike(String value) {
            addCriterion("depot_name not like", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameIn(List<String> values) {
            addCriterion("depot_name in", values, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameNotIn(List<String> values) {
            addCriterion("depot_name not in", values, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameBetween(String value1, String value2) {
            addCriterion("depot_name between", value1, value2, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameNotBetween(String value1, String value2) {
            addCriterion("depot_name not between", value1, value2, "depotName");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNull() {
            addCriterion("enter_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNotNull() {
            addCriterion("enter_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeEqualTo(Date value) {
            addCriterion("enter_time =", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotEqualTo(Date value) {
            addCriterion("enter_time <>", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThan(Date value) {
            addCriterion("enter_time >", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_time >=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThan(Date value) {
            addCriterion("enter_time <", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThanOrEqualTo(Date value) {
            addCriterion("enter_time <=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIn(List<Date> values) {
            addCriterion("enter_time in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotIn(List<Date> values) {
            addCriterion("enter_time not in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeBetween(Date value1, Date value2) {
            addCriterion("enter_time between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotBetween(Date value1, Date value2) {
            addCriterion("enter_time not between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterSnIsNull() {
            addCriterion("enter_sn is null");
            return (Criteria) this;
        }

        public Criteria andEnterSnIsNotNull() {
            addCriterion("enter_sn is not null");
            return (Criteria) this;
        }

        public Criteria andEnterSnEqualTo(String value) {
            addCriterion("enter_sn =", value, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnNotEqualTo(String value) {
            addCriterion("enter_sn <>", value, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnGreaterThan(String value) {
            addCriterion("enter_sn >", value, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnGreaterThanOrEqualTo(String value) {
            addCriterion("enter_sn >=", value, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnLessThan(String value) {
            addCriterion("enter_sn <", value, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnLessThanOrEqualTo(String value) {
            addCriterion("enter_sn <=", value, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnLike(String value) {
            addCriterion("enter_sn like", value, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnNotLike(String value) {
            addCriterion("enter_sn not like", value, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnIn(List<String> values) {
            addCriterion("enter_sn in", values, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnNotIn(List<String> values) {
            addCriterion("enter_sn not in", values, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnBetween(String value1, String value2) {
            addCriterion("enter_sn between", value1, value2, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterSnNotBetween(String value1, String value2) {
            addCriterion("enter_sn not between", value1, value2, "enterSn");
            return (Criteria) this;
        }

        public Criteria andEnterFeeIsNull() {
            addCriterion("enter_fee is null");
            return (Criteria) this;
        }

        public Criteria andEnterFeeIsNotNull() {
            addCriterion("enter_fee is not null");
            return (Criteria) this;
        }

        public Criteria andEnterFeeEqualTo(BigDecimal value) {
            addCriterion("enter_fee =", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotEqualTo(BigDecimal value) {
            addCriterion("enter_fee <>", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeGreaterThan(BigDecimal value) {
            addCriterion("enter_fee >", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enter_fee >=", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeLessThan(BigDecimal value) {
            addCriterion("enter_fee <", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enter_fee <=", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeIn(List<BigDecimal> values) {
            addCriterion("enter_fee in", values, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotIn(List<BigDecimal> values) {
            addCriterion("enter_fee not in", values, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enter_fee between", value1, value2, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enter_fee not between", value1, value2, "enterFee");
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

        public Criteria andDepotNameLikeInsensitive(String value) {
            addCriterion("upper(depot_name) like", value.toUpperCase(), "depotName");
            return (Criteria) this;
        }

        public Criteria andEnterSnLikeInsensitive(String value) {
            addCriterion("upper(enter_sn) like", value.toUpperCase(), "enterSn");
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