//Реализуйте класс товар,содержащий в себе данные о товаре и торговый автомат,\
//содержащий в сеье методы initProducts(List<Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

/*В класс Beverage добавить поле объем (double volume), а в класс Food - масса (double weight), добавить заполнение в конструктор,
добавтиь их в вывод toString()
Создать наследника класса Beverage ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат наследник от класса ТорговыйАвтомат и реализовать перегруженный метод 
getProduct(String name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/
import java.util.ArrayList;
import java.util.List;

public class Vending {
    
    List<Product>listProduct = new ArrayList<>();


    public void initProduct(List<Product>myList){
        listProduct = myList;
    }

    public Product getProduct(String name){
        for (Product el : listProduct) {
            if(el.getName().equals(name)){
                return el;
            }
        } 
        return null;       
            
        }
    }

