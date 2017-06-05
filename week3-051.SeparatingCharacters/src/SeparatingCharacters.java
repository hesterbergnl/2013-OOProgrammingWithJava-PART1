
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        while(i < name.length()){
            System.out.println((i+1) + ". character: " + name.charAt(i));
            i++;
        }
    }
}
