package com.wjr.service;

import com.wjr.dao.BookMapper;
import com.wjr.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


public class BookServiceImpl implements BookService {


    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public List<Books> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
