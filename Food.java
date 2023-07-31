import java.util.Calendar;

public class Food extends Product {
 
    double weight;

    public Food (String name, int price, int quantity, double weight, Calendar bestBefore) {
        super(name,price,quantity, bestBefore);
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Food [name=" + getName() + ", price=" + getPrice() + ", quantity=" + getQuantity() + ", weight =" + weight +", bestBefore=" + bestBefore.get(Calendar.YEAR)+"/"+
        bestBefore.get(Calendar.MONTH)+ "/"+ bestBefore.get(Calendar.DAY_OF_MONTH)+"]";
    }
}
