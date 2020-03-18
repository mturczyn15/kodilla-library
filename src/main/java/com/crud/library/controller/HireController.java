package com.crud.library.controller;

import com.crud.library.domain.HireDto;
import com.crud.library.service.HireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/hire")
public class HireController {

    @Autowired
    HireService hireService;

    @PostMapping( value = "hireExemplar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public HireDto hireExemplar(@RequestBody HireDto hireDto) {
        return hireService.hire(hireDto);
    }

    @PutMapping( value = "returnExemplar")
    public HireDto returnExemplar(@RequestBody HireDto hireDto) {
        return hireService.returnExemplar(hireDto);
    }

}
