public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    
    
    public int differenceInYears(MyDate date){
        int difference;
        
        if(this.earlier(date)){
            MyDate temp = new MyDate(date.day, date.month, date.year);
            date.day = this.day;
            date.month = this.month;
            date.year = this.year;
            this.day = temp.day;
            this.month = temp.month;
            this.year = temp.year;
        }
        
        difference = this.year - date.year;
        if(this.month - date.month > 0){
            return difference;
        }
        else if(this.month - date.month < 0){
            return difference - 1;
        }
        else{
            if(this.day - date.day > 0){
                return difference;
            }
            else if(this.day - date.day < 0){
                return difference - 1;
            }
            else{
                return difference;
            }
        }
        
    }

}
