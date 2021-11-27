package br.com.unipar.bankaccount.Entities;

public class CheckingAccount extends BankingAccount{
    private double OperatingFee;
    @Override
    public void cashDeposit(double value){     
        super.setBalance(super.getBalance() + value);
    }
    @Override
    public double cashout(double value){
        super.setBalance(super.getBalance() - value);
        return super.getBalance();
    }
}
