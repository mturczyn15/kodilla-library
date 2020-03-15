/*

package com.crud.library.repository;

import com.crud.library.com.crud.library.domain.Book;
import com.crud.library.com.crud.library.domain.Book;
import com.crud.library.com.crud.library.domain.Exemplar;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTestSuite {
    @Autowired
    private BookRepository bookRepository;
    private static final String STATUS = "Hired";

    @Test
    public void testBookRepositorySaveWithBooks() {
        //Given
        Book book = new Book((long)2, "Leśne przygody", "Zawada Janusz", 2017);
        Exemplar exemplar1 = new Exemplar((long)1, book, STATUS);
        Exemplar exemplar2 = new Exemplar((long)2, book, STATUS);
        Exemplar exemplar3 = new Exemplar((long)3, book, STATUS);

        book.addExemplar(exemplar1);
        book.addExemplar(exemplar2);
        book.addExemplar(exemplar3);
        exemplar1.setBook(book);
        exemplar2.setBook(book);
        exemplar3.setBook(book);

        //When
        bookRepository.save(book);
        long id = book.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        bookRepository.deleteById(id);
    }
}


*/
