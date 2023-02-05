package it.develhope.JavaBase.Regex2;

public class Regex2 {
    public static void main(String[] args) {
        String suond = "tup tuup tuuup tuuuup";

        System.out.println(suond.replaceAll("[u]?uu","X"));
    }
}
