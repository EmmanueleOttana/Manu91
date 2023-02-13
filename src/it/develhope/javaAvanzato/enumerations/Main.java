package it.develhope.javaAvanzato.enumerations;

public class Main {
    public static void main(String[] args) {

        for (Month value : Month.values()) {
            if (String.valueOf(value).endsWith("y")){
                System.out.println(value + " ends with y");
            }else System.out.println(value + " doesn't end with y");
        }
    }
}