package com.yc.springcloud_detail.miscroserivceapi.bean;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data      //  lombok 注解，节省getter, setter
@Table(name="book")   // JPA注解,将java类关联表
public class Book {
    @Id  // JPA注解,指定此属性为表中的主键
    private Integer bookId;   //注意: 对应的数据表中的字段名叫 book_id
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    private Date bookDate;
    private Integer userId;

    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}