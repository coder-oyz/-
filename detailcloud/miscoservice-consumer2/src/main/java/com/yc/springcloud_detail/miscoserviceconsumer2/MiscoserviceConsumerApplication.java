package com.yc.springcloud_detail.miscoserviceconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MiscoserviceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiscoserviceConsumerApplication.class, args);
    }

}
