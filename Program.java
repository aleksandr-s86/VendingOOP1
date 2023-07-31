import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product("twix", 95, 10,new GregorianCalendar(2023, 10, 12, 14, 00));
        Product product2 = new Product("snicers", 100, 010, new GregorianCalendar(2023, 11, 15, 13, 00));
        Product product3  = new Product("Picnic", 90, 010, new GregorianCalendar(2023, 10, 12, 15, 00));
        Product product4 = new Beverage("Sprite", 120, 10, new GregorianCalendar(2023, 11, 15, 12, 00), 0.5);
        Product product5 = new Food("sandwich food", 85, 10, 200,new GregorianCalendar(2023, 10, 10, 8, 00));
        Product product6 = new hotBeverage("cofee", 75, 10, 75, null, 150);
        

        Vending list = new Vending();
        List<Product> myList = new ArrayList<>();
        myList.add(product1);
        myList.add(product2);
        myList.add(product3);
        myList.add(product4);
        myList.add(product5);
        myList.add(product6);
        list.initProduct(myList);

        String name = "cofee";
        System.out.println(list.getProduct(name).toString());
    }
}
