package it.develhope.Exercise36;

import java.util.Arrays;

public class Regex4 {
    public static void main(String[] args) {
        String randomLetters = "x3z ? xYz ! R1 && __";

        System.out.println(randomLetters.replaceAll("[a-z]|[0-9]","*"));
    }
}