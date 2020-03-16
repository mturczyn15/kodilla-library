package com.crud.library.service;

import com.crud.library.com.crud.library.domain.Book;
import com.crud.library.com.crud.library.domain.BookDto;
import com.crud.library.com.crud.library.domain.EntityNotFoundException;
import com.crud.library.mapper.BookMapper;
import com.crud.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    public Book save(final Book book) {
        return bookRepository.save(book);
    }

    public Book create(BookDto bookDto) {
        return save(bookMapper.map(bookDto));
    }


}
