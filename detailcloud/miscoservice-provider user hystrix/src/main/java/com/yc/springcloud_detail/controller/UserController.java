package com.yc.springcloud_detail.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yc.springcloud_detail.miscroserivceapi.vo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/get/{name}")
    @HystrixCommand
    public  Object get(@PathVariable("name")String name) {
        User users = new User();
        users.setName(name);
        users.setAge(18);
        users.setSex("F");
        return users;
    }
}