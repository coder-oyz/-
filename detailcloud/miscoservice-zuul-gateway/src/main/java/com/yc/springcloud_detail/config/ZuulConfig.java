package com.yc.springcloud_detail.config;

import com.yc.springcloud_detail.filter.AuthorizedRequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {
    @Bean//将AuthorizedRequestFilter实例化   交给spring托管
    public AuthorizedRequestFilter getAuthorizedRequestFilter(){
        return new AuthorizedRequestFilter();
    }
}
