package br.com.unipar.bankaccount.Entities;

public class SavingsAccount extends BankingAccount{
    private double limit;
    @Override
    public void cashDeposit(double value){     
        super.setBalance(super.getBalance() + value);
    }
    @Override
    public double cashout(double value){
        super.setBalance(super.getBalance() - value);
        return super.getBalance();
    }
    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }   
}
