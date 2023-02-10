package it.develhope.javaAvanzato.whileLoop1;

public class WhileLoop1 {
    public static void main(String[] args) {

        int x = 0;
        while ( x == 0 ){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am");
        }
    }
}