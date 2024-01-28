import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<ProductItem> products;

    public Cart(){
       this.products = new List<ProductItem>();



    }
    public void addToCart(ProductItem productItem){
        products.add(productItem);
        System.out.println("Product " + productItem.name + " added to cart");
    }
    public List<ProductItem> getProducts(){
        return products;
    }
}
