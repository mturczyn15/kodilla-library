package com.crud.library.com.crud.library.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExemplarDto {

    private Long id;
    private Long book;
    private String status;
}
