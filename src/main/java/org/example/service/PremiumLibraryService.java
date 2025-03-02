package org.example.service;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Qualifier("premiumLibraryService")
public class PremiumLibraryService implements LibraryService {
    private final BookRepository bookRepository;

    @Autowired
    public PremiumLibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
        System.out.println("Premium service: Adding book - " + book.getTitle());
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getAllBooks();
    }
}
