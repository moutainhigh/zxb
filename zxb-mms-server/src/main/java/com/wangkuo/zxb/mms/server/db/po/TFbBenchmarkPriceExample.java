package com.wangkuo.zxb.mms.server.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TFbBenchmarkPriceExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFbBenchmarkPriceExample() {
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

        public Criteria andAllocCenterIdIsNull() {
            addCriterion("alloc_center_id is null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdIsNotNull() {
            addCriterion("alloc_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdEqualTo(Long value) {
            addCriterion("alloc_center_id =", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdNotEqualTo(Long value) {
            addCriterion("alloc_center_id <>", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdGreaterThan(Long value) {
            addCriterion("alloc_center_id >", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("alloc_center_id >=", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdLessThan(Long value) {
            addCriterion("alloc_center_id <", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("alloc_center_id <=", value, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdIn(List<Long> values) {
            addCriterion("alloc_center_id in", values, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdNotIn(List<Long> values) {
            addCriterion("alloc_center_id not in", values, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdBetween(Long value1, Long value2) {
            addCriterion("alloc_center_id between", value1, value2, "allocCenterId");
            return (Criteria) this;
        }

        public Criteria andAllocCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("alloc_center_id not between", value1, value2, "allocCenterId");
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

        public Criteria andEndProvinceIdIsNull() {
            addCriterion("end_province_id is null");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdIsNotNull() {
            addCriterion("end_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdEqualTo(Long value) {
            addCriterion("end_province_id =", value, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdNotEqualTo(Long value) {
            addCriterion("end_province_id <>", value, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdGreaterThan(Long value) {
            addCriterion("end_province_id >", value, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("end_province_id >=", value, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdLessThan(Long value) {
            addCriterion("end_province_id <", value, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("end_province_id <=", value, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdIn(List<Long> values) {
            addCriterion("end_province_id in", values, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdNotIn(List<Long> values) {
            addCriterion("end_province_id not in", values, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdBetween(Long value1, Long value2) {
            addCriterion("end_province_id between", value1, value2, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("end_province_id not between", value1, value2, "endProvinceId");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameIsNull() {
            addCriterion("end_province_name is null");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameIsNotNull() {
            addCriterion("end_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameEqualTo(String value) {
            addCriterion("end_province_name =", value, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameNotEqualTo(String value) {
            addCriterion("end_province_name <>", value, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameGreaterThan(String value) {
            addCriterion("end_province_name >", value, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("end_province_name >=", value, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameLessThan(String value) {
            addCriterion("end_province_name <", value, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("end_province_name <=", value, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameLike(String value) {
            addCriterion("end_province_name like", value, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameNotLike(String value) {
            addCriterion("end_province_name not like", value, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameIn(List<String> values) {
            addCriterion("end_province_name in", values, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameNotIn(List<String> values) {
            addCriterion("end_province_name not in", values, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameBetween(String value1, String value2) {
            addCriterion("end_province_name between", value1, value2, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameNotBetween(String value1, String value2) {
            addCriterion("end_province_name not between", value1, value2, "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndCityIdIsNull() {
            addCriterion("end_city_id is null");
            return (Criteria) this;
        }

        public Criteria andEndCityIdIsNotNull() {
            addCriterion("end_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andEndCityIdEqualTo(Long value) {
            addCriterion("end_city_id =", value, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdNotEqualTo(Long value) {
            addCriterion("end_city_id <>", value, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdGreaterThan(Long value) {
            addCriterion("end_city_id >", value, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("end_city_id >=", value, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdLessThan(Long value) {
            addCriterion("end_city_id <", value, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdLessThanOrEqualTo(Long value) {
            addCriterion("end_city_id <=", value, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdIn(List<Long> values) {
            addCriterion("end_city_id in", values, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdNotIn(List<Long> values) {
            addCriterion("end_city_id not in", values, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdBetween(Long value1, Long value2) {
            addCriterion("end_city_id between", value1, value2, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityIdNotBetween(Long value1, Long value2) {
            addCriterion("end_city_id not between", value1, value2, "endCityId");
            return (Criteria) this;
        }

        public Criteria andEndCityNameIsNull() {
            addCriterion("end_city_name is null");
            return (Criteria) this;
        }

        public Criteria andEndCityNameIsNotNull() {
            addCriterion("end_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andEndCityNameEqualTo(String value) {
            addCriterion("end_city_name =", value, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameNotEqualTo(String value) {
            addCriterion("end_city_name <>", value, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameGreaterThan(String value) {
            addCriterion("end_city_name >", value, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("end_city_name >=", value, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameLessThan(String value) {
            addCriterion("end_city_name <", value, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameLessThanOrEqualTo(String value) {
            addCriterion("end_city_name <=", value, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameLike(String value) {
            addCriterion("end_city_name like", value, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameNotLike(String value) {
            addCriterion("end_city_name not like", value, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameIn(List<String> values) {
            addCriterion("end_city_name in", values, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameNotIn(List<String> values) {
            addCriterion("end_city_name not in", values, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameBetween(String value1, String value2) {
            addCriterion("end_city_name between", value1, value2, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameNotBetween(String value1, String value2) {
            addCriterion("end_city_name not between", value1, value2, "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdIsNull() {
            addCriterion("end_country_id is null");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdIsNotNull() {
            addCriterion("end_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdEqualTo(Long value) {
            addCriterion("end_country_id =", value, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdNotEqualTo(Long value) {
            addCriterion("end_country_id <>", value, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdGreaterThan(Long value) {
            addCriterion("end_country_id >", value, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("end_country_id >=", value, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdLessThan(Long value) {
            addCriterion("end_country_id <", value, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("end_country_id <=", value, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdIn(List<Long> values) {
            addCriterion("end_country_id in", values, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdNotIn(List<Long> values) {
            addCriterion("end_country_id not in", values, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdBetween(Long value1, Long value2) {
            addCriterion("end_country_id between", value1, value2, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("end_country_id not between", value1, value2, "endCountryId");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameIsNull() {
            addCriterion("end_country_name is null");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameIsNotNull() {
            addCriterion("end_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameEqualTo(String value) {
            addCriterion("end_country_name =", value, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameNotEqualTo(String value) {
            addCriterion("end_country_name <>", value, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameGreaterThan(String value) {
            addCriterion("end_country_name >", value, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("end_country_name >=", value, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameLessThan(String value) {
            addCriterion("end_country_name <", value, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameLessThanOrEqualTo(String value) {
            addCriterion("end_country_name <=", value, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameLike(String value) {
            addCriterion("end_country_name like", value, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameNotLike(String value) {
            addCriterion("end_country_name not like", value, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameIn(List<String> values) {
            addCriterion("end_country_name in", values, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameNotIn(List<String> values) {
            addCriterion("end_country_name not in", values, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameBetween(String value1, String value2) {
            addCriterion("end_country_name between", value1, value2, "endCountryName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameNotBetween(String value1, String value2) {
            addCriterion("end_country_name not between", value1, value2, "endCountryName");
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

        public Criteria andSendGoodFeeIsNull() {
            addCriterion("send_good_fee is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeIsNotNull() {
            addCriterion("send_good_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeEqualTo(BigDecimal value) {
            addCriterion("send_good_fee =", value, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeNotEqualTo(BigDecimal value) {
            addCriterion("send_good_fee <>", value, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeGreaterThan(BigDecimal value) {
            addCriterion("send_good_fee >", value, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee >=", value, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeLessThan(BigDecimal value) {
            addCriterion("send_good_fee <", value, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee <=", value, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeIn(List<BigDecimal> values) {
            addCriterion("send_good_fee in", values, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeNotIn(List<BigDecimal> values) {
            addCriterion("send_good_fee not in", values, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee between", value1, value2, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee not between", value1, value2, "sendGoodFee");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNull() {
            addCriterion("run_time is null");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNotNull() {
            addCriterion("run_time is not null");
            return (Criteria) this;
        }

        public Criteria andRunTimeEqualTo(Integer value) {
            addCriterion("run_time =", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotEqualTo(Integer value) {
            addCriterion("run_time <>", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThan(Integer value) {
            addCriterion("run_time >", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_time >=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThan(Integer value) {
            addCriterion("run_time <", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThanOrEqualTo(Integer value) {
            addCriterion("run_time <=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeIn(List<Integer> values) {
            addCriterion("run_time in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotIn(List<Integer> values) {
            addCriterion("run_time not in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeBetween(Integer value1, Integer value2) {
            addCriterion("run_time between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("run_time not between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andRansitNumIsNull() {
            addCriterion("ransit_num is null");
            return (Criteria) this;
        }

        public Criteria andRansitNumIsNotNull() {
            addCriterion("ransit_num is not null");
            return (Criteria) this;
        }

        public Criteria andRansitNumEqualTo(Integer value) {
            addCriterion("ransit_num =", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumNotEqualTo(Integer value) {
            addCriterion("ransit_num <>", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumGreaterThan(Integer value) {
            addCriterion("ransit_num >", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ransit_num >=", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumLessThan(Integer value) {
            addCriterion("ransit_num <", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumLessThanOrEqualTo(Integer value) {
            addCriterion("ransit_num <=", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumIn(List<Integer> values) {
            addCriterion("ransit_num in", values, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumNotIn(List<Integer> values) {
            addCriterion("ransit_num not in", values, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumBetween(Integer value1, Integer value2) {
            addCriterion("ransit_num between", value1, value2, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ransit_num not between", value1, value2, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceIsNull() {
            addCriterion("is_city_price is null");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceIsNotNull() {
            addCriterion("is_city_price is not null");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceEqualTo(Integer value) {
            addCriterion("is_city_price =", value, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceNotEqualTo(Integer value) {
            addCriterion("is_city_price <>", value, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceGreaterThan(Integer value) {
            addCriterion("is_city_price >", value, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_city_price >=", value, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceLessThan(Integer value) {
            addCriterion("is_city_price <", value, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceLessThanOrEqualTo(Integer value) {
            addCriterion("is_city_price <=", value, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceIn(List<Integer> values) {
            addCriterion("is_city_price in", values, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceNotIn(List<Integer> values) {
            addCriterion("is_city_price not in", values, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceBetween(Integer value1, Integer value2) {
            addCriterion("is_city_price between", value1, value2, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andIsCityPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_city_price not between", value1, value2, "isCityPrice");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1IsNull() {
            addCriterion("send_good_fee_section1 is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1IsNotNull() {
            addCriterion("send_good_fee_section1 is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1EqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section1 =", value, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1NotEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section1 <>", value, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1GreaterThan(BigDecimal value) {
            addCriterion("send_good_fee_section1 >", value, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section1 >=", value, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1LessThan(BigDecimal value) {
            addCriterion("send_good_fee_section1 <", value, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section1 <=", value, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1In(List<BigDecimal> values) {
            addCriterion("send_good_fee_section1 in", values, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1NotIn(List<BigDecimal> values) {
            addCriterion("send_good_fee_section1 not in", values, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_section1 between", value1, value2, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_section1 not between", value1, value2, "sendGoodFeeSection1");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2IsNull() {
            addCriterion("send_good_fee_section2 is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2IsNotNull() {
            addCriterion("send_good_fee_section2 is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2EqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section2 =", value, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2NotEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section2 <>", value, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2GreaterThan(BigDecimal value) {
            addCriterion("send_good_fee_section2 >", value, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section2 >=", value, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2LessThan(BigDecimal value) {
            addCriterion("send_good_fee_section2 <", value, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section2 <=", value, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2In(List<BigDecimal> values) {
            addCriterion("send_good_fee_section2 in", values, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2NotIn(List<BigDecimal> values) {
            addCriterion("send_good_fee_section2 not in", values, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_section2 between", value1, value2, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_section2 not between", value1, value2, "sendGoodFeeSection2");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3IsNull() {
            addCriterion("send_good_fee_section3 is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3IsNotNull() {
            addCriterion("send_good_fee_section3 is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3EqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section3 =", value, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3NotEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section3 <>", value, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3GreaterThan(BigDecimal value) {
            addCriterion("send_good_fee_section3 >", value, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section3 >=", value, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3LessThan(BigDecimal value) {
            addCriterion("send_good_fee_section3 <", value, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section3 <=", value, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3In(List<BigDecimal> values) {
            addCriterion("send_good_fee_section3 in", values, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3NotIn(List<BigDecimal> values) {
            addCriterion("send_good_fee_section3 not in", values, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_section3 between", value1, value2, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_section3 not between", value1, value2, "sendGoodFeeSection3");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4IsNull() {
            addCriterion("send_good_fee_section4 is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4IsNotNull() {
            addCriterion("send_good_fee_section4 is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4EqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section4 =", value, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4NotEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section4 <>", value, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4GreaterThan(BigDecimal value) {
            addCriterion("send_good_fee_section4 >", value, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section4 >=", value, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4LessThan(BigDecimal value) {
            addCriterion("send_good_fee_section4 <", value, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_section4 <=", value, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4In(List<BigDecimal> values) {
            addCriterion("send_good_fee_section4 in", values, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4NotIn(List<BigDecimal> values) {
            addCriterion("send_good_fee_section4 not in", values, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_section4 between", value1, value2, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeSection4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_section4 not between", value1, value2, "sendGoodFeeSection4");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLikeInsensitive(String value) {
            addCriterion("upper(alloc_center_name) like", value.toUpperCase(), "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andEndProvinceNameLikeInsensitive(String value) {
            addCriterion("upper(end_province_name) like", value.toUpperCase(), "endProvinceName");
            return (Criteria) this;
        }

        public Criteria andEndCityNameLikeInsensitive(String value) {
            addCriterion("upper(end_city_name) like", value.toUpperCase(), "endCityName");
            return (Criteria) this;
        }

        public Criteria andEndCountryNameLikeInsensitive(String value) {
            addCriterion("upper(end_country_name) like", value.toUpperCase(), "endCountryName");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(booker_employee_name) like", value.toUpperCase(), "bookerEmployeeName");
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