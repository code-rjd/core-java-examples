package com.coderjd.abstraction.bank.service;

public class SBIBankService extends BankService{

    @Override
    public void disburseLoan() {
        System.out.println("Loan is being disbursed by SBI style");
    }
    @Override //for specific this repeated class, even not declaring overring will work
            //bcz its already overridding the openAccount class from bank serivce
    public void openAccount(){
        System.out.println("Account open by SBI bank...!!!");
    }
}
