package cn.kgc.timall.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductimageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductimageExample() {
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

        public Criteria andProductimageIdIsNull() {
            addCriterion("productimage_id is null");
            return (Criteria) this;
        }

        public Criteria andProductimageIdIsNotNull() {
            addCriterion("productimage_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductimageIdEqualTo(Integer value) {
            addCriterion("productimage_id =", value, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdNotEqualTo(Integer value) {
            addCriterion("productimage_id <>", value, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdGreaterThan(Integer value) {
            addCriterion("productimage_id >", value, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productimage_id >=", value, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdLessThan(Integer value) {
            addCriterion("productimage_id <", value, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdLessThanOrEqualTo(Integer value) {
            addCriterion("productimage_id <=", value, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdIn(List<Integer> values) {
            addCriterion("productimage_id in", values, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdNotIn(List<Integer> values) {
            addCriterion("productimage_id not in", values, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdBetween(Integer value1, Integer value2) {
            addCriterion("productimage_id between", value1, value2, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productimage_id not between", value1, value2, "productimageId");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeIsNull() {
            addCriterion("productimage_type is null");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeIsNotNull() {
            addCriterion("productimage_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeEqualTo(Byte value) {
            addCriterion("productimage_type =", value, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeNotEqualTo(Byte value) {
            addCriterion("productimage_type <>", value, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeGreaterThan(Byte value) {
            addCriterion("productimage_type >", value, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("productimage_type >=", value, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeLessThan(Byte value) {
            addCriterion("productimage_type <", value, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeLessThanOrEqualTo(Byte value) {
            addCriterion("productimage_type <=", value, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeIn(List<Byte> values) {
            addCriterion("productimage_type in", values, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeNotIn(List<Byte> values) {
            addCriterion("productimage_type not in", values, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeBetween(Byte value1, Byte value2) {
            addCriterion("productimage_type between", value1, value2, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("productimage_type not between", value1, value2, "productimageType");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcIsNull() {
            addCriterion("productimage_src is null");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcIsNotNull() {
            addCriterion("productimage_src is not null");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcEqualTo(String value) {
            addCriterion("productimage_src =", value, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcNotEqualTo(String value) {
            addCriterion("productimage_src <>", value, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcGreaterThan(String value) {
            addCriterion("productimage_src >", value, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcGreaterThanOrEqualTo(String value) {
            addCriterion("productimage_src >=", value, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcLessThan(String value) {
            addCriterion("productimage_src <", value, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcLessThanOrEqualTo(String value) {
            addCriterion("productimage_src <=", value, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcLike(String value) {
            addCriterion("productimage_src like", value, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcNotLike(String value) {
            addCriterion("productimage_src not like", value, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcIn(List<String> values) {
            addCriterion("productimage_src in", values, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcNotIn(List<String> values) {
            addCriterion("productimage_src not in", values, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcBetween(String value1, String value2) {
            addCriterion("productimage_src between", value1, value2, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageSrcNotBetween(String value1, String value2) {
            addCriterion("productimage_src not between", value1, value2, "productimageSrc");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdIsNull() {
            addCriterion("productimage_product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdIsNotNull() {
            addCriterion("productimage_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdEqualTo(Integer value) {
            addCriterion("productimage_product_id =", value, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdNotEqualTo(Integer value) {
            addCriterion("productimage_product_id <>", value, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdGreaterThan(Integer value) {
            addCriterion("productimage_product_id >", value, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productimage_product_id >=", value, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdLessThan(Integer value) {
            addCriterion("productimage_product_id <", value, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("productimage_product_id <=", value, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdIn(List<Integer> values) {
            addCriterion("productimage_product_id in", values, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdNotIn(List<Integer> values) {
            addCriterion("productimage_product_id not in", values, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdBetween(Integer value1, Integer value2) {
            addCriterion("productimage_product_id between", value1, value2, "productimageProductId");
            return (Criteria) this;
        }

        public Criteria andProductimageProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productimage_product_id not between", value1, value2, "productimageProductId");
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