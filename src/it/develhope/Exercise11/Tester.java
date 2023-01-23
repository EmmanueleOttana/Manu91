package it.develhope.Exercise11;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        House house = new House();

        house.setAddress();
        house.setFloorsNumber();
        house.setResidentsNames();
        house.getPrint();
    }
}
