package it.develhope.javaBase.polymorphism2;

public class Cow extends Animal{
    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("The sound of the cow is Graaaa");
    }
}
