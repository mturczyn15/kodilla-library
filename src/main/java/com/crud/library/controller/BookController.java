package com.crud.library.controller;

import com.crud.library.domain.BookDto;
import com.crud.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping( value = "createBook", consumes = MediaType.APPLICATION_JSON_VALUE )
    public BookDto createBook(@RequestBody BookDto bookDto) {
        return bookService.create(bookDto);
    }
}
