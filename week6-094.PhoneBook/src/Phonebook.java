/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.*;

public class Phonebook {
    private ArrayList<Person> book = new ArrayList<Person>();
    
//    public Phonebook(){
//        
//    }
    public void add(String name, String number){
        book.add(new Person(name, number));
    }
    
    public void printAll(){
        for(Person name: book){
            System.out.println(name);
        }
    }
    
    public String searchNumber(String name){
        for(Person item: book){
            if(item.getName() == name){
                return item.getNumber();
            }
        }
        return "number not known";
    }
}
