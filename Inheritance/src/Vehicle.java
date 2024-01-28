public class Vehicle {
    double speed;
    String name;
    String shape;
    Vehicle(String shape,String name,double speed){
        this.name = name;
        this.shape = shape;
        this.speed = speed;
    }

    void go(){
        System.out.println("vehicle " + name + " is moving");
    }
}
