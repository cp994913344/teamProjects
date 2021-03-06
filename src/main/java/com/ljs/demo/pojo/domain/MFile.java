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
public class MFile implements Serializable {

    private static final long serialVersionUID = 5520285905639882986L;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.FILEID
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private Integer fileid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.FILENAME
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private String filename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.FILEPATH
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private String filepath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.USERID
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.CREATEDATE
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.CREATEUSERID
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private Integer createuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.UPDATEDATE
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private Date updatedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.UPDATEUSERID
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private Integer updateuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FILE.DELETED
     *
     * @mbggenerated Sun May 27 13:10:50 CST 2018
     */
    private Integer deleted;//0,未删除 1，删除.

}
