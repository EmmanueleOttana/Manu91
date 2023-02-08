package it.develhope.javaBase.encapsulation2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Please enter name");
        String name = scanner.nextLine();

        System.out.println("Please enter last name");
        String surname = scanner.nextLine();

        System.out.println("Please enter height");
        double height = scanner.nextDouble();

        System.out.println("Please enter age");
        int age = scanner.nextInt();

        person.setName(name);
        person.setSurname(surname);
        person.setHeight(height);
        person.setAge(age);

        System.out.println(person.printPerson());

    }
}
