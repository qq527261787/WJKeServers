package com.swjtu.WJKeServers.entity;

import java.util.ArrayList;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andAreaidIsNull() {
            addCriterion("AreaID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AreaID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("AreaID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("AreaID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("AreaID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("AreaID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("AreaID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("AreaID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("AreaID like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("AreaID not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("AreaID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("AreaID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("AreaID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("AreaID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AreaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AreaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AreaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AreaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AreaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AreaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AreaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AreaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AreaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AreaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AreaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AreaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AreaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AreaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNull() {
            addCriterion("DistrictID is null");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNotNull() {
            addCriterion("DistrictID is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictidEqualTo(String value) {
            addCriterion("DistrictID =", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotEqualTo(String value) {
            addCriterion("DistrictID <>", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThan(String value) {
            addCriterion("DistrictID >", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThanOrEqualTo(String value) {
            addCriterion("DistrictID >=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThan(String value) {
            addCriterion("DistrictID <", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThanOrEqualTo(String value) {
            addCriterion("DistrictID <=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLike(String value) {
            addCriterion("DistrictID like", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotLike(String value) {
            addCriterion("DistrictID not like", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidIn(List<String> values) {
            addCriterion("DistrictID in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotIn(List<String> values) {
            addCriterion("DistrictID not in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidBetween(String value1, String value2) {
            addCriterion("DistrictID between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotBetween(String value1, String value2) {
            addCriterion("DistrictID not between", value1, value2, "districtid");
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