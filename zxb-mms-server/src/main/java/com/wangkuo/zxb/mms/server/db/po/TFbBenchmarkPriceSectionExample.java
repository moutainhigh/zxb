package com.wangkuo.zxb.mms.server.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TFbBenchmarkPriceSectionExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFbBenchmarkPriceSectionExample() {
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

        public Criteria andPriceIdIsNull() {
            addCriterion("price_id is null");
            return (Criteria) this;
        }

        public Criteria andPriceIdIsNotNull() {
            addCriterion("price_id is not null");
            return (Criteria) this;
        }

        public Criteria andPriceIdEqualTo(Long value) {
            addCriterion("price_id =", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdNotEqualTo(Long value) {
            addCriterion("price_id <>", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdGreaterThan(Long value) {
            addCriterion("price_id >", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("price_id >=", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdLessThan(Long value) {
            addCriterion("price_id <", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdLessThanOrEqualTo(Long value) {
            addCriterion("price_id <=", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdIn(List<Long> values) {
            addCriterion("price_id in", values, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdNotIn(List<Long> values) {
            addCriterion("price_id not in", values, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdBetween(Long value1, Long value2) {
            addCriterion("price_id between", value1, value2, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdNotBetween(Long value1, Long value2) {
            addCriterion("price_id not between", value1, value2, "priceId");
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

        public Criteria andStartSecIsNull() {
            addCriterion("start_sec is null");
            return (Criteria) this;
        }

        public Criteria andStartSecIsNotNull() {
            addCriterion("start_sec is not null");
            return (Criteria) this;
        }

        public Criteria andStartSecEqualTo(Float value) {
            addCriterion("start_sec =", value, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecNotEqualTo(Float value) {
            addCriterion("start_sec <>", value, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecGreaterThan(Float value) {
            addCriterion("start_sec >", value, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecGreaterThanOrEqualTo(Float value) {
            addCriterion("start_sec >=", value, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecLessThan(Float value) {
            addCriterion("start_sec <", value, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecLessThanOrEqualTo(Float value) {
            addCriterion("start_sec <=", value, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecIn(List<Float> values) {
            addCriterion("start_sec in", values, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecNotIn(List<Float> values) {
            addCriterion("start_sec not in", values, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecBetween(Float value1, Float value2) {
            addCriterion("start_sec between", value1, value2, "startSec");
            return (Criteria) this;
        }

        public Criteria andStartSecNotBetween(Float value1, Float value2) {
            addCriterion("start_sec not between", value1, value2, "startSec");
            return (Criteria) this;
        }

        public Criteria andEndSecIsNull() {
            addCriterion("end_sec is null");
            return (Criteria) this;
        }

        public Criteria andEndSecIsNotNull() {
            addCriterion("end_sec is not null");
            return (Criteria) this;
        }

        public Criteria andEndSecEqualTo(Float value) {
            addCriterion("end_sec =", value, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecNotEqualTo(Float value) {
            addCriterion("end_sec <>", value, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecGreaterThan(Float value) {
            addCriterion("end_sec >", value, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecGreaterThanOrEqualTo(Float value) {
            addCriterion("end_sec >=", value, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecLessThan(Float value) {
            addCriterion("end_sec <", value, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecLessThanOrEqualTo(Float value) {
            addCriterion("end_sec <=", value, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecIn(List<Float> values) {
            addCriterion("end_sec in", values, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecNotIn(List<Float> values) {
            addCriterion("end_sec not in", values, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecBetween(Float value1, Float value2) {
            addCriterion("end_sec between", value1, value2, "endSec");
            return (Criteria) this;
        }

        public Criteria andEndSecNotBetween(Float value1, Float value2) {
            addCriterion("end_sec not between", value1, value2, "endSec");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
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