package it.develhope.Exercise9;

public class Animal {
    String animalName;

    public void constructor(String animalName){
        this.animalName = animalName;
    }
    public void animalSound(){
        System.out.println("Roarr!");
    };
   public void animalSound(String intensity){
        System.out.println("Roarrrrrrrr!");
    };

}
