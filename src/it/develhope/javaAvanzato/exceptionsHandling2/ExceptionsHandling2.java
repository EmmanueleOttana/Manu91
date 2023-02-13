package it.develhope.javaAvanzato.exceptionsHandling2;

import java.util.Scanner;

public class ExceptionsHandling2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter two number integers");
        int div1 = scanner.nextInt();
        int div2 = scanner.nextInt();
        try {
            System.out.println(div1/div2);
        }catch (ArithmeticException a){
            System.out.println("It is not possible to divide by 0");
        }

    }
}