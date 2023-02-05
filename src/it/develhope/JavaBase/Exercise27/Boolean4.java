package it.develhope.JavaBase.Exercise27;

public class Boolean4 {
    public static void main(String[] args) {

        int a = 1, b = 3, c = a * b, x = 5, y = 6, d = c;
        boolean t = false, f = true;

        boolean A = (d / c + 2) >= b || !(c + b - c / a == 3);       //True
        boolean B = (x * x - y * y / 2 != 12) || !t && f;            //True

        System.out.println(A);
        System.out.println(B);

    }
}