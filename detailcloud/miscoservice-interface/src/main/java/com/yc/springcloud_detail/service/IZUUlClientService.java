package com.yc.springcloud_detail.service;
import com.yc.springcloud_detail.config.FeignClientConfig;
import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import com.yc.springcloud_detail.miscroserivceapi.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name="MICROSERVICE-ZUUL-GATEWAY",configuration = FeignClientConfig.class,fallbackFactory = IZuulClientServiceCallbackFactory.class)
public interface IZUUlClientService {

    @RequestMapping("/yc-api/product-proxy/book/{id}")
    public Book getProduct(@PathVariable("id")long id);

    @RequestMapping("/yc-api/product-proxy/book/findAll")
    public List<Book> listProduct();

    @RequestMapping("/yc-api/user1-proxy/user/get/{id}")
    public User getUser(@PathVariable("id")String id);

    @RequestMapping("/yc-api/user2-proxy/user/get/{id}")
    public User getUser2(@PathVariable("id")String id);
}

