package it.develhope.javaBase.otherOperators;

public class OtherOperators {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;

        int b = a;
        b++;

        if (b % 2 != 0) System.out.println("'B' is an odd number");
        else System.out.println("'B' is an even number");

        if (b * b +1 % 3 == 0) System.out.println("is a multiple of 3");
        else System.out.println("(B * B +1) is not a multiple of 3");
    }
}