package com.crud.library.mapper;
import com.crud.library.com.crud.library.domain.Book;
import com.crud.library.com.crud.library.domain.BookDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapper {


    public Book map(final BookDto bookDto) {
        return new Book(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getYear()
        );
    }

    public BookDto mapToDto(final Book book) {
        return new BookDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getYear()
        );
    }

    public List<BookDto> mapToBookDtoList (final List<Book> bookList) {
        return bookList.stream()
                .map(t -> new BookDto(t.getId(), t.getTitle(), t.getAuthor(), t.getYear()
                ))
                .collect(Collectors.toList());
    }
}

