package br.com.unipar.person.Entities;

public class Known extends Person{
    private String Email;
    
    public void Known(){
        this.Email = "indefinido";
    }
    
    public void setEmail(String value){
        this.Email = value;
    }
    public String getemail(){
        return this.Email;
    }
}
