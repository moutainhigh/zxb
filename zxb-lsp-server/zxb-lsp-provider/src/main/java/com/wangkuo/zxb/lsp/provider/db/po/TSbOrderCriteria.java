package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbOrderCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbOrderCriteria() {
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

        public Criteria andPaySnIsNull() {
            addCriterion("pay_sn is null");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNotNull() {
            addCriterion("pay_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPaySnEqualTo(String value) {
            addCriterion("pay_sn =", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotEqualTo(String value) {
            addCriterion("pay_sn <>", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThan(String value) {
            addCriterion("pay_sn >", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThanOrEqualTo(String value) {
            addCriterion("pay_sn >=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThan(String value) {
            addCriterion("pay_sn <", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThanOrEqualTo(String value) {
            addCriterion("pay_sn <=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLike(String value) {
            addCriterion("pay_sn like", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotLike(String value) {
            addCriterion("pay_sn not like", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnIn(List<String> values) {
            addCriterion("pay_sn in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotIn(List<String> values) {
            addCriterion("pay_sn not in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnBetween(String value1, String value2) {
            addCriterion("pay_sn between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotBetween(String value1, String value2) {
            addCriterion("pay_sn not between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(BigDecimal value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(BigDecimal value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(BigDecimal value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<BigDecimal> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
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

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Long value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Long value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Long value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Long value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Long> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Long> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Long value1, Long value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("site_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("site_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("site_name =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("site_name <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("site_name >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_name >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("site_name <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("site_name <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("site_name like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("site_name not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("site_name in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("site_name not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("site_name between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("site_name not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNull() {
            addCriterion("payment_no is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNotNull() {
            addCriterion("payment_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoEqualTo(String value) {
            addCriterion("payment_no =", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotEqualTo(String value) {
            addCriterion("payment_no <>", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThan(String value) {
            addCriterion("payment_no >", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_no >=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThan(String value) {
            addCriterion("payment_no <", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("payment_no <=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLike(String value) {
            addCriterion("payment_no like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotLike(String value) {
            addCriterion("payment_no not like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIn(List<String> values) {
            addCriterion("payment_no in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotIn(List<String> values) {
            addCriterion("payment_no not in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoBetween(String value1, String value2) {
            addCriterion("payment_no between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotBetween(String value1, String value2) {
            addCriterion("payment_no not between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoIsNull() {
            addCriterion("payment_memo is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoIsNotNull() {
            addCriterion("payment_memo is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoEqualTo(String value) {
            addCriterion("payment_memo =", value, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoNotEqualTo(String value) {
            addCriterion("payment_memo <>", value, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoGreaterThan(String value) {
            addCriterion("payment_memo >", value, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_memo >=", value, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoLessThan(String value) {
            addCriterion("payment_memo <", value, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoLessThanOrEqualTo(String value) {
            addCriterion("payment_memo <=", value, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoLike(String value) {
            addCriterion("payment_memo like", value, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoNotLike(String value) {
            addCriterion("payment_memo not like", value, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoIn(List<String> values) {
            addCriterion("payment_memo in", values, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoNotIn(List<String> values) {
            addCriterion("payment_memo not in", values, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoBetween(String value1, String value2) {
            addCriterion("payment_memo between", value1, value2, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoNotBetween(String value1, String value2) {
            addCriterion("payment_memo not between", value1, value2, "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNull() {
            addCriterion("fail_reason is null");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNotNull() {
            addCriterion("fail_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFailReasonEqualTo(String value) {
            addCriterion("fail_reason =", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotEqualTo(String value) {
            addCriterion("fail_reason <>", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThan(String value) {
            addCriterion("fail_reason >", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("fail_reason >=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThan(String value) {
            addCriterion("fail_reason <", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThanOrEqualTo(String value) {
            addCriterion("fail_reason <=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLike(String value) {
            addCriterion("fail_reason like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotLike(String value) {
            addCriterion("fail_reason not like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonIn(List<String> values) {
            addCriterion("fail_reason in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotIn(List<String> values) {
            addCriterion("fail_reason not in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonBetween(String value1, String value2) {
            addCriterion("fail_reason between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotBetween(String value1, String value2) {
            addCriterion("fail_reason not between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andPaySnLikeInsensitive(String value) {
            addCriterion("upper(pay_sn) like", value.toUpperCase(), "paySn");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andBookerEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(booker_employee_name) like", value.toUpperCase(), "bookerEmployeeName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLikeInsensitive(String value) {
            addCriterion("upper(site_name) like", value.toUpperCase(), "siteName");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLikeInsensitive(String value) {
            addCriterion("upper(payment_no) like", value.toUpperCase(), "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentMemoLikeInsensitive(String value) {
            addCriterion("upper(payment_memo) like", value.toUpperCase(), "paymentMemo");
            return (Criteria) this;
        }

        public Criteria andFailReasonLikeInsensitive(String value) {
            addCriterion("upper(fail_reason) like", value.toUpperCase(), "failReason");
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