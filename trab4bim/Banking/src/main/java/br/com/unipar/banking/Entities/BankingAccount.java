package br.com.unipar.banking.Entities;

import br.com.unipar.banking.Exceptions.*;
import java.time.LocalDate;
import java.util.Date;

public class BankingAccount {

    private double oldbalance;
    private double balance;
    
    public double extractByPeriod(LocalDate initialDate, LocalDate finalDate){
        if(initialDate.isAfter(finalDate)){
            throw new CheckDateRange();
        }else{
                return this.oldbalance;    
        }
    };
    
    public double getBankBalanceByDate(LocalDate date){
        return this.balance;
    };
    public double cashOut(Double value){
        if(value > this.balance){
        throw new IncompatibleBalance();
        }else if(value == 0.00){
            throw new ValueLessThanZero();
        }else{
        this.balance -= value;
        return this.balance;
        }
    };
    
    public double cashDeposit(Double value){
        if(value == 0.00){
            throw new ValueLessThanZero();
        }else{
        this.balance += value;
        this.oldbalance = this.balance;
        return this.balance;
        }
    };
    
}
