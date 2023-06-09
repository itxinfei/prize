package com.pangzhao.prize.commons.db.mapper;

import com.pangzhao.prize.commons.db.entity.ViewGameProductnum;
import com.pangzhao.prize.commons.db.entity.ViewGameProductnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface ViewGameProductnumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_productnum
     *
     * @mbg.generated
     */
    long countByExample(ViewGameProductnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_productnum
     *
     * @mbg.generated
     */
    int deleteByExample(ViewGameProductnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_productnum
     *
     * @mbg.generated
     */
    @Insert({
        "insert into view_game_productnum (gameid, num)",
        "values (#{gameid,jdbcType=INTEGER}, #{num,jdbcType=DECIMAL})"
    })
    int insert(ViewGameProductnum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_productnum
     *
     * @mbg.generated
     */
    int insertSelective(ViewGameProductnum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_productnum
     *
     * @mbg.generated
     */
    List<ViewGameProductnum> selectByExample(ViewGameProductnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_productnum
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewGameProductnum record, @Param("example") ViewGameProductnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_game_productnum
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewGameProductnum record, @Param("example") ViewGameProductnumExample example);
}