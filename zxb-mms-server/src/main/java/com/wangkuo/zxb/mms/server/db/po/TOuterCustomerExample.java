package com.wangkuo.zxb.mms.server.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOuterCustomerExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOuterCustomerExample() {
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

        public Criteria andShipmentsStatusIsNull() {
            addCriterion("shipments_status is null");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusIsNotNull() {
            addCriterion("shipments_status is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusEqualTo(Integer value) {
            addCriterion("shipments_status =", value, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusNotEqualTo(Integer value) {
            addCriterion("shipments_status <>", value, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusGreaterThan(Integer value) {
            addCriterion("shipments_status >", value, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipments_status >=", value, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusLessThan(Integer value) {
            addCriterion("shipments_status <", value, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shipments_status <=", value, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusIn(List<Integer> values) {
            addCriterion("shipments_status in", values, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusNotIn(List<Integer> values) {
            addCriterion("shipments_status not in", values, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusBetween(Integer value1, Integer value2) {
            addCriterion("shipments_status between", value1, value2, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shipments_status not between", value1, value2, "shipmentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
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

        public Criteria andLogisticsDemandIsNull() {
            addCriterion("logistics_demand is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandIsNotNull() {
            addCriterion("logistics_demand is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandEqualTo(String value) {
            addCriterion("logistics_demand =", value, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandNotEqualTo(String value) {
            addCriterion("logistics_demand <>", value, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandGreaterThan(String value) {
            addCriterion("logistics_demand >", value, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_demand >=", value, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandLessThan(String value) {
            addCriterion("logistics_demand <", value, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandLessThanOrEqualTo(String value) {
            addCriterion("logistics_demand <=", value, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandLike(String value) {
            addCriterion("logistics_demand like", value, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandNotLike(String value) {
            addCriterion("logistics_demand not like", value, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandIn(List<String> values) {
            addCriterion("logistics_demand in", values, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandNotIn(List<String> values) {
            addCriterion("logistics_demand not in", values, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandBetween(String value1, String value2) {
            addCriterion("logistics_demand between", value1, value2, "logisticsDemand");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandNotBetween(String value1, String value2) {
            addCriterion("logistics_demand not between", value1, value2, "logisticsDemand");
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

        public Criteria andGoodsCategoryIsNull() {
            addCriterion("goods_category is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIsNotNull() {
            addCriterion("goods_category is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryEqualTo(String value) {
            addCriterion("goods_category =", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotEqualTo(String value) {
            addCriterion("goods_category <>", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryGreaterThan(String value) {
            addCriterion("goods_category >", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("goods_category >=", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLessThan(String value) {
            addCriterion("goods_category <", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLessThanOrEqualTo(String value) {
            addCriterion("goods_category <=", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLike(String value) {
            addCriterion("goods_category like", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotLike(String value) {
            addCriterion("goods_category not like", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIn(List<String> values) {
            addCriterion("goods_category in", values, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotIn(List<String> values) {
            addCriterion("goods_category not in", values, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryBetween(String value1, String value2) {
            addCriterion("goods_category between", value1, value2, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotBetween(String value1, String value2) {
            addCriterion("goods_category not between", value1, value2, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIsNull() {
            addCriterion("goods_attr is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIsNotNull() {
            addCriterion("goods_attr is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrEqualTo(String value) {
            addCriterion("goods_attr =", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNotEqualTo(String value) {
            addCriterion("goods_attr <>", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrGreaterThan(String value) {
            addCriterion("goods_attr >", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attr >=", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrLessThan(String value) {
            addCriterion("goods_attr <", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrLessThanOrEqualTo(String value) {
            addCriterion("goods_attr <=", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrLike(String value) {
            addCriterion("goods_attr like", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNotLike(String value) {
            addCriterion("goods_attr not like", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIn(List<String> values) {
            addCriterion("goods_attr in", values, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNotIn(List<String> values) {
            addCriterion("goods_attr not in", values, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrBetween(String value1, String value2) {
            addCriterion("goods_attr between", value1, value2, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNotBetween(String value1, String value2) {
            addCriterion("goods_attr not between", value1, value2, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoIsNull() {
            addCriterion("goods_attr_memo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoIsNotNull() {
            addCriterion("goods_attr_memo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoEqualTo(String value) {
            addCriterion("goods_attr_memo =", value, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoNotEqualTo(String value) {
            addCriterion("goods_attr_memo <>", value, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoGreaterThan(String value) {
            addCriterion("goods_attr_memo >", value, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attr_memo >=", value, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoLessThan(String value) {
            addCriterion("goods_attr_memo <", value, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoLessThanOrEqualTo(String value) {
            addCriterion("goods_attr_memo <=", value, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoLike(String value) {
            addCriterion("goods_attr_memo like", value, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoNotLike(String value) {
            addCriterion("goods_attr_memo not like", value, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoIn(List<String> values) {
            addCriterion("goods_attr_memo in", values, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoNotIn(List<String> values) {
            addCriterion("goods_attr_memo not in", values, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoBetween(String value1, String value2) {
            addCriterion("goods_attr_memo between", value1, value2, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoNotBetween(String value1, String value2) {
            addCriterion("goods_attr_memo not between", value1, value2, "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageIsNull() {
            addCriterion("goods_package is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageIsNotNull() {
            addCriterion("goods_package is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageEqualTo(String value) {
            addCriterion("goods_package =", value, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageNotEqualTo(String value) {
            addCriterion("goods_package <>", value, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageGreaterThan(String value) {
            addCriterion("goods_package >", value, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_package >=", value, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageLessThan(String value) {
            addCriterion("goods_package <", value, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageLessThanOrEqualTo(String value) {
            addCriterion("goods_package <=", value, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageLike(String value) {
            addCriterion("goods_package like", value, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageNotLike(String value) {
            addCriterion("goods_package not like", value, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageIn(List<String> values) {
            addCriterion("goods_package in", values, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageNotIn(List<String> values) {
            addCriterion("goods_package not in", values, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageBetween(String value1, String value2) {
            addCriterion("goods_package between", value1, value2, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageNotBetween(String value1, String value2) {
            addCriterion("goods_package not between", value1, value2, "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoIsNull() {
            addCriterion("goods_package_memo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoIsNotNull() {
            addCriterion("goods_package_memo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoEqualTo(String value) {
            addCriterion("goods_package_memo =", value, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoNotEqualTo(String value) {
            addCriterion("goods_package_memo <>", value, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoGreaterThan(String value) {
            addCriterion("goods_package_memo >", value, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_package_memo >=", value, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoLessThan(String value) {
            addCriterion("goods_package_memo <", value, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoLessThanOrEqualTo(String value) {
            addCriterion("goods_package_memo <=", value, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoLike(String value) {
            addCriterion("goods_package_memo like", value, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoNotLike(String value) {
            addCriterion("goods_package_memo not like", value, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoIn(List<String> values) {
            addCriterion("goods_package_memo in", values, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoNotIn(List<String> values) {
            addCriterion("goods_package_memo not in", values, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoBetween(String value1, String value2) {
            addCriterion("goods_package_memo between", value1, value2, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoNotBetween(String value1, String value2) {
            addCriterion("goods_package_memo not between", value1, value2, "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNull() {
            addCriterion("transport_mode is null");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNotNull() {
            addCriterion("transport_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTransportModeEqualTo(String value) {
            addCriterion("transport_mode =", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotEqualTo(String value) {
            addCriterion("transport_mode <>", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThan(String value) {
            addCriterion("transport_mode >", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThanOrEqualTo(String value) {
            addCriterion("transport_mode >=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThan(String value) {
            addCriterion("transport_mode <", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThanOrEqualTo(String value) {
            addCriterion("transport_mode <=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLike(String value) {
            addCriterion("transport_mode like", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotLike(String value) {
            addCriterion("transport_mode not like", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeIn(List<String> values) {
            addCriterion("transport_mode in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotIn(List<String> values) {
            addCriterion("transport_mode not in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeBetween(String value1, String value2) {
            addCriterion("transport_mode between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotBetween(String value1, String value2) {
            addCriterion("transport_mode not between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoIsNull() {
            addCriterion("transport_mode_memo is null");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoIsNotNull() {
            addCriterion("transport_mode_memo is not null");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoEqualTo(String value) {
            addCriterion("transport_mode_memo =", value, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoNotEqualTo(String value) {
            addCriterion("transport_mode_memo <>", value, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoGreaterThan(String value) {
            addCriterion("transport_mode_memo >", value, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("transport_mode_memo >=", value, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoLessThan(String value) {
            addCriterion("transport_mode_memo <", value, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoLessThanOrEqualTo(String value) {
            addCriterion("transport_mode_memo <=", value, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoLike(String value) {
            addCriterion("transport_mode_memo like", value, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoNotLike(String value) {
            addCriterion("transport_mode_memo not like", value, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoIn(List<String> values) {
            addCriterion("transport_mode_memo in", values, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoNotIn(List<String> values) {
            addCriterion("transport_mode_memo not in", values, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoBetween(String value1, String value2) {
            addCriterion("transport_mode_memo between", value1, value2, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoNotBetween(String value1, String value2) {
            addCriterion("transport_mode_memo not between", value1, value2, "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNull() {
            addCriterion("payment_mode is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNotNull() {
            addCriterion("payment_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeEqualTo(String value) {
            addCriterion("payment_mode =", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotEqualTo(String value) {
            addCriterion("payment_mode <>", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThan(String value) {
            addCriterion("payment_mode >", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_mode >=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThan(String value) {
            addCriterion("payment_mode <", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThanOrEqualTo(String value) {
            addCriterion("payment_mode <=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLike(String value) {
            addCriterion("payment_mode like", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotLike(String value) {
            addCriterion("payment_mode not like", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIn(List<String> values) {
            addCriterion("payment_mode in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotIn(List<String> values) {
            addCriterion("payment_mode not in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBetween(String value1, String value2) {
            addCriterion("payment_mode between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotBetween(String value1, String value2) {
            addCriterion("payment_mode not between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoIsNull() {
            addCriterion("payment_mode_memo is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoIsNotNull() {
            addCriterion("payment_mode_memo is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoEqualTo(String value) {
            addCriterion("payment_mode_memo =", value, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoNotEqualTo(String value) {
            addCriterion("payment_mode_memo <>", value, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoGreaterThan(String value) {
            addCriterion("payment_mode_memo >", value, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_mode_memo >=", value, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoLessThan(String value) {
            addCriterion("payment_mode_memo <", value, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoLessThanOrEqualTo(String value) {
            addCriterion("payment_mode_memo <=", value, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoLike(String value) {
            addCriterion("payment_mode_memo like", value, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoNotLike(String value) {
            addCriterion("payment_mode_memo not like", value, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoIn(List<String> values) {
            addCriterion("payment_mode_memo in", values, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoNotIn(List<String> values) {
            addCriterion("payment_mode_memo not in", values, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoBetween(String value1, String value2) {
            addCriterion("payment_mode_memo between", value1, value2, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoNotBetween(String value1, String value2) {
            addCriterion("payment_mode_memo not between", value1, value2, "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandIsNull() {
            addCriterion("vehicle_demand is null");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandIsNotNull() {
            addCriterion("vehicle_demand is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandEqualTo(String value) {
            addCriterion("vehicle_demand =", value, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandNotEqualTo(String value) {
            addCriterion("vehicle_demand <>", value, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandGreaterThan(String value) {
            addCriterion("vehicle_demand >", value, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_demand >=", value, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandLessThan(String value) {
            addCriterion("vehicle_demand <", value, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandLessThanOrEqualTo(String value) {
            addCriterion("vehicle_demand <=", value, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandLike(String value) {
            addCriterion("vehicle_demand like", value, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandNotLike(String value) {
            addCriterion("vehicle_demand not like", value, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandIn(List<String> values) {
            addCriterion("vehicle_demand in", values, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandNotIn(List<String> values) {
            addCriterion("vehicle_demand not in", values, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandBetween(String value1, String value2) {
            addCriterion("vehicle_demand between", value1, value2, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandNotBetween(String value1, String value2) {
            addCriterion("vehicle_demand not between", value1, value2, "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoIsNull() {
            addCriterion("vehicle_demand_memo is null");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoIsNotNull() {
            addCriterion("vehicle_demand_memo is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoEqualTo(String value) {
            addCriterion("vehicle_demand_memo =", value, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoNotEqualTo(String value) {
            addCriterion("vehicle_demand_memo <>", value, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoGreaterThan(String value) {
            addCriterion("vehicle_demand_memo >", value, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_demand_memo >=", value, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoLessThan(String value) {
            addCriterion("vehicle_demand_memo <", value, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoLessThanOrEqualTo(String value) {
            addCriterion("vehicle_demand_memo <=", value, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoLike(String value) {
            addCriterion("vehicle_demand_memo like", value, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoNotLike(String value) {
            addCriterion("vehicle_demand_memo not like", value, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoIn(List<String> values) {
            addCriterion("vehicle_demand_memo in", values, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoNotIn(List<String> values) {
            addCriterion("vehicle_demand_memo not in", values, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoBetween(String value1, String value2) {
            addCriterion("vehicle_demand_memo between", value1, value2, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoNotBetween(String value1, String value2) {
            addCriterion("vehicle_demand_memo not between", value1, value2, "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleIsNull() {
            addCriterion("delivery_schedule is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleIsNotNull() {
            addCriterion("delivery_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleEqualTo(String value) {
            addCriterion("delivery_schedule =", value, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleNotEqualTo(String value) {
            addCriterion("delivery_schedule <>", value, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleGreaterThan(String value) {
            addCriterion("delivery_schedule >", value, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_schedule >=", value, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleLessThan(String value) {
            addCriterion("delivery_schedule <", value, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleLessThanOrEqualTo(String value) {
            addCriterion("delivery_schedule <=", value, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleLike(String value) {
            addCriterion("delivery_schedule like", value, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleNotLike(String value) {
            addCriterion("delivery_schedule not like", value, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleIn(List<String> values) {
            addCriterion("delivery_schedule in", values, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleNotIn(List<String> values) {
            addCriterion("delivery_schedule not in", values, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleBetween(String value1, String value2) {
            addCriterion("delivery_schedule between", value1, value2, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleNotBetween(String value1, String value2) {
            addCriterion("delivery_schedule not between", value1, value2, "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoIsNull() {
            addCriterion("delivery_schedule_memo is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoIsNotNull() {
            addCriterion("delivery_schedule_memo is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoEqualTo(String value) {
            addCriterion("delivery_schedule_memo =", value, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoNotEqualTo(String value) {
            addCriterion("delivery_schedule_memo <>", value, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoGreaterThan(String value) {
            addCriterion("delivery_schedule_memo >", value, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_schedule_memo >=", value, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoLessThan(String value) {
            addCriterion("delivery_schedule_memo <", value, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoLessThanOrEqualTo(String value) {
            addCriterion("delivery_schedule_memo <=", value, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoLike(String value) {
            addCriterion("delivery_schedule_memo like", value, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoNotLike(String value) {
            addCriterion("delivery_schedule_memo not like", value, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoIn(List<String> values) {
            addCriterion("delivery_schedule_memo in", values, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoNotIn(List<String> values) {
            addCriterion("delivery_schedule_memo not in", values, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoBetween(String value1, String value2) {
            addCriterion("delivery_schedule_memo between", value1, value2, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoNotBetween(String value1, String value2) {
            addCriterion("delivery_schedule_memo not between", value1, value2, "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoIsNull() {
            addCriterion("attention_memo is null");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoIsNotNull() {
            addCriterion("attention_memo is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoEqualTo(String value) {
            addCriterion("attention_memo =", value, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoNotEqualTo(String value) {
            addCriterion("attention_memo <>", value, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoGreaterThan(String value) {
            addCriterion("attention_memo >", value, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoGreaterThanOrEqualTo(String value) {
            addCriterion("attention_memo >=", value, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoLessThan(String value) {
            addCriterion("attention_memo <", value, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoLessThanOrEqualTo(String value) {
            addCriterion("attention_memo <=", value, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoLike(String value) {
            addCriterion("attention_memo like", value, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoNotLike(String value) {
            addCriterion("attention_memo not like", value, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoIn(List<String> values) {
            addCriterion("attention_memo in", values, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoNotIn(List<String> values) {
            addCriterion("attention_memo not in", values, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoBetween(String value1, String value2) {
            addCriterion("attention_memo between", value1, value2, "attentionMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoNotBetween(String value1, String value2) {
            addCriterion("attention_memo not between", value1, value2, "attentionMemo");
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

        public Criteria andIndustryLikeInsensitive(String value) {
            addCriterion("upper(industry) like", value.toUpperCase(), "industry");
            return (Criteria) this;
        }

        public Criteria andSysAccountLikeInsensitive(String value) {
            addCriterion("upper(sys_account) like", value.toUpperCase(), "sysAccount");
            return (Criteria) this;
        }

        public Criteria andLogisticsDemandLikeInsensitive(String value) {
            addCriterion("upper(logistics_demand) like", value.toUpperCase(), "logisticsDemand");
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

        public Criteria andGoodsCategoryLikeInsensitive(String value) {
            addCriterion("upper(goods_category) like", value.toUpperCase(), "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrLikeInsensitive(String value) {
            addCriterion("upper(goods_attr) like", value.toUpperCase(), "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrMemoLikeInsensitive(String value) {
            addCriterion("upper(goods_attr_memo) like", value.toUpperCase(), "goodsAttrMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageLikeInsensitive(String value) {
            addCriterion("upper(goods_package) like", value.toUpperCase(), "goodsPackage");
            return (Criteria) this;
        }

        public Criteria andGoodsPackageMemoLikeInsensitive(String value) {
            addCriterion("upper(goods_package_memo) like", value.toUpperCase(), "goodsPackageMemo");
            return (Criteria) this;
        }

        public Criteria andTransportModeLikeInsensitive(String value) {
            addCriterion("upper(transport_mode) like", value.toUpperCase(), "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeMemoLikeInsensitive(String value) {
            addCriterion("upper(transport_mode_memo) like", value.toUpperCase(), "transportModeMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLikeInsensitive(String value) {
            addCriterion("upper(payment_mode) like", value.toUpperCase(), "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeMemoLikeInsensitive(String value) {
            addCriterion("upper(payment_mode_memo) like", value.toUpperCase(), "paymentModeMemo");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandLikeInsensitive(String value) {
            addCriterion("upper(vehicle_demand) like", value.toUpperCase(), "vehicleDemand");
            return (Criteria) this;
        }

        public Criteria andVehicleDemandMemoLikeInsensitive(String value) {
            addCriterion("upper(vehicle_demand_memo) like", value.toUpperCase(), "vehicleDemandMemo");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleLikeInsensitive(String value) {
            addCriterion("upper(delivery_schedule) like", value.toUpperCase(), "deliverySchedule");
            return (Criteria) this;
        }

        public Criteria andDeliveryScheduleMemoLikeInsensitive(String value) {
            addCriterion("upper(delivery_schedule_memo) like", value.toUpperCase(), "deliveryScheduleMemo");
            return (Criteria) this;
        }

        public Criteria andAttentionLikeInsensitive(String value) {
            addCriterion("upper(attention) like", value.toUpperCase(), "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionMemoLikeInsensitive(String value) {
            addCriterion("upper(attention_memo) like", value.toUpperCase(), "attentionMemo");
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