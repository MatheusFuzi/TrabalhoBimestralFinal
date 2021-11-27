package br.com.unipar.banking.Main;

import br.com.unipar.banking.Entities.CheckingAccount;
import br.com.unipar.banking.Entities.SavingsAccount;
import br.com.unipar.banking.Exceptions.NullDateException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class Main {
    static int returtypeaccount;
    static int returtoption;
    static String Datei;
    static String Datef;
    static LocalDate df;
    static LocalDate di;
    static boolean exit = false;

    public static void main(String[] args) {
        String[] Account = {"Conta Corrente","Conta Poupança","Sair"};
        String[] options = {"Extrato por periodo","Saldo do dia","Saque","Deposito"};
        String[] options1 = {"Extrato por periodo","Saldo do dia","Saque","Deposito","Ver Limite Especial"};
        while(!exit){
        returtypeaccount = JOptionPane.showOptionDialog(null, "Escolha qual conta deseja", "Tipo de Conta",JOptionPane.WARNING_MESSAGE, 0, null,Account,Account[0]);
        switch(returtypeaccount){
            case 0:
                    CheckingAccount account = new CheckingAccount();
                    returtoption = JOptionPane.showOptionDialog(null, "Escolha a movimentação desejada", "Tipo de movimentação",JOptionPane.WARNING_MESSAGE, 0, null,options1,options1[0]);
                    switch(returtoption){
                        case 0:
                              Datei = JOptionPane.showInputDialog(null, "Insira a data inicial DD/MM/AAAA");
                              if(!isValid(Datei)){
                                  throw new NullDateException();
                              }else{
                                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                  di = LocalDate.parse(Datei, formatter); 
                              }
                              Datef = JOptionPane.showInputDialog(null, "Insira a data final DD/MM/AAAA");
                              if(!isValid(Datef)){
                                  throw new NullDateException();
                              }else{
                                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                  df = LocalDate.parse(Datei, formatter); 
                              }
                              double value1 = account.extractByPeriod(di, df);
                              JOptionPane.showMessageDialog(null, "o saldo entre "+di+" e "+df+" é "+value1);
                              break;
                        case 1:
                            Datei = JOptionPane.showInputDialog(null, "Insira a data DD/MM/AAAA");
                              if(!isValid(Datei)){
                                  throw new NullDateException();
                              }else{
                                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                  di = LocalDate.parse(Datei, formatter); 
                              }
                              double value2 = account.getBankBalanceByDate(di);
                              JOptionPane.showMessageDialog(null, "o saldo do dia "+di+" é "+value2);
                            break;
                        case 2:
                            String cash = JOptionPane.showInputDialog(null, "Valor desejado para saque");
                            double value3 = account.cashOut(Double.parseDouble(cash));
                            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso -"+ value3);
                            break;
                        case 3:
                            String cash1 = JOptionPane.showInputDialog(null, "Valor desejado para Deposito");
                            double value4 = account.cashDeposit(Double.parseDouble(cash1));
                            JOptionPane.showMessageDialog(null, "Debosito realizado com sucesso +"+ value4);
                            break;
                        case 4:
                            account.getOverdraftLimit();
                            break;
                    }break;
            case 1: 
                    SavingsAccount account1 = new SavingsAccount();
                    returtoption = JOptionPane.showOptionDialog(null, "Escolha a movimentação desejada", "Tipo de movimentação",JOptionPane.WARNING_MESSAGE, 0, null,options,options[0]);
                    switch(returtoption){
                        case 0:
                              Datei = JOptionPane.showInputDialog(null, "Insira a data inicial DD/MM/AAAA");
                              if(!isValid(Datei)){
                                  throw new NullDateException();
                              }else{
                                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                  di = LocalDate.parse(Datei, formatter); 
                              }
                              Datef = JOptionPane.showInputDialog(null, "Insira a data final DD/MM/AAAA");
                              if(!isValid(Datef)){
                                  throw new NullDateException();
                              }else{
                                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                  df = LocalDate.parse(Datei, formatter); 
                              }
                              double value1 = account1.extractByPeriod(di, df);
                              JOptionPane.showMessageDialog(null, "o saldo entre "+di+" e "+df+" é "+value1);
                              break;
                        case 1:
                            Datei = JOptionPane.showInputDialog(null, "Insira a data DD/MM/AAAA");
                              if(!isValid(Datei)){
                                  throw new NullDateException();
                              }else{
                                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                  di = LocalDate.parse(Datei, formatter); 
                              }
                              double value2 = account1.getBankBalanceByDate(di);
                              JOptionPane.showMessageDialog(null, "o saldo do dia "+di+" é "+value2);
                            break;
                        case 2:
                            String cash = JOptionPane.showInputDialog(null, "Valor desejado para saque");
                            double value3 = account1.cashOut(Double.parseDouble(cash));
                            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso -"+ value3);   
                            break;
                        case 3:
                            String cash1 = JOptionPane.showInputDialog(null, "Valor desejado para Deposito");
                            double value4 = account1.cashDeposit(Double.parseDouble(cash1));
                            JOptionPane.showMessageDialog(null, "Debosito realizado com sucesso +"+ value4);
                        break;      
                    }
            break;
            case 2:
                exit = true;
            break;
        }
    }
               
        
    }
    public static boolean isValid(String date) {
         try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d = LocalDate.parse(date, formatter);    
            return true;
         } catch (DateTimeParseException e) {
           return false;
         }   
      }   
}
