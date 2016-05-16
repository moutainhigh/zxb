package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.util.ArrayList;
import java.util.List;

public class TSbStowageBillGoodsLabelCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected String groupByClause;
    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbStowageBillGoodsLabelCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getGroupByClause() {
        return groupByClause;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
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

        public Criteria andStowageBillIdIsNull() {
            addCriterion("stowage_bill_id is null");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdIsNotNull() {
            addCriterion("stowage_bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdEqualTo(Long value) {
            addCriterion("stowage_bill_id =", value, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdNotEqualTo(Long value) {
            addCriterion("stowage_bill_id <>", value, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdGreaterThan(Long value) {
            addCriterion("stowage_bill_id >", value, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stowage_bill_id >=", value, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdLessThan(Long value) {
            addCriterion("stowage_bill_id <", value, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdLessThanOrEqualTo(Long value) {
            addCriterion("stowage_bill_id <=", value, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdIn(List<Long> values) {
            addCriterion("stowage_bill_id in", values, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdNotIn(List<Long> values) {
            addCriterion("stowage_bill_id not in", values, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdBetween(Long value1, Long value2) {
            addCriterion("stowage_bill_id between", value1, value2, "stowageBillId");
            return (Criteria) this;
        }

        public Criteria andStowageBillIdNotBetween(Long value1, Long value2) {
            addCriterion("stowage_bill_id not between", value1, value2, "stowageBillId");
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

        public Criteria andWaybillGoodsLabelIdIsNull() {
            addCriterion("waybill_goods_label_id is null");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdIsNotNull() {
            addCriterion("waybill_goods_label_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdEqualTo(Long value) {
            addCriterion("waybill_goods_label_id =", value, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdNotEqualTo(Long value) {
            addCriterion("waybill_goods_label_id <>", value, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdGreaterThan(Long value) {
            addCriterion("waybill_goods_label_id >", value, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("waybill_goods_label_id >=", value, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdLessThan(Long value) {
            addCriterion("waybill_goods_label_id <", value, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdLessThanOrEqualTo(Long value) {
            addCriterion("waybill_goods_label_id <=", value, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdIn(List<Long> values) {
            addCriterion("waybill_goods_label_id in", values, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdNotIn(List<Long> values) {
            addCriterion("waybill_goods_label_id not in", values, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdBetween(Long value1, Long value2) {
            addCriterion("waybill_goods_label_id between", value1, value2, "waybillGoodsLabelId");
            return (Criteria) this;
        }

        public Criteria andWaybillGoodsLabelIdNotBetween(Long value1, Long value2) {
            addCriterion("waybill_goods_label_id not between", value1, value2, "waybillGoodsLabelId");
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