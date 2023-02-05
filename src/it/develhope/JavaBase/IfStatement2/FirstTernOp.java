package it.develhope.JavaBase.IfStatement2;

public class FirstTernOp {
    public static void main(String[] args) {

        String mySurname = "Ottanà";

        String verify = mySurname.contains("ni") ? "My last name contains the letters 'ni'" : "My last name does not contain the letters 'ni'";

        System.out.println(verify);
    }
}
