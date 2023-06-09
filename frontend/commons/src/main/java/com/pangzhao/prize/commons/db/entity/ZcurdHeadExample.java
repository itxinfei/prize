package com.pangzhao.prize.commons.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZcurdHeadExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public ZcurdHeadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andFormNameIsNull() {
            addCriterion("form_name is null");
            return (Criteria) this;
        }

        public Criteria andFormNameIsNotNull() {
            addCriterion("form_name is not null");
            return (Criteria) this;
        }

        public Criteria andFormNameEqualTo(String value) {
            addCriterion("form_name =", value, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameNotEqualTo(String value) {
            addCriterion("form_name <>", value, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameGreaterThan(String value) {
            addCriterion("form_name >", value, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameGreaterThanOrEqualTo(String value) {
            addCriterion("form_name >=", value, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameLessThan(String value) {
            addCriterion("form_name <", value, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameLessThanOrEqualTo(String value) {
            addCriterion("form_name <=", value, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameLike(String value) {
            addCriterion("form_name like", value, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameNotLike(String value) {
            addCriterion("form_name not like", value, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameIn(List<String> values) {
            addCriterion("form_name in", values, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameNotIn(List<String> values) {
            addCriterion("form_name not in", values, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameBetween(String value1, String value2) {
            addCriterion("form_name between", value1, value2, "formName");
            return (Criteria) this;
        }

        public Criteria andFormNameNotBetween(String value1, String value2) {
            addCriterion("form_name not between", value1, value2, "formName");
            return (Criteria) this;
        }

        public Criteria andIdFieldIsNull() {
            addCriterion("id_field is null");
            return (Criteria) this;
        }

        public Criteria andIdFieldIsNotNull() {
            addCriterion("id_field is not null");
            return (Criteria) this;
        }

        public Criteria andIdFieldEqualTo(String value) {
            addCriterion("id_field =", value, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldNotEqualTo(String value) {
            addCriterion("id_field <>", value, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldGreaterThan(String value) {
            addCriterion("id_field >", value, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldGreaterThanOrEqualTo(String value) {
            addCriterion("id_field >=", value, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldLessThan(String value) {
            addCriterion("id_field <", value, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldLessThanOrEqualTo(String value) {
            addCriterion("id_field <=", value, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldLike(String value) {
            addCriterion("id_field like", value, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldNotLike(String value) {
            addCriterion("id_field not like", value, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldIn(List<String> values) {
            addCriterion("id_field in", values, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldNotIn(List<String> values) {
            addCriterion("id_field not in", values, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldBetween(String value1, String value2) {
            addCriterion("id_field between", value1, value2, "idField");
            return (Criteria) this;
        }

        public Criteria andIdFieldNotBetween(String value1, String value2) {
            addCriterion("id_field not between", value1, value2, "idField");
            return (Criteria) this;
        }

        public Criteria andIsAutoIsNull() {
            addCriterion("is_auto is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoIsNotNull() {
            addCriterion("is_auto is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoEqualTo(Integer value) {
            addCriterion("is_auto =", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotEqualTo(Integer value) {
            addCriterion("is_auto <>", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoGreaterThan(Integer value) {
            addCriterion("is_auto >", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_auto >=", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLessThan(Integer value) {
            addCriterion("is_auto <", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLessThanOrEqualTo(Integer value) {
            addCriterion("is_auto <=", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoIn(List<Integer> values) {
            addCriterion("is_auto in", values, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotIn(List<Integer> values) {
            addCriterion("is_auto not in", values, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoBetween(Integer value1, Integer value2) {
            addCriterion("is_auto between", value1, value2, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotBetween(Integer value1, Integer value2) {
            addCriterion("is_auto not between", value1, value2, "isAuto");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNull() {
            addCriterion("form_type is null");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNotNull() {
            addCriterion("form_type is not null");
            return (Criteria) this;
        }

        public Criteria andFormTypeEqualTo(Integer value) {
            addCriterion("form_type =", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotEqualTo(Integer value) {
            addCriterion("form_type <>", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThan(Integer value) {
            addCriterion("form_type >", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("form_type >=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThan(Integer value) {
            addCriterion("form_type <", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThanOrEqualTo(Integer value) {
            addCriterion("form_type <=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeIn(List<Integer> values) {
            addCriterion("form_type in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotIn(List<Integer> values) {
            addCriterion("form_type not in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeBetween(Integer value1, Integer value2) {
            addCriterion("form_type between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("form_type not between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andDialogSizeIsNull() {
            addCriterion("dialog_size is null");
            return (Criteria) this;
        }

        public Criteria andDialogSizeIsNotNull() {
            addCriterion("dialog_size is not null");
            return (Criteria) this;
        }

        public Criteria andDialogSizeEqualTo(String value) {
            addCriterion("dialog_size =", value, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeNotEqualTo(String value) {
            addCriterion("dialog_size <>", value, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeGreaterThan(String value) {
            addCriterion("dialog_size >", value, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeGreaterThanOrEqualTo(String value) {
            addCriterion("dialog_size >=", value, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeLessThan(String value) {
            addCriterion("dialog_size <", value, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeLessThanOrEqualTo(String value) {
            addCriterion("dialog_size <=", value, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeLike(String value) {
            addCriterion("dialog_size like", value, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeNotLike(String value) {
            addCriterion("dialog_size not like", value, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeIn(List<String> values) {
            addCriterion("dialog_size in", values, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeNotIn(List<String> values) {
            addCriterion("dialog_size not in", values, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeBetween(String value1, String value2) {
            addCriterion("dialog_size between", value1, value2, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDialogSizeNotBetween(String value1, String value2) {
            addCriterion("dialog_size not between", value1, value2, "dialogSize");
            return (Criteria) this;
        }

        public Criteria andDbSourceIsNull() {
            addCriterion("db_source is null");
            return (Criteria) this;
        }

        public Criteria andDbSourceIsNotNull() {
            addCriterion("db_source is not null");
            return (Criteria) this;
        }

        public Criteria andDbSourceEqualTo(String value) {
            addCriterion("db_source =", value, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceNotEqualTo(String value) {
            addCriterion("db_source <>", value, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceGreaterThan(String value) {
            addCriterion("db_source >", value, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceGreaterThanOrEqualTo(String value) {
            addCriterion("db_source >=", value, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceLessThan(String value) {
            addCriterion("db_source <", value, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceLessThanOrEqualTo(String value) {
            addCriterion("db_source <=", value, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceLike(String value) {
            addCriterion("db_source like", value, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceNotLike(String value) {
            addCriterion("db_source not like", value, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceIn(List<String> values) {
            addCriterion("db_source in", values, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceNotIn(List<String> values) {
            addCriterion("db_source not in", values, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceBetween(String value1, String value2) {
            addCriterion("db_source between", value1, value2, "dbSource");
            return (Criteria) this;
        }

        public Criteria andDbSourceNotBetween(String value1, String value2) {
            addCriterion("db_source not between", value1, value2, "dbSource");
            return (Criteria) this;
        }

        public Criteria andHandleClassIsNull() {
            addCriterion("handle_class is null");
            return (Criteria) this;
        }

        public Criteria andHandleClassIsNotNull() {
            addCriterion("handle_class is not null");
            return (Criteria) this;
        }

        public Criteria andHandleClassEqualTo(String value) {
            addCriterion("handle_class =", value, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassNotEqualTo(String value) {
            addCriterion("handle_class <>", value, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassGreaterThan(String value) {
            addCriterion("handle_class >", value, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassGreaterThanOrEqualTo(String value) {
            addCriterion("handle_class >=", value, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassLessThan(String value) {
            addCriterion("handle_class <", value, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassLessThanOrEqualTo(String value) {
            addCriterion("handle_class <=", value, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassLike(String value) {
            addCriterion("handle_class like", value, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassNotLike(String value) {
            addCriterion("handle_class not like", value, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassIn(List<String> values) {
            addCriterion("handle_class in", values, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassNotIn(List<String> values) {
            addCriterion("handle_class not in", values, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassBetween(String value1, String value2) {
            addCriterion("handle_class between", value1, value2, "handleClass");
            return (Criteria) this;
        }

        public Criteria andHandleClassNotBetween(String value1, String value2) {
            addCriterion("handle_class not between", value1, value2, "handleClass");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldIsNull() {
            addCriterion("delete_flag_field is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldIsNotNull() {
            addCriterion("delete_flag_field is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldEqualTo(String value) {
            addCriterion("delete_flag_field =", value, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldNotEqualTo(String value) {
            addCriterion("delete_flag_field <>", value, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldGreaterThan(String value) {
            addCriterion("delete_flag_field >", value, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldGreaterThanOrEqualTo(String value) {
            addCriterion("delete_flag_field >=", value, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldLessThan(String value) {
            addCriterion("delete_flag_field <", value, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldLessThanOrEqualTo(String value) {
            addCriterion("delete_flag_field <=", value, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldLike(String value) {
            addCriterion("delete_flag_field like", value, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldNotLike(String value) {
            addCriterion("delete_flag_field not like", value, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldIn(List<String> values) {
            addCriterion("delete_flag_field in", values, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldNotIn(List<String> values) {
            addCriterion("delete_flag_field not in", values, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldBetween(String value1, String value2) {
            addCriterion("delete_flag_field between", value1, value2, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagFieldNotBetween(String value1, String value2) {
            addCriterion("delete_flag_field not between", value1, value2, "deleteFlagField");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zcurd_head
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
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