package it.develhope.simEsame.checkpoint2;

import java.io.*;
import java.util.*;

public class Checkpoint2_1 {

    Map<Character, List<String>> charAndWord = new HashMap<>();

    public void inizialiParole(String fileIn, String fileOut) throws IOException {
        File fileInput = new File(fileIn);
        FileReader reader = new FileReader(fileInput);
        BufferedReader br = new BufferedReader(reader);

        while (br.ready()) {
            String[] parole = br.readLine().split(" ");
            for (String value : parole) {
                if ( !charAndWord.containsKey(value.charAt(0)) ) {
                    charAndWord.put(value.charAt(0), new ArrayList<>());
                }
                    charAndWord.get(value.charAt(0)).add(value);
            }
        }

        File fileOutput = new File(fileOut);
        FileWriter fileWriter = new FileWriter(fileOutput);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        bw.write(charAndWord.toString().replaceAll("],", "]\n"));
        bw.close();

    }
    public static void main(String[] args) throws IOException {
        Checkpoint2_1 prova = new Checkpoint2_1();

        prova.inizialiParole("src/it/develhope/simEsame/_2checkpoint_/Carillon.txt",
                "src/it/develhope/simEsame/_2checkpoint_/Scrivi map.txt");



    }
}