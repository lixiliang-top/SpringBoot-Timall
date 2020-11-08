package cn.kgc.timall.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductorderitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductorderitemExample() {
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

        public Criteria andProductorderitemIdIsNull() {
            addCriterion("productorderitem_id is null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdIsNotNull() {
            addCriterion("productorderitem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdEqualTo(Integer value) {
            addCriterion("productorderitem_id =", value, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdNotEqualTo(Integer value) {
            addCriterion("productorderitem_id <>", value, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdGreaterThan(Integer value) {
            addCriterion("productorderitem_id >", value, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productorderitem_id >=", value, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdLessThan(Integer value) {
            addCriterion("productorderitem_id <", value, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdLessThanOrEqualTo(Integer value) {
            addCriterion("productorderitem_id <=", value, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdIn(List<Integer> values) {
            addCriterion("productorderitem_id in", values, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdNotIn(List<Integer> values) {
            addCriterion("productorderitem_id not in", values, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdBetween(Integer value1, Integer value2) {
            addCriterion("productorderitem_id between", value1, value2, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productorderitem_id not between", value1, value2, "productorderitemId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberIsNull() {
            addCriterion("productorderitem_number is null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberIsNotNull() {
            addCriterion("productorderitem_number is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberEqualTo(Short value) {
            addCriterion("productorderitem_number =", value, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberNotEqualTo(Short value) {
            addCriterion("productorderitem_number <>", value, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberGreaterThan(Short value) {
            addCriterion("productorderitem_number >", value, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("productorderitem_number >=", value, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberLessThan(Short value) {
            addCriterion("productorderitem_number <", value, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberLessThanOrEqualTo(Short value) {
            addCriterion("productorderitem_number <=", value, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberIn(List<Short> values) {
            addCriterion("productorderitem_number in", values, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberNotIn(List<Short> values) {
            addCriterion("productorderitem_number not in", values, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberBetween(Short value1, Short value2) {
            addCriterion("productorderitem_number between", value1, value2, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemNumberNotBetween(Short value1, Short value2) {
            addCriterion("productorderitem_number not between", value1, value2, "productorderitemNumber");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceIsNull() {
            addCriterion("productorderitem_price is null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceIsNotNull() {
            addCriterion("productorderitem_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceEqualTo(BigDecimal value) {
            addCriterion("productorderitem_price =", value, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceNotEqualTo(BigDecimal value) {
            addCriterion("productorderitem_price <>", value, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceGreaterThan(BigDecimal value) {
            addCriterion("productorderitem_price >", value, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productorderitem_price >=", value, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceLessThan(BigDecimal value) {
            addCriterion("productorderitem_price <", value, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productorderitem_price <=", value, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceIn(List<BigDecimal> values) {
            addCriterion("productorderitem_price in", values, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceNotIn(List<BigDecimal> values) {
            addCriterion("productorderitem_price not in", values, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productorderitem_price between", value1, value2, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productorderitem_price not between", value1, value2, "productorderitemPrice");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdIsNull() {
            addCriterion("productorderitem_product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdIsNotNull() {
            addCriterion("productorderitem_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdEqualTo(Integer value) {
            addCriterion("productorderitem_product_id =", value, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdNotEqualTo(Integer value) {
            addCriterion("productorderitem_product_id <>", value, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdGreaterThan(Integer value) {
            addCriterion("productorderitem_product_id >", value, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productorderitem_product_id >=", value, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdLessThan(Integer value) {
            addCriterion("productorderitem_product_id <", value, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("productorderitem_product_id <=", value, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdIn(List<Integer> values) {
            addCriterion("productorderitem_product_id in", values, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdNotIn(List<Integer> values) {
            addCriterion("productorderitem_product_id not in", values, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdBetween(Integer value1, Integer value2) {
            addCriterion("productorderitem_product_id between", value1, value2, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productorderitem_product_id not between", value1, value2, "productorderitemProductId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdIsNull() {
            addCriterion("productorderitem_order_id is null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdIsNotNull() {
            addCriterion("productorderitem_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdEqualTo(Integer value) {
            addCriterion("productorderitem_order_id =", value, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdNotEqualTo(Integer value) {
            addCriterion("productorderitem_order_id <>", value, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdGreaterThan(Integer value) {
            addCriterion("productorderitem_order_id >", value, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productorderitem_order_id >=", value, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdLessThan(Integer value) {
            addCriterion("productorderitem_order_id <", value, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("productorderitem_order_id <=", value, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdIn(List<Integer> values) {
            addCriterion("productorderitem_order_id in", values, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdNotIn(List<Integer> values) {
            addCriterion("productorderitem_order_id not in", values, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("productorderitem_order_id between", value1, value2, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productorderitem_order_id not between", value1, value2, "productorderitemOrderId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdIsNull() {
            addCriterion("productorderitem_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdIsNotNull() {
            addCriterion("productorderitem_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdEqualTo(Integer value) {
            addCriterion("productorderitem_user_id =", value, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdNotEqualTo(Integer value) {
            addCriterion("productorderitem_user_id <>", value, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdGreaterThan(Integer value) {
            addCriterion("productorderitem_user_id >", value, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productorderitem_user_id >=", value, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdLessThan(Integer value) {
            addCriterion("productorderitem_user_id <", value, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("productorderitem_user_id <=", value, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdIn(List<Integer> values) {
            addCriterion("productorderitem_user_id in", values, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdNotIn(List<Integer> values) {
            addCriterion("productorderitem_user_id not in", values, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdBetween(Integer value1, Integer value2) {
            addCriterion("productorderitem_user_id between", value1, value2, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productorderitem_user_id not between", value1, value2, "productorderitemUserId");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageIsNull() {
            addCriterion("productorderitem_userMessage is null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageIsNotNull() {
            addCriterion("productorderitem_userMessage is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageEqualTo(String value) {
            addCriterion("productorderitem_userMessage =", value, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageNotEqualTo(String value) {
            addCriterion("productorderitem_userMessage <>", value, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageGreaterThan(String value) {
            addCriterion("productorderitem_userMessage >", value, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageGreaterThanOrEqualTo(String value) {
            addCriterion("productorderitem_userMessage >=", value, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageLessThan(String value) {
            addCriterion("productorderitem_userMessage <", value, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageLessThanOrEqualTo(String value) {
            addCriterion("productorderitem_userMessage <=", value, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageLike(String value) {
            addCriterion("productorderitem_userMessage like", value, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageNotLike(String value) {
            addCriterion("productorderitem_userMessage not like", value, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageIn(List<String> values) {
            addCriterion("productorderitem_userMessage in", values, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageNotIn(List<String> values) {
            addCriterion("productorderitem_userMessage not in", values, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageBetween(String value1, String value2) {
            addCriterion("productorderitem_userMessage between", value1, value2, "productorderitemUsermessage");
            return (Criteria) this;
        }

        public Criteria andProductorderitemUsermessageNotBetween(String value1, String value2) {
            addCriterion("productorderitem_userMessage not between", value1, value2, "productorderitemUsermessage");
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