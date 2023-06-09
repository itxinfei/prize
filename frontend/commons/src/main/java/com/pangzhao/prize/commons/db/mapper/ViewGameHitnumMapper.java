package com.pangzhao.prize.commons.db.mapper;

import com.pangzhao.prize.commons.db.entity.ViewGameHitnum;
import com.pangzhao.prize.commons.db.entity.ViewGameHitnumExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface ViewGameHitnumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_hitnum
     *
     * @mbg.generated
     */
    long countByExample(ViewGameHitnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_hitnum
     *
     * @mbg.generated
     */
    int deleteByExample(ViewGameHitnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_hitnum
     *
     * @mbg.generated
     */
    @Insert({
        "insert into view_game_hitnum (gameid, num)",
        "values (#{gameid,jdbcType=INTEGER}, #{num,jdbcType=BIGINT})"
    })
    int insert(ViewGameHitnum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_hitnum
     *
     * @mbg.generated
     */
    int insertSelective(ViewGameHitnum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_hitnum
     *
     * @mbg.generated
     */
    List<ViewGameHitnum> selectByExample(ViewGameHitnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_hitnum
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewGameHitnum record, @Param("example") ViewGameHitnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_hitnum
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewGameHitnum record, @Param("example") ViewGameHitnumExample example);
}