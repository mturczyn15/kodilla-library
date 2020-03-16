package com.crud.library.controller;

import com.crud.library.com.crud.library.domain.ReaderDto;
import com.crud.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/reader")
public class ReaderController {

    @Autowired
    private ReaderService readerService;


    @RequestMapping(method = RequestMethod.POST, value = "createReader", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createTask(@RequestBody ReaderDto readerDto) {
        readerService.create(readerDto);
    }
}
