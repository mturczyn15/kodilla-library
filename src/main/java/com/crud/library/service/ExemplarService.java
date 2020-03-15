package com.crud.library.service;

import com.crud.library.com.crud.library.domain.Book;
import com.crud.library.com.crud.library.domain.EntityNotFoundException;
import com.crud.library.com.crud.library.domain.Exemplar;
import com.crud.library.com.crud.library.domain.ExemplarDto;
import com.crud.library.mapper.ExemplarMapper;
import com.crud.library.repository.BookRepository;
import com.crud.library.repository.ExemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;


@Service
public class ExemplarService {

    public static final String STATUS = "NONHIRED";
    @Autowired
    private ExemplarRepository exemplarRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ExemplarMapper exemplarMapper;

    public Exemplar save(final Exemplar exemplar) {
        return exemplarRepository.save(exemplar);
    }

    public ExemplarDto create(ExemplarDto exemplarDto) {
        Book book = bookRepository.findById(exemplarDto.getBookId()).orElseThrow(() -> new EntityNotFoundException(Book.class, exemplarDto.getBookId()));
        Exemplar exemplar = exemplarMapper.map(exemplarDto, book);
        return exemplarMapper.mapToDto(save(exemplar));
    }

    public ExemplarDto update(ExemplarDto exemplarDto) {
        Book book = bookRepository.findById(exemplarDto.getBookId()).orElseThrow(() -> new EntityNotFoundException(Book.class, exemplarDto.getBookId()));
        Exemplar exemplar = exemplarMapper.map(exemplarDto, book);
        return exemplarMapper.mapToDto(save(exemplar));
    }


    public List<ExemplarDto> getAvailableExemplars(Long bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new EntityNotFoundException(Book.class, bookId));
        List<Exemplar> list = exemplarRepository.findBySearchTerm(bookId);
        return exemplarMapper.mapToDtoList(list, book);
    }
}
