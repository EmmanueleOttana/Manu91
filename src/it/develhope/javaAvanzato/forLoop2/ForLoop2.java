package it.develhope.javaAvanzato.forLoop2;

public class ForLoop2 {
    public static void main(String[] args) {

        {
         int seqFib = 1;
         int supp1 = 0;
         int supp2 = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println(seqFib);
                supp2 = supp1;
                supp1 = seqFib;
                seqFib = supp1 + supp2;
            }
        }
    }
}