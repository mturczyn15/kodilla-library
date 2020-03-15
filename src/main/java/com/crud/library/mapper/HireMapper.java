package com.crud.library.mapper;

import com.crud.library.com.crud.library.domain.Exemplar;
import com.crud.library.com.crud.library.domain.Hire;
import com.crud.library.com.crud.library.domain.HireDto;
import com.crud.library.com.crud.library.domain.Reader;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HireMapper {

    public Hire map(final HireDto hireDto, final Exemplar exemplar, final Reader reader) {
        return new Hire(
                hireDto.getId(),
                exemplar,
                reader,
                hireDto.getHireDate(),
                hireDto.getReturnDate());
    }

    public HireDto mapToDto(final Hire hire) {
        return new HireDto(
                hire.getId(),
                hire.getExemplar().getId(),
                hire.getReader().getId(),
                hire.getHireDate(),
                hire.getReturnDate());
    }

    /*public List<HireDto> mapToHireDtoList (final List<Hire> hireList) {
        return hireList.stream()
                .map(t -> new HireDto(t.getId(), t.getExemplar(), t.getReader(), t.getHireDate(), t.getReturnDate()))
                .collect(Collectors.toList());
    }*/
}
