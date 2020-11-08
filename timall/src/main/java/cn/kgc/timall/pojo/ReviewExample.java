package cn.kgc.timall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andReviewIdIsNull() {
            addCriterion("review_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNotNull() {
            addCriterion("review_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIdEqualTo(Integer value) {
            addCriterion("review_id =", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotEqualTo(Integer value) {
            addCriterion("review_id <>", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThan(Integer value) {
            addCriterion("review_id >", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_id >=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThan(Integer value) {
            addCriterion("review_id <", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("review_id <=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdIn(List<Integer> values) {
            addCriterion("review_id in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotIn(List<Integer> values) {
            addCriterion("review_id not in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdBetween(Integer value1, Integer value2) {
            addCriterion("review_id between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("review_id not between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateIsNull() {
            addCriterion("review_createdate is null");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateIsNotNull() {
            addCriterion("review_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateEqualTo(Date value) {
            addCriterion("review_createdate =", value, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateNotEqualTo(Date value) {
            addCriterion("review_createdate <>", value, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateGreaterThan(Date value) {
            addCriterion("review_createdate >", value, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("review_createdate >=", value, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateLessThan(Date value) {
            addCriterion("review_createdate <", value, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("review_createdate <=", value, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateIn(List<Date> values) {
            addCriterion("review_createdate in", values, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateNotIn(List<Date> values) {
            addCriterion("review_createdate not in", values, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateBetween(Date value1, Date value2) {
            addCriterion("review_createdate between", value1, value2, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("review_createdate not between", value1, value2, "reviewCreatedate");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdIsNull() {
            addCriterion("review_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdIsNotNull() {
            addCriterion("review_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdEqualTo(Integer value) {
            addCriterion("review_user_id =", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdNotEqualTo(Integer value) {
            addCriterion("review_user_id <>", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdGreaterThan(Integer value) {
            addCriterion("review_user_id >", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_user_id >=", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdLessThan(Integer value) {
            addCriterion("review_user_id <", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("review_user_id <=", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdIn(List<Integer> values) {
            addCriterion("review_user_id in", values, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdNotIn(List<Integer> values) {
            addCriterion("review_user_id not in", values, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdBetween(Integer value1, Integer value2) {
            addCriterion("review_user_id between", value1, value2, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("review_user_id not between", value1, value2, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdIsNull() {
            addCriterion("review_product_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdIsNotNull() {
            addCriterion("review_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdEqualTo(Integer value) {
            addCriterion("review_product_id =", value, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdNotEqualTo(Integer value) {
            addCriterion("review_product_id <>", value, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdGreaterThan(Integer value) {
            addCriterion("review_product_id >", value, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_product_id >=", value, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdLessThan(Integer value) {
            addCriterion("review_product_id <", value, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("review_product_id <=", value, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdIn(List<Integer> values) {
            addCriterion("review_product_id in", values, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdNotIn(List<Integer> values) {
            addCriterion("review_product_id not in", values, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdBetween(Integer value1, Integer value2) {
            addCriterion("review_product_id between", value1, value2, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("review_product_id not between", value1, value2, "reviewProductId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdIsNull() {
            addCriterion("review_orderItem_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdIsNotNull() {
            addCriterion("review_orderItem_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdEqualTo(Integer value) {
            addCriterion("review_orderItem_id =", value, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdNotEqualTo(Integer value) {
            addCriterion("review_orderItem_id <>", value, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdGreaterThan(Integer value) {
            addCriterion("review_orderItem_id >", value, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_orderItem_id >=", value, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdLessThan(Integer value) {
            addCriterion("review_orderItem_id <", value, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdLessThanOrEqualTo(Integer value) {
            addCriterion("review_orderItem_id <=", value, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdIn(List<Integer> values) {
            addCriterion("review_orderItem_id in", values, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdNotIn(List<Integer> values) {
            addCriterion("review_orderItem_id not in", values, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdBetween(Integer value1, Integer value2) {
            addCriterion("review_orderItem_id between", value1, value2, "reviewOrderitemId");
            return (Criteria) this;
        }

        public Criteria andReviewOrderitemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("review_orderItem_id not between", value1, value2, "reviewOrderitemId");
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