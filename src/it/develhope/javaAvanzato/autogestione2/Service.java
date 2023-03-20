package it.develhope.javaAvanzato.autogestione2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Service {
    Database database;

    public Service(Database database) {
        this.database = database;
    }

    public void getAllSuperHost(){
        for ( Host proprietario : database.proprietaris ) {
            if (proprietario.getNumPrenotazioni() >= 100){
                database.superHost.add(proprietario);
            }
        }
    }

    public List <String> stampaCaseHost(Host proprietario){
        List <String> abitazioni = new ArrayList<>();
        for ( Abitazione casa : database.abitaziones ) {
            if (casa.proprietario.getCodiceHost() == proprietario.getCodiceHost()){
                abitazioni.add(casa.printDetailsHouse());
            }
        }
        return abitazioni;
    }

    public String lastBooking(Utente ospite){
        List <Prenotazioni> pr = new ArrayList<>();
        for ( Prenotazioni prenotazione : database.prenotazionis ) {
            if (prenotazione.getOspite() == ospite){ pr.add(prenotazione); }}

        Prenotazioni ultima = null;
        for ( Prenotazioni value : pr ) {
            if (ultima == null) { ultima = value; }
            else {
                if (value.getDataInizio().isAfter(ultima.getDataInizio()) ) { ultima = value; }
        }}
        return ultima.toString();
    }

    public Stream<Map.Entry<String, Integer>> moreBookings(){
        Map <String, Integer> prHost = new HashMap<>();
        for ( Prenotazioni pr : database.prenotazionis ) {
            if(pr.getDataInizio().getMonthValue() == LocalDate.now().getMonthValue() -1){
            if (!prHost.containsKey(pr.getProprietario().getUsername())) {
                prHost.put(pr.getProprietario().getUsername(), 1);
            } else {
                prHost.put(pr.getProprietario().getUsername(), prHost.get(pr.getProprietario().getUsername()) + 1);
            }}
        }
        return prHost.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()).limit(5);
    }

    public Stream<Map.Entry<String, Integer>> topPrenotation(){
        Map <String, Integer> prHost = new HashMap<>();
        for ( Prenotazioni pr : database.prenotazionis ) {
            if(pr.getDataInizio().getMonthValue() == LocalDate.now().getMonthValue() -1){
                if (!prHost.containsKey(pr.getOspite().getFullNameID())) {
                    prHost.put(pr.getOspite().getFullNameID(), (int)(pr.getDataFine().toLocalDate().toEpochDay() - pr.getDataInizio().toLocalDate().toEpochDay()));
                } else {
                    prHost.put(pr.getOspite().getFullNameID(),
                            prHost.get(pr.getOspite().getFullNameID()) +
                                    (int)(pr.getDataFine().toLocalDate().toEpochDay() - pr.getDataInizio().toLocalDate().toEpochDay()));
                }}
        }
        return prHost.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()).limit(5);
    }

    public double averageBeds(){
        int totalBeds = 0;
        int totalHouses = 0;
        for ( Abitazione casa : database.abitaziones ) {
            totalBeds += casa.getNumPostiLetto();
            totalHouses ++;
        }
        return  Math.floor((double) totalBeds / totalHouses *100)/100;
    }
}
