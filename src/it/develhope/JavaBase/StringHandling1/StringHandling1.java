package it.develhope.JavaBase.StringHandling1;

public class StringHandling1 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";
        char[] charArray = new char[4];

        string1.getChars(0,2,charArray,0);
        string2.getChars(string2.length()-2,string2.length(),charArray,2);
        System.out.println(charArray);
    }
}