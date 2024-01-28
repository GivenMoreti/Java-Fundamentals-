public class Animal {
    int legs;
    String type, species;

    Animal(String type,int legs,String species){
        this.type = type;
        this.legs = legs;
        this.species = species;
    }
    void cry(){
        System.out.println(type +" cries");
    }



}
