package it.develhope.whileLoop2;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         while (true) {
             System.out.println("Please enter a command");
             String value = scanner.nextLine();
             if ( !value.equals("stop") ){
                 System.out.println(value);
             } else { break;}
        }
    }
}