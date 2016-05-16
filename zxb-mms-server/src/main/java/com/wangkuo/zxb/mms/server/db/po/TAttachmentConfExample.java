package com.wangkuo.zxb.mms.server.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.util.ArrayList;
import java.util.List;

public class TAttachmentConfExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAttachmentConfExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeIsNull() {
            addCriterion("max_file_size is null");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeIsNotNull() {
            addCriterion("max_file_size is not null");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeEqualTo(Long value) {
            addCriterion("max_file_size =", value, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeNotEqualTo(Long value) {
            addCriterion("max_file_size <>", value, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeGreaterThan(Long value) {
            addCriterion("max_file_size >", value, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("max_file_size >=", value, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeLessThan(Long value) {
            addCriterion("max_file_size <", value, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeLessThanOrEqualTo(Long value) {
            addCriterion("max_file_size <=", value, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeIn(List<Long> values) {
            addCriterion("max_file_size in", values, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeNotIn(List<Long> values) {
            addCriterion("max_file_size not in", values, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeBetween(Long value1, Long value2) {
            addCriterion("max_file_size between", value1, value2, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andMaxFileSizeNotBetween(Long value1, Long value2) {
            addCriterion("max_file_size not between", value1, value2, "maxFileSize");
            return (Criteria) this;
        }

        public Criteria andValidFileExtIsNull() {
            addCriterion("valid_file_ext is null");
            return (Criteria) this;
        }

        public Criteria andValidFileExtIsNotNull() {
            addCriterion("valid_file_ext is not null");
            return (Criteria) this;
        }

        public Criteria andValidFileExtEqualTo(String value) {
            addCriterion("valid_file_ext =", value, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtNotEqualTo(String value) {
            addCriterion("valid_file_ext <>", value, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtGreaterThan(String value) {
            addCriterion("valid_file_ext >", value, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtGreaterThanOrEqualTo(String value) {
            addCriterion("valid_file_ext >=", value, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtLessThan(String value) {
            addCriterion("valid_file_ext <", value, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtLessThanOrEqualTo(String value) {
            addCriterion("valid_file_ext <=", value, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtLike(String value) {
            addCriterion("valid_file_ext like", value, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtNotLike(String value) {
            addCriterion("valid_file_ext not like", value, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtIn(List<String> values) {
            addCriterion("valid_file_ext in", values, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtNotIn(List<String> values) {
            addCriterion("valid_file_ext not in", values, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtBetween(String value1, String value2) {
            addCriterion("valid_file_ext between", value1, value2, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andValidFileExtNotBetween(String value1, String value2) {
            addCriterion("valid_file_ext not between", value1, value2, "validFileExt");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumIsNull() {
            addCriterion("max_file_num is null");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumIsNotNull() {
            addCriterion("max_file_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumEqualTo(Integer value) {
            addCriterion("max_file_num =", value, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumNotEqualTo(Integer value) {
            addCriterion("max_file_num <>", value, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumGreaterThan(Integer value) {
            addCriterion("max_file_num >", value, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_file_num >=", value, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumLessThan(Integer value) {
            addCriterion("max_file_num <", value, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumLessThanOrEqualTo(Integer value) {
            addCriterion("max_file_num <=", value, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumIn(List<Integer> values) {
            addCriterion("max_file_num in", values, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumNotIn(List<Integer> values) {
            addCriterion("max_file_num not in", values, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumBetween(Integer value1, Integer value2) {
            addCriterion("max_file_num between", value1, value2, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andMaxFileNumNotBetween(Integer value1, Integer value2) {
            addCriterion("max_file_num not between", value1, value2, "maxFileNum");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andValidFileExtLikeInsensitive(String value) {
            addCriterion("upper(valid_file_ext) like", value.toUpperCase(), "validFileExt");
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