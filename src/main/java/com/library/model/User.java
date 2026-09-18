package com.library.model;

public class User {
    private String name;
    private String email;
    private int loanLimit;
    private int currentLoans;

    public User(String name, String email, int loanLimit) {
        this.name = name;
        this.email = email;
        this.loanLimit = loanLimit;
        this.currentLoans = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(int loanLimit) {
        this.loanLimit = loanLimit;
    }

    public int getCurrentLoans() {
        return currentLoans;
    }

    public void setCurrentLoans(int currentLoans) {
        this.currentLoans = currentLoans;
    }
}