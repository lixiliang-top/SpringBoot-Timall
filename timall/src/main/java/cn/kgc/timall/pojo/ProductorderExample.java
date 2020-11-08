package cn.kgc.timall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductorderExample() {
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

        public Criteria andProductorderIdIsNull() {
            addCriterion("productorder_id is null");
            return (Criteria) this;
        }

        public Criteria andProductorderIdIsNotNull() {
            addCriterion("productorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderIdEqualTo(Integer value) {
            addCriterion("productorder_id =", value, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdNotEqualTo(Integer value) {
            addCriterion("productorder_id <>", value, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdGreaterThan(Integer value) {
            addCriterion("productorder_id >", value, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productorder_id >=", value, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdLessThan(Integer value) {
            addCriterion("productorder_id <", value, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("productorder_id <=", value, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdIn(List<Integer> values) {
            addCriterion("productorder_id in", values, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdNotIn(List<Integer> values) {
            addCriterion("productorder_id not in", values, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdBetween(Integer value1, Integer value2) {
            addCriterion("productorder_id between", value1, value2, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productorder_id not between", value1, value2, "productorderId");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeIsNull() {
            addCriterion("productorder_code is null");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeIsNotNull() {
            addCriterion("productorder_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeEqualTo(String value) {
            addCriterion("productorder_code =", value, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeNotEqualTo(String value) {
            addCriterion("productorder_code <>", value, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeGreaterThan(String value) {
            addCriterion("productorder_code >", value, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("productorder_code >=", value, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeLessThan(String value) {
            addCriterion("productorder_code <", value, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeLessThanOrEqualTo(String value) {
            addCriterion("productorder_code <=", value, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeLike(String value) {
            addCriterion("productorder_code like", value, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeNotLike(String value) {
            addCriterion("productorder_code not like", value, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeIn(List<String> values) {
            addCriterion("productorder_code in", values, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeNotIn(List<String> values) {
            addCriterion("productorder_code not in", values, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeBetween(String value1, String value2) {
            addCriterion("productorder_code between", value1, value2, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderCodeNotBetween(String value1, String value2) {
            addCriterion("productorder_code not between", value1, value2, "productorderCode");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressIsNull() {
            addCriterion("productorder_address is null");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressIsNotNull() {
            addCriterion("productorder_address is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressEqualTo(String value) {
            addCriterion("productorder_address =", value, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressNotEqualTo(String value) {
            addCriterion("productorder_address <>", value, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressGreaterThan(String value) {
            addCriterion("productorder_address >", value, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("productorder_address >=", value, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressLessThan(String value) {
            addCriterion("productorder_address <", value, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressLessThanOrEqualTo(String value) {
            addCriterion("productorder_address <=", value, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressLike(String value) {
            addCriterion("productorder_address like", value, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressNotLike(String value) {
            addCriterion("productorder_address not like", value, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressIn(List<String> values) {
            addCriterion("productorder_address in", values, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressNotIn(List<String> values) {
            addCriterion("productorder_address not in", values, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressBetween(String value1, String value2) {
            addCriterion("productorder_address between", value1, value2, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderAddressNotBetween(String value1, String value2) {
            addCriterion("productorder_address not between", value1, value2, "productorderAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressIsNull() {
            addCriterion("productorder_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressIsNotNull() {
            addCriterion("productorder_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressEqualTo(String value) {
            addCriterion("productorder_detail_address =", value, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressNotEqualTo(String value) {
            addCriterion("productorder_detail_address <>", value, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressGreaterThan(String value) {
            addCriterion("productorder_detail_address >", value, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("productorder_detail_address >=", value, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressLessThan(String value) {
            addCriterion("productorder_detail_address <", value, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("productorder_detail_address <=", value, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressLike(String value) {
            addCriterion("productorder_detail_address like", value, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressNotLike(String value) {
            addCriterion("productorder_detail_address not like", value, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressIn(List<String> values) {
            addCriterion("productorder_detail_address in", values, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressNotIn(List<String> values) {
            addCriterion("productorder_detail_address not in", values, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressBetween(String value1, String value2) {
            addCriterion("productorder_detail_address between", value1, value2, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderDetailAddressNotBetween(String value1, String value2) {
            addCriterion("productorder_detail_address not between", value1, value2, "productorderDetailAddress");
            return (Criteria) this;
        }

        public Criteria andProductorderPostIsNull() {
            addCriterion("productorder_post is null");
            return (Criteria) this;
        }

        public Criteria andProductorderPostIsNotNull() {
            addCriterion("productorder_post is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderPostEqualTo(String value) {
            addCriterion("productorder_post =", value, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostNotEqualTo(String value) {
            addCriterion("productorder_post <>", value, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostGreaterThan(String value) {
            addCriterion("productorder_post >", value, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostGreaterThanOrEqualTo(String value) {
            addCriterion("productorder_post >=", value, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostLessThan(String value) {
            addCriterion("productorder_post <", value, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostLessThanOrEqualTo(String value) {
            addCriterion("productorder_post <=", value, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostLike(String value) {
            addCriterion("productorder_post like", value, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostNotLike(String value) {
            addCriterion("productorder_post not like", value, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostIn(List<String> values) {
            addCriterion("productorder_post in", values, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostNotIn(List<String> values) {
            addCriterion("productorder_post not in", values, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostBetween(String value1, String value2) {
            addCriterion("productorder_post between", value1, value2, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderPostNotBetween(String value1, String value2) {
            addCriterion("productorder_post not between", value1, value2, "productorderPost");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverIsNull() {
            addCriterion("productorder_receiver is null");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverIsNotNull() {
            addCriterion("productorder_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverEqualTo(String value) {
            addCriterion("productorder_receiver =", value, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverNotEqualTo(String value) {
            addCriterion("productorder_receiver <>", value, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverGreaterThan(String value) {
            addCriterion("productorder_receiver >", value, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("productorder_receiver >=", value, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverLessThan(String value) {
            addCriterion("productorder_receiver <", value, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverLessThanOrEqualTo(String value) {
            addCriterion("productorder_receiver <=", value, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverLike(String value) {
            addCriterion("productorder_receiver like", value, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverNotLike(String value) {
            addCriterion("productorder_receiver not like", value, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverIn(List<String> values) {
            addCriterion("productorder_receiver in", values, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverNotIn(List<String> values) {
            addCriterion("productorder_receiver not in", values, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverBetween(String value1, String value2) {
            addCriterion("productorder_receiver between", value1, value2, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderReceiverNotBetween(String value1, String value2) {
            addCriterion("productorder_receiver not between", value1, value2, "productorderReceiver");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileIsNull() {
            addCriterion("productorder_mobile is null");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileIsNotNull() {
            addCriterion("productorder_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileEqualTo(String value) {
            addCriterion("productorder_mobile =", value, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileNotEqualTo(String value) {
            addCriterion("productorder_mobile <>", value, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileGreaterThan(String value) {
            addCriterion("productorder_mobile >", value, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileGreaterThanOrEqualTo(String value) {
            addCriterion("productorder_mobile >=", value, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileLessThan(String value) {
            addCriterion("productorder_mobile <", value, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileLessThanOrEqualTo(String value) {
            addCriterion("productorder_mobile <=", value, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileLike(String value) {
            addCriterion("productorder_mobile like", value, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileNotLike(String value) {
            addCriterion("productorder_mobile not like", value, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileIn(List<String> values) {
            addCriterion("productorder_mobile in", values, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileNotIn(List<String> values) {
            addCriterion("productorder_mobile not in", values, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileBetween(String value1, String value2) {
            addCriterion("productorder_mobile between", value1, value2, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderMobileNotBetween(String value1, String value2) {
            addCriterion("productorder_mobile not between", value1, value2, "productorderMobile");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateIsNull() {
            addCriterion("productorder_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateIsNotNull() {
            addCriterion("productorder_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateEqualTo(Date value) {
            addCriterion("productorder_pay_date =", value, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateNotEqualTo(Date value) {
            addCriterion("productorder_pay_date <>", value, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateGreaterThan(Date value) {
            addCriterion("productorder_pay_date >", value, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("productorder_pay_date >=", value, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateLessThan(Date value) {
            addCriterion("productorder_pay_date <", value, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateLessThanOrEqualTo(Date value) {
            addCriterion("productorder_pay_date <=", value, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateIn(List<Date> values) {
            addCriterion("productorder_pay_date in", values, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateNotIn(List<Date> values) {
            addCriterion("productorder_pay_date not in", values, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateBetween(Date value1, Date value2) {
            addCriterion("productorder_pay_date between", value1, value2, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderPayDateNotBetween(Date value1, Date value2) {
            addCriterion("productorder_pay_date not between", value1, value2, "productorderPayDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateIsNull() {
            addCriterion("productorder_delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateIsNotNull() {
            addCriterion("productorder_delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateEqualTo(Date value) {
            addCriterion("productorder_delivery_date =", value, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateNotEqualTo(Date value) {
            addCriterion("productorder_delivery_date <>", value, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateGreaterThan(Date value) {
            addCriterion("productorder_delivery_date >", value, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("productorder_delivery_date >=", value, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateLessThan(Date value) {
            addCriterion("productorder_delivery_date <", value, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterion("productorder_delivery_date <=", value, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateIn(List<Date> values) {
            addCriterion("productorder_delivery_date in", values, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateNotIn(List<Date> values) {
            addCriterion("productorder_delivery_date not in", values, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateBetween(Date value1, Date value2) {
            addCriterion("productorder_delivery_date between", value1, value2, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterion("productorder_delivery_date not between", value1, value2, "productorderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateIsNull() {
            addCriterion("productorder_confirm_date is null");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateIsNotNull() {
            addCriterion("productorder_confirm_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateEqualTo(Date value) {
            addCriterion("productorder_confirm_date =", value, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateNotEqualTo(Date value) {
            addCriterion("productorder_confirm_date <>", value, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateGreaterThan(Date value) {
            addCriterion("productorder_confirm_date >", value, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("productorder_confirm_date >=", value, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateLessThan(Date value) {
            addCriterion("productorder_confirm_date <", value, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("productorder_confirm_date <=", value, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateIn(List<Date> values) {
            addCriterion("productorder_confirm_date in", values, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateNotIn(List<Date> values) {
            addCriterion("productorder_confirm_date not in", values, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateBetween(Date value1, Date value2) {
            addCriterion("productorder_confirm_date between", value1, value2, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("productorder_confirm_date not between", value1, value2, "productorderConfirmDate");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusIsNull() {
            addCriterion("productorder_status is null");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusIsNotNull() {
            addCriterion("productorder_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusEqualTo(Boolean value) {
            addCriterion("productorder_status =", value, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusNotEqualTo(Boolean value) {
            addCriterion("productorder_status <>", value, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusGreaterThan(Boolean value) {
            addCriterion("productorder_status >", value, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("productorder_status >=", value, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusLessThan(Boolean value) {
            addCriterion("productorder_status <", value, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("productorder_status <=", value, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusIn(List<Boolean> values) {
            addCriterion("productorder_status in", values, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusNotIn(List<Boolean> values) {
            addCriterion("productorder_status not in", values, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("productorder_status between", value1, value2, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("productorder_status not between", value1, value2, "productorderStatus");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdIsNull() {
            addCriterion("productorder_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdIsNotNull() {
            addCriterion("productorder_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdEqualTo(Integer value) {
            addCriterion("productorder_user_id =", value, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdNotEqualTo(Integer value) {
            addCriterion("productorder_user_id <>", value, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdGreaterThan(Integer value) {
            addCriterion("productorder_user_id >", value, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productorder_user_id >=", value, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdLessThan(Integer value) {
            addCriterion("productorder_user_id <", value, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("productorder_user_id <=", value, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdIn(List<Integer> values) {
            addCriterion("productorder_user_id in", values, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdNotIn(List<Integer> values) {
            addCriterion("productorder_user_id not in", values, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdBetween(Integer value1, Integer value2) {
            addCriterion("productorder_user_id between", value1, value2, "productorderUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productorder_user_id not between", value1, value2, "productorderUserId");
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