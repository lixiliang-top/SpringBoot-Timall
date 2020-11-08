package cn.kgc.timall.pojo;

import java.util.ArrayList;
import java.util.List;

public class PropertyvalueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyvalueExample() {
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

        public Criteria andPropertyvalueIdIsNull() {
            addCriterion("propertyvalue_id is null");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdIsNotNull() {
            addCriterion("propertyvalue_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdEqualTo(Integer value) {
            addCriterion("propertyvalue_id =", value, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdNotEqualTo(Integer value) {
            addCriterion("propertyvalue_id <>", value, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdGreaterThan(Integer value) {
            addCriterion("propertyvalue_id >", value, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("propertyvalue_id >=", value, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdLessThan(Integer value) {
            addCriterion("propertyvalue_id <", value, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdLessThanOrEqualTo(Integer value) {
            addCriterion("propertyvalue_id <=", value, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdIn(List<Integer> values) {
            addCriterion("propertyvalue_id in", values, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdNotIn(List<Integer> values) {
            addCriterion("propertyvalue_id not in", values, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdBetween(Integer value1, Integer value2) {
            addCriterion("propertyvalue_id between", value1, value2, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("propertyvalue_id not between", value1, value2, "propertyvalueId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueIsNull() {
            addCriterion("propertyvalue_value is null");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueIsNotNull() {
            addCriterion("propertyvalue_value is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueEqualTo(String value) {
            addCriterion("propertyvalue_value =", value, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueNotEqualTo(String value) {
            addCriterion("propertyvalue_value <>", value, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueGreaterThan(String value) {
            addCriterion("propertyvalue_value >", value, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueGreaterThanOrEqualTo(String value) {
            addCriterion("propertyvalue_value >=", value, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueLessThan(String value) {
            addCriterion("propertyvalue_value <", value, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueLessThanOrEqualTo(String value) {
            addCriterion("propertyvalue_value <=", value, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueLike(String value) {
            addCriterion("propertyvalue_value like", value, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueNotLike(String value) {
            addCriterion("propertyvalue_value not like", value, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueIn(List<String> values) {
            addCriterion("propertyvalue_value in", values, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueNotIn(List<String> values) {
            addCriterion("propertyvalue_value not in", values, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueBetween(String value1, String value2) {
            addCriterion("propertyvalue_value between", value1, value2, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueValueNotBetween(String value1, String value2) {
            addCriterion("propertyvalue_value not between", value1, value2, "propertyvalueValue");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdIsNull() {
            addCriterion("propertyvalue_property_id is null");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdIsNotNull() {
            addCriterion("propertyvalue_property_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdEqualTo(Integer value) {
            addCriterion("propertyvalue_property_id =", value, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdNotEqualTo(Integer value) {
            addCriterion("propertyvalue_property_id <>", value, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdGreaterThan(Integer value) {
            addCriterion("propertyvalue_property_id >", value, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("propertyvalue_property_id >=", value, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdLessThan(Integer value) {
            addCriterion("propertyvalue_property_id <", value, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdLessThanOrEqualTo(Integer value) {
            addCriterion("propertyvalue_property_id <=", value, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdIn(List<Integer> values) {
            addCriterion("propertyvalue_property_id in", values, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdNotIn(List<Integer> values) {
            addCriterion("propertyvalue_property_id not in", values, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdBetween(Integer value1, Integer value2) {
            addCriterion("propertyvalue_property_id between", value1, value2, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvaluePropertyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("propertyvalue_property_id not between", value1, value2, "propertyvaluePropertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdIsNull() {
            addCriterion("propertyvalue_product_id is null");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdIsNotNull() {
            addCriterion("propertyvalue_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdEqualTo(Integer value) {
            addCriterion("propertyvalue_product_id =", value, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdNotEqualTo(Integer value) {
            addCriterion("propertyvalue_product_id <>", value, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdGreaterThan(Integer value) {
            addCriterion("propertyvalue_product_id >", value, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("propertyvalue_product_id >=", value, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdLessThan(Integer value) {
            addCriterion("propertyvalue_product_id <", value, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("propertyvalue_product_id <=", value, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdIn(List<Integer> values) {
            addCriterion("propertyvalue_product_id in", values, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdNotIn(List<Integer> values) {
            addCriterion("propertyvalue_product_id not in", values, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdBetween(Integer value1, Integer value2) {
            addCriterion("propertyvalue_product_id between", value1, value2, "propertyvalueProductId");
            return (Criteria) this;
        }

        public Criteria andPropertyvalueProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("propertyvalue_product_id not between", value1, value2, "propertyvalueProductId");
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