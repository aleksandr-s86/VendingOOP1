import java.util.Calendar;

public class Beverage extends Product {

    double volume;
 
    public Beverage(String name, int price, int quantity, Calendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Beverage [name=" + getName() + ", price=" + getPrice() + ", quantity=" + getQuantity() + ", volume =" + volume +", bestBefore=" + bestBefore.get(Calendar.YEAR)+"/"+
        bestBefore.get(Calendar.MONTH)+ "/"+ bestBefore.get(Calendar.DAY_OF_MONTH)+"]";
    }
}
    
       

   