package br.com.unipar.bankaccount.Entities;

public class BankingAccount {
    private int AccountNumber;
    private double Balance;
    public void cashDeposit(double value){
        this.Balance += value;
    }
    public double cashout(double value){
        this.Balance -= value;
        return value;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
    
}
