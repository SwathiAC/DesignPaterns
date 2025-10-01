package com.designpatterns.factorydesignpatterns.Interface;

public interface BankInterface {

       void deposit(double amount);
       void withdraw(double amount);
       void checkBalance();
       default void allowBalnce(double amount){
            System.out.println("Allowed balance is 1000");
       };
}
