package it.develhope.JavaBase.StringHandling2;

public class StringHandling2 {
    public static void main(String[] args) {

        String string1 = "United Kingdom";
        String string2 = "Germany";

        String sub1 = string1.substring(0,string1.indexOf("\s"));
        String sub2 = string1.substring(string1.indexOf("\s")+1,string1.length());

        String all = sub1+" "+string2+" "+sub2;

        char[] charArray = all.toUpperCase().toCharArray();

        System.out.println(charArray);
    }
}