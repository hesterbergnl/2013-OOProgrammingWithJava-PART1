
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment){
        int priceDiff = ((this.squareMeters * this.pricePerSquareMeter)-(otherApartment.squareMeters * otherApartment.pricePerSquareMeter));
        if(priceDiff >= 0){
            return priceDiff;
        }
        return -1*priceDiff;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        int thisPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if(thisPrice > otherPrice){
            return true;
        }
        return false;
    }
}
