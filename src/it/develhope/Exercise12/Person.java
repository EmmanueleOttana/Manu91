package it.develhope.Exercise12;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
    static String name;
    static String surname;
    static double height;
    static int age;

    static void detailsPerson(){
        System.out.println("Person{"+
        " name = "+ name+
        ", surname = "+surname+
        ", height = "+height+
        ", age = "+ age+" }");
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name");
        name = scanner.nextLine();
        System.out.println("Please enter last name");
        surname = scanner.nextLine();
        System.out.println("Please enter height");
        height = scanner.nextDouble();
        System.out.println("Please enter age");
        age = scanner.nextInt();

        detailsPerson();
    }
}