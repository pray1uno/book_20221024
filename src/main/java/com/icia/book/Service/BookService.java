package com.icia.book.Service;

import com.icia.book.DTO.BookDTO;
import com.icia.book.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
