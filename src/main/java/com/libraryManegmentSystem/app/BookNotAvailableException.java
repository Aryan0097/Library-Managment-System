package com.libraryManegmentSystem.app;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException() {
        super("Book is not available");
    }
}
