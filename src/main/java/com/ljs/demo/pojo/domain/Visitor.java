package com.ljs.demo.pojo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Visitor implements Serializable {

    private static final long serialVersionUID = -6970675031171558256L;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.VISITORID
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private Integer visitorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.UUID
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.TOGETHERVISITORID
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private Integer togethervisitorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.ORDERID
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private Integer orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.PHONE
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.EMAIL
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.PASSWORD
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.AGE
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.NAME
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.SEX
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.CITY
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.WALLet
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private Double wallet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.STATUS
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISITOR.SCULPTURE
     *
     * @mbggenerated Thu May 24 14:12:33 CST 2018
     */
    private String sculpture;


}