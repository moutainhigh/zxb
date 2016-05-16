package com.wangkuo.zxb.smart.show.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andConsignerNameIsNull() {
            addCriterion("consigner_name is null");
            return (Criteria) this;
        }

        public Criteria andConsignerNameIsNotNull() {
            addCriterion("consigner_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerNameEqualTo(String value) {
            addCriterion("consigner_name =", value, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameNotEqualTo(String value) {
            addCriterion("consigner_name <>", value, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameGreaterThan(String value) {
            addCriterion("consigner_name >", value, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_name >=", value, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameLessThan(String value) {
            addCriterion("consigner_name <", value, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameLessThanOrEqualTo(String value) {
            addCriterion("consigner_name <=", value, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameLike(String value) {
            addCriterion("consigner_name like", value, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameNotLike(String value) {
            addCriterion("consigner_name not like", value, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameIn(List<String> values) {
            addCriterion("consigner_name in", values, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameNotIn(List<String> values) {
            addCriterion("consigner_name not in", values, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameBetween(String value1, String value2) {
            addCriterion("consigner_name between", value1, value2, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerNameNotBetween(String value1, String value2) {
            addCriterion("consigner_name not between", value1, value2, "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyIsNull() {
            addCriterion("consigner_company is null");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyIsNotNull() {
            addCriterion("consigner_company is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyEqualTo(String value) {
            addCriterion("consigner_company =", value, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyNotEqualTo(String value) {
            addCriterion("consigner_company <>", value, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyGreaterThan(String value) {
            addCriterion("consigner_company >", value, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_company >=", value, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyLessThan(String value) {
            addCriterion("consigner_company <", value, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyLessThanOrEqualTo(String value) {
            addCriterion("consigner_company <=", value, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyLike(String value) {
            addCriterion("consigner_company like", value, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyNotLike(String value) {
            addCriterion("consigner_company not like", value, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyIn(List<String> values) {
            addCriterion("consigner_company in", values, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyNotIn(List<String> values) {
            addCriterion("consigner_company not in", values, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyBetween(String value1, String value2) {
            addCriterion("consigner_company between", value1, value2, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyNotBetween(String value1, String value2) {
            addCriterion("consigner_company not between", value1, value2, "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneIsNull() {
            addCriterion("consigner_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneIsNotNull() {
            addCriterion("consigner_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneEqualTo(String value) {
            addCriterion("consigner_phone =", value, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneNotEqualTo(String value) {
            addCriterion("consigner_phone <>", value, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneGreaterThan(String value) {
            addCriterion("consigner_phone >", value, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_phone >=", value, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneLessThan(String value) {
            addCriterion("consigner_phone <", value, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneLessThanOrEqualTo(String value) {
            addCriterion("consigner_phone <=", value, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneLike(String value) {
            addCriterion("consigner_phone like", value, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneNotLike(String value) {
            addCriterion("consigner_phone not like", value, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneIn(List<String> values) {
            addCriterion("consigner_phone in", values, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneNotIn(List<String> values) {
            addCriterion("consigner_phone not in", values, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneBetween(String value1, String value2) {
            addCriterion("consigner_phone between", value1, value2, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneNotBetween(String value1, String value2) {
            addCriterion("consigner_phone not between", value1, value2, "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileIsNull() {
            addCriterion("consigner_mobile is null");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileIsNotNull() {
            addCriterion("consigner_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileEqualTo(String value) {
            addCriterion("consigner_mobile =", value, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileNotEqualTo(String value) {
            addCriterion("consigner_mobile <>", value, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileGreaterThan(String value) {
            addCriterion("consigner_mobile >", value, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_mobile >=", value, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileLessThan(String value) {
            addCriterion("consigner_mobile <", value, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileLessThanOrEqualTo(String value) {
            addCriterion("consigner_mobile <=", value, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileLike(String value) {
            addCriterion("consigner_mobile like", value, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileNotLike(String value) {
            addCriterion("consigner_mobile not like", value, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileIn(List<String> values) {
            addCriterion("consigner_mobile in", values, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileNotIn(List<String> values) {
            addCriterion("consigner_mobile not in", values, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileBetween(String value1, String value2) {
            addCriterion("consigner_mobile between", value1, value2, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileNotBetween(String value1, String value2) {
            addCriterion("consigner_mobile not between", value1, value2, "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressIsNull() {
            addCriterion("consigner_address is null");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressIsNotNull() {
            addCriterion("consigner_address is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressEqualTo(String value) {
            addCriterion("consigner_address =", value, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressNotEqualTo(String value) {
            addCriterion("consigner_address <>", value, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressGreaterThan(String value) {
            addCriterion("consigner_address >", value, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_address >=", value, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressLessThan(String value) {
            addCriterion("consigner_address <", value, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressLessThanOrEqualTo(String value) {
            addCriterion("consigner_address <=", value, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressLike(String value) {
            addCriterion("consigner_address like", value, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressNotLike(String value) {
            addCriterion("consigner_address not like", value, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressIn(List<String> values) {
            addCriterion("consigner_address in", values, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressNotIn(List<String> values) {
            addCriterion("consigner_address not in", values, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressBetween(String value1, String value2) {
            addCriterion("consigner_address between", value1, value2, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressNotBetween(String value1, String value2) {
            addCriterion("consigner_address not between", value1, value2, "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIsNull() {
            addCriterion("consigner_province is null");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIsNotNull() {
            addCriterion("consigner_province is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceEqualTo(String value) {
            addCriterion("consigner_province =", value, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceNotEqualTo(String value) {
            addCriterion("consigner_province <>", value, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceGreaterThan(String value) {
            addCriterion("consigner_province >", value, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_province >=", value, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceLessThan(String value) {
            addCriterion("consigner_province <", value, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceLessThanOrEqualTo(String value) {
            addCriterion("consigner_province <=", value, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceLike(String value) {
            addCriterion("consigner_province like", value, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceNotLike(String value) {
            addCriterion("consigner_province not like", value, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIn(List<String> values) {
            addCriterion("consigner_province in", values, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceNotIn(List<String> values) {
            addCriterion("consigner_province not in", values, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceBetween(String value1, String value2) {
            addCriterion("consigner_province between", value1, value2, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceNotBetween(String value1, String value2) {
            addCriterion("consigner_province not between", value1, value2, "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdIsNull() {
            addCriterion("consigner_province_id is null");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdIsNotNull() {
            addCriterion("consigner_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdEqualTo(Long value) {
            addCriterion("consigner_province_id =", value, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdNotEqualTo(Long value) {
            addCriterion("consigner_province_id <>", value, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdGreaterThan(Long value) {
            addCriterion("consigner_province_id >", value, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consigner_province_id >=", value, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdLessThan(Long value) {
            addCriterion("consigner_province_id <", value, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("consigner_province_id <=", value, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdIn(List<Long> values) {
            addCriterion("consigner_province_id in", values, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdNotIn(List<Long> values) {
            addCriterion("consigner_province_id not in", values, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdBetween(Long value1, Long value2) {
            addCriterion("consigner_province_id between", value1, value2, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("consigner_province_id not between", value1, value2, "consignerProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIsNull() {
            addCriterion("consigner_city is null");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIsNotNull() {
            addCriterion("consigner_city is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerCityEqualTo(String value) {
            addCriterion("consigner_city =", value, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityNotEqualTo(String value) {
            addCriterion("consigner_city <>", value, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityGreaterThan(String value) {
            addCriterion("consigner_city >", value, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_city >=", value, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityLessThan(String value) {
            addCriterion("consigner_city <", value, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityLessThanOrEqualTo(String value) {
            addCriterion("consigner_city <=", value, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityLike(String value) {
            addCriterion("consigner_city like", value, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityNotLike(String value) {
            addCriterion("consigner_city not like", value, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIn(List<String> values) {
            addCriterion("consigner_city in", values, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityNotIn(List<String> values) {
            addCriterion("consigner_city not in", values, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityBetween(String value1, String value2) {
            addCriterion("consigner_city between", value1, value2, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityNotBetween(String value1, String value2) {
            addCriterion("consigner_city not between", value1, value2, "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdIsNull() {
            addCriterion("consigner_city_id is null");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdIsNotNull() {
            addCriterion("consigner_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdEqualTo(Long value) {
            addCriterion("consigner_city_id =", value, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdNotEqualTo(Long value) {
            addCriterion("consigner_city_id <>", value, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdGreaterThan(Long value) {
            addCriterion("consigner_city_id >", value, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consigner_city_id >=", value, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdLessThan(Long value) {
            addCriterion("consigner_city_id <", value, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdLessThanOrEqualTo(Long value) {
            addCriterion("consigner_city_id <=", value, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdIn(List<Long> values) {
            addCriterion("consigner_city_id in", values, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdNotIn(List<Long> values) {
            addCriterion("consigner_city_id not in", values, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdBetween(Long value1, Long value2) {
            addCriterion("consigner_city_id between", value1, value2, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCityIdNotBetween(Long value1, Long value2) {
            addCriterion("consigner_city_id not between", value1, value2, "consignerCityId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIsNull() {
            addCriterion("consigner_county is null");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIsNotNull() {
            addCriterion("consigner_county is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyEqualTo(String value) {
            addCriterion("consigner_county =", value, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyNotEqualTo(String value) {
            addCriterion("consigner_county <>", value, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyGreaterThan(String value) {
            addCriterion("consigner_county >", value, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_county >=", value, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyLessThan(String value) {
            addCriterion("consigner_county <", value, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyLessThanOrEqualTo(String value) {
            addCriterion("consigner_county <=", value, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyLike(String value) {
            addCriterion("consigner_county like", value, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyNotLike(String value) {
            addCriterion("consigner_county not like", value, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIn(List<String> values) {
            addCriterion("consigner_county in", values, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyNotIn(List<String> values) {
            addCriterion("consigner_county not in", values, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyBetween(String value1, String value2) {
            addCriterion("consigner_county between", value1, value2, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyNotBetween(String value1, String value2) {
            addCriterion("consigner_county not between", value1, value2, "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdIsNull() {
            addCriterion("consigner_county_id is null");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdIsNotNull() {
            addCriterion("consigner_county_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdEqualTo(Long value) {
            addCriterion("consigner_county_id =", value, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdNotEqualTo(Long value) {
            addCriterion("consigner_county_id <>", value, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdGreaterThan(Long value) {
            addCriterion("consigner_county_id >", value, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consigner_county_id >=", value, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdLessThan(Long value) {
            addCriterion("consigner_county_id <", value, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdLessThanOrEqualTo(Long value) {
            addCriterion("consigner_county_id <=", value, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdIn(List<Long> values) {
            addCriterion("consigner_county_id in", values, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdNotIn(List<Long> values) {
            addCriterion("consigner_county_id not in", values, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdBetween(Long value1, Long value2) {
            addCriterion("consigner_county_id between", value1, value2, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyIdNotBetween(Long value1, Long value2) {
            addCriterion("consigner_county_id not between", value1, value2, "consignerCountyId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIsNull() {
            addCriterion("consigner_town is null");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIsNotNull() {
            addCriterion("consigner_town is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerTownEqualTo(String value) {
            addCriterion("consigner_town =", value, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownNotEqualTo(String value) {
            addCriterion("consigner_town <>", value, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownGreaterThan(String value) {
            addCriterion("consigner_town >", value, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_town >=", value, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownLessThan(String value) {
            addCriterion("consigner_town <", value, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownLessThanOrEqualTo(String value) {
            addCriterion("consigner_town <=", value, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownLike(String value) {
            addCriterion("consigner_town like", value, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownNotLike(String value) {
            addCriterion("consigner_town not like", value, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIn(List<String> values) {
            addCriterion("consigner_town in", values, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownNotIn(List<String> values) {
            addCriterion("consigner_town not in", values, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownBetween(String value1, String value2) {
            addCriterion("consigner_town between", value1, value2, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownNotBetween(String value1, String value2) {
            addCriterion("consigner_town not between", value1, value2, "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdIsNull() {
            addCriterion("consigner_town_id is null");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdIsNotNull() {
            addCriterion("consigner_town_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdEqualTo(Long value) {
            addCriterion("consigner_town_id =", value, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdNotEqualTo(Long value) {
            addCriterion("consigner_town_id <>", value, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdGreaterThan(Long value) {
            addCriterion("consigner_town_id >", value, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consigner_town_id >=", value, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdLessThan(Long value) {
            addCriterion("consigner_town_id <", value, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdLessThanOrEqualTo(Long value) {
            addCriterion("consigner_town_id <=", value, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdIn(List<Long> values) {
            addCriterion("consigner_town_id in", values, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdNotIn(List<Long> values) {
            addCriterion("consigner_town_id not in", values, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdBetween(Long value1, Long value2) {
            addCriterion("consigner_town_id between", value1, value2, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsignerTownIdNotBetween(Long value1, Long value2) {
            addCriterion("consigner_town_id not between", value1, value2, "consignerTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNull() {
            addCriterion("consignee_name is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNotNull() {
            addCriterion("consignee_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameEqualTo(String value) {
            addCriterion("consignee_name =", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotEqualTo(String value) {
            addCriterion("consignee_name <>", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThan(String value) {
            addCriterion("consignee_name >", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_name >=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThan(String value) {
            addCriterion("consignee_name <", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThanOrEqualTo(String value) {
            addCriterion("consignee_name <=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLike(String value) {
            addCriterion("consignee_name like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotLike(String value) {
            addCriterion("consignee_name not like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIn(List<String> values) {
            addCriterion("consignee_name in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotIn(List<String> values) {
            addCriterion("consignee_name not in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameBetween(String value1, String value2) {
            addCriterion("consignee_name between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotBetween(String value1, String value2) {
            addCriterion("consignee_name not between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyIsNull() {
            addCriterion("consignee_company is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyIsNotNull() {
            addCriterion("consignee_company is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyEqualTo(String value) {
            addCriterion("consignee_company =", value, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyNotEqualTo(String value) {
            addCriterion("consignee_company <>", value, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyGreaterThan(String value) {
            addCriterion("consignee_company >", value, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_company >=", value, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyLessThan(String value) {
            addCriterion("consignee_company <", value, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyLessThanOrEqualTo(String value) {
            addCriterion("consignee_company <=", value, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyLike(String value) {
            addCriterion("consignee_company like", value, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyNotLike(String value) {
            addCriterion("consignee_company not like", value, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyIn(List<String> values) {
            addCriterion("consignee_company in", values, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyNotIn(List<String> values) {
            addCriterion("consignee_company not in", values, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyBetween(String value1, String value2) {
            addCriterion("consignee_company between", value1, value2, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyNotBetween(String value1, String value2) {
            addCriterion("consignee_company not between", value1, value2, "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNull() {
            addCriterion("consignee_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNotNull() {
            addCriterion("consignee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneEqualTo(String value) {
            addCriterion("consignee_phone =", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotEqualTo(String value) {
            addCriterion("consignee_phone <>", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThan(String value) {
            addCriterion("consignee_phone >", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_phone >=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThan(String value) {
            addCriterion("consignee_phone <", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThanOrEqualTo(String value) {
            addCriterion("consignee_phone <=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLike(String value) {
            addCriterion("consignee_phone like", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotLike(String value) {
            addCriterion("consignee_phone not like", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIn(List<String> values) {
            addCriterion("consignee_phone in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotIn(List<String> values) {
            addCriterion("consignee_phone not in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneBetween(String value1, String value2) {
            addCriterion("consignee_phone between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotBetween(String value1, String value2) {
            addCriterion("consignee_phone not between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIsNull() {
            addCriterion("consignee_mobile is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIsNotNull() {
            addCriterion("consignee_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileEqualTo(String value) {
            addCriterion("consignee_mobile =", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotEqualTo(String value) {
            addCriterion("consignee_mobile <>", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileGreaterThan(String value) {
            addCriterion("consignee_mobile >", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_mobile >=", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLessThan(String value) {
            addCriterion("consignee_mobile <", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLessThanOrEqualTo(String value) {
            addCriterion("consignee_mobile <=", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLike(String value) {
            addCriterion("consignee_mobile like", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotLike(String value) {
            addCriterion("consignee_mobile not like", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIn(List<String> values) {
            addCriterion("consignee_mobile in", values, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotIn(List<String> values) {
            addCriterion("consignee_mobile not in", values, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileBetween(String value1, String value2) {
            addCriterion("consignee_mobile between", value1, value2, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotBetween(String value1, String value2) {
            addCriterion("consignee_mobile not between", value1, value2, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNull() {
            addCriterion("consignee_address is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNotNull() {
            addCriterion("consignee_address is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressEqualTo(String value) {
            addCriterion("consignee_address =", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotEqualTo(String value) {
            addCriterion("consignee_address <>", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThan(String value) {
            addCriterion("consignee_address >", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_address >=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThan(String value) {
            addCriterion("consignee_address <", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThanOrEqualTo(String value) {
            addCriterion("consignee_address <=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLike(String value) {
            addCriterion("consignee_address like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotLike(String value) {
            addCriterion("consignee_address not like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIn(List<String> values) {
            addCriterion("consignee_address in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotIn(List<String> values) {
            addCriterion("consignee_address not in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressBetween(String value1, String value2) {
            addCriterion("consignee_address between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotBetween(String value1, String value2) {
            addCriterion("consignee_address not between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIsNull() {
            addCriterion("consignee_province is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIsNotNull() {
            addCriterion("consignee_province is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceEqualTo(String value) {
            addCriterion("consignee_province =", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotEqualTo(String value) {
            addCriterion("consignee_province <>", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceGreaterThan(String value) {
            addCriterion("consignee_province >", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_province >=", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLessThan(String value) {
            addCriterion("consignee_province <", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLessThanOrEqualTo(String value) {
            addCriterion("consignee_province <=", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLike(String value) {
            addCriterion("consignee_province like", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotLike(String value) {
            addCriterion("consignee_province not like", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIn(List<String> values) {
            addCriterion("consignee_province in", values, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotIn(List<String> values) {
            addCriterion("consignee_province not in", values, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceBetween(String value1, String value2) {
            addCriterion("consignee_province between", value1, value2, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotBetween(String value1, String value2) {
            addCriterion("consignee_province not between", value1, value2, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdIsNull() {
            addCriterion("consignee_province_id is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdIsNotNull() {
            addCriterion("consignee_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdEqualTo(Long value) {
            addCriterion("consignee_province_id =", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdNotEqualTo(Long value) {
            addCriterion("consignee_province_id <>", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdGreaterThan(Long value) {
            addCriterion("consignee_province_id >", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_province_id >=", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdLessThan(Long value) {
            addCriterion("consignee_province_id <", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("consignee_province_id <=", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdIn(List<Long> values) {
            addCriterion("consignee_province_id in", values, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdNotIn(List<Long> values) {
            addCriterion("consignee_province_id not in", values, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdBetween(Long value1, Long value2) {
            addCriterion("consignee_province_id between", value1, value2, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("consignee_province_id not between", value1, value2, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIsNull() {
            addCriterion("consignee_city is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIsNotNull() {
            addCriterion("consignee_city is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityEqualTo(String value) {
            addCriterion("consignee_city =", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotEqualTo(String value) {
            addCriterion("consignee_city <>", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityGreaterThan(String value) {
            addCriterion("consignee_city >", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_city >=", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLessThan(String value) {
            addCriterion("consignee_city <", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLessThanOrEqualTo(String value) {
            addCriterion("consignee_city <=", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLike(String value) {
            addCriterion("consignee_city like", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotLike(String value) {
            addCriterion("consignee_city not like", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIn(List<String> values) {
            addCriterion("consignee_city in", values, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotIn(List<String> values) {
            addCriterion("consignee_city not in", values, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityBetween(String value1, String value2) {
            addCriterion("consignee_city between", value1, value2, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotBetween(String value1, String value2) {
            addCriterion("consignee_city not between", value1, value2, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdIsNull() {
            addCriterion("consignee_city_id is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdIsNotNull() {
            addCriterion("consignee_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdEqualTo(Long value) {
            addCriterion("consignee_city_id =", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdNotEqualTo(Long value) {
            addCriterion("consignee_city_id <>", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdGreaterThan(Long value) {
            addCriterion("consignee_city_id >", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_city_id >=", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdLessThan(Long value) {
            addCriterion("consignee_city_id <", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdLessThanOrEqualTo(Long value) {
            addCriterion("consignee_city_id <=", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdIn(List<Long> values) {
            addCriterion("consignee_city_id in", values, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdNotIn(List<Long> values) {
            addCriterion("consignee_city_id not in", values, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdBetween(Long value1, Long value2) {
            addCriterion("consignee_city_id between", value1, value2, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdNotBetween(Long value1, Long value2) {
            addCriterion("consignee_city_id not between", value1, value2, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIsNull() {
            addCriterion("consignee_county is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIsNotNull() {
            addCriterion("consignee_county is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyEqualTo(String value) {
            addCriterion("consignee_county =", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyNotEqualTo(String value) {
            addCriterion("consignee_county <>", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyGreaterThan(String value) {
            addCriterion("consignee_county >", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_county >=", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyLessThan(String value) {
            addCriterion("consignee_county <", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyLessThanOrEqualTo(String value) {
            addCriterion("consignee_county <=", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyLike(String value) {
            addCriterion("consignee_county like", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyNotLike(String value) {
            addCriterion("consignee_county not like", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIn(List<String> values) {
            addCriterion("consignee_county in", values, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyNotIn(List<String> values) {
            addCriterion("consignee_county not in", values, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyBetween(String value1, String value2) {
            addCriterion("consignee_county between", value1, value2, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyNotBetween(String value1, String value2) {
            addCriterion("consignee_county not between", value1, value2, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdIsNull() {
            addCriterion("consignee_county_id is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdIsNotNull() {
            addCriterion("consignee_county_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdEqualTo(Long value) {
            addCriterion("consignee_county_id =", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdNotEqualTo(Long value) {
            addCriterion("consignee_county_id <>", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdGreaterThan(Long value) {
            addCriterion("consignee_county_id >", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_county_id >=", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdLessThan(Long value) {
            addCriterion("consignee_county_id <", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdLessThanOrEqualTo(Long value) {
            addCriterion("consignee_county_id <=", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdIn(List<Long> values) {
            addCriterion("consignee_county_id in", values, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdNotIn(List<Long> values) {
            addCriterion("consignee_county_id not in", values, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdBetween(Long value1, Long value2) {
            addCriterion("consignee_county_id between", value1, value2, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdNotBetween(Long value1, Long value2) {
            addCriterion("consignee_county_id not between", value1, value2, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIsNull() {
            addCriterion("consignee_town is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIsNotNull() {
            addCriterion("consignee_town is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownEqualTo(String value) {
            addCriterion("consignee_town =", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownNotEqualTo(String value) {
            addCriterion("consignee_town <>", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownGreaterThan(String value) {
            addCriterion("consignee_town >", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_town >=", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownLessThan(String value) {
            addCriterion("consignee_town <", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownLessThanOrEqualTo(String value) {
            addCriterion("consignee_town <=", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownLike(String value) {
            addCriterion("consignee_town like", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownNotLike(String value) {
            addCriterion("consignee_town not like", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIn(List<String> values) {
            addCriterion("consignee_town in", values, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownNotIn(List<String> values) {
            addCriterion("consignee_town not in", values, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownBetween(String value1, String value2) {
            addCriterion("consignee_town between", value1, value2, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownNotBetween(String value1, String value2) {
            addCriterion("consignee_town not between", value1, value2, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdIsNull() {
            addCriterion("consignee_town_id is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdIsNotNull() {
            addCriterion("consignee_town_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdEqualTo(Long value) {
            addCriterion("consignee_town_id =", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdNotEqualTo(Long value) {
            addCriterion("consignee_town_id <>", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdGreaterThan(Long value) {
            addCriterion("consignee_town_id >", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_town_id >=", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdLessThan(Long value) {
            addCriterion("consignee_town_id <", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdLessThanOrEqualTo(Long value) {
            addCriterion("consignee_town_id <=", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdIn(List<Long> values) {
            addCriterion("consignee_town_id in", values, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdNotIn(List<Long> values) {
            addCriterion("consignee_town_id not in", values, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdBetween(Long value1, Long value2) {
            addCriterion("consignee_town_id between", value1, value2, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdNotBetween(Long value1, Long value2) {
            addCriterion("consignee_town_id not between", value1, value2, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeIsNull() {
            addCriterion("goods_pack_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeIsNotNull() {
            addCriterion("goods_pack_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeEqualTo(String value) {
            addCriterion("goods_pack_type =", value, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeNotEqualTo(String value) {
            addCriterion("goods_pack_type <>", value, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeGreaterThan(String value) {
            addCriterion("goods_pack_type >", value, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_pack_type >=", value, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeLessThan(String value) {
            addCriterion("goods_pack_type <", value, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_pack_type <=", value, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeLike(String value) {
            addCriterion("goods_pack_type like", value, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeNotLike(String value) {
            addCriterion("goods_pack_type not like", value, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeIn(List<String> values) {
            addCriterion("goods_pack_type in", values, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeNotIn(List<String> values) {
            addCriterion("goods_pack_type not in", values, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeBetween(String value1, String value2) {
            addCriterion("goods_pack_type between", value1, value2, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeNotBetween(String value1, String value2) {
            addCriterion("goods_pack_type not between", value1, value2, "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthIsNull() {
            addCriterion("goods_length is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthIsNotNull() {
            addCriterion("goods_length is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthEqualTo(Float value) {
            addCriterion("goods_length =", value, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthNotEqualTo(Float value) {
            addCriterion("goods_length <>", value, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthGreaterThan(Float value) {
            addCriterion("goods_length >", value, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_length >=", value, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthLessThan(Float value) {
            addCriterion("goods_length <", value, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthLessThanOrEqualTo(Float value) {
            addCriterion("goods_length <=", value, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthIn(List<Float> values) {
            addCriterion("goods_length in", values, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthNotIn(List<Float> values) {
            addCriterion("goods_length not in", values, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthBetween(Float value1, Float value2) {
            addCriterion("goods_length between", value1, value2, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsLengthNotBetween(Float value1, Float value2) {
            addCriterion("goods_length not between", value1, value2, "goodsLength");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthIsNull() {
            addCriterion("goods_width is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthIsNotNull() {
            addCriterion("goods_width is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthEqualTo(Float value) {
            addCriterion("goods_width =", value, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthNotEqualTo(Float value) {
            addCriterion("goods_width <>", value, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthGreaterThan(Float value) {
            addCriterion("goods_width >", value, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_width >=", value, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthLessThan(Float value) {
            addCriterion("goods_width <", value, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthLessThanOrEqualTo(Float value) {
            addCriterion("goods_width <=", value, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthIn(List<Float> values) {
            addCriterion("goods_width in", values, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthNotIn(List<Float> values) {
            addCriterion("goods_width not in", values, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthBetween(Float value1, Float value2) {
            addCriterion("goods_width between", value1, value2, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsWidthNotBetween(Float value1, Float value2) {
            addCriterion("goods_width not between", value1, value2, "goodsWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIsNull() {
            addCriterion("goods_height is null");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIsNotNull() {
            addCriterion("goods_height is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightEqualTo(Float value) {
            addCriterion("goods_height =", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotEqualTo(Float value) {
            addCriterion("goods_height <>", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightGreaterThan(Float value) {
            addCriterion("goods_height >", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_height >=", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightLessThan(Float value) {
            addCriterion("goods_height <", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightLessThanOrEqualTo(Float value) {
            addCriterion("goods_height <=", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIn(List<Float> values) {
            addCriterion("goods_height in", values, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotIn(List<Float> values) {
            addCriterion("goods_height not in", values, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightBetween(Float value1, Float value2) {
            addCriterion("goods_height between", value1, value2, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotBetween(Float value1, Float value2) {
            addCriterion("goods_height not between", value1, value2, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeIsNull() {
            addCriterion("goods_handling_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeIsNotNull() {
            addCriterion("goods_handling_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeEqualTo(String value) {
            addCriterion("goods_handling_type =", value, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeNotEqualTo(String value) {
            addCriterion("goods_handling_type <>", value, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeGreaterThan(String value) {
            addCriterion("goods_handling_type >", value, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_handling_type >=", value, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeLessThan(String value) {
            addCriterion("goods_handling_type <", value, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_handling_type <=", value, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeLike(String value) {
            addCriterion("goods_handling_type like", value, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeNotLike(String value) {
            addCriterion("goods_handling_type not like", value, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeIn(List<String> values) {
            addCriterion("goods_handling_type in", values, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeNotIn(List<String> values) {
            addCriterion("goods_handling_type not in", values, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeBetween(String value1, String value2) {
            addCriterion("goods_handling_type between", value1, value2, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeNotBetween(String value1, String value2) {
            addCriterion("goods_handling_type not between", value1, value2, "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightIsNull() {
            addCriterion("goods_total_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightIsNotNull() {
            addCriterion("goods_total_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightEqualTo(Double value) {
            addCriterion("goods_total_weight =", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightNotEqualTo(Double value) {
            addCriterion("goods_total_weight <>", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightGreaterThan(Double value) {
            addCriterion("goods_total_weight >", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_total_weight >=", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightLessThan(Double value) {
            addCriterion("goods_total_weight <", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightLessThanOrEqualTo(Double value) {
            addCriterion("goods_total_weight <=", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightIn(List<Double> values) {
            addCriterion("goods_total_weight in", values, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightNotIn(List<Double> values) {
            addCriterion("goods_total_weight not in", values, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightBetween(Double value1, Double value2) {
            addCriterion("goods_total_weight between", value1, value2, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightNotBetween(Double value1, Double value2) {
            addCriterion("goods_total_weight not between", value1, value2, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeIsNull() {
            addCriterion("goods_total_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeIsNotNull() {
            addCriterion("goods_total_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeEqualTo(Double value) {
            addCriterion("goods_total_volume =", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeNotEqualTo(Double value) {
            addCriterion("goods_total_volume <>", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeGreaterThan(Double value) {
            addCriterion("goods_total_volume >", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_total_volume >=", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeLessThan(Double value) {
            addCriterion("goods_total_volume <", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeLessThanOrEqualTo(Double value) {
            addCriterion("goods_total_volume <=", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeIn(List<Double> values) {
            addCriterion("goods_total_volume in", values, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeNotIn(List<Double> values) {
            addCriterion("goods_total_volume not in", values, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeBetween(Double value1, Double value2) {
            addCriterion("goods_total_volume between", value1, value2, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeNotBetween(Double value1, Double value2) {
            addCriterion("goods_total_volume not between", value1, value2, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(Integer value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(Integer value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(Integer value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(Integer value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<Integer> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<Integer> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoIsNull() {
            addCriterion("goods_memo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoIsNotNull() {
            addCriterion("goods_memo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoEqualTo(String value) {
            addCriterion("goods_memo =", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoNotEqualTo(String value) {
            addCriterion("goods_memo <>", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoGreaterThan(String value) {
            addCriterion("goods_memo >", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_memo >=", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoLessThan(String value) {
            addCriterion("goods_memo <", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoLessThanOrEqualTo(String value) {
            addCriterion("goods_memo <=", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoLike(String value) {
            addCriterion("goods_memo like", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoNotLike(String value) {
            addCriterion("goods_memo not like", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoIn(List<String> values) {
            addCriterion("goods_memo in", values, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoNotIn(List<String> values) {
            addCriterion("goods_memo not in", values, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoBetween(String value1, String value2) {
            addCriterion("goods_memo between", value1, value2, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoNotBetween(String value1, String value2) {
            addCriterion("goods_memo not between", value1, value2, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeIsNull() {
            addCriterion("goods_stack_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeIsNotNull() {
            addCriterion("goods_stack_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeEqualTo(String value) {
            addCriterion("goods_stack_type =", value, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeNotEqualTo(String value) {
            addCriterion("goods_stack_type <>", value, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeGreaterThan(String value) {
            addCriterion("goods_stack_type >", value, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_stack_type >=", value, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeLessThan(String value) {
            addCriterion("goods_stack_type <", value, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_stack_type <=", value, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeLike(String value) {
            addCriterion("goods_stack_type like", value, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeNotLike(String value) {
            addCriterion("goods_stack_type not like", value, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeIn(List<String> values) {
            addCriterion("goods_stack_type in", values, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeNotIn(List<String> values) {
            addCriterion("goods_stack_type not in", values, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeBetween(String value1, String value2) {
            addCriterion("goods_stack_type between", value1, value2, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeNotBetween(String value1, String value2) {
            addCriterion("goods_stack_type not between", value1, value2, "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceIsNull() {
            addCriterion("need_invoice is null");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceIsNotNull() {
            addCriterion("need_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceEqualTo(Boolean value) {
            addCriterion("need_invoice =", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceNotEqualTo(Boolean value) {
            addCriterion("need_invoice <>", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceGreaterThan(Boolean value) {
            addCriterion("need_invoice >", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("need_invoice >=", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceLessThan(Boolean value) {
            addCriterion("need_invoice <", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("need_invoice <=", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceIn(List<Boolean> values) {
            addCriterion("need_invoice in", values, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceNotIn(List<Boolean> values) {
            addCriterion("need_invoice not in", values, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("need_invoice between", value1, value2, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("need_invoice not between", value1, value2, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(Integer value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(Integer value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(Integer value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(Integer value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<Integer> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<Integer> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyIsNull() {
            addCriterion("need_notify is null");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyIsNotNull() {
            addCriterion("need_notify is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyEqualTo(Boolean value) {
            addCriterion("need_notify =", value, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyNotEqualTo(Boolean value) {
            addCriterion("need_notify <>", value, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyGreaterThan(Boolean value) {
            addCriterion("need_notify >", value, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("need_notify >=", value, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyLessThan(Boolean value) {
            addCriterion("need_notify <", value, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyLessThanOrEqualTo(Boolean value) {
            addCriterion("need_notify <=", value, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyIn(List<Boolean> values) {
            addCriterion("need_notify in", values, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyNotIn(List<Boolean> values) {
            addCriterion("need_notify not in", values, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyBetween(Boolean value1, Boolean value2) {
            addCriterion("need_notify between", value1, value2, "needNotify");
            return (Criteria) this;
        }

        public Criteria andNeedNotifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("need_notify not between", value1, value2, "needNotify");
            return (Criteria) this;
        }

        public Criteria andPickTypeIsNull() {
            addCriterion("pick_type is null");
            return (Criteria) this;
        }

        public Criteria andPickTypeIsNotNull() {
            addCriterion("pick_type is not null");
            return (Criteria) this;
        }

        public Criteria andPickTypeEqualTo(Integer value) {
            addCriterion("pick_type =", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeNotEqualTo(Integer value) {
            addCriterion("pick_type <>", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeGreaterThan(Integer value) {
            addCriterion("pick_type >", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pick_type >=", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeLessThan(Integer value) {
            addCriterion("pick_type <", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pick_type <=", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeIn(List<Integer> values) {
            addCriterion("pick_type in", values, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeNotIn(List<Integer> values) {
            addCriterion("pick_type not in", values, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeBetween(Integer value1, Integer value2) {
            addCriterion("pick_type between", value1, value2, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pick_type not between", value1, value2, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeIsNull() {
            addCriterion("pick_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeIsNotNull() {
            addCriterion("pick_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeEqualTo(String value) {
            addCriterion("pick_begin_time =", value, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeNotEqualTo(String value) {
            addCriterion("pick_begin_time <>", value, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeGreaterThan(String value) {
            addCriterion("pick_begin_time >", value, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pick_begin_time >=", value, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeLessThan(String value) {
            addCriterion("pick_begin_time <", value, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeLessThanOrEqualTo(String value) {
            addCriterion("pick_begin_time <=", value, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeLike(String value) {
            addCriterion("pick_begin_time like", value, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeNotLike(String value) {
            addCriterion("pick_begin_time not like", value, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeIn(List<String> values) {
            addCriterion("pick_begin_time in", values, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeNotIn(List<String> values) {
            addCriterion("pick_begin_time not in", values, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeBetween(String value1, String value2) {
            addCriterion("pick_begin_time between", value1, value2, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeNotBetween(String value1, String value2) {
            addCriterion("pick_begin_time not between", value1, value2, "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeIsNull() {
            addCriterion("pick_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeIsNotNull() {
            addCriterion("pick_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeEqualTo(String value) {
            addCriterion("pick_end_time =", value, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeNotEqualTo(String value) {
            addCriterion("pick_end_time <>", value, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeGreaterThan(String value) {
            addCriterion("pick_end_time >", value, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pick_end_time >=", value, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeLessThan(String value) {
            addCriterion("pick_end_time <", value, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeLessThanOrEqualTo(String value) {
            addCriterion("pick_end_time <=", value, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeLike(String value) {
            addCriterion("pick_end_time like", value, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeNotLike(String value) {
            addCriterion("pick_end_time not like", value, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeIn(List<String> values) {
            addCriterion("pick_end_time in", values, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeNotIn(List<String> values) {
            addCriterion("pick_end_time not in", values, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeBetween(String value1, String value2) {
            addCriterion("pick_end_time between", value1, value2, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeNotBetween(String value1, String value2) {
            addCriterion("pick_end_time not between", value1, value2, "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIsNull() {
            addCriterion("need_receipt is null");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIsNotNull() {
            addCriterion("need_receipt is not null");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptEqualTo(Boolean value) {
            addCriterion("need_receipt =", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotEqualTo(Boolean value) {
            addCriterion("need_receipt <>", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptGreaterThan(Boolean value) {
            addCriterion("need_receipt >", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptGreaterThanOrEqualTo(Boolean value) {
            addCriterion("need_receipt >=", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptLessThan(Boolean value) {
            addCriterion("need_receipt <", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptLessThanOrEqualTo(Boolean value) {
            addCriterion("need_receipt <=", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIn(List<Boolean> values) {
            addCriterion("need_receipt in", values, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotIn(List<Boolean> values) {
            addCriterion("need_receipt not in", values, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptBetween(Boolean value1, Boolean value2) {
            addCriterion("need_receipt between", value1, value2, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotBetween(Boolean value1, Boolean value2) {
            addCriterion("need_receipt not between", value1, value2, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIsNull() {
            addCriterion("goods_value is null");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIsNotNull() {
            addCriterion("goods_value is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsValueEqualTo(BigDecimal value) {
            addCriterion("goods_value =", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotEqualTo(BigDecimal value) {
            addCriterion("goods_value <>", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThan(BigDecimal value) {
            addCriterion("goods_value >", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_value >=", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThan(BigDecimal value) {
            addCriterion("goods_value <", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_value <=", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIn(List<BigDecimal> values) {
            addCriterion("goods_value in", values, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotIn(List<BigDecimal> values) {
            addCriterion("goods_value not in", values, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_value between", value1, value2, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_value not between", value1, value2, "goodsValue");
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

        public Criteria andTransportFeeIsNull() {
            addCriterion("transport_fee is null");
            return (Criteria) this;
        }

        public Criteria andTransportFeeIsNotNull() {
            addCriterion("transport_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTransportFeeEqualTo(BigDecimal value) {
            addCriterion("transport_fee =", value, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeNotEqualTo(BigDecimal value) {
            addCriterion("transport_fee <>", value, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeGreaterThan(BigDecimal value) {
            addCriterion("transport_fee >", value, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transport_fee >=", value, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeLessThan(BigDecimal value) {
            addCriterion("transport_fee <", value, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transport_fee <=", value, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeIn(List<BigDecimal> values) {
            addCriterion("transport_fee in", values, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeNotIn(List<BigDecimal> values) {
            addCriterion("transport_fee not in", values, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transport_fee between", value1, value2, "transportFee");
            return (Criteria) this;
        }

        public Criteria andTransportFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transport_fee not between", value1, value2, "transportFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeIsNull() {
            addCriterion("commission_fee is null");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeIsNotNull() {
            addCriterion("commission_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeEqualTo(BigDecimal value) {
            addCriterion("commission_fee =", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeNotEqualTo(BigDecimal value) {
            addCriterion("commission_fee <>", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeGreaterThan(BigDecimal value) {
            addCriterion("commission_fee >", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_fee >=", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeLessThan(BigDecimal value) {
            addCriterion("commission_fee <", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_fee <=", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeIn(List<BigDecimal> values) {
            addCriterion("commission_fee in", values, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeNotIn(List<BigDecimal> values) {
            addCriterion("commission_fee not in", values, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_fee between", value1, value2, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_fee not between", value1, value2, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(BigDecimal value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(BigDecimal value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<BigDecimal> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeIsNull() {
            addCriterion("consigner_fee is null");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeIsNotNull() {
            addCriterion("consigner_fee is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeEqualTo(BigDecimal value) {
            addCriterion("consigner_fee =", value, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeNotEqualTo(BigDecimal value) {
            addCriterion("consigner_fee <>", value, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeGreaterThan(BigDecimal value) {
            addCriterion("consigner_fee >", value, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consigner_fee >=", value, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeLessThan(BigDecimal value) {
            addCriterion("consigner_fee <", value, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consigner_fee <=", value, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeIn(List<BigDecimal> values) {
            addCriterion("consigner_fee in", values, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeNotIn(List<BigDecimal> values) {
            addCriterion("consigner_fee not in", values, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consigner_fee between", value1, value2, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andConsignerFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consigner_fee not between", value1, value2, "consignerFee");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andShiperNameIsNull() {
            addCriterion("shiper_name is null");
            return (Criteria) this;
        }

        public Criteria andShiperNameIsNotNull() {
            addCriterion("shiper_name is not null");
            return (Criteria) this;
        }

        public Criteria andShiperNameEqualTo(String value) {
            addCriterion("shiper_name =", value, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameNotEqualTo(String value) {
            addCriterion("shiper_name <>", value, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameGreaterThan(String value) {
            addCriterion("shiper_name >", value, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameGreaterThanOrEqualTo(String value) {
            addCriterion("shiper_name >=", value, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameLessThan(String value) {
            addCriterion("shiper_name <", value, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameLessThanOrEqualTo(String value) {
            addCriterion("shiper_name <=", value, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameLike(String value) {
            addCriterion("shiper_name like", value, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameNotLike(String value) {
            addCriterion("shiper_name not like", value, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameIn(List<String> values) {
            addCriterion("shiper_name in", values, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameNotIn(List<String> values) {
            addCriterion("shiper_name not in", values, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameBetween(String value1, String value2) {
            addCriterion("shiper_name between", value1, value2, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperNameNotBetween(String value1, String value2) {
            addCriterion("shiper_name not between", value1, value2, "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanIsNull() {
            addCriterion("shiper_linkman is null");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanIsNotNull() {
            addCriterion("shiper_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanEqualTo(String value) {
            addCriterion("shiper_linkman =", value, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanNotEqualTo(String value) {
            addCriterion("shiper_linkman <>", value, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanGreaterThan(String value) {
            addCriterion("shiper_linkman >", value, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("shiper_linkman >=", value, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanLessThan(String value) {
            addCriterion("shiper_linkman <", value, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanLessThanOrEqualTo(String value) {
            addCriterion("shiper_linkman <=", value, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanLike(String value) {
            addCriterion("shiper_linkman like", value, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanNotLike(String value) {
            addCriterion("shiper_linkman not like", value, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanIn(List<String> values) {
            addCriterion("shiper_linkman in", values, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanNotIn(List<String> values) {
            addCriterion("shiper_linkman not in", values, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanBetween(String value1, String value2) {
            addCriterion("shiper_linkman between", value1, value2, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanNotBetween(String value1, String value2) {
            addCriterion("shiper_linkman not between", value1, value2, "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperMobileIsNull() {
            addCriterion("shiper_mobile is null");
            return (Criteria) this;
        }

        public Criteria andShiperMobileIsNotNull() {
            addCriterion("shiper_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andShiperMobileEqualTo(String value) {
            addCriterion("shiper_mobile =", value, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileNotEqualTo(String value) {
            addCriterion("shiper_mobile <>", value, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileGreaterThan(String value) {
            addCriterion("shiper_mobile >", value, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileGreaterThanOrEqualTo(String value) {
            addCriterion("shiper_mobile >=", value, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileLessThan(String value) {
            addCriterion("shiper_mobile <", value, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileLessThanOrEqualTo(String value) {
            addCriterion("shiper_mobile <=", value, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileLike(String value) {
            addCriterion("shiper_mobile like", value, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileNotLike(String value) {
            addCriterion("shiper_mobile not like", value, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileIn(List<String> values) {
            addCriterion("shiper_mobile in", values, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileNotIn(List<String> values) {
            addCriterion("shiper_mobile not in", values, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileBetween(String value1, String value2) {
            addCriterion("shiper_mobile between", value1, value2, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShiperMobileNotBetween(String value1, String value2) {
            addCriterion("shiper_mobile not between", value1, value2, "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdIsNull() {
            addCriterion("shipper_account_id is null");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdIsNotNull() {
            addCriterion("shipper_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdEqualTo(Long value) {
            addCriterion("shipper_account_id =", value, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdNotEqualTo(Long value) {
            addCriterion("shipper_account_id <>", value, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdGreaterThan(Long value) {
            addCriterion("shipper_account_id >", value, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shipper_account_id >=", value, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdLessThan(Long value) {
            addCriterion("shipper_account_id <", value, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("shipper_account_id <=", value, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdIn(List<Long> values) {
            addCriterion("shipper_account_id in", values, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdNotIn(List<Long> values) {
            addCriterion("shipper_account_id not in", values, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdBetween(Long value1, Long value2) {
            addCriterion("shipper_account_id between", value1, value2, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andShipperAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("shipper_account_id not between", value1, value2, "shipperAccountId");
            return (Criteria) this;
        }

        public Criteria andArriveDaysIsNull() {
            addCriterion("arrive_days is null");
            return (Criteria) this;
        }

        public Criteria andArriveDaysIsNotNull() {
            addCriterion("arrive_days is not null");
            return (Criteria) this;
        }

        public Criteria andArriveDaysEqualTo(Integer value) {
            addCriterion("arrive_days =", value, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysNotEqualTo(Integer value) {
            addCriterion("arrive_days <>", value, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysGreaterThan(Integer value) {
            addCriterion("arrive_days >", value, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrive_days >=", value, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysLessThan(Integer value) {
            addCriterion("arrive_days <", value, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysLessThanOrEqualTo(Integer value) {
            addCriterion("arrive_days <=", value, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysIn(List<Integer> values) {
            addCriterion("arrive_days in", values, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysNotIn(List<Integer> values) {
            addCriterion("arrive_days not in", values, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysBetween(Integer value1, Integer value2) {
            addCriterion("arrive_days between", value1, value2, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andArriveDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("arrive_days not between", value1, value2, "arriveDays");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andChildStatusIsNull() {
            addCriterion("child_status is null");
            return (Criteria) this;
        }

        public Criteria andChildStatusIsNotNull() {
            addCriterion("child_status is not null");
            return (Criteria) this;
        }

        public Criteria andChildStatusEqualTo(Integer value) {
            addCriterion("child_status =", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusNotEqualTo(Integer value) {
            addCriterion("child_status <>", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusGreaterThan(Integer value) {
            addCriterion("child_status >", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_status >=", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusLessThan(Integer value) {
            addCriterion("child_status <", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusLessThanOrEqualTo(Integer value) {
            addCriterion("child_status <=", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusIn(List<Integer> values) {
            addCriterion("child_status in", values, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusNotIn(List<Integer> values) {
            addCriterion("child_status not in", values, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusBetween(Integer value1, Integer value2) {
            addCriterion("child_status between", value1, value2, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("child_status not between", value1, value2, "childStatus");
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

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNull() {
            addCriterion("come_from is null");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNotNull() {
            addCriterion("come_from is not null");
            return (Criteria) this;
        }

        public Criteria andComeFromEqualTo(Integer value) {
            addCriterion("come_from =", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotEqualTo(Integer value) {
            addCriterion("come_from <>", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThan(Integer value) {
            addCriterion("come_from >", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("come_from >=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThan(Integer value) {
            addCriterion("come_from <", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThanOrEqualTo(Integer value) {
            addCriterion("come_from <=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromIn(List<Integer> values) {
            addCriterion("come_from in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotIn(List<Integer> values) {
            addCriterion("come_from not in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromBetween(Integer value1, Integer value2) {
            addCriterion("come_from between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotBetween(Integer value1, Integer value2) {
            addCriterion("come_from not between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileIsNull() {
            addCriterion("notify_mobile is null");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileIsNotNull() {
            addCriterion("notify_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileEqualTo(String value) {
            addCriterion("notify_mobile =", value, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileNotEqualTo(String value) {
            addCriterion("notify_mobile <>", value, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileGreaterThan(String value) {
            addCriterion("notify_mobile >", value, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileGreaterThanOrEqualTo(String value) {
            addCriterion("notify_mobile >=", value, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileLessThan(String value) {
            addCriterion("notify_mobile <", value, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileLessThanOrEqualTo(String value) {
            addCriterion("notify_mobile <=", value, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileLike(String value) {
            addCriterion("notify_mobile like", value, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileNotLike(String value) {
            addCriterion("notify_mobile not like", value, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileIn(List<String> values) {
            addCriterion("notify_mobile in", values, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileNotIn(List<String> values) {
            addCriterion("notify_mobile not in", values, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileBetween(String value1, String value2) {
            addCriterion("notify_mobile between", value1, value2, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileNotBetween(String value1, String value2) {
            addCriterion("notify_mobile not between", value1, value2, "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andCloseReasonIsNull() {
            addCriterion("close_reason is null");
            return (Criteria) this;
        }

        public Criteria andCloseReasonIsNotNull() {
            addCriterion("close_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCloseReasonEqualTo(String value) {
            addCriterion("close_reason =", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotEqualTo(String value) {
            addCriterion("close_reason <>", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonGreaterThan(String value) {
            addCriterion("close_reason >", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("close_reason >=", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLessThan(String value) {
            addCriterion("close_reason <", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLessThanOrEqualTo(String value) {
            addCriterion("close_reason <=", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLike(String value) {
            addCriterion("close_reason like", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotLike(String value) {
            addCriterion("close_reason not like", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonIn(List<String> values) {
            addCriterion("close_reason in", values, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotIn(List<String> values) {
            addCriterion("close_reason not in", values, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonBetween(String value1, String value2) {
            addCriterion("close_reason between", value1, value2, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotBetween(String value1, String value2) {
            addCriterion("close_reason not between", value1, value2, "closeReason");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIsNull() {
            addCriterion("invoice_fee is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIsNotNull() {
            addCriterion("invoice_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeEqualTo(BigDecimal value) {
            addCriterion("invoice_fee =", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("invoice_fee <>", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeGreaterThan(BigDecimal value) {
            addCriterion("invoice_fee >", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_fee >=", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeLessThan(BigDecimal value) {
            addCriterion("invoice_fee <", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_fee <=", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIn(List<BigDecimal> values) {
            addCriterion("invoice_fee in", values, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("invoice_fee not in", values, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_fee between", value1, value2, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_fee not between", value1, value2, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andIsInternalIsNull() {
            addCriterion("is_internal is null");
            return (Criteria) this;
        }

        public Criteria andIsInternalIsNotNull() {
            addCriterion("is_internal is not null");
            return (Criteria) this;
        }

        public Criteria andIsInternalEqualTo(Integer value) {
            addCriterion("is_internal =", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalNotEqualTo(Integer value) {
            addCriterion("is_internal <>", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalGreaterThan(Integer value) {
            addCriterion("is_internal >", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_internal >=", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalLessThan(Integer value) {
            addCriterion("is_internal <", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalLessThanOrEqualTo(Integer value) {
            addCriterion("is_internal <=", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalIn(List<Integer> values) {
            addCriterion("is_internal in", values, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalNotIn(List<Integer> values) {
            addCriterion("is_internal not in", values, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalBetween(Integer value1, Integer value2) {
            addCriterion("is_internal between", value1, value2, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalNotBetween(Integer value1, Integer value2) {
            addCriterion("is_internal not between", value1, value2, "isInternal");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(Integer value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Integer value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Integer value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Integer value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Integer value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Integer> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Integer> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Integer value1, Integer value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Long value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Long value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Long value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Long value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Long> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Long> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(Integer value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(Integer value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(Integer value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(Integer value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<Integer> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<Integer> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(Integer value1, Integer value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNull() {
            addCriterion("goods_spec is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNotNull() {
            addCriterion("goods_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecEqualTo(String value) {
            addCriterion("goods_spec =", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotEqualTo(String value) {
            addCriterion("goods_spec <>", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThan(String value) {
            addCriterion("goods_spec >", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec >=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThan(String value) {
            addCriterion("goods_spec <", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThanOrEqualTo(String value) {
            addCriterion("goods_spec <=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLike(String value) {
            addCriterion("goods_spec like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotLike(String value) {
            addCriterion("goods_spec not like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIn(List<String> values) {
            addCriterion("goods_spec in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotIn(List<String> values) {
            addCriterion("goods_spec not in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecBetween(String value1, String value2) {
            addCriterion("goods_spec between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotBetween(String value1, String value2) {
            addCriterion("goods_spec not between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeIsNull() {
            addCriterion("real_transport_fee is null");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeIsNotNull() {
            addCriterion("real_transport_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeEqualTo(BigDecimal value) {
            addCriterion("real_transport_fee =", value, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeNotEqualTo(BigDecimal value) {
            addCriterion("real_transport_fee <>", value, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeGreaterThan(BigDecimal value) {
            addCriterion("real_transport_fee >", value, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_transport_fee >=", value, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeLessThan(BigDecimal value) {
            addCriterion("real_transport_fee <", value, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_transport_fee <=", value, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeIn(List<BigDecimal> values) {
            addCriterion("real_transport_fee in", values, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeNotIn(List<BigDecimal> values) {
            addCriterion("real_transport_fee not in", values, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_transport_fee between", value1, value2, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andRealTransportFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_transport_fee not between", value1, value2, "realTransportFee");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIsNull() {
            addCriterion("waybill_no is null");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIsNotNull() {
            addCriterion("waybill_no is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillNoEqualTo(String value) {
            addCriterion("waybill_no =", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotEqualTo(String value) {
            addCriterion("waybill_no <>", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoGreaterThan(String value) {
            addCriterion("waybill_no >", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_no >=", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLessThan(String value) {
            addCriterion("waybill_no <", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLessThanOrEqualTo(String value) {
            addCriterion("waybill_no <=", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLike(String value) {
            addCriterion("waybill_no like", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotLike(String value) {
            addCriterion("waybill_no not like", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIn(List<String> values) {
            addCriterion("waybill_no in", values, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotIn(List<String> values) {
            addCriterion("waybill_no not in", values, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoBetween(String value1, String value2) {
            addCriterion("waybill_no between", value1, value2, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotBetween(String value1, String value2) {
            addCriterion("waybill_no not between", value1, value2, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("branch_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(Long value) {
            addCriterion("branch_id =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(Long value) {
            addCriterion("branch_id <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(Long value) {
            addCriterion("branch_id >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("branch_id >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(Long value) {
            addCriterion("branch_id <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(Long value) {
            addCriterion("branch_id <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<Long> values) {
            addCriterion("branch_id in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<Long> values) {
            addCriterion("branch_id not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(Long value1, Long value2) {
            addCriterion("branch_id between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(Long value1, Long value2) {
            addCriterion("branch_id not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeIsNull() {
            addCriterion("reduce_insurance_fee is null");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeIsNotNull() {
            addCriterion("reduce_insurance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeEqualTo(BigDecimal value) {
            addCriterion("reduce_insurance_fee =", value, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeNotEqualTo(BigDecimal value) {
            addCriterion("reduce_insurance_fee <>", value, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeGreaterThan(BigDecimal value) {
            addCriterion("reduce_insurance_fee >", value, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reduce_insurance_fee >=", value, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeLessThan(BigDecimal value) {
            addCriterion("reduce_insurance_fee <", value, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reduce_insurance_fee <=", value, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeIn(List<BigDecimal> values) {
            addCriterion("reduce_insurance_fee in", values, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeNotIn(List<BigDecimal> values) {
            addCriterion("reduce_insurance_fee not in", values, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduce_insurance_fee between", value1, value2, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andReduceInsuranceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduce_insurance_fee not between", value1, value2, "reduceInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeIsNull() {
            addCriterion("give_insurance_fee is null");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeIsNotNull() {
            addCriterion("give_insurance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeEqualTo(BigDecimal value) {
            addCriterion("give_insurance_fee =", value, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeNotEqualTo(BigDecimal value) {
            addCriterion("give_insurance_fee <>", value, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeGreaterThan(BigDecimal value) {
            addCriterion("give_insurance_fee >", value, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("give_insurance_fee >=", value, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeLessThan(BigDecimal value) {
            addCriterion("give_insurance_fee <", value, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("give_insurance_fee <=", value, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeIn(List<BigDecimal> values) {
            addCriterion("give_insurance_fee in", values, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeNotIn(List<BigDecimal> values) {
            addCriterion("give_insurance_fee not in", values, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("give_insurance_fee between", value1, value2, "giveInsuranceFee");
            return (Criteria) this;
        }

        public Criteria andGiveInsuranceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("give_insurance_fee not between", value1, value2, "giveInsuranceFee");
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

        public Criteria andRealInsuranceFeeRateIsNull() {
            addCriterion("real_insurance_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateIsNotNull() {
            addCriterion("real_insurance_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateEqualTo(BigDecimal value) {
            addCriterion("real_insurance_fee_rate =", value, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateNotEqualTo(BigDecimal value) {
            addCriterion("real_insurance_fee_rate <>", value, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateGreaterThan(BigDecimal value) {
            addCriterion("real_insurance_fee_rate >", value, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_insurance_fee_rate >=", value, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateLessThan(BigDecimal value) {
            addCriterion("real_insurance_fee_rate <", value, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_insurance_fee_rate <=", value, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateIn(List<BigDecimal> values) {
            addCriterion("real_insurance_fee_rate in", values, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateNotIn(List<BigDecimal> values) {
            addCriterion("real_insurance_fee_rate not in", values, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_insurance_fee_rate between", value1, value2, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andRealInsuranceFeeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_insurance_fee_rate not between", value1, value2, "realInsuranceFeeRate");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeIsNull() {
            addCriterion("promise_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeIsNotNull() {
            addCriterion("promise_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeEqualTo(Date value) {
            addCriterion("promise_arrive_time =", value, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeNotEqualTo(Date value) {
            addCriterion("promise_arrive_time <>", value, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeGreaterThan(Date value) {
            addCriterion("promise_arrive_time >", value, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("promise_arrive_time >=", value, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeLessThan(Date value) {
            addCriterion("promise_arrive_time <", value, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("promise_arrive_time <=", value, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeIn(List<Date> values) {
            addCriterion("promise_arrive_time in", values, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeNotIn(List<Date> values) {
            addCriterion("promise_arrive_time not in", values, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeBetween(Date value1, Date value2) {
            addCriterion("promise_arrive_time between", value1, value2, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andPromiseArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("promise_arrive_time not between", value1, value2, "promiseArriveTime");
            return (Criteria) this;
        }

        public Criteria andQueryNoIsNull() {
            addCriterion("query_no is null");
            return (Criteria) this;
        }

        public Criteria andQueryNoIsNotNull() {
            addCriterion("query_no is not null");
            return (Criteria) this;
        }

        public Criteria andQueryNoEqualTo(String value) {
            addCriterion("query_no =", value, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoNotEqualTo(String value) {
            addCriterion("query_no <>", value, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoGreaterThan(String value) {
            addCriterion("query_no >", value, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoGreaterThanOrEqualTo(String value) {
            addCriterion("query_no >=", value, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoLessThan(String value) {
            addCriterion("query_no <", value, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoLessThanOrEqualTo(String value) {
            addCriterion("query_no <=", value, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoLike(String value) {
            addCriterion("query_no like", value, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoNotLike(String value) {
            addCriterion("query_no not like", value, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoIn(List<String> values) {
            addCriterion("query_no in", values, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoNotIn(List<String> values) {
            addCriterion("query_no not in", values, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoBetween(String value1, String value2) {
            addCriterion("query_no between", value1, value2, "queryNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoNotBetween(String value1, String value2) {
            addCriterion("query_no not between", value1, value2, "queryNo");
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

        public Criteria andIsAcceptanceIsNull() {
            addCriterion("is_acceptance is null");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceIsNotNull() {
            addCriterion("is_acceptance is not null");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceEqualTo(Boolean value) {
            addCriterion("is_acceptance =", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceNotEqualTo(Boolean value) {
            addCriterion("is_acceptance <>", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceGreaterThan(Boolean value) {
            addCriterion("is_acceptance >", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_acceptance >=", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceLessThan(Boolean value) {
            addCriterion("is_acceptance <", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceLessThanOrEqualTo(Boolean value) {
            addCriterion("is_acceptance <=", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceIn(List<Boolean> values) {
            addCriterion("is_acceptance in", values, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceNotIn(List<Boolean> values) {
            addCriterion("is_acceptance not in", values, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceBetween(Boolean value1, Boolean value2) {
            addCriterion("is_acceptance between", value1, value2, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_acceptance not between", value1, value2, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsExceptionIsNull() {
            addCriterion("is_exception is null");
            return (Criteria) this;
        }

        public Criteria andIsExceptionIsNotNull() {
            addCriterion("is_exception is not null");
            return (Criteria) this;
        }

        public Criteria andIsExceptionEqualTo(Boolean value) {
            addCriterion("is_exception =", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotEqualTo(Boolean value) {
            addCriterion("is_exception <>", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionGreaterThan(Boolean value) {
            addCriterion("is_exception >", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_exception >=", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionLessThan(Boolean value) {
            addCriterion("is_exception <", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionLessThanOrEqualTo(Boolean value) {
            addCriterion("is_exception <=", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionIn(List<Boolean> values) {
            addCriterion("is_exception in", values, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotIn(List<Boolean> values) {
            addCriterion("is_exception not in", values, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionBetween(Boolean value1, Boolean value2) {
            addCriterion("is_exception between", value1, value2, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_exception not between", value1, value2, "isException");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeIsNull() {
            addCriterion("is_overtime is null");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeIsNotNull() {
            addCriterion("is_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeEqualTo(Boolean value) {
            addCriterion("is_overtime =", value, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeNotEqualTo(Boolean value) {
            addCriterion("is_overtime <>", value, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeGreaterThan(Boolean value) {
            addCriterion("is_overtime >", value, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_overtime >=", value, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeLessThan(Boolean value) {
            addCriterion("is_overtime <", value, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_overtime <=", value, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeIn(List<Boolean> values) {
            addCriterion("is_overtime in", values, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeNotIn(List<Boolean> values) {
            addCriterion("is_overtime not in", values, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_overtime between", value1, value2, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andIsOvertimeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_overtime not between", value1, value2, "isOvertime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNull() {
            addCriterion("enter_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNotNull() {
            addCriterion("enter_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeEqualTo(Date value) {
            addCriterion("enter_time =", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotEqualTo(Date value) {
            addCriterion("enter_time <>", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThan(Date value) {
            addCriterion("enter_time >", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_time >=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThan(Date value) {
            addCriterion("enter_time <", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThanOrEqualTo(Date value) {
            addCriterion("enter_time <=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIn(List<Date> values) {
            addCriterion("enter_time in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotIn(List<Date> values) {
            addCriterion("enter_time not in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeBetween(Date value1, Date value2) {
            addCriterion("enter_time between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotBetween(Date value1, Date value2) {
            addCriterion("enter_time not between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonIsNull() {
            addCriterion("other_close_reason is null");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonIsNotNull() {
            addCriterion("other_close_reason is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonEqualTo(String value) {
            addCriterion("other_close_reason =", value, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonNotEqualTo(String value) {
            addCriterion("other_close_reason <>", value, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonGreaterThan(String value) {
            addCriterion("other_close_reason >", value, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("other_close_reason >=", value, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonLessThan(String value) {
            addCriterion("other_close_reason <", value, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonLessThanOrEqualTo(String value) {
            addCriterion("other_close_reason <=", value, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonLike(String value) {
            addCriterion("other_close_reason like", value, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonNotLike(String value) {
            addCriterion("other_close_reason not like", value, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonIn(List<String> values) {
            addCriterion("other_close_reason in", values, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonNotIn(List<String> values) {
            addCriterion("other_close_reason not in", values, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonBetween(String value1, String value2) {
            addCriterion("other_close_reason between", value1, value2, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonNotBetween(String value1, String value2) {
            addCriterion("other_close_reason not between", value1, value2, "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNull() {
            addCriterion("departure is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNotNull() {
            addCriterion("departure is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureEqualTo(Integer value) {
            addCriterion("departure =", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotEqualTo(Integer value) {
            addCriterion("departure <>", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThan(Integer value) {
            addCriterion("departure >", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThanOrEqualTo(Integer value) {
            addCriterion("departure >=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThan(Integer value) {
            addCriterion("departure <", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThanOrEqualTo(Integer value) {
            addCriterion("departure <=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureIn(List<Integer> values) {
            addCriterion("departure in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotIn(List<Integer> values) {
            addCriterion("departure not in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureBetween(Integer value1, Integer value2) {
            addCriterion("departure between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotBetween(Integer value1, Integer value2) {
            addCriterion("departure not between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNull() {
            addCriterion("departure_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNotNull() {
            addCriterion("departure_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeEqualTo(Date value) {
            addCriterion("departure_time =", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotEqualTo(Date value) {
            addCriterion("departure_time <>", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThan(Date value) {
            addCriterion("departure_time >", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("departure_time >=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThan(Date value) {
            addCriterion("departure_time <", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThanOrEqualTo(Date value) {
            addCriterion("departure_time <=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIn(List<Date> values) {
            addCriterion("departure_time in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotIn(List<Date> values) {
            addCriterion("departure_time not in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeBetween(Date value1, Date value2) {
            addCriterion("departure_time between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotBetween(Date value1, Date value2) {
            addCriterion("departure_time not between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeIsNull() {
            addCriterion("next_track_time is null");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeIsNotNull() {
            addCriterion("next_track_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeEqualTo(Date value) {
            addCriterion("next_track_time =", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeNotEqualTo(Date value) {
            addCriterion("next_track_time <>", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeGreaterThan(Date value) {
            addCriterion("next_track_time >", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("next_track_time >=", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeLessThan(Date value) {
            addCriterion("next_track_time <", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeLessThanOrEqualTo(Date value) {
            addCriterion("next_track_time <=", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeIn(List<Date> values) {
            addCriterion("next_track_time in", values, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeNotIn(List<Date> values) {
            addCriterion("next_track_time not in", values, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeBetween(Date value1, Date value2) {
            addCriterion("next_track_time between", value1, value2, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeNotBetween(Date value1, Date value2) {
            addCriterion("next_track_time not between", value1, value2, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeIsNull() {
            addCriterion("last_notic_time is null");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeIsNotNull() {
            addCriterion("last_notic_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeEqualTo(Date value) {
            addCriterion("last_notic_time =", value, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeNotEqualTo(Date value) {
            addCriterion("last_notic_time <>", value, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeGreaterThan(Date value) {
            addCriterion("last_notic_time >", value, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_notic_time >=", value, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeLessThan(Date value) {
            addCriterion("last_notic_time <", value, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_notic_time <=", value, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeIn(List<Date> values) {
            addCriterion("last_notic_time in", values, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeNotIn(List<Date> values) {
            addCriterion("last_notic_time not in", values, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeBetween(Date value1, Date value2) {
            addCriterion("last_notic_time between", value1, value2, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andLastNoticTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_notic_time not between", value1, value2, "lastNoticTime");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusIsNull() {
            addCriterion("exception_status is null");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusIsNotNull() {
            addCriterion("exception_status is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusEqualTo(Integer value) {
            addCriterion("exception_status =", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusNotEqualTo(Integer value) {
            addCriterion("exception_status <>", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusGreaterThan(Integer value) {
            addCriterion("exception_status >", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exception_status >=", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusLessThan(Integer value) {
            addCriterion("exception_status <", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exception_status <=", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusIn(List<Integer> values) {
            addCriterion("exception_status in", values, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusNotIn(List<Integer> values) {
            addCriterion("exception_status not in", values, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusBetween(Integer value1, Integer value2) {
            addCriterion("exception_status between", value1, value2, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exception_status not between", value1, value2, "exceptionStatus");
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

        public Criteria andIsUpdateIsNull() {
            addCriterion("is_update is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateIsNotNull() {
            addCriterion("is_update is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateEqualTo(Integer value) {
            addCriterion("is_update =", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateNotEqualTo(Integer value) {
            addCriterion("is_update <>", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateGreaterThan(Integer value) {
            addCriterion("is_update >", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_update >=", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateLessThan(Integer value) {
            addCriterion("is_update <", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("is_update <=", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateIn(List<Integer> values) {
            addCriterion("is_update in", values, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateNotIn(List<Integer> values) {
            addCriterion("is_update not in", values, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateBetween(Integer value1, Integer value2) {
            addCriterion("is_update between", value1, value2, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_update not between", value1, value2, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeIsNull() {
            addCriterion("need_arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeIsNotNull() {
            addCriterion("need_arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeEqualTo(Date value) {
            addCriterion("need_arrival_time =", value, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeNotEqualTo(Date value) {
            addCriterion("need_arrival_time <>", value, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeGreaterThan(Date value) {
            addCriterion("need_arrival_time >", value, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("need_arrival_time >=", value, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeLessThan(Date value) {
            addCriterion("need_arrival_time <", value, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("need_arrival_time <=", value, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeIn(List<Date> values) {
            addCriterion("need_arrival_time in", values, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeNotIn(List<Date> values) {
            addCriterion("need_arrival_time not in", values, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("need_arrival_time between", value1, value2, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andNeedArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("need_arrival_time not between", value1, value2, "needArrivalTime");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsIsNull() {
            addCriterion("is_normal_parts is null");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsIsNotNull() {
            addCriterion("is_normal_parts is not null");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsEqualTo(Integer value) {
            addCriterion("is_normal_parts =", value, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsNotEqualTo(Integer value) {
            addCriterion("is_normal_parts <>", value, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsGreaterThan(Integer value) {
            addCriterion("is_normal_parts >", value, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_normal_parts >=", value, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsLessThan(Integer value) {
            addCriterion("is_normal_parts <", value, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsLessThanOrEqualTo(Integer value) {
            addCriterion("is_normal_parts <=", value, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsIn(List<Integer> values) {
            addCriterion("is_normal_parts in", values, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsNotIn(List<Integer> values) {
            addCriterion("is_normal_parts not in", values, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsBetween(Integer value1, Integer value2) {
            addCriterion("is_normal_parts between", value1, value2, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andIsNormalPartsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_normal_parts not between", value1, value2, "isNormalParts");
            return (Criteria) this;
        }

        public Criteria andTradeMemoIsNull() {
            addCriterion("trade_memo is null");
            return (Criteria) this;
        }

        public Criteria andTradeMemoIsNotNull() {
            addCriterion("trade_memo is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMemoEqualTo(String value) {
            addCriterion("trade_memo =", value, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoNotEqualTo(String value) {
            addCriterion("trade_memo <>", value, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoGreaterThan(String value) {
            addCriterion("trade_memo >", value, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_memo >=", value, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoLessThan(String value) {
            addCriterion("trade_memo <", value, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoLessThanOrEqualTo(String value) {
            addCriterion("trade_memo <=", value, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoLike(String value) {
            addCriterion("trade_memo like", value, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoNotLike(String value) {
            addCriterion("trade_memo not like", value, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoIn(List<String> values) {
            addCriterion("trade_memo in", values, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoNotIn(List<String> values) {
            addCriterion("trade_memo not in", values, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoBetween(String value1, String value2) {
            addCriterion("trade_memo between", value1, value2, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andTradeMemoNotBetween(String value1, String value2) {
            addCriterion("trade_memo not between", value1, value2, "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andNeedDepotIsNull() {
            addCriterion("need_depot is null");
            return (Criteria) this;
        }

        public Criteria andNeedDepotIsNotNull() {
            addCriterion("need_depot is not null");
            return (Criteria) this;
        }

        public Criteria andNeedDepotEqualTo(Boolean value) {
            addCriterion("need_depot =", value, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotNotEqualTo(Boolean value) {
            addCriterion("need_depot <>", value, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotGreaterThan(Boolean value) {
            addCriterion("need_depot >", value, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("need_depot >=", value, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotLessThan(Boolean value) {
            addCriterion("need_depot <", value, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotLessThanOrEqualTo(Boolean value) {
            addCriterion("need_depot <=", value, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotIn(List<Boolean> values) {
            addCriterion("need_depot in", values, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotNotIn(List<Boolean> values) {
            addCriterion("need_depot not in", values, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotBetween(Boolean value1, Boolean value2) {
            addCriterion("need_depot between", value1, value2, "needDepot");
            return (Criteria) this;
        }

        public Criteria andNeedDepotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("need_depot not between", value1, value2, "needDepot");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNull() {
            addCriterion("discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNotNull() {
            addCriterion("discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeEqualTo(BigDecimal value) {
            addCriterion("discount_fee =", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotEqualTo(BigDecimal value) {
            addCriterion("discount_fee <>", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThan(BigDecimal value) {
            addCriterion("discount_fee >", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_fee >=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThan(BigDecimal value) {
            addCriterion("discount_fee <", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_fee <=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIn(List<BigDecimal> values) {
            addCriterion("discount_fee in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotIn(List<BigDecimal> values) {
            addCriterion("discount_fee not in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_fee between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_fee not between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andTransitNumIsNull() {
            addCriterion("transit_num is null");
            return (Criteria) this;
        }

        public Criteria andTransitNumIsNotNull() {
            addCriterion("transit_num is not null");
            return (Criteria) this;
        }

        public Criteria andTransitNumEqualTo(Integer value) {
            addCriterion("transit_num =", value, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumNotEqualTo(Integer value) {
            addCriterion("transit_num <>", value, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumGreaterThan(Integer value) {
            addCriterion("transit_num >", value, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("transit_num >=", value, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumLessThan(Integer value) {
            addCriterion("transit_num <", value, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumLessThanOrEqualTo(Integer value) {
            addCriterion("transit_num <=", value, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumIn(List<Integer> values) {
            addCriterion("transit_num in", values, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumNotIn(List<Integer> values) {
            addCriterion("transit_num not in", values, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumBetween(Integer value1, Integer value2) {
            addCriterion("transit_num between", value1, value2, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("transit_num not between", value1, value2, "transitNum");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeIsNull() {
            addCriterion("transit_run_time is null");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeIsNotNull() {
            addCriterion("transit_run_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeEqualTo(Integer value) {
            addCriterion("transit_run_time =", value, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeNotEqualTo(Integer value) {
            addCriterion("transit_run_time <>", value, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeGreaterThan(Integer value) {
            addCriterion("transit_run_time >", value, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transit_run_time >=", value, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeLessThan(Integer value) {
            addCriterion("transit_run_time <", value, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeLessThanOrEqualTo(Integer value) {
            addCriterion("transit_run_time <=", value, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeIn(List<Integer> values) {
            addCriterion("transit_run_time in", values, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeNotIn(List<Integer> values) {
            addCriterion("transit_run_time not in", values, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeBetween(Integer value1, Integer value2) {
            addCriterion("transit_run_time between", value1, value2, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andTransitRunTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("transit_run_time not between", value1, value2, "transitRunTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeIsNull() {
            addCriterion("arrive_alloc_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeIsNotNull() {
            addCriterion("arrive_alloc_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeEqualTo(Date value) {
            addCriterion("arrive_alloc_time =", value, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeNotEqualTo(Date value) {
            addCriterion("arrive_alloc_time <>", value, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeGreaterThan(Date value) {
            addCriterion("arrive_alloc_time >", value, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_alloc_time >=", value, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeLessThan(Date value) {
            addCriterion("arrive_alloc_time <", value, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrive_alloc_time <=", value, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeIn(List<Date> values) {
            addCriterion("arrive_alloc_time in", values, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeNotIn(List<Date> values) {
            addCriterion("arrive_alloc_time not in", values, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeBetween(Date value1, Date value2) {
            addCriterion("arrive_alloc_time between", value1, value2, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andArriveAllocTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrive_alloc_time not between", value1, value2, "arriveAllocTime");
            return (Criteria) this;
        }

        public Criteria andAllocIdIsNull() {
            addCriterion("alloc_id is null");
            return (Criteria) this;
        }

        public Criteria andAllocIdIsNotNull() {
            addCriterion("alloc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllocIdEqualTo(Long value) {
            addCriterion("alloc_id =", value, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdNotEqualTo(Long value) {
            addCriterion("alloc_id <>", value, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdGreaterThan(Long value) {
            addCriterion("alloc_id >", value, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdGreaterThanOrEqualTo(Long value) {
            addCriterion("alloc_id >=", value, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdLessThan(Long value) {
            addCriterion("alloc_id <", value, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdLessThanOrEqualTo(Long value) {
            addCriterion("alloc_id <=", value, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdIn(List<Long> values) {
            addCriterion("alloc_id in", values, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdNotIn(List<Long> values) {
            addCriterion("alloc_id not in", values, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdBetween(Long value1, Long value2) {
            addCriterion("alloc_id between", value1, value2, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocIdNotBetween(Long value1, Long value2) {
            addCriterion("alloc_id not between", value1, value2, "allocId");
            return (Criteria) this;
        }

        public Criteria andAllocNameIsNull() {
            addCriterion("alloc_name is null");
            return (Criteria) this;
        }

        public Criteria andAllocNameIsNotNull() {
            addCriterion("alloc_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllocNameEqualTo(String value) {
            addCriterion("alloc_name =", value, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameNotEqualTo(String value) {
            addCriterion("alloc_name <>", value, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameGreaterThan(String value) {
            addCriterion("alloc_name >", value, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameGreaterThanOrEqualTo(String value) {
            addCriterion("alloc_name >=", value, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameLessThan(String value) {
            addCriterion("alloc_name <", value, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameLessThanOrEqualTo(String value) {
            addCriterion("alloc_name <=", value, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameLike(String value) {
            addCriterion("alloc_name like", value, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameNotLike(String value) {
            addCriterion("alloc_name not like", value, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameIn(List<String> values) {
            addCriterion("alloc_name in", values, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameNotIn(List<String> values) {
            addCriterion("alloc_name not in", values, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameBetween(String value1, String value2) {
            addCriterion("alloc_name between", value1, value2, "allocName");
            return (Criteria) this;
        }

        public Criteria andAllocNameNotBetween(String value1, String value2) {
            addCriterion("alloc_name not between", value1, value2, "allocName");
            return (Criteria) this;
        }

        public Criteria andIsGenIsNull() {
            addCriterion("is_gen is null");
            return (Criteria) this;
        }

        public Criteria andIsGenIsNotNull() {
            addCriterion("is_gen is not null");
            return (Criteria) this;
        }

        public Criteria andIsGenEqualTo(Integer value) {
            addCriterion("is_gen =", value, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenNotEqualTo(Integer value) {
            addCriterion("is_gen <>", value, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenGreaterThan(Integer value) {
            addCriterion("is_gen >", value, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_gen >=", value, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenLessThan(Integer value) {
            addCriterion("is_gen <", value, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenLessThanOrEqualTo(Integer value) {
            addCriterion("is_gen <=", value, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenIn(List<Integer> values) {
            addCriterion("is_gen in", values, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenNotIn(List<Integer> values) {
            addCriterion("is_gen not in", values, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenBetween(Integer value1, Integer value2) {
            addCriterion("is_gen between", value1, value2, "isGen");
            return (Criteria) this;
        }

        public Criteria andIsGenNotBetween(Integer value1, Integer value2) {
            addCriterion("is_gen not between", value1, value2, "isGen");
            return (Criteria) this;
        }

        public Criteria andTradeNoLikeInsensitive(String value) {
            addCriterion("upper(trade_no) like", value.toUpperCase(), "tradeNo");
            return (Criteria) this;
        }

        public Criteria andConsignerNameLikeInsensitive(String value) {
            addCriterion("upper(consigner_name) like", value.toUpperCase(), "consignerName");
            return (Criteria) this;
        }

        public Criteria andConsignerCompanyLikeInsensitive(String value) {
            addCriterion("upper(consigner_company) like", value.toUpperCase(), "consignerCompany");
            return (Criteria) this;
        }

        public Criteria andConsignerPhoneLikeInsensitive(String value) {
            addCriterion("upper(consigner_phone) like", value.toUpperCase(), "consignerPhone");
            return (Criteria) this;
        }

        public Criteria andConsignerMobileLikeInsensitive(String value) {
            addCriterion("upper(consigner_mobile) like", value.toUpperCase(), "consignerMobile");
            return (Criteria) this;
        }

        public Criteria andConsignerAddressLikeInsensitive(String value) {
            addCriterion("upper(consigner_address) like", value.toUpperCase(), "consignerAddress");
            return (Criteria) this;
        }

        public Criteria andConsignerProvinceLikeInsensitive(String value) {
            addCriterion("upper(consigner_province) like", value.toUpperCase(), "consignerProvince");
            return (Criteria) this;
        }

        public Criteria andConsignerCityLikeInsensitive(String value) {
            addCriterion("upper(consigner_city) like", value.toUpperCase(), "consignerCity");
            return (Criteria) this;
        }

        public Criteria andConsignerCountyLikeInsensitive(String value) {
            addCriterion("upper(consigner_county) like", value.toUpperCase(), "consignerCounty");
            return (Criteria) this;
        }

        public Criteria andConsignerTownLikeInsensitive(String value) {
            addCriterion("upper(consigner_town) like", value.toUpperCase(), "consignerTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLikeInsensitive(String value) {
            addCriterion("upper(consignee_name) like", value.toUpperCase(), "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCompanyLikeInsensitive(String value) {
            addCriterion("upper(consignee_company) like", value.toUpperCase(), "consigneeCompany");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLikeInsensitive(String value) {
            addCriterion("upper(consignee_phone) like", value.toUpperCase(), "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLikeInsensitive(String value) {
            addCriterion("upper(consignee_mobile) like", value.toUpperCase(), "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLikeInsensitive(String value) {
            addCriterion("upper(consignee_address) like", value.toUpperCase(), "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLikeInsensitive(String value) {
            addCriterion("upper(consignee_province) like", value.toUpperCase(), "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLikeInsensitive(String value) {
            addCriterion("upper(consignee_city) like", value.toUpperCase(), "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyLikeInsensitive(String value) {
            addCriterion("upper(consignee_county) like", value.toUpperCase(), "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownLikeInsensitive(String value) {
            addCriterion("upper(consignee_town) like", value.toUpperCase(), "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLikeInsensitive(String value) {
            addCriterion("upper(goods_name) like", value.toUpperCase(), "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPackTypeLikeInsensitive(String value) {
            addCriterion("upper(goods_pack_type) like", value.toUpperCase(), "goodsPackType");
            return (Criteria) this;
        }

        public Criteria andGoodsHandlingTypeLikeInsensitive(String value) {
            addCriterion("upper(goods_handling_type) like", value.toUpperCase(), "goodsHandlingType");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoLikeInsensitive(String value) {
            addCriterion("upper(goods_memo) like", value.toUpperCase(), "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsStackTypeLikeInsensitive(String value) {
            addCriterion("upper(goods_stack_type) like", value.toUpperCase(), "goodsStackType");
            return (Criteria) this;
        }

        public Criteria andPickBeginTimeLikeInsensitive(String value) {
            addCriterion("upper(pick_begin_time) like", value.toUpperCase(), "pickBeginTime");
            return (Criteria) this;
        }

        public Criteria andPickEndTimeLikeInsensitive(String value) {
            addCriterion("upper(pick_end_time) like", value.toUpperCase(), "pickEndTime");
            return (Criteria) this;
        }

        public Criteria andShiperNameLikeInsensitive(String value) {
            addCriterion("upper(shiper_name) like", value.toUpperCase(), "shiperName");
            return (Criteria) this;
        }

        public Criteria andShiperLinkmanLikeInsensitive(String value) {
            addCriterion("upper(shiper_linkman) like", value.toUpperCase(), "shiperLinkman");
            return (Criteria) this;
        }

        public Criteria andShiperMobileLikeInsensitive(String value) {
            addCriterion("upper(shiper_mobile) like", value.toUpperCase(), "shiperMobile");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLikeInsensitive(String value) {
            addCriterion("upper(out_trade_no) like", value.toUpperCase(), "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andNotifyMobileLikeInsensitive(String value) {
            addCriterion("upper(notify_mobile) like", value.toUpperCase(), "notifyMobile");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLikeInsensitive(String value) {
            addCriterion("upper(close_reason) like", value.toUpperCase(), "closeReason");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(employee_name) like", value.toUpperCase(), "employeeName");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLikeInsensitive(String value) {
            addCriterion("upper(goods_spec) like", value.toUpperCase(), "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLikeInsensitive(String value) {
            addCriterion("upper(waybill_no) like", value.toUpperCase(), "waybillNo");
            return (Criteria) this;
        }

        public Criteria andQueryNoLikeInsensitive(String value) {
            addCriterion("upper(query_no) like", value.toUpperCase(), "queryNo");
            return (Criteria) this;
        }

        public Criteria andCreateEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(create_employee_name) like", value.toUpperCase(), "createEmployeeName");
            return (Criteria) this;
        }

        public Criteria andOtherCloseReasonLikeInsensitive(String value) {
            addCriterion("upper(other_close_reason) like", value.toUpperCase(), "otherCloseReason");
            return (Criteria) this;
        }

        public Criteria andSystemIdLikeInsensitive(String value) {
            addCriterion("upper(system_id) like", value.toUpperCase(), "systemId");
            return (Criteria) this;
        }

        public Criteria andTradeMemoLikeInsensitive(String value) {
            addCriterion("upper(trade_memo) like", value.toUpperCase(), "tradeMemo");
            return (Criteria) this;
        }

        public Criteria andAllocNameLikeInsensitive(String value) {
            addCriterion("upper(alloc_name) like", value.toUpperCase(), "allocName");
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