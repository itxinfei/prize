package com.pangzhao.prize.commons.db.entity;

import java.io.Serializable;
import java.util.Date;

public class CardUserHit implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_user_hit.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_user_hit.gameid
     *
     * @mbg.generated
     */
    private Integer gameid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_user_hit.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_user_hit.productid
     *
     * @mbg.generated
     */
    private Integer productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_user_hit.hittime
     *
     * @mbg.generated
     */
    private Date hittime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table card_user_hit
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_user_hit.id
     *
     * @return the value of card_user_hit.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_user_hit.id
     *
     * @param id the value for card_user_hit.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_user_hit.gameid
     *
     * @return the value of card_user_hit.gameid
     *
     * @mbg.generated
     */
    public Integer getGameid() {
        return gameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_user_hit.gameid
     *
     * @param gameid the value for card_user_hit.gameid
     *
     * @mbg.generated
     */
    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_user_hit.userid
     *
     * @return the value of card_user_hit.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_user_hit.userid
     *
     * @param userid the value for card_user_hit.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_user_hit.productid
     *
     * @return the value of card_user_hit.productid
     *
     * @mbg.generated
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_user_hit.productid
     *
     * @param productid the value for card_user_hit.productid
     *
     * @mbg.generated
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_user_hit.hittime
     *
     * @return the value of card_user_hit.hittime
     *
     * @mbg.generated
     */
    public Date getHittime() {
        return hittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_user_hit.hittime
     *
     * @param hittime the value for card_user_hit.hittime
     *
     * @mbg.generated
     */
    public void setHittime(Date hittime) {
        this.hittime = hittime;
    }
}