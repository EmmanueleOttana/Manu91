package it.develhope.javaAvanzato.annotations1;

public class Car {
    String modelName;
    int mileage;

    public Car(String modelName, int mileage) {
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @Deprecated
    void printCarDetails(){
        System.out.println("Car{ " +
                "modelName= " + modelName +
                ", mileage= " + mileage +
                " }");
    }

    void getCarDetails(){
        System.out.println("Car{ " + "modelName= " + modelName + " }");
        System.out.println("Car{ " + "mileage= " + mileage + " }");
    }

}
