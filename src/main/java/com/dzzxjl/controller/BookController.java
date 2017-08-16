package com.dzzxjl.controller;

import com.dzzxjl.domain.Book;
import com.dzzxjl.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzzxjl on 2017/8/16.
 */
@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/booklist")
    public List<Book> getBookList() {
        List<Book> bookList = null;
        bookList = (List<Book>) this.bookRepository.findAll();
        return bookList;
    }




}
