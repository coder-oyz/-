package com.yc.springcloud_detail.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * zuul的自定义过滤器
 */
public class AuthorizedRequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;   //  "pre"
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {//拦截请求，贴上登陆密码
        //但是因为其他拦截器会删除头部，所以不行
        //方案二: 将指定路由的敏感头设置为空，在yml设置sensitiveHeaders: ,就行了
        RequestContext currentContext = RequestContext.getCurrentContext() ; // 获取当前请求的上下文
        String auth = "admin:a"; // 认证的原始信息
        byte[] encodedAuth = Base64.getEncoder()
                .encode(auth.getBytes(Charset.forName("US-ASCII"))); // 进行一个加密的处理
        String authHeader = "Basic " + new String(encodedAuth);
        currentContext.addZuulRequestHeader("Authorization", authHeader);
        return null;
    }
}