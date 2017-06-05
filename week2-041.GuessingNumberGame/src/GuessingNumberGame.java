
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        int flag = 0;
        int count = 0;
        
        while (flag == 0) {
            System.out.println("Guess a numer: ");
            count++;
            int guess = Integer.parseInt(reader.nextLine());
            
            if(guess < numberDrawn){
                System.out.println("The number is greater, guesses made: " + count);
            }
            else if (guess > numberDrawn){
                System.out.println("The number is lesser, guesses made: "+ count);
            }
            else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
              
        }
        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
                