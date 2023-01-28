package it.develhope.Exercise38;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DataOra2 {
    public static void main(String[] args) {

        String localFormat = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMMM-yy HH:mm"));
        String isoFormat = String.valueOf(ZonedDateTime.now());

        System.out.println(localFormat);
        System.out.println(isoFormat);

    }
}
