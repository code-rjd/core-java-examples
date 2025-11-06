package com.coderjd.bank.repository;

import com.coderjd.bank.model.SavingsAccount;

public class SavingsAccountRepository extends AccountRepository {


        final double DEFAULT_INTEREST_RATE = 4.5;

        public double calculateInterest(SavingsAccount account) {
            return account.getBalance() * (DEFAULT_INTEREST_RATE/100);
        }
        //,.....
    }
