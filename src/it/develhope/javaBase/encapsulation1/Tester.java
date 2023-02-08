package it.develhope.javaBase.encapsulation1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        house.getAddress();
        String address = scanner.nextLine();

        house.getFloorsNumber();
        int floorsNumber = scanner.nextInt();
        scanner.nextLine();

        house.getResidentsNames();
        String[] residentsNames = scanner.nextLine().split(" ");

        house.setAddress(address);
        house.setFloorsNumber(floorsNumber);
        house.setResidentsNames(residentsNames);

        house.getPrint();
    }
}