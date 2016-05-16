package com.wangkuo.zxb.lsp.provider.db.po;

import com.wangkuo.framework.persistence.MybatisCriteria;

import java.util.ArrayList;
import java.util.List;

public class TSbWaybillInvoiceCriteria implements MybatisCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSbWaybillInvoiceCriteria() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNull() {
            addCriterion("consignee_name is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNotNull() {
            addCriterion("consignee_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameEqualTo(String value) {
            addCriterion("consignee_name =", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotEqualTo(String value) {
            addCriterion("consignee_name <>", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThan(String value) {
            addCriterion("consignee_name >", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_name >=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThan(String value) {
            addCriterion("consignee_name <", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThanOrEqualTo(String value) {
            addCriterion("consignee_name <=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLike(String value) {
            addCriterion("consignee_name like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotLike(String value) {
            addCriterion("consignee_name not like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIn(List<String> values) {
            addCriterion("consignee_name in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotIn(List<String> values) {
            addCriterion("consignee_name not in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameBetween(String value1, String value2) {
            addCriterion("consignee_name between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotBetween(String value1, String value2) {
            addCriterion("consignee_name not between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIsNull() {
            addCriterion("consignee_mobile is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIsNotNull() {
            addCriterion("consignee_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileEqualTo(String value) {
            addCriterion("consignee_mobile =", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotEqualTo(String value) {
            addCriterion("consignee_mobile <>", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileGreaterThan(String value) {
            addCriterion("consignee_mobile >", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_mobile >=", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLessThan(String value) {
            addCriterion("consignee_mobile <", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLessThanOrEqualTo(String value) {
            addCriterion("consignee_mobile <=", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLike(String value) {
            addCriterion("consignee_mobile like", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotLike(String value) {
            addCriterion("consignee_mobile not like", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIn(List<String> values) {
            addCriterion("consignee_mobile in", values, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotIn(List<String> values) {
            addCriterion("consignee_mobile not in", values, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileBetween(String value1, String value2) {
            addCriterion("consignee_mobile between", value1, value2, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotBetween(String value1, String value2) {
            addCriterion("consignee_mobile not between", value1, value2, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNull() {
            addCriterion("consignee_address is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNotNull() {
            addCriterion("consignee_address is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressEqualTo(String value) {
            addCriterion("consignee_address =", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotEqualTo(String value) {
            addCriterion("consignee_address <>", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThan(String value) {
            addCriterion("consignee_address >", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_address >=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThan(String value) {
            addCriterion("consignee_address <", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThanOrEqualTo(String value) {
            addCriterion("consignee_address <=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLike(String value) {
            addCriterion("consignee_address like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotLike(String value) {
            addCriterion("consignee_address not like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIn(List<String> values) {
            addCriterion("consignee_address in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotIn(List<String> values) {
            addCriterion("consignee_address not in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressBetween(String value1, String value2) {
            addCriterion("consignee_address between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotBetween(String value1, String value2) {
            addCriterion("consignee_address not between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIsNull() {
            addCriterion("consignee_province is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIsNotNull() {
            addCriterion("consignee_province is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceEqualTo(String value) {
            addCriterion("consignee_province =", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotEqualTo(String value) {
            addCriterion("consignee_province <>", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceGreaterThan(String value) {
            addCriterion("consignee_province >", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_province >=", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLessThan(String value) {
            addCriterion("consignee_province <", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLessThanOrEqualTo(String value) {
            addCriterion("consignee_province <=", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLike(String value) {
            addCriterion("consignee_province like", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotLike(String value) {
            addCriterion("consignee_province not like", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIn(List<String> values) {
            addCriterion("consignee_province in", values, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotIn(List<String> values) {
            addCriterion("consignee_province not in", values, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceBetween(String value1, String value2) {
            addCriterion("consignee_province between", value1, value2, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotBetween(String value1, String value2) {
            addCriterion("consignee_province not between", value1, value2, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdIsNull() {
            addCriterion("consignee_province_id is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdIsNotNull() {
            addCriterion("consignee_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdEqualTo(Long value) {
            addCriterion("consignee_province_id =", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdNotEqualTo(Long value) {
            addCriterion("consignee_province_id <>", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdGreaterThan(Long value) {
            addCriterion("consignee_province_id >", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_province_id >=", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdLessThan(Long value) {
            addCriterion("consignee_province_id <", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("consignee_province_id <=", value, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdIn(List<Long> values) {
            addCriterion("consignee_province_id in", values, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdNotIn(List<Long> values) {
            addCriterion("consignee_province_id not in", values, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdBetween(Long value1, Long value2) {
            addCriterion("consignee_province_id between", value1, value2, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("consignee_province_id not between", value1, value2, "consigneeProvinceId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIsNull() {
            addCriterion("consignee_city is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIsNotNull() {
            addCriterion("consignee_city is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityEqualTo(String value) {
            addCriterion("consignee_city =", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotEqualTo(String value) {
            addCriterion("consignee_city <>", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityGreaterThan(String value) {
            addCriterion("consignee_city >", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_city >=", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLessThan(String value) {
            addCriterion("consignee_city <", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLessThanOrEqualTo(String value) {
            addCriterion("consignee_city <=", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLike(String value) {
            addCriterion("consignee_city like", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotLike(String value) {
            addCriterion("consignee_city not like", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIn(List<String> values) {
            addCriterion("consignee_city in", values, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotIn(List<String> values) {
            addCriterion("consignee_city not in", values, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityBetween(String value1, String value2) {
            addCriterion("consignee_city between", value1, value2, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotBetween(String value1, String value2) {
            addCriterion("consignee_city not between", value1, value2, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdIsNull() {
            addCriterion("consignee_city_id is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdIsNotNull() {
            addCriterion("consignee_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdEqualTo(Long value) {
            addCriterion("consignee_city_id =", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdNotEqualTo(Long value) {
            addCriterion("consignee_city_id <>", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdGreaterThan(Long value) {
            addCriterion("consignee_city_id >", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_city_id >=", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdLessThan(Long value) {
            addCriterion("consignee_city_id <", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdLessThanOrEqualTo(Long value) {
            addCriterion("consignee_city_id <=", value, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdIn(List<Long> values) {
            addCriterion("consignee_city_id in", values, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdNotIn(List<Long> values) {
            addCriterion("consignee_city_id not in", values, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdBetween(Long value1, Long value2) {
            addCriterion("consignee_city_id between", value1, value2, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIdNotBetween(Long value1, Long value2) {
            addCriterion("consignee_city_id not between", value1, value2, "consigneeCityId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIsNull() {
            addCriterion("consignee_county is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIsNotNull() {
            addCriterion("consignee_county is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyEqualTo(String value) {
            addCriterion("consignee_county =", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyNotEqualTo(String value) {
            addCriterion("consignee_county <>", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyGreaterThan(String value) {
            addCriterion("consignee_county >", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_county >=", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyLessThan(String value) {
            addCriterion("consignee_county <", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyLessThanOrEqualTo(String value) {
            addCriterion("consignee_county <=", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyLike(String value) {
            addCriterion("consignee_county like", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyNotLike(String value) {
            addCriterion("consignee_county not like", value, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIn(List<String> values) {
            addCriterion("consignee_county in", values, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyNotIn(List<String> values) {
            addCriterion("consignee_county not in", values, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyBetween(String value1, String value2) {
            addCriterion("consignee_county between", value1, value2, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyNotBetween(String value1, String value2) {
            addCriterion("consignee_county not between", value1, value2, "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdIsNull() {
            addCriterion("consignee_county_id is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdIsNotNull() {
            addCriterion("consignee_county_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdEqualTo(Long value) {
            addCriterion("consignee_county_id =", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdNotEqualTo(Long value) {
            addCriterion("consignee_county_id <>", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdGreaterThan(Long value) {
            addCriterion("consignee_county_id >", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_county_id >=", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdLessThan(Long value) {
            addCriterion("consignee_county_id <", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdLessThanOrEqualTo(Long value) {
            addCriterion("consignee_county_id <=", value, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdIn(List<Long> values) {
            addCriterion("consignee_county_id in", values, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdNotIn(List<Long> values) {
            addCriterion("consignee_county_id not in", values, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdBetween(Long value1, Long value2) {
            addCriterion("consignee_county_id between", value1, value2, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyIdNotBetween(Long value1, Long value2) {
            addCriterion("consignee_county_id not between", value1, value2, "consigneeCountyId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIsNull() {
            addCriterion("consignee_town is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIsNotNull() {
            addCriterion("consignee_town is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownEqualTo(String value) {
            addCriterion("consignee_town =", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownNotEqualTo(String value) {
            addCriterion("consignee_town <>", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownGreaterThan(String value) {
            addCriterion("consignee_town >", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_town >=", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownLessThan(String value) {
            addCriterion("consignee_town <", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownLessThanOrEqualTo(String value) {
            addCriterion("consignee_town <=", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownLike(String value) {
            addCriterion("consignee_town like", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownNotLike(String value) {
            addCriterion("consignee_town not like", value, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIn(List<String> values) {
            addCriterion("consignee_town in", values, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownNotIn(List<String> values) {
            addCriterion("consignee_town not in", values, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownBetween(String value1, String value2) {
            addCriterion("consignee_town between", value1, value2, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownNotBetween(String value1, String value2) {
            addCriterion("consignee_town not between", value1, value2, "consigneeTown");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdIsNull() {
            addCriterion("consignee_town_id is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdIsNotNull() {
            addCriterion("consignee_town_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdEqualTo(Long value) {
            addCriterion("consignee_town_id =", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdNotEqualTo(Long value) {
            addCriterion("consignee_town_id <>", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdGreaterThan(Long value) {
            addCriterion("consignee_town_id >", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_town_id >=", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdLessThan(Long value) {
            addCriterion("consignee_town_id <", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdLessThanOrEqualTo(Long value) {
            addCriterion("consignee_town_id <=", value, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdIn(List<Long> values) {
            addCriterion("consignee_town_id in", values, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdNotIn(List<Long> values) {
            addCriterion("consignee_town_id not in", values, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdBetween(Long value1, Long value2) {
            addCriterion("consignee_town_id between", value1, value2, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownIdNotBetween(Long value1, Long value2) {
            addCriterion("consignee_town_id not between", value1, value2, "consigneeTownId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLikeInsensitive(String value) {
            addCriterion("upper(company_name) like", value.toUpperCase(), "companyName");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andBankNameLikeInsensitive(String value) {
            addCriterion("upper(bank_name) like", value.toUpperCase(), "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountLikeInsensitive(String value) {
            addCriterion("upper(bank_account) like", value.toUpperCase(), "bankAccount");
            return (Criteria) this;
        }

        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(content) like", value.toUpperCase(), "content");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLikeInsensitive(String value) {
            addCriterion("upper(consignee_name) like", value.toUpperCase(), "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLikeInsensitive(String value) {
            addCriterion("upper(consignee_mobile) like", value.toUpperCase(), "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLikeInsensitive(String value) {
            addCriterion("upper(consignee_address) like", value.toUpperCase(), "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLikeInsensitive(String value) {
            addCriterion("upper(consignee_province) like", value.toUpperCase(), "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLikeInsensitive(String value) {
            addCriterion("upper(consignee_city) like", value.toUpperCase(), "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountyLikeInsensitive(String value) {
            addCriterion("upper(consignee_county) like", value.toUpperCase(), "consigneeCounty");
            return (Criteria) this;
        }

        public Criteria andConsigneeTownLikeInsensitive(String value) {
            addCriterion("upper(consignee_town) like", value.toUpperCase(), "consigneeTown");
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