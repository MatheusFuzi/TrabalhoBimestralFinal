package br.com.unipar.banking.Entities;

import java.util.Date;

public class CheckingAccount extends BankingAccount{
   
    private double OverdraftLimit = 500.00; 
    
    public double getOverdraftLimit(){
        return this.OverdraftLimit;
    };
}
