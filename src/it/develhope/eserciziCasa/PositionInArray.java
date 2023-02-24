package it.develhope.eserciziCasa;

public class PositionInArray {

    static void search(int target, int[] arr){
        int i = 0;
        for ( int value : arr) {
            if ( value == target) {
                System.out.println(i);
            }
            i ++;
        }
        i = 0;
        int print = 0;
        for ( int value : arr) {
            if ( value > target) {
                print ++;
                System.out.println(i);
                break;
            }
            i ++;
        }
        if (print == 0) { System.out.println(i); }
    }

    public static void main(String[] args) {

        int [] nums = {1,3,5,6};

        search(10,nums);

    }
}
/*
Dato un array ordinato di numeri interi distinti
 e un valore target, restituisce l'indice se
 viene trovato il target. In caso contrario,
  restituire l'indice dove sarebbe se
  fosse inserito in ordine.
*/