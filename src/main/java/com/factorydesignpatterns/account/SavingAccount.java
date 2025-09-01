package com.example.factorydesignpatterns.account;

import com.example.factorydesignpatterns.Interface.BankInterface;

public class SavingAccount implements BankInterface {

    private double balance;

    public SavingAccount() {
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

  @Override
  public void allowBalnce(double amount) {
    balance = balance + amount + 2.5;
    System.out.println("Allowed balance is " + balance);
  }
}
