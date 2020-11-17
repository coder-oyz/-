package com.yc.springcloud_detail.miscroserivceapi.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String name;
    private int age;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}