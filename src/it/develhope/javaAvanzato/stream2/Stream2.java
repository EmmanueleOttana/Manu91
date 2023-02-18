package it.develhope.javaAvanzato.stream2;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Stream2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\39351\\Desktop\\Studio\\Manu91\\src\\it\\develhope\\javaAvanzato\\stream2\\file.txt");

        if (file.exists()){
            System.out.println("File sovrascritto");
        }else System.out.println("File creato");

        FileWriter writer = new FileWriter(file,false);
        BufferedWriter bw = new BufferedWriter(writer);


        bw.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        bw.close();



    }
}
