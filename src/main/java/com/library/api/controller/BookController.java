package com.library.api.controller;

import com.library.api.dto.*;
import com.library.api.service.BookService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public BookResponseDTO addBook(@RequestBody @Valid BookRequestDTO request) {
        return service.addBook(request);
    }

    @GetMapping("/{id}")
    public BookResponseDTO getBook(@PathVariable Integer id) {
        return service.getBook(id);
    }

    @GetMapping("/search")
    public List<BookResponseDTO> search(@RequestParam Integer year) {
        return service.searchByYear(year);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.deleteBook(id);
        return "Book deleted successfully";
    }
}
