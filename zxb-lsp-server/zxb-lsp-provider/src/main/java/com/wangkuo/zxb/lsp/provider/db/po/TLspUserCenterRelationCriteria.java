package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.util.ArrayList;
import java.util.List;

public class TLspUserCenterRelationCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLspUserCenterRelationCriteria() {
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

        public Criteria andCenterIdIsNull() {
            addCriterion("center_id is null");
            return (Criteria) this;
        }

        public Criteria andCenterIdIsNotNull() {
            addCriterion("center_id is not null");
            return (Criteria) this;
        }

        public Criteria andCenterIdEqualTo(Long value) {
            addCriterion("center_id =", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotEqualTo(Long value) {
            addCriterion("center_id <>", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdGreaterThan(Long value) {
            addCriterion("center_id >", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("center_id >=", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdLessThan(Long value) {
            addCriterion("center_id <", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("center_id <=", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdIn(List<Long> values) {
            addCriterion("center_id in", values, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotIn(List<Long> values) {
            addCriterion("center_id not in", values, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdBetween(Long value1, Long value2) {
            addCriterion("center_id between", value1, value2, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("center_id not between", value1, value2, "centerId");
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

        public Criteria andAllocCenterNameIsNull() {
            addCriterion("alloc_center_name is null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameIsNotNull() {
            addCriterion("alloc_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameEqualTo(String value) {
            addCriterion("alloc_center_name =", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameNotEqualTo(String value) {
            addCriterion("alloc_center_name <>", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameGreaterThan(String value) {
            addCriterion("alloc_center_name >", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("alloc_center_name >=", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLessThan(String value) {
            addCriterion("alloc_center_name <", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLessThanOrEqualTo(String value) {
            addCriterion("alloc_center_name <=", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLike(String value) {
            addCriterion("alloc_center_name like", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameNotLike(String value) {
            addCriterion("alloc_center_name not like", value, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameIn(List<String> values) {
            addCriterion("alloc_center_name in", values, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameNotIn(List<String> values) {
            addCriterion("alloc_center_name not in", values, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameBetween(String value1, String value2) {
            addCriterion("alloc_center_name between", value1, value2, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameNotBetween(String value1, String value2) {
            addCriterion("alloc_center_name not between", value1, value2, "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andLspUserNameLikeInsensitive(String value) {
            addCriterion("upper(lsp_user_name) like", value.toUpperCase(), "lspUserName");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLikeInsensitive(String value) {
            addCriterion("upper(alloc_center_name) like", value.toUpperCase(), "allocCenterName");
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