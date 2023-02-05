package it.develhope.JavaBase.Exercise11;

import java.util.Arrays;

public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }

    public void getAddress() {
        System.out.println("Please enter the street of the residents");
    }
    public void getFloorsNumber() {
        System.out.println("How many floors does the resident have?");
    }
    public void getResidentsNames(){
        System.out.println("Please enter names of residents?");
    }
    public void getPrint(){
        System.out.println(String.format("The residence is located in %s, has %d floors and it's residents are: %s",address,floorsNumber, Arrays.toString(residentsNames)));
    }
}