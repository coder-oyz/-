package com.yc.springcloud_detail.security.service;
import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import com.yc.springcloud_detail.security.dao.BookMapper;
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
