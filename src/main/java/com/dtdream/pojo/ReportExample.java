package com.dtdream.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andReportidIsNull() {
            addCriterion("reportId is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("reportId is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(String value) {
            addCriterion("reportId =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(String value) {
            addCriterion("reportId <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(String value) {
            addCriterion("reportId >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(String value) {
            addCriterion("reportId >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(String value) {
            addCriterion("reportId <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(String value) {
            addCriterion("reportId <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLike(String value) {
            addCriterion("reportId like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotLike(String value) {
            addCriterion("reportId not like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<String> values) {
            addCriterion("reportId in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<String> values) {
            addCriterion("reportId not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(String value1, String value2) {
            addCriterion("reportId between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(String value1, String value2) {
            addCriterion("reportId not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andConformityIsNull() {
            addCriterion("conformity is null");
            return (Criteria) this;
        }

        public Criteria andConformityIsNotNull() {
            addCriterion("conformity is not null");
            return (Criteria) this;
        }

        public Criteria andConformityEqualTo(String value) {
            addCriterion("conformity =", value, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityNotEqualTo(String value) {
            addCriterion("conformity <>", value, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityGreaterThan(String value) {
            addCriterion("conformity >", value, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityGreaterThanOrEqualTo(String value) {
            addCriterion("conformity >=", value, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityLessThan(String value) {
            addCriterion("conformity <", value, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityLessThanOrEqualTo(String value) {
            addCriterion("conformity <=", value, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityLike(String value) {
            addCriterion("conformity like", value, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityNotLike(String value) {
            addCriterion("conformity not like", value, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityIn(List<String> values) {
            addCriterion("conformity in", values, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityNotIn(List<String> values) {
            addCriterion("conformity not in", values, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityBetween(String value1, String value2) {
            addCriterion("conformity between", value1, value2, "conformity");
            return (Criteria) this;
        }

        public Criteria andConformityNotBetween(String value1, String value2) {
            addCriterion("conformity not between", value1, value2, "conformity");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusIsNull() {
            addCriterion("report_del_status is null");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusIsNotNull() {
            addCriterion("report_del_status is not null");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusEqualTo(Integer value) {
            addCriterion("report_del_status =", value, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusNotEqualTo(Integer value) {
            addCriterion("report_del_status <>", value, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusGreaterThan(Integer value) {
            addCriterion("report_del_status >", value, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_del_status >=", value, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusLessThan(Integer value) {
            addCriterion("report_del_status <", value, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("report_del_status <=", value, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusIn(List<Integer> values) {
            addCriterion("report_del_status in", values, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusNotIn(List<Integer> values) {
            addCriterion("report_del_status not in", values, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusBetween(Integer value1, Integer value2) {
            addCriterion("report_del_status between", value1, value2, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andReportDelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("report_del_status not between", value1, value2, "reportDelStatus");
            return (Criteria) this;
        }

        public Criteria andDate2IsNull() {
            addCriterion("DATE2 is null");
            return (Criteria) this;
        }

        public Criteria andDate2IsNotNull() {
            addCriterion("DATE2 is not null");
            return (Criteria) this;
        }

        public Criteria andDate2EqualTo(Date value) {
            addCriterionForJDBCDate("DATE2 =", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE2 <>", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2GreaterThan(Date value) {
            addCriterionForJDBCDate("DATE2 >", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE2 >=", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2LessThan(Date value) {
            addCriterionForJDBCDate("DATE2 <", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE2 <=", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2In(List<Date> values) {
            addCriterionForJDBCDate("DATE2 in", values, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE2 not in", values, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE2 between", value1, value2, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE2 not between", value1, value2, "date2");
            return (Criteria) this;
        }

        public Criteria andDate1IsNull() {
            addCriterion("DATE1 is null");
            return (Criteria) this;
        }

        public Criteria andDate1IsNotNull() {
            addCriterion("DATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andDate1EqualTo(Date value) {
            addCriterionForJDBCDate("DATE1 =", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE1 <>", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThan(Date value) {
            addCriterionForJDBCDate("DATE1 >", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE1 >=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThan(Date value) {
            addCriterionForJDBCDate("DATE1 <", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE1 <=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1In(List<Date> values) {
            addCriterionForJDBCDate("DATE1 in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE1 not in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE1 between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE1 not between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andBz3IsNull() {
            addCriterion("BZ3 is null");
            return (Criteria) this;
        }

        public Criteria andBz3IsNotNull() {
            addCriterion("BZ3 is not null");
            return (Criteria) this;
        }

        public Criteria andBz3EqualTo(String value) {
            addCriterion("BZ3 =", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotEqualTo(String value) {
            addCriterion("BZ3 <>", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThan(String value) {
            addCriterion("BZ3 >", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThanOrEqualTo(String value) {
            addCriterion("BZ3 >=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThan(String value) {
            addCriterion("BZ3 <", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThanOrEqualTo(String value) {
            addCriterion("BZ3 <=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Like(String value) {
            addCriterion("BZ3 like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotLike(String value) {
            addCriterion("BZ3 not like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3In(List<String> values) {
            addCriterion("BZ3 in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotIn(List<String> values) {
            addCriterion("BZ3 not in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Between(String value1, String value2) {
            addCriterion("BZ3 between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotBetween(String value1, String value2) {
            addCriterion("BZ3 not between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz2IsNull() {
            addCriterion("BZ2 is null");
            return (Criteria) this;
        }

        public Criteria andBz2IsNotNull() {
            addCriterion("BZ2 is not null");
            return (Criteria) this;
        }

        public Criteria andBz2EqualTo(String value) {
            addCriterion("BZ2 =", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotEqualTo(String value) {
            addCriterion("BZ2 <>", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThan(String value) {
            addCriterion("BZ2 >", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThanOrEqualTo(String value) {
            addCriterion("BZ2 >=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThan(String value) {
            addCriterion("BZ2 <", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThanOrEqualTo(String value) {
            addCriterion("BZ2 <=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Like(String value) {
            addCriterion("BZ2 like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotLike(String value) {
            addCriterion("BZ2 not like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2In(List<String> values) {
            addCriterion("BZ2 in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotIn(List<String> values) {
            addCriterion("BZ2 not in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Between(String value1, String value2) {
            addCriterion("BZ2 between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotBetween(String value1, String value2) {
            addCriterion("BZ2 not between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz1IsNull() {
            addCriterion("BZ1 is null");
            return (Criteria) this;
        }

        public Criteria andBz1IsNotNull() {
            addCriterion("BZ1 is not null");
            return (Criteria) this;
        }

        public Criteria andBz1EqualTo(String value) {
            addCriterion("BZ1 =", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotEqualTo(String value) {
            addCriterion("BZ1 <>", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThan(String value) {
            addCriterion("BZ1 >", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThanOrEqualTo(String value) {
            addCriterion("BZ1 >=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThan(String value) {
            addCriterion("BZ1 <", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThanOrEqualTo(String value) {
            addCriterion("BZ1 <=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Like(String value) {
            addCriterion("BZ1 like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotLike(String value) {
            addCriterion("BZ1 not like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1In(List<String> values) {
            addCriterion("BZ1 in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotIn(List<String> values) {
            addCriterion("BZ1 not in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Between(String value1, String value2) {
            addCriterion("BZ1 between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotBetween(String value1, String value2) {
            addCriterion("BZ1 not between", value1, value2, "bz1");
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