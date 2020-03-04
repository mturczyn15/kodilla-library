package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "hires")
public class Hire {

    public Hire(LocalDate hireDate, LocalDate returnDate) {
        this.hireDate = hireDate;
        this.returnDate = returnDate;
    }

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
    private Reader Reader;
    @Column
    private LocalDate hireDate;
    @Column
    private LocalDate returnDate;
}
