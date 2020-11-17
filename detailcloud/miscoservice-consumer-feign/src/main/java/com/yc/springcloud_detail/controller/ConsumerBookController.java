package com.yc.springcloud_detail.controller;

import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import com.yc.springcloud_detail.service.IProductClientService;
import com.yc.springcloud_detail.service.IZUUlClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("consumer")
public class ConsumerBookController {
    @Resource
    private IProductClientService iProductClientService;

    @Resource
    private LoadBalancerClient loadBalancerClient;   //因为ribbon是客户端的负载均衡，所以它可以在客户端记录访问的日志

    @Resource
    private IZUUlClientService izuulClientService;

    private static Logger log= LoggerFactory.getLogger(ConsumerBookController.class);

   /* @Autowired
    private HttpHeaders httpHeaders;
*/

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") Integer id){
        return this.iProductClientService.getBook(id);
    }

    @GetMapping("/findAll")
    public List<Book> findAll( ){
        return this.iProductClientService.list();
    }


    @RequestMapping("/product/getProductAndUser/{id}")
    public Object getProductAndUser( @PathVariable("id") long id){
        log.info("*******"+id);
        Map<String,Object> result = new HashMap();
        result.put("product",this.izuulClientService.getProduct(id));
        log.info("******"+this.izuulClientService.getProduct(id));
        result.put("user",this.izuulClientService.getUser(id+""));
        result.put("productList",this.izuulClientService.listProduct() );
        return  result;
    }


}
