// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //no need to add object to call numberOfFriends
        // the class owns the static variable
        Friend friend1 = new Friend("Kane");
        Friend friend2 = new Friend("Given");
        Friend friend3 = new Friend("Kamogelo");


        Friend.displayFriends();    //You have 3 friends

        //other examples of static methods
        //Math.sqrt(a); which is owned by a Class Math
    }
}