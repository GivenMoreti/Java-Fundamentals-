import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter num 1");
            int num = scan.nextInt();

            System.out.println("Enter num 2");
            int num2 = scan.nextInt();

            int result = num / num2;  //arithmeticException
            System.out.println(result);

        } catch (ArithmeticException ex) {

            System.out.println("division by zero");

        } catch (InputMismatchException ex) {

            System.out.println("invalid divisor");
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Thanks for playing");
        }
    }
}