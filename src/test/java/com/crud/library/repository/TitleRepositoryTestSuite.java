
package com.crud.library.repository;

import com.crud.library.com.crud.library.domain.Title;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TitleRepositoryTestSuite {
    @Autowired
    private TitleRepository titleRepository;

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
}


