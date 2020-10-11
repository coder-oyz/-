package com.yc.springcloud_detail.miscoserviceprovider.service;

import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import lombok.Data;

import java.util.List;


public interface  BookService   {
    public Book getBook(Integer id);

    public List<Book> findAll();
}
