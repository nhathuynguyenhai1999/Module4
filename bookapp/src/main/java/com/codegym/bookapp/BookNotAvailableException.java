package com.codegym.bookapp;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException(String message){
        super(message);
    }
}
