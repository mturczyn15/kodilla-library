package com.crud.library.mapper;

import com.crud.library.com.crud.library.domain.Hire;
import com.crud.library.com.crud.library.domain.HireDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HireMapper {

    public Hire map(final HireDto hireDto) {
        return new Hire(
                hireDto.getId(),
                hireDto.getExemplar(),
                hireDto.getReader(),
                hireDto.getHireDate());
    }

    public HireDto mapToDto(final Hire hire) {
        return new HireDto(
                hire.getId(),
                hire.getExemplar(),
                hire.getReader(),
                hire.getHireDate());
    }

    public List<HireDto> mapToHireDtoList (final List<Hire> hireList) {
        return hireList.stream()
                .map(t -> new HireDto(t.getId(), t.getExemplar(), t.getReader(), t.getHireDate()))
                .collect(Collectors.toList());
    }
}
