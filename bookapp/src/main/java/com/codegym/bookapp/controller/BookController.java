package com.codegym.bookapp.controller;

import com.codegym.bookapp.BookNotAvailableException;
import com.codegym.bookapp.BookNotFoundException;
import com.codegym.bookapp.model.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @PostMapping("/{bookId}/borrow")
    public ResponseEntity<Book> borrowBook(@PathVariable Long bookId) {
        Book borrowedBook = bookService.borrowBook(bookId);
        return ResponseEntity.ok(borrowedBook);
    }

    @PostMapping("/{bookId}/return")
    public ResponseEntity<Book> returnBook(@PathVariable Long bookId) {
        Book returnedBook = bookService.returnBook(bookId);
        return ResponseEntity.ok(returnedBook);
    }

    // Xử lý các exception

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<String> handleBookNotFoundException(BookNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(BookNotAvailableException.class)
    public ResponseEntity<String> handleBookNotAvailableException(BookNotAvailableException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
