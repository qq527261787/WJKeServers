package com.swjtu.WJKeServers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmpidIsNull() {
            addCriterion("EmpID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EmpID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("EmpID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("EmpID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("EmpID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("EmpID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("EmpID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("EmpID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("EmpID like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("EmpID not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("EmpID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("EmpID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("EmpID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("EmpID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNull() {
            addCriterion("EmpNo is null");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("EmpNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnoEqualTo(String value) {
            addCriterion("EmpNo =", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotEqualTo(String value) {
            addCriterion("EmpNo <>", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThan(String value) {
            addCriterion("EmpNo >", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(String value) {
            addCriterion("EmpNo >=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThan(String value) {
            addCriterion("EmpNo <", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(String value) {
            addCriterion("EmpNo <=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLike(String value) {
            addCriterion("EmpNo like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotLike(String value) {
            addCriterion("EmpNo not like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoIn(List<String> values) {
            addCriterion("EmpNo in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotIn(List<String> values) {
            addCriterion("EmpNo not in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoBetween(String value1, String value2) {
            addCriterion("EmpNo between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotBetween(String value1, String value2) {
            addCriterion("EmpNo not between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNull() {
            addCriterion("PositionName is null");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNotNull() {
            addCriterion("PositionName is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnameEqualTo(String value) {
            addCriterion("PositionName =", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotEqualTo(String value) {
            addCriterion("PositionName <>", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThan(String value) {
            addCriterion("PositionName >", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("PositionName >=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThan(String value) {
            addCriterion("PositionName <", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThanOrEqualTo(String value) {
            addCriterion("PositionName <=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLike(String value) {
            addCriterion("PositionName like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotLike(String value) {
            addCriterion("PositionName not like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameIn(List<String> values) {
            addCriterion("PositionName in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotIn(List<String> values) {
            addCriterion("PositionName not in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameBetween(String value1, String value2) {
            addCriterion("PositionName between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotBetween(String value1, String value2) {
            addCriterion("PositionName not between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EmpName is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EmpName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EmpName =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EmpName <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EmpName >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EmpName >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EmpName <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EmpName <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EmpName like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EmpName not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EmpName in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EmpName not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EmpName between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EmpName not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpsexIsNull() {
            addCriterion("EmpSex is null");
            return (Criteria) this;
        }

        public Criteria andEmpsexIsNotNull() {
            addCriterion("EmpSex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpsexEqualTo(String value) {
            addCriterion("EmpSex =", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotEqualTo(String value) {
            addCriterion("EmpSex <>", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexGreaterThan(String value) {
            addCriterion("EmpSex >", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexGreaterThanOrEqualTo(String value) {
            addCriterion("EmpSex >=", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLessThan(String value) {
            addCriterion("EmpSex <", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLessThanOrEqualTo(String value) {
            addCriterion("EmpSex <=", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLike(String value) {
            addCriterion("EmpSex like", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotLike(String value) {
            addCriterion("EmpSex not like", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexIn(List<String> values) {
            addCriterion("EmpSex in", values, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotIn(List<String> values) {
            addCriterion("EmpSex not in", values, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexBetween(String value1, String value2) {
            addCriterion("EmpSex between", value1, value2, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotBetween(String value1, String value2) {
            addCriterion("EmpSex not between", value1, value2, "empsex");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andDepttelIsNull() {
            addCriterion("DeptTel is null");
            return (Criteria) this;
        }

        public Criteria andDepttelIsNotNull() {
            addCriterion("DeptTel is not null");
            return (Criteria) this;
        }

        public Criteria andDepttelEqualTo(String value) {
            addCriterion("DeptTel =", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelNotEqualTo(String value) {
            addCriterion("DeptTel <>", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelGreaterThan(String value) {
            addCriterion("DeptTel >", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelGreaterThanOrEqualTo(String value) {
            addCriterion("DeptTel >=", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelLessThan(String value) {
            addCriterion("DeptTel <", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelLessThanOrEqualTo(String value) {
            addCriterion("DeptTel <=", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelLike(String value) {
            addCriterion("DeptTel like", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelNotLike(String value) {
            addCriterion("DeptTel not like", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelIn(List<String> values) {
            addCriterion("DeptTel in", values, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelNotIn(List<String> values) {
            addCriterion("DeptTel not in", values, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelBetween(String value1, String value2) {
            addCriterion("DeptTel between", value1, value2, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelNotBetween(String value1, String value2) {
            addCriterion("DeptTel not between", value1, value2, "depttel");
            return (Criteria) this;
        }

        public Criteria andRollinIsNull() {
            addCriterion("RollIn is null");
            return (Criteria) this;
        }

        public Criteria andRollinIsNotNull() {
            addCriterion("RollIn is not null");
            return (Criteria) this;
        }

        public Criteria andRollinEqualTo(Date value) {
            addCriterion("RollIn =", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinNotEqualTo(Date value) {
            addCriterion("RollIn <>", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinGreaterThan(Date value) {
            addCriterion("RollIn >", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinGreaterThanOrEqualTo(Date value) {
            addCriterion("RollIn >=", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinLessThan(Date value) {
            addCriterion("RollIn <", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinLessThanOrEqualTo(Date value) {
            addCriterion("RollIn <=", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinIn(List<Date> values) {
            addCriterion("RollIn in", values, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinNotIn(List<Date> values) {
            addCriterion("RollIn not in", values, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinBetween(Date value1, Date value2) {
            addCriterion("RollIn between", value1, value2, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinNotBetween(Date value1, Date value2) {
            addCriterion("RollIn not between", value1, value2, "rollin");
            return (Criteria) this;
        }

        public Criteria andEmpphotoIsNull() {
            addCriterion("EmpPhoto is null");
            return (Criteria) this;
        }

        public Criteria andEmpphotoIsNotNull() {
            addCriterion("EmpPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andEmpphotoEqualTo(String value) {
            addCriterion("EmpPhoto =", value, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoNotEqualTo(String value) {
            addCriterion("EmpPhoto <>", value, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoGreaterThan(String value) {
            addCriterion("EmpPhoto >", value, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoGreaterThanOrEqualTo(String value) {
            addCriterion("EmpPhoto >=", value, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoLessThan(String value) {
            addCriterion("EmpPhoto <", value, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoLessThanOrEqualTo(String value) {
            addCriterion("EmpPhoto <=", value, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoLike(String value) {
            addCriterion("EmpPhoto like", value, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoNotLike(String value) {
            addCriterion("EmpPhoto not like", value, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoIn(List<String> values) {
            addCriterion("EmpPhoto in", values, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoNotIn(List<String> values) {
            addCriterion("EmpPhoto not in", values, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoBetween(String value1, String value2) {
            addCriterion("EmpPhoto between", value1, value2, "empphoto");
            return (Criteria) this;
        }

        public Criteria andEmpphotoNotBetween(String value1, String value2) {
            addCriterion("EmpPhoto not between", value1, value2, "empphoto");
            return (Criteria) this;
        }

        public Criteria andPasswordwebIsNull() {
            addCriterion("PassWordWeb is null");
            return (Criteria) this;
        }

        public Criteria andPasswordwebIsNotNull() {
            addCriterion("PassWordWeb is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordwebEqualTo(String value) {
            addCriterion("PassWordWeb =", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebNotEqualTo(String value) {
            addCriterion("PassWordWeb <>", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebGreaterThan(String value) {
            addCriterion("PassWordWeb >", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebGreaterThanOrEqualTo(String value) {
            addCriterion("PassWordWeb >=", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebLessThan(String value) {
            addCriterion("PassWordWeb <", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebLessThanOrEqualTo(String value) {
            addCriterion("PassWordWeb <=", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebLike(String value) {
            addCriterion("PassWordWeb like", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebNotLike(String value) {
            addCriterion("PassWordWeb not like", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebIn(List<String> values) {
            addCriterion("PassWordWeb in", values, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebNotIn(List<String> values) {
            addCriterion("PassWordWeb not in", values, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebBetween(String value1, String value2) {
            addCriterion("PassWordWeb between", value1, value2, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebNotBetween(String value1, String value2) {
            addCriterion("PassWordWeb not between", value1, value2, "passwordweb");
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

        public Criteria andStoreidIsNull() {
            addCriterion("StoreID is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("StoreID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(String value) {
            addCriterion("StoreID =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(String value) {
            addCriterion("StoreID <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(String value) {
            addCriterion("StoreID >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(String value) {
            addCriterion("StoreID >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(String value) {
            addCriterion("StoreID <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(String value) {
            addCriterion("StoreID <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLike(String value) {
            addCriterion("StoreID like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotLike(String value) {
            addCriterion("StoreID not like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<String> values) {
            addCriterion("StoreID in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<String> values) {
            addCriterion("StoreID not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(String value1, String value2) {
            addCriterion("StoreID between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(String value1, String value2) {
            addCriterion("StoreID not between", value1, value2, "storeid");
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