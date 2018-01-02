package com.swjtu.WJKeServers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyExample() {
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

        public Criteria andPropertynoIsNull() {
            addCriterion("PropertyNo is null");
            return (Criteria) this;
        }

        public Criteria andPropertynoIsNotNull() {
            addCriterion("PropertyNo is not null");
            return (Criteria) this;
        }

        public Criteria andPropertynoEqualTo(String value) {
            addCriterion("PropertyNo =", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoNotEqualTo(String value) {
            addCriterion("PropertyNo <>", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoGreaterThan(String value) {
            addCriterion("PropertyNo >", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyNo >=", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoLessThan(String value) {
            addCriterion("PropertyNo <", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoLessThanOrEqualTo(String value) {
            addCriterion("PropertyNo <=", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoLike(String value) {
            addCriterion("PropertyNo like", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoNotLike(String value) {
            addCriterion("PropertyNo not like", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoIn(List<String> values) {
            addCriterion("PropertyNo in", values, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoNotIn(List<String> values) {
            addCriterion("PropertyNo not in", values, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoBetween(String value1, String value2) {
            addCriterion("PropertyNo between", value1, value2, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoNotBetween(String value1, String value2) {
            addCriterion("PropertyNo not between", value1, value2, "propertyno");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSquareIsNull() {
            addCriterion("Square is null");
            return (Criteria) this;
        }

        public Criteria andSquareIsNotNull() {
            addCriterion("Square is not null");
            return (Criteria) this;
        }

        public Criteria andSquareEqualTo(Double value) {
            addCriterion("Square =", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotEqualTo(Double value) {
            addCriterion("Square <>", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThan(Double value) {
            addCriterion("Square >", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThanOrEqualTo(Double value) {
            addCriterion("Square >=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThan(Double value) {
            addCriterion("Square <", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThanOrEqualTo(Double value) {
            addCriterion("Square <=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareIn(List<Double> values) {
            addCriterion("Square in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotIn(List<Double> values) {
            addCriterion("Square not in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareBetween(Double value1, Double value2) {
            addCriterion("Square between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotBetween(Double value1, Double value2) {
            addCriterion("Square not between", value1, value2, "square");
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

        public Criteria andPricetypeIsNull() {
            addCriterion("priceType is null");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNotNull() {
            addCriterion("priceType is not null");
            return (Criteria) this;
        }

        public Criteria andPricetypeEqualTo(String value) {
            addCriterion("priceType =", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotEqualTo(String value) {
            addCriterion("priceType <>", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThan(String value) {
            addCriterion("priceType >", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThanOrEqualTo(String value) {
            addCriterion("priceType >=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThan(String value) {
            addCriterion("priceType <", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThanOrEqualTo(String value) {
            addCriterion("priceType <=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLike(String value) {
            addCriterion("priceType like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotLike(String value) {
            addCriterion("priceType not like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeIn(List<String> values) {
            addCriterion("priceType in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotIn(List<String> values) {
            addCriterion("priceType not in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeBetween(String value1, String value2) {
            addCriterion("priceType between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotBetween(String value1, String value2) {
            addCriterion("priceType not between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("UnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("UnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(Double value) {
            addCriterion("UnitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(Double value) {
            addCriterion("UnitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(Double value) {
            addCriterion("UnitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("UnitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(Double value) {
            addCriterion("UnitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(Double value) {
            addCriterion("UnitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<Double> values) {
            addCriterion("UnitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<Double> values) {
            addCriterion("UnitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(Double value1, Double value2) {
            addCriterion("UnitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(Double value1, Double value2) {
            addCriterion("UnitPrice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeIsNull() {
            addCriterion("unitPriceType is null");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeIsNotNull() {
            addCriterion("unitPriceType is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeEqualTo(String value) {
            addCriterion("unitPriceType =", value, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeNotEqualTo(String value) {
            addCriterion("unitPriceType <>", value, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeGreaterThan(String value) {
            addCriterion("unitPriceType >", value, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeGreaterThanOrEqualTo(String value) {
            addCriterion("unitPriceType >=", value, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeLessThan(String value) {
            addCriterion("unitPriceType <", value, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeLessThanOrEqualTo(String value) {
            addCriterion("unitPriceType <=", value, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeLike(String value) {
            addCriterion("unitPriceType like", value, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeNotLike(String value) {
            addCriterion("unitPriceType not like", value, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeIn(List<String> values) {
            addCriterion("unitPriceType in", values, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeNotIn(List<String> values) {
            addCriterion("unitPriceType not in", values, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeBetween(String value1, String value2) {
            addCriterion("unitPriceType between", value1, value2, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andUnitpricetypeNotBetween(String value1, String value2) {
            addCriterion("unitPriceType not between", value1, value2, "unitpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpriceIsNull() {
            addCriterion("rentPrice is null");
            return (Criteria) this;
        }

        public Criteria andRentpriceIsNotNull() {
            addCriterion("rentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRentpriceEqualTo(Double value) {
            addCriterion("rentPrice =", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotEqualTo(Double value) {
            addCriterion("rentPrice <>", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceGreaterThan(Double value) {
            addCriterion("rentPrice >", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("rentPrice >=", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceLessThan(Double value) {
            addCriterion("rentPrice <", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceLessThanOrEqualTo(Double value) {
            addCriterion("rentPrice <=", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceIn(List<Double> values) {
            addCriterion("rentPrice in", values, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotIn(List<Double> values) {
            addCriterion("rentPrice not in", values, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceBetween(Double value1, Double value2) {
            addCriterion("rentPrice between", value1, value2, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotBetween(Double value1, Double value2) {
            addCriterion("rentPrice not between", value1, value2, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeIsNull() {
            addCriterion("rentPriceType is null");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeIsNotNull() {
            addCriterion("rentPriceType is not null");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeEqualTo(String value) {
            addCriterion("rentPriceType =", value, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeNotEqualTo(String value) {
            addCriterion("rentPriceType <>", value, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeGreaterThan(String value) {
            addCriterion("rentPriceType >", value, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeGreaterThanOrEqualTo(String value) {
            addCriterion("rentPriceType >=", value, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeLessThan(String value) {
            addCriterion("rentPriceType <", value, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeLessThanOrEqualTo(String value) {
            addCriterion("rentPriceType <=", value, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeLike(String value) {
            addCriterion("rentPriceType like", value, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeNotLike(String value) {
            addCriterion("rentPriceType not like", value, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeIn(List<String> values) {
            addCriterion("rentPriceType in", values, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeNotIn(List<String> values) {
            addCriterion("rentPriceType not in", values, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeBetween(String value1, String value2) {
            addCriterion("rentPriceType between", value1, value2, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andRentpricetypeNotBetween(String value1, String value2) {
            addCriterion("rentPriceType not between", value1, value2, "rentpricetype");
            return (Criteria) this;
        }

        public Criteria andFirstpayIsNull() {
            addCriterion("firstPay is null");
            return (Criteria) this;
        }

        public Criteria andFirstpayIsNotNull() {
            addCriterion("firstPay is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpayEqualTo(String value) {
            addCriterion("firstPay =", value, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayNotEqualTo(String value) {
            addCriterion("firstPay <>", value, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayGreaterThan(String value) {
            addCriterion("firstPay >", value, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayGreaterThanOrEqualTo(String value) {
            addCriterion("firstPay >=", value, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayLessThan(String value) {
            addCriterion("firstPay <", value, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayLessThanOrEqualTo(String value) {
            addCriterion("firstPay <=", value, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayLike(String value) {
            addCriterion("firstPay like", value, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayNotLike(String value) {
            addCriterion("firstPay not like", value, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayIn(List<String> values) {
            addCriterion("firstPay in", values, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayNotIn(List<String> values) {
            addCriterion("firstPay not in", values, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayBetween(String value1, String value2) {
            addCriterion("firstPay between", value1, value2, "firstpay");
            return (Criteria) this;
        }

        public Criteria andFirstpayNotBetween(String value1, String value2) {
            addCriterion("firstPay not between", value1, value2, "firstpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayIsNull() {
            addCriterion("monthPay is null");
            return (Criteria) this;
        }

        public Criteria andMonthpayIsNotNull() {
            addCriterion("monthPay is not null");
            return (Criteria) this;
        }

        public Criteria andMonthpayEqualTo(String value) {
            addCriterion("monthPay =", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayNotEqualTo(String value) {
            addCriterion("monthPay <>", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayGreaterThan(String value) {
            addCriterion("monthPay >", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayGreaterThanOrEqualTo(String value) {
            addCriterion("monthPay >=", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayLessThan(String value) {
            addCriterion("monthPay <", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayLessThanOrEqualTo(String value) {
            addCriterion("monthPay <=", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayLike(String value) {
            addCriterion("monthPay like", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayNotLike(String value) {
            addCriterion("monthPay not like", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayIn(List<String> values) {
            addCriterion("monthPay in", values, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayNotIn(List<String> values) {
            addCriterion("monthPay not in", values, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayBetween(String value1, String value2) {
            addCriterion("monthPay between", value1, value2, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayNotBetween(String value1, String value2) {
            addCriterion("monthPay not between", value1, value2, "monthpay");
            return (Criteria) this;
        }

        public Criteria andApartmentIsNull() {
            addCriterion("Apartment is null");
            return (Criteria) this;
        }

        public Criteria andApartmentIsNotNull() {
            addCriterion("Apartment is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentEqualTo(String value) {
            addCriterion("Apartment =", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentNotEqualTo(String value) {
            addCriterion("Apartment <>", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentGreaterThan(String value) {
            addCriterion("Apartment >", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentGreaterThanOrEqualTo(String value) {
            addCriterion("Apartment >=", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentLessThan(String value) {
            addCriterion("Apartment <", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentLessThanOrEqualTo(String value) {
            addCriterion("Apartment <=", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentLike(String value) {
            addCriterion("Apartment like", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentNotLike(String value) {
            addCriterion("Apartment not like", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentIn(List<String> values) {
            addCriterion("Apartment in", values, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentNotIn(List<String> values) {
            addCriterion("Apartment not in", values, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentBetween(String value1, String value2) {
            addCriterion("Apartment between", value1, value2, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentNotBetween(String value1, String value2) {
            addCriterion("Apartment not between", value1, value2, "apartment");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionIsNull() {
            addCriterion("PropertyDirection is null");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionIsNotNull() {
            addCriterion("PropertyDirection is not null");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionEqualTo(String value) {
            addCriterion("PropertyDirection =", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionNotEqualTo(String value) {
            addCriterion("PropertyDirection <>", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionGreaterThan(String value) {
            addCriterion("PropertyDirection >", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyDirection >=", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionLessThan(String value) {
            addCriterion("PropertyDirection <", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionLessThanOrEqualTo(String value) {
            addCriterion("PropertyDirection <=", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionLike(String value) {
            addCriterion("PropertyDirection like", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionNotLike(String value) {
            addCriterion("PropertyDirection not like", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionIn(List<String> values) {
            addCriterion("PropertyDirection in", values, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionNotIn(List<String> values) {
            addCriterion("PropertyDirection not in", values, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionBetween(String value1, String value2) {
            addCriterion("PropertyDirection between", value1, value2, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionNotBetween(String value1, String value2) {
            addCriterion("PropertyDirection not between", value1, value2, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("Floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("Floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("Floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("Floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("Floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("Floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("Floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("Floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("Floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("Floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("Floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("Floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNull() {
            addCriterion("propertyType is null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNotNull() {
            addCriterion("propertyType is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeEqualTo(String value) {
            addCriterion("propertyType =", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotEqualTo(String value) {
            addCriterion("propertyType <>", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThan(String value) {
            addCriterion("propertyType >", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThanOrEqualTo(String value) {
            addCriterion("propertyType >=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThan(String value) {
            addCriterion("propertyType <", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThanOrEqualTo(String value) {
            addCriterion("propertyType <=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLike(String value) {
            addCriterion("propertyType like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotLike(String value) {
            addCriterion("propertyType not like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIn(List<String> values) {
            addCriterion("propertyType in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotIn(List<String> values) {
            addCriterion("propertyType not in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeBetween(String value1, String value2) {
            addCriterion("propertyType between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotBetween(String value1, String value2) {
            addCriterion("propertyType not between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytradeIsNull() {
            addCriterion("PropertyTrade is null");
            return (Criteria) this;
        }

        public Criteria andPropertytradeIsNotNull() {
            addCriterion("PropertyTrade is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytradeEqualTo(String value) {
            addCriterion("PropertyTrade =", value, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeNotEqualTo(String value) {
            addCriterion("PropertyTrade <>", value, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeGreaterThan(String value) {
            addCriterion("PropertyTrade >", value, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyTrade >=", value, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeLessThan(String value) {
            addCriterion("PropertyTrade <", value, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeLessThanOrEqualTo(String value) {
            addCriterion("PropertyTrade <=", value, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeLike(String value) {
            addCriterion("PropertyTrade like", value, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeNotLike(String value) {
            addCriterion("PropertyTrade not like", value, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeIn(List<String> values) {
            addCriterion("PropertyTrade in", values, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeNotIn(List<String> values) {
            addCriterion("PropertyTrade not in", values, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeBetween(String value1, String value2) {
            addCriterion("PropertyTrade between", value1, value2, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertytradeNotBetween(String value1, String value2) {
            addCriterion("PropertyTrade not between", value1, value2, "propertytrade");
            return (Criteria) this;
        }

        public Criteria andPropertykeyIsNull() {
            addCriterion("Propertykey is null");
            return (Criteria) this;
        }

        public Criteria andPropertykeyIsNotNull() {
            addCriterion("Propertykey is not null");
            return (Criteria) this;
        }

        public Criteria andPropertykeyEqualTo(Integer value) {
            addCriterion("Propertykey =", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyNotEqualTo(Integer value) {
            addCriterion("Propertykey <>", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyGreaterThan(Integer value) {
            addCriterion("Propertykey >", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Propertykey >=", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyLessThan(Integer value) {
            addCriterion("Propertykey <", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyLessThanOrEqualTo(Integer value) {
            addCriterion("Propertykey <=", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyIn(List<Integer> values) {
            addCriterion("Propertykey in", values, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyNotIn(List<Integer> values) {
            addCriterion("Propertykey not in", values, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyBetween(Integer value1, Integer value2) {
            addCriterion("Propertykey between", value1, value2, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyNotBetween(Integer value1, Integer value2) {
            addCriterion("Propertykey not between", value1, value2, "propertykey");
            return (Criteria) this;
        }

        public Criteria andExclusiveIsNull() {
            addCriterion("Exclusive is null");
            return (Criteria) this;
        }

        public Criteria andExclusiveIsNotNull() {
            addCriterion("Exclusive is not null");
            return (Criteria) this;
        }

        public Criteria andExclusiveEqualTo(Integer value) {
            addCriterion("Exclusive =", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotEqualTo(Integer value) {
            addCriterion("Exclusive <>", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveGreaterThan(Integer value) {
            addCriterion("Exclusive >", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("Exclusive >=", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveLessThan(Integer value) {
            addCriterion("Exclusive <", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveLessThanOrEqualTo(Integer value) {
            addCriterion("Exclusive <=", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveIn(List<Integer> values) {
            addCriterion("Exclusive in", values, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotIn(List<Integer> values) {
            addCriterion("Exclusive not in", values, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveBetween(Integer value1, Integer value2) {
            addCriterion("Exclusive between", value1, value2, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotBetween(Integer value1, Integer value2) {
            addCriterion("Exclusive not between", value1, value2, "exclusive");
            return (Criteria) this;
        }

        public Criteria andDutyfreeIsNull() {
            addCriterion("DutyFree is null");
            return (Criteria) this;
        }

        public Criteria andDutyfreeIsNotNull() {
            addCriterion("DutyFree is not null");
            return (Criteria) this;
        }

        public Criteria andDutyfreeEqualTo(Integer value) {
            addCriterion("DutyFree =", value, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeNotEqualTo(Integer value) {
            addCriterion("DutyFree <>", value, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeGreaterThan(Integer value) {
            addCriterion("DutyFree >", value, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DutyFree >=", value, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeLessThan(Integer value) {
            addCriterion("DutyFree <", value, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeLessThanOrEqualTo(Integer value) {
            addCriterion("DutyFree <=", value, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeIn(List<Integer> values) {
            addCriterion("DutyFree in", values, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeNotIn(List<Integer> values) {
            addCriterion("DutyFree not in", values, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeBetween(Integer value1, Integer value2) {
            addCriterion("DutyFree between", value1, value2, "dutyfree");
            return (Criteria) this;
        }

        public Criteria andDutyfreeNotBetween(Integer value1, Integer value2) {
            addCriterion("DutyFree not between", value1, value2, "dutyfree");
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

        public Criteria andFloorallIsNull() {
            addCriterion("floorAll is null");
            return (Criteria) this;
        }

        public Criteria andFloorallIsNotNull() {
            addCriterion("floorAll is not null");
            return (Criteria) this;
        }

        public Criteria andFloorallEqualTo(Integer value) {
            addCriterion("floorAll =", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallNotEqualTo(Integer value) {
            addCriterion("floorAll <>", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallGreaterThan(Integer value) {
            addCriterion("floorAll >", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallGreaterThanOrEqualTo(Integer value) {
            addCriterion("floorAll >=", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallLessThan(Integer value) {
            addCriterion("floorAll <", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallLessThanOrEqualTo(Integer value) {
            addCriterion("floorAll <=", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallIn(List<Integer> values) {
            addCriterion("floorAll in", values, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallNotIn(List<Integer> values) {
            addCriterion("floorAll not in", values, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallBetween(Integer value1, Integer value2) {
            addCriterion("floorAll between", value1, value2, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallNotBetween(Integer value1, Integer value2) {
            addCriterion("floorAll not between", value1, value2, "floorall");
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

        public Criteria andDecorationIsNull() {
            addCriterion("decoration is null");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNotNull() {
            addCriterion("decoration is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationEqualTo(String value) {
            addCriterion("decoration =", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotEqualTo(String value) {
            addCriterion("decoration <>", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThan(String value) {
            addCriterion("decoration >", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("decoration >=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThan(String value) {
            addCriterion("decoration <", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThanOrEqualTo(String value) {
            addCriterion("decoration <=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLike(String value) {
            addCriterion("decoration like", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotLike(String value) {
            addCriterion("decoration not like", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationIn(List<String> values) {
            addCriterion("decoration in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotIn(List<String> values) {
            addCriterion("decoration not in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationBetween(String value1, String value2) {
            addCriterion("decoration between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotBetween(String value1, String value2) {
            addCriterion("decoration not between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andShowurlIsNull() {
            addCriterion("showUrl is null");
            return (Criteria) this;
        }

        public Criteria andShowurlIsNotNull() {
            addCriterion("showUrl is not null");
            return (Criteria) this;
        }

        public Criteria andShowurlEqualTo(String value) {
            addCriterion("showUrl =", value, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlNotEqualTo(String value) {
            addCriterion("showUrl <>", value, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlGreaterThan(String value) {
            addCriterion("showUrl >", value, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlGreaterThanOrEqualTo(String value) {
            addCriterion("showUrl >=", value, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlLessThan(String value) {
            addCriterion("showUrl <", value, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlLessThanOrEqualTo(String value) {
            addCriterion("showUrl <=", value, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlLike(String value) {
            addCriterion("showUrl like", value, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlNotLike(String value) {
            addCriterion("showUrl not like", value, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlIn(List<String> values) {
            addCriterion("showUrl in", values, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlNotIn(List<String> values) {
            addCriterion("showUrl not in", values, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlBetween(String value1, String value2) {
            addCriterion("showUrl between", value1, value2, "showurl");
            return (Criteria) this;
        }

        public Criteria andShowurlNotBetween(String value1, String value2) {
            addCriterion("showUrl not between", value1, value2, "showurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlIsNull() {
            addCriterion("storeShowUrl is null");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlIsNotNull() {
            addCriterion("storeShowUrl is not null");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlEqualTo(String value) {
            addCriterion("storeShowUrl =", value, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlNotEqualTo(String value) {
            addCriterion("storeShowUrl <>", value, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlGreaterThan(String value) {
            addCriterion("storeShowUrl >", value, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlGreaterThanOrEqualTo(String value) {
            addCriterion("storeShowUrl >=", value, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlLessThan(String value) {
            addCriterion("storeShowUrl <", value, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlLessThanOrEqualTo(String value) {
            addCriterion("storeShowUrl <=", value, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlLike(String value) {
            addCriterion("storeShowUrl like", value, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlNotLike(String value) {
            addCriterion("storeShowUrl not like", value, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlIn(List<String> values) {
            addCriterion("storeShowUrl in", values, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlNotIn(List<String> values) {
            addCriterion("storeShowUrl not in", values, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlBetween(String value1, String value2) {
            addCriterion("storeShowUrl between", value1, value2, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andStoreshowurlNotBetween(String value1, String value2) {
            addCriterion("storeShowUrl not between", value1, value2, "storeshowurl");
            return (Criteria) this;
        }

        public Criteria andFlagwebIsNull() {
            addCriterion("flagWeb is null");
            return (Criteria) this;
        }

        public Criteria andFlagwebIsNotNull() {
            addCriterion("flagWeb is not null");
            return (Criteria) this;
        }

        public Criteria andFlagwebEqualTo(Boolean value) {
            addCriterion("flagWeb =", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebNotEqualTo(Boolean value) {
            addCriterion("flagWeb <>", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebGreaterThan(Boolean value) {
            addCriterion("flagWeb >", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flagWeb >=", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebLessThan(Boolean value) {
            addCriterion("flagWeb <", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebLessThanOrEqualTo(Boolean value) {
            addCriterion("flagWeb <=", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebIn(List<Boolean> values) {
            addCriterion("flagWeb in", values, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebNotIn(List<Boolean> values) {
            addCriterion("flagWeb not in", values, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebBetween(Boolean value1, Boolean value2) {
            addCriterion("flagWeb between", value1, value2, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flagWeb not between", value1, value2, "flagweb");
            return (Criteria) this;
        }

        public Criteria andCoverurlIsNull() {
            addCriterion("CoverUrl is null");
            return (Criteria) this;
        }

        public Criteria andCoverurlIsNotNull() {
            addCriterion("CoverUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCoverurlEqualTo(String value) {
            addCriterion("CoverUrl =", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotEqualTo(String value) {
            addCriterion("CoverUrl <>", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlGreaterThan(String value) {
            addCriterion("CoverUrl >", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlGreaterThanOrEqualTo(String value) {
            addCriterion("CoverUrl >=", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLessThan(String value) {
            addCriterion("CoverUrl <", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLessThanOrEqualTo(String value) {
            addCriterion("CoverUrl <=", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLike(String value) {
            addCriterion("CoverUrl like", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotLike(String value) {
            addCriterion("CoverUrl not like", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlIn(List<String> values) {
            addCriterion("CoverUrl in", values, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotIn(List<String> values) {
            addCriterion("CoverUrl not in", values, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlBetween(String value1, String value2) {
            addCriterion("CoverUrl between", value1, value2, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotBetween(String value1, String value2) {
            addCriterion("CoverUrl not between", value1, value2, "coverurl");
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