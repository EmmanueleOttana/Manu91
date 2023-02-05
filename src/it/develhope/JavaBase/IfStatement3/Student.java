package it.develhope.JavaBase.IfStatement3;

import java.util.Random;

public class Student {
    Random random = new Random();
    String name;
    int age;
    int randomNumber;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void guessingAge() {
        this.randomNumber = random.nextInt(36);
        System.out.println(String.format("I generated random number %d for student %s", this.randomNumber, this.name));
        if (randomNumber < age) {
            System.out.printf("The number generated for student %s is less than his age", name);
        }else if (randomNumber > age){
            System.out.printf("The number generated for student %s is greater than his age", name);
        }else{
            System.out.printf("The number generated for student %s equals his age", name);}

    }
}

