package com.wjr.controller;

import com.wjr.pojo.Books;
import com.wjr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allbook")
    public String allBook(Model model){
        List<Books> allBooks = bookService.getAllBooks();
        model.addAttribute("allbook", allBooks);
        return "allbook";
    }

}
