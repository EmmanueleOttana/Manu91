package it.develhope.javaBase.ifStatement4;

public class Person {

    int age;

    public Person() {
        this.age = (int)Math.floor(Math.random() * (80 - 5 + 1) + 5);
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