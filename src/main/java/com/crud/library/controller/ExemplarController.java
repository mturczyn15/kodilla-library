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

    @RequestMapping(method = RequestMethod.POST, value = "createExemplar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ExemplarDto createExemplar(@RequestBody ExemplarDto exemplarDto) {
        return exemplarService.create(exemplarDto);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateStatus")
    public ExemplarDto updateExemplar(@RequestBody ExemplarDto exemplarDto) {
        return exemplarService.update(exemplarDto);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getExemplars")
    public List<ExemplarDto> getExemplars(@RequestParam Long bookId) {
        return exemplarService.getAvailableExemplars(bookId);
    }
}

