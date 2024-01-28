import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;      //declare obj without constructor function

        System.out.println("What animal do you want? ");
        System.out.println("1 = dog, 2 = cat");
        int choice = scanner.nextInt();

        if (choice == 1) {

            animal = new Dog();
            animal.cry();
        }else if(choice == 2){
            animal = new Cat();
            animal.cry();

        }else{
            animal = new Animal();
            System.out.println("invalid choice...");
            animal.cry();
        }
    }
}