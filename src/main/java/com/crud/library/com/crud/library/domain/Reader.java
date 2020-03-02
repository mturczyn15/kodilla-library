package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "readers")
public class Reader {

    public Reader(String name, String lastName, Date creationDate) {
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
    private Date creationDate;
    @OneToMany(
            targetEntity = Hire.class,
            mappedBy = "reader",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Hire> hires = new ArrayList<>();

    public void addHire(Hire hire) {
        hires.add(hire);
    }
}
