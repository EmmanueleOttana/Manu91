package it.develhope.Exercise7;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();

        car.detailsCar(4,5,17000.99);
        boat.detailsBoat(203,7.3);

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
