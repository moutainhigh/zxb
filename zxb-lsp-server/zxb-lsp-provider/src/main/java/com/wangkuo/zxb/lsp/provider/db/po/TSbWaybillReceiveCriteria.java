package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbWaybillReceiveCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillReceiveCriteria() {
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

        public Criteria andReceiveDayIsNull() {
            addCriterion("receive_day is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDayIsNotNull() {
            addCriterion("receive_day is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDayEqualTo(Integer value) {
            addCriterion("receive_day =", value, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayNotEqualTo(Integer value) {
            addCriterion("receive_day <>", value, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayGreaterThan(Integer value) {
            addCriterion("receive_day >", value, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_day >=", value, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayLessThan(Integer value) {
            addCriterion("receive_day <", value, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayLessThanOrEqualTo(Integer value) {
            addCriterion("receive_day <=", value, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayIn(List<Integer> values) {
            addCriterion("receive_day in", values, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayNotIn(List<Integer> values) {
            addCriterion("receive_day not in", values, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayBetween(Integer value1, Integer value2) {
            addCriterion("receive_day between", value1, value2, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveDayNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_day not between", value1, value2, "receiveDay");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackIsNull() {
            addCriterion("receive_track is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackIsNotNull() {
            addCriterion("receive_track is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackEqualTo(Integer value) {
            addCriterion("receive_track =", value, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackNotEqualTo(Integer value) {
            addCriterion("receive_track <>", value, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackGreaterThan(Integer value) {
            addCriterion("receive_track >", value, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_track >=", value, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackLessThan(Integer value) {
            addCriterion("receive_track <", value, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackLessThanOrEqualTo(Integer value) {
            addCriterion("receive_track <=", value, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackIn(List<Integer> values) {
            addCriterion("receive_track in", values, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackNotIn(List<Integer> values) {
            addCriterion("receive_track not in", values, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackBetween(Integer value1, Integer value2) {
            addCriterion("receive_track between", value1, value2, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceiveTrackNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_track not between", value1, value2, "receiveTrack");
            return (Criteria) this;
        }

        public Criteria andReceivePositionIsNull() {
            addCriterion("receive_position is null");
            return (Criteria) this;
        }

        public Criteria andReceivePositionIsNotNull() {
            addCriterion("receive_position is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePositionEqualTo(Integer value) {
            addCriterion("receive_position =", value, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionNotEqualTo(Integer value) {
            addCriterion("receive_position <>", value, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionGreaterThan(Integer value) {
            addCriterion("receive_position >", value, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_position >=", value, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionLessThan(Integer value) {
            addCriterion("receive_position <", value, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionLessThanOrEqualTo(Integer value) {
            addCriterion("receive_position <=", value, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionIn(List<Integer> values) {
            addCriterion("receive_position in", values, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionNotIn(List<Integer> values) {
            addCriterion("receive_position not in", values, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionBetween(Integer value1, Integer value2) {
            addCriterion("receive_position between", value1, value2, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andReceivePositionNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_position not between", value1, value2, "receivePosition");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("create_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("create_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("create_user_name =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("create_user_name <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("create_user_name >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_name >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("create_user_name <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("create_user_name <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("create_user_name like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("create_user_name not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("create_user_name in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("create_user_name not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("create_user_name between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("create_user_name not between", value1, value2, "createUserName");
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

        public Criteria andLastFollowiUserIdIsNull() {
            addCriterion("last_followi_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdIsNotNull() {
            addCriterion("last_followi_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdEqualTo(Long value) {
            addCriterion("last_followi_user_id =", value, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdNotEqualTo(Long value) {
            addCriterion("last_followi_user_id <>", value, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdGreaterThan(Long value) {
            addCriterion("last_followi_user_id >", value, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("last_followi_user_id >=", value, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdLessThan(Long value) {
            addCriterion("last_followi_user_id <", value, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdLessThanOrEqualTo(Long value) {
            addCriterion("last_followi_user_id <=", value, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdIn(List<Long> values) {
            addCriterion("last_followi_user_id in", values, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdNotIn(List<Long> values) {
            addCriterion("last_followi_user_id not in", values, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdBetween(Long value1, Long value2) {
            addCriterion("last_followi_user_id between", value1, value2, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserIdNotBetween(Long value1, Long value2) {
            addCriterion("last_followi_user_id not between", value1, value2, "lastFollowiUserId");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameIsNull() {
            addCriterion("last_followi_user_name is null");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameIsNotNull() {
            addCriterion("last_followi_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameEqualTo(String value) {
            addCriterion("last_followi_user_name =", value, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameNotEqualTo(String value) {
            addCriterion("last_followi_user_name <>", value, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameGreaterThan(String value) {
            addCriterion("last_followi_user_name >", value, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_followi_user_name >=", value, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameLessThan(String value) {
            addCriterion("last_followi_user_name <", value, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameLessThanOrEqualTo(String value) {
            addCriterion("last_followi_user_name <=", value, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameLike(String value) {
            addCriterion("last_followi_user_name like", value, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameNotLike(String value) {
            addCriterion("last_followi_user_name not like", value, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameIn(List<String> values) {
            addCriterion("last_followi_user_name in", values, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameNotIn(List<String> values) {
            addCriterion("last_followi_user_name not in", values, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameBetween(String value1, String value2) {
            addCriterion("last_followi_user_name between", value1, value2, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameNotBetween(String value1, String value2) {
            addCriterion("last_followi_user_name not between", value1, value2, "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoIsNull() {
            addCriterion("last_followi_memo is null");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoIsNotNull() {
            addCriterion("last_followi_memo is not null");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoEqualTo(String value) {
            addCriterion("last_followi_memo =", value, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoNotEqualTo(String value) {
            addCriterion("last_followi_memo <>", value, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoGreaterThan(String value) {
            addCriterion("last_followi_memo >", value, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoGreaterThanOrEqualTo(String value) {
            addCriterion("last_followi_memo >=", value, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoLessThan(String value) {
            addCriterion("last_followi_memo <", value, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoLessThanOrEqualTo(String value) {
            addCriterion("last_followi_memo <=", value, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoLike(String value) {
            addCriterion("last_followi_memo like", value, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoNotLike(String value) {
            addCriterion("last_followi_memo not like", value, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoIn(List<String> values) {
            addCriterion("last_followi_memo in", values, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoNotIn(List<String> values) {
            addCriterion("last_followi_memo not in", values, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoBetween(String value1, String value2) {
            addCriterion("last_followi_memo between", value1, value2, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoNotBetween(String value1, String value2) {
            addCriterion("last_followi_memo not between", value1, value2, "lastFollowiMemo");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeIsNull() {
            addCriterion("receive_end_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeIsNotNull() {
            addCriterion("receive_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeEqualTo(Date value) {
            addCriterion("receive_end_time =", value, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeNotEqualTo(Date value) {
            addCriterion("receive_end_time <>", value, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeGreaterThan(Date value) {
            addCriterion("receive_end_time >", value, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_end_time >=", value, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeLessThan(Date value) {
            addCriterion("receive_end_time <", value, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_end_time <=", value, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeIn(List<Date> values) {
            addCriterion("receive_end_time in", values, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeNotIn(List<Date> values) {
            addCriterion("receive_end_time not in", values, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeBetween(Date value1, Date value2) {
            addCriterion("receive_end_time between", value1, value2, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_end_time not between", value1, value2, "receiveEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeIsNull() {
            addCriterion("receive_to_allot_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeIsNotNull() {
            addCriterion("receive_to_allot_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeEqualTo(Date value) {
            addCriterion("receive_to_allot_time =", value, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeNotEqualTo(Date value) {
            addCriterion("receive_to_allot_time <>", value, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeGreaterThan(Date value) {
            addCriterion("receive_to_allot_time >", value, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_to_allot_time >=", value, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeLessThan(Date value) {
            addCriterion("receive_to_allot_time <", value, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_to_allot_time <=", value, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeIn(List<Date> values) {
            addCriterion("receive_to_allot_time in", values, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeNotIn(List<Date> values) {
            addCriterion("receive_to_allot_time not in", values, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeBetween(Date value1, Date value2) {
            addCriterion("receive_to_allot_time between", value1, value2, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveToAllotTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_to_allot_time not between", value1, value2, "receiveToAllotTime");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayIsNull() {
            addCriterion("receive_outtime_day is null");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayIsNotNull() {
            addCriterion("receive_outtime_day is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayEqualTo(Integer value) {
            addCriterion("receive_outtime_day =", value, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayNotEqualTo(Integer value) {
            addCriterion("receive_outtime_day <>", value, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayGreaterThan(Integer value) {
            addCriterion("receive_outtime_day >", value, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_outtime_day >=", value, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayLessThan(Integer value) {
            addCriterion("receive_outtime_day <", value, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayLessThanOrEqualTo(Integer value) {
            addCriterion("receive_outtime_day <=", value, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayIn(List<Integer> values) {
            addCriterion("receive_outtime_day in", values, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayNotIn(List<Integer> values) {
            addCriterion("receive_outtime_day not in", values, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayBetween(Integer value1, Integer value2) {
            addCriterion("receive_outtime_day between", value1, value2, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andReceiveOuttimeDayNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_outtime_day not between", value1, value2, "receiveOuttimeDay");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIsNull() {
            addCriterion("is_original is null");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIsNotNull() {
            addCriterion("is_original is not null");
            return (Criteria) this;
        }

        public Criteria andIsOriginalEqualTo(Integer value) {
            addCriterion("is_original =", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotEqualTo(Integer value) {
            addCriterion("is_original <>", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalGreaterThan(Integer value) {
            addCriterion("is_original >", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_original >=", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalLessThan(Integer value) {
            addCriterion("is_original <", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalLessThanOrEqualTo(Integer value) {
            addCriterion("is_original <=", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIn(List<Integer> values) {
            addCriterion("is_original in", values, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotIn(List<Integer> values) {
            addCriterion("is_original not in", values, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalBetween(Integer value1, Integer value2) {
            addCriterion("is_original between", value1, value2, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotBetween(Integer value1, Integer value2) {
            addCriterion("is_original not between", value1, value2, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveIsNull() {
            addCriterion("is_sign_receive is null");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveIsNotNull() {
            addCriterion("is_sign_receive is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveEqualTo(Integer value) {
            addCriterion("is_sign_receive =", value, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveNotEqualTo(Integer value) {
            addCriterion("is_sign_receive <>", value, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveGreaterThan(Integer value) {
            addCriterion("is_sign_receive >", value, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_sign_receive >=", value, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveLessThan(Integer value) {
            addCriterion("is_sign_receive <", value, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_sign_receive <=", value, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveIn(List<Integer> values) {
            addCriterion("is_sign_receive in", values, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveNotIn(List<Integer> values) {
            addCriterion("is_sign_receive not in", values, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveBetween(Integer value1, Integer value2) {
            addCriterion("is_sign_receive between", value1, value2, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSignReceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_sign_receive not between", value1, value2, "isSignReceive");
            return (Criteria) this;
        }

        public Criteria andIsSendOffIsNull() {
            addCriterion("is_send_off is null");
            return (Criteria) this;
        }

        public Criteria andIsSendOffIsNotNull() {
            addCriterion("is_send_off is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendOffEqualTo(Integer value) {
            addCriterion("is_send_off =", value, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffNotEqualTo(Integer value) {
            addCriterion("is_send_off <>", value, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffGreaterThan(Integer value) {
            addCriterion("is_send_off >", value, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_send_off >=", value, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffLessThan(Integer value) {
            addCriterion("is_send_off <", value, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffLessThanOrEqualTo(Integer value) {
            addCriterion("is_send_off <=", value, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffIn(List<Integer> values) {
            addCriterion("is_send_off in", values, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffNotIn(List<Integer> values) {
            addCriterion("is_send_off not in", values, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffBetween(Integer value1, Integer value2) {
            addCriterion("is_send_off between", value1, value2, "isSendOff");
            return (Criteria) this;
        }

        public Criteria andIsSendOffNotBetween(Integer value1, Integer value2) {
            addCriterion("is_send_off not between", value1, value2, "isSendOff");
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

        public Criteria andWaybillSnLikeInsensitive(String value) {
            addCriterion("upper(waybill_sn) like", value.toUpperCase(), "waybillSn");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLikeInsensitive(String value) {
            addCriterion("upper(create_user_name) like", value.toUpperCase(), "createUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiUserNameLikeInsensitive(String value) {
            addCriterion("upper(last_followi_user_name) like", value.toUpperCase(), "lastFollowiUserName");
            return (Criteria) this;
        }

        public Criteria andLastFollowiMemoLikeInsensitive(String value) {
            addCriterion("upper(last_followi_memo) like", value.toUpperCase(), "lastFollowiMemo");
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