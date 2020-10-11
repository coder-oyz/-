package com.yc.springcloud_detail.miscoserviceprovider.service;
import com.yc.springcloud_detail.miscoserviceprovider.dao.BookMapper;
import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired(required = false)
    private BookMapper bookMapper;
    @Override
    public Book getBook(Integer id){
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Book> findAll() {
        return bookMapper.selectAll();
    }
}
