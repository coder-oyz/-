package com.yc.springcloud_detail.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Feign的配置类
@Configuration
public class FeignClientConfig {
    //加入安全配置
    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("admin","b");
    }

    @Bean
     Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}