package com.crud.library.repository;

import com.crud.library.domain.Exemplar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ExemplarRepository extends CrudRepository<Exemplar, Long> {

    @Override
    Exemplar save(Exemplar exemplar);

    @Query("SELECT t FROM Exemplars t WHERE(book_id = :bookId AND status = 'nonhired')")
    List<Exemplar> findExemplarsByBookIdAndStatus(@Param("bookId") Long bookId);


}


