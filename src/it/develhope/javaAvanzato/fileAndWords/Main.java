package it.develhope.javaAvanzato.fileAndWords;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        FileAndParole fileAndParole = new FileAndParole();

        fileAndParole.stampaParole(Path.of("resource/EsempioDiTesto.txt"));

        Map mappa1 = fileAndParole.occorrenzaParole(Path.of("resource/EsempioDiTesto.txt"));

        Map mappa2 = fileAndParole.occorrenzaParoleTesto(Path.of("resource/EsempioDiTesto.txt"));

        Map mappa3 = fileAndParole.paroleInRima(Path.of("resource/EsempioDiTesto.txt"));

        System.out.println(mappa1);
        System.out.println(mappa2);
        System.out.println(mappa3);
    }
}