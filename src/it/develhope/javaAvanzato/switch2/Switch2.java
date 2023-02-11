package it.develhope.javaAvanzato.switch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        List list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a command:");
            String string = scanner.nextLine();

            if (!string.equalsIgnoreCase("stop")) {
                switch (string.toLowerCase()) {
                    case "size":
                        System.out.println(list.size());
                        break;
                    case "clear":
                        list.clear();
                        break;
                    case "print":
                        System.out.println(list.toString());
                        break;
                    default:
                        list.add(string);
                }
            } else break;
        }
    }
}