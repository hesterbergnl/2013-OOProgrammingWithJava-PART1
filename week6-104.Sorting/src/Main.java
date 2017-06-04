
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] nums = {6, 3, 0, -1, 4};
        
        System.out.println("Smallest: " + indexOfTheSmallest(nums));
        swap(nums,0,3);
        System.out.println("Smallest: " + indexOfTheSmallest(nums));
        sort(nums);
        for(int i = 0; i<nums.length;i++){
            System.out.println(""+nums[i]);
        }
    }
    
    public static int smallest(int[] array){
        return array[indexOfTheSmallest(array)];
    }
    
    public static int indexOfTheSmallest(int [] array){          
        return indexOfTheSmallestStartingFrom(array,0);
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallestVal = array[index];
        int smallestIndex = index;
        
        for(int i = index;i<array.length;i++){
            if(array[i] < smallestVal){
                smallestVal = array[i];
                smallestIndex = i;
            }
        }
            
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int tempStorage;
        
        tempStorage = array[index1];
        array[index1] = array[index2];
        array[index2] = tempStorage;
    }
    
    public static void sort(int[] array){
        int swapIndex1;
        
        for(int i=0;i<array.length;i++){
            swapIndex1 = indexOfTheSmallestStartingFrom(array,i);
            swap(array,swapIndex1,i);                      
        }
    }
}
