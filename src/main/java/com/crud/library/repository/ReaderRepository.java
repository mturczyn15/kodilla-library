package com.crud.library.repository;


import com.crud.library.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ReaderRepository extends CrudRepository<Reader, Long> {

    @Override
    Reader save(Reader reader);
}
