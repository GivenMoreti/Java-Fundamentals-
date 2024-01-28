import java.util.Scanner;

public class ConstructorStudent {

    String name;
    int age;
    String race;
    ConstructorStudent(String name,int age,String race){
       this.name = name;
       this.age = age;
       this.race = race;
    }
    //methods
    void login(){
        //prompt the user for login details.

        Scanner inputValues = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = inputValues.nextLine();

        System.out.println("Enter your password: ");
        String password = inputValues.nextLine();

        String credentials = username + "  " + password;
        System.out.println(credentials);
        System.out.println(username + " is logged in successfully");
    }
    void logout(){
        String logout;
        do{
            System.out.println("type the word logout..");
            Scanner word = new Scanner(System.in);

            logout = word.nextLine();
        }while(!logout.matches("logout"));

        //will only run on success logout.
        System.out.println(name + " is logged out.");
    }

    //fix for local and global variables
    //pass vars as params or
    //declare vars globally
}
