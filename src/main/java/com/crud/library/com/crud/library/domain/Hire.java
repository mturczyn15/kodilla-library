package com.crud.library.com.crud.library.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "hires")
public class Hire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column
    private Long id;
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "exemplarId")
    private Exemplar exemplar;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "readerId")
    private Reader reader;
    @Column
    private LocalDate hireDate;
    @Column
    private LocalDate returnDate;

    public Hire(Long id, Exemplar exemplar, Reader reader, LocalDate hireDate) {

        this.id = id;
        this.exemplar = exemplar;
        this.reader = reader;
        this.hireDate = hireDate;
    }

}
