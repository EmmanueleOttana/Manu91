package it.develhope.JavaBase.Exercise37;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime1 {
    public static void main(String[] args) {

        int daysInJanuary = LocalDate.now().lengthOfMonth();
        int daysInAYear = LocalDate.now().lengthOfYear();

        int dayOfMonth = LocalDateTime.now().getDayOfMonth();
        int dayOfYear = LocalDateTime.now().getDayOfYear();

        System.out.println(daysInJanuary - dayOfMonth +" days left to get to the end of the month");
        System.out.println(daysInAYear - dayOfYear +" days left to get to the end of the year");
    }
}
