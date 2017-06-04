import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int [] original = {1,2,3,4};
        int [] reverse = reverseCopy(original);
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copied: "+ Arrays.toString(reverse));
         
    }
    
    public static int[] reverseCopy(int[] array){
        int i;
        int[] revArray = new int[array.length];
        for(i=array.length-1;i>=0;i--){
            revArray[(array.length-1)-i] = array[i];
        }
        return revArray;
    }
    
    public static int[] copy(int[] array){
        int i;
        int[] returnArray = new int[array.length];
        
        for(i=0;i<array.length;i++){
            returnArray[i] = array[i];
        }
        
        return returnArray;
    }
    
    
}
