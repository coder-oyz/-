package com.yc.springcloud_detail.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;
    //现在是service-url   以前是serviceUrL
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @RequestMapping("/config")
    public String getConfig() {
        //  miscoservice_config_client
        return "ApplicationName = " + this.applicationName + "、EurekaServers = "
                + this.eurekaServers;
    }
}