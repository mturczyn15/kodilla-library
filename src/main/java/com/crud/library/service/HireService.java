package com.crud.library.service;

import com.crud.library.com.crud.library.domain.*;
import com.crud.library.mapper.HireMapper;
import com.crud.library.repository.ExemplarRepository;
import com.crud.library.repository.HireRepository;
import com.crud.library.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HireService {

    @Autowired
    private ExemplarRepository exemplarRepository;
    @Autowired
    private ReaderRepository readerRepository;
    @Autowired
    private HireRepository hireRepository;
    @Autowired
    private HireMapper hireMapper;

    public Hire save(final Hire hire) {
        return hireRepository.save(hire);
    }

    public HireDto hire(HireDto hireDto) {

        Exemplar exemplar = exemplarRepository.findById(hireDto.getExemplarId()).orElseThrow(() -> new EntityNotFoundException(Exemplar.class, hireDto.getExemplarId()));
        Reader reader = readerRepository.findById(hireDto.getReaderId()).orElseThrow(() -> new EntityNotFoundException(Reader.class, hireDto.getReaderId()));
        if (exemplar.getStatus() != Status.NONHIRED) {
            throw new NotAbleToHireException(exemplar);
        }
        Hire hire = hireMapper.map(hireDto, exemplar, reader);
        exemplar.setStatus(Status.HIRED);
        exemplarRepository.save(exemplar);
        return hireMapper.mapToDto(save(hire));
    }

    public HireDto returnExemplar(HireDto hireDto) {

        Hire hire = hireRepository.findByExemplar_IdAndReturnDateIsNull(hireDto.getExemplarId());
        hire.setReturnDate(LocalDate.now());
        Exemplar exemplar = hire.getExemplar();
        exemplar.setStatus(Status.NONHIRED);
        exemplarRepository.save(exemplar);
        return hireMapper.mapToDto(save(hire));
    }
}
