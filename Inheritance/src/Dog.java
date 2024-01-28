public class Dog extends Animal {
    //inherited attributes
    Dog(int legs,String type,String species){
        super(type,legs,species);       //references parent class
    }

    void cry(){
        System.out.println(species + " woofs");
    }
}
