public class Admin extends User {
    boolean isAdmin;


    Admin(boolean isAdmin,String username,int age){
        super(username,age);    //calls the parent User constructor
        this.isAdmin = isAdmin;
    }
    void getAdmin(){
        System.out.printf("Admin %s is %s years old",this.username,this.age);
    }


}
