package com.yc.springcloud_detail.security.service;

import com.yc.springcloud_detail.miscroserivceapi.bean.Book;

import java.util.List;


public interface  BookService   {
    public Book getBook(Integer id);

    public List<Book> findAll();
}
