public class Reformatory {
    private int count = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        this.count += 1;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(this.weight(person) + 1);
    }
    
    public int totalWeightsMeasured(){
        return this.count;
    }
}
