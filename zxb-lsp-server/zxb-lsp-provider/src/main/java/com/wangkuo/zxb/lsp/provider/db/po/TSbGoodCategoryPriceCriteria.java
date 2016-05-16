package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSbGoodCategoryPriceCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbGoodCategoryPriceCriteria() {
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

        public Criteria andGoodCategoryAllotIdIsNull() {
            addCriterion("good_category_allot_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdIsNotNull() {
            addCriterion("good_category_allot_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdEqualTo(Long value) {
            addCriterion("good_category_allot_id =", value, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdNotEqualTo(Long value) {
            addCriterion("good_category_allot_id <>", value, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdGreaterThan(Long value) {
            addCriterion("good_category_allot_id >", value, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_category_allot_id >=", value, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdLessThan(Long value) {
            addCriterion("good_category_allot_id <", value, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdLessThanOrEqualTo(Long value) {
            addCriterion("good_category_allot_id <=", value, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdIn(List<Long> values) {
            addCriterion("good_category_allot_id in", values, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdNotIn(List<Long> values) {
            addCriterion("good_category_allot_id not in", values, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdBetween(Long value1, Long value2) {
            addCriterion("good_category_allot_id between", value1, value2, "goodCategoryAllotId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryAllotIdNotBetween(Long value1, Long value2) {
            addCriterion("good_category_allot_id not between", value1, value2, "goodCategoryAllotId");
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

        public Criteria andFloatRateCityIsNull() {
            addCriterion("float_rate_city is null");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityIsNotNull() {
            addCriterion("float_rate_city is not null");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityEqualTo(Float value) {
            addCriterion("float_rate_city =", value, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityNotEqualTo(Float value) {
            addCriterion("float_rate_city <>", value, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityGreaterThan(Float value) {
            addCriterion("float_rate_city >", value, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityGreaterThanOrEqualTo(Float value) {
            addCriterion("float_rate_city >=", value, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityLessThan(Float value) {
            addCriterion("float_rate_city <", value, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityLessThanOrEqualTo(Float value) {
            addCriterion("float_rate_city <=", value, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityIn(List<Float> values) {
            addCriterion("float_rate_city in", values, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityNotIn(List<Float> values) {
            addCriterion("float_rate_city not in", values, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityBetween(Float value1, Float value2) {
            addCriterion("float_rate_city between", value1, value2, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCityNotBetween(Float value1, Float value2) {
            addCriterion("float_rate_city not between", value1, value2, "floatRateCity");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryIsNull() {
            addCriterion("float_rate_country is null");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryIsNotNull() {
            addCriterion("float_rate_country is not null");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryEqualTo(Float value) {
            addCriterion("float_rate_country =", value, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryNotEqualTo(Float value) {
            addCriterion("float_rate_country <>", value, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryGreaterThan(Float value) {
            addCriterion("float_rate_country >", value, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryGreaterThanOrEqualTo(Float value) {
            addCriterion("float_rate_country >=", value, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryLessThan(Float value) {
            addCriterion("float_rate_country <", value, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryLessThanOrEqualTo(Float value) {
            addCriterion("float_rate_country <=", value, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryIn(List<Float> values) {
            addCriterion("float_rate_country in", values, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryNotIn(List<Float> values) {
            addCriterion("float_rate_country not in", values, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryBetween(Float value1, Float value2) {
            addCriterion("float_rate_country between", value1, value2, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatRateCountryNotBetween(Float value1, Float value2) {
            addCriterion("float_rate_country not between", value1, value2, "floatRateCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityIsNull() {
            addCriterion("float_fixed_city is null");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityIsNotNull() {
            addCriterion("float_fixed_city is not null");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityEqualTo(BigDecimal value) {
            addCriterion("float_fixed_city =", value, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityNotEqualTo(BigDecimal value) {
            addCriterion("float_fixed_city <>", value, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityGreaterThan(BigDecimal value) {
            addCriterion("float_fixed_city >", value, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("float_fixed_city >=", value, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityLessThan(BigDecimal value) {
            addCriterion("float_fixed_city <", value, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("float_fixed_city <=", value, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityIn(List<BigDecimal> values) {
            addCriterion("float_fixed_city in", values, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityNotIn(List<BigDecimal> values) {
            addCriterion("float_fixed_city not in", values, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("float_fixed_city between", value1, value2, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("float_fixed_city not between", value1, value2, "floatFixedCity");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryIsNull() {
            addCriterion("float_fixed_country is null");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryIsNotNull() {
            addCriterion("float_fixed_country is not null");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryEqualTo(BigDecimal value) {
            addCriterion("float_fixed_country =", value, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryNotEqualTo(BigDecimal value) {
            addCriterion("float_fixed_country <>", value, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryGreaterThan(BigDecimal value) {
            addCriterion("float_fixed_country >", value, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("float_fixed_country >=", value, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryLessThan(BigDecimal value) {
            addCriterion("float_fixed_country <", value, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("float_fixed_country <=", value, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryIn(List<BigDecimal> values) {
            addCriterion("float_fixed_country in", values, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryNotIn(List<BigDecimal> values) {
            addCriterion("float_fixed_country not in", values, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("float_fixed_country between", value1, value2, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatFixedCountryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("float_fixed_country not between", value1, value2, "floatFixedCountry");
            return (Criteria) this;
        }

        public Criteria andFloatTypeIsNull() {
            addCriterion("float_type is null");
            return (Criteria) this;
        }

        public Criteria andFloatTypeIsNotNull() {
            addCriterion("float_type is not null");
            return (Criteria) this;
        }

        public Criteria andFloatTypeEqualTo(Integer value) {
            addCriterion("float_type =", value, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeNotEqualTo(Integer value) {
            addCriterion("float_type <>", value, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeGreaterThan(Integer value) {
            addCriterion("float_type >", value, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("float_type >=", value, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeLessThan(Integer value) {
            addCriterion("float_type <", value, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("float_type <=", value, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeIn(List<Integer> values) {
            addCriterion("float_type in", values, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeNotIn(List<Integer> values) {
            addCriterion("float_type not in", values, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeBetween(Integer value1, Integer value2) {
            addCriterion("float_type between", value1, value2, "floatType");
            return (Criteria) this;
        }

        public Criteria andFloatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("float_type not between", value1, value2, "floatType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeIsNull() {
            addCriterion("piece_type is null");
            return (Criteria) this;
        }

        public Criteria andPieceTypeIsNotNull() {
            addCriterion("piece_type is not null");
            return (Criteria) this;
        }

        public Criteria andPieceTypeEqualTo(Integer value) {
            addCriterion("piece_type =", value, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeNotEqualTo(Integer value) {
            addCriterion("piece_type <>", value, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeGreaterThan(Integer value) {
            addCriterion("piece_type >", value, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("piece_type >=", value, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeLessThan(Integer value) {
            addCriterion("piece_type <", value, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("piece_type <=", value, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeIn(List<Integer> values) {
            addCriterion("piece_type in", values, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeNotIn(List<Integer> values) {
            addCriterion("piece_type not in", values, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeBetween(Integer value1, Integer value2) {
            addCriterion("piece_type between", value1, value2, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("piece_type not between", value1, value2, "pieceType");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityIsNull() {
            addCriterion("piece_site_to_site_fee_city is null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityIsNotNull() {
            addCriterion("piece_site_to_site_fee_city is not null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_city =", value, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityNotEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_city <>", value, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityGreaterThan(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_city >", value, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_city >=", value, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityLessThan(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_city <", value, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_city <=", value, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_site_fee_city in", values, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityNotIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_site_fee_city not in", values, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_site_fee_city between", value1, value2, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_site_fee_city not between", value1, value2, "pieceSiteToSiteFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityIsNull() {
            addCriterion("piece_site_to_site_send_good_fee_city is null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityIsNotNull() {
            addCriterion("piece_site_to_site_send_good_fee_city is not null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_city =", value, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityNotEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_city <>", value, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityGreaterThan(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_city >", value, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_city >=", value, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityLessThan(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_city <", value, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_city <=", value, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_site_send_good_fee_city in", values, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityNotIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_site_send_good_fee_city not in", values, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_site_send_good_fee_city between", value1, value2, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_site_send_good_fee_city not between", value1, value2, "pieceSiteToSiteSendGoodFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityIsNull() {
            addCriterion("piece_site_to_door_fee_city is null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityIsNotNull() {
            addCriterion("piece_site_to_door_fee_city is not null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_city =", value, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityNotEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_city <>", value, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityGreaterThan(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_city >", value, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_city >=", value, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityLessThan(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_city <", value, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_city <=", value, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_door_fee_city in", values, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityNotIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_door_fee_city not in", values, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_door_fee_city between", value1, value2, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_door_fee_city not between", value1, value2, "pieceSiteToDoorFeeCity");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryIsNull() {
            addCriterion("piece_site_to_site_fee_country is null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryIsNotNull() {
            addCriterion("piece_site_to_site_fee_country is not null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_country =", value, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryNotEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_country <>", value, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryGreaterThan(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_country >", value, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_country >=", value, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryLessThan(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_country <", value, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_fee_country <=", value, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_site_fee_country in", values, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryNotIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_site_fee_country not in", values, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_site_fee_country between", value1, value2, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteFeeCountryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_site_fee_country not between", value1, value2, "pieceSiteToSiteFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryIsNull() {
            addCriterion("piece_site_to_site_send_good_fee_country is null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryIsNotNull() {
            addCriterion("piece_site_to_site_send_good_fee_country is not null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_country =", value, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryNotEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_country <>", value, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryGreaterThan(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_country >", value, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_country >=", value, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryLessThan(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_country <", value, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_site_send_good_fee_country <=", value, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_site_send_good_fee_country in", values, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryNotIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_site_send_good_fee_country not in", values, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_site_send_good_fee_country between", value1, value2, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToSiteSendGoodFeeCountryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_site_send_good_fee_country not between", value1, value2, "pieceSiteToSiteSendGoodFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryIsNull() {
            addCriterion("piece_site_to_door_fee_country is null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryIsNotNull() {
            addCriterion("piece_site_to_door_fee_country is not null");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_country =", value, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryNotEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_country <>", value, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryGreaterThan(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_country >", value, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_country >=", value, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryLessThan(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_country <", value, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("piece_site_to_door_fee_country <=", value, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_door_fee_country in", values, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryNotIn(List<BigDecimal> values) {
            addCriterion("piece_site_to_door_fee_country not in", values, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_door_fee_country between", value1, value2, "pieceSiteToDoorFeeCountry");
            return (Criteria) this;
        }

        public Criteria andPieceSiteToDoorFeeCountryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piece_site_to_door_fee_country not between", value1, value2, "pieceSiteToDoorFeeCountry");
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