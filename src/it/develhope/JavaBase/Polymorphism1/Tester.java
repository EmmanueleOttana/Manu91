package it.develhope.JavaBase.Polymorphism1;

public class Tester {
    public static void main(String[] args) {
        Animal leone = new Animal("leone");

        leone.animalSound();
        leone.animalSound("high");
    }
}