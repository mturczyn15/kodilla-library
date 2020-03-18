package com.crud.library.controller;

import com.crud.library.domain.ExemplarDto;
import com.crud.library.service.ExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exemplar")
public class ExemplarController {

    @Autowired
    private ExemplarService exemplarService;

    @PostMapping(value = "createExemplar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ExemplarDto createExemplar(@RequestBody ExemplarDto exemplarDto) {
        return exemplarService.create(exemplarDto);
    }

    @PutMapping( value = "updateStatus")
    public ExemplarDto updateExemplar(@RequestBody ExemplarDto exemplarDto) {
        return exemplarService.update(exemplarDto);
    }

    @GetMapping( value = "getExemplars")
    public List<ExemplarDto> getExemplars(@RequestParam Long bookId) {
        return exemplarService.getAvailableExemplars(bookId);
    }
}

