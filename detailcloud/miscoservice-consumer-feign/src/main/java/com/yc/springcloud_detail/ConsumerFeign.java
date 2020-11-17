package com.yc.springcloud_detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient    //启用eureka客户端

//@RibbonClient(name = "MICROSERVICE-PROVIDER", configuration = RibbonConfig.class)
//启用feign客户端
@EnableFeignClients("com.yc.springcloud_detail.service")  //注意:这里的值要填服务接口所在的包名
public class ConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign.class, args);
    }


}

