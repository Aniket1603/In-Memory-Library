package com.library.api.exception;

public class DuplicateBookException extends RuntimeException {
    public DuplicateBookException(String msg) {
        super(msg);
    }
}
