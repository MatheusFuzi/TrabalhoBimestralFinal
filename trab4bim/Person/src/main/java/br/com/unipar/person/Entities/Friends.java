package br.com.unipar.person.Entities;

public class Friends extends Person{
    private String BornDate;
    
    public void Friends(){
        this.BornDate = "indefinido";
    }
    
    public void setBornDate(String value){
        this.BornDate = value;
    }
    public String getBornDate(){
        return this.BornDate;
    }
}
