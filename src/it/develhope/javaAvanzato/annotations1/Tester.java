package it.develhope.javaAvanzato.annotations1;

public class Tester {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Car car = new Car("Bmw",70000);

        car.printCarDetails();
        car.getCarDetails();

    }
}