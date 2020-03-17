package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExemplarDto {

    private Long id;
    private Long bookId;
    private Status status;
}
