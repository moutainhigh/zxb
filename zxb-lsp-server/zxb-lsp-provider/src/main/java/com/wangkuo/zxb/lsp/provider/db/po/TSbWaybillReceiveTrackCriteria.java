package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSbWaybillReceiveTrackCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillReceiveTrackCriteria() {
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

        public Criteria andWaybillReceiveIdIsNull() {
            addCriterion("waybill_receive_id is null");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdIsNotNull() {
            addCriterion("waybill_receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdEqualTo(Long value) {
            addCriterion("waybill_receive_id =", value, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdNotEqualTo(Long value) {
            addCriterion("waybill_receive_id <>", value, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdGreaterThan(Long value) {
            addCriterion("waybill_receive_id >", value, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("waybill_receive_id >=", value, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdLessThan(Long value) {
            addCriterion("waybill_receive_id <", value, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdLessThanOrEqualTo(Long value) {
            addCriterion("waybill_receive_id <=", value, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdIn(List<Long> values) {
            addCriterion("waybill_receive_id in", values, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdNotIn(List<Long> values) {
            addCriterion("waybill_receive_id not in", values, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdBetween(Long value1, Long value2) {
            addCriterion("waybill_receive_id between", value1, value2, "waybillReceiveId");
            return (Criteria) this;
        }

        public Criteria andWaybillReceiveIdNotBetween(Long value1, Long value2) {
            addCriterion("waybill_receive_id not between", value1, value2, "waybillReceiveId");
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

        public Criteria andApplyBodyIdIsNull() {
            addCriterion("apply_body_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdIsNotNull() {
            addCriterion("apply_body_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdEqualTo(Long value) {
            addCriterion("apply_body_id =", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdNotEqualTo(Long value) {
            addCriterion("apply_body_id <>", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdGreaterThan(Long value) {
            addCriterion("apply_body_id >", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_body_id >=", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdLessThan(Long value) {
            addCriterion("apply_body_id <", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_body_id <=", value, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdIn(List<Long> values) {
            addCriterion("apply_body_id in", values, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdNotIn(List<Long> values) {
            addCriterion("apply_body_id not in", values, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdBetween(Long value1, Long value2) {
            addCriterion("apply_body_id between", value1, value2, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_body_id not between", value1, value2, "applyBodyId");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameIsNull() {
            addCriterion("apply_body_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameIsNotNull() {
            addCriterion("apply_body_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameEqualTo(String value) {
            addCriterion("apply_body_name =", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameNotEqualTo(String value) {
            addCriterion("apply_body_name <>", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameGreaterThan(String value) {
            addCriterion("apply_body_name >", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_body_name >=", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameLessThan(String value) {
            addCriterion("apply_body_name <", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameLessThanOrEqualTo(String value) {
            addCriterion("apply_body_name <=", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameLike(String value) {
            addCriterion("apply_body_name like", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameNotLike(String value) {
            addCriterion("apply_body_name not like", value, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameIn(List<String> values) {
            addCriterion("apply_body_name in", values, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameNotIn(List<String> values) {
            addCriterion("apply_body_name not in", values, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameBetween(String value1, String value2) {
            addCriterion("apply_body_name between", value1, value2, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameNotBetween(String value1, String value2) {
            addCriterion("apply_body_name not between", value1, value2, "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNull() {
            addCriterion("apply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNotNull() {
            addCriterion("apply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdEqualTo(Long value) {
            addCriterion("apply_user_id =", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotEqualTo(Long value) {
            addCriterion("apply_user_id <>", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThan(Long value) {
            addCriterion("apply_user_id >", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_user_id >=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThan(Long value) {
            addCriterion("apply_user_id <", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_user_id <=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIn(List<Long> values) {
            addCriterion("apply_user_id in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotIn(List<Long> values) {
            addCriterion("apply_user_id not in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdBetween(Long value1, Long value2) {
            addCriterion("apply_user_id between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_user_id not between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNull() {
            addCriterion("apply_user_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNotNull() {
            addCriterion("apply_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameEqualTo(String value) {
            addCriterion("apply_user_name =", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotEqualTo(String value) {
            addCriterion("apply_user_name <>", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThan(String value) {
            addCriterion("apply_user_name >", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_name >=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThan(String value) {
            addCriterion("apply_user_name <", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("apply_user_name <=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLike(String value) {
            addCriterion("apply_user_name like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotLike(String value) {
            addCriterion("apply_user_name not like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIn(List<String> values) {
            addCriterion("apply_user_name in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotIn(List<String> values) {
            addCriterion("apply_user_name not in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameBetween(String value1, String value2) {
            addCriterion("apply_user_name between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotBetween(String value1, String value2) {
            addCriterion("apply_user_name not between", value1, value2, "applyUserName");
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

        public Criteria andWaybillSnLikeInsensitive(String value) {
            addCriterion("upper(waybill_sn) like", value.toUpperCase(), "waybillSn");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(memo) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andApplyBodyNameLikeInsensitive(String value) {
            addCriterion("upper(apply_body_name) like", value.toUpperCase(), "applyBodyName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLikeInsensitive(String value) {
            addCriterion("upper(apply_user_name) like", value.toUpperCase(), "applyUserName");
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