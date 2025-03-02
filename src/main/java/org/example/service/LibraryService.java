package org.example.service;

import org.example.model.Book;
import java.util.List;

public interface LibraryService {
    void addBook(Book book);
    List<Book> getBooks();
}