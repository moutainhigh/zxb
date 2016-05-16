package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbGoodCategoryAllotCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbGoodCategoryAllotCriteria() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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

        public Criteria andApplyEmployeeIdIsNull() {
            addCriterion("apply_employee_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdIsNotNull() {
            addCriterion("apply_employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdEqualTo(Long value) {
            addCriterion("apply_employee_id =", value, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdNotEqualTo(Long value) {
            addCriterion("apply_employee_id <>", value, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdGreaterThan(Long value) {
            addCriterion("apply_employee_id >", value, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_employee_id >=", value, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdLessThan(Long value) {
            addCriterion("apply_employee_id <", value, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_employee_id <=", value, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdIn(List<Long> values) {
            addCriterion("apply_employee_id in", values, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdNotIn(List<Long> values) {
            addCriterion("apply_employee_id not in", values, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("apply_employee_id between", value1, value2, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_employee_id not between", value1, value2, "applyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameIsNull() {
            addCriterion("apply_employee_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameIsNotNull() {
            addCriterion("apply_employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameEqualTo(String value) {
            addCriterion("apply_employee_name =", value, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameNotEqualTo(String value) {
            addCriterion("apply_employee_name <>", value, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameGreaterThan(String value) {
            addCriterion("apply_employee_name >", value, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_employee_name >=", value, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameLessThan(String value) {
            addCriterion("apply_employee_name <", value, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("apply_employee_name <=", value, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameLike(String value) {
            addCriterion("apply_employee_name like", value, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameNotLike(String value) {
            addCriterion("apply_employee_name not like", value, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameIn(List<String> values) {
            addCriterion("apply_employee_name in", values, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameNotIn(List<String> values) {
            addCriterion("apply_employee_name not in", values, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameBetween(String value1, String value2) {
            addCriterion("apply_employee_name between", value1, value2, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("apply_employee_name not between", value1, value2, "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdIsNull() {
            addCriterion("verify_employee_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdIsNotNull() {
            addCriterion("verify_employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdEqualTo(Long value) {
            addCriterion("verify_employee_id =", value, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdNotEqualTo(Long value) {
            addCriterion("verify_employee_id <>", value, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdGreaterThan(Long value) {
            addCriterion("verify_employee_id >", value, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("verify_employee_id >=", value, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdLessThan(Long value) {
            addCriterion("verify_employee_id <", value, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("verify_employee_id <=", value, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdIn(List<Long> values) {
            addCriterion("verify_employee_id in", values, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdNotIn(List<Long> values) {
            addCriterion("verify_employee_id not in", values, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("verify_employee_id between", value1, value2, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("verify_employee_id not between", value1, value2, "verifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameIsNull() {
            addCriterion("verify_employee_name is null");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameIsNotNull() {
            addCriterion("verify_employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameEqualTo(String value) {
            addCriterion("verify_employee_name =", value, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameNotEqualTo(String value) {
            addCriterion("verify_employee_name <>", value, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameGreaterThan(String value) {
            addCriterion("verify_employee_name >", value, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("verify_employee_name >=", value, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameLessThan(String value) {
            addCriterion("verify_employee_name <", value, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("verify_employee_name <=", value, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameLike(String value) {
            addCriterion("verify_employee_name like", value, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameNotLike(String value) {
            addCriterion("verify_employee_name not like", value, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameIn(List<String> values) {
            addCriterion("verify_employee_name in", values, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameNotIn(List<String> values) {
            addCriterion("verify_employee_name not in", values, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameBetween(String value1, String value2) {
            addCriterion("verify_employee_name between", value1, value2, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("verify_employee_name not between", value1, value2, "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
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

        public Criteria andAllocCenterNameLikeInsensitive(String value) {
            addCriterion("upper(alloc_center_name) like", value.toUpperCase(), "allocCenterName");
            return (Criteria) this;
        }

        public Criteria andApplyEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(apply_employee_name) like", value.toUpperCase(), "applyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andVerifyEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(verify_employee_name) like", value.toUpperCase(), "verifyEmployeeName");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
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