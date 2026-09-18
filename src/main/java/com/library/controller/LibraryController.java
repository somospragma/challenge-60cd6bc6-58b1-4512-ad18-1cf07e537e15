package com.library.controller;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.User;
import com.library.service.BookService;
import com.library.service.LoanService;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @Autowired
    private LoanService loanService;

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("/loans")
    public ResponseEntity<Loan> borrowBook(@RequestParam String userEmail, @RequestParam String bookTitle) {
        User user = userService.getUserByEmail(userEmail);
        Book book = bookService.getBookByTitle(bookTitle);
        if (user!= null && book!= null && loanService.canUserBorrowBook(user, book)) {
            Loan loan = new Loan(book, user, LocalDate.now(), LocalDate.now().plusWeeks(2));
            loanService.addLoan(loan);
            user.setCurrentLoans(user.getCurrentLoans() + 1);
            book.setAvailable(false);
            return new ResponseEntity<>(loan, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}