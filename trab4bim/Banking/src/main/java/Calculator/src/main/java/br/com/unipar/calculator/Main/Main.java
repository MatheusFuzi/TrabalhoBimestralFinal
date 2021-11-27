package br.com.unipar.calculator.Main;

import br.com.unipar.calculator.Entities.ScientificCalculator;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] options = {"Soma", "Subtração", "Divisão", "Multiplicação", "Raiz Quadrada", "Potencia"};        
        int option;
        double A, B, C;
        ScientificCalculator ScientificCalculator = new ScientificCalculator(); 
        option = JOptionPane.showOptionDialog(null, "Selecione a Operação", "Calculadora", JOptionPane.INFORMATION_MESSAGE, 0 , null, options, options[0]);
        switch(option){
            case 0 :
                A = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero para a soma!"));
                B = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero para a soma!"));
                C = ScientificCalculator.sum(A, B);
                JOptionPane.showMessageDialog(null, "A soma de "+ A +" + " + B +" é " + C);
                break;
            case 1 :
                A = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero para a subtração!"));
                B = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero para a subtração!"));
                C = ScientificCalculator.subtraction(A, B);
                JOptionPane.showMessageDialog(null, "A subtração de "+ A +" - " + B +" é " + C);
                break;
            case 2 :
                A = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero para a Divisão!"));
                B = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero para a Divisão!"));
                C = ScientificCalculator.division(A, B);
                JOptionPane.showMessageDialog(null, "A divisão de "+ A +" / " + B +" é " + C);
                break;
            case 3 :
                A = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero para a Multiplicação!"));
                B = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero para a Multiplicação!"));
                C = ScientificCalculator.multiplication(A, B);
                JOptionPane.showMessageDialog(null, "A multiplicação de "+ A +" X " + B +" é " + C);
                break;
            case 4 :
                A = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero para calcular a Raiz Quadrada!"));
                C = ScientificCalculator.squareRoot(A);
                JOptionPane.showMessageDialog(null, "A Raiz Quadrada de "+ A +" é " + C);
                break; 
            case 5 :
                A = Double.parseDouble(JOptionPane.showInputDialog("Informe a numero para potenciação!"));
                B = Double.parseDouble(JOptionPane.showInputDialog("Informe a Potencia!"));
                C = ScientificCalculator.potency(A, B);
                JOptionPane.showMessageDialog(null, A +"^"+ B +" é " + C);
                break; 
        }
    }
}
