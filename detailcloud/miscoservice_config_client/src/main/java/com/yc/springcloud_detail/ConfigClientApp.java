package com.yc.springcloud_detail;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ConfigClientApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class,args);
    }
}
