package cn.kgc.timall.pojo;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddressAreaidIsNull() {
            addCriterion("address_areaId is null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidIsNotNull() {
            addCriterion("address_areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidEqualTo(String value) {
            addCriterion("address_areaId =", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidNotEqualTo(String value) {
            addCriterion("address_areaId <>", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidGreaterThan(String value) {
            addCriterion("address_areaId >", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("address_areaId >=", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidLessThan(String value) {
            addCriterion("address_areaId <", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidLessThanOrEqualTo(String value) {
            addCriterion("address_areaId <=", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidLike(String value) {
            addCriterion("address_areaId like", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidNotLike(String value) {
            addCriterion("address_areaId not like", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidIn(List<String> values) {
            addCriterion("address_areaId in", values, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidNotIn(List<String> values) {
            addCriterion("address_areaId not in", values, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidBetween(String value1, String value2) {
            addCriterion("address_areaId between", value1, value2, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidNotBetween(String value1, String value2) {
            addCriterion("address_areaId not between", value1, value2, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNull() {
            addCriterion("address_name is null");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNotNull() {
            addCriterion("address_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddressNameEqualTo(String value) {
            addCriterion("address_name =", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotEqualTo(String value) {
            addCriterion("address_name <>", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThan(String value) {
            addCriterion("address_name >", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("address_name >=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThan(String value) {
            addCriterion("address_name <", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThanOrEqualTo(String value) {
            addCriterion("address_name <=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLike(String value) {
            addCriterion("address_name like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotLike(String value) {
            addCriterion("address_name not like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameIn(List<String> values) {
            addCriterion("address_name in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotIn(List<String> values) {
            addCriterion("address_name not in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameBetween(String value1, String value2) {
            addCriterion("address_name between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotBetween(String value1, String value2) {
            addCriterion("address_name not between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidIsNull() {
            addCriterion("address_regionId is null");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidIsNotNull() {
            addCriterion("address_regionId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidEqualTo(String value) {
            addCriterion("address_regionId =", value, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidNotEqualTo(String value) {
            addCriterion("address_regionId <>", value, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidGreaterThan(String value) {
            addCriterion("address_regionId >", value, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidGreaterThanOrEqualTo(String value) {
            addCriterion("address_regionId >=", value, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidLessThan(String value) {
            addCriterion("address_regionId <", value, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidLessThanOrEqualTo(String value) {
            addCriterion("address_regionId <=", value, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidLike(String value) {
            addCriterion("address_regionId like", value, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidNotLike(String value) {
            addCriterion("address_regionId not like", value, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidIn(List<String> values) {
            addCriterion("address_regionId in", values, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidNotIn(List<String> values) {
            addCriterion("address_regionId not in", values, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidBetween(String value1, String value2) {
            addCriterion("address_regionId between", value1, value2, "addressRegionid");
            return (Criteria) this;
        }

        public Criteria andAddressRegionidNotBetween(String value1, String value2) {
            addCriterion("address_regionId not between", value1, value2, "addressRegionid");
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