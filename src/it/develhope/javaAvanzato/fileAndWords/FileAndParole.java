package it.develhope.javaAvanzato.fileAndWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class FileAndParole {
    public void stampaParole(Path file) throws IOException {
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fileReader);

        while (br.ready()) {
            String line = br.readLine().trim();
            String[] paroleRiga = line.trim().split(" ");
            for (String parola : paroleRiga) {
                System.out.println(parola);
            }
        }
    }

    public Map<String, Integer> occorrenzaParole(Path file) throws IOException {
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fileReader);

        Map<String, Integer> result = new HashMap<>();

        while (br.ready()) {
            String line = br.readLine().trim();
            String[] paroleRiga = line.trim().split(" ");
            for (String parola : paroleRiga) {
                if (!result.containsKey(parola)) {
                    result.put(parola, 1);
                } else {
                    int value = result.get(parola);
                    result.put(parola, ++value);
                }
            }
        }
        return result;
    }

    public Map<String, Integer> occorrenzaParoleTesto(Path file) throws IOException {
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fileReader);

        Map<String, Integer> result = new HashMap<>();

        while (br.ready()) {
            String line = br.readLine().toLowerCase().trim();
            line = line.replaceAll("[^A-z 0-9 \\s]", "").trim();
            String[] paroleRiga = line.trim().split("\\s");
            for (String parola : paroleRiga) {
                if (!result.containsKey(parola)) {
                    result.put(parola, 1);
                } else {
                    int value = result.get(parola);
                    result.put(parola, ++value);
                }
            }
        }
        return result;
    }

    public Map<String, String> paroleInRima(Path file) throws IOException {
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fileReader);

        Map<String, String> result = new HashMap<>();

        while (br.ready()) {
            String line = br.readLine().trim();
            line = line.replaceAll("[^A-z 0-9 \\s]", "").trim();
            String[] paroleRiga = line.trim().split(" ");
            for (String parola : paroleRiga) {
                if (parola.length() - 3 >= 0) {
                    if (parola.charAt(parola.length() - 3) != parola.charAt(parola.length() - 2)) {
                        result.put(parola.substring(parola.length() - 3), parola);
                    } else result.put(parola.substring(parola.length() - 4), parola);
                }
            }
        }
        return result;
    }
}