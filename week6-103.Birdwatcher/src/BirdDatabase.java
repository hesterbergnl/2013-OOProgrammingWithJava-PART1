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

public class BirdDatabase {
    ArrayList<Bird> database = new ArrayList<Bird>();
    
    public BirdDatabase(){
        
    }
    
    public void addBird(Scanner reader){
        String birdName;
        String latinName;
        
        System.out.println("Name: ");
        birdName = reader.nextLine();
        System.out.println("Latin Name: ");
        latinName = reader.nextLine();
                
        this.database.add(new Bird(birdName,latinName));
    }
    
    public void observation(Scanner reader){
        String inputName;
        Bird placeholder = new Bird("","");
        
        System.out.println("What was observed:? ");
        inputName = reader.nextLine();
        
        findBird(inputName).BirdSighting();
        
        placeholder = findBird(inputName);
        
        if(placeholder.getName().equals("NULL")){
            System.out.println("Is not a bird!");
        }
    }
    
    public void statistics(){
        for(Bird bird:this.database){
            System.out.println(bird);
        }
    }
    
    public void show(Scanner reader){
        String birdName;
        Bird placeholder = new Bird("","");
        
        System.out.println("What? ");
        birdName = reader.nextLine();
        
        placeholder = findBird(birdName);
        
        if(placeholder.getName() == "NULL"){
            System.out.println("Is not a bird!");
        }
        else{
            System.out.println(placeholder);
        }
    }
    
    public Bird findBird(String birdName){
        for(Bird bird:this.database){
            if(StringUtils.included(bird.getName(), birdName)){
                return bird;
            }
        }
        return new Bird("NULL", "NULL");
    }
}
