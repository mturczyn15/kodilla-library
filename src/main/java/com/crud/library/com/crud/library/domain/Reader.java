package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "readers")
public class Reader {

    public Reader(String name, String lastName, LocalDate creationDate) {
        this.name = name;
        this.lastName = lastName;
        this.creationDate = creationDate;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private LocalDate creationDate;

}
