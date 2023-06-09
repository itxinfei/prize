package com.pangzhao.prize.commons.db.entity;

import java.io.Serializable;
import java.util.Date;

public class ZcurdHeadBtn implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zcurd_head_btn.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zcurd_head_btn.head_id
     *
     * @mbg.generated
     */
    private Integer headId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zcurd_head_btn.btn_name
     *
     * @mbg.generated
     */
    private String btnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zcurd_head_btn.btn_icon
     *
     * @mbg.generated
     */
    private String btnIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zcurd_head_btn.location
     *
     * @mbg.generated
     */
    private Integer location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zcurd_head_btn.action
     *
     * @mbg.generated
     */
    private Integer action;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zcurd_head_btn.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zcurd_head_btn.func_content
     *
     * @mbg.generated
     */
    private String funcContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zcurd_head_btn.id
     *
     * @return the value of zcurd_head_btn.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zcurd_head_btn.id
     *
     * @param id the value for zcurd_head_btn.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zcurd_head_btn.head_id
     *
     * @return the value of zcurd_head_btn.head_id
     *
     * @mbg.generated
     */
    public Integer getHeadId() {
        return headId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zcurd_head_btn.head_id
     *
     * @param headId the value for zcurd_head_btn.head_id
     *
     * @mbg.generated
     */
    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zcurd_head_btn.btn_name
     *
     * @return the value of zcurd_head_btn.btn_name
     *
     * @mbg.generated
     */
    public String getBtnName() {
        return btnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zcurd_head_btn.btn_name
     *
     * @param btnName the value for zcurd_head_btn.btn_name
     *
     * @mbg.generated
     */
    public void setBtnName(String btnName) {
        this.btnName = btnName == null ? null : btnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zcurd_head_btn.btn_icon
     *
     * @return the value of zcurd_head_btn.btn_icon
     *
     * @mbg.generated
     */
    public String getBtnIcon() {
        return btnIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zcurd_head_btn.btn_icon
     *
     * @param btnIcon the value for zcurd_head_btn.btn_icon
     *
     * @mbg.generated
     */
    public void setBtnIcon(String btnIcon) {
        this.btnIcon = btnIcon == null ? null : btnIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zcurd_head_btn.location
     *
     * @return the value of zcurd_head_btn.location
     *
     * @mbg.generated
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zcurd_head_btn.location
     *
     * @param location the value for zcurd_head_btn.location
     *
     * @mbg.generated
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zcurd_head_btn.action
     *
     * @return the value of zcurd_head_btn.action
     *
     * @mbg.generated
     */
    public Integer getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zcurd_head_btn.action
     *
     * @param action the value for zcurd_head_btn.action
     *
     * @mbg.generated
     */
    public void setAction(Integer action) {
        this.action = action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zcurd_head_btn.create_time
     *
     * @return the value of zcurd_head_btn.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zcurd_head_btn.create_time
     *
     * @param createTime the value for zcurd_head_btn.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zcurd_head_btn.func_content
     *
     * @return the value of zcurd_head_btn.func_content
     *
     * @mbg.generated
     */
    public String getFuncContent() {
        return funcContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zcurd_head_btn.func_content
     *
     * @param funcContent the value for zcurd_head_btn.func_content
     *
     * @mbg.generated
     */
    public void setFuncContent(String funcContent) {
        this.funcContent = funcContent == null ? null : funcContent.trim();
    }
}