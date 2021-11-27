package br.com.unipar.banking.Exceptions;

public class IncompatibleBalance extends RuntimeException{

    public IncompatibleBalance(){
        super("Valor solicitado menor que saldo!");
    }
}
