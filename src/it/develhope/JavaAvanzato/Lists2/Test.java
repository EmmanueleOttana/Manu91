package it.develhope.JavaAvanzato.Lists2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <Integer> divisorsOf52 = new ArrayList<>();

        for (int i = 1; i < 52; i++) {
            if ( 52 % i == 0){ divisorsOf52.add(i) ;}
        }

        List <Integer> randomNumbers = new ArrayList<>(Arrays.asList(1, 60, 13, 12));

        randomNumbers.addAll(divisorsOf52);

        System.out.println(randomNumbers.toString());
        System.out.println(randomNumbers.size());

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.indexOf(randomNumbers.get(i)) != i) {
                randomNumbers.remove(i);
            }
        }
        System.out.println(randomNumbers.toString());
        System.out.println(randomNumbers.size());

        randomNumbers.sort((o1, o2) -> {return o2 - o1 ;});

        System.out.println(randomNumbers.toString());
    }
}