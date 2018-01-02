package com.swjtu.WJKeServers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EstateExample() {
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

        public Criteria andEstateidIsNull() {
            addCriterion("EstateID is null");
            return (Criteria) this;
        }

        public Criteria andEstateidIsNotNull() {
            addCriterion("EstateID is not null");
            return (Criteria) this;
        }

        public Criteria andEstateidEqualTo(String value) {
            addCriterion("EstateID =", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidNotEqualTo(String value) {
            addCriterion("EstateID <>", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidGreaterThan(String value) {
            addCriterion("EstateID >", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidGreaterThanOrEqualTo(String value) {
            addCriterion("EstateID >=", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidLessThan(String value) {
            addCriterion("EstateID <", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidLessThanOrEqualTo(String value) {
            addCriterion("EstateID <=", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidLike(String value) {
            addCriterion("EstateID like", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidNotLike(String value) {
            addCriterion("EstateID not like", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidIn(List<String> values) {
            addCriterion("EstateID in", values, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidNotIn(List<String> values) {
            addCriterion("EstateID not in", values, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidBetween(String value1, String value2) {
            addCriterion("EstateID between", value1, value2, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidNotBetween(String value1, String value2) {
            addCriterion("EstateID not between", value1, value2, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstatenameIsNull() {
            addCriterion("EstateName is null");
            return (Criteria) this;
        }

        public Criteria andEstatenameIsNotNull() {
            addCriterion("EstateName is not null");
            return (Criteria) this;
        }

        public Criteria andEstatenameEqualTo(String value) {
            addCriterion("EstateName =", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameNotEqualTo(String value) {
            addCriterion("EstateName <>", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameGreaterThan(String value) {
            addCriterion("EstateName >", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameGreaterThanOrEqualTo(String value) {
            addCriterion("EstateName >=", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameLessThan(String value) {
            addCriterion("EstateName <", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameLessThanOrEqualTo(String value) {
            addCriterion("EstateName <=", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameLike(String value) {
            addCriterion("EstateName like", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameNotLike(String value) {
            addCriterion("EstateName not like", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameIn(List<String> values) {
            addCriterion("EstateName in", values, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameNotIn(List<String> values) {
            addCriterion("EstateName not in", values, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameBetween(String value1, String value2) {
            addCriterion("EstateName between", value1, value2, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameNotBetween(String value1, String value2) {
            addCriterion("EstateName not between", value1, value2, "estatename");
            return (Criteria) this;
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

        public Criteria andCitynameIsNull() {
            addCriterion("CityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("CityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("CityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("CityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("CityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("CityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("CityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("CityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("CityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("CityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("CityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("CityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("CityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIsNull() {
            addCriterion("DistrictName is null");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIsNotNull() {
            addCriterion("DistrictName is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictnameEqualTo(String value) {
            addCriterion("DistrictName =", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotEqualTo(String value) {
            addCriterion("DistrictName <>", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameGreaterThan(String value) {
            addCriterion("DistrictName >", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameGreaterThanOrEqualTo(String value) {
            addCriterion("DistrictName >=", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLessThan(String value) {
            addCriterion("DistrictName <", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLessThanOrEqualTo(String value) {
            addCriterion("DistrictName <=", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLike(String value) {
            addCriterion("DistrictName like", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotLike(String value) {
            addCriterion("DistrictName not like", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIn(List<String> values) {
            addCriterion("DistrictName in", values, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotIn(List<String> values) {
            addCriterion("DistrictName not in", values, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameBetween(String value1, String value2) {
            addCriterion("DistrictName between", value1, value2, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotBetween(String value1, String value2) {
            addCriterion("DistrictName not between", value1, value2, "districtname");
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

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCompleteyearIsNull() {
            addCriterion("CompleteYear is null");
            return (Criteria) this;
        }

        public Criteria andCompleteyearIsNotNull() {
            addCriterion("CompleteYear is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteyearEqualTo(String value) {
            addCriterion("CompleteYear =", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearNotEqualTo(String value) {
            addCriterion("CompleteYear <>", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearGreaterThan(String value) {
            addCriterion("CompleteYear >", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearGreaterThanOrEqualTo(String value) {
            addCriterion("CompleteYear >=", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearLessThan(String value) {
            addCriterion("CompleteYear <", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearLessThanOrEqualTo(String value) {
            addCriterion("CompleteYear <=", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearLike(String value) {
            addCriterion("CompleteYear like", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearNotLike(String value) {
            addCriterion("CompleteYear not like", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearIn(List<String> values) {
            addCriterion("CompleteYear in", values, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearNotIn(List<String> values) {
            addCriterion("CompleteYear not in", values, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearBetween(String value1, String value2) {
            addCriterion("CompleteYear between", value1, value2, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearNotBetween(String value1, String value2) {
            addCriterion("CompleteYear not between", value1, value2, "completeyear");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIsNull() {
            addCriterion("BuildType is null");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIsNotNull() {
            addCriterion("BuildType is not null");
            return (Criteria) this;
        }

        public Criteria andBuildtypeEqualTo(String value) {
            addCriterion("BuildType =", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotEqualTo(String value) {
            addCriterion("BuildType <>", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeGreaterThan(String value) {
            addCriterion("BuildType >", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeGreaterThanOrEqualTo(String value) {
            addCriterion("BuildType >=", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLessThan(String value) {
            addCriterion("BuildType <", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLessThanOrEqualTo(String value) {
            addCriterion("BuildType <=", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLike(String value) {
            addCriterion("BuildType like", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotLike(String value) {
            addCriterion("BuildType not like", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIn(List<String> values) {
            addCriterion("BuildType in", values, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotIn(List<String> values) {
            addCriterion("BuildType not in", values, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeBetween(String value1, String value2) {
            addCriterion("BuildType between", value1, value2, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotBetween(String value1, String value2) {
            addCriterion("BuildType not between", value1, value2, "buildtype");
            return (Criteria) this;
        }

        public Criteria andMgtpriceIsNull() {
            addCriterion("MgtPrice is null");
            return (Criteria) this;
        }

        public Criteria andMgtpriceIsNotNull() {
            addCriterion("MgtPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMgtpriceEqualTo(String value) {
            addCriterion("MgtPrice =", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceNotEqualTo(String value) {
            addCriterion("MgtPrice <>", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceGreaterThan(String value) {
            addCriterion("MgtPrice >", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceGreaterThanOrEqualTo(String value) {
            addCriterion("MgtPrice >=", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceLessThan(String value) {
            addCriterion("MgtPrice <", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceLessThanOrEqualTo(String value) {
            addCriterion("MgtPrice <=", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceLike(String value) {
            addCriterion("MgtPrice like", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceNotLike(String value) {
            addCriterion("MgtPrice not like", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceIn(List<String> values) {
            addCriterion("MgtPrice in", values, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceNotIn(List<String> values) {
            addCriterion("MgtPrice not in", values, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceBetween(String value1, String value2) {
            addCriterion("MgtPrice between", value1, value2, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceNotBetween(String value1, String value2) {
            addCriterion("MgtPrice not between", value1, value2, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyIsNull() {
            addCriterion("MgtCompany is null");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyIsNotNull() {
            addCriterion("MgtCompany is not null");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyEqualTo(String value) {
            addCriterion("MgtCompany =", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyNotEqualTo(String value) {
            addCriterion("MgtCompany <>", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyGreaterThan(String value) {
            addCriterion("MgtCompany >", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("MgtCompany >=", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyLessThan(String value) {
            addCriterion("MgtCompany <", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyLessThanOrEqualTo(String value) {
            addCriterion("MgtCompany <=", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyLike(String value) {
            addCriterion("MgtCompany like", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyNotLike(String value) {
            addCriterion("MgtCompany not like", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyIn(List<String> values) {
            addCriterion("MgtCompany in", values, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyNotIn(List<String> values) {
            addCriterion("MgtCompany not in", values, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyBetween(String value1, String value2) {
            addCriterion("MgtCompany between", value1, value2, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyNotBetween(String value1, String value2) {
            addCriterion("MgtCompany not between", value1, value2, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyIsNull() {
            addCriterion("DevCompany is null");
            return (Criteria) this;
        }

        public Criteria andDevcompanyIsNotNull() {
            addCriterion("DevCompany is not null");
            return (Criteria) this;
        }

        public Criteria andDevcompanyEqualTo(String value) {
            addCriterion("DevCompany =", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyNotEqualTo(String value) {
            addCriterion("DevCompany <>", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyGreaterThan(String value) {
            addCriterion("DevCompany >", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("DevCompany >=", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyLessThan(String value) {
            addCriterion("DevCompany <", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyLessThanOrEqualTo(String value) {
            addCriterion("DevCompany <=", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyLike(String value) {
            addCriterion("DevCompany like", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyNotLike(String value) {
            addCriterion("DevCompany not like", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyIn(List<String> values) {
            addCriterion("DevCompany in", values, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyNotIn(List<String> values) {
            addCriterion("DevCompany not in", values, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyBetween(String value1, String value2) {
            addCriterion("DevCompany between", value1, value2, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyNotBetween(String value1, String value2) {
            addCriterion("DevCompany not between", value1, value2, "devcompany");
            return (Criteria) this;
        }

        public Criteria andRpratioIsNull() {
            addCriterion("RpRatio is null");
            return (Criteria) this;
        }

        public Criteria andRpratioIsNotNull() {
            addCriterion("RpRatio is not null");
            return (Criteria) this;
        }

        public Criteria andRpratioEqualTo(Double value) {
            addCriterion("RpRatio =", value, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioNotEqualTo(Double value) {
            addCriterion("RpRatio <>", value, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioGreaterThan(Double value) {
            addCriterion("RpRatio >", value, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioGreaterThanOrEqualTo(Double value) {
            addCriterion("RpRatio >=", value, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioLessThan(Double value) {
            addCriterion("RpRatio <", value, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioLessThanOrEqualTo(Double value) {
            addCriterion("RpRatio <=", value, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioIn(List<Double> values) {
            addCriterion("RpRatio in", values, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioNotIn(List<Double> values) {
            addCriterion("RpRatio not in", values, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioBetween(Double value1, Double value2) {
            addCriterion("RpRatio between", value1, value2, "rpratio");
            return (Criteria) this;
        }

        public Criteria andRpratioNotBetween(Double value1, Double value2) {
            addCriterion("RpRatio not between", value1, value2, "rpratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioIsNull() {
            addCriterion("GreenRatio is null");
            return (Criteria) this;
        }

        public Criteria andGreenratioIsNotNull() {
            addCriterion("GreenRatio is not null");
            return (Criteria) this;
        }

        public Criteria andGreenratioEqualTo(Double value) {
            addCriterion("GreenRatio =", value, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioNotEqualTo(Double value) {
            addCriterion("GreenRatio <>", value, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioGreaterThan(Double value) {
            addCriterion("GreenRatio >", value, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioGreaterThanOrEqualTo(Double value) {
            addCriterion("GreenRatio >=", value, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioLessThan(Double value) {
            addCriterion("GreenRatio <", value, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioLessThanOrEqualTo(Double value) {
            addCriterion("GreenRatio <=", value, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioIn(List<Double> values) {
            addCriterion("GreenRatio in", values, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioNotIn(List<Double> values) {
            addCriterion("GreenRatio not in", values, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioBetween(Double value1, Double value2) {
            addCriterion("GreenRatio between", value1, value2, "greenratio");
            return (Criteria) this;
        }

        public Criteria andGreenratioNotBetween(Double value1, Double value2) {
            addCriterion("GreenRatio not between", value1, value2, "greenratio");
            return (Criteria) this;
        }

        public Criteria andBuildnumIsNull() {
            addCriterion("BuildNum is null");
            return (Criteria) this;
        }

        public Criteria andBuildnumIsNotNull() {
            addCriterion("BuildNum is not null");
            return (Criteria) this;
        }

        public Criteria andBuildnumEqualTo(String value) {
            addCriterion("BuildNum =", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumNotEqualTo(String value) {
            addCriterion("BuildNum <>", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumGreaterThan(String value) {
            addCriterion("BuildNum >", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumGreaterThanOrEqualTo(String value) {
            addCriterion("BuildNum >=", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumLessThan(String value) {
            addCriterion("BuildNum <", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumLessThanOrEqualTo(String value) {
            addCriterion("BuildNum <=", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumLike(String value) {
            addCriterion("BuildNum like", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumNotLike(String value) {
            addCriterion("BuildNum not like", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumIn(List<String> values) {
            addCriterion("BuildNum in", values, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumNotIn(List<String> values) {
            addCriterion("BuildNum not in", values, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumBetween(String value1, String value2) {
            addCriterion("BuildNum between", value1, value2, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumNotBetween(String value1, String value2) {
            addCriterion("BuildNum not between", value1, value2, "buildnum");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("Room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("Room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(Integer value) {
            addCriterion("Room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(Integer value) {
            addCriterion("Room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(Integer value) {
            addCriterion("Room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("Room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(Integer value) {
            addCriterion("Room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(Integer value) {
            addCriterion("Room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<Integer> values) {
            addCriterion("Room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<Integer> values) {
            addCriterion("Room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(Integer value1, Integer value2) {
            addCriterion("Room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(Integer value1, Integer value2) {
            addCriterion("Room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("Url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("Url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("Url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("Url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("Url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("Url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("Url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("Url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("Url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("Url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("Url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("Url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("Url not between", value1, value2, "url");
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