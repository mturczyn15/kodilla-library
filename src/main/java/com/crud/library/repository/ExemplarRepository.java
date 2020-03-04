package com.crud.library.repository;

import com.crud.library.com.crud.library.domain.Exemplar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ExemplarRepository extends CrudRepository<Exemplar, Long> {
}
