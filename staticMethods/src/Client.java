public class Client {
    String name;
    int age;
    public static boolean isHuman;
    Client(){
        String name;
        int age;
    }
    public void printClientDetails(){
        System.out.println("Name :"+ name + "\nAge : "+age + "\nIs human :"+ (isHuman?"Yes":"No"));
    }
}
