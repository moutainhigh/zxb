package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TFbAllotWaybillCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFbAllotWaybillCriteria() {
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

        public Criteria andOverStatusIsNull() {
            addCriterion("over_status is null");
            return (Criteria) this;
        }

        public Criteria andOverStatusIsNotNull() {
            addCriterion("over_status is not null");
            return (Criteria) this;
        }

        public Criteria andOverStatusEqualTo(Integer value) {
            addCriterion("over_status =", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotEqualTo(Integer value) {
            addCriterion("over_status <>", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusGreaterThan(Integer value) {
            addCriterion("over_status >", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("over_status >=", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusLessThan(Integer value) {
            addCriterion("over_status <", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusLessThanOrEqualTo(Integer value) {
            addCriterion("over_status <=", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusIn(List<Integer> values) {
            addCriterion("over_status in", values, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotIn(List<Integer> values) {
            addCriterion("over_status not in", values, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusBetween(Integer value1, Integer value2) {
            addCriterion("over_status between", value1, value2, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("over_status not between", value1, value2, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNull() {
            addCriterion("over_time is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNotNull() {
            addCriterion("over_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEqualTo(Date value) {
            addCriterion("over_time =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(Date value) {
            addCriterion("over_time <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(Date value) {
            addCriterion("over_time >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("over_time >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(Date value) {
            addCriterion("over_time <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("over_time <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<Date> values) {
            addCriterion("over_time in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<Date> values) {
            addCriterion("over_time not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(Date value1, Date value2) {
            addCriterion("over_time between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("over_time not between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverUserIdIsNull() {
            addCriterion("over_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOverUserIdIsNotNull() {
            addCriterion("over_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverUserIdEqualTo(Long value) {
            addCriterion("over_user_id =", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdNotEqualTo(Long value) {
            addCriterion("over_user_id <>", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdGreaterThan(Long value) {
            addCriterion("over_user_id >", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("over_user_id >=", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdLessThan(Long value) {
            addCriterion("over_user_id <", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdLessThanOrEqualTo(Long value) {
            addCriterion("over_user_id <=", value, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdIn(List<Long> values) {
            addCriterion("over_user_id in", values, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdNotIn(List<Long> values) {
            addCriterion("over_user_id not in", values, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdBetween(Long value1, Long value2) {
            addCriterion("over_user_id between", value1, value2, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserIdNotBetween(Long value1, Long value2) {
            addCriterion("over_user_id not between", value1, value2, "overUserId");
            return (Criteria) this;
        }

        public Criteria andOverUserNameIsNull() {
            addCriterion("over_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOverUserNameIsNotNull() {
            addCriterion("over_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOverUserNameEqualTo(String value) {
            addCriterion("over_user_name =", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameNotEqualTo(String value) {
            addCriterion("over_user_name <>", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameGreaterThan(String value) {
            addCriterion("over_user_name >", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("over_user_name >=", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameLessThan(String value) {
            addCriterion("over_user_name <", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameLessThanOrEqualTo(String value) {
            addCriterion("over_user_name <=", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameLike(String value) {
            addCriterion("over_user_name like", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameNotLike(String value) {
            addCriterion("over_user_name not like", value, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameIn(List<String> values) {
            addCriterion("over_user_name in", values, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameNotIn(List<String> values) {
            addCriterion("over_user_name not in", values, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameBetween(String value1, String value2) {
            addCriterion("over_user_name between", value1, value2, "overUserName");
            return (Criteria) this;
        }

        public Criteria andOverUserNameNotBetween(String value1, String value2) {
            addCriterion("over_user_name not between", value1, value2, "overUserName");
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

        public Criteria andInformationFeeVerifiStatusIsNull() {
            addCriterion("Information_fee_verifi_status is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusIsNotNull() {
            addCriterion("Information_fee_verifi_status is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusEqualTo(Integer value) {
            addCriterion("Information_fee_verifi_status =", value, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusNotEqualTo(Integer value) {
            addCriterion("Information_fee_verifi_status <>", value, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusGreaterThan(Integer value) {
            addCriterion("Information_fee_verifi_status >", value, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Information_fee_verifi_status >=", value, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusLessThan(Integer value) {
            addCriterion("Information_fee_verifi_status <", value, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Information_fee_verifi_status <=", value, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusIn(List<Integer> values) {
            addCriterion("Information_fee_verifi_status in", values, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusNotIn(List<Integer> values) {
            addCriterion("Information_fee_verifi_status not in", values, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusBetween(Integer value1, Integer value2) {
            addCriterion("Information_fee_verifi_status between", value1, value2, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Information_fee_verifi_status not between", value1, value2, "informationFeeVerifiStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdIsNull() {
            addCriterion("Information_fee_verifi_id is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdIsNotNull() {
            addCriterion("Information_fee_verifi_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdEqualTo(Long value) {
            addCriterion("Information_fee_verifi_id =", value, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdNotEqualTo(Long value) {
            addCriterion("Information_fee_verifi_id <>", value, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdGreaterThan(Long value) {
            addCriterion("Information_fee_verifi_id >", value, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Information_fee_verifi_id >=", value, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdLessThan(Long value) {
            addCriterion("Information_fee_verifi_id <", value, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdLessThanOrEqualTo(Long value) {
            addCriterion("Information_fee_verifi_id <=", value, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdIn(List<Long> values) {
            addCriterion("Information_fee_verifi_id in", values, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdNotIn(List<Long> values) {
            addCriterion("Information_fee_verifi_id not in", values, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdBetween(Long value1, Long value2) {
            addCriterion("Information_fee_verifi_id between", value1, value2, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiIdNotBetween(Long value1, Long value2) {
            addCriterion("Information_fee_verifi_id not between", value1, value2, "informationFeeVerifiId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameIsNull() {
            addCriterion("Information_fee_verifi_name is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameIsNotNull() {
            addCriterion("Information_fee_verifi_name is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameEqualTo(String value) {
            addCriterion("Information_fee_verifi_name =", value, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameNotEqualTo(String value) {
            addCriterion("Information_fee_verifi_name <>", value, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameGreaterThan(String value) {
            addCriterion("Information_fee_verifi_name >", value, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameGreaterThanOrEqualTo(String value) {
            addCriterion("Information_fee_verifi_name >=", value, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameLessThan(String value) {
            addCriterion("Information_fee_verifi_name <", value, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameLessThanOrEqualTo(String value) {
            addCriterion("Information_fee_verifi_name <=", value, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameLike(String value) {
            addCriterion("Information_fee_verifi_name like", value, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameNotLike(String value) {
            addCriterion("Information_fee_verifi_name not like", value, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameIn(List<String> values) {
            addCriterion("Information_fee_verifi_name in", values, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameNotIn(List<String> values) {
            addCriterion("Information_fee_verifi_name not in", values, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameBetween(String value1, String value2) {
            addCriterion("Information_fee_verifi_name between", value1, value2, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameNotBetween(String value1, String value2) {
            addCriterion("Information_fee_verifi_name not between", value1, value2, "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeIsNull() {
            addCriterion("Information_fee_verifi_time is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeIsNotNull() {
            addCriterion("Information_fee_verifi_time is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeEqualTo(Date value) {
            addCriterion("Information_fee_verifi_time =", value, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeNotEqualTo(Date value) {
            addCriterion("Information_fee_verifi_time <>", value, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeGreaterThan(Date value) {
            addCriterion("Information_fee_verifi_time >", value, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Information_fee_verifi_time >=", value, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeLessThan(Date value) {
            addCriterion("Information_fee_verifi_time <", value, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeLessThanOrEqualTo(Date value) {
            addCriterion("Information_fee_verifi_time <=", value, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeIn(List<Date> values) {
            addCriterion("Information_fee_verifi_time in", values, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeNotIn(List<Date> values) {
            addCriterion("Information_fee_verifi_time not in", values, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeBetween(Date value1, Date value2) {
            addCriterion("Information_fee_verifi_time between", value1, value2, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiTimeNotBetween(Date value1, Date value2) {
            addCriterion("Information_fee_verifi_time not between", value1, value2, "informationFeeVerifiTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusIsNull() {
            addCriterion("Information_fee_over_status is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusIsNotNull() {
            addCriterion("Information_fee_over_status is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusEqualTo(Integer value) {
            addCriterion("Information_fee_over_status =", value, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusNotEqualTo(Integer value) {
            addCriterion("Information_fee_over_status <>", value, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusGreaterThan(Integer value) {
            addCriterion("Information_fee_over_status >", value, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Information_fee_over_status >=", value, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusLessThan(Integer value) {
            addCriterion("Information_fee_over_status <", value, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Information_fee_over_status <=", value, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusIn(List<Integer> values) {
            addCriterion("Information_fee_over_status in", values, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusNotIn(List<Integer> values) {
            addCriterion("Information_fee_over_status not in", values, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusBetween(Integer value1, Integer value2) {
            addCriterion("Information_fee_over_status between", value1, value2, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Information_fee_over_status not between", value1, value2, "informationFeeOverStatus");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeIsNull() {
            addCriterion("Information_fee_over_time is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeIsNotNull() {
            addCriterion("Information_fee_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeEqualTo(Date value) {
            addCriterion("Information_fee_over_time =", value, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeNotEqualTo(Date value) {
            addCriterion("Information_fee_over_time <>", value, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeGreaterThan(Date value) {
            addCriterion("Information_fee_over_time >", value, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Information_fee_over_time >=", value, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeLessThan(Date value) {
            addCriterion("Information_fee_over_time <", value, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("Information_fee_over_time <=", value, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeIn(List<Date> values) {
            addCriterion("Information_fee_over_time in", values, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeNotIn(List<Date> values) {
            addCriterion("Information_fee_over_time not in", values, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeBetween(Date value1, Date value2) {
            addCriterion("Information_fee_over_time between", value1, value2, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("Information_fee_over_time not between", value1, value2, "informationFeeOverTime");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdIsNull() {
            addCriterion("Information_fee_over_id is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdIsNotNull() {
            addCriterion("Information_fee_over_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdEqualTo(Long value) {
            addCriterion("Information_fee_over_id =", value, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdNotEqualTo(Long value) {
            addCriterion("Information_fee_over_id <>", value, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdGreaterThan(Long value) {
            addCriterion("Information_fee_over_id >", value, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Information_fee_over_id >=", value, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdLessThan(Long value) {
            addCriterion("Information_fee_over_id <", value, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdLessThanOrEqualTo(Long value) {
            addCriterion("Information_fee_over_id <=", value, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdIn(List<Long> values) {
            addCriterion("Information_fee_over_id in", values, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdNotIn(List<Long> values) {
            addCriterion("Information_fee_over_id not in", values, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdBetween(Long value1, Long value2) {
            addCriterion("Information_fee_over_id between", value1, value2, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverIdNotBetween(Long value1, Long value2) {
            addCriterion("Information_fee_over_id not between", value1, value2, "informationFeeOverId");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameIsNull() {
            addCriterion("Information_fee_over_name is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameIsNotNull() {
            addCriterion("Information_fee_over_name is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameEqualTo(String value) {
            addCriterion("Information_fee_over_name =", value, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameNotEqualTo(String value) {
            addCriterion("Information_fee_over_name <>", value, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameGreaterThan(String value) {
            addCriterion("Information_fee_over_name >", value, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameGreaterThanOrEqualTo(String value) {
            addCriterion("Information_fee_over_name >=", value, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameLessThan(String value) {
            addCriterion("Information_fee_over_name <", value, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameLessThanOrEqualTo(String value) {
            addCriterion("Information_fee_over_name <=", value, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameLike(String value) {
            addCriterion("Information_fee_over_name like", value, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameNotLike(String value) {
            addCriterion("Information_fee_over_name not like", value, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameIn(List<String> values) {
            addCriterion("Information_fee_over_name in", values, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameNotIn(List<String> values) {
            addCriterion("Information_fee_over_name not in", values, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameBetween(String value1, String value2) {
            addCriterion("Information_fee_over_name between", value1, value2, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameNotBetween(String value1, String value2) {
            addCriterion("Information_fee_over_name not between", value1, value2, "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("service_fee is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(BigDecimal value) {
            addCriterion("service_fee =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("service_fee <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("service_fee >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(BigDecimal value) {
            addCriterion("service_fee <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<BigDecimal> values) {
            addCriterion("service_fee in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("service_fee not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee not between", value1, value2, "serviceFee");
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

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeIsNull() {
            addCriterion("pre_ransit_fee is null");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeIsNotNull() {
            addCriterion("pre_ransit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeEqualTo(BigDecimal value) {
            addCriterion("pre_ransit_fee =", value, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeNotEqualTo(BigDecimal value) {
            addCriterion("pre_ransit_fee <>", value, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeGreaterThan(BigDecimal value) {
            addCriterion("pre_ransit_fee >", value, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_ransit_fee >=", value, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeLessThan(BigDecimal value) {
            addCriterion("pre_ransit_fee <", value, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_ransit_fee <=", value, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeIn(List<BigDecimal> values) {
            addCriterion("pre_ransit_fee in", values, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeNotIn(List<BigDecimal> values) {
            addCriterion("pre_ransit_fee not in", values, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_ransit_fee between", value1, value2, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreRansitFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_ransit_fee not between", value1, value2, "preRansitFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeIsNull() {
            addCriterion("pre_send_good_fee is null");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeIsNotNull() {
            addCriterion("pre_send_good_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeEqualTo(BigDecimal value) {
            addCriterion("pre_send_good_fee =", value, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeNotEqualTo(BigDecimal value) {
            addCriterion("pre_send_good_fee <>", value, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeGreaterThan(BigDecimal value) {
            addCriterion("pre_send_good_fee >", value, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_send_good_fee >=", value, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeLessThan(BigDecimal value) {
            addCriterion("pre_send_good_fee <", value, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_send_good_fee <=", value, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeIn(List<BigDecimal> values) {
            addCriterion("pre_send_good_fee in", values, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeNotIn(List<BigDecimal> values) {
            addCriterion("pre_send_good_fee not in", values, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_send_good_fee between", value1, value2, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andPreSendGoodFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_send_good_fee not between", value1, value2, "preSendGoodFee");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotIsNull() {
            addCriterion("is_confirm_pre_allot is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotIsNotNull() {
            addCriterion("is_confirm_pre_allot is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotEqualTo(Integer value) {
            addCriterion("is_confirm_pre_allot =", value, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotNotEqualTo(Integer value) {
            addCriterion("is_confirm_pre_allot <>", value, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotGreaterThan(Integer value) {
            addCriterion("is_confirm_pre_allot >", value, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_confirm_pre_allot >=", value, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotLessThan(Integer value) {
            addCriterion("is_confirm_pre_allot <", value, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotLessThanOrEqualTo(Integer value) {
            addCriterion("is_confirm_pre_allot <=", value, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotIn(List<Integer> values) {
            addCriterion("is_confirm_pre_allot in", values, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotNotIn(List<Integer> values) {
            addCriterion("is_confirm_pre_allot not in", values, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotBetween(Integer value1, Integer value2) {
            addCriterion("is_confirm_pre_allot between", value1, value2, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andIsConfirmPreAllotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_confirm_pre_allot not between", value1, value2, "isConfirmPreAllot");
            return (Criteria) this;
        }

        public Criteria andDepartStatusIsNull() {
            addCriterion("depart_status is null");
            return (Criteria) this;
        }

        public Criteria andDepartStatusIsNotNull() {
            addCriterion("depart_status is not null");
            return (Criteria) this;
        }

        public Criteria andDepartStatusEqualTo(Integer value) {
            addCriterion("depart_status =", value, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusNotEqualTo(Integer value) {
            addCriterion("depart_status <>", value, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusGreaterThan(Integer value) {
            addCriterion("depart_status >", value, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("depart_status >=", value, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusLessThan(Integer value) {
            addCriterion("depart_status <", value, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusLessThanOrEqualTo(Integer value) {
            addCriterion("depart_status <=", value, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusIn(List<Integer> values) {
            addCriterion("depart_status in", values, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusNotIn(List<Integer> values) {
            addCriterion("depart_status not in", values, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusBetween(Integer value1, Integer value2) {
            addCriterion("depart_status between", value1, value2, "departStatus");
            return (Criteria) this;
        }

        public Criteria andDepartStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("depart_status not between", value1, value2, "departStatus");
            return (Criteria) this;
        }

        public Criteria andRansitNumIsNull() {
            addCriterion("ransit_num is null");
            return (Criteria) this;
        }

        public Criteria andRansitNumIsNotNull() {
            addCriterion("ransit_num is not null");
            return (Criteria) this;
        }

        public Criteria andRansitNumEqualTo(Integer value) {
            addCriterion("ransit_num =", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumNotEqualTo(Integer value) {
            addCriterion("ransit_num <>", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumGreaterThan(Integer value) {
            addCriterion("ransit_num >", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ransit_num >=", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumLessThan(Integer value) {
            addCriterion("ransit_num <", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumLessThanOrEqualTo(Integer value) {
            addCriterion("ransit_num <=", value, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumIn(List<Integer> values) {
            addCriterion("ransit_num in", values, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumNotIn(List<Integer> values) {
            addCriterion("ransit_num not in", values, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumBetween(Integer value1, Integer value2) {
            addCriterion("ransit_num between", value1, value2, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRansitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ransit_num not between", value1, value2, "ransitNum");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNull() {
            addCriterion("run_time is null");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNotNull() {
            addCriterion("run_time is not null");
            return (Criteria) this;
        }

        public Criteria andRunTimeEqualTo(Integer value) {
            addCriterion("run_time =", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotEqualTo(Integer value) {
            addCriterion("run_time <>", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThan(Integer value) {
            addCriterion("run_time >", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_time >=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThan(Integer value) {
            addCriterion("run_time <", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThanOrEqualTo(Integer value) {
            addCriterion("run_time <=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeIn(List<Integer> values) {
            addCriterion("run_time in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotIn(List<Integer> values) {
            addCriterion("run_time not in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeBetween(Integer value1, Integer value2) {
            addCriterion("run_time between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("run_time not between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIsNull() {
            addCriterion("depart_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIsNotNull() {
            addCriterion("depart_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartTimeEqualTo(Date value) {
            addCriterion("depart_time =", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotEqualTo(Date value) {
            addCriterion("depart_time <>", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeGreaterThan(Date value) {
            addCriterion("depart_time >", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("depart_time >=", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLessThan(Date value) {
            addCriterion("depart_time <", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLessThanOrEqualTo(Date value) {
            addCriterion("depart_time <=", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIn(List<Date> values) {
            addCriterion("depart_time in", values, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotIn(List<Date> values) {
            addCriterion("depart_time not in", values, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeBetween(Date value1, Date value2) {
            addCriterion("depart_time between", value1, value2, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotBetween(Date value1, Date value2) {
            addCriterion("depart_time not between", value1, value2, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdIsNull() {
            addCriterion("depart_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdIsNotNull() {
            addCriterion("depart_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdEqualTo(Long value) {
            addCriterion("depart_user_id =", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdNotEqualTo(Long value) {
            addCriterion("depart_user_id <>", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdGreaterThan(Long value) {
            addCriterion("depart_user_id >", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("depart_user_id >=", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdLessThan(Long value) {
            addCriterion("depart_user_id <", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdLessThanOrEqualTo(Long value) {
            addCriterion("depart_user_id <=", value, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdIn(List<Long> values) {
            addCriterion("depart_user_id in", values, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdNotIn(List<Long> values) {
            addCriterion("depart_user_id not in", values, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdBetween(Long value1, Long value2) {
            addCriterion("depart_user_id between", value1, value2, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserIdNotBetween(Long value1, Long value2) {
            addCriterion("depart_user_id not between", value1, value2, "departUserId");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameIsNull() {
            addCriterion("depart_user_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameIsNotNull() {
            addCriterion("depart_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameEqualTo(String value) {
            addCriterion("depart_user_name =", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameNotEqualTo(String value) {
            addCriterion("depart_user_name <>", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameGreaterThan(String value) {
            addCriterion("depart_user_name >", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_user_name >=", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameLessThan(String value) {
            addCriterion("depart_user_name <", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameLessThanOrEqualTo(String value) {
            addCriterion("depart_user_name <=", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameLike(String value) {
            addCriterion("depart_user_name like", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameNotLike(String value) {
            addCriterion("depart_user_name not like", value, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameIn(List<String> values) {
            addCriterion("depart_user_name in", values, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameNotIn(List<String> values) {
            addCriterion("depart_user_name not in", values, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameBetween(String value1, String value2) {
            addCriterion("depart_user_name between", value1, value2, "departUserName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameNotBetween(String value1, String value2) {
            addCriterion("depart_user_name not between", value1, value2, "departUserName");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeIsNull() {
            addCriterion("main_line_fee is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeIsNotNull() {
            addCriterion("main_line_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeEqualTo(BigDecimal value) {
            addCriterion("main_line_fee =", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeNotEqualTo(BigDecimal value) {
            addCriterion("main_line_fee <>", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeGreaterThan(BigDecimal value) {
            addCriterion("main_line_fee >", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("main_line_fee >=", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeLessThan(BigDecimal value) {
            addCriterion("main_line_fee <", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("main_line_fee <=", value, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeIn(List<BigDecimal> values) {
            addCriterion("main_line_fee in", values, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeNotIn(List<BigDecimal> values) {
            addCriterion("main_line_fee not in", values, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_line_fee between", value1, value2, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_line_fee not between", value1, value2, "mainLineFee");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditIsNull() {
            addCriterion("is_allot_edit is null");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditIsNotNull() {
            addCriterion("is_allot_edit is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditEqualTo(Integer value) {
            addCriterion("is_allot_edit =", value, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditNotEqualTo(Integer value) {
            addCriterion("is_allot_edit <>", value, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditGreaterThan(Integer value) {
            addCriterion("is_allot_edit >", value, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_allot_edit >=", value, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditLessThan(Integer value) {
            addCriterion("is_allot_edit <", value, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditLessThanOrEqualTo(Integer value) {
            addCriterion("is_allot_edit <=", value, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditIn(List<Integer> values) {
            addCriterion("is_allot_edit in", values, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditNotIn(List<Integer> values) {
            addCriterion("is_allot_edit not in", values, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditBetween(Integer value1, Integer value2) {
            addCriterion("is_allot_edit between", value1, value2, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllotEditNotBetween(Integer value1, Integer value2) {
            addCriterion("is_allot_edit not between", value1, value2, "isAllotEdit");
            return (Criteria) this;
        }

        public Criteria andStallIsNull() {
            addCriterion("stall is null");
            return (Criteria) this;
        }

        public Criteria andStallIsNotNull() {
            addCriterion("stall is not null");
            return (Criteria) this;
        }

        public Criteria andStallEqualTo(String value) {
            addCriterion("stall =", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallNotEqualTo(String value) {
            addCriterion("stall <>", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallGreaterThan(String value) {
            addCriterion("stall >", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallGreaterThanOrEqualTo(String value) {
            addCriterion("stall >=", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallLessThan(String value) {
            addCriterion("stall <", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallLessThanOrEqualTo(String value) {
            addCriterion("stall <=", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallLike(String value) {
            addCriterion("stall like", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallNotLike(String value) {
            addCriterion("stall not like", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallIn(List<String> values) {
            addCriterion("stall in", values, "stall");
            return (Criteria) this;
        }

        public Criteria andStallNotIn(List<String> values) {
            addCriterion("stall not in", values, "stall");
            return (Criteria) this;
        }

        public Criteria andStallBetween(String value1, String value2) {
            addCriterion("stall between", value1, value2, "stall");
            return (Criteria) this;
        }

        public Criteria andStallNotBetween(String value1, String value2) {
            addCriterion("stall not between", value1, value2, "stall");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostIsNull() {
            addCriterion("ransit_fee_cost is null");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostIsNotNull() {
            addCriterion("ransit_fee_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostEqualTo(BigDecimal value) {
            addCriterion("ransit_fee_cost =", value, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostNotEqualTo(BigDecimal value) {
            addCriterion("ransit_fee_cost <>", value, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostGreaterThan(BigDecimal value) {
            addCriterion("ransit_fee_cost >", value, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ransit_fee_cost >=", value, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostLessThan(BigDecimal value) {
            addCriterion("ransit_fee_cost <", value, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ransit_fee_cost <=", value, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostIn(List<BigDecimal> values) {
            addCriterion("ransit_fee_cost in", values, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostNotIn(List<BigDecimal> values) {
            addCriterion("ransit_fee_cost not in", values, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ransit_fee_cost between", value1, value2, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRansitFeeCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ransit_fee_cost not between", value1, value2, "ransitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostIsNull() {
            addCriterion("real_ransit_fee_cost is null");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostIsNotNull() {
            addCriterion("real_ransit_fee_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostEqualTo(BigDecimal value) {
            addCriterion("real_ransit_fee_cost =", value, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostNotEqualTo(BigDecimal value) {
            addCriterion("real_ransit_fee_cost <>", value, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostGreaterThan(BigDecimal value) {
            addCriterion("real_ransit_fee_cost >", value, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_ransit_fee_cost >=", value, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostLessThan(BigDecimal value) {
            addCriterion("real_ransit_fee_cost <", value, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_ransit_fee_cost <=", value, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostIn(List<BigDecimal> values) {
            addCriterion("real_ransit_fee_cost in", values, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostNotIn(List<BigDecimal> values) {
            addCriterion("real_ransit_fee_cost not in", values, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_ransit_fee_cost between", value1, value2, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andRealRansitFeeCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_ransit_fee_cost not between", value1, value2, "realRansitFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostIsNull() {
            addCriterion("Information_fee_cost is null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostIsNotNull() {
            addCriterion("Information_fee_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostEqualTo(BigDecimal value) {
            addCriterion("Information_fee_cost =", value, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostNotEqualTo(BigDecimal value) {
            addCriterion("Information_fee_cost <>", value, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostGreaterThan(BigDecimal value) {
            addCriterion("Information_fee_cost >", value, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Information_fee_cost >=", value, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostLessThan(BigDecimal value) {
            addCriterion("Information_fee_cost <", value, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Information_fee_cost <=", value, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostIn(List<BigDecimal> values) {
            addCriterion("Information_fee_cost in", values, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostNotIn(List<BigDecimal> values) {
            addCriterion("Information_fee_cost not in", values, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Information_fee_cost between", value1, value2, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andInformationFeeCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Information_fee_cost not between", value1, value2, "informationFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostIsNull() {
            addCriterion("send_good_fee_cost is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostIsNotNull() {
            addCriterion("send_good_fee_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_cost =", value, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostNotEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_cost <>", value, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostGreaterThan(BigDecimal value) {
            addCriterion("send_good_fee_cost >", value, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_cost >=", value, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostLessThan(BigDecimal value) {
            addCriterion("send_good_fee_cost <", value, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("send_good_fee_cost <=", value, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostIn(List<BigDecimal> values) {
            addCriterion("send_good_fee_cost in", values, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostNotIn(List<BigDecimal> values) {
            addCriterion("send_good_fee_cost not in", values, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_cost between", value1, value2, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andSendGoodFeeCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_good_fee_cost not between", value1, value2, "sendGoodFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostIsNull() {
            addCriterion("main_line_fee_cost is null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostIsNotNull() {
            addCriterion("main_line_fee_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostEqualTo(BigDecimal value) {
            addCriterion("main_line_fee_cost =", value, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostNotEqualTo(BigDecimal value) {
            addCriterion("main_line_fee_cost <>", value, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostGreaterThan(BigDecimal value) {
            addCriterion("main_line_fee_cost >", value, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("main_line_fee_cost >=", value, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostLessThan(BigDecimal value) {
            addCriterion("main_line_fee_cost <", value, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("main_line_fee_cost <=", value, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostIn(List<BigDecimal> values) {
            addCriterion("main_line_fee_cost in", values, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostNotIn(List<BigDecimal> values) {
            addCriterion("main_line_fee_cost not in", values, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_line_fee_cost between", value1, value2, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andMainLineFeeCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("main_line_fee_cost not between", value1, value2, "mainLineFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeIsNull() {
            addCriterion("upstairs_fee is null");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeIsNotNull() {
            addCriterion("upstairs_fee is not null");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeEqualTo(BigDecimal value) {
            addCriterion("upstairs_fee =", value, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeNotEqualTo(BigDecimal value) {
            addCriterion("upstairs_fee <>", value, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeGreaterThan(BigDecimal value) {
            addCriterion("upstairs_fee >", value, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("upstairs_fee >=", value, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeLessThan(BigDecimal value) {
            addCriterion("upstairs_fee <", value, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("upstairs_fee <=", value, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeIn(List<BigDecimal> values) {
            addCriterion("upstairs_fee in", values, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeNotIn(List<BigDecimal> values) {
            addCriterion("upstairs_fee not in", values, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("upstairs_fee between", value1, value2, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("upstairs_fee not between", value1, value2, "upstairsFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeIsNull() {
            addCriterion("unload_fee is null");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeIsNotNull() {
            addCriterion("unload_fee is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeEqualTo(BigDecimal value) {
            addCriterion("unload_fee =", value, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeNotEqualTo(BigDecimal value) {
            addCriterion("unload_fee <>", value, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeGreaterThan(BigDecimal value) {
            addCriterion("unload_fee >", value, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unload_fee >=", value, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeLessThan(BigDecimal value) {
            addCriterion("unload_fee <", value, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unload_fee <=", value, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeIn(List<BigDecimal> values) {
            addCriterion("unload_fee in", values, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeNotIn(List<BigDecimal> values) {
            addCriterion("unload_fee not in", values, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unload_fee between", value1, value2, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unload_fee not between", value1, value2, "unloadFee");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostIsNull() {
            addCriterion("upstairs_fee_cost is null");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostIsNotNull() {
            addCriterion("upstairs_fee_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostEqualTo(Long value) {
            addCriterion("upstairs_fee_cost =", value, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostNotEqualTo(Long value) {
            addCriterion("upstairs_fee_cost <>", value, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostGreaterThan(Long value) {
            addCriterion("upstairs_fee_cost >", value, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostGreaterThanOrEqualTo(Long value) {
            addCriterion("upstairs_fee_cost >=", value, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostLessThan(Long value) {
            addCriterion("upstairs_fee_cost <", value, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostLessThanOrEqualTo(Long value) {
            addCriterion("upstairs_fee_cost <=", value, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostIn(List<Long> values) {
            addCriterion("upstairs_fee_cost in", values, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostNotIn(List<Long> values) {
            addCriterion("upstairs_fee_cost not in", values, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostBetween(Long value1, Long value2) {
            addCriterion("upstairs_fee_cost between", value1, value2, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUpstairsFeeCostNotBetween(Long value1, Long value2) {
            addCriterion("upstairs_fee_cost not between", value1, value2, "upstairsFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostIsNull() {
            addCriterion("unload_fee_cost is null");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostIsNotNull() {
            addCriterion("unload_fee_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostEqualTo(Long value) {
            addCriterion("unload_fee_cost =", value, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostNotEqualTo(Long value) {
            addCriterion("unload_fee_cost <>", value, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostGreaterThan(Long value) {
            addCriterion("unload_fee_cost >", value, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostGreaterThanOrEqualTo(Long value) {
            addCriterion("unload_fee_cost >=", value, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostLessThan(Long value) {
            addCriterion("unload_fee_cost <", value, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostLessThanOrEqualTo(Long value) {
            addCriterion("unload_fee_cost <=", value, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostIn(List<Long> values) {
            addCriterion("unload_fee_cost in", values, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostNotIn(List<Long> values) {
            addCriterion("unload_fee_cost not in", values, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostBetween(Long value1, Long value2) {
            addCriterion("unload_fee_cost between", value1, value2, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andUnloadFeeCostNotBetween(Long value1, Long value2) {
            addCriterion("unload_fee_cost not between", value1, value2, "unloadFeeCost");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNull() {
            addCriterion("express_fee is null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNotNull() {
            addCriterion("express_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeEqualTo(Long value) {
            addCriterion("express_fee =", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotEqualTo(Long value) {
            addCriterion("express_fee <>", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThan(Long value) {
            addCriterion("express_fee >", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("express_fee >=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThan(Long value) {
            addCriterion("express_fee <", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThanOrEqualTo(Long value) {
            addCriterion("express_fee <=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIn(List<Long> values) {
            addCriterion("express_fee in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotIn(List<Long> values) {
            addCriterion("express_fee not in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeBetween(Long value1, Long value2) {
            addCriterion("express_fee between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotBetween(Long value1, Long value2) {
            addCriterion("express_fee not between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeIsNull() {
            addCriterion("signed_receive_fee is null");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeIsNotNull() {
            addCriterion("signed_receive_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeEqualTo(Long value) {
            addCriterion("signed_receive_fee =", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeNotEqualTo(Long value) {
            addCriterion("signed_receive_fee <>", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeGreaterThan(Long value) {
            addCriterion("signed_receive_fee >", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("signed_receive_fee >=", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeLessThan(Long value) {
            addCriterion("signed_receive_fee <", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeLessThanOrEqualTo(Long value) {
            addCriterion("signed_receive_fee <=", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeIn(List<Long> values) {
            addCriterion("signed_receive_fee in", values, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeNotIn(List<Long> values) {
            addCriterion("signed_receive_fee not in", values, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeBetween(Long value1, Long value2) {
            addCriterion("signed_receive_fee between", value1, value2, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeNotBetween(Long value1, Long value2) {
            addCriterion("signed_receive_fee not between", value1, value2, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostIsNull() {
            addCriterion("enter_fee_cost is null");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostIsNotNull() {
            addCriterion("enter_fee_cost is not null");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostEqualTo(Long value) {
            addCriterion("enter_fee_cost =", value, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostNotEqualTo(Long value) {
            addCriterion("enter_fee_cost <>", value, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostGreaterThan(Long value) {
            addCriterion("enter_fee_cost >", value, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostGreaterThanOrEqualTo(Long value) {
            addCriterion("enter_fee_cost >=", value, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostLessThan(Long value) {
            addCriterion("enter_fee_cost <", value, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostLessThanOrEqualTo(Long value) {
            addCriterion("enter_fee_cost <=", value, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostIn(List<Long> values) {
            addCriterion("enter_fee_cost in", values, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostNotIn(List<Long> values) {
            addCriterion("enter_fee_cost not in", values, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostBetween(Long value1, Long value2) {
            addCriterion("enter_fee_cost between", value1, value2, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeCostNotBetween(Long value1, Long value2) {
            addCriterion("enter_fee_cost not between", value1, value2, "enterFeeCost");
            return (Criteria) this;
        }

        public Criteria andEnterFeeIsNull() {
            addCriterion("enter_fee is null");
            return (Criteria) this;
        }

        public Criteria andEnterFeeIsNotNull() {
            addCriterion("enter_fee is not null");
            return (Criteria) this;
        }

        public Criteria andEnterFeeEqualTo(Long value) {
            addCriterion("enter_fee =", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotEqualTo(Long value) {
            addCriterion("enter_fee <>", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeGreaterThan(Long value) {
            addCriterion("enter_fee >", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("enter_fee >=", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeLessThan(Long value) {
            addCriterion("enter_fee <", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeLessThanOrEqualTo(Long value) {
            addCriterion("enter_fee <=", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeIn(List<Long> values) {
            addCriterion("enter_fee in", values, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotIn(List<Long> values) {
            addCriterion("enter_fee not in", values, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeBetween(Long value1, Long value2) {
            addCriterion("enter_fee between", value1, value2, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotBetween(Long value1, Long value2) {
            addCriterion("enter_fee not between", value1, value2, "enterFee");
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

        public Criteria andOverUserNameLikeInsensitive(String value) {
            addCriterion("upper(over_user_name) like", value.toUpperCase(), "overUserName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeVerifiNameLikeInsensitive(String value) {
            addCriterion("upper(Information_fee_verifi_name) like", value.toUpperCase(), "informationFeeVerifiName");
            return (Criteria) this;
        }

        public Criteria andInformationFeeOverNameLikeInsensitive(String value) {
            addCriterion("upper(Information_fee_over_name) like", value.toUpperCase(), "informationFeeOverName");
            return (Criteria) this;
        }

        public Criteria andPartNameLikeInsensitive(String value) {
            addCriterion("upper(part_name) like", value.toUpperCase(), "partName");
            return (Criteria) this;
        }

        public Criteria andDepartUserNameLikeInsensitive(String value) {
            addCriterion("upper(depart_user_name) like", value.toUpperCase(), "departUserName");
            return (Criteria) this;
        }

        public Criteria andStallLikeInsensitive(String value) {
            addCriterion("upper(stall) like", value.toUpperCase(), "stall");
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