package com.ljs.demo.pojo.mapper;


import com.ljs.demo.pojo.domain.Cityinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITYINFO
     *
     * @mbggenerated Fri May 25 00:11:02 CST 2018
     */
    int deleteByPrimaryKey(Integer cityinfoid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITYINFO
     *
     * @mbggenerated Fri May 25 00:11:02 CST 2018
     */
    int insert(Cityinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITYINFO
     *
     * @mbggenerated Fri May 25 00:11:02 CST 2018
     */
    int insertSelective(Cityinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITYINFO
     *
     * @mbggenerated Fri May 25 00:11:02 CST 2018
     */
    Cityinfo selectByPrimaryKey(Integer cityinfoid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITYINFO
     *
     * @mbggenerated Fri May 25 00:11:02 CST 2018
     */
    int updateByPrimaryKeySelective(Cityinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITYINFO
     *
     * @mbggenerated Fri May 25 00:11:02 CST 2018
     */
    int updateByPrimaryKey(Cityinfo record);

    Cityinfo queryByName(@Param("likeName") String cityname);

    List<Cityinfo> queryHotCity();

    List<Cityinfo> queryCity();

    String queryProvince(@Param("cityname")String cityname);

    String queryArea(@Param("province") String province);

    int deleteCity(@Param("id") Integer id);

}