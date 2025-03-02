package org.example.service;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
public class DefaultLibraryService implements LibraryService {
    private final BookRepository bookRepository;

    @Autowired
    public DefaultLibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getAllBooks();
    }
}
