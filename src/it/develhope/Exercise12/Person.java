package it.develhope.Exercise12;

import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private double height;
    private int age;

    Scanner scanner = new Scanner(System.in);

    public String printPerson() {
        return "Person{ " +
                "name = " + name +
                ", surname = " + surname +
                ", height = " + height +
                ", age = " + age +
                " }";
    }

    public void getPersonDetails() {
        System.out.println("Please enter name");
        this.name = scanner.nextLine();
        System.out.println("Please enter last name");
        this.surname = scanner.nextLine();
        System.out.println("Please enter height");
        this.height = scanner.nextDouble();
        System.out.println("Please enter age");
        this.age = scanner.nextInt();
    }
}