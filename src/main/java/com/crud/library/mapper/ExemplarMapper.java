package com.crud.library.mapper;

import com.crud.library.domain.Book;
import com.crud.library.domain.Exemplar;
import com.crud.library.domain.ExemplarDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExemplarMapper {

    public Exemplar map(final ExemplarDto exemplarDto, final Book book) {
        return new Exemplar(
                exemplarDto.getId(),
                book,
                exemplarDto.getStatus());
    }

    public ExemplarDto mapToDto(final Exemplar exemplar) {
        return new ExemplarDto(
                exemplar.getId(),
                exemplar.getBook().getId(),
                exemplar.getStatus());
    }

    public List<ExemplarDto> mapToDtoList (final List<Exemplar> exemplarList, Book book) {
        return exemplarList.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }
}