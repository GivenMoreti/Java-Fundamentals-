import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     int highScore;String name;

//        try{
//            Scanner fileIn = new Scanner(new FileInputStream("code.txt"));
//            System.out.println("is there text in the file to read?"+ fileIn.hasNextLine());
//            highScore = fileIn.nextInt();
//            fileIn.nextLine();
//            name = fileIn.nextLine();
//
//            System.out.println("Name "+ name);
//            System.out.println("high Score "+ highScore);
//
//            System.out.println("is there text in the file to read? "+ fileIn.hasNextLine());
//            fileIn.close();
//            System.exit(0);
//
//        }catch (FileNotFoundException e){
//            System.out.println("File not found");
//        }
//starts here
        Scanner dataIn = new Scanner(System.in);
            int sumScores = 0;
            int sumPossible = 0;

            int count = 1;
            String exerciseName;
            int exerciseScore = 0,possiblePoints = 0;
            String answer;
            String[] exercises = new String[10];
            int[] scores = new int[10];
            int[] possibleArr = new int[10];

        try {
            do {
                    System.out.println();
                    System.out.println("name of exercise: " + count);
                    exerciseName = dataIn.nextLine();

                    System.out.println("total score received for exercise : " + count);
                    exerciseScore = dataIn.nextInt();

                    System.out.println("total points possible for exercise : " + count);
                    possiblePoints = dataIn.nextInt();
                    dataIn.nextLine();
                    System.out.println("Do you want to quit? ");
                    answer = dataIn.nextLine();
                    //assign values to arr
                    exercises[count] = exerciseName;
                    scores[count] = exerciseScore;
                    possibleArr[count] = possiblePoints;
                    count++;


            }while(!answer.equals("y"));        //if input is negative terminate loop

        }catch(Exception e){
            System.out.println("invalid input");
        }

            //display the results;
            System.out.println(" Name of exercise " + " Points Scored " + " Possible points");
            //read from array


            for(int i = 0;i< count;i++){
                System.out.printf(" %-9s  %9d %9d \n",exercises[i],scores[i],possibleArr[i]);
                sumScores += scores[i];
                sumPossible += possibleArr[i];
            }
            //print totals
            System.out.printf("Total sum %11d \nTotalPossible %17d",sumScores,sumPossible);

            /*
             *  Name of exercise  Points Scored  Possible points
             *null               0         0
             *quiz 1            12        15
             *quiz 2            13        15
             *Total sum          25
             *TotalPossible               30
                Process finished with exit code 0
             */




    }
}