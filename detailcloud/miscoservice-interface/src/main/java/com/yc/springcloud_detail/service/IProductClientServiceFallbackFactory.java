package com.yc.springcloud_detail.service;

import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liyan
 * @create 2020-10-2020/10/30-20:05
 */
//此类表示当   正常服务访问不到时，熔断的处理类
@Component    //必须被spring 托管
public class IProductClientServiceFallbackFactory implements FallbackFactory<IProductClientService> {
    @Override
    public IProductClientService create(Throwable throwable) {
        //这里提供请求方法出问题时回退处理机制
        return new IProductClientService(){

            @Override
            public Book getBook(long id) {
                Book p=new Book();
                p.setBookId(     (int)id);
                p.setBookName("服务器烦忙,请稍后访问");
                return p;
            }

            @Override
            public List<Book> list() {
                return null;
            }
        };
    }
}
