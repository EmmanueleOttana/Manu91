package it.develhope.JavaAvanzato.Arrays1;

import java.util.Arrays;

public class Test {
    static int[] genPrimeNum (int numToGenerate){
        int x = 2, y = 2, target = 0, np[] = new int[numToGenerate];
        for(x = 2; target < numToGenerate;) {
            if (x == y) {
               np[target] = x;
                target++;
                x++;
                y = 2;
            }
            if (x % y == 0) {
                x++; y = 2;
            } else {
                y++;
            }
        }
        return np;
    }
    public static void main(String[] args) {
        String[] carBrands = {"Bmw", "Audi", "Fiat", "Ferrari", "Twingo" };

        System.out.println("in carBrands there are "+ carBrands.length + " elements");
        System.out.println("the third element of carBrands is " + carBrands[2]);

        int[] primeNumbers;

        primeNumbers = genPrimeNum(6);

        System.out.println(Arrays.toString(primeNumbers));
    }
}