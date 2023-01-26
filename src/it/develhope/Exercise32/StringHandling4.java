package it.develhope.Exercise32;

import java.util.Arrays;

public class StringHandling4 {
    public static void main(String[] args) {
        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        veryLongString = veryLongString.replace("um","hum");

        String sub1 = veryLongString.substring(0,veryLongString.indexOf("aliquip"));
        String sub2 = veryLongString.substring(veryLongString.indexOf("aliquip"),veryLongString.length());

        System.out.println(sub1.trim());
        System.out.println(sub2.trim());

        if (sub1.contains("est")){
            System.out.println("The word 'est' is found in 'sub1'");
        } if (sub2.contains("est")) {
            System.out.println("The word 'est' is found in 'sub2'");
        }
    }
}