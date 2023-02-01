package it.develhope.JavaAvanzato.Arrays1;

import java.util.Arrays;

public class Test {
    static int[] genPrimeNum (int numToGenerate){
        int x = 2, y = 2, target = 0, array[] = new int[numToGenerate];
        for(x = 2; target < numToGenerate;) {
            if (x == y) {
               array[target] = x;
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
        return array;
    }
    public static void main(String[] args) {
        String[] carBrands = {"Bmw", "Audi", "Fiat", "Ferrari", "Twingo" };

        System.out.println("in carBrands there are "+ carBrands.length + " elements");
        System.out.println("the third element of carBrands is " + carBrands[2]);

        int[] primeNumbers;

        primeNumbers = genPrimeNum(6);

        System.out.println("The first "+primeNumbers.length+" prime numbers are: "+Arrays.toString(primeNumbers));
    }
}