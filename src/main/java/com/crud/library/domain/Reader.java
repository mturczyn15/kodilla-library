package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Readers")
public class Reader {

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
