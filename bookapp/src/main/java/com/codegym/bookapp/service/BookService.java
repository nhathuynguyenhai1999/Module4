package com.codegym.bookapp.service;

import com.codegym.bookapp.BookNotAvailableException;
import com.codegym.bookapp.BookNotFoundException;
import com.codegym.bookapp.model.Book;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book borrowBook(Long bookId) {
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            if (book.getQuantity() > 0) {
                book.setQuantity(book.getQuantity() - 1);
                bookRepository.save(book);
                return book;
            } else {
                throw new BookNotAvailableException("This book is not available for borrowing.");
            }
        } else {
            throw new BookNotFoundException("Book not found with ID: " + bookId);
        }
    }

    public Book returnBook(Long bookId) {
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setQuantity(book.getQuantity() + 1);
            bookRepository.save(book);
            return book;
        } else {
            throw new BookNotFoundException("Book not found with ID: " + bookId);
        }
    }
}

