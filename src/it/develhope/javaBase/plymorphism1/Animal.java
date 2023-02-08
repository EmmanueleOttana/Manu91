package it.develhope.javaBase.plymorphism1;

public class Animal {
    String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }
    public void animalSound(){
        System.out.println("Roarr!");
    };
   public void animalSound(String intensity){
       if(intensity == "high") System.out.println("Roarrrrrrrr!");
       else System.out.println("Cannot reproduce it properly in other cases!");
    }
}