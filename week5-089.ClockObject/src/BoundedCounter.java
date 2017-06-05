
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int upperLimit;
    private int value;
    
    
    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        return String.format("%02d", this.value);
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int setPoint){
        if((0 <= setPoint) && (setPoint <= this.upperLimit)){
            this.value = setPoint;
        }        
    }
}
