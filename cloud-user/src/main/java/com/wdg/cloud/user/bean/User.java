package com.wdg.cloud.user.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author WDG
 * @date 2019-2-17
 */
@Entity
@Table(name="user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="username")
    private String username;

}

