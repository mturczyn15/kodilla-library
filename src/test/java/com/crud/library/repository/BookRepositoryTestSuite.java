package com.crud.library.repository;


import com.crud.library.com.crud.library.domain.Book;
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
    public void testBookRepositorySave() {
        //Given
        Book book = new Book( (long)1, STATUS);

        //When
        bookRepository.save(book);

        //Then
        Long id = book.getId();
        Optional<Book> readBook = bookRepository.findById(id);
        Assert.assertTrue(readBook.isPresent());

        //CleanUp
        bookRepository.deleteById(id);
    }
}
