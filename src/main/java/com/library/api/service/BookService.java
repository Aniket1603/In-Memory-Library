package com.library.api.service;

import com.library.api.dto.*;
import com.library.api.exception.*;
import com.library.api.model.Book;
import com.library.api.store.BookStore;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public BookResponseDTO addBook(BookRequestDTO request) {

        if (BookStore.BOOKS.containsKey(request.id())) {
            throw new DuplicateBookException("Book ID already exists");
        }

        Book book = new Book(
                request.id(),
                request.title(),
                request.author(),
                request.year()
        );

        BookStore.BOOKS.put(book.getId(), book);

        return map(book);
    }

    public BookResponseDTO getBook(Integer id) {
        Book book = BookStore.BOOKS.get(id);

        if (book == null) {
            throw new BookNotFoundException("Book not found");
        }

        return map(book);
    }

    public List<BookResponseDTO> searchByYear(Integer year) {
        return BookStore.BOOKS.values()
                .stream()
                .filter(book -> book.getYear().equals(year))
                .map(this::map)
                .toList();
    }

    public void deleteBook(Integer id) {
        if (!BookStore.BOOKS.containsKey(id)) {
            throw new BookNotFoundException("Book not found");
        }
        BookStore.BOOKS.remove(id);
    }

    private BookResponseDTO map(Book book) {
        return new BookResponseDTO(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getYear()
        );
    }
}
