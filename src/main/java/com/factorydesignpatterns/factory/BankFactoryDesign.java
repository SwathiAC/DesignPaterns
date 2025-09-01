package com.example.factorydesignpatterns.factory;

import com.example.factorydesignpatterns.Enum.AccountType;
import com.example.factorydesignpatterns.Interface.BankInterface;
import com.example.factorydesignpatterns.account.BusinessAccount;
import com.example.factorydesignpatterns.account.CheckingAccount;
import com.example.factorydesignpatterns.account.SavingAccount;

import static com.example.factorydesignpatterns.Enum.AccountType.*;

public class BankFactoryDesign {

      public BankInterface getaccount(AccountType accountType){
        if (accountType.equals(SAVING)) {
          return new SavingAccount();
        } else if (accountType.equals(CHECKING)) {
          return new CheckingAccount();
        } else if (accountType.equals(BUSINESS)) {
          return new BusinessAccount();
        } else {
          throw new IllegalArgumentException("Unknown account type: " + accountType);
        }

      }
}
