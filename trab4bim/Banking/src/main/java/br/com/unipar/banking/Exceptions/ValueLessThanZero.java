package br.com.unipar.banking.Exceptions;

public class ValueLessThanZero extends RuntimeException{
    public ValueLessThanZero(){
        super("Valor menor que zero!");
    }
}
