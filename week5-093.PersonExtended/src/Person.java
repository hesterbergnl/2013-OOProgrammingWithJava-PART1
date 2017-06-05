import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name){
        this(name, Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Person(String name, MyDate birthday){
        this(name, birthday.getDay(), birthday.getMonth(), birthday.getYear());
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int curDay = Calendar.getInstance().get(Calendar.DATE);
        int curMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        MyDate curDate = new MyDate(curDay, curMonth, curYear);
        return birthday.differenceInYears(curDate);
    }
    
    public boolean olderThan(Person compared) {
        //compare the ages based on birthdays
        return this.birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
}
