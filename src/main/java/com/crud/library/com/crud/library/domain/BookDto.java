package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookDto {

    private Long id;
    private String title;
    private String author;
    private int year;
}
