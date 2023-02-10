package it.develhope.javaAvanzato.whileLoop4;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 9 + 1);

        Scanner scanner = new Scanner(System.in);

        {
            System.out.println("Welcome!");
            while (true) {
                System.out.println("What number will it be?");
                if (number == scanner.nextInt()) {
                    System.out.println("Congratulations!");
                    break;
                }
            }
        }
    }
}