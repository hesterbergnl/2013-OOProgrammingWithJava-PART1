/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Bird {
    private String birdName;
    private String latinName;
    private int observationNumber;
    
    public Bird(String name, String latinName){
        this.birdName = name;
        this.latinName = latinName;
        this.observationNumber = 0;
    }
    
    public void BirdSighting(){
        this.observationNumber++;
    } 
    
    public String getName(){
        return this.birdName;
    }
    
    public String toString(){
        return this.birdName + " (" + this.latinName + ") :" + this.observationNumber + " observations";
    }
}
