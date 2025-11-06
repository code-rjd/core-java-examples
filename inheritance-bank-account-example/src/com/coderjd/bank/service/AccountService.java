package com.coderjd.bank.service;

import com.coderjd.bank.model.Account;
import com.coderjd.bank.repository.AccountRepository;

import java.util.Set;

public class AccountService {

        private AccountRepository accountRepository = new AccountRepository();

        public Account openAccount() {
            // sysout -> msg and accept the data from user
            Account account = new Account();
            account.setAccountNo(1234);
            account.setFirstName("Avadhut");
            account.setSecondName("Lele");
            return accountRepository.openAccount(account);
        }

        public Account viewAccount(int accountNumber) {
            return accountRepository.getAccount(accountNumber);
        }
        public Set<Account> getAllAccounts() {
            return accountRepository.getAllAccounts();
        }
    }