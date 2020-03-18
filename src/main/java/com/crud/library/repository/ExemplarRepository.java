package com.crud.library.repository;

import com.crud.library.domain.Exemplar;
import com.crud.library.domain.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ExemplarRepository extends CrudRepository<Exemplar, Long> {

    @Override
    Exemplar save(Exemplar exemplar);

    /*@Query("SELECT t FROM Exemplars t WHERE(book_id = :bookId AND status = 'nonhired')")
    List<Exemplar> findExemplarsByBookIdAndStatus(@Param("bookId") Long bookId);*/

    List<Exemplar> findByBook_IdAndStatus(Long book_Id, Status status);

    default List<Exemplar> findByBook_IdNonHired(Long bookId) { return findByBook_IdAndStatus(bookId, Status.NONHIRED);}
}


