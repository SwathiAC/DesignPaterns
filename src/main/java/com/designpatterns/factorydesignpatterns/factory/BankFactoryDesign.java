package com.designpatterns.factorydesignpatterns.factory;

import com.designpatterns.factorydesignpatterns.Interface.BankInterface;
import com.designpatterns.factorydesignpatterns.account.BusinessAccount;
import com.designpatterns.factorydesignpatterns.account.CheckingAccount;
import com.designpatterns.factorydesignpatterns.account.SavingAccount;
import com.designpatterns.factorydesignpatterns.Enum.AccountType;

import static com.designpatterns.factorydesignpatterns.Enum.AccountType.*;

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
