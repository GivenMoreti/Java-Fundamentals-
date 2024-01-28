public class Friend {
    String name;
    static int numberOfFriends;     //declare the var
    Friend(String name){
        this.name = name;
        numberOfFriends++;  //increment everytime an object is created
    }

    static void displayFriends(){
        System.out.println("You have "+ numberOfFriends + " friends");
    }
}
