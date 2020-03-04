/*
package com.crud.library.repository;

import com.crud.library.com.crud.library.domain.Book;
import com.crud.library.com.crud.library.domain.Hire;
import com.crud.library.com.crud.library.domain.Reader;
import com.crud.library.com.crud.library.domain.Title;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HireRepositoryTestSuite {

    @Autowired
    private HireRepository hireRepository;
    @Autowired
    private TitleRepository titleRepository;
    private static final String STATUS = "Hired";

    @Test
    public void testHireRepositorySave() {

        //Given
        Title title = new Title( "Leśne przygody", "Zawada Janusz", 2017);
        Book book1 = new Book(STATUS);
        title.addBook(book1);
        book1.setTitle(title);
        titleRepository.save(title);
        Reader reader = new Reader("Kamil", "Zawada", Date.valueOf("2009-11-04"));
        Hire hire = new Hire(Date.valueOf("2009-11-04"), Date.valueOf("2009-11-04"));
        hire.setBook(book1);
        hire.setReader(reader);
        reader.addHire(hire);
        book1.addHire(hire);

        //When
        hireRepository.save(hire);

        //Then


    }

}
*/
