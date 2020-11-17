package com.yc.springcloud_detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {
    public static void main(String[] args) {
        //分析:  此时请求是通过zuul访问的用户服务，即zuul在这里起到了一个代理的作用.

                SpringApplication.run(ZuulApp.class,args);
    }
}
