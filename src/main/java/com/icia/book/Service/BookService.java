package com.icia.book.Service;

import com.icia.book.DTO.BookDTO;
import com.icia.book.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public boolean save(BookDTO bookDTO) {
        int insertResult = bookRepository.save(bookDTO);

        if (insertResult > 0) {
            return true;
        } else {
            return false;
        }
    }

    public BookDTO findBook() {
//        BookDTO findResult = bookRepository.findBook();
//        return findResult;
        return bookRepository.findBook();
    }

    public List<BookDTO> findAll() {
        return bookRepository.findAll();
    }

    public BookDTO findBooks(Long books) {
//        BookDTO findResult = bookRepository.findBooks(books);
//        return findResult;
        return bookRepository.findBooks(books);
    }
}
