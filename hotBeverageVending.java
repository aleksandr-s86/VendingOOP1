
import java.util.ArrayList;
import java.util.List;

public class hotBeverageVending extends Vending {
    
    public Product getProduct(String name, int volume, int temperature){
        List<Product>tempList = this.getProduct(name,volume,temperature);
        ArrayList<Product> result = new ArrayList<>();
        for (Product tempItem : tempList) {
            hotBeverage item = (hotBeverage) tempItem;
            if (item.getTemperature().equals(temperature)) {
                result.add(tempItem);
            }
        }
        return result;
    }
}
    