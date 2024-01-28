import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> food = new ArrayList<String>();
//        food.add("A");
//        food.add("pizza");
//        food.set(0,"sushi");
//        System.out.println(food.size());
//        food.remove(1);
//
//        for(int i = 0; i<food.size();i++){
//            System.out.println(food.get(i));
//        }

//    2d arraylists in java

//        ArrayList<String> food = new ArrayList();
//        food.add("pie");
//        food.add("kota");
//
//        ArrayList<String> drinks = new ArrayList();
//        food.add("juice");
//        food.add("coke");
//        food.add("pap");
//
//        ArrayList<ArrayList<String>> grocery = new ArrayList();
//        grocery.add(drinks);
//        grocery.add(food);

//        System.out.println(grocery.get(1))
//add items into the array and append them
// if user input is empty,pop the error!
        ArrayList<String> animals = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Add an animal to the list: ");

        while(animals.size() < 5){
            String animal = sc.nextLine();
            if(animal.isEmpty()){
                System.out.print("Invalid!");

            }else{
                animals.add(animal);
            }

        }
//        prints everything into a new line.
        for(String i:animals){
            System.out.println(i);
        }
        System.out.println("I love java deeply");





}
}