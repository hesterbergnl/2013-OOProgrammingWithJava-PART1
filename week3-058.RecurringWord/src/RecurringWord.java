
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        String item;
        
        while(true){
            System.out.println("Type a word: ");
            item = reader.nextLine();
            if(words.contains(item)){
                break;
            }
            words.add(item);
        }
        System.out.println("You gave the word " + item + " twice");
    }
}
