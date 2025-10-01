package com.designpatterns.factorydesignpatterns;

import com.designpatterns.factorydesignpatterns.Enum.AccountType;
import com.designpatterns.factorydesignpatterns.Interface.BankInterface;
import com.designpatterns.factorydesignpatterns.factory.BankFactoryDesign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDesignPatternsApplication {

  public static void main(String[] args) {
    SpringApplication.run(FactoryDesignPatternsApplication.class, args);


  BankFactoryDesign bankFactoryDesign = new BankFactoryDesign();


  BankInterface savings = bankFactoryDesign.getaccount(AccountType.SAVING);
          savings.deposit(1000);
          savings.checkBalance();
          savings.withdraw(500);
          savings.checkBalance();
          savings.allowBalnce(300);
          savings.checkBalance();

  BankInterface checking = bankFactoryDesign.getaccount(AccountType.CHECKING);

    checking.deposit(200);
    checking.checkBalance();
    checking.withdraw(100);


  }
}
