
package com.crud.library.repository;

import com.crud.library.com.crud.library.domain.Reader;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReaderRepositoryTestSuite {
    @Autowired
    private ReaderRepository readerRepository;

    @Test
    public void testReaderRepositorySave() {
        //Given
        Reader reader = new Reader( "Kamil", "Zawada", LocalDate.of(2009,11, 4));

        //When
        readerRepository.save(reader);

        //Then
        Long id = reader.getId();
        Optional<Reader> readReader = readerRepository.findById(id);
        Assert.assertTrue(readReader.isPresent());

        //CleanUp
        //readerRepository.deleteById(id);
    }
}
