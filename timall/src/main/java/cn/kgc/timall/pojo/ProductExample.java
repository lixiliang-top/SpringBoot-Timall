package cn.kgc.timall.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNull() {
            addCriterion("product_title is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNotNull() {
            addCriterion("product_title is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEqualTo(String value) {
            addCriterion("product_title =", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotEqualTo(String value) {
            addCriterion("product_title <>", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThan(String value) {
            addCriterion("product_title >", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThanOrEqualTo(String value) {
            addCriterion("product_title >=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThan(String value) {
            addCriterion("product_title <", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThanOrEqualTo(String value) {
            addCriterion("product_title <=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLike(String value) {
            addCriterion("product_title like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotLike(String value) {
            addCriterion("product_title not like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleIn(List<String> values) {
            addCriterion("product_title in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotIn(List<String> values) {
            addCriterion("product_title not in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleBetween(String value1, String value2) {
            addCriterion("product_title between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotBetween(String value1, String value2) {
            addCriterion("product_title not between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(BigDecimal value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(BigDecimal value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(BigDecimal value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(BigDecimal value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<BigDecimal> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<BigDecimal> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceIsNull() {
            addCriterion("product_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceIsNotNull() {
            addCriterion("product_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceEqualTo(BigDecimal value) {
            addCriterion("product_sale_price =", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("product_sale_price <>", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceGreaterThan(BigDecimal value) {
            addCriterion("product_sale_price >", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_sale_price >=", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceLessThan(BigDecimal value) {
            addCriterion("product_sale_price <", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_sale_price <=", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceIn(List<BigDecimal> values) {
            addCriterion("product_sale_price in", values, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("product_sale_price not in", values, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_sale_price between", value1, value2, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_sale_price not between", value1, value2, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateIsNull() {
            addCriterion("product_create_date is null");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateIsNotNull() {
            addCriterion("product_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateEqualTo(Date value) {
            addCriterion("product_create_date =", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateNotEqualTo(Date value) {
            addCriterion("product_create_date <>", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateGreaterThan(Date value) {
            addCriterion("product_create_date >", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("product_create_date >=", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateLessThan(Date value) {
            addCriterion("product_create_date <", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("product_create_date <=", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateIn(List<Date> values) {
            addCriterion("product_create_date in", values, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateNotIn(List<Date> values) {
            addCriterion("product_create_date not in", values, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateBetween(Date value1, Date value2) {
            addCriterion("product_create_date between", value1, value2, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("product_create_date not between", value1, value2, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(Integer value) {
            addCriterion("product_category_id =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(Integer value) {
            addCriterion("product_category_id <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(Integer value) {
            addCriterion("product_category_id >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_category_id >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(Integer value) {
            addCriterion("product_category_id <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_category_id <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<Integer> values) {
            addCriterion("product_category_id in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<Integer> values) {
            addCriterion("product_category_id not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("product_category_id between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_category_id not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledIsNull() {
            addCriterion("product_isEnabled is null");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledIsNotNull() {
            addCriterion("product_isEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledEqualTo(Boolean value) {
            addCriterion("product_isEnabled =", value, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledNotEqualTo(Boolean value) {
            addCriterion("product_isEnabled <>", value, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledGreaterThan(Boolean value) {
            addCriterion("product_isEnabled >", value, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("product_isEnabled >=", value, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledLessThan(Boolean value) {
            addCriterion("product_isEnabled <", value, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("product_isEnabled <=", value, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledIn(List<Boolean> values) {
            addCriterion("product_isEnabled in", values, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledNotIn(List<Boolean> values) {
            addCriterion("product_isEnabled not in", values, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("product_isEnabled between", value1, value2, "productIsenabled");
            return (Criteria) this;
        }

        public Criteria andProductIsenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("product_isEnabled not between", value1, value2, "productIsenabled");
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