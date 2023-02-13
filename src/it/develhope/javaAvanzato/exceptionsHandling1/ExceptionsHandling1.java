package it.develhope.javaAvanzato.exceptionsHandling1;

public class ExceptionsHandling1 {
    static void checkScore(double score){
        if (0 < score && score <= 50.00){
            System.out.println("Average score");
        } else if (50.00 < score && score <= 100.00) {
            System.out.println("Very good score");
        }else throw new ArithmeticException ("Score  is out of scale!");
    }
    public static void main(String[] args) {

        checkScore(2.15);
        checkScore(50);
        checkScore(95.02);
        checkScore(100.01);

    }
}