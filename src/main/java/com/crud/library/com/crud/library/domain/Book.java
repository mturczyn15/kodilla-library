package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    @Column
    private Long id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private int year;
    @Setter
    @OneToMany(
            targetEntity = Exemplar.class,
            mappedBy = "book",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Exemplar> exemplars = new ArrayList<>();

    public void addExemplar(Exemplar exemplar) {
        exemplars.add(exemplar);
    }
}
