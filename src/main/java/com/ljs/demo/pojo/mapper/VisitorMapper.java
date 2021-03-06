package com.ljs.demo.pojo.mapper;

import com.ljs.demo.pojo.domain.Visitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VisitorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VISITOR
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    int deleteByPrimaryKey(Integer visitorid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VISITOR
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    int insert(Visitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VISITOR
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    int insertSelective(Visitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VISITOR
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    Visitor selectByPrimaryKey(Integer visitorid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VISITOR
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    int updateByPrimaryKeySelective(Visitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VISITOR
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    int updateByPrimaryKey(@Param("record") Visitor record,@Param("visitorid") Integer visitorid);


    Visitor login(@Param("name") String email , @Param("pass") String password);

    Visitor selectByUid(@Param("uuid") String visitorUid);

    int resetPass(@Param("pass") String newPass,@Param("email") String email);

    List<Visitor> queryVisitor();

    int toBeTour(@Param("uuid") String uuid );


}