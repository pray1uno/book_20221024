package com.icia.book.Repository;

import com.icia.book.DTO.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public int save(BookDTO bookDTO) {
    return sql.insert("Book.bookSave", bookDTO);
    }

    public BookDTO findBook() {
        // 결과가 하나일 때 selectOne, 전달값이 없으므로 매개변수 없음
        return sql.selectOne("Book.findBook");
    }

    public List<BookDTO> findAll() {
        // 결과가 복수일 때 selectList, 전달값이 없으므로 매개변수 없음
        return sql.selectList("Book.findAll");
    }
}
