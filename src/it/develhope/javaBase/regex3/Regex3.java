package it.develhope.javaBase.regex3;

public class Regex3 {
    public static void main(String[] args) {
        String capacity = "are you able to climb, are you able to swim or are you able to fly?";

        System.out.println(capacity.replaceAll("\sare","_XYZ"));
        //OPPURE
        System.out.println(capacity.replaceAll(" are","_XYZ"));
    }
}
