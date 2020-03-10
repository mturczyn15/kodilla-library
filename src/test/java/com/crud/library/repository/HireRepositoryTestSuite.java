package com.crud.library.repository;

import com.crud.library.com.crud.library.domain.Book;
import com.crud.library.com.crud.library.domain.Hire;
import com.crud.library.com.crud.library.domain.Reader;
import com.crud.library.com.crud.library.domain.Exemplar;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.time.LocalDate;
import java.util.Optional;

import static java.util.Optional.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HireRepositoryTestSuite {

    @Autowired
    private HireRepository hireRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ReaderRepository readerRepository;
    private static final String STATUS = "Hired";

    @Test
    public void testHireRepositorySave() {

        //Given
        Book book = new Book( "Leśne przygody", "Zawada Janusz", 2017);
        Exemplar exemplar = new Exemplar(book, STATUS);
        book.addExemplar(exemplar);

        bookRepository.save(book);
        Reader reader = new Reader("Kamil", "Zawada", LocalDate.of(2009, 11, 4));
        readerRepository.save(reader);
        Hire hire = new Hire(LocalDate.of(2009, 11, 4), LocalDate.of(2009, 11, 4));
        hire.setExemplar(exemplar);
        hire.setReader(reader);


        //When
        hireRepository.save(hire);
        Long id = hire.getId();
        Optional<Hire> opt = hireRepository.findById(id);

        //Then
        Assert.assertTrue(opt.isPresent());
        //CleanUp
        hireRepository.delete(hire);

    }

}
