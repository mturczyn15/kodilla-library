/*
package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "hires")
public class Hire {

    public Hire(Date hireDate, Date returnDate) {
        this.hireDate = hireDate;
        this.returnDate = returnDate;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    private Long id;
    //@ManyToOne
    //@JoinColumn(name = "bookId")
    @Column
    private Book book;
    //@ManyToOne
    //@JoinColumn(name = "readerId")
    @Column
    private Reader Reader;
    @Column
    private Date hireDate;
    @Column
    private Date returnDate;
}
*/
