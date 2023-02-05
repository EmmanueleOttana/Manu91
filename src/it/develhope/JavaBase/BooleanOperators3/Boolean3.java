package it.develhope.JavaBase.BooleanOperators3;

public class Boolean3 {
    public static void main(String[] args) {

        int x = 3, y = 2;
        boolean A = !(!(!(false ^ false) || (true && true)));       //False (HO COMPRESO L'ERRORE)
        boolean B = !((x * y) <= 6) && (x - y != 1);                //True  (HO COMPRESO L'ERRORE)

        System.out.println(A);
        System.out.println(B);

    }
}
