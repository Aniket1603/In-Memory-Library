package com.library.api.store;

import com.library.api.model.Book;
import java.util.concurrent.ConcurrentHashMap;

public class BookStore {
    public static ConcurrentHashMap<Integer, Book> BOOKS = new ConcurrentHashMap<>();
}
