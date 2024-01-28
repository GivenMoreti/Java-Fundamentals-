// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Client client = new Client();
      client.name = "kenny";
      client.age = 23;
      Client.isHuman = false;   //static reference

        Client client2 = new Client();

      client.printClientDetails();
    }
}