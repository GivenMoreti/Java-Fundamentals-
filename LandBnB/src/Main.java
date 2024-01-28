// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        House garage = new House("Engen garage","petrol station",1200,"pta");
        House room101 = new House("Res Room 101","Res Room 101",5500,"Jhb");

        User tim = new User("tim");
        tim.userBook(garage);
//        tim.userBook(room101);
//        tim.userBook(room101);      //it must return already booked status
        User dan = new User("Dan");


//        get all the houses tim has booked
//        tim.getAllBooked();

        dan.userBook(room101);
        tim.userBook((room101));

    }
}