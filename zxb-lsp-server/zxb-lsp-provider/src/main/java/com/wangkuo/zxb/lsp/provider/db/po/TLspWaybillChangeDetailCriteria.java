package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.util.ArrayList;
import java.util.List;

public class TLspWaybillChangeDetailCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLspWaybillChangeDetailCriteria() {
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

        public Criteria andLspChangeIdIsNull() {
            addCriterion("lsp_change_id is null");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdIsNotNull() {
            addCriterion("lsp_change_id is not null");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdEqualTo(Long value) {
            addCriterion("lsp_change_id =", value, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdNotEqualTo(Long value) {
            addCriterion("lsp_change_id <>", value, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdGreaterThan(Long value) {
            addCriterion("lsp_change_id >", value, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lsp_change_id >=", value, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdLessThan(Long value) {
            addCriterion("lsp_change_id <", value, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdLessThanOrEqualTo(Long value) {
            addCriterion("lsp_change_id <=", value, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdIn(List<Long> values) {
            addCriterion("lsp_change_id in", values, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdNotIn(List<Long> values) {
            addCriterion("lsp_change_id not in", values, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdBetween(Long value1, Long value2) {
            addCriterion("lsp_change_id between", value1, value2, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andLspChangeIdNotBetween(Long value1, Long value2) {
            addCriterion("lsp_change_id not between", value1, value2, "lspChangeId");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNull() {
            addCriterion("is_change is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNotNull() {
            addCriterion("is_change is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeEqualTo(Integer value) {
            addCriterion("is_change =", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotEqualTo(Integer value) {
            addCriterion("is_change <>", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThan(Integer value) {
            addCriterion("is_change >", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_change >=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThan(Integer value) {
            addCriterion("is_change <", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThanOrEqualTo(Integer value) {
            addCriterion("is_change <=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeIn(List<Integer> values) {
            addCriterion("is_change in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotIn(List<Integer> values) {
            addCriterion("is_change not in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeBetween(Integer value1, Integer value2) {
            addCriterion("is_change between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_change not between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andChangeNameIsNull() {
            addCriterion("change_name is null");
            return (Criteria) this;
        }

        public Criteria andChangeNameIsNotNull() {
            addCriterion("change_name is not null");
            return (Criteria) this;
        }

        public Criteria andChangeNameEqualTo(String value) {
            addCriterion("change_name =", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameNotEqualTo(String value) {
            addCriterion("change_name <>", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameGreaterThan(String value) {
            addCriterion("change_name >", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameGreaterThanOrEqualTo(String value) {
            addCriterion("change_name >=", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameLessThan(String value) {
            addCriterion("change_name <", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameLessThanOrEqualTo(String value) {
            addCriterion("change_name <=", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameLike(String value) {
            addCriterion("change_name like", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameNotLike(String value) {
            addCriterion("change_name not like", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameIn(List<String> values) {
            addCriterion("change_name in", values, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameNotIn(List<String> values) {
            addCriterion("change_name not in", values, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameBetween(String value1, String value2) {
            addCriterion("change_name between", value1, value2, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameNotBetween(String value1, String value2) {
            addCriterion("change_name not between", value1, value2, "changeName");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueIsNull() {
            addCriterion("before_change_value is null");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueIsNotNull() {
            addCriterion("before_change_value is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueEqualTo(String value) {
            addCriterion("before_change_value =", value, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueNotEqualTo(String value) {
            addCriterion("before_change_value <>", value, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueGreaterThan(String value) {
            addCriterion("before_change_value >", value, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueGreaterThanOrEqualTo(String value) {
            addCriterion("before_change_value >=", value, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueLessThan(String value) {
            addCriterion("before_change_value <", value, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueLessThanOrEqualTo(String value) {
            addCriterion("before_change_value <=", value, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueLike(String value) {
            addCriterion("before_change_value like", value, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueNotLike(String value) {
            addCriterion("before_change_value not like", value, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueIn(List<String> values) {
            addCriterion("before_change_value in", values, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueNotIn(List<String> values) {
            addCriterion("before_change_value not in", values, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueBetween(String value1, String value2) {
            addCriterion("before_change_value between", value1, value2, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueNotBetween(String value1, String value2) {
            addCriterion("before_change_value not between", value1, value2, "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueIsNull() {
            addCriterion("after_change_value is null");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueIsNotNull() {
            addCriterion("after_change_value is not null");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueEqualTo(String value) {
            addCriterion("after_change_value =", value, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueNotEqualTo(String value) {
            addCriterion("after_change_value <>", value, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueGreaterThan(String value) {
            addCriterion("after_change_value >", value, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueGreaterThanOrEqualTo(String value) {
            addCriterion("after_change_value >=", value, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueLessThan(String value) {
            addCriterion("after_change_value <", value, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueLessThanOrEqualTo(String value) {
            addCriterion("after_change_value <=", value, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueLike(String value) {
            addCriterion("after_change_value like", value, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueNotLike(String value) {
            addCriterion("after_change_value not like", value, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueIn(List<String> values) {
            addCriterion("after_change_value in", values, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueNotIn(List<String> values) {
            addCriterion("after_change_value not in", values, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueBetween(String value1, String value2) {
            addCriterion("after_change_value between", value1, value2, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueNotBetween(String value1, String value2) {
            addCriterion("after_change_value not between", value1, value2, "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescIsNull() {
            addCriterion("before_change_value_desc is null");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescIsNotNull() {
            addCriterion("before_change_value_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescEqualTo(String value) {
            addCriterion("before_change_value_desc =", value, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescNotEqualTo(String value) {
            addCriterion("before_change_value_desc <>", value, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescGreaterThan(String value) {
            addCriterion("before_change_value_desc >", value, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescGreaterThanOrEqualTo(String value) {
            addCriterion("before_change_value_desc >=", value, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescLessThan(String value) {
            addCriterion("before_change_value_desc <", value, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescLessThanOrEqualTo(String value) {
            addCriterion("before_change_value_desc <=", value, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescLike(String value) {
            addCriterion("before_change_value_desc like", value, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescNotLike(String value) {
            addCriterion("before_change_value_desc not like", value, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescIn(List<String> values) {
            addCriterion("before_change_value_desc in", values, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescNotIn(List<String> values) {
            addCriterion("before_change_value_desc not in", values, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescBetween(String value1, String value2) {
            addCriterion("before_change_value_desc between", value1, value2, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescNotBetween(String value1, String value2) {
            addCriterion("before_change_value_desc not between", value1, value2, "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescIsNull() {
            addCriterion("after_change_value_desc is null");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescIsNotNull() {
            addCriterion("after_change_value_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescEqualTo(String value) {
            addCriterion("after_change_value_desc =", value, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescNotEqualTo(String value) {
            addCriterion("after_change_value_desc <>", value, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescGreaterThan(String value) {
            addCriterion("after_change_value_desc >", value, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescGreaterThanOrEqualTo(String value) {
            addCriterion("after_change_value_desc >=", value, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescLessThan(String value) {
            addCriterion("after_change_value_desc <", value, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescLessThanOrEqualTo(String value) {
            addCriterion("after_change_value_desc <=", value, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescLike(String value) {
            addCriterion("after_change_value_desc like", value, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescNotLike(String value) {
            addCriterion("after_change_value_desc not like", value, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescIn(List<String> values) {
            addCriterion("after_change_value_desc in", values, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescNotIn(List<String> values) {
            addCriterion("after_change_value_desc not in", values, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescBetween(String value1, String value2) {
            addCriterion("after_change_value_desc between", value1, value2, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescNotBetween(String value1, String value2) {
            addCriterion("after_change_value_desc not between", value1, value2, "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andChangePropertyIsNull() {
            addCriterion("change_property is null");
            return (Criteria) this;
        }

        public Criteria andChangePropertyIsNotNull() {
            addCriterion("change_property is not null");
            return (Criteria) this;
        }

        public Criteria andChangePropertyEqualTo(String value) {
            addCriterion("change_property =", value, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyNotEqualTo(String value) {
            addCriterion("change_property <>", value, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyGreaterThan(String value) {
            addCriterion("change_property >", value, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyGreaterThanOrEqualTo(String value) {
            addCriterion("change_property >=", value, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyLessThan(String value) {
            addCriterion("change_property <", value, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyLessThanOrEqualTo(String value) {
            addCriterion("change_property <=", value, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyLike(String value) {
            addCriterion("change_property like", value, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyNotLike(String value) {
            addCriterion("change_property not like", value, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyIn(List<String> values) {
            addCriterion("change_property in", values, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyNotIn(List<String> values) {
            addCriterion("change_property not in", values, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyBetween(String value1, String value2) {
            addCriterion("change_property between", value1, value2, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangePropertyNotBetween(String value1, String value2) {
            addCriterion("change_property not between", value1, value2, "changeProperty");
            return (Criteria) this;
        }

        public Criteria andChangeNameLikeInsensitive(String value) {
            addCriterion("upper(change_name) like", value.toUpperCase(), "changeName");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueLikeInsensitive(String value) {
            addCriterion("upper(before_change_value) like", value.toUpperCase(), "beforeChangeValue");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueLikeInsensitive(String value) {
            addCriterion("upper(after_change_value) like", value.toUpperCase(), "afterChangeValue");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeValueDescLikeInsensitive(String value) {
            addCriterion("upper(before_change_value_desc) like", value.toUpperCase(), "beforeChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andAfterChangeValueDescLikeInsensitive(String value) {
            addCriterion("upper(after_change_value_desc) like", value.toUpperCase(), "afterChangeValueDesc");
            return (Criteria) this;
        }

        public Criteria andChangePropertyLikeInsensitive(String value) {
            addCriterion("upper(change_property) like", value.toUpperCase(), "changeProperty");
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