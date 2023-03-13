package it.develhope.esame2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Esame2 {

    public List <String> loadLines(String filePath) throws IOException {
        File file = new File(filePath);
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);

        List <String> frasi = new ArrayList<>();

        while (br.ready()){
        frasi.add(br.readLine());
        }
        return frasi;
    }

    public HashMap <String, Integer> processLines(List<String> lines){
        HashMap <String,Integer> ritorno = new HashMap<>();
        for ( String riga : lines ) {
            if (riga == null){ }
            else if(!riga.contains("$")){ System.out.println("Errore"); }
            else {
                String[] dividi = riga.split("$");
                ritorno.put(dividi[0],dividi[1].trim().split("\\s").length);
            }
        }
        return ritorno;
    }

    public void writeLines(String filePath, HashMap<String, Integer> lines) throws IOException {
        File file = new File(filePath);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(fileWriter);

        br.write(lines.toString());
        br.close();
    }

}
