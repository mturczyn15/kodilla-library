package com.crud.library.controller;

import com.crud.library.com.crud.library.domain.ExemplarDto;
import com.crud.library.com.crud.library.domain.Status;
import com.crud.library.service.ExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}

