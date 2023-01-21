package it.develhope.Exercise13;

import java.util.Arrays;

public class FirstIf {
    public static void main(String[] args) {

        String myName = "Emmanuele";

        if(myName.length()%2 == 0){
            System.out.println("In my name the number of letters is even");
        }else {
            System.out.println("In my name the number of letters is odd");
        }
    }
}