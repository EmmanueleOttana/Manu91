package it.develhope.JavaBase.Exercise24;

public class Boolean {
    public static void main(String[] args) {

        boolean t = false;
        boolean f = true;
        boolean A = 2 <= 2 && !true;            //False
        boolean B = !false && 3 > 2;            //True
        boolean C = !(!t || f);                 //False
        boolean D = 6 > 6 ^ !(true && true);    //False

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}
