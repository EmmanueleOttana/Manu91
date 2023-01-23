package it.develhope.Exercise7;

public class Car extends Vehicle{
    int numberOfDoors;
    double carPrice;

    @Override
    public void doVehicleSound() {
        System.out.printf("The sound of the %s is brum brum",type);
    }
    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println();
        System.out.printf("The %s has %d doors",type, numberOfDoors);
    }
    public Car(int wheels,int doors,double price){
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
        this.type = "Car";
    }

}
