package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class HireDto {

    private Long id;
    private Long exemplarId;
    private Long readerId;
    private LocalDate hireDate;
    private LocalDate returnDate;
}
