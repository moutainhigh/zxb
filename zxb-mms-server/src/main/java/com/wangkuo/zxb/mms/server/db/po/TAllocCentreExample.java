package com.wangkuo.zxb.mms.server.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAllocCentreExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAllocCentreExample() {
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

        public Criteria andLinknameIsNull() {
            addCriterion("linkname is null");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNotNull() {
            addCriterion("linkname is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameEqualTo(String value) {
            addCriterion("linkname =", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotEqualTo(String value) {
            addCriterion("linkname <>", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThan(String value) {
            addCriterion("linkname >", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("linkname >=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThan(String value) {
            addCriterion("linkname <", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThanOrEqualTo(String value) {
            addCriterion("linkname <=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLike(String value) {
            addCriterion("linkname like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotLike(String value) {
            addCriterion("linkname not like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameIn(List<String> values) {
            addCriterion("linkname in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotIn(List<String> values) {
            addCriterion("linkname not in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameBetween(String value1, String value2) {
            addCriterion("linkname between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotBetween(String value1, String value2) {
            addCriterion("linkname not between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNull() {
            addCriterion("linkman_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNotNull() {
            addCriterion("linkman_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneEqualTo(String value) {
            addCriterion("linkman_phone =", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotEqualTo(String value) {
            addCriterion("linkman_phone <>", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThan(String value) {
            addCriterion("linkman_phone >", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_phone >=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThan(String value) {
            addCriterion("linkman_phone <", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThanOrEqualTo(String value) {
            addCriterion("linkman_phone <=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLike(String value) {
            addCriterion("linkman_phone like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotLike(String value) {
            addCriterion("linkman_phone not like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIn(List<String> values) {
            addCriterion("linkman_phone in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotIn(List<String> values) {
            addCriterion("linkman_phone not in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneBetween(String value1, String value2) {
            addCriterion("linkman_phone between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotBetween(String value1, String value2) {
            addCriterion("linkman_phone not between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
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

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
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

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
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

        public Criteria andIsVerifySelPaymentApplyIsNull() {
            addCriterion("is__verify_sel_payment_apply is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyIsNotNull() {
            addCriterion("is__verify_sel_payment_apply is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyEqualTo(Integer value) {
            addCriterion("is__verify_sel_payment_apply =", value, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyNotEqualTo(Integer value) {
            addCriterion("is__verify_sel_payment_apply <>", value, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyGreaterThan(Integer value) {
            addCriterion("is__verify_sel_payment_apply >", value, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is__verify_sel_payment_apply >=", value, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyLessThan(Integer value) {
            addCriterion("is__verify_sel_payment_apply <", value, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyLessThanOrEqualTo(Integer value) {
            addCriterion("is__verify_sel_payment_apply <=", value, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyIn(List<Integer> values) {
            addCriterion("is__verify_sel_payment_apply in", values, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyNotIn(List<Integer> values) {
            addCriterion("is__verify_sel_payment_apply not in", values, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyBetween(Integer value1, Integer value2) {
            addCriterion("is__verify_sel_payment_apply between", value1, value2, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andIsVerifySelPaymentApplyNotBetween(Integer value1, Integer value2) {
            addCriterion("is__verify_sel_payment_apply not between", value1, value2, "isVerifySelPaymentApply");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceIsNull() {
            addCriterion("current_balance is null");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceIsNotNull() {
            addCriterion("current_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceEqualTo(BigDecimal value) {
            addCriterion("current_balance =", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceNotEqualTo(BigDecimal value) {
            addCriterion("current_balance <>", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceGreaterThan(BigDecimal value) {
            addCriterion("current_balance >", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_balance >=", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceLessThan(BigDecimal value) {
            addCriterion("current_balance <", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_balance <=", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceIn(List<BigDecimal> values) {
            addCriterion("current_balance in", values, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceNotIn(List<BigDecimal> values) {
            addCriterion("current_balance not in", values, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_balance between", value1, value2, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_balance not between", value1, value2, "currentBalance");
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

        public Criteria andDownIdIsNull() {
            addCriterion("down_id is null");
            return (Criteria) this;
        }

        public Criteria andDownIdIsNotNull() {
            addCriterion("down_id is not null");
            return (Criteria) this;
        }

        public Criteria andDownIdEqualTo(String value) {
            addCriterion("down_id =", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotEqualTo(String value) {
            addCriterion("down_id <>", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdGreaterThan(String value) {
            addCriterion("down_id >", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdGreaterThanOrEqualTo(String value) {
            addCriterion("down_id >=", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLessThan(String value) {
            addCriterion("down_id <", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLessThanOrEqualTo(String value) {
            addCriterion("down_id <=", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLike(String value) {
            addCriterion("down_id like", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotLike(String value) {
            addCriterion("down_id not like", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdIn(List<String> values) {
            addCriterion("down_id in", values, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotIn(List<String> values) {
            addCriterion("down_id not in", values, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdBetween(String value1, String value2) {
            addCriterion("down_id between", value1, value2, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotBetween(String value1, String value2) {
            addCriterion("down_id not between", value1, value2, "downId");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeIsNull() {
            addCriterion("latest_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeIsNotNull() {
            addCriterion("latest_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeEqualTo(Integer value) {
            addCriterion("latest_arrive_time =", value, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeNotEqualTo(Integer value) {
            addCriterion("latest_arrive_time <>", value, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeGreaterThan(Integer value) {
            addCriterion("latest_arrive_time >", value, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_arrive_time >=", value, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeLessThan(Integer value) {
            addCriterion("latest_arrive_time <", value, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("latest_arrive_time <=", value, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeIn(List<Integer> values) {
            addCriterion("latest_arrive_time in", values, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeNotIn(List<Integer> values) {
            addCriterion("latest_arrive_time not in", values, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeBetween(Integer value1, Integer value2) {
            addCriterion("latest_arrive_time between", value1, value2, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andLatestArriveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_arrive_time not between", value1, value2, "latestArriveTime");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayIsNull() {
            addCriterion("waybill_timeout_pay is null");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayIsNotNull() {
            addCriterion("waybill_timeout_pay is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayEqualTo(String value) {
            addCriterion("waybill_timeout_pay =", value, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayNotEqualTo(String value) {
            addCriterion("waybill_timeout_pay <>", value, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayGreaterThan(String value) {
            addCriterion("waybill_timeout_pay >", value, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_timeout_pay >=", value, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayLessThan(String value) {
            addCriterion("waybill_timeout_pay <", value, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayLessThanOrEqualTo(String value) {
            addCriterion("waybill_timeout_pay <=", value, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayLike(String value) {
            addCriterion("waybill_timeout_pay like", value, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayNotLike(String value) {
            addCriterion("waybill_timeout_pay not like", value, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayIn(List<String> values) {
            addCriterion("waybill_timeout_pay in", values, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayNotIn(List<String> values) {
            addCriterion("waybill_timeout_pay not in", values, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayBetween(String value1, String value2) {
            addCriterion("waybill_timeout_pay between", value1, value2, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayNotBetween(String value1, String value2) {
            addCriterion("waybill_timeout_pay not between", value1, value2, "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayIsNull() {
            addCriterion("receive_timeout_pay is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayIsNotNull() {
            addCriterion("receive_timeout_pay is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayEqualTo(String value) {
            addCriterion("receive_timeout_pay =", value, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayNotEqualTo(String value) {
            addCriterion("receive_timeout_pay <>", value, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayGreaterThan(String value) {
            addCriterion("receive_timeout_pay >", value, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayGreaterThanOrEqualTo(String value) {
            addCriterion("receive_timeout_pay >=", value, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayLessThan(String value) {
            addCriterion("receive_timeout_pay <", value, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayLessThanOrEqualTo(String value) {
            addCriterion("receive_timeout_pay <=", value, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayLike(String value) {
            addCriterion("receive_timeout_pay like", value, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayNotLike(String value) {
            addCriterion("receive_timeout_pay not like", value, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayIn(List<String> values) {
            addCriterion("receive_timeout_pay in", values, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayNotIn(List<String> values) {
            addCriterion("receive_timeout_pay not in", values, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayBetween(String value1, String value2) {
            addCriterion("receive_timeout_pay between", value1, value2, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayNotBetween(String value1, String value2) {
            addCriterion("receive_timeout_pay not between", value1, value2, "receiveTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1IsNull() {
            addCriterion("network_truck_allot1 is null");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1IsNotNull() {
            addCriterion("network_truck_allot1 is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1EqualTo(Integer value) {
            addCriterion("network_truck_allot1 =", value, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1NotEqualTo(Integer value) {
            addCriterion("network_truck_allot1 <>", value, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1GreaterThan(Integer value) {
            addCriterion("network_truck_allot1 >", value, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1GreaterThanOrEqualTo(Integer value) {
            addCriterion("network_truck_allot1 >=", value, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1LessThan(Integer value) {
            addCriterion("network_truck_allot1 <", value, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1LessThanOrEqualTo(Integer value) {
            addCriterion("network_truck_allot1 <=", value, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1In(List<Integer> values) {
            addCriterion("network_truck_allot1 in", values, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1NotIn(List<Integer> values) {
            addCriterion("network_truck_allot1 not in", values, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1Between(Integer value1, Integer value2) {
            addCriterion("network_truck_allot1 between", value1, value2, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot1NotBetween(Integer value1, Integer value2) {
            addCriterion("network_truck_allot1 not between", value1, value2, "networkTruckAllot1");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2IsNull() {
            addCriterion("network_truck_allot2 is null");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2IsNotNull() {
            addCriterion("network_truck_allot2 is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2EqualTo(Integer value) {
            addCriterion("network_truck_allot2 =", value, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2NotEqualTo(Integer value) {
            addCriterion("network_truck_allot2 <>", value, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2GreaterThan(Integer value) {
            addCriterion("network_truck_allot2 >", value, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2GreaterThanOrEqualTo(Integer value) {
            addCriterion("network_truck_allot2 >=", value, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2LessThan(Integer value) {
            addCriterion("network_truck_allot2 <", value, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2LessThanOrEqualTo(Integer value) {
            addCriterion("network_truck_allot2 <=", value, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2In(List<Integer> values) {
            addCriterion("network_truck_allot2 in", values, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2NotIn(List<Integer> values) {
            addCriterion("network_truck_allot2 not in", values, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2Between(Integer value1, Integer value2) {
            addCriterion("network_truck_allot2 between", value1, value2, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andNetworkTruckAllot2NotBetween(Integer value1, Integer value2) {
            addCriterion("network_truck_allot2 not between", value1, value2, "networkTruckAllot2");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyIsNull() {
            addCriterion("is_rount_witn_county is null");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyIsNotNull() {
            addCriterion("is_rount_witn_county is not null");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyEqualTo(Integer value) {
            addCriterion("is_rount_witn_county =", value, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyNotEqualTo(Integer value) {
            addCriterion("is_rount_witn_county <>", value, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyGreaterThan(Integer value) {
            addCriterion("is_rount_witn_county >", value, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_rount_witn_county >=", value, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyLessThan(Integer value) {
            addCriterion("is_rount_witn_county <", value, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyLessThanOrEqualTo(Integer value) {
            addCriterion("is_rount_witn_county <=", value, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyIn(List<Integer> values) {
            addCriterion("is_rount_witn_county in", values, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyNotIn(List<Integer> values) {
            addCriterion("is_rount_witn_county not in", values, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyBetween(Integer value1, Integer value2) {
            addCriterion("is_rount_witn_county between", value1, value2, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andIsRountWitnCountyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_rount_witn_county not between", value1, value2, "isRountWitnCounty");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andLinknameLikeInsensitive(String value) {
            addCriterion("upper(linkname) like", value.toUpperCase(), "linkname");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLikeInsensitive(String value) {
            addCriterion("upper(linkman_phone) like", value.toUpperCase(), "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andTelLikeInsensitive(String value) {
            addCriterion("upper(tel) like", value.toUpperCase(), "tel");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLikeInsensitive(String value) {
            addCriterion("upper(province_name) like", value.toUpperCase(), "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameLikeInsensitive(String value) {
            addCriterion("upper(city_name) like", value.toUpperCase(), "cityName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLikeInsensitive(String value) {
            addCriterion("upper(country_name) like", value.toUpperCase(), "countryName");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(booker_employee_name) like", value.toUpperCase(), "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andDownIdLikeInsensitive(String value) {
            addCriterion("upper(down_id) like", value.toUpperCase(), "downId");
            return (Criteria) this;
        }

        public Criteria andWaybillTimeoutPayLikeInsensitive(String value) {
            addCriterion("upper(waybill_timeout_pay) like", value.toUpperCase(), "waybillTimeoutPay");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeoutPayLikeInsensitive(String value) {
            addCriterion("upper(receive_timeout_pay) like", value.toUpperCase(), "receiveTimeoutPay");
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