package br.com.unipar.banking.Exceptions;

public class NullDateException extends RuntimeException{
    
    public NullDateException(){
        super("Data invalida Verifique");
    }
}
