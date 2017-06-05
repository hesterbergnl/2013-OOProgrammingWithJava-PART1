
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        
        Scanner reader = new Scanner(System.in);
        String newName;
        String newNumber;
        String subString;
        ArrayList<Student> list =  new ArrayList<Student>();
        
        while(true){
            System.out.println("name: ");
            newName = reader.nextLine();
            if(newName.isEmpty()){
                break;
            }
            System.out.println("studentnumber: ");
            newNumber = reader.nextLine();
            list.add(new Student(newName,newNumber));
        }
        
        for(Student name: list){
            System.out.println(name);
        }
        
        System.out.println("Give search term: ");
        subString = reader.nextLine();
        System.out.println("Result: ");
        for(Student item: list){
            if(item.getName().contains(subString)){
                System.out.println(item);
            }
        }
    }
}