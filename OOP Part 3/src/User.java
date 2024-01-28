
public class User {
    private String name;
    private int age;
    public void setAge(int age){
        this.age = age;

    }
    //static block is used to load static values
    // called only once.
    static{
        boolean isRegistered = true;
    }
    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("your name is "+ name);
    }
    public void getAge(){

        System.out.println("your age is "+ age);
    }
}
