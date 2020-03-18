package com.crud.library.controller;

import com.crud.library.domain.ReaderDto;
import com.crud.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/reader")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @PostMapping( value = "createReader", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ReaderDto createTask(@RequestBody ReaderDto readerDto) {
        return readerService.create(readerDto);
    }
}
