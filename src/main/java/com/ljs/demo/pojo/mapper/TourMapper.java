package com.ljs.demo.pojo.mapper;


import com.ljs.demo.pojo.domain.Tour;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TourMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TOUR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    int deleteByPrimaryKey(Integer tourid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TOUR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    int insert(Tour record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TOUR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    int insertSelective(Tour record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TOUR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    Tour selectByPrimaryKey(Integer tourid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TOUR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    int updateByPrimaryKeySelective(Tour record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TOUR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    int updateByPrimaryKey(Tour record);
}