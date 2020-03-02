package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "hires")
public class Hire {

    @Column
    private Long bookId;
    @Column
    private Long readerId;
    @Column
    private LocalDate hireDate;
    @Column
    private LocalDate returnDate;
}
