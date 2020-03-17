package com.crud.library.domain;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Class aClass, Long entityId) {
        super("entity " + aClass.getSimpleName() + " with Id " + entityId + " not found");

    }
}
