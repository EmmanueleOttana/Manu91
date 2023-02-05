package it.develhope.JavaBase.Exercise7;

public abstract class Vehicle {
    String type;
    int numberOfWheels;


    public void showVehicleDetails(){
        System.out.printf("The %s has %d wheels", type, numberOfWheels);
    }
    public abstract void doVehicleSound();


}
