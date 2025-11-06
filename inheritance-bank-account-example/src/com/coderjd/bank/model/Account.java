package com.coderjd.bank.model;

public class Account {
    int accountNo;
    String firstName;
    String secondName;


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + secondName + '\'' +
                '}';
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}

