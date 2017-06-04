
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky test = new NightSky(0.8, 100, 500);
        test.print();
        System.out.println("Stars in last print: " + test.starsInLastPrint());
    }
}