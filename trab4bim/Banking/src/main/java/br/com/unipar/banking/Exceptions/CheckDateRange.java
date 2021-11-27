package br.com.unipar.banking.Exceptions;

public class CheckDateRange extends RuntimeException{
    
    public CheckDateRange(){
        super("Data inicial menor que data final, verifique!");
    }
}
