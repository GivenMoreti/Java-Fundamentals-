public class Main {
    public static void main(String[] args) {

        //object is anything that can be described.
        //object is an instance of a class
        //contains methods and attributes/props

        //student object without using constructors
        Student myStudent = new Student();
        myStudent.name = "Kane";
        System.out.println(myStudent.name);
        myStudent.addModules();

        Student mySecStudent = new Student();
        mySecStudent.name = "kim";
        System.out.println(mySecStudent.name);


        //applying constructors to Constructor class
        ConstructorStudent student1 = new ConstructorStudent("Mike",23,"black");
        System.out.println("Student 1 name is "+student1.name);
//        student1.login();
//        student1.logout();



        //PIZZA OBJECT
        Pizza myPizza = new Pizza("small","rama","paperonni");

        System.out.println(myPizza.topping);

        Pizza butterLessPizza = new Pizza("large","cheese");
        System.out.println(butterLessPizza.topping);

        myPizza.cancelOrder();
        //FOOD ARRAY to store array of objects STARTS HERE
        //FoodArray[] bucket = new FoodArray[5];  //first method.


        //objects
        FoodArray food1 = new FoodArray("Mayo",2.0,"pink","cold");
        FoodArray food2 = new FoodArray("Apple",1.2,"green","snack");
        //second method of declaration.
        FoodArray[] bucket = {food1,food2};
        System.out.println(bucket[0].name);

        //created 2 classes Profile and Register
        //the idea is to register users profiles.


        Register account = new Register("Kim@gmail.com","ryenkdgl");
        Register account2 = new Register("dan@lok","password12");

        Profile myProfiles = new Profile(); //the Profile class contains the saveProfileMethod
        myProfiles.saveProfile(account);
        myProfiles.saveProfile(account2);



    }
}

