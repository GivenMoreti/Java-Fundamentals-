public class Student {
    String name;
    char grade;
    boolean isRegistered;
    String course;

    //a student has the authority to:
    //these are user defined and will be constructed to actually perform such actions

    void deregister() {
        System.out.println("deregistered");
    }

    void register() {
        System.out.println("registered");
    }

    void addModules() {
        System.out.println("adding modules");
    }
}
