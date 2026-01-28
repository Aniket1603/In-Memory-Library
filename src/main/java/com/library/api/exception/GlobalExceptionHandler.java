package com.library.api.exception;

import org.springframework.http.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<?> handleNotFound(BookNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(response("ERROR", ex.getMessage()));
    }

    @ExceptionHandler(DuplicateBookException.class)
    public ResponseEntity<?> handleDuplicate(DuplicateBookException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(response("ERROR", ex.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidation() {
        return ResponseEntity.badRequest()
                .body(response("ERROR", "Validation Failed"));
    }

    private HashMap<String, String> response(String status, String msg) {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", status);
        map.put("message", msg);
        return map;
    }
}
