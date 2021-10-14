package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public int balance = 0;

    public void deposit(int x) { this.balance += x; }
    public void withdraw(int x) { this.balance -= x; }
    public int getBalance() { return this.balance;}
}
