package com.coderjd.bank.service;

import com.coderjd.bank.model.SavingsAccount;
import com.coderjd.bank.repository.SavingsAccountRepository;

public class SavingsAccountService extends AccountService{
    SavingsAccountRepository savingsAccountRepository = new SavingsAccountRepository();

    public double calculateInterest(SavingsAccount account) {
        return savingsAccountRepository.calculateInterest(account);
    }
}
