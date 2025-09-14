package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExistException extends RuntimeException {
    public BookAlreadyExistException(String isbn) {
        super(String.format("A book with ISBN %s already exists.", isbn));
    }
}
