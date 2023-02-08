package it.develhope.javaBase.plymorphism1;

public class Tester {
    public static void main(String[] args) {
        Animal leone = new Animal("leone");

        leone.animalSound();
        leone.animalSound("high");
    }
}