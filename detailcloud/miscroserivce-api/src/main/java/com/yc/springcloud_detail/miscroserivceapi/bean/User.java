package com.yc.springcloud_detail.miscroserivceapi.bean;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="user")
public class User {
    @Id
    private Integer uid;
    private String username;
    private String password;
    private String roles;

    public Integer getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRoles() {
        return roles;
    }

}
