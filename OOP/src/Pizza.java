public class Pizza {
    String dough;
    String butter;
    String topping;


    //general constructor 1
    Pizza(String dough,String butter,String topping){
        this.dough = dough;
        this.butter = butter;
        this.topping = topping;
    }

    //pizza without butter
    Pizza(String dough,String topping){
        this.topping =topping;
        this.dough = dough;
    }
    public void cancelOrder(){
        System.out.println("Your order has been cancelled");
    }
}
