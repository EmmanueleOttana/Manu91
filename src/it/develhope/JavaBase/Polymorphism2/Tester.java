package it.develhope.JavaBase.Polymorphism2;

public class Tester {
    public static void main(String args[]) {

        Animal animal = new Animal("Animal");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}