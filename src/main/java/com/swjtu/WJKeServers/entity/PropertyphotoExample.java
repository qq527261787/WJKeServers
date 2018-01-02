package com.swjtu.WJKeServers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PropertyphotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyphotoExample() {
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

        public Criteria andPhotoidIsNull() {
            addCriterion("PhotoID is null");
            return (Criteria) this;
        }

        public Criteria andPhotoidIsNotNull() {
            addCriterion("PhotoID is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoidEqualTo(String value) {
            addCriterion("PhotoID =", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotEqualTo(String value) {
            addCriterion("PhotoID <>", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidGreaterThan(String value) {
            addCriterion("PhotoID >", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoID >=", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidLessThan(String value) {
            addCriterion("PhotoID <", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidLessThanOrEqualTo(String value) {
            addCriterion("PhotoID <=", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidLike(String value) {
            addCriterion("PhotoID like", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotLike(String value) {
            addCriterion("PhotoID not like", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidIn(List<String> values) {
            addCriterion("PhotoID in", values, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotIn(List<String> values) {
            addCriterion("PhotoID not in", values, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidBetween(String value1, String value2) {
            addCriterion("PhotoID between", value1, value2, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotBetween(String value1, String value2) {
            addCriterion("PhotoID not between", value1, value2, "photoid");
            return (Criteria) this;
        }

        public Criteria andPropertyidIsNull() {
            addCriterion("PropertyID is null");
            return (Criteria) this;
        }

        public Criteria andPropertyidIsNotNull() {
            addCriterion("PropertyID is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyidEqualTo(String value) {
            addCriterion("PropertyID =", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotEqualTo(String value) {
            addCriterion("PropertyID <>", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidGreaterThan(String value) {
            addCriterion("PropertyID >", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyID >=", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidLessThan(String value) {
            addCriterion("PropertyID <", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidLessThanOrEqualTo(String value) {
            addCriterion("PropertyID <=", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidLike(String value) {
            addCriterion("PropertyID like", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotLike(String value) {
            addCriterion("PropertyID not like", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidIn(List<String> values) {
            addCriterion("PropertyID in", values, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotIn(List<String> values) {
            addCriterion("PropertyID not in", values, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidBetween(String value1, String value2) {
            addCriterion("PropertyID between", value1, value2, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotBetween(String value1, String value2) {
            addCriterion("PropertyID not between", value1, value2, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNull() {
            addCriterion("PhotoUrl is null");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNotNull() {
            addCriterion("PhotoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourlEqualTo(String value) {
            addCriterion("PhotoUrl =", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotEqualTo(String value) {
            addCriterion("PhotoUrl <>", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThan(String value) {
            addCriterion("PhotoUrl >", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoUrl >=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThan(String value) {
            addCriterion("PhotoUrl <", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThanOrEqualTo(String value) {
            addCriterion("PhotoUrl <=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLike(String value) {
            addCriterion("PhotoUrl like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotLike(String value) {
            addCriterion("PhotoUrl not like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlIn(List<String> values) {
            addCriterion("PhotoUrl in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotIn(List<String> values) {
            addCriterion("PhotoUrl not in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlBetween(String value1, String value2) {
            addCriterion("PhotoUrl between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotBetween(String value1, String value2) {
            addCriterion("PhotoUrl not between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotonameIsNull() {
            addCriterion("PhotoName is null");
            return (Criteria) this;
        }

        public Criteria andPhotonameIsNotNull() {
            addCriterion("PhotoName is not null");
            return (Criteria) this;
        }

        public Criteria andPhotonameEqualTo(String value) {
            addCriterion("PhotoName =", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotEqualTo(String value) {
            addCriterion("PhotoName <>", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameGreaterThan(String value) {
            addCriterion("PhotoName >", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoName >=", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLessThan(String value) {
            addCriterion("PhotoName <", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLessThanOrEqualTo(String value) {
            addCriterion("PhotoName <=", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLike(String value) {
            addCriterion("PhotoName like", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotLike(String value) {
            addCriterion("PhotoName not like", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameIn(List<String> values) {
            addCriterion("PhotoName in", values, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotIn(List<String> values) {
            addCriterion("PhotoName not in", values, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameBetween(String value1, String value2) {
            addCriterion("PhotoName between", value1, value2, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotBetween(String value1, String value2) {
            addCriterion("PhotoName not between", value1, value2, "photoname");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeIsNull() {
            addCriterion("PropertyImgType is null");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeIsNotNull() {
            addCriterion("PropertyImgType is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeEqualTo(String value) {
            addCriterion("PropertyImgType =", value, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeNotEqualTo(String value) {
            addCriterion("PropertyImgType <>", value, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeGreaterThan(String value) {
            addCriterion("PropertyImgType >", value, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyImgType >=", value, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeLessThan(String value) {
            addCriterion("PropertyImgType <", value, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeLessThanOrEqualTo(String value) {
            addCriterion("PropertyImgType <=", value, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeLike(String value) {
            addCriterion("PropertyImgType like", value, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeNotLike(String value) {
            addCriterion("PropertyImgType not like", value, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeIn(List<String> values) {
            addCriterion("PropertyImgType in", values, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeNotIn(List<String> values) {
            addCriterion("PropertyImgType not in", values, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeBetween(String value1, String value2) {
            addCriterion("PropertyImgType between", value1, value2, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andPropertyimgtypeNotBetween(String value1, String value2) {
            addCriterion("PropertyImgType not between", value1, value2, "propertyimgtype");
            return (Criteria) this;
        }

        public Criteria andFrontcoverIsNull() {
            addCriterion("FrontCover is null");
            return (Criteria) this;
        }

        public Criteria andFrontcoverIsNotNull() {
            addCriterion("FrontCover is not null");
            return (Criteria) this;
        }

        public Criteria andFrontcoverEqualTo(Boolean value) {
            addCriterion("FrontCover =", value, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverNotEqualTo(Boolean value) {
            addCriterion("FrontCover <>", value, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverGreaterThan(Boolean value) {
            addCriterion("FrontCover >", value, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FrontCover >=", value, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverLessThan(Boolean value) {
            addCriterion("FrontCover <", value, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverLessThanOrEqualTo(Boolean value) {
            addCriterion("FrontCover <=", value, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverIn(List<Boolean> values) {
            addCriterion("FrontCover in", values, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverNotIn(List<Boolean> values) {
            addCriterion("FrontCover not in", values, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverBetween(Boolean value1, Boolean value2) {
            addCriterion("FrontCover between", value1, value2, "frontcover");
            return (Criteria) this;
        }

        public Criteria andFrontcoverNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FrontCover not between", value1, value2, "frontcover");
            return (Criteria) this;
        }

        public Criteria andExdateIsNull() {
            addCriterion("ExDate is null");
            return (Criteria) this;
        }

        public Criteria andExdateIsNotNull() {
            addCriterion("ExDate is not null");
            return (Criteria) this;
        }

        public Criteria andExdateEqualTo(Date value) {
            addCriterion("ExDate =", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotEqualTo(Date value) {
            addCriterion("ExDate <>", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateGreaterThan(Date value) {
            addCriterion("ExDate >", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExDate >=", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateLessThan(Date value) {
            addCriterion("ExDate <", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateLessThanOrEqualTo(Date value) {
            addCriterion("ExDate <=", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateIn(List<Date> values) {
            addCriterion("ExDate in", values, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotIn(List<Date> values) {
            addCriterion("ExDate not in", values, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateBetween(Date value1, Date value2) {
            addCriterion("ExDate between", value1, value2, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotBetween(Date value1, Date value2) {
            addCriterion("ExDate not between", value1, value2, "exdate");
            return (Criteria) this;
        }

        public Criteria andModdateIsNull() {
            addCriterion("ModDate is null");
            return (Criteria) this;
        }

        public Criteria andModdateIsNotNull() {
            addCriterion("ModDate is not null");
            return (Criteria) this;
        }

        public Criteria andModdateEqualTo(Date value) {
            addCriterion("ModDate =", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateNotEqualTo(Date value) {
            addCriterion("ModDate <>", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateGreaterThan(Date value) {
            addCriterion("ModDate >", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModDate >=", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateLessThan(Date value) {
            addCriterion("ModDate <", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateLessThanOrEqualTo(Date value) {
            addCriterion("ModDate <=", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateIn(List<Date> values) {
            addCriterion("ModDate in", values, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateNotIn(List<Date> values) {
            addCriterion("ModDate not in", values, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateBetween(Date value1, Date value2) {
            addCriterion("ModDate between", value1, value2, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateNotBetween(Date value1, Date value2) {
            addCriterion("ModDate not between", value1, value2, "moddate");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedIsNull() {
            addCriterion("FlagTrashed is null");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedIsNotNull() {
            addCriterion("FlagTrashed is not null");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedEqualTo(Boolean value) {
            addCriterion("FlagTrashed =", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedNotEqualTo(Boolean value) {
            addCriterion("FlagTrashed <>", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedGreaterThan(Boolean value) {
            addCriterion("FlagTrashed >", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagTrashed >=", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedLessThan(Boolean value) {
            addCriterion("FlagTrashed <", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagTrashed <=", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedIn(List<Boolean> values) {
            addCriterion("FlagTrashed in", values, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedNotIn(List<Boolean> values) {
            addCriterion("FlagTrashed not in", values, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagTrashed between", value1, value2, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagTrashed not between", value1, value2, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedIsNull() {
            addCriterion("FlagDeleted is null");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedIsNotNull() {
            addCriterion("FlagDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedEqualTo(Boolean value) {
            addCriterion("FlagDeleted =", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedNotEqualTo(Boolean value) {
            addCriterion("FlagDeleted <>", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedGreaterThan(Boolean value) {
            addCriterion("FlagDeleted >", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagDeleted >=", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedLessThan(Boolean value) {
            addCriterion("FlagDeleted <", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagDeleted <=", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedIn(List<Boolean> values) {
            addCriterion("FlagDeleted in", values, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedNotIn(List<Boolean> values) {
            addCriterion("FlagDeleted not in", values, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagDeleted between", value1, value2, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagDeleted not between", value1, value2, "flagdeleted");
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