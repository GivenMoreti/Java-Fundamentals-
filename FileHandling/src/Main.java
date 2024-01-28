import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        File myFile = new File("info.txt");
        System.out.println(myFile.getPath());//info.txt
        System.out.println(myFile.getAbsolutePath());   //C:\Users\Given\IdeaProjects\FileHandling\info.txt
        System.out.println(myFile.lastModified()); //1702134794198
        System.out.println(myFile.canRead());//true
        System.out.println(myFile.isFile());    //true


        Scanner scan = new Scanner(System.in);

        if(myFile.exists()){

            try (FileWriter writer = new FileWriter("info.txt")) {
                System.out.println("Start typing now...");
                String myText = scan.nextLine();
                writer.append(myText);
                System.out.println("successfully written " + myText + " to " + myFile);
            }catch(IOException e) {
                e.printStackTrace();
            }catch(Exception e){
                System.out.println("Error writing to file");
            }

        }else{
            System.out.println(myFile+ " file does not exist");
        }

        //file reading
        //it works
        try(FileReader file = new FileReader("code.txt")){

               int info = file.read();
               while(info != -1){
                   info = file.read();
                   System.out.print((char)info);
               }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}