import java.util.ArrayList;
import java.util.List;

public class ProductItem {
    String name;
    double price;
    String description;


    public ProductItem(String name,double price,String description){
        this.name = name;
        this.price = price;
        this.description = description;

    }

    public String getName(){
        return this.name;
    }
    public  String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
}
