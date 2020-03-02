package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
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

    @OneToOne
    @JoinColumn(name = "bookId")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "readerId")
    private Reader Reader;
    @Column
    private Date hireDate;
    @Column
    private Date returnDate;
}
