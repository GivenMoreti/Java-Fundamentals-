import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //obj
        ProductItem car = new ProductItem("Laptop",55.36,"high speed car");

        //
        Cart cart =new Cart();
        cart.addToCart(car);
//cart content
        System.out.println(cart);
        for (ProductItem productItem :cart.getProducts()){
            System.out.println(productItem.getName() + " - R"+ productItem.getPrice());
        }




    }
}