
package com.crud.library.repository;

import com.crud.library.com.crud.library.domain.Book;
import com.crud.library.com.crud.library.domain.Title;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TitleRepositoryTestSuite {
    @Autowired
    private TitleRepository titleRepository;
    private static final String STATUS = "Hired";
    @Test
    public void testTitleRepositorySave() {
        //Given
        Title title = new Title( "Leśne przygody", "Zawada Janusz", 2017);

        //When
        titleRepository.save(title);

        //Then
        Long id = title.getId();
        Optional<Title> readTitle = titleRepository.findById(id);
        Assert.assertTrue(readTitle.isPresent());

        //CleanUp
        titleRepository.deleteById(id);
    }

    @Test
    public void testTitleRepositorySaveWithBooks() {
        //Given
        Title title = new Title( "Leśne przygody", "Zawada Janusz", 2017);
        Book book1 = new Book(STATUS);
        book1.setTitle(title);
        Book book2 = new Book(STATUS);
        book2.setTitle(title);
        Book book3 = new Book(STATUS);
        book3.setTitle(title);

        title.addBook(book1);
        title.addBook(book2);
        title.addBook(book3);
        book1.setTitle(title);
        book2.setTitle(title);
        book3.setTitle(title);



        //When
        titleRepository.save(title);
        long id = title.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        titleRepository.deleteById(id);
    }
}


