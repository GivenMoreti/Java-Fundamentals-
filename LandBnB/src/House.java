import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class House {
    String title,description,location;
    double price;
    boolean isBooked = false;

    House( String title, String description, double price, String location){
        this.title= title;
        this.description=description;
        this.location=location;
        this.price = price;

    }
    public void getDetails(){
        System.out.println(this.title + " " + this.price + " "+ (this.isBooked? "Booked":"Unbooked"));
    }

}
