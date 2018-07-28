package com.dtdream.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LineDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineDetailsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNull() {
            addCriterion("line_name is null");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNotNull() {
            addCriterion("line_name is not null");
            return (Criteria) this;
        }

        public Criteria andLineNameEqualTo(String value) {
            addCriterion("line_name =", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotEqualTo(String value) {
            addCriterion("line_name <>", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThan(String value) {
            addCriterion("line_name >", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("line_name >=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThan(String value) {
            addCriterion("line_name <", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThanOrEqualTo(String value) {
            addCriterion("line_name <=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLike(String value) {
            addCriterion("line_name like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotLike(String value) {
            addCriterion("line_name not like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameIn(List<String> values) {
            addCriterion("line_name in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotIn(List<String> values) {
            addCriterion("line_name not in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameBetween(String value1, String value2) {
            addCriterion("line_name between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotBetween(String value1, String value2) {
            addCriterion("line_name not between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(String value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(String value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(String value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(String value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(String value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(String value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLike(String value) {
            addCriterion("line_id like", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotLike(String value) {
            addCriterion("line_id not like", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<String> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<String> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(String value1, String value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(String value1, String value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andTowerNameIsNull() {
            addCriterion("tower_name is null");
            return (Criteria) this;
        }

        public Criteria andTowerNameIsNotNull() {
            addCriterion("tower_name is not null");
            return (Criteria) this;
        }

        public Criteria andTowerNameEqualTo(String value) {
            addCriterion("tower_name =", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameNotEqualTo(String value) {
            addCriterion("tower_name <>", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameGreaterThan(String value) {
            addCriterion("tower_name >", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("tower_name >=", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameLessThan(String value) {
            addCriterion("tower_name <", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameLessThanOrEqualTo(String value) {
            addCriterion("tower_name <=", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameLike(String value) {
            addCriterion("tower_name like", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameNotLike(String value) {
            addCriterion("tower_name not like", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameIn(List<String> values) {
            addCriterion("tower_name in", values, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameNotIn(List<String> values) {
            addCriterion("tower_name not in", values, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameBetween(String value1, String value2) {
            addCriterion("tower_name between", value1, value2, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameNotBetween(String value1, String value2) {
            addCriterion("tower_name not between", value1, value2, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerIdIsNull() {
            addCriterion("tower_id is null");
            return (Criteria) this;
        }

        public Criteria andTowerIdIsNotNull() {
            addCriterion("tower_id is not null");
            return (Criteria) this;
        }

        public Criteria andTowerIdEqualTo(String value) {
            addCriterion("tower_id =", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotEqualTo(String value) {
            addCriterion("tower_id <>", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdGreaterThan(String value) {
            addCriterion("tower_id >", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("tower_id >=", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLessThan(String value) {
            addCriterion("tower_id <", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLessThanOrEqualTo(String value) {
            addCriterion("tower_id <=", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLike(String value) {
            addCriterion("tower_id like", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotLike(String value) {
            addCriterion("tower_id not like", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdIn(List<String> values) {
            addCriterion("tower_id in", values, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotIn(List<String> values) {
            addCriterion("tower_id not in", values, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdBetween(String value1, String value2) {
            addCriterion("tower_id between", value1, value2, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotBetween(String value1, String value2) {
            addCriterion("tower_id not between", value1, value2, "towerId");
            return (Criteria) this;
        }

        public Criteria andParentregionIsNull() {
            addCriterion("parentregion is null");
            return (Criteria) this;
        }

        public Criteria andParentregionIsNotNull() {
            addCriterion("parentregion is not null");
            return (Criteria) this;
        }

        public Criteria andParentregionEqualTo(String value) {
            addCriterion("parentregion =", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionNotEqualTo(String value) {
            addCriterion("parentregion <>", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionGreaterThan(String value) {
            addCriterion("parentregion >", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionGreaterThanOrEqualTo(String value) {
            addCriterion("parentregion >=", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionLessThan(String value) {
            addCriterion("parentregion <", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionLessThanOrEqualTo(String value) {
            addCriterion("parentregion <=", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionLike(String value) {
            addCriterion("parentregion like", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionNotLike(String value) {
            addCriterion("parentregion not like", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionIn(List<String> values) {
            addCriterion("parentregion in", values, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionNotIn(List<String> values) {
            addCriterion("parentregion not in", values, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionBetween(String value1, String value2) {
            addCriterion("parentregion between", value1, value2, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionNotBetween(String value1, String value2) {
            addCriterion("parentregion not between", value1, value2, "parentregion");
            return (Criteria) this;
        }

        public Criteria andWhdjIsNull() {
            addCriterion("whdj is null");
            return (Criteria) this;
        }

        public Criteria andWhdjIsNotNull() {
            addCriterion("whdj is not null");
            return (Criteria) this;
        }

        public Criteria andWhdjEqualTo(String value) {
            addCriterion("whdj =", value, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjNotEqualTo(String value) {
            addCriterion("whdj <>", value, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjGreaterThan(String value) {
            addCriterion("whdj >", value, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjGreaterThanOrEqualTo(String value) {
            addCriterion("whdj >=", value, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjLessThan(String value) {
            addCriterion("whdj <", value, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjLessThanOrEqualTo(String value) {
            addCriterion("whdj <=", value, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjLike(String value) {
            addCriterion("whdj like", value, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjNotLike(String value) {
            addCriterion("whdj not like", value, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjIn(List<String> values) {
            addCriterion("whdj in", values, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjNotIn(List<String> values) {
            addCriterion("whdj not in", values, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjBetween(String value1, String value2) {
            addCriterion("whdj between", value1, value2, "whdj");
            return (Criteria) this;
        }

        public Criteria andWhdjNotBetween(String value1, String value2) {
            addCriterion("whdj not between", value1, value2, "whdj");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceIsNull() {
            addCriterion("insulation_creep_distance is null");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceIsNotNull() {
            addCriterion("insulation_creep_distance is not null");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceEqualTo(Integer value) {
            addCriterion("insulation_creep_distance =", value, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceNotEqualTo(Integer value) {
            addCriterion("insulation_creep_distance <>", value, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceGreaterThan(Integer value) {
            addCriterion("insulation_creep_distance >", value, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("insulation_creep_distance >=", value, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceLessThan(Integer value) {
            addCriterion("insulation_creep_distance <", value, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("insulation_creep_distance <=", value, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceIn(List<Integer> values) {
            addCriterion("insulation_creep_distance in", values, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceNotIn(List<Integer> values) {
            addCriterion("insulation_creep_distance not in", values, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceBetween(Integer value1, Integer value2) {
            addCriterion("insulation_creep_distance between", value1, value2, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationCreepDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("insulation_creep_distance not between", value1, value2, "insulationCreepDistance");
            return (Criteria) this;
        }

        public Criteria andInsulationTonIsNull() {
            addCriterion("insulation_ton is null");
            return (Criteria) this;
        }

        public Criteria andInsulationTonIsNotNull() {
            addCriterion("insulation_ton is not null");
            return (Criteria) this;
        }

        public Criteria andInsulationTonEqualTo(Integer value) {
            addCriterion("insulation_ton =", value, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonNotEqualTo(Integer value) {
            addCriterion("insulation_ton <>", value, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonGreaterThan(Integer value) {
            addCriterion("insulation_ton >", value, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonGreaterThanOrEqualTo(Integer value) {
            addCriterion("insulation_ton >=", value, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonLessThan(Integer value) {
            addCriterion("insulation_ton <", value, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonLessThanOrEqualTo(Integer value) {
            addCriterion("insulation_ton <=", value, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonIn(List<Integer> values) {
            addCriterion("insulation_ton in", values, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonNotIn(List<Integer> values) {
            addCriterion("insulation_ton not in", values, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonBetween(Integer value1, Integer value2) {
            addCriterion("insulation_ton between", value1, value2, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationTonNotBetween(Integer value1, Integer value2) {
            addCriterion("insulation_ton not between", value1, value2, "insulationTon");
            return (Criteria) this;
        }

        public Criteria andInsulationHighIsNull() {
            addCriterion("insulation_high is null");
            return (Criteria) this;
        }

        public Criteria andInsulationHighIsNotNull() {
            addCriterion("insulation_high is not null");
            return (Criteria) this;
        }

        public Criteria andInsulationHighEqualTo(Integer value) {
            addCriterion("insulation_high =", value, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighNotEqualTo(Integer value) {
            addCriterion("insulation_high <>", value, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighGreaterThan(Integer value) {
            addCriterion("insulation_high >", value, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighGreaterThanOrEqualTo(Integer value) {
            addCriterion("insulation_high >=", value, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighLessThan(Integer value) {
            addCriterion("insulation_high <", value, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighLessThanOrEqualTo(Integer value) {
            addCriterion("insulation_high <=", value, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighIn(List<Integer> values) {
            addCriterion("insulation_high in", values, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighNotIn(List<Integer> values) {
            addCriterion("insulation_high not in", values, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighBetween(Integer value1, Integer value2) {
            addCriterion("insulation_high between", value1, value2, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationHighNotBetween(Integer value1, Integer value2) {
            addCriterion("insulation_high not between", value1, value2, "insulationHigh");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumIsNull() {
            addCriterion("insulation_bunch_num is null");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumIsNotNull() {
            addCriterion("insulation_bunch_num is not null");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumEqualTo(Integer value) {
            addCriterion("insulation_bunch_num =", value, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumNotEqualTo(Integer value) {
            addCriterion("insulation_bunch_num <>", value, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumGreaterThan(Integer value) {
            addCriterion("insulation_bunch_num >", value, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("insulation_bunch_num >=", value, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumLessThan(Integer value) {
            addCriterion("insulation_bunch_num <", value, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumLessThanOrEqualTo(Integer value) {
            addCriterion("insulation_bunch_num <=", value, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumIn(List<Integer> values) {
            addCriterion("insulation_bunch_num in", values, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumNotIn(List<Integer> values) {
            addCriterion("insulation_bunch_num not in", values, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumBetween(Integer value1, Integer value2) {
            addCriterion("insulation_bunch_num between", value1, value2, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andInsulationBunchNumNotBetween(Integer value1, Integer value2) {
            addCriterion("insulation_bunch_num not between", value1, value2, "insulationBunchNum");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueIsNull() {
            addCriterion("resistance_design_value is null");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueIsNotNull() {
            addCriterion("resistance_design_value is not null");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueEqualTo(Integer value) {
            addCriterion("resistance_design_value =", value, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueNotEqualTo(Integer value) {
            addCriterion("resistance_design_value <>", value, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueGreaterThan(Integer value) {
            addCriterion("resistance_design_value >", value, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("resistance_design_value >=", value, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueLessThan(Integer value) {
            addCriterion("resistance_design_value <", value, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueLessThanOrEqualTo(Integer value) {
            addCriterion("resistance_design_value <=", value, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueIn(List<Integer> values) {
            addCriterion("resistance_design_value in", values, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueNotIn(List<Integer> values) {
            addCriterion("resistance_design_value not in", values, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueBetween(Integer value1, Integer value2) {
            addCriterion("resistance_design_value between", value1, value2, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andResistanceDesignValueNotBetween(Integer value1, Integer value2) {
            addCriterion("resistance_design_value not between", value1, value2, "resistanceDesignValue");
            return (Criteria) this;
        }

        public Criteria andStationmap1IsNull() {
            addCriterion("stationmap_1 is null");
            return (Criteria) this;
        }

        public Criteria andStationmap1IsNotNull() {
            addCriterion("stationmap_1 is not null");
            return (Criteria) this;
        }

        public Criteria andStationmap1EqualTo(Float value) {
            addCriterion("stationmap_1 =", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1NotEqualTo(Float value) {
            addCriterion("stationmap_1 <>", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1GreaterThan(Float value) {
            addCriterion("stationmap_1 >", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1GreaterThanOrEqualTo(Float value) {
            addCriterion("stationmap_1 >=", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1LessThan(Float value) {
            addCriterion("stationmap_1 <", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1LessThanOrEqualTo(Float value) {
            addCriterion("stationmap_1 <=", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1In(List<Float> values) {
            addCriterion("stationmap_1 in", values, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1NotIn(List<Float> values) {
            addCriterion("stationmap_1 not in", values, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1Between(Float value1, Float value2) {
            addCriterion("stationmap_1 between", value1, value2, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1NotBetween(Float value1, Float value2) {
            addCriterion("stationmap_1 not between", value1, value2, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap2IsNull() {
            addCriterion("stationmap_2 is null");
            return (Criteria) this;
        }

        public Criteria andStationmap2IsNotNull() {
            addCriterion("stationmap_2 is not null");
            return (Criteria) this;
        }

        public Criteria andStationmap2EqualTo(Float value) {
            addCriterion("stationmap_2 =", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2NotEqualTo(Float value) {
            addCriterion("stationmap_2 <>", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2GreaterThan(Float value) {
            addCriterion("stationmap_2 >", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2GreaterThanOrEqualTo(Float value) {
            addCriterion("stationmap_2 >=", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2LessThan(Float value) {
            addCriterion("stationmap_2 <", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2LessThanOrEqualTo(Float value) {
            addCriterion("stationmap_2 <=", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2In(List<Float> values) {
            addCriterion("stationmap_2 in", values, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2NotIn(List<Float> values) {
            addCriterion("stationmap_2 not in", values, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2Between(Float value1, Float value2) {
            addCriterion("stationmap_2 between", value1, value2, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2NotBetween(Float value1, Float value2) {
            addCriterion("stationmap_2 not between", value1, value2, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNull() {
            addCriterion("voltage is null");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNotNull() {
            addCriterion("voltage is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageEqualTo(String value) {
            addCriterion("voltage =", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotEqualTo(String value) {
            addCriterion("voltage <>", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThan(String value) {
            addCriterion("voltage >", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThanOrEqualTo(String value) {
            addCriterion("voltage >=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThan(String value) {
            addCriterion("voltage <", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThanOrEqualTo(String value) {
            addCriterion("voltage <=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLike(String value) {
            addCriterion("voltage like", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotLike(String value) {
            addCriterion("voltage not like", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageIn(List<String> values) {
            addCriterion("voltage in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotIn(List<String> values) {
            addCriterion("voltage not in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageBetween(String value1, String value2) {
            addCriterion("voltage between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotBetween(String value1, String value2) {
            addCriterion("voltage not between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andLineLengthIsNull() {
            addCriterion("line_length is null");
            return (Criteria) this;
        }

        public Criteria andLineLengthIsNotNull() {
            addCriterion("line_length is not null");
            return (Criteria) this;
        }

        public Criteria andLineLengthEqualTo(Float value) {
            addCriterion("line_length =", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthNotEqualTo(Float value) {
            addCriterion("line_length <>", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthGreaterThan(Float value) {
            addCriterion("line_length >", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("line_length >=", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthLessThan(Float value) {
            addCriterion("line_length <", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthLessThanOrEqualTo(Float value) {
            addCriterion("line_length <=", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthIn(List<Float> values) {
            addCriterion("line_length in", values, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthNotIn(List<Float> values) {
            addCriterion("line_length not in", values, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthBetween(Float value1, Float value2) {
            addCriterion("line_length between", value1, value2, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthNotBetween(Float value1, Float value2) {
            addCriterion("line_length not between", value1, value2, "lineLength");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNull() {
            addCriterion("maintainer is null");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNotNull() {
            addCriterion("maintainer is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainerEqualTo(String value) {
            addCriterion("maintainer =", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotEqualTo(String value) {
            addCriterion("maintainer <>", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThan(String value) {
            addCriterion("maintainer >", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThanOrEqualTo(String value) {
            addCriterion("maintainer >=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThan(String value) {
            addCriterion("maintainer <", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThanOrEqualTo(String value) {
            addCriterion("maintainer <=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLike(String value) {
            addCriterion("maintainer like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotLike(String value) {
            addCriterion("maintainer not like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerIn(List<String> values) {
            addCriterion("maintainer in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotIn(List<String> values) {
            addCriterion("maintainer not in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerBetween(String value1, String value2) {
            addCriterion("maintainer between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotBetween(String value1, String value2) {
            addCriterion("maintainer not between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusIsNull() {
            addCriterion("line_del_status is null");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusIsNotNull() {
            addCriterion("line_del_status is not null");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusEqualTo(Integer value) {
            addCriterion("line_del_status =", value, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusNotEqualTo(Integer value) {
            addCriterion("line_del_status <>", value, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusGreaterThan(Integer value) {
            addCriterion("line_del_status >", value, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_del_status >=", value, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusLessThan(Integer value) {
            addCriterion("line_del_status <", value, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("line_del_status <=", value, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusIn(List<Integer> values) {
            addCriterion("line_del_status in", values, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusNotIn(List<Integer> values) {
            addCriterion("line_del_status not in", values, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusBetween(Integer value1, Integer value2) {
            addCriterion("line_del_status between", value1, value2, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andLineDelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("line_del_status not between", value1, value2, "lineDelStatus");
            return (Criteria) this;
        }

        public Criteria andDileiIsNull() {
            addCriterion("dilei is null");
            return (Criteria) this;
        }

        public Criteria andDileiIsNotNull() {
            addCriterion("dilei is not null");
            return (Criteria) this;
        }

        public Criteria andDileiEqualTo(String value) {
            addCriterion("dilei =", value, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiNotEqualTo(String value) {
            addCriterion("dilei <>", value, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiGreaterThan(String value) {
            addCriterion("dilei >", value, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiGreaterThanOrEqualTo(String value) {
            addCriterion("dilei >=", value, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiLessThan(String value) {
            addCriterion("dilei <", value, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiLessThanOrEqualTo(String value) {
            addCriterion("dilei <=", value, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiLike(String value) {
            addCriterion("dilei like", value, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiNotLike(String value) {
            addCriterion("dilei not like", value, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiIn(List<String> values) {
            addCriterion("dilei in", values, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiNotIn(List<String> values) {
            addCriterion("dilei not in", values, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiBetween(String value1, String value2) {
            addCriterion("dilei between", value1, value2, "dilei");
            return (Criteria) this;
        }

        public Criteria andDileiNotBetween(String value1, String value2) {
            addCriterion("dilei not between", value1, value2, "dilei");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthIsNull() {
            addCriterion("datetime_month is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthIsNotNull() {
            addCriterion("datetime_month is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthEqualTo(Integer value) {
            addCriterion("datetime_month =", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthNotEqualTo(Integer value) {
            addCriterion("datetime_month <>", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthGreaterThan(Integer value) {
            addCriterion("datetime_month >", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("datetime_month >=", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthLessThan(Integer value) {
            addCriterion("datetime_month <", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthLessThanOrEqualTo(Integer value) {
            addCriterion("datetime_month <=", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthIn(List<Integer> values) {
            addCriterion("datetime_month in", values, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthNotIn(List<Integer> values) {
            addCriterion("datetime_month not in", values, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthBetween(Integer value1, Integer value2) {
            addCriterion("datetime_month between", value1, value2, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("datetime_month not between", value1, value2, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("datetime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("datetime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("datetime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("datetime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datetime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterionForJDBCDate("datetime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datetime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("datetime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("datetime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datetime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datetime not between", value1, value2, "datetime");
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