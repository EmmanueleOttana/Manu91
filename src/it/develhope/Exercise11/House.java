package it.develhope.Exercise11;

import java.util.Scanner;

public class House {
    private int floorsNumber;
    private String address;
    private String residentsNames;
    Scanner scanner = new Scanner(System.in);

    public void getAddress() {
        System.out.println("Please enter the street of the residents");
        this.address = scanner.nextLine();
    }
    public void getFloorsNumber() {
        System.out.println("How many floors does the resident have?");
        this.floorsNumber = scanner.nextInt();
        scanner.nextLine();
    }
    public void getResidentsNames(){
        System.out.println("Please enter names of residents?");
        this.residentsNames = scanner.nextLine();
    }
    public void getPrint(){
        System.out.println(String.format("The residence is located in %s, has %d floors and it's residents are: %s",address,floorsNumber,residentsNames));
    }
}