package com.yc.springcloud_detail.miscoserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class MiscoserviceProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(MiscoserviceProviderApplication.class, args);
    }

}
