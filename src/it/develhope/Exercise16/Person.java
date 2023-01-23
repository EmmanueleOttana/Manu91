package it.develhope.Exercise16;

import java.util.Random;

public class Person {

    int age;

    public Person(int min, int max) {
        this.age = (int)Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println( String.format("The person's age is %d years old",this.age));
    }

    public String getLifeStage() {
        if (this.age <= 12) {
            return "child";
        } else if (this.age > 12 && this.age < 20) {
            return "teen";
        } else if (this.age > 19 && this.age < 60) {
            return "adult";
        } else{
            return "senior adult";
        }
    }

}