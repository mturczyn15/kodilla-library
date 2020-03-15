package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class HireDto {

    private Long id;
    private Exemplar exemplar;
    private Reader reader;
    private LocalDate hireDate;
}
