package com.crud.library.service;

import com.crud.library.domain.*;
import com.crud.library.mapper.ReaderMapper;
import com.crud.library.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderService {

    @Autowired
    private ReaderRepository readerRepository;
    @Autowired
    private ReaderMapper readerMapper;

    public Reader save(final Reader reader) {
        return readerRepository.save(reader);
    }

    public ReaderDto create(ReaderDto readerDto) {
        Reader reader = save(readerMapper.map(readerDto));
        return readerMapper.mapToDto(reader);
    }
}
