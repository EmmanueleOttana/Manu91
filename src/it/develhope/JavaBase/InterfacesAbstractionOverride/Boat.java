package it.develhope.JavaBase.InterfacesAbstractionOverride;

public class Boat extends Vehicle{

    double maxKnotsSpeed;
    int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.printf("The sound of the %s is bruuu bruuu",type);
    }
    public Boat(int weight,double maxSpeed){
        this.boatKilosWeight = weight;
        this.maxKnotsSpeed = maxSpeed;
        this.type = "Boat";
    }
    public String getBoatWeightAndSpeed(){
        return "The "+type+" weighs "+boatKilosWeight+" kg and has a maximum speed of "+maxKnotsSpeed+" knots";
    }

}
