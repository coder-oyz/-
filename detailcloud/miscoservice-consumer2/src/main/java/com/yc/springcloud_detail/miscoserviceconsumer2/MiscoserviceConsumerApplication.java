package com.yc.springcloud_detail.miscoserviceconsumer2;

import com.yc.springcloud_detail.miscoserviceconsumer2.robinConfig.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient    //启用eureka客户端，这样能完成服务发现
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

//指定这个新的负载算法类给MICROSERVICE-PROVIDER这个服务用
@RibbonClient(name = "MICROSERVICE-PROVIDER",configuration = RibbonConfig.class)
//多个不同服务采用RibbonClients
//@RibbonClients(vlaue={ @RibbonClient(name = "MICROSERVICE-PROVIDER",configuration = RibbonConfig.class)

// ,@RibbonClient(name = "MICROSERVICE-PROVIDER",configuration = RibbonConfig.class)})
public class MiscoserviceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiscoserviceConsumerApplication.class, args);
    }

}
