
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //a class acquires the attributes of another

        Car car1 = new Car("hatch","BMW",240);
        car1.go();

        Bicycle bike = new Bicycle("Sports","BMX",120);
        bike.go();

        System.out.println(bike.name);
        System.out.println(bike.speed);
        System.out.println(car1.speed);

        //ANIMAL CLASS
        //object cow1
        Cow cow1 = new Cow(4,"herbivore","cows",true);

        cow1.cry();

        Dog dog1 = new Dog(4,"Omnivores","Dogs");
        dog1.cry();
    }
}