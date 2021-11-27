package br.com.unipar.calculator.Entities;

public abstract class Calculator {
    public double sum(double A, double B){
        return A + B;
    }
    public double subtraction(double A, double B){
        return A - B; 
    }
    public double division(double A, double B){
        return A / B;     
    }
    public double multiplication(double A, double B){
        return A * B;      
    }    
}
