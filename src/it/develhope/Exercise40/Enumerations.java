package it.develhope.Exercise40;

import java.time.*;

public class Enumerations {
    public static void main(String[] args) {
        enum months { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER }

        for (months month : months.values()) {
            if (month.toString().endsWith("Y")) {
                System.out.println(month.toString().toLowerCase() + " ends with y");
            }
        }
    }
}