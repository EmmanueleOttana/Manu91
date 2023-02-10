package it.develhope.whileLoop3;

public class WhileLoop3 {
    public static void main(String[] args) {

        {
            int seqFib = 1;
            int supp1 = 0;
            int supp2 = 0;
            int print = 0;
            while ( print < 10 ) {
                System.out.println(seqFib);
                print++;
                supp2 = supp1;
                supp1 = seqFib;
                seqFib = supp1 + supp2;
            }
        }
    }
}