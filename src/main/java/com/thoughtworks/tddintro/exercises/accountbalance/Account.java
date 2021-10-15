package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public int balance;

    public void deposit(int x) { this.balance += x; }

    public void withdraw(int x) {
        if(this.balance >= x) {
            deposit(-x);
        }
    }

    public int getBalance() { return this.balance;}
}
