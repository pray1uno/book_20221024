package com.icia.book.Repository;

import com.icia.book.DTO.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public int save(BookDTO bookDTO) {
    return sql.insert("Book.bookSave", bookDTO);
    }

}
