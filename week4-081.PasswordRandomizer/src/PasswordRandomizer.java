import java.util.Random;
import java.util.ArrayList;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int upperLimit;
    private int pwLength;
    private String pw;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.pwLength = length;  
    }

    public String createPassword() {
        // write code that returns a randomized password
        char nextChar;
        int i = 0;
        this.pw = "";
        
        while(i<this.pwLength){
            nextChar = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            this.pw = this.pw + nextChar;
            i++;
        }
        
        return this.pw;
    }
}
