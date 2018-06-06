package com.ljs.demo.pojo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tour implements Serializable {

    private static final long serialVersionUID = -6970675031171558256L;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.TOURID
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private Integer tourid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.UUID
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.VISITORID
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String visitorid;//用户表visitor UUID

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.CITYINFOID
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String cityinfoid;//城市信息表UUID

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.REALNAME
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String realname;//真实姓名（身份证）

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.BIRTHDAY
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.LAUGUAGE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String lauguage;//擅长语言

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.CITY
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String city;//所在城市

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.CITYSERVICE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String cityservice;//服务城市

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.STAYYEAR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String stayyear;//停留年数

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.OWNCAR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String owncar;//是否有车

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.PHONE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.QQ
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.WECHAT
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String wechat;//微信

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.EMAIL
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.IDPHOTO
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String idphoto;//身份证照片

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.SCULPTURE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String sculpture;//头像

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.STATUS
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String status;//状态 0 待审核 1 导游  2 伴游

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.SUBSCRIBE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String subscribe;//历史预约量

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.APPRAISE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String appraise;//好评率（百分数）

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.FACE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String face;//颜值(1~100)

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.TOVISITORINFO
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String tovisitorinfo;//导游简介

    private String identity;//目前身份

    /**
     * 性别
     */
    private String sex;

}
