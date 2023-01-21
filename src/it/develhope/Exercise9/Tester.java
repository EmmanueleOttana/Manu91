package it.develhope.Exercise9;

public class Tester {
    public static void main(String[] args) {
        Animal leone = new Animal();
        leone.constructor("leone");

        leone.animalSound();
        leone.animalSound("moreIntensive");
    }
}