package com.crud.library.controller;

import com.crud.library.com.crud.library.domain.ExemplarDto;
import com.crud.library.com.crud.library.domain.HireDto;
import com.crud.library.service.HireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/hire")
public class HireController {

    @Autowired
    HireService hireService;

    @RequestMapping(method = RequestMethod.POST, value = "hireExemplar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public HireDto hireExemplar(@RequestBody HireDto hireDto) {
        return hireService.hire(hireDto);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "returnExemplar")
    public HireDto returnExemplar(@RequestBody HireDto hireDto) {
        return hireService.returnExemplar(hireDto);
    }

}
