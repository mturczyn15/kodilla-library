package com.crud.library.mapper;

import com.crud.library.domain.Reader;
import com.crud.library.domain.ReaderDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReaderMapper {

    public Reader map(final ReaderDto readerDto) {
        return new Reader(
                readerDto.getId(),
                readerDto.getName(),
                readerDto.getLastName(),
                readerDto.getCreationDate());
    }

    public ReaderDto mapToDto(final Reader reader) {
        return new ReaderDto(
                reader.getId(),
                reader.getName(),
                reader.getLastName(),
                reader.getCreationDate());
    }

    public List<ReaderDto> mapToReaderDtoList (final List<Reader> readerList) {
        return readerList.stream()
                .map(t -> new ReaderDto(t.getId(), t.getName(), t.getLastName(), t.getCreationDate()))
                .collect(Collectors.toList());
    }
}
