package com.lwh.elasticsearch.xunwu.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author lwh
 * @date 2020-02-06
 * @desp @Entity注解使得它可以被Jpa扫描到
 *       user表是小写,这里使用注解@Table对应上
 */
@Entity
@Data
@Table(name = "user")
public class User {

    /**
     * 同时兼容Hibernate和H2,使用Identity,不使用Auto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private int status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    private String avatar;
}
