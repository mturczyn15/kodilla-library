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
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "books")
public class Book {

    public Book(String status) {
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    @Column
    private Long id;
    @ManyToOne
    @JoinColumn(name= "title_id")
    private Title title;
    @Column
    private String status;
    //@Setter
   // @OneToMany(
           // targetEntity = Hire.class,
           // mappedBy = "book",
           // cascade = CascadeType.ALL,
            //fetch = FetchType.LAZY
    //)
    //private List<Hire> hires = new ArrayList<>();

    //public void addHire(Hire hire) {
       // hires.add(hire);
    //}


}
