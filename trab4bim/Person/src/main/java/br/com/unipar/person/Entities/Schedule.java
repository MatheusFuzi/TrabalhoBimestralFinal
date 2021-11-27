package br.com.unipar.person.Entities;

import java.util.Arrays;

public class Schedule extends Person{
    Person[] person;
    Known K;
    Friends F;
    private int QuantityofKnown; 
    private int QuantityofFriends;

    public int getQuantityofFriends() {
        return QuantityofFriends;
    }

    public void setQuantityofFriends(int QuantityofFriends) {
        this.QuantityofFriends = QuantityofFriends;
    }

    public int getQuantityofKnown() {
        return QuantityofKnown;
    }

    public void setQuantityofKnown(int QuantityofKnown) {
        this.QuantityofKnown = QuantityofKnown;
    }
    public void Schedule(int QuantityofPerson){
        person = new Person[QuantityofPerson];
        
        for(int i = 0; i == QuantityofPerson; i++){
            if(1 +(int)(Math.random()*2)==1){
               F  = new Friends();       
            }else if(1 +(int)(Math.random()*2)==2){
               K = new Known();
            } 
        }
    }
    
    public void addInformation(){        
    }
    public void printemail(){
        Arrays.stream(person).forEach(System.out::println);
    }
    public void printBirthday(){
        Arrays.stream(person).forEach(System.out::println);
    }
}
