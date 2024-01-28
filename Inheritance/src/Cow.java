public class Cow extends Animal{
    boolean horns;  //local attribute

    //inherited attributes
    Cow(int legs,String type,String species,boolean horns){
        super(type, legs,species);
    }
//    @override method
    void cry(){
        System.out.println(species + " muuu");
    }



}
