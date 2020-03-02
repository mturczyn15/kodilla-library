package com.crud.library.com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.sql.Date;

@Getter
@AllArgsConstructor
public class ReaderDto {

    private Long id;
    private String name;
    private String lastName;
    private Date creationDate;
}
