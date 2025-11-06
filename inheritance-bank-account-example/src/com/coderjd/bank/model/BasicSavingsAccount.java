package com.coderjd.bank.model;

public class BasicSavingsAccount extends SavingsAccount{
    boolean isZeroBalanceAccount;
    int withdrawlLimit;

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "isZeroBalanceAccount=" + isZeroBalanceAccount +
                ", withdrawlLimit=" + withdrawlLimit +
                '}';
    }

    public boolean isZeroBalanceAccount() {
        return isZeroBalanceAccount;
    }

    public void setZeroBalanceAccount(boolean zeroBalanceAccount) {
        isZeroBalanceAccount = zeroBalanceAccount;
    }

    public int getWithdrawlLimit() {
        return withdrawlLimit;
    }

    public void setWithdrawlLimit(int withdrawlLimit) {
        this.withdrawlLimit = withdrawlLimit;
    }
}
