package com.crud.library.com.crud.library.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;
    private Long titleId;
    private String status;
}
