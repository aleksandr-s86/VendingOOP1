import java.util.Calendar;

public class hotBeverage extends Beverage {

    int temperature;

    public hotBeverage(String name, int price, int quantity, int temperature, Calendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore, volume);
        this.temperature = temperature;
    }
    public double getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "hotBeverage [name=" + getName() + ", price=" + getPrice() + ", quantity=" + getQuantity() + ", volume =" + volume +
        ", temperature=" + temperature +" , bestBefore=" + bestBefore.get(Calendar.YEAR)+"/"+
        bestBefore.get(Calendar.MONTH)+ "/"+ bestBefore.get(Calendar.DAY_OF_MONTH)+"]";
    }
}

