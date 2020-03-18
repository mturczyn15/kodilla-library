package com.crud.library.service;

import com.crud.library.domain.Book;
import com.crud.library.domain.BookDto;
import com.crud.library.mapper.BookMapper;
import com.crud.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    public Book save(final Book book) {
        return bookRepository.save(book);
    }

    public BookDto create(BookDto bookDto) {
        Book book = bookMapper.map(bookDto);
        return bookMapper.mapToDto(save(book));
    }
}
