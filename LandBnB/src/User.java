import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class User {
    String username;
    ArrayList<House>bookings = new ArrayList<House>();
    boolean isBooked;
    User(String username){
        this.username= username;
    }

    public void userBook(House house){     //book a house object
        if(this.bookings.contains(house)){
            System.out.printf("This house %s is already booked by %s",house.title,this.username);

        }else{
            this.bookings.add(house);
            house.isBooked = true;            //change booking status
            //        view booked house

            System.out.print(this.username + " booked ");
            house.getDetails();
        }


    }

    public void cancelBooking(House house){
        System.out.println("Are you sure you want to cancel a booking Y/N?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if(Objects.equals(answer, "y")){
            this.bookings.remove(house);
            house.isBooked= false;
            System.out.println("Booking cancelled");
            house.getDetails();
        }else{
            System.out.println("you did not cancel.");
        }
    }
    public void getAllBooked(){
        System.out.println(this.username + " has booked the following houses: ");
        for(int i = 0;i< bookings.size();i++){
            System.out.println(bookings.get(i).title);
        }
    }


}
