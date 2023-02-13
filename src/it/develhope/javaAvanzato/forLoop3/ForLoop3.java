package it.develhope.javaAvanzato.forLoop3;

public class ForLoop3 {
    public static void main(String[] args) {

        String[] arr = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};

        for ( int i = 0; i < arr.length; i++ ){
            if ( i % 2 != 0){
                System.out.println(arr[i]);
            }
            else System.out.println(arr[i].toUpperCase());
        }
    }
}