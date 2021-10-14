package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public int balance = 0;
    public Account() {
        this.balance = balance;
    }

    public void deposit(int x) { this.balance += x; }
    public int getBalance() { return this.balance;}
}
