package com.crud.library.com.crud.library.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "exemplars")
public class Exemplar {

    public Exemplar(Book book, String status) {
        this.book = book;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    @Column
    private Long id;
    @ManyToOne
    @JoinColumn(name= "book_id")
    private Book book;
    @Column
    private String status;

}
