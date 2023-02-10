package it.develhope.javaAvanzato.forLoop4;

public class CustomNumber {
    int number;

    public CustomNumber() {
        this.number = (int) (Math.random() * 11+1);
        System.out.println("Custom number "+ number);
    }
    public void getMultiplicationTable(){
        for (int i = 12; i > 0; i--) {
            System.out.println(i);
        }
    }
}
