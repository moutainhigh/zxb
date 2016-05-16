package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TZbLspBalanceDetailCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbLspBalanceDetailCriteria() {
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

        public Criteria andBenchmarkIdIsNull() {
            addCriterion("benchmark_id is null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdIsNotNull() {
            addCriterion("benchmark_id is not null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdEqualTo(Long value) {
            addCriterion("benchmark_id =", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotEqualTo(Long value) {
            addCriterion("benchmark_id <>", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdGreaterThan(Long value) {
            addCriterion("benchmark_id >", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("benchmark_id >=", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdLessThan(Long value) {
            addCriterion("benchmark_id <", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdLessThanOrEqualTo(Long value) {
            addCriterion("benchmark_id <=", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdIn(List<Long> values) {
            addCriterion("benchmark_id in", values, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotIn(List<Long> values) {
            addCriterion("benchmark_id not in", values, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdBetween(Long value1, Long value2) {
            addCriterion("benchmark_id between", value1, value2, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotBetween(Long value1, Long value2) {
            addCriterion("benchmark_id not between", value1, value2, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIsNull() {
            addCriterion("freight_fee is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIsNotNull() {
            addCriterion("freight_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeEqualTo(BigDecimal value) {
            addCriterion("freight_fee =", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotEqualTo(BigDecimal value) {
            addCriterion("freight_fee <>", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeGreaterThan(BigDecimal value) {
            addCriterion("freight_fee >", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_fee >=", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeLessThan(BigDecimal value) {
            addCriterion("freight_fee <", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_fee <=", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIn(List<BigDecimal> values) {
            addCriterion("freight_fee in", values, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotIn(List<BigDecimal> values) {
            addCriterion("freight_fee not in", values, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_fee between", value1, value2, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_fee not between", value1, value2, "freightFee");
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

        public Criteria andPremiumFeeIsNull() {
            addCriterion("premium_fee is null");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeIsNotNull() {
            addCriterion("premium_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeEqualTo(BigDecimal value) {
            addCriterion("premium_fee =", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeNotEqualTo(BigDecimal value) {
            addCriterion("premium_fee <>", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeGreaterThan(BigDecimal value) {
            addCriterion("premium_fee >", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premium_fee >=", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeLessThan(BigDecimal value) {
            addCriterion("premium_fee <", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premium_fee <=", value, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeIn(List<BigDecimal> values) {
            addCriterion("premium_fee in", values, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeNotIn(List<BigDecimal> values) {
            addCriterion("premium_fee not in", values, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premium_fee between", value1, value2, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andPremiumFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premium_fee not between", value1, value2, "premiumFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIsNull() {
            addCriterion("invoice_fee is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIsNotNull() {
            addCriterion("invoice_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeEqualTo(BigDecimal value) {
            addCriterion("invoice_fee =", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("invoice_fee <>", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeGreaterThan(BigDecimal value) {
            addCriterion("invoice_fee >", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_fee >=", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeLessThan(BigDecimal value) {
            addCriterion("invoice_fee <", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_fee <=", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIn(List<BigDecimal> values) {
            addCriterion("invoice_fee in", values, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("invoice_fee not in", values, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_fee between", value1, value2, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_fee not between", value1, value2, "invoiceFee");
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

        public Criteria andEnterFeeEqualTo(BigDecimal value) {
            addCriterion("enter_fee =", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotEqualTo(BigDecimal value) {
            addCriterion("enter_fee <>", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeGreaterThan(BigDecimal value) {
            addCriterion("enter_fee >", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enter_fee >=", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeLessThan(BigDecimal value) {
            addCriterion("enter_fee <", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enter_fee <=", value, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeIn(List<BigDecimal> values) {
            addCriterion("enter_fee in", values, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotIn(List<BigDecimal> values) {
            addCriterion("enter_fee not in", values, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enter_fee between", value1, value2, "enterFee");
            return (Criteria) this;
        }

        public Criteria andEnterFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enter_fee not between", value1, value2, "enterFee");
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

        public Criteria andSignedReceiveFeeIsNull() {
            addCriterion("signed_receive_fee is null");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeIsNotNull() {
            addCriterion("signed_receive_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeEqualTo(BigDecimal value) {
            addCriterion("signed_receive_fee =", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeNotEqualTo(BigDecimal value) {
            addCriterion("signed_receive_fee <>", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeGreaterThan(BigDecimal value) {
            addCriterion("signed_receive_fee >", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("signed_receive_fee >=", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeLessThan(BigDecimal value) {
            addCriterion("signed_receive_fee <", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("signed_receive_fee <=", value, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeIn(List<BigDecimal> values) {
            addCriterion("signed_receive_fee in", values, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeNotIn(List<BigDecimal> values) {
            addCriterion("signed_receive_fee not in", values, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signed_receive_fee between", value1, value2, "signedReceiveFee");
            return (Criteria) this;
        }

        public Criteria andSignedReceiveFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signed_receive_fee not between", value1, value2, "signedReceiveFee");
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

        public Criteria andExpressFeeIsNull() {
            addCriterion("express_fee is null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNotNull() {
            addCriterion("express_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeEqualTo(BigDecimal value) {
            addCriterion("express_fee =", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotEqualTo(BigDecimal value) {
            addCriterion("express_fee <>", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThan(BigDecimal value) {
            addCriterion("express_fee >", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("express_fee >=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThan(BigDecimal value) {
            addCriterion("express_fee <", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("express_fee <=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIn(List<BigDecimal> values) {
            addCriterion("express_fee in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotIn(List<BigDecimal> values) {
            addCriterion("express_fee not in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("express_fee between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("express_fee not between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeIsNull() {
            addCriterion("change_waybill_fee is null");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeIsNotNull() {
            addCriterion("change_waybill_fee is not null");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeEqualTo(BigDecimal value) {
            addCriterion("change_waybill_fee =", value, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeNotEqualTo(BigDecimal value) {
            addCriterion("change_waybill_fee <>", value, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeGreaterThan(BigDecimal value) {
            addCriterion("change_waybill_fee >", value, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_waybill_fee >=", value, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeLessThan(BigDecimal value) {
            addCriterion("change_waybill_fee <", value, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_waybill_fee <=", value, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeIn(List<BigDecimal> values) {
            addCriterion("change_waybill_fee in", values, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeNotIn(List<BigDecimal> values) {
            addCriterion("change_waybill_fee not in", values, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_waybill_fee between", value1, value2, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andChangeWaybillFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_waybill_fee not between", value1, value2, "changeWaybillFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeIsNull() {
            addCriterion("damager_fee is null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeIsNotNull() {
            addCriterion("damager_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeEqualTo(BigDecimal value) {
            addCriterion("damager_fee =", value, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeNotEqualTo(BigDecimal value) {
            addCriterion("damager_fee <>", value, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeGreaterThan(BigDecimal value) {
            addCriterion("damager_fee >", value, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("damager_fee >=", value, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeLessThan(BigDecimal value) {
            addCriterion("damager_fee <", value, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("damager_fee <=", value, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeIn(List<BigDecimal> values) {
            addCriterion("damager_fee in", values, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeNotIn(List<BigDecimal> values) {
            addCriterion("damager_fee not in", values, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("damager_fee between", value1, value2, "damagerFee");
            return (Criteria) this;
        }

        public Criteria andDamagerFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("damager_fee not between", value1, value2, "damagerFee");
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