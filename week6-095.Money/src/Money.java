
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        Money output = new Money(this.euros + added.euros, this.cents + added.cents);
        return output;
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        else if(this.euros > compared.euros){
            return false;
        }
        else{
            if(this.cents < compared.cents){
                return true;
            }
            return false;
        }
    }
    
    public Money minus(Money decremented){
        int diffCents;
        int diffEuros;
        
        if(less(decremented)){
            Money output = new Money(0,0);
            return output;
        }
        else{
            diffCents = this.cents - decremented.cents;
            if(diffCents < 0){
                diffCents = 100+diffCents;
                diffEuros = this.euros - decremented.euros - 1;
            }
            else{
                diffEuros = this.euros - decremented.euros;
            }
            
            Money output = new Money(diffEuros, diffCents);
            return output;
        }
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
