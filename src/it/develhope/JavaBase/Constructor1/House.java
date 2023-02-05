package it.develhope.JavaBase.Constructor1;

public class House {
    public String address;
    public int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("The object house has been created");
    }
}
