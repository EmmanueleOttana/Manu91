package it.develhope.JavaBase.Exercise7;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car(4,5,17000.99);
        Boat boat = new Boat(203,7.3);

        car.showVehicleDetails();
        System.out.println();
        car.doVehicleSound();
        System.out.println();
        boat.showVehicleDetails();
        System.out.println();
        boat.doVehicleSound();
        System.out.println();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
