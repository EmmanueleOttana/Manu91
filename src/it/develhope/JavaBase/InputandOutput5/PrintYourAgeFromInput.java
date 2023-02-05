package it.develhope.JavaBase.InputandOutput5;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.printf("Your age is: %d",age);
        input.close();
    }
}