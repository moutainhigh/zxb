package com.wangkuo.zxb.mms.server.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TInnerCustomerExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInnerCustomerExample() {
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIsNull() {
            addCriterion("alloc_centre is null");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIsNotNull() {
            addCriterion("alloc_centre is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCentreEqualTo(String value) {
            addCriterion("alloc_centre =", value, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreNotEqualTo(String value) {
            addCriterion("alloc_centre <>", value, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreGreaterThan(String value) {
            addCriterion("alloc_centre >", value, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreGreaterThanOrEqualTo(String value) {
            addCriterion("alloc_centre >=", value, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreLessThan(String value) {
            addCriterion("alloc_centre <", value, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreLessThanOrEqualTo(String value) {
            addCriterion("alloc_centre <=", value, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreLike(String value) {
            addCriterion("alloc_centre like", value, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreNotLike(String value) {
            addCriterion("alloc_centre not like", value, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIn(List<String> values) {
            addCriterion("alloc_centre in", values, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreNotIn(List<String> values) {
            addCriterion("alloc_centre not in", values, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreBetween(String value1, String value2) {
            addCriterion("alloc_centre between", value1, value2, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreNotBetween(String value1, String value2) {
            addCriterion("alloc_centre not between", value1, value2, "allocCentre");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdIsNull() {
            addCriterion("alloc_centre_id is null");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdIsNotNull() {
            addCriterion("alloc_centre_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdEqualTo(Long value) {
            addCriterion("alloc_centre_id =", value, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdNotEqualTo(Long value) {
            addCriterion("alloc_centre_id <>", value, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdGreaterThan(Long value) {
            addCriterion("alloc_centre_id >", value, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("alloc_centre_id >=", value, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdLessThan(Long value) {
            addCriterion("alloc_centre_id <", value, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdLessThanOrEqualTo(Long value) {
            addCriterion("alloc_centre_id <=", value, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdIn(List<Long> values) {
            addCriterion("alloc_centre_id in", values, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdNotIn(List<Long> values) {
            addCriterion("alloc_centre_id not in", values, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdBetween(Long value1, Long value2) {
            addCriterion("alloc_centre_id between", value1, value2, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andAllocCentreIdNotBetween(Long value1, Long value2) {
            addCriterion("alloc_centre_id not between", value1, value2, "allocCentreId");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Long value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Long value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Long value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Long value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Long value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Long> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Long> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Long value1, Long value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Long value1, Long value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIsNull() {
            addCriterion("merchant_type is null");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIsNotNull() {
            addCriterion("merchant_type is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeEqualTo(Integer value) {
            addCriterion("merchant_type =", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotEqualTo(Integer value) {
            addCriterion("merchant_type <>", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeGreaterThan(Integer value) {
            addCriterion("merchant_type >", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_type >=", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeLessThan(Integer value) {
            addCriterion("merchant_type <", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_type <=", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIn(List<Integer> values) {
            addCriterion("merchant_type in", values, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotIn(List<Integer> values) {
            addCriterion("merchant_type not in", values, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeBetween(Integer value1, Integer value2) {
            addCriterion("merchant_type between", value1, value2, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_type not between", value1, value2, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusIsNull() {
            addCriterion("merchant_status is null");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusIsNotNull() {
            addCriterion("merchant_status is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusEqualTo(Integer value) {
            addCriterion("merchant_status =", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusNotEqualTo(Integer value) {
            addCriterion("merchant_status <>", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusGreaterThan(Integer value) {
            addCriterion("merchant_status >", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_status >=", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusLessThan(Integer value) {
            addCriterion("merchant_status <", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_status <=", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusIn(List<Integer> values) {
            addCriterion("merchant_status in", values, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusNotIn(List<Integer> values) {
            addCriterion("merchant_status not in", values, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusBetween(Integer value1, Integer value2) {
            addCriterion("merchant_status between", value1, value2, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_status not between", value1, value2, "merchantStatus");
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

        public Criteria andSysAccountIsNull() {
            addCriterion("sys_account is null");
            return (Criteria) this;
        }

        public Criteria andSysAccountIsNotNull() {
            addCriterion("sys_account is not null");
            return (Criteria) this;
        }

        public Criteria andSysAccountEqualTo(String value) {
            addCriterion("sys_account =", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountNotEqualTo(String value) {
            addCriterion("sys_account <>", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountGreaterThan(String value) {
            addCriterion("sys_account >", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountGreaterThanOrEqualTo(String value) {
            addCriterion("sys_account >=", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountLessThan(String value) {
            addCriterion("sys_account <", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountLessThanOrEqualTo(String value) {
            addCriterion("sys_account <=", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountLike(String value) {
            addCriterion("sys_account like", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountNotLike(String value) {
            addCriterion("sys_account not like", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountIn(List<String> values) {
            addCriterion("sys_account in", values, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountNotIn(List<String> values) {
            addCriterion("sys_account not in", values, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountBetween(String value1, String value2) {
            addCriterion("sys_account between", value1, value2, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountNotBetween(String value1, String value2) {
            addCriterion("sys_account not between", value1, value2, "sysAccount");
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

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
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

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNull() {
            addCriterion("job_title is null");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNotNull() {
            addCriterion("job_title is not null");
            return (Criteria) this;
        }

        public Criteria andJobTitleEqualTo(String value) {
            addCriterion("job_title =", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotEqualTo(String value) {
            addCriterion("job_title <>", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThan(String value) {
            addCriterion("job_title >", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("job_title >=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThan(String value) {
            addCriterion("job_title <", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThanOrEqualTo(String value) {
            addCriterion("job_title <=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLike(String value) {
            addCriterion("job_title like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotLike(String value) {
            addCriterion("job_title not like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleIn(List<String> values) {
            addCriterion("job_title in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotIn(List<String> values) {
            addCriterion("job_title not in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleBetween(String value1, String value2) {
            addCriterion("job_title between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotBetween(String value1, String value2) {
            addCriterion("job_title not between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andServiceLifeIsNull() {
            addCriterion("service_life is null");
            return (Criteria) this;
        }

        public Criteria andServiceLifeIsNotNull() {
            addCriterion("service_life is not null");
            return (Criteria) this;
        }

        public Criteria andServiceLifeEqualTo(Date value) {
            addCriterion("service_life =", value, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeNotEqualTo(Date value) {
            addCriterion("service_life <>", value, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeGreaterThan(Date value) {
            addCriterion("service_life >", value, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeGreaterThanOrEqualTo(Date value) {
            addCriterion("service_life >=", value, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeLessThan(Date value) {
            addCriterion("service_life <", value, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeLessThanOrEqualTo(Date value) {
            addCriterion("service_life <=", value, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeIn(List<Date> values) {
            addCriterion("service_life in", values, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeNotIn(List<Date> values) {
            addCriterion("service_life not in", values, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeBetween(Date value1, Date value2) {
            addCriterion("service_life between", value1, value2, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andServiceLifeNotBetween(Date value1, Date value2) {
            addCriterion("service_life not between", value1, value2, "serviceLife");
            return (Criteria) this;
        }

        public Criteria andCurrUserIsNull() {
            addCriterion("curr_user is null");
            return (Criteria) this;
        }

        public Criteria andCurrUserIsNotNull() {
            addCriterion("curr_user is not null");
            return (Criteria) this;
        }

        public Criteria andCurrUserEqualTo(String value) {
            addCriterion("curr_user =", value, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserNotEqualTo(String value) {
            addCriterion("curr_user <>", value, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserGreaterThan(String value) {
            addCriterion("curr_user >", value, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserGreaterThanOrEqualTo(String value) {
            addCriterion("curr_user >=", value, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserLessThan(String value) {
            addCriterion("curr_user <", value, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserLessThanOrEqualTo(String value) {
            addCriterion("curr_user <=", value, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserLike(String value) {
            addCriterion("curr_user like", value, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserNotLike(String value) {
            addCriterion("curr_user not like", value, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserIn(List<String> values) {
            addCriterion("curr_user in", values, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserNotIn(List<String> values) {
            addCriterion("curr_user not in", values, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserBetween(String value1, String value2) {
            addCriterion("curr_user between", value1, value2, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserNotBetween(String value1, String value2) {
            addCriterion("curr_user not between", value1, value2, "currUser");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdIsNull() {
            addCriterion("curr_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdIsNotNull() {
            addCriterion("curr_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdEqualTo(Long value) {
            addCriterion("curr_user_id =", value, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdNotEqualTo(Long value) {
            addCriterion("curr_user_id <>", value, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdGreaterThan(Long value) {
            addCriterion("curr_user_id >", value, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("curr_user_id >=", value, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdLessThan(Long value) {
            addCriterion("curr_user_id <", value, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdLessThanOrEqualTo(Long value) {
            addCriterion("curr_user_id <=", value, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdIn(List<Long> values) {
            addCriterion("curr_user_id in", values, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdNotIn(List<Long> values) {
            addCriterion("curr_user_id not in", values, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdBetween(Long value1, Long value2) {
            addCriterion("curr_user_id between", value1, value2, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCurrUserIdNotBetween(Long value1, Long value2) {
            addCriterion("curr_user_id not between", value1, value2, "currUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNull() {
            addCriterion("created_user is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("created_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(String value) {
            addCriterion("created_user =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(String value) {
            addCriterion("created_user <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(String value) {
            addCriterion("created_user >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("created_user >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(String value) {
            addCriterion("created_user <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("created_user <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLike(String value) {
            addCriterion("created_user like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotLike(String value) {
            addCriterion("created_user not like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<String> values) {
            addCriterion("created_user in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<String> values) {
            addCriterion("created_user not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(String value1, String value2) {
            addCriterion("created_user between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(String value1, String value2) {
            addCriterion("created_user not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNull() {
            addCriterion("created_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNotNull() {
            addCriterion("created_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdEqualTo(Long value) {
            addCriterion("created_user_id =", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotEqualTo(Long value) {
            addCriterion("created_user_id <>", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThan(Long value) {
            addCriterion("created_user_id >", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("created_user_id >=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThan(Long value) {
            addCriterion("created_user_id <", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("created_user_id <=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIn(List<Long> values) {
            addCriterion("created_user_id in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotIn(List<Long> values) {
            addCriterion("created_user_id not in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdBetween(Long value1, Long value2) {
            addCriterion("created_user_id between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("created_user_id not between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIsNull() {
            addCriterion("updated_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIsNotNull() {
            addCriterion("updated_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserEqualTo(String value) {
            addCriterion("updated_user =", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotEqualTo(String value) {
            addCriterion("updated_user <>", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserGreaterThan(String value) {
            addCriterion("updated_user >", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("updated_user >=", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLessThan(String value) {
            addCriterion("updated_user <", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLessThanOrEqualTo(String value) {
            addCriterion("updated_user <=", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLike(String value) {
            addCriterion("updated_user like", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotLike(String value) {
            addCriterion("updated_user not like", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIn(List<String> values) {
            addCriterion("updated_user in", values, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotIn(List<String> values) {
            addCriterion("updated_user not in", values, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserBetween(String value1, String value2) {
            addCriterion("updated_user between", value1, value2, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotBetween(String value1, String value2) {
            addCriterion("updated_user not between", value1, value2, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIsNull() {
            addCriterion("updated_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIsNotNull() {
            addCriterion("updated_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdEqualTo(Long value) {
            addCriterion("updated_user_id =", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotEqualTo(Long value) {
            addCriterion("updated_user_id <>", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdGreaterThan(Long value) {
            addCriterion("updated_user_id >", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_user_id >=", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLessThan(Long value) {
            addCriterion("updated_user_id <", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("updated_user_id <=", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIn(List<Long> values) {
            addCriterion("updated_user_id in", values, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotIn(List<Long> values) {
            addCriterion("updated_user_id not in", values, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdBetween(Long value1, Long value2) {
            addCriterion("updated_user_id between", value1, value2, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("updated_user_id not between", value1, value2, "updatedUserId");
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

        public Criteria andCustomerNameLikeInsensitive(String value) {
            addCriterion("upper(customer_name) like", value.toUpperCase(), "customerName");
            return (Criteria) this;
        }

        public Criteria andAllocCentreLikeInsensitive(String value) {
            addCriterion("upper(alloc_centre) like", value.toUpperCase(), "allocCentre");
            return (Criteria) this;
        }

        public Criteria andRegionLikeInsensitive(String value) {
            addCriterion("upper(region) like", value.toUpperCase(), "region");
            return (Criteria) this;
        }

        public Criteria andSysAccountLikeInsensitive(String value) {
            addCriterion("upper(sys_account) like", value.toUpperCase(), "sysAccount");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
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

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andLinkmanLikeInsensitive(String value) {
            addCriterion("upper(linkman) like", value.toUpperCase(), "linkman");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(telephone) like", value.toUpperCase(), "telephone");
            return (Criteria) this;
        }

        public Criteria andJobTitleLikeInsensitive(String value) {
            addCriterion("upper(job_title) like", value.toUpperCase(), "jobTitle");
            return (Criteria) this;
        }

        public Criteria andCurrUserLikeInsensitive(String value) {
            addCriterion("upper(curr_user) like", value.toUpperCase(), "currUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLikeInsensitive(String value) {
            addCriterion("upper(created_user) like", value.toUpperCase(), "createdUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLikeInsensitive(String value) {
            addCriterion("upper(updated_user) like", value.toUpperCase(), "updatedUser");
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