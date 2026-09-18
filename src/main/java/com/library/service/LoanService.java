package com.library.service;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {
    private List<Loan> loans = new ArrayList<>();

    public List<Loan> getAllLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public boolean canUserBorrowBook(User user, Book book) {
        return user.getCurrentLoans() < user.getLoanLimit() && book.isAvailable();
    }
}