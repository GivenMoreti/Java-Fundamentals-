public class FoodArray {
    String name;
    double mass;
    String color;
    String type;

    //a constructor
    FoodArray( String name, double mass, String color, String type){
        this.color = color;
        this.mass = mass;
        this.type = type;
        this.name = name;

    }

    void cook(){
        System.out.println("cooking...");
    }
    void store(){
        System.out.println("storing...");
    }
}
