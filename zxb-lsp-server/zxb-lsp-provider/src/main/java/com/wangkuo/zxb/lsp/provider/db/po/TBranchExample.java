package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBranchExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBranchExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
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

        public Criteria andCreateEmployeeIdIsNull() {
            addCriterion("create_employee_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdIsNotNull() {
            addCriterion("create_employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdEqualTo(Long value) {
            addCriterion("create_employee_id =", value, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdNotEqualTo(Long value) {
            addCriterion("create_employee_id <>", value, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdGreaterThan(Long value) {
            addCriterion("create_employee_id >", value, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_employee_id >=", value, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdLessThan(Long value) {
            addCriterion("create_employee_id <", value, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("create_employee_id <=", value, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdIn(List<Long> values) {
            addCriterion("create_employee_id in", values, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdNotIn(List<Long> values) {
            addCriterion("create_employee_id not in", values, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("create_employee_id between", value1, value2, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("create_employee_id not between", value1, value2, "createEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameIsNull() {
            addCriterion("create_employee_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameIsNotNull() {
            addCriterion("create_employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameEqualTo(String value) {
            addCriterion("create_employee_name =", value, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameNotEqualTo(String value) {
            addCriterion("create_employee_name <>", value, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameGreaterThan(String value) {
            addCriterion("create_employee_name >", value, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_employee_name >=", value, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameLessThan(String value) {
            addCriterion("create_employee_name <", value, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("create_employee_name <=", value, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameLike(String value) {
            addCriterion("create_employee_name like", value, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameNotLike(String value) {
            addCriterion("create_employee_name not like", value, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameIn(List<String> values) {
            addCriterion("create_employee_name in", values, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameNotIn(List<String> values) {
            addCriterion("create_employee_name not in", values, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameBetween(String value1, String value2) {
            addCriterion("create_employee_name between", value1, value2, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("create_employee_name not between", value1, value2, "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdIsNull() {
            addCriterion("update_employee_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdIsNotNull() {
            addCriterion("update_employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdEqualTo(Long value) {
            addCriterion("update_employee_id =", value, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdNotEqualTo(Long value) {
            addCriterion("update_employee_id <>", value, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdGreaterThan(Long value) {
            addCriterion("update_employee_id >", value, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_employee_id >=", value, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdLessThan(Long value) {
            addCriterion("update_employee_id <", value, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("update_employee_id <=", value, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdIn(List<Long> values) {
            addCriterion("update_employee_id in", values, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdNotIn(List<Long> values) {
            addCriterion("update_employee_id not in", values, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("update_employee_id between", value1, value2, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("update_employee_id not between", value1, value2, "updateEmployeeId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameIsNull() {
            addCriterion("update_employee_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameIsNotNull() {
            addCriterion("update_employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameEqualTo(String value) {
            addCriterion("update_employee_name =", value, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameNotEqualTo(String value) {
            addCriterion("update_employee_name <>", value, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameGreaterThan(String value) {
            addCriterion("update_employee_name >", value, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_employee_name >=", value, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameLessThan(String value) {
            addCriterion("update_employee_name <", value, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("update_employee_name <=", value, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameLike(String value) {
            addCriterion("update_employee_name like", value, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameNotLike(String value) {
            addCriterion("update_employee_name not like", value, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameIn(List<String> values) {
            addCriterion("update_employee_name in", values, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameNotIn(List<String> values) {
            addCriterion("update_employee_name not in", values, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameBetween(String value1, String value2) {
            addCriterion("update_employee_name between", value1, value2, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("update_employee_name not between", value1, value2, "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(Long value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(Long value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(Long value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(Long value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(Long value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<Long> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<Long> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(Long value1, Long value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(Long value1, Long value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andRouteMemoIsNull() {
            addCriterion("route_memo is null");
            return (Criteria) this;
        }

        public Criteria andRouteMemoIsNotNull() {
            addCriterion("route_memo is not null");
            return (Criteria) this;
        }

        public Criteria andRouteMemoEqualTo(String value) {
            addCriterion("route_memo =", value, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoNotEqualTo(String value) {
            addCriterion("route_memo <>", value, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoGreaterThan(String value) {
            addCriterion("route_memo >", value, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoGreaterThanOrEqualTo(String value) {
            addCriterion("route_memo >=", value, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoLessThan(String value) {
            addCriterion("route_memo <", value, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoLessThanOrEqualTo(String value) {
            addCriterion("route_memo <=", value, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoLike(String value) {
            addCriterion("route_memo like", value, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoNotLike(String value) {
            addCriterion("route_memo not like", value, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoIn(List<String> values) {
            addCriterion("route_memo in", values, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoNotIn(List<String> values) {
            addCriterion("route_memo not in", values, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoBetween(String value1, String value2) {
            addCriterion("route_memo between", value1, value2, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andRouteMemoNotBetween(String value1, String value2) {
            addCriterion("route_memo not between", value1, value2, "routeMemo");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateIsNull() {
            addCriterion("insurance_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateIsNotNull() {
            addCriterion("insurance_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateEqualTo(BigDecimal value) {
            addCriterion("insurance_fee_rate =", value, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateNotEqualTo(BigDecimal value) {
            addCriterion("insurance_fee_rate <>", value, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateGreaterThan(BigDecimal value) {
            addCriterion("insurance_fee_rate >", value, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_fee_rate >=", value, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateLessThan(BigDecimal value) {
            addCriterion("insurance_fee_rate <", value, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_fee_rate <=", value, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateIn(List<BigDecimal> values) {
            addCriterion("insurance_fee_rate in", values, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateNotIn(List<BigDecimal> values) {
            addCriterion("insurance_fee_rate not in", values, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_fee_rate between", value1, value2, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_fee_rate not between", value1, value2, "insuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIsNull() {
            addCriterion("insurance_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIsNotNull() {
            addCriterion("insurance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeEqualTo(BigDecimal value) {
            addCriterion("insurance_fee =", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotEqualTo(BigDecimal value) {
            addCriterion("insurance_fee <>", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeGreaterThan(BigDecimal value) {
            addCriterion("insurance_fee >", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_fee >=", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeLessThan(BigDecimal value) {
            addCriterion("insurance_fee <", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_fee <=", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIn(List<BigDecimal> values) {
            addCriterion("insurance_fee in", values, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotIn(List<BigDecimal> values) {
            addCriterion("insurance_fee not in", values, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_fee between", value1, value2, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_fee not between", value1, value2, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andBlameIsNull() {
            addCriterion("blame is null");
            return (Criteria) this;
        }

        public Criteria andBlameIsNotNull() {
            addCriterion("blame is not null");
            return (Criteria) this;
        }

        public Criteria andBlameEqualTo(String value) {
            addCriterion("blame =", value, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameNotEqualTo(String value) {
            addCriterion("blame <>", value, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameGreaterThan(String value) {
            addCriterion("blame >", value, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameGreaterThanOrEqualTo(String value) {
            addCriterion("blame >=", value, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameLessThan(String value) {
            addCriterion("blame <", value, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameLessThanOrEqualTo(String value) {
            addCriterion("blame <=", value, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameLike(String value) {
            addCriterion("blame like", value, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameNotLike(String value) {
            addCriterion("blame not like", value, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameIn(List<String> values) {
            addCriterion("blame in", values, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameNotIn(List<String> values) {
            addCriterion("blame not in", values, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameBetween(String value1, String value2) {
            addCriterion("blame between", value1, value2, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameNotBetween(String value1, String value2) {
            addCriterion("blame not between", value1, value2, "blame");
            return (Criteria) this;
        }

        public Criteria andBlameMobileIsNull() {
            addCriterion("blame_mobile is null");
            return (Criteria) this;
        }

        public Criteria andBlameMobileIsNotNull() {
            addCriterion("blame_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andBlameMobileEqualTo(String value) {
            addCriterion("blame_mobile =", value, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileNotEqualTo(String value) {
            addCriterion("blame_mobile <>", value, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileGreaterThan(String value) {
            addCriterion("blame_mobile >", value, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileGreaterThanOrEqualTo(String value) {
            addCriterion("blame_mobile >=", value, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileLessThan(String value) {
            addCriterion("blame_mobile <", value, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileLessThanOrEqualTo(String value) {
            addCriterion("blame_mobile <=", value, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileLike(String value) {
            addCriterion("blame_mobile like", value, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileNotLike(String value) {
            addCriterion("blame_mobile not like", value, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileIn(List<String> values) {
            addCriterion("blame_mobile in", values, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileNotIn(List<String> values) {
            addCriterion("blame_mobile not in", values, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileBetween(String value1, String value2) {
            addCriterion("blame_mobile between", value1, value2, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andBlameMobileNotBetween(String value1, String value2) {
            addCriterion("blame_mobile not between", value1, value2, "blameMobile");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("system_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("system_id =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("system_id <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("system_id >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("system_id >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("system_id <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("system_id <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("system_id like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("system_id not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("system_id in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("system_id not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("system_id between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("system_id not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIsNull() {
            addCriterion("branch_code is null");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIsNotNull() {
            addCriterion("branch_code is not null");
            return (Criteria) this;
        }

        public Criteria andBranchCodeEqualTo(String value) {
            addCriterion("branch_code =", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotEqualTo(String value) {
            addCriterion("branch_code <>", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeGreaterThan(String value) {
            addCriterion("branch_code >", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("branch_code >=", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLessThan(String value) {
            addCriterion("branch_code <", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("branch_code <=", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLike(String value) {
            addCriterion("branch_code like", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotLike(String value) {
            addCriterion("branch_code not like", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIn(List<String> values) {
            addCriterion("branch_code in", values, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotIn(List<String> values) {
            addCriterion("branch_code not in", values, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeBetween(String value1, String value2) {
            addCriterion("branch_code between", value1, value2, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotBetween(String value1, String value2) {
            addCriterion("branch_code not between", value1, value2, "branchCode");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andDimensionsIsNull() {
            addCriterion("dimensions is null");
            return (Criteria) this;
        }

        public Criteria andDimensionsIsNotNull() {
            addCriterion("dimensions is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionsEqualTo(Double value) {
            addCriterion("dimensions =", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotEqualTo(Double value) {
            addCriterion("dimensions <>", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsGreaterThan(Double value) {
            addCriterion("dimensions >", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsGreaterThanOrEqualTo(Double value) {
            addCriterion("dimensions >=", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLessThan(Double value) {
            addCriterion("dimensions <", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLessThanOrEqualTo(Double value) {
            addCriterion("dimensions <=", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsIn(List<Double> values) {
            addCriterion("dimensions in", values, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotIn(List<Double> values) {
            addCriterion("dimensions not in", values, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsBetween(Double value1, Double value2) {
            addCriterion("dimensions between", value1, value2, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotBetween(Double value1, Double value2) {
            addCriterion("dimensions not between", value1, value2, "dimensions");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Boolean value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Boolean value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Boolean value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Boolean value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Boolean> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Boolean> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(create_employee_name) like", value.toUpperCase(), "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andUpdateEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(update_employee_name) like", value.toUpperCase(), "updateEmployeeName");
            return (Criteria) this;
        }

        public Criteria andProvinceLikeInsensitive(String value) {
            addCriterion("upper(province) like", value.toUpperCase(), "province");
            return (Criteria) this;
        }

        public Criteria andCityLikeInsensitive(String value) {
            addCriterion("upper(city) like", value.toUpperCase(), "city");
            return (Criteria) this;
        }

        public Criteria andCountyLikeInsensitive(String value) {
            addCriterion("upper(county) like", value.toUpperCase(), "county");
            return (Criteria) this;
        }

        public Criteria andRouteMemoLikeInsensitive(String value) {
            addCriterion("upper(route_memo) like", value.toUpperCase(), "routeMemo");
            return (Criteria) this;
        }

        public Criteria andBlameLikeInsensitive(String value) {
            addCriterion("upper(blame) like", value.toUpperCase(), "blame");
            return (Criteria) this;
        }

        public Criteria andBlameMobileLikeInsensitive(String value) {
            addCriterion("upper(blame_mobile) like", value.toUpperCase(), "blameMobile");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andSystemIdLikeInsensitive(String value) {
            addCriterion("upper(system_id) like", value.toUpperCase(), "systemId");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLikeInsensitive(String value) {
            addCriterion("upper(branch_code) like", value.toUpperCase(), "branchCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLikeInsensitive(String value) {
            addCriterion("upper(company_name) like", value.toUpperCase(), "companyName");
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