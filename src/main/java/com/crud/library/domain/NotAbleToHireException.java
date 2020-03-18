package com.crud.library.domain;

public class NotAbleToHireException extends RuntimeException {

    public NotAbleToHireException(Exemplar exemplar) {
        super("You cant hire exemplar with id: " + exemplar.getId() + " It's status is: " + exemplar.getStatus());
    }
}
