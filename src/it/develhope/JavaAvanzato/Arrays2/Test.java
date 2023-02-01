package it.develhope.JavaAvanzato.Arrays2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String[] aliceToDos = new String[3], bobToDos = new String[4], timToDos = new String[3];

        aliceToDos[0] = "Coding";
        aliceToDos[1] = "Reading";
        aliceToDos[2] = "Learning";

        bobToDos[0] = "Reading";
        bobToDos[1] = "Coding";
        bobToDos[2] = "Learning";
        bobToDos[3] = "Sleeping";

        timToDos[0] = "Reading";
        timToDos[1] = "Learning";
        timToDos[2] = "Coding";

        System.out.println("Is Alice's array equal to Bob array? " + aliceToDos.equals(bobToDos));
        System.out.println("Is Alice's array equal to Tim array? " + aliceToDos.equals(timToDos));
        System.out.println("Is Alice's array having the same length of Bob's array? " + String.valueOf(aliceToDos.length == bobToDos.length));
        System.out.println("Is Alice's array having the same length of Tim's array? " + String.valueOf(aliceToDos.length == timToDos.length));

        {int target = 0;
            for (int i = 0; i < bobToDos.length; ) {
                if (Arrays.toString(aliceToDos).contains(bobToDos[i])) {
                    target++;
                    i++;
                } else i = bobToDos.length;
                if (i == bobToDos.length) {
                    if (target == aliceToDos.length && target == bobToDos.length) {
                        System.out.println("Alice has the same tasks as Bob!");
                    } else System.out.println("Alice doesn't have the same tasks as Bob!");
                }
            }
        }
        {int target = 0;
            for (int i = 0; i < timToDos.length; ) {
                if (Arrays.toString(aliceToDos).contains(timToDos[i])) {
                    target++;
                    i++;
                } else i = timToDos.length;
                if (i == timToDos.length) {
                    if (target == aliceToDos.length && target == timToDos.length) {
                        System.out.println("Alice has the same tasks as Tim!");
                    } else System.out.println("Alice doesn't have the same tasks as Tim!");
                }
            }
        }

    }
}
