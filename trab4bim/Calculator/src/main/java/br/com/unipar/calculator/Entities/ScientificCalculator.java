package br.com.unipar.calculator.Entities;

public class ScientificCalculator extends Calculator{

    public double squareRoot(double A){
       return Math.sqrt(A);
    }
    public double potency(double A, double B){
        return Math.pow(A,B);   
    }
}
