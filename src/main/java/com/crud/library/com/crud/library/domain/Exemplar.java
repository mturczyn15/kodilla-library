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

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    @Column
    private Long id;
    @ManyToOne
    @JoinColumn(name= "book_id")
    private Book book;
    @Enumerated(EnumType.STRING)
    @Column
    private Status status;
}
