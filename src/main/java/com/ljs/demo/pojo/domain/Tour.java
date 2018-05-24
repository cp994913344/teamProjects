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
    private Integer visitorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.CITYINFOID
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private Integer cityinfoid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.REALNAME
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String realname;

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
    private String lauguage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.CITY
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.CITYSERVICE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String cityservice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.STAYYEAR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String stayyear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.OWNCAR
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String owncar;

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
    private String wechat;

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
    private String idphoto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.SCULPTURE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String sculpture;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.STATUS
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.SUBSCRIBE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String subscribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.APPRAISE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String appraise;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.FACE
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String face;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TOUR.TOVISITORINFO
     *
     * @mbggenerated Thu May 24 20:54:12 CST 2018
     */
    private String tovisitorinfo;

}
