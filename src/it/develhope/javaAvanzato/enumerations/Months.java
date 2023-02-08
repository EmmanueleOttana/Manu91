package it.develhope.javaAvanzato.enumerations;

public class Months {
    public static void main(String[] args) {

        enum month {
            January, February, March, April, May, June,
            July, August, September, October, November, December
        }

        for (month value : month.values()) {
            if (String.valueOf(value).endsWith("y")){
                System.out.println(value + " ends with y");
            }else System.out.println(value + " doesn't end with y");
        }
    }
}