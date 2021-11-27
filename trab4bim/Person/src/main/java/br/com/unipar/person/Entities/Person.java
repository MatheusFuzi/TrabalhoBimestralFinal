package br.com.unipar.person.Entities;

public class Person {
    private String Name;
    private int Age;
    
    public void Person(String nome, int age){
        
    }
    public void Person(){
        this.Name = "Indefinido";
        this.Age = 0;         
    }
    public void setName(String value){
        this.Name = value;           
    }
    public String getName(){
        return this.Name;           
    }
        public void setAge(int value){
        this.Age = value;           
    }
    public int getAge(){
        return this.Age;           
    }
}
