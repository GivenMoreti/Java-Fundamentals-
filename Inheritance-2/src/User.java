public class User {
    String username;
    int age;
    User(String username,int age){
        this.username = username;
        this.age = age;
    }
    public void getAge(){
        System.out.println(this.age);
    }
    void getUser(){
        System.out.printf("%s is %s years old ",this.username,this.age);
    }
}
