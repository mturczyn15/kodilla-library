package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "titles")
public class Title {

    public Title(String titleOfBook, String author, int year) {
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.year = year;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    @Column
    private Long id;
    @Column
    private String titleOfBook;
    @Column
    private String author;
    @Column
    private int year;
}
