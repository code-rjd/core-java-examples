package com.coderjd.abstraction.bank.service;

public abstract class BankService {

    public abstract void disburseLoan();

    public void openAccount(){
        System.out.println("Account open by generic bank...!!!");
    }
}
