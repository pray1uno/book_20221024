package com.icia.book.controller;

import com.icia.book.DTO.BookDTO;
import com.icia.book.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("/save")
    public String save() {
        return "bookSave";
    }

    @PostMapping("/save")
    public String bookSave(@ModelAttribute BookDTO bookDTO, Model model) {
        boolean result = bookService.save(bookDTO);
        model.addAttribute("result", result);
        return "saveResult";
    }

    @GetMapping("/findBook")
    public String findBook(Model model) {
        BookDTO findResult = bookService.findBook();
        model.addAttribute("book", findResult);
        return "findBook";
    }

    @GetMapping("/books")
    // 화면 조회 시 Model 객체 사용
    public String findAll(Model model) {
        List<BookDTO> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "bookList";
    }

    @GetMapping("/book")
    public String findBooks(@RequestParam("bookId") Long books, Model model) {
        BookDTO result = bookService.findBooks(books);
        model.addAttribute("book", result);
        return "findBook";
    }

}
