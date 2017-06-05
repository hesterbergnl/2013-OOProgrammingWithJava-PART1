import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        BirdDatabase birdDatabase = new BirdDatabase();

        Scanner reader = new Scanner(System.in);

        String command;
    
        while(true){
            System.out.print("? ");
            command = reader.nextLine();
            if(StringUtils.included(command,"Quit")){
                break;
            }
            else if(StringUtils.included(command, "Add")){
                birdDatabase.addBird(reader);
            }
            else if(StringUtils.included(command, "Observation")){
                birdDatabase.observation(reader);
            }
            else if(StringUtils.included(command, "Statistics")){
                birdDatabase.statistics();
            }
            else if(StringUtils.included(command, "Show")){
                birdDatabase.show(reader);
            }
            else{
                System.out.println("Invalid command");
            }

        }
    }
}
