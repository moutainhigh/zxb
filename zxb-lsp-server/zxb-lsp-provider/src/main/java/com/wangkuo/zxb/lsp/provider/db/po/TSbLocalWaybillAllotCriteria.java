package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbLocalWaybillAllotCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbLocalWaybillAllotCriteria() {
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

        public Criteria andWaybillIdIsNull() {
            addCriterion("waybill_id is null");
            return (Criteria) this;
        }

        public Criteria andWaybillIdIsNotNull() {
            addCriterion("waybill_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillIdEqualTo(Long value) {
            addCriterion("waybill_id =", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotEqualTo(Long value) {
            addCriterion("waybill_id <>", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdGreaterThan(Long value) {
            addCriterion("waybill_id >", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("waybill_id >=", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLessThan(Long value) {
            addCriterion("waybill_id <", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLessThanOrEqualTo(Long value) {
            addCriterion("waybill_id <=", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdIn(List<Long> values) {
            addCriterion("waybill_id in", values, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotIn(List<Long> values) {
            addCriterion("waybill_id not in", values, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdBetween(Long value1, Long value2) {
            addCriterion("waybill_id between", value1, value2, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotBetween(Long value1, Long value2) {
            addCriterion("waybill_id not between", value1, value2, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillSnIsNull() {
            addCriterion("waybill_sn is null");
            return (Criteria) this;
        }

        public Criteria andWaybillSnIsNotNull() {
            addCriterion("waybill_sn is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillSnEqualTo(String value) {
            addCriterion("waybill_sn =", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnNotEqualTo(String value) {
            addCriterion("waybill_sn <>", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnGreaterThan(String value) {
            addCriterion("waybill_sn >", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_sn >=", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnLessThan(String value) {
            addCriterion("waybill_sn <", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnLessThanOrEqualTo(String value) {
            addCriterion("waybill_sn <=", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnLike(String value) {
            addCriterion("waybill_sn like", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnNotLike(String value) {
            addCriterion("waybill_sn not like", value, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnIn(List<String> values) {
            addCriterion("waybill_sn in", values, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnNotIn(List<String> values) {
            addCriterion("waybill_sn not in", values, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnBetween(String value1, String value2) {
            addCriterion("waybill_sn between", value1, value2, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andWaybillSnNotBetween(String value1, String value2) {
            addCriterion("waybill_sn not between", value1, value2, "waybillSn");
            return (Criteria) this;
        }

        public Criteria andIsAllotIsNull() {
            addCriterion("is_allot is null");
            return (Criteria) this;
        }

        public Criteria andIsAllotIsNotNull() {
            addCriterion("is_allot is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllotEqualTo(Integer value) {
            addCriterion("is_allot =", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotNotEqualTo(Integer value) {
            addCriterion("is_allot <>", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotGreaterThan(Integer value) {
            addCriterion("is_allot >", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_allot >=", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotLessThan(Integer value) {
            addCriterion("is_allot <", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotLessThanOrEqualTo(Integer value) {
            addCriterion("is_allot <=", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotIn(List<Integer> values) {
            addCriterion("is_allot in", values, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotNotIn(List<Integer> values) {
            addCriterion("is_allot not in", values, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotBetween(Integer value1, Integer value2) {
            addCriterion("is_allot between", value1, value2, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_allot not between", value1, value2, "isAllot");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeIsNull() {
            addCriterion("transport_body_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeIsNotNull() {
            addCriterion("transport_body_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeEqualTo(Integer value) {
            addCriterion("transport_body_type =", value, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeNotEqualTo(Integer value) {
            addCriterion("transport_body_type <>", value, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeGreaterThan(Integer value) {
            addCriterion("transport_body_type >", value, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_body_type >=", value, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeLessThan(Integer value) {
            addCriterion("transport_body_type <", value, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("transport_body_type <=", value, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeIn(List<Integer> values) {
            addCriterion("transport_body_type in", values, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeNotIn(List<Integer> values) {
            addCriterion("transport_body_type not in", values, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeBetween(Integer value1, Integer value2) {
            addCriterion("transport_body_type between", value1, value2, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_body_type not between", value1, value2, "transportBodyType");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdIsNull() {
            addCriterion("transport_body_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdIsNotNull() {
            addCriterion("transport_body_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdEqualTo(Long value) {
            addCriterion("transport_body_id =", value, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdNotEqualTo(Long value) {
            addCriterion("transport_body_id <>", value, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdGreaterThan(Long value) {
            addCriterion("transport_body_id >", value, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transport_body_id >=", value, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdLessThan(Long value) {
            addCriterion("transport_body_id <", value, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdLessThanOrEqualTo(Long value) {
            addCriterion("transport_body_id <=", value, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdIn(List<Long> values) {
            addCriterion("transport_body_id in", values, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdNotIn(List<Long> values) {
            addCriterion("transport_body_id not in", values, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdBetween(Long value1, Long value2) {
            addCriterion("transport_body_id between", value1, value2, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportBodyIdNotBetween(Long value1, Long value2) {
            addCriterion("transport_body_id not between", value1, value2, "transportBodyId");
            return (Criteria) this;
        }

        public Criteria andTransportNameIsNull() {
            addCriterion("transport_name is null");
            return (Criteria) this;
        }

        public Criteria andTransportNameIsNotNull() {
            addCriterion("transport_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransportNameEqualTo(String value) {
            addCriterion("transport_name =", value, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameNotEqualTo(String value) {
            addCriterion("transport_name <>", value, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameGreaterThan(String value) {
            addCriterion("transport_name >", value, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameGreaterThanOrEqualTo(String value) {
            addCriterion("transport_name >=", value, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameLessThan(String value) {
            addCriterion("transport_name <", value, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameLessThanOrEqualTo(String value) {
            addCriterion("transport_name <=", value, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameLike(String value) {
            addCriterion("transport_name like", value, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameNotLike(String value) {
            addCriterion("transport_name not like", value, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameIn(List<String> values) {
            addCriterion("transport_name in", values, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameNotIn(List<String> values) {
            addCriterion("transport_name not in", values, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameBetween(String value1, String value2) {
            addCriterion("transport_name between", value1, value2, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportNameNotBetween(String value1, String value2) {
            addCriterion("transport_name not between", value1, value2, "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneIsNull() {
            addCriterion("transport_phone is null");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneIsNotNull() {
            addCriterion("transport_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneEqualTo(String value) {
            addCriterion("transport_phone =", value, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneNotEqualTo(String value) {
            addCriterion("transport_phone <>", value, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneGreaterThan(String value) {
            addCriterion("transport_phone >", value, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("transport_phone >=", value, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneLessThan(String value) {
            addCriterion("transport_phone <", value, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneLessThanOrEqualTo(String value) {
            addCriterion("transport_phone <=", value, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneLike(String value) {
            addCriterion("transport_phone like", value, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneNotLike(String value) {
            addCriterion("transport_phone not like", value, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneIn(List<String> values) {
            addCriterion("transport_phone in", values, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneNotIn(List<String> values) {
            addCriterion("transport_phone not in", values, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneBetween(String value1, String value2) {
            addCriterion("transport_phone between", value1, value2, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneNotBetween(String value1, String value2) {
            addCriterion("transport_phone not between", value1, value2, "transportPhone");
            return (Criteria) this;
        }

        public Criteria andHoursLimitIsNull() {
            addCriterion("hours_limit is null");
            return (Criteria) this;
        }

        public Criteria andHoursLimitIsNotNull() {
            addCriterion("hours_limit is not null");
            return (Criteria) this;
        }

        public Criteria andHoursLimitEqualTo(Integer value) {
            addCriterion("hours_limit =", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitNotEqualTo(Integer value) {
            addCriterion("hours_limit <>", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitGreaterThan(Integer value) {
            addCriterion("hours_limit >", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("hours_limit >=", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitLessThan(Integer value) {
            addCriterion("hours_limit <", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitLessThanOrEqualTo(Integer value) {
            addCriterion("hours_limit <=", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitIn(List<Integer> values) {
            addCriterion("hours_limit in", values, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitNotIn(List<Integer> values) {
            addCriterion("hours_limit not in", values, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitBetween(Integer value1, Integer value2) {
            addCriterion("hours_limit between", value1, value2, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("hours_limit not between", value1, value2, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeIsNull() {
            addCriterion("predict_send_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeIsNotNull() {
            addCriterion("predict_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeEqualTo(Date value) {
            addCriterion("predict_send_time =", value, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeNotEqualTo(Date value) {
            addCriterion("predict_send_time <>", value, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeGreaterThan(Date value) {
            addCriterion("predict_send_time >", value, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("predict_send_time >=", value, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeLessThan(Date value) {
            addCriterion("predict_send_time <", value, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("predict_send_time <=", value, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeIn(List<Date> values) {
            addCriterion("predict_send_time in", values, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeNotIn(List<Date> values) {
            addCriterion("predict_send_time not in", values, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeBetween(Date value1, Date value2) {
            addCriterion("predict_send_time between", value1, value2, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andPredictSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("predict_send_time not between", value1, value2, "predictSendTime");
            return (Criteria) this;
        }

        public Criteria andRansitFeeIsNull() {
            addCriterion("ransit_fee is null");
            return (Criteria) this;
        }

        public Criteria andRansitFeeIsNotNull() {
            addCriterion("ransit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRansitFeeEqualTo(BigDecimal value) {
            addCriterion("ransit_fee =", value, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeNotEqualTo(BigDecimal value) {
            addCriterion("ransit_fee <>", value, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeGreaterThan(BigDecimal value) {
            addCriterion("ransit_fee >", value, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ransit_fee >=", value, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeLessThan(BigDecimal value) {
            addCriterion("ransit_fee <", value, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ransit_fee <=", value, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeIn(List<BigDecimal> values) {
            addCriterion("ransit_fee in", values, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeNotIn(List<BigDecimal> values) {
            addCriterion("ransit_fee not in", values, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ransit_fee between", value1, value2, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRansitFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ransit_fee not between", value1, value2, "ransitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeIsNull() {
            addCriterion("real_ransit_fee is null");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeIsNotNull() {
            addCriterion("real_ransit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeEqualTo(BigDecimal value) {
            addCriterion("real_ransit_fee =", value, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeNotEqualTo(BigDecimal value) {
            addCriterion("real_ransit_fee <>", value, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeGreaterThan(BigDecimal value) {
            addCriterion("real_ransit_fee >", value, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_ransit_fee >=", value, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeLessThan(BigDecimal value) {
            addCriterion("real_ransit_fee <", value, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_ransit_fee <=", value, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeIn(List<BigDecimal> values) {
            addCriterion("real_ransit_fee in", values, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeNotIn(List<BigDecimal> values) {
            addCriterion("real_ransit_fee not in", values, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_ransit_fee between", value1, value2, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_ransit_fee not between", value1, value2, "realRansitFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeIsNull() {
            addCriterion("Information_fee is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeIsNotNull() {
            addCriterion("Information_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeEqualTo(BigDecimal value) {
            addCriterion("Information_fee =", value, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeNotEqualTo(BigDecimal value) {
            addCriterion("Information_fee <>", value, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeGreaterThan(BigDecimal value) {
            addCriterion("Information_fee >", value, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Information_fee >=", value, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeLessThan(BigDecimal value) {
            addCriterion("Information_fee <", value, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Information_fee <=", value, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeIn(List<BigDecimal> values) {
            addCriterion("Information_fee in", values, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeNotIn(List<BigDecimal> values) {
            addCriterion("Information_fee not in", values, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Information_fee between", value1, value2, "informationFee");
            return (Criteria) this;
        }

        public Criteria andInformationFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Information_fee not between", value1, value2, "informationFee");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameIsNull() {
            addCriterion("transit_linkname is null");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameIsNotNull() {
            addCriterion("transit_linkname is not null");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameEqualTo(String value) {
            addCriterion("transit_linkname =", value, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameNotEqualTo(String value) {
            addCriterion("transit_linkname <>", value, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameGreaterThan(String value) {
            addCriterion("transit_linkname >", value, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("transit_linkname >=", value, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameLessThan(String value) {
            addCriterion("transit_linkname <", value, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameLessThanOrEqualTo(String value) {
            addCriterion("transit_linkname <=", value, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameLike(String value) {
            addCriterion("transit_linkname like", value, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameNotLike(String value) {
            addCriterion("transit_linkname not like", value, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameIn(List<String> values) {
            addCriterion("transit_linkname in", values, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameNotIn(List<String> values) {
            addCriterion("transit_linkname not in", values, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameBetween(String value1, String value2) {
            addCriterion("transit_linkname between", value1, value2, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameNotBetween(String value1, String value2) {
            addCriterion("transit_linkname not between", value1, value2, "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andRansitSnIsNull() {
            addCriterion("ransit_sn is null");
            return (Criteria) this;
        }

        public Criteria andRansitSnIsNotNull() {
            addCriterion("ransit_sn is not null");
            return (Criteria) this;
        }

        public Criteria andRansitSnEqualTo(String value) {
            addCriterion("ransit_sn =", value, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnNotEqualTo(String value) {
            addCriterion("ransit_sn <>", value, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnGreaterThan(String value) {
            addCriterion("ransit_sn >", value, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnGreaterThanOrEqualTo(String value) {
            addCriterion("ransit_sn >=", value, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnLessThan(String value) {
            addCriterion("ransit_sn <", value, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnLessThanOrEqualTo(String value) {
            addCriterion("ransit_sn <=", value, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnLike(String value) {
            addCriterion("ransit_sn like", value, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnNotLike(String value) {
            addCriterion("ransit_sn not like", value, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnIn(List<String> values) {
            addCriterion("ransit_sn in", values, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnNotIn(List<String> values) {
            addCriterion("ransit_sn not in", values, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnBetween(String value1, String value2) {
            addCriterion("ransit_sn between", value1, value2, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitSnNotBetween(String value1, String value2) {
            addCriterion("ransit_sn not between", value1, value2, "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceIsNull() {
            addCriterion("ransit_place is null");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceIsNotNull() {
            addCriterion("ransit_place is not null");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceEqualTo(String value) {
            addCriterion("ransit_place =", value, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceNotEqualTo(String value) {
            addCriterion("ransit_place <>", value, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceGreaterThan(String value) {
            addCriterion("ransit_place >", value, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("ransit_place >=", value, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceLessThan(String value) {
            addCriterion("ransit_place <", value, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceLessThanOrEqualTo(String value) {
            addCriterion("ransit_place <=", value, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceLike(String value) {
            addCriterion("ransit_place like", value, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceNotLike(String value) {
            addCriterion("ransit_place not like", value, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceIn(List<String> values) {
            addCriterion("ransit_place in", values, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceNotIn(List<String> values) {
            addCriterion("ransit_place not in", values, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceBetween(String value1, String value2) {
            addCriterion("ransit_place between", value1, value2, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceNotBetween(String value1, String value2) {
            addCriterion("ransit_place not between", value1, value2, "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitTelIsNull() {
            addCriterion("ransit_tel is null");
            return (Criteria) this;
        }

        public Criteria andRansitTelIsNotNull() {
            addCriterion("ransit_tel is not null");
            return (Criteria) this;
        }

        public Criteria andRansitTelEqualTo(String value) {
            addCriterion("ransit_tel =", value, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelNotEqualTo(String value) {
            addCriterion("ransit_tel <>", value, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelGreaterThan(String value) {
            addCriterion("ransit_tel >", value, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelGreaterThanOrEqualTo(String value) {
            addCriterion("ransit_tel >=", value, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelLessThan(String value) {
            addCriterion("ransit_tel <", value, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelLessThanOrEqualTo(String value) {
            addCriterion("ransit_tel <=", value, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelLike(String value) {
            addCriterion("ransit_tel like", value, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelNotLike(String value) {
            addCriterion("ransit_tel not like", value, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelIn(List<String> values) {
            addCriterion("ransit_tel in", values, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelNotIn(List<String> values) {
            addCriterion("ransit_tel not in", values, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelBetween(String value1, String value2) {
            addCriterion("ransit_tel between", value1, value2, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andRansitTelNotBetween(String value1, String value2) {
            addCriterion("ransit_tel not between", value1, value2, "ransitTel");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusIsNull() {
            addCriterion("verifi_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusIsNotNull() {
            addCriterion("verifi_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusEqualTo(Integer value) {
            addCriterion("verifi_status =", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusNotEqualTo(Integer value) {
            addCriterion("verifi_status <>", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusGreaterThan(Integer value) {
            addCriterion("verifi_status >", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verifi_status >=", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusLessThan(Integer value) {
            addCriterion("verifi_status <", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("verifi_status <=", value, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusIn(List<Integer> values) {
            addCriterion("verifi_status in", values, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusNotIn(List<Integer> values) {
            addCriterion("verifi_status not in", values, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusBetween(Integer value1, Integer value2) {
            addCriterion("verifi_status between", value1, value2, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("verifi_status not between", value1, value2, "verifiStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdIsNull() {
            addCriterion("verifi_user_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdIsNotNull() {
            addCriterion("verifi_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdEqualTo(Long value) {
            addCriterion("verifi_user_id =", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdNotEqualTo(Long value) {
            addCriterion("verifi_user_id <>", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdGreaterThan(Long value) {
            addCriterion("verifi_user_id >", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("verifi_user_id >=", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdLessThan(Long value) {
            addCriterion("verifi_user_id <", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdLessThanOrEqualTo(Long value) {
            addCriterion("verifi_user_id <=", value, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdIn(List<Long> values) {
            addCriterion("verifi_user_id in", values, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdNotIn(List<Long> values) {
            addCriterion("verifi_user_id not in", values, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdBetween(Long value1, Long value2) {
            addCriterion("verifi_user_id between", value1, value2, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserIdNotBetween(Long value1, Long value2) {
            addCriterion("verifi_user_id not between", value1, value2, "verifiUserId");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameIsNull() {
            addCriterion("verifi_user_name is null");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameIsNotNull() {
            addCriterion("verifi_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameEqualTo(String value) {
            addCriterion("verifi_user_name =", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameNotEqualTo(String value) {
            addCriterion("verifi_user_name <>", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameGreaterThan(String value) {
            addCriterion("verifi_user_name >", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("verifi_user_name >=", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameLessThan(String value) {
            addCriterion("verifi_user_name <", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameLessThanOrEqualTo(String value) {
            addCriterion("verifi_user_name <=", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameLike(String value) {
            addCriterion("verifi_user_name like", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameNotLike(String value) {
            addCriterion("verifi_user_name not like", value, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameIn(List<String> values) {
            addCriterion("verifi_user_name in", values, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameNotIn(List<String> values) {
            addCriterion("verifi_user_name not in", values, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameBetween(String value1, String value2) {
            addCriterion("verifi_user_name between", value1, value2, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameNotBetween(String value1, String value2) {
            addCriterion("verifi_user_name not between", value1, value2, "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeIsNull() {
            addCriterion("verifi_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeIsNotNull() {
            addCriterion("verifi_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeEqualTo(Date value) {
            addCriterion("verifi_time =", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeNotEqualTo(Date value) {
            addCriterion("verifi_time <>", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeGreaterThan(Date value) {
            addCriterion("verifi_time >", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verifi_time >=", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeLessThan(Date value) {
            addCriterion("verifi_time <", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeLessThanOrEqualTo(Date value) {
            addCriterion("verifi_time <=", value, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeIn(List<Date> values) {
            addCriterion("verifi_time in", values, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeNotIn(List<Date> values) {
            addCriterion("verifi_time not in", values, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeBetween(Date value1, Date value2) {
            addCriterion("verifi_time between", value1, value2, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiTimeNotBetween(Date value1, Date value2) {
            addCriterion("verifi_time not between", value1, value2, "verifiTime");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoIsNull() {
            addCriterion("verifi_memo is null");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoIsNotNull() {
            addCriterion("verifi_memo is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoEqualTo(String value) {
            addCriterion("verifi_memo =", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoNotEqualTo(String value) {
            addCriterion("verifi_memo <>", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoGreaterThan(String value) {
            addCriterion("verifi_memo >", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoGreaterThanOrEqualTo(String value) {
            addCriterion("verifi_memo >=", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoLessThan(String value) {
            addCriterion("verifi_memo <", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoLessThanOrEqualTo(String value) {
            addCriterion("verifi_memo <=", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoLike(String value) {
            addCriterion("verifi_memo like", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoNotLike(String value) {
            addCriterion("verifi_memo not like", value, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoIn(List<String> values) {
            addCriterion("verifi_memo in", values, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoNotIn(List<String> values) {
            addCriterion("verifi_memo not in", values, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoBetween(String value1, String value2) {
            addCriterion("verifi_memo between", value1, value2, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoNotBetween(String value1, String value2) {
            addCriterion("verifi_memo not between", value1, value2, "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdIsNull() {
            addCriterion("payment_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdIsNotNull() {
            addCriterion("payment_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdEqualTo(Long value) {
            addCriterion("payment_user_id =", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdNotEqualTo(Long value) {
            addCriterion("payment_user_id <>", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdGreaterThan(Long value) {
            addCriterion("payment_user_id >", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_user_id >=", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdLessThan(Long value) {
            addCriterion("payment_user_id <", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdLessThanOrEqualTo(Long value) {
            addCriterion("payment_user_id <=", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdIn(List<Long> values) {
            addCriterion("payment_user_id in", values, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdNotIn(List<Long> values) {
            addCriterion("payment_user_id not in", values, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdBetween(Long value1, Long value2) {
            addCriterion("payment_user_id between", value1, value2, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdNotBetween(Long value1, Long value2) {
            addCriterion("payment_user_id not between", value1, value2, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameIsNull() {
            addCriterion("payment_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameIsNotNull() {
            addCriterion("payment_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameEqualTo(String value) {
            addCriterion("payment_user_name =", value, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameNotEqualTo(String value) {
            addCriterion("payment_user_name <>", value, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameGreaterThan(String value) {
            addCriterion("payment_user_name >", value, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("payment_user_name >=", value, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameLessThan(String value) {
            addCriterion("payment_user_name <", value, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameLessThanOrEqualTo(String value) {
            addCriterion("payment_user_name <=", value, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameLike(String value) {
            addCriterion("payment_user_name like", value, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameNotLike(String value) {
            addCriterion("payment_user_name not like", value, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameIn(List<String> values) {
            addCriterion("payment_user_name in", values, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameNotIn(List<String> values) {
            addCriterion("payment_user_name not in", values, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameBetween(String value1, String value2) {
            addCriterion("payment_user_name between", value1, value2, "paymentUserName");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameNotBetween(String value1, String value2) {
            addCriterion("payment_user_name not between", value1, value2, "paymentUserName");
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

        public Criteria andWaybillSnLikeInsensitive(String value) {
            addCriterion("upper(waybill_sn) like", value.toUpperCase(), "waybillSn");
            return (Criteria) this;
        }

        public Criteria andTransportNameLikeInsensitive(String value) {
            addCriterion("upper(transport_name) like", value.toUpperCase(), "transportName");
            return (Criteria) this;
        }

        public Criteria andTransportPhoneLikeInsensitive(String value) {
            addCriterion("upper(transport_phone) like", value.toUpperCase(), "transportPhone");
            return (Criteria) this;
        }

        public Criteria andTransitLinknameLikeInsensitive(String value) {
            addCriterion("upper(transit_linkname) like", value.toUpperCase(), "transitLinkname");
            return (Criteria) this;
        }

        public Criteria andRansitSnLikeInsensitive(String value) {
            addCriterion("upper(ransit_sn) like", value.toUpperCase(), "ransitSn");
            return (Criteria) this;
        }

        public Criteria andRansitPlaceLikeInsensitive(String value) {
            addCriterion("upper(ransit_place) like", value.toUpperCase(), "ransitPlace");
            return (Criteria) this;
        }

        public Criteria andRansitTelLikeInsensitive(String value) {
            addCriterion("upper(ransit_tel) like", value.toUpperCase(), "ransitTel");
            return (Criteria) this;
        }

        public Criteria andVerifiUserNameLikeInsensitive(String value) {
            addCriterion("upper(verifi_user_name) like", value.toUpperCase(), "verifiUserName");
            return (Criteria) this;
        }

        public Criteria andVerifiMemoLikeInsensitive(String value) {
            addCriterion("upper(verifi_memo) like", value.toUpperCase(), "verifiMemo");
            return (Criteria) this;
        }

        public Criteria andPaymentUserNameLikeInsensitive(String value) {
            addCriterion("upper(payment_user_name) like", value.toUpperCase(), "paymentUserName");
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