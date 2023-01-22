package it.develhope.Exercise25;

public class Boolean2 {
    public static void main(String[] args) {

        boolean b = false;
        boolean a = true;
        int c = 2;
        char d = '2';
        boolean A = (55 != 55) && (false ^ true);            //True (HO COMPRESO L'ERRORE)
        boolean B = (!a || !b) || ( c == d );                //True
        boolean C = false && true || false && !false;        //False
        boolean D = (false && true) || (false || true);      //True

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
    //Quindi confronta le tue soluzioni con un programma Java che verifica la validità delle tue ipotesi.
}
