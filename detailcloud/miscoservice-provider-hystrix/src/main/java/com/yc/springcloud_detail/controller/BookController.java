package com.yc.springcloud_detail.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import com.yc.springcloud_detail.security.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;

    //Spring DI
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "errorCallBack")
    public Book getBook(@PathVariable("id")Integer id){
        show();
        Book book = bookService.getBook(id);
        if(book == null ){
            throw  new RuntimeException("查无此产品");
        }
        return book;
    }
    //返回值和参数类型必须一致
    //指定一个降级的方法
    public Book errorCallBack(  @PathVariable("id") Integer id   ){
        Book book=new Book();
        book.setBookId(id);
        book.setBookName("查无此书，服务忙");
        return book;
    }


    @GetMapping("/findAll")
    public List<Book> findAll(){
        show();
        return bookService.findAll();
    }

    @RequestMapping("/discover")
    public Object discover(){
        System.out.println( this.discoveryClient.description() );
        System.out.println(  ((EurekaDiscoveryClient)this.discoveryClient).getServices());
        //再通过Service获取EurekaServiceInstance
        return this.discoveryClient;
    }

    private void show(){
        System.out.println( this.discoveryClient.description() );

        //EurekaDiscoveryClient
        EurekaDiscoveryClient edc=(EurekaDiscoveryClient)this.discoveryClient;
        // 服务器上有有很多服务
        List<String> servicesName=edc.getServices();
        for( String sn:servicesName ) {
            System.out.println("服务名:" + sn);
            List<ServiceInstance> instances = edc.getInstances(sn);
            for (ServiceInstance si : instances) {
                System.out.println(si.getScheme() + " " + si.getHost() + " " + si.getPort() + " " + si.getUri());
            }
        }
    }
}
