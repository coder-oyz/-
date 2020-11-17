package com.yc.springcloud_detail.service;
import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import com.yc.springcloud_detail.miscroserivceapi.vo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IZuulClientServiceCallbackFactory implements FallbackFactory<IZUUlClientService> {
    @Override
    public IZUUlClientService create(Throwable throwable) {
        return new IZUUlClientService(){

            @Override
            public Book getProduct(long id) {
                Book p=new Book();
                p.setBookId(100000);
                p.setBookName("暂无此商品");

                return p;
            }

            @Override
            public List<Book> listProduct() {
                return null;
            }



            @Override
            public User getUser(String id) {
                User user = new User();
                user.setSex("FAAAAAA");
                user.setAge(1);
                user.setName("getUser zuul-fllback："+id);
                return user;
            }

            @Override
            public User getUser2(String id) {
                User user = new User();
                user.setSex("F");
                user.setAge(2);
                user.setName("getUser2 zuul-fllback："+id);
                return user;
            }
        };
    }
}

