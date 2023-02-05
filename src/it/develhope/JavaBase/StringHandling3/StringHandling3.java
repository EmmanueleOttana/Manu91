package it.develhope.JavaBase.StringHandling3;

public class StringHandling3 {
    public static void main(String[] args) {
        String[] array1 = {" I want ",
                " To learn ",
                " how to code! "};
        String[] array2 = new String[array1.length];

        for(int i = 0; i < array1.length; i++){
            array2[i] = array1[i].trim();
        }

        int statement1 = array2[0].compareTo(array1[0]);
        int statement2 = array2[1].compareToIgnoreCase(array1[1]);

        System.out.println("Is statement1 greater than statement2? " + (statement1>statement2));


    }
}
