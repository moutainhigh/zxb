package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TLspWaybillReceiveAndCourierCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLspWaybillReceiveAndCourierCriteria() {
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

        public Criteria andCouriernumberIsNull() {
            addCriterion("courierNumber is null");
            return (Criteria) this;
        }

        public Criteria andCouriernumberIsNotNull() {
            addCriterion("courierNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCouriernumberEqualTo(String value) {
            addCriterion("courierNumber =", value, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberNotEqualTo(String value) {
            addCriterion("courierNumber <>", value, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberGreaterThan(String value) {
            addCriterion("courierNumber >", value, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberGreaterThanOrEqualTo(String value) {
            addCriterion("courierNumber >=", value, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberLessThan(String value) {
            addCriterion("courierNumber <", value, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberLessThanOrEqualTo(String value) {
            addCriterion("courierNumber <=", value, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberLike(String value) {
            addCriterion("courierNumber like", value, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberNotLike(String value) {
            addCriterion("courierNumber not like", value, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberIn(List<String> values) {
            addCriterion("courierNumber in", values, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberNotIn(List<String> values) {
            addCriterion("courierNumber not in", values, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberBetween(String value1, String value2) {
            addCriterion("courierNumber between", value1, value2, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernumberNotBetween(String value1, String value2) {
            addCriterion("courierNumber not between", value1, value2, "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernameIsNull() {
            addCriterion("courierName is null");
            return (Criteria) this;
        }

        public Criteria andCouriernameIsNotNull() {
            addCriterion("courierName is not null");
            return (Criteria) this;
        }

        public Criteria andCouriernameEqualTo(String value) {
            addCriterion("courierName =", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameNotEqualTo(String value) {
            addCriterion("courierName <>", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameGreaterThan(String value) {
            addCriterion("courierName >", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameGreaterThanOrEqualTo(String value) {
            addCriterion("courierName >=", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameLessThan(String value) {
            addCriterion("courierName <", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameLessThanOrEqualTo(String value) {
            addCriterion("courierName <=", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameLike(String value) {
            addCriterion("courierName like", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameNotLike(String value) {
            addCriterion("courierName not like", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameIn(List<String> values) {
            addCriterion("courierName in", values, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameNotIn(List<String> values) {
            addCriterion("courierName not in", values, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameBetween(String value1, String value2) {
            addCriterion("courierName between", value1, value2, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameNotBetween(String value1, String value2) {
            addCriterion("courierName not between", value1, value2, "couriername");
            return (Criteria) this;
        }

        public Criteria andCourierfeeIsNull() {
            addCriterion("courierFee is null");
            return (Criteria) this;
        }

        public Criteria andCourierfeeIsNotNull() {
            addCriterion("courierFee is not null");
            return (Criteria) this;
        }

        public Criteria andCourierfeeEqualTo(BigDecimal value) {
            addCriterion("courierFee =", value, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeNotEqualTo(BigDecimal value) {
            addCriterion("courierFee <>", value, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeGreaterThan(BigDecimal value) {
            addCriterion("courierFee >", value, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("courierFee >=", value, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeLessThan(BigDecimal value) {
            addCriterion("courierFee <", value, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("courierFee <=", value, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeIn(List<BigDecimal> values) {
            addCriterion("courierFee in", values, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeNotIn(List<BigDecimal> values) {
            addCriterion("courierFee not in", values, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("courierFee between", value1, value2, "courierfee");
            return (Criteria) this;
        }

        public Criteria andCourierfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("courierFee not between", value1, value2, "courierfee");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdIsNull() {
            addCriterion("allot_center_id is null");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdIsNotNull() {
            addCriterion("allot_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdEqualTo(Long value) {
            addCriterion("allot_center_id =", value, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdNotEqualTo(Long value) {
            addCriterion("allot_center_id <>", value, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdGreaterThan(Long value) {
            addCriterion("allot_center_id >", value, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("allot_center_id >=", value, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdLessThan(Long value) {
            addCriterion("allot_center_id <", value, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("allot_center_id <=", value, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdIn(List<Long> values) {
            addCriterion("allot_center_id in", values, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdNotIn(List<Long> values) {
            addCriterion("allot_center_id not in", values, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdBetween(Long value1, Long value2) {
            addCriterion("allot_center_id between", value1, value2, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("allot_center_id not between", value1, value2, "allotCenterId");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameIsNull() {
            addCriterion("allot_center_name is null");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameIsNotNull() {
            addCriterion("allot_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameEqualTo(String value) {
            addCriterion("allot_center_name =", value, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameNotEqualTo(String value) {
            addCriterion("allot_center_name <>", value, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameGreaterThan(String value) {
            addCriterion("allot_center_name >", value, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("allot_center_name >=", value, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameLessThan(String value) {
            addCriterion("allot_center_name <", value, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameLessThanOrEqualTo(String value) {
            addCriterion("allot_center_name <=", value, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameLike(String value) {
            addCriterion("allot_center_name like", value, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameNotLike(String value) {
            addCriterion("allot_center_name not like", value, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameIn(List<String> values) {
            addCriterion("allot_center_name in", values, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameNotIn(List<String> values) {
            addCriterion("allot_center_name not in", values, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameBetween(String value1, String value2) {
            addCriterion("allot_center_name between", value1, value2, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameNotBetween(String value1, String value2) {
            addCriterion("allot_center_name not between", value1, value2, "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("create_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("create_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("create_user_name =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("create_user_name <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("create_user_name >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_name >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("create_user_name <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("create_user_name <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("create_user_name like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("create_user_name not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("create_user_name in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("create_user_name not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("create_user_name between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("create_user_name not between", value1, value2, "createUserName");
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

        public Criteria andCouriernumberLikeInsensitive(String value) {
            addCriterion("upper(courierNumber) like", value.toUpperCase(), "couriernumber");
            return (Criteria) this;
        }

        public Criteria andCouriernameLikeInsensitive(String value) {
            addCriterion("upper(courierName) like", value.toUpperCase(), "couriername");
            return (Criteria) this;
        }

        public Criteria andAllotCenterNameLikeInsensitive(String value) {
            addCriterion("upper(allot_center_name) like", value.toUpperCase(), "allotCenterName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLikeInsensitive(String value) {
            addCriterion("upper(create_user_name) like", value.toUpperCase(), "createUserName");
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