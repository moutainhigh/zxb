package com.wangkuo.zxb.mms.server.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRegionStatsExample implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRegionStatsExample() {
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

        public Criteria andStatsYearIsNull() {
            addCriterion("stats_year is null");
            return (Criteria) this;
        }

        public Criteria andStatsYearIsNotNull() {
            addCriterion("stats_year is not null");
            return (Criteria) this;
        }

        public Criteria andStatsYearEqualTo(Integer value) {
            addCriterion("stats_year =", value, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearNotEqualTo(Integer value) {
            addCriterion("stats_year <>", value, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearGreaterThan(Integer value) {
            addCriterion("stats_year >", value, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("stats_year >=", value, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearLessThan(Integer value) {
            addCriterion("stats_year <", value, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearLessThanOrEqualTo(Integer value) {
            addCriterion("stats_year <=", value, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearIn(List<Integer> values) {
            addCriterion("stats_year in", values, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearNotIn(List<Integer> values) {
            addCriterion("stats_year not in", values, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearBetween(Integer value1, Integer value2) {
            addCriterion("stats_year between", value1, value2, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsYearNotBetween(Integer value1, Integer value2) {
            addCriterion("stats_year not between", value1, value2, "statsYear");
            return (Criteria) this;
        }

        public Criteria andStatsMonthIsNull() {
            addCriterion("stats_month is null");
            return (Criteria) this;
        }

        public Criteria andStatsMonthIsNotNull() {
            addCriterion("stats_month is not null");
            return (Criteria) this;
        }

        public Criteria andStatsMonthEqualTo(Integer value) {
            addCriterion("stats_month =", value, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthNotEqualTo(Integer value) {
            addCriterion("stats_month <>", value, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthGreaterThan(Integer value) {
            addCriterion("stats_month >", value, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("stats_month >=", value, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthLessThan(Integer value) {
            addCriterion("stats_month <", value, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthLessThanOrEqualTo(Integer value) {
            addCriterion("stats_month <=", value, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthIn(List<Integer> values) {
            addCriterion("stats_month in", values, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthNotIn(List<Integer> values) {
            addCriterion("stats_month not in", values, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthBetween(Integer value1, Integer value2) {
            addCriterion("stats_month between", value1, value2, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andStatsMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("stats_month not between", value1, value2, "statsMonth");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountIsNull() {
            addCriterion("total_customer_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountIsNotNull() {
            addCriterion("total_customer_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountEqualTo(Long value) {
            addCriterion("total_customer_count =", value, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountNotEqualTo(Long value) {
            addCriterion("total_customer_count <>", value, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountGreaterThan(Long value) {
            addCriterion("total_customer_count >", value, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_customer_count >=", value, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountLessThan(Long value) {
            addCriterion("total_customer_count <", value, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountLessThanOrEqualTo(Long value) {
            addCriterion("total_customer_count <=", value, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountIn(List<Long> values) {
            addCriterion("total_customer_count in", values, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountNotIn(List<Long> values) {
            addCriterion("total_customer_count not in", values, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountBetween(Long value1, Long value2) {
            addCriterion("total_customer_count between", value1, value2, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andTotalCustomerCountNotBetween(Long value1, Long value2) {
            addCriterion("total_customer_count not between", value1, value2, "totalCustomerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountIsNull() {
            addCriterion("customer_count is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCountIsNotNull() {
            addCriterion("customer_count is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCountEqualTo(Long value) {
            addCriterion("customer_count =", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountNotEqualTo(Long value) {
            addCriterion("customer_count <>", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountGreaterThan(Long value) {
            addCriterion("customer_count >", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_count >=", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountLessThan(Long value) {
            addCriterion("customer_count <", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountLessThanOrEqualTo(Long value) {
            addCriterion("customer_count <=", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountIn(List<Long> values) {
            addCriterion("customer_count in", values, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountNotIn(List<Long> values) {
            addCriterion("customer_count not in", values, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountBetween(Long value1, Long value2) {
            addCriterion("customer_count between", value1, value2, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountNotBetween(Long value1, Long value2) {
            addCriterion("customer_count not between", value1, value2, "customerCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountIsNull() {
            addCriterion("waybill_count is null");
            return (Criteria) this;
        }

        public Criteria andWaybillCountIsNotNull() {
            addCriterion("waybill_count is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillCountEqualTo(Long value) {
            addCriterion("waybill_count =", value, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountNotEqualTo(Long value) {
            addCriterion("waybill_count <>", value, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountGreaterThan(Long value) {
            addCriterion("waybill_count >", value, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountGreaterThanOrEqualTo(Long value) {
            addCriterion("waybill_count >=", value, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountLessThan(Long value) {
            addCriterion("waybill_count <", value, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountLessThanOrEqualTo(Long value) {
            addCriterion("waybill_count <=", value, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountIn(List<Long> values) {
            addCriterion("waybill_count in", values, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountNotIn(List<Long> values) {
            addCriterion("waybill_count not in", values, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountBetween(Long value1, Long value2) {
            addCriterion("waybill_count between", value1, value2, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountNotBetween(Long value1, Long value2) {
            addCriterion("waybill_count not between", value1, value2, "waybillCount");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexIsNull() {
            addCriterion("waybill_count_chain_index is null");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexIsNotNull() {
            addCriterion("waybill_count_chain_index is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexEqualTo(Double value) {
            addCriterion("waybill_count_chain_index =", value, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexNotEqualTo(Double value) {
            addCriterion("waybill_count_chain_index <>", value, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexGreaterThan(Double value) {
            addCriterion("waybill_count_chain_index >", value, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexGreaterThanOrEqualTo(Double value) {
            addCriterion("waybill_count_chain_index >=", value, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexLessThan(Double value) {
            addCriterion("waybill_count_chain_index <", value, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexLessThanOrEqualTo(Double value) {
            addCriterion("waybill_count_chain_index <=", value, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexIn(List<Double> values) {
            addCriterion("waybill_count_chain_index in", values, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexNotIn(List<Double> values) {
            addCriterion("waybill_count_chain_index not in", values, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexBetween(Double value1, Double value2) {
            addCriterion("waybill_count_chain_index between", value1, value2, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWaybillCountChainIndexNotBetween(Double value1, Double value2) {
            addCriterion("waybill_count_chain_index not between", value1, value2, "waybillCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeIsNull() {
            addCriterion("all_fee is null");
            return (Criteria) this;
        }

        public Criteria andAllFeeIsNotNull() {
            addCriterion("all_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAllFeeEqualTo(BigDecimal value) {
            addCriterion("all_fee =", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeNotEqualTo(BigDecimal value) {
            addCriterion("all_fee <>", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeGreaterThan(BigDecimal value) {
            addCriterion("all_fee >", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_fee >=", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeLessThan(BigDecimal value) {
            addCriterion("all_fee <", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_fee <=", value, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeIn(List<BigDecimal> values) {
            addCriterion("all_fee in", values, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeNotIn(List<BigDecimal> values) {
            addCriterion("all_fee not in", values, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_fee between", value1, value2, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_fee not between", value1, value2, "allFee");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexIsNull() {
            addCriterion("all_fee_chain_index is null");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexIsNotNull() {
            addCriterion("all_fee_chain_index is not null");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexEqualTo(Double value) {
            addCriterion("all_fee_chain_index =", value, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexNotEqualTo(Double value) {
            addCriterion("all_fee_chain_index <>", value, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexGreaterThan(Double value) {
            addCriterion("all_fee_chain_index >", value, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexGreaterThanOrEqualTo(Double value) {
            addCriterion("all_fee_chain_index >=", value, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexLessThan(Double value) {
            addCriterion("all_fee_chain_index <", value, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexLessThanOrEqualTo(Double value) {
            addCriterion("all_fee_chain_index <=", value, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexIn(List<Double> values) {
            addCriterion("all_fee_chain_index in", values, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexNotIn(List<Double> values) {
            addCriterion("all_fee_chain_index not in", values, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexBetween(Double value1, Double value2) {
            addCriterion("all_fee_chain_index between", value1, value2, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andAllFeeChainIndexNotBetween(Double value1, Double value2) {
            addCriterion("all_fee_chain_index not between", value1, value2, "allFeeChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountIsNull() {
            addCriterion("stowage_count is null");
            return (Criteria) this;
        }

        public Criteria andStowageCountIsNotNull() {
            addCriterion("stowage_count is not null");
            return (Criteria) this;
        }

        public Criteria andStowageCountEqualTo(Long value) {
            addCriterion("stowage_count =", value, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountNotEqualTo(Long value) {
            addCriterion("stowage_count <>", value, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountGreaterThan(Long value) {
            addCriterion("stowage_count >", value, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountGreaterThanOrEqualTo(Long value) {
            addCriterion("stowage_count >=", value, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountLessThan(Long value) {
            addCriterion("stowage_count <", value, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountLessThanOrEqualTo(Long value) {
            addCriterion("stowage_count <=", value, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountIn(List<Long> values) {
            addCriterion("stowage_count in", values, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountNotIn(List<Long> values) {
            addCriterion("stowage_count not in", values, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountBetween(Long value1, Long value2) {
            addCriterion("stowage_count between", value1, value2, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountNotBetween(Long value1, Long value2) {
            addCriterion("stowage_count not between", value1, value2, "stowageCount");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexIsNull() {
            addCriterion("stowage_count_chain_index is null");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexIsNotNull() {
            addCriterion("stowage_count_chain_index is not null");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexEqualTo(Double value) {
            addCriterion("stowage_count_chain_index =", value, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexNotEqualTo(Double value) {
            addCriterion("stowage_count_chain_index <>", value, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexGreaterThan(Double value) {
            addCriterion("stowage_count_chain_index >", value, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexGreaterThanOrEqualTo(Double value) {
            addCriterion("stowage_count_chain_index >=", value, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexLessThan(Double value) {
            addCriterion("stowage_count_chain_index <", value, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexLessThanOrEqualTo(Double value) {
            addCriterion("stowage_count_chain_index <=", value, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexIn(List<Double> values) {
            addCriterion("stowage_count_chain_index in", values, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexNotIn(List<Double> values) {
            addCriterion("stowage_count_chain_index not in", values, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexBetween(Double value1, Double value2) {
            addCriterion("stowage_count_chain_index between", value1, value2, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andStowageCountChainIndexNotBetween(Double value1, Double value2) {
            addCriterion("stowage_count_chain_index not between", value1, value2, "stowageCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexIsNull() {
            addCriterion("weight_chain_index is null");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexIsNotNull() {
            addCriterion("weight_chain_index is not null");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexEqualTo(Double value) {
            addCriterion("weight_chain_index =", value, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexNotEqualTo(Double value) {
            addCriterion("weight_chain_index <>", value, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexGreaterThan(Double value) {
            addCriterion("weight_chain_index >", value, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexGreaterThanOrEqualTo(Double value) {
            addCriterion("weight_chain_index >=", value, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexLessThan(Double value) {
            addCriterion("weight_chain_index <", value, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexLessThanOrEqualTo(Double value) {
            addCriterion("weight_chain_index <=", value, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexIn(List<Double> values) {
            addCriterion("weight_chain_index in", values, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexNotIn(List<Double> values) {
            addCriterion("weight_chain_index not in", values, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexBetween(Double value1, Double value2) {
            addCriterion("weight_chain_index between", value1, value2, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andWeightChainIndexNotBetween(Double value1, Double value2) {
            addCriterion("weight_chain_index not between", value1, value2, "weightChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Double value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Double value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Double value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Double value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Double value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Double> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Double> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Double value1, Double value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Double value1, Double value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexIsNull() {
            addCriterion("volume_chain_index is null");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexIsNotNull() {
            addCriterion("volume_chain_index is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexEqualTo(Double value) {
            addCriterion("volume_chain_index =", value, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexNotEqualTo(Double value) {
            addCriterion("volume_chain_index <>", value, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexGreaterThan(Double value) {
            addCriterion("volume_chain_index >", value, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexGreaterThanOrEqualTo(Double value) {
            addCriterion("volume_chain_index >=", value, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexLessThan(Double value) {
            addCriterion("volume_chain_index <", value, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexLessThanOrEqualTo(Double value) {
            addCriterion("volume_chain_index <=", value, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexIn(List<Double> values) {
            addCriterion("volume_chain_index in", values, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexNotIn(List<Double> values) {
            addCriterion("volume_chain_index not in", values, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexBetween(Double value1, Double value2) {
            addCriterion("volume_chain_index between", value1, value2, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andVolumeChainIndexNotBetween(Double value1, Double value2) {
            addCriterion("volume_chain_index not between", value1, value2, "volumeChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountIsNull() {
            addCriterion("new_customer_count is null");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountIsNotNull() {
            addCriterion("new_customer_count is not null");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountEqualTo(Long value) {
            addCriterion("new_customer_count =", value, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountNotEqualTo(Long value) {
            addCriterion("new_customer_count <>", value, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountGreaterThan(Long value) {
            addCriterion("new_customer_count >", value, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountGreaterThanOrEqualTo(Long value) {
            addCriterion("new_customer_count >=", value, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountLessThan(Long value) {
            addCriterion("new_customer_count <", value, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountLessThanOrEqualTo(Long value) {
            addCriterion("new_customer_count <=", value, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountIn(List<Long> values) {
            addCriterion("new_customer_count in", values, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountNotIn(List<Long> values) {
            addCriterion("new_customer_count not in", values, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountBetween(Long value1, Long value2) {
            addCriterion("new_customer_count between", value1, value2, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountNotBetween(Long value1, Long value2) {
            addCriterion("new_customer_count not between", value1, value2, "newCustomerCount");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexIsNull() {
            addCriterion("new_customer_count_chain_index is null");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexIsNotNull() {
            addCriterion("new_customer_count_chain_index is not null");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexEqualTo(Double value) {
            addCriterion("new_customer_count_chain_index =", value, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexNotEqualTo(Double value) {
            addCriterion("new_customer_count_chain_index <>", value, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexGreaterThan(Double value) {
            addCriterion("new_customer_count_chain_index >", value, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexGreaterThanOrEqualTo(Double value) {
            addCriterion("new_customer_count_chain_index >=", value, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexLessThan(Double value) {
            addCriterion("new_customer_count_chain_index <", value, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexLessThanOrEqualTo(Double value) {
            addCriterion("new_customer_count_chain_index <=", value, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexIn(List<Double> values) {
            addCriterion("new_customer_count_chain_index in", values, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexNotIn(List<Double> values) {
            addCriterion("new_customer_count_chain_index not in", values, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexBetween(Double value1, Double value2) {
            addCriterion("new_customer_count_chain_index between", value1, value2, "newCustomerCountChainIndex");
            return (Criteria) this;
        }

        public Criteria andNewCustomerCountChainIndexNotBetween(Double value1, Double value2) {
            addCriterion("new_customer_count_chain_index not between", value1, value2, "newCustomerCountChainIndex");
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

        public Criteria andAllocCentreLikeInsensitive(String value) {
            addCriterion("upper(alloc_centre) like", value.toUpperCase(), "allocCentre");
            return (Criteria) this;
        }

        public Criteria andRegionLikeInsensitive(String value) {
            addCriterion("upper(region) like", value.toUpperCase(), "region");
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