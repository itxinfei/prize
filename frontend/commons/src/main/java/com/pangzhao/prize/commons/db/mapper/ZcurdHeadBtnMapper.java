package com.pangzhao.prize.commons.db.mapper;

import com.pangzhao.prize.commons.db.entity.ZcurdHeadBtn;
import com.pangzhao.prize.commons.db.entity.ZcurdHeadBtnExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ZcurdHeadBtnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    long countByExample(ZcurdHeadBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    int deleteByExample(ZcurdHeadBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    @Delete({
        "delete from zcurd_head_btn",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    @Insert({
        "insert into zcurd_head_btn (head_id, btn_name, ",
        "btn_icon, location, ",
        "action, create_time, ",
        "func_content)",
        "values (#{headId,jdbcType=INTEGER}, #{btnName,jdbcType=VARCHAR}, ",
        "#{btnIcon,jdbcType=VARCHAR}, #{location,jdbcType=INTEGER}, ",
        "#{action,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{funcContent,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ZcurdHeadBtn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    int insertSelective(ZcurdHeadBtn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    List<ZcurdHeadBtn> selectByExampleWithBLOBs(ZcurdHeadBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    List<ZcurdHeadBtn> selectByExample(ZcurdHeadBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, head_id, btn_name, btn_icon, location, action, create_time, func_content",
        "from zcurd_head_btn",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.pangzhao.prize.commons.db.mapper.ZcurdHeadBtnMapper.ResultMapWithBLOBs")
    ZcurdHeadBtn selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ZcurdHeadBtn record, @Param("example") ZcurdHeadBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ZcurdHeadBtn record, @Param("example") ZcurdHeadBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ZcurdHeadBtn record, @Param("example") ZcurdHeadBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ZcurdHeadBtn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    @Update({
        "update zcurd_head_btn",
        "set head_id = #{headId,jdbcType=INTEGER},",
          "btn_name = #{btnName,jdbcType=VARCHAR},",
          "btn_icon = #{btnIcon,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=INTEGER},",
          "action = #{action,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "func_content = #{funcContent,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(ZcurdHeadBtn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head_btn
     *
     * @mbg.generated
     */
    @Update({
        "update zcurd_head_btn",
        "set head_id = #{headId,jdbcType=INTEGER},",
          "btn_name = #{btnName,jdbcType=VARCHAR},",
          "btn_icon = #{btnIcon,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=INTEGER},",
          "action = #{action,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZcurdHeadBtn record);
}