package com.company.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Elivs on 2017/4/28.
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 2319951788162598565L;

    private Long id;

    private String userName;

    private Integer age;

    private String password;

    public UserInfo(Long id, String userName, Integer age, String password) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.password = password;
    }
}
