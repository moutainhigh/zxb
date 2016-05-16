package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.util.ArrayList;
import java.util.List;

public class TSbWaybillGoodCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillGoodCriteria() {
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

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andPackIsNull() {
            addCriterion("pack is null");
            return (Criteria) this;
        }

        public Criteria andPackIsNotNull() {
            addCriterion("pack is not null");
            return (Criteria) this;
        }

        public Criteria andPackEqualTo(String value) {
            addCriterion("pack =", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotEqualTo(String value) {
            addCriterion("pack <>", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThan(String value) {
            addCriterion("pack >", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThanOrEqualTo(String value) {
            addCriterion("pack >=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThan(String value) {
            addCriterion("pack <", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThanOrEqualTo(String value) {
            addCriterion("pack <=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLike(String value) {
            addCriterion("pack like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotLike(String value) {
            addCriterion("pack not like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackIn(List<String> values) {
            addCriterion("pack in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotIn(List<String> values) {
            addCriterion("pack not in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackBetween(String value1, String value2) {
            addCriterion("pack between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotBetween(String value1, String value2) {
            addCriterion("pack not between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andOfferWeightIsNull() {
            addCriterion("offer_weight is null");
            return (Criteria) this;
        }

        public Criteria andOfferWeightIsNotNull() {
            addCriterion("offer_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOfferWeightEqualTo(Float value) {
            addCriterion("offer_weight =", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightNotEqualTo(Float value) {
            addCriterion("offer_weight <>", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightGreaterThan(Float value) {
            addCriterion("offer_weight >", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("offer_weight >=", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightLessThan(Float value) {
            addCriterion("offer_weight <", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightLessThanOrEqualTo(Float value) {
            addCriterion("offer_weight <=", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightIn(List<Float> values) {
            addCriterion("offer_weight in", values, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightNotIn(List<Float> values) {
            addCriterion("offer_weight not in", values, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightBetween(Float value1, Float value2) {
            addCriterion("offer_weight between", value1, value2, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightNotBetween(Float value1, Float value2) {
            addCriterion("offer_weight not between", value1, value2, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeIsNull() {
            addCriterion("offer_volume is null");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeIsNotNull() {
            addCriterion("offer_volume is not null");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeEqualTo(Float value) {
            addCriterion("offer_volume =", value, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeNotEqualTo(Float value) {
            addCriterion("offer_volume <>", value, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeGreaterThan(Float value) {
            addCriterion("offer_volume >", value, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("offer_volume >=", value, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeLessThan(Float value) {
            addCriterion("offer_volume <", value, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeLessThanOrEqualTo(Float value) {
            addCriterion("offer_volume <=", value, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeIn(List<Float> values) {
            addCriterion("offer_volume in", values, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeNotIn(List<Float> values) {
            addCriterion("offer_volume not in", values, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeBetween(Float value1, Float value2) {
            addCriterion("offer_volume between", value1, value2, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andOfferVolumeNotBetween(Float value1, Float value2) {
            addCriterion("offer_volume not between", value1, value2, "offerVolume");
            return (Criteria) this;
        }

        public Criteria andRunWeightIsNull() {
            addCriterion("run_weight is null");
            return (Criteria) this;
        }

        public Criteria andRunWeightIsNotNull() {
            addCriterion("run_weight is not null");
            return (Criteria) this;
        }

        public Criteria andRunWeightEqualTo(Float value) {
            addCriterion("run_weight =", value, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightNotEqualTo(Float value) {
            addCriterion("run_weight <>", value, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightGreaterThan(Float value) {
            addCriterion("run_weight >", value, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("run_weight >=", value, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightLessThan(Float value) {
            addCriterion("run_weight <", value, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightLessThanOrEqualTo(Float value) {
            addCriterion("run_weight <=", value, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightIn(List<Float> values) {
            addCriterion("run_weight in", values, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightNotIn(List<Float> values) {
            addCriterion("run_weight not in", values, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightBetween(Float value1, Float value2) {
            addCriterion("run_weight between", value1, value2, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunWeightNotBetween(Float value1, Float value2) {
            addCriterion("run_weight not between", value1, value2, "runWeight");
            return (Criteria) this;
        }

        public Criteria andRunVolumeIsNull() {
            addCriterion("run_volume is null");
            return (Criteria) this;
        }

        public Criteria andRunVolumeIsNotNull() {
            addCriterion("run_volume is not null");
            return (Criteria) this;
        }

        public Criteria andRunVolumeEqualTo(Float value) {
            addCriterion("run_volume =", value, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeNotEqualTo(Float value) {
            addCriterion("run_volume <>", value, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeGreaterThan(Float value) {
            addCriterion("run_volume >", value, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("run_volume >=", value, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeLessThan(Float value) {
            addCriterion("run_volume <", value, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeLessThanOrEqualTo(Float value) {
            addCriterion("run_volume <=", value, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeIn(List<Float> values) {
            addCriterion("run_volume in", values, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeNotIn(List<Float> values) {
            addCriterion("run_volume not in", values, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeBetween(Float value1, Float value2) {
            addCriterion("run_volume between", value1, value2, "runVolume");
            return (Criteria) this;
        }

        public Criteria andRunVolumeNotBetween(Float value1, Float value2) {
            addCriterion("run_volume not between", value1, value2, "runVolume");
            return (Criteria) this;
        }

        public Criteria andFormatIsNull() {
            addCriterion("format is null");
            return (Criteria) this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("format is not null");
            return (Criteria) this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("format =", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("format <>", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("format >", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("format >=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("format <", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("format <=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("format like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("format not like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("format in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("format not in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("format between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("format not between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andGoodMomoIsNull() {
            addCriterion("good_momo is null");
            return (Criteria) this;
        }

        public Criteria andGoodMomoIsNotNull() {
            addCriterion("good_momo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodMomoEqualTo(String value) {
            addCriterion("good_momo =", value, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoNotEqualTo(String value) {
            addCriterion("good_momo <>", value, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoGreaterThan(String value) {
            addCriterion("good_momo >", value, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoGreaterThanOrEqualTo(String value) {
            addCriterion("good_momo >=", value, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoLessThan(String value) {
            addCriterion("good_momo <", value, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoLessThanOrEqualTo(String value) {
            addCriterion("good_momo <=", value, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoLike(String value) {
            addCriterion("good_momo like", value, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoNotLike(String value) {
            addCriterion("good_momo not like", value, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoIn(List<String> values) {
            addCriterion("good_momo in", values, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoNotIn(List<String> values) {
            addCriterion("good_momo not in", values, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoBetween(String value1, String value2) {
            addCriterion("good_momo between", value1, value2, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodMomoNotBetween(String value1, String value2) {
            addCriterion("good_momo not between", value1, value2, "goodMomo");
            return (Criteria) this;
        }

        public Criteria andIsCategoryIsNull() {
            addCriterion("is_category is null");
            return (Criteria) this;
        }

        public Criteria andIsCategoryIsNotNull() {
            addCriterion("is_category is not null");
            return (Criteria) this;
        }

        public Criteria andIsCategoryEqualTo(Integer value) {
            addCriterion("is_category =", value, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryNotEqualTo(Integer value) {
            addCriterion("is_category <>", value, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryGreaterThan(Integer value) {
            addCriterion("is_category >", value, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_category >=", value, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryLessThan(Integer value) {
            addCriterion("is_category <", value, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("is_category <=", value, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryIn(List<Integer> values) {
            addCriterion("is_category in", values, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryNotIn(List<Integer> values) {
            addCriterion("is_category not in", values, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryBetween(Integer value1, Integer value2) {
            addCriterion("is_category between", value1, value2, "isCategory");
            return (Criteria) this;
        }

        public Criteria andIsCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("is_category not between", value1, value2, "isCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdIsNull() {
            addCriterion("good_category_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdIsNotNull() {
            addCriterion("good_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdEqualTo(Long value) {
            addCriterion("good_category_id =", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdNotEqualTo(Long value) {
            addCriterion("good_category_id <>", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdGreaterThan(Long value) {
            addCriterion("good_category_id >", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_category_id >=", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdLessThan(Long value) {
            addCriterion("good_category_id <", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("good_category_id <=", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdIn(List<Long> values) {
            addCriterion("good_category_id in", values, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdNotIn(List<Long> values) {
            addCriterion("good_category_id not in", values, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdBetween(Long value1, Long value2) {
            addCriterion("good_category_id between", value1, value2, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("good_category_id not between", value1, value2, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameIsNull() {
            addCriterion("good_category_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameIsNotNull() {
            addCriterion("good_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameEqualTo(String value) {
            addCriterion("good_category_name =", value, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameNotEqualTo(String value) {
            addCriterion("good_category_name <>", value, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameGreaterThan(String value) {
            addCriterion("good_category_name >", value, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_category_name >=", value, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameLessThan(String value) {
            addCriterion("good_category_name <", value, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("good_category_name <=", value, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameLike(String value) {
            addCriterion("good_category_name like", value, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameNotLike(String value) {
            addCriterion("good_category_name not like", value, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameIn(List<String> values) {
            addCriterion("good_category_name in", values, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameNotIn(List<String> values) {
            addCriterion("good_category_name not in", values, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameBetween(String value1, String value2) {
            addCriterion("good_category_name between", value1, value2, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameNotBetween(String value1, String value2) {
            addCriterion("good_category_name not between", value1, value2, "goodCategoryName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLikeInsensitive(String value) {
            addCriterion("upper(good_name) like", value.toUpperCase(), "goodName");
            return (Criteria) this;
        }

        public Criteria andPackLikeInsensitive(String value) {
            addCriterion("upper(pack) like", value.toUpperCase(), "pack");
            return (Criteria) this;
        }

        public Criteria andFormatLikeInsensitive(String value) {
            addCriterion("upper(format) like", value.toUpperCase(), "format");
            return (Criteria) this;
        }

        public Criteria andGoodMomoLikeInsensitive(String value) {
            addCriterion("upper(good_momo) like", value.toUpperCase(), "goodMomo");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNameLikeInsensitive(String value) {
            addCriterion("upper(good_category_name) like", value.toUpperCase(), "goodCategoryName");
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