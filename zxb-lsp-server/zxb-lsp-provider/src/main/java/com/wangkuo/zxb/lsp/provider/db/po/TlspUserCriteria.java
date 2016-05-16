package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TlspUserCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TlspUserCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andRealUserNameIsNull() {
            addCriterion("real_user_name is null");
            return (Criteria) this;
        }

        public Criteria andRealUserNameIsNotNull() {
            addCriterion("real_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealUserNameEqualTo(String value) {
            addCriterion("real_user_name =", value, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameNotEqualTo(String value) {
            addCriterion("real_user_name <>", value, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameGreaterThan(String value) {
            addCriterion("real_user_name >", value, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_user_name >=", value, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameLessThan(String value) {
            addCriterion("real_user_name <", value, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameLessThanOrEqualTo(String value) {
            addCriterion("real_user_name <=", value, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameLike(String value) {
            addCriterion("real_user_name like", value, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameNotLike(String value) {
            addCriterion("real_user_name not like", value, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameIn(List<String> values) {
            addCriterion("real_user_name in", values, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameNotIn(List<String> values) {
            addCriterion("real_user_name not in", values, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameBetween(String value1, String value2) {
            addCriterion("real_user_name between", value1, value2, "realUserName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameNotBetween(String value1, String value2) {
            addCriterion("real_user_name not between", value1, value2, "realUserName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
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

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Long value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Long value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Long value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Long value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Long> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Long> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Long value1, Long value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
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

        public Criteria andDetailedAddressIsNull() {
            addCriterion("detailed_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNotNull() {
            addCriterion("detailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressEqualTo(String value) {
            addCriterion("detailed_address =", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotEqualTo(String value) {
            addCriterion("detailed_address <>", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThan(String value) {
            addCriterion("detailed_address >", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_address >=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThan(String value) {
            addCriterion("detailed_address <", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("detailed_address <=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLike(String value) {
            addCriterion("detailed_address like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotLike(String value) {
            addCriterion("detailed_address not like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIn(List<String> values) {
            addCriterion("detailed_address in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotIn(List<String> values) {
            addCriterion("detailed_address not in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressBetween(String value1, String value2) {
            addCriterion("detailed_address between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("detailed_address not between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterionForJDBCDate("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_login_date not between", value1, value2, "lastLoginDate");
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

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(Integer value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(Integer value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(Integer value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(Integer value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<Integer> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<Integer> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdIsNull() {
            addCriterion("verify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdIsNotNull() {
            addCriterion("verify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdEqualTo(Long value) {
            addCriterion("verify_user_id =", value, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdNotEqualTo(Long value) {
            addCriterion("verify_user_id <>", value, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdGreaterThan(Long value) {
            addCriterion("verify_user_id >", value, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("verify_user_id >=", value, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdLessThan(Long value) {
            addCriterion("verify_user_id <", value, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdLessThanOrEqualTo(Long value) {
            addCriterion("verify_user_id <=", value, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdIn(List<Long> values) {
            addCriterion("verify_user_id in", values, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdNotIn(List<Long> values) {
            addCriterion("verify_user_id not in", values, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdBetween(Long value1, Long value2) {
            addCriterion("verify_user_id between", value1, value2, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIdNotBetween(Long value1, Long value2) {
            addCriterion("verify_user_id not between", value1, value2, "verifyUserId");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameIsNull() {
            addCriterion("verify_user_name is null");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameIsNotNull() {
            addCriterion("verify_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameEqualTo(String value) {
            addCriterion("verify_user_name =", value, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameNotEqualTo(String value) {
            addCriterion("verify_user_name <>", value, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameGreaterThan(String value) {
            addCriterion("verify_user_name >", value, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("verify_user_name >=", value, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameLessThan(String value) {
            addCriterion("verify_user_name <", value, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameLessThanOrEqualTo(String value) {
            addCriterion("verify_user_name <=", value, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameLike(String value) {
            addCriterion("verify_user_name like", value, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameNotLike(String value) {
            addCriterion("verify_user_name not like", value, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameIn(List<String> values) {
            addCriterion("verify_user_name in", values, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameNotIn(List<String> values) {
            addCriterion("verify_user_name not in", values, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameBetween(String value1, String value2) {
            addCriterion("verify_user_name between", value1, value2, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameNotBetween(String value1, String value2) {
            addCriterion("verify_user_name not between", value1, value2, "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIsNull() {
            addCriterion("verify_date is null");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIsNotNull() {
            addCriterion("verify_date is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyDateEqualTo(Date value) {
            addCriterionForJDBCDate("verify_date =", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("verify_date <>", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("verify_date >", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("verify_date >=", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateLessThan(Date value) {
            addCriterionForJDBCDate("verify_date <", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("verify_date <=", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIn(List<Date> values) {
            addCriterionForJDBCDate("verify_date in", values, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("verify_date not in", values, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("verify_date between", value1, value2, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("verify_date not between", value1, value2, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andBlockedIsNull() {
            addCriterion("blocked is null");
            return (Criteria) this;
        }

        public Criteria andBlockedIsNotNull() {
            addCriterion("blocked is not null");
            return (Criteria) this;
        }

        public Criteria andBlockedEqualTo(Integer value) {
            addCriterion("blocked =", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedNotEqualTo(Integer value) {
            addCriterion("blocked <>", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedGreaterThan(Integer value) {
            addCriterion("blocked >", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("blocked >=", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedLessThan(Integer value) {
            addCriterion("blocked <", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedLessThanOrEqualTo(Integer value) {
            addCriterion("blocked <=", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedIn(List<Integer> values) {
            addCriterion("blocked in", values, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedNotIn(List<Integer> values) {
            addCriterion("blocked not in", values, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedBetween(Integer value1, Integer value2) {
            addCriterion("blocked between", value1, value2, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedNotBetween(Integer value1, Integer value2) {
            addCriterion("blocked not between", value1, value2, "blocked");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdIsNull() {
            addCriterion("registrant_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdIsNotNull() {
            addCriterion("registrant_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdEqualTo(Long value) {
            addCriterion("registrant_user_id =", value, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdNotEqualTo(Long value) {
            addCriterion("registrant_user_id <>", value, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdGreaterThan(Long value) {
            addCriterion("registrant_user_id >", value, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("registrant_user_id >=", value, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdLessThan(Long value) {
            addCriterion("registrant_user_id <", value, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdLessThanOrEqualTo(Long value) {
            addCriterion("registrant_user_id <=", value, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdIn(List<Long> values) {
            addCriterion("registrant_user_id in", values, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdNotIn(List<Long> values) {
            addCriterion("registrant_user_id not in", values, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdBetween(Long value1, Long value2) {
            addCriterion("registrant_user_id between", value1, value2, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserIdNotBetween(Long value1, Long value2) {
            addCriterion("registrant_user_id not between", value1, value2, "registrantUserId");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameIsNull() {
            addCriterion("registrant_user_name is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameIsNotNull() {
            addCriterion("registrant_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameEqualTo(String value) {
            addCriterion("registrant_user_name =", value, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameNotEqualTo(String value) {
            addCriterion("registrant_user_name <>", value, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameGreaterThan(String value) {
            addCriterion("registrant_user_name >", value, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("registrant_user_name >=", value, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameLessThan(String value) {
            addCriterion("registrant_user_name <", value, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameLessThanOrEqualTo(String value) {
            addCriterion("registrant_user_name <=", value, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameLike(String value) {
            addCriterion("registrant_user_name like", value, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameNotLike(String value) {
            addCriterion("registrant_user_name not like", value, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameIn(List<String> values) {
            addCriterion("registrant_user_name in", values, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameNotIn(List<String> values) {
            addCriterion("registrant_user_name not in", values, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameBetween(String value1, String value2) {
            addCriterion("registrant_user_name between", value1, value2, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameNotBetween(String value1, String value2) {
            addCriterion("registrant_user_name not between", value1, value2, "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateIsNull() {
            addCriterion("registrant_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateIsNotNull() {
            addCriterion("registrant_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateEqualTo(Date value) {
            addCriterionForJDBCDate("registrant_date =", value, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registrant_date <>", value, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateGreaterThan(Date value) {
            addCriterionForJDBCDate("registrant_date >", value, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registrant_date >=", value, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateLessThan(Date value) {
            addCriterionForJDBCDate("registrant_date <", value, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registrant_date <=", value, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateIn(List<Date> values) {
            addCriterionForJDBCDate("registrant_date in", values, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registrant_date not in", values, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registrant_date between", value1, value2, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registrant_date not between", value1, value2, "registrantDate");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsIsNull() {
            addCriterion("verify_instructions is null");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsIsNotNull() {
            addCriterion("verify_instructions is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsEqualTo(String value) {
            addCriterion("verify_instructions =", value, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsNotEqualTo(String value) {
            addCriterion("verify_instructions <>", value, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsGreaterThan(String value) {
            addCriterion("verify_instructions >", value, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("verify_instructions >=", value, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsLessThan(String value) {
            addCriterion("verify_instructions <", value, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsLessThanOrEqualTo(String value) {
            addCriterion("verify_instructions <=", value, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsLike(String value) {
            addCriterion("verify_instructions like", value, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsNotLike(String value) {
            addCriterion("verify_instructions not like", value, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsIn(List<String> values) {
            addCriterion("verify_instructions in", values, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsNotIn(List<String> values) {
            addCriterion("verify_instructions not in", values, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsBetween(String value1, String value2) {
            addCriterion("verify_instructions between", value1, value2, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsNotBetween(String value1, String value2) {
            addCriterion("verify_instructions not between", value1, value2, "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNull() {
            addCriterion("bind_mobile is null");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNotNull() {
            addCriterion("bind_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andBindMobileEqualTo(String value) {
            addCriterion("bind_mobile =", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotEqualTo(String value) {
            addCriterion("bind_mobile <>", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThan(String value) {
            addCriterion("bind_mobile >", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThanOrEqualTo(String value) {
            addCriterion("bind_mobile >=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThan(String value) {
            addCriterion("bind_mobile <", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThanOrEqualTo(String value) {
            addCriterion("bind_mobile <=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLike(String value) {
            addCriterion("bind_mobile like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotLike(String value) {
            addCriterion("bind_mobile not like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileIn(List<String> values) {
            addCriterion("bind_mobile in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotIn(List<String> values) {
            addCriterion("bind_mobile not in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileBetween(String value1, String value2) {
            addCriterion("bind_mobile between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotBetween(String value1, String value2) {
            addCriterion("bind_mobile not between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
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

        public Criteria andInviteNameIsNull() {
            addCriterion("invite_name is null");
            return (Criteria) this;
        }

        public Criteria andInviteNameIsNotNull() {
            addCriterion("invite_name is not null");
            return (Criteria) this;
        }

        public Criteria andInviteNameEqualTo(String value) {
            addCriterion("invite_name =", value, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameNotEqualTo(String value) {
            addCriterion("invite_name <>", value, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameGreaterThan(String value) {
            addCriterion("invite_name >", value, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameGreaterThanOrEqualTo(String value) {
            addCriterion("invite_name >=", value, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameLessThan(String value) {
            addCriterion("invite_name <", value, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameLessThanOrEqualTo(String value) {
            addCriterion("invite_name <=", value, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameLike(String value) {
            addCriterion("invite_name like", value, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameNotLike(String value) {
            addCriterion("invite_name not like", value, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameIn(List<String> values) {
            addCriterion("invite_name in", values, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameNotIn(List<String> values) {
            addCriterion("invite_name not in", values, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameBetween(String value1, String value2) {
            addCriterion("invite_name between", value1, value2, "inviteName");
            return (Criteria) this;
        }

        public Criteria andInviteNameNotBetween(String value1, String value2) {
            addCriterion("invite_name not between", value1, value2, "inviteName");
            return (Criteria) this;
        }

        public Criteria andNickNameLikeInsensitive(String value) {
            addCriterion("upper(nick_name) like", value.toUpperCase(), "nickName");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLikeInsensitive(String value) {
            addCriterion("upper(company_name) like", value.toUpperCase(), "companyName");
            return (Criteria) this;
        }

        public Criteria andRealUserNameLikeInsensitive(String value) {
            addCriterion("upper(real_user_name) like", value.toUpperCase(), "realUserName");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andTelphoneLikeInsensitive(String value) {
            addCriterion("upper(telphone) like", value.toUpperCase(), "telphone");
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

        public Criteria andDetailedAddressLikeInsensitive(String value) {
            addCriterion("upper(detailed_address) like", value.toUpperCase(), "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andAllocCenterNameLikeInsensitive(String value) {
            addCriterion("upper(alloc_center_name) like", value.toUpperCase(), "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNameLikeInsensitive(String value) {
            addCriterion("upper(verify_user_name) like", value.toUpperCase(), "verifyUserName");
            return (Criteria) this;
        }

        public Criteria andRegistrantUserNameLikeInsensitive(String value) {
            addCriterion("upper(registrant_user_name) like", value.toUpperCase(), "registrantUserName");
            return (Criteria) this;
        }

        public Criteria andVerifyInstructionsLikeInsensitive(String value) {
            addCriterion("upper(verify_instructions) like", value.toUpperCase(), "verifyInstructions");
            return (Criteria) this;
        }

        public Criteria andBindMobileLikeInsensitive(String value) {
            addCriterion("upper(bind_mobile) like", value.toUpperCase(), "bindMobile");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLikeInsensitive(String value) {
            addCriterion("upper(pay_password) like", value.toUpperCase(), "payPassword");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andInviteNameLikeInsensitive(String value) {
            addCriterion("upper(invite_name) like", value.toUpperCase(), "inviteName");
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