package it.develhope.Exercise34;

public class Regex2 {
    public static void main(String[] args) {
        String suond = "tup tuup tuuup tuuuup";

        System.out.println(suond.replaceAll("[u]?uu","X"));
    }
}
