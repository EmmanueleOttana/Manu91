package it.develhope.javaBase.polymorphism2;

public class Animal {
    public String animalName;

    public Animal (String animalName) {
        this.animalName = animalName;
    }

    public void animalSound() {
        System.out.println("default animal sound");
    }

}