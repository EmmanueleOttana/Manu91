package it.develhope.javaAvanzato.autogestione2;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Piattaforma {
    protected static int generatoreID = 0;
    
    public static void main(String[] args) {
        Database database = new Database();
        Service service = new Service(database);

        Host giovanni = new Host("Giovanni71");
        database.aggHost(giovanni);
        Host pippo = new Host("Pippo69");
        database.aggHost(pippo);

        Abitazione villetta = new Abitazione("villa Gaia","via Brambilla",7,3,0,70.00,giovanni);
        database.aggCasa(villetta);
        Abitazione singola = new Abitazione("house Thor","via Roma",3,1,2,20.00,pippo);
        database.aggCasa(singola);
        Abitazione residence = new Abitazione("residence Silente","via Mengoni",4,1,3,35.00,pippo);
        database.aggCasa(residence);

        Utente filippo = new Utente("Filippo","Bianchi","abc@bla.com","via severino 90");
        database.aggUtente(filippo);
        Utente luca = new Utente("Luca","Rossi","def@blabla.com","via garibaldi 17");
        database.aggUtente(luca);

        Prenotazioni _1_Prenotazione = new Prenotazioni(filippo,singola, LocalDateTime.of(2023,2,3,18,0),LocalDateTime.of(2023,6,1,10,0));
        database.aggPrenotazioni(_1_Prenotazione);
        Prenotazioni _2_Prenotazione = new Prenotazioni(filippo,villetta, LocalDateTime.of(2023,2,2,12,20),LocalDateTime.of(2023,10,2,10,0));
        database.aggPrenotazioni(_2_Prenotazione);
        Prenotazioni _3_Prenotazione = new Prenotazioni(luca,residence, LocalDateTime.of(2023,2,4,10,10),LocalDateTime.of(2023,7,4,10,0));
        database.aggPrenotazioni(_3_Prenotazione);

System.out.println("========== STAMPA DETTAGLI HOST ==========");
        System.out.println(giovanni.printDetailsHost());
        System.out.println(pippo.printDetailsHost());
System.out.println();

System.out.println("========== STAMPA DETTAGLI CASA ==========");
        System.out.println(singola.printDetailsHouse());
        System.out.println(villetta.printDetailsHouse());
        System.out.println(residence.printDetailsHouse());
System.out.println();

System.out.println("========== STAMPA RECENZIONE ==========");
        filippo.feedback(pippo,singola,"carino","abitazione accettabile",2);
        filippo.feedback(giovanni,villetta,"bello","molto bello",4);
        luca.feedback(pippo,residence,"stupendo","nessuna lamentela, tutto perfetto",5);
System.out.println();

System.out.println("========== STAMPA PUNTEGGIO FEEDBACK ==========");
        giovanni.setPunteggioFeedback();
        pippo.setPunteggioFeedback();
        System.out.println("Il punteggio feedback di "+ pippo.getUsername() +" è di "+ pippo.getPunteggioFeedback());
        System.out.println("Il punteggio feedback di "+ giovanni.getUsername() +" è di "+ giovanni.getPunteggioFeedback());
System.out.println();

System.out.println("========== STAMPA DETTAGLI UTENTI ==========");
        System.out.println(filippo.printDetailsUtente());
        System.out.println(luca.printDetailsUtente());
System.out.println();

System.out.println("========== STAMPA CASE DI UN UNICO HOST ==========");
        System.out.println(service.stampaCaseHost(giovanni));
        System.out.println(service.stampaCaseHost(pippo));
System.out.println();

System.out.println("========== STAMPA ULTIMA PRENOTAZIONE UTENTE ==========");
        System.out.println(service.lastBooking(filippo));
        System.out.println(service.lastBooking(luca));
System.out.println();

System.out.println("========== STAMPA HOST CON PIU' PRENOTAZIONI NEL MESE PRECEDENTE ==========");
        service.moreBookings().forEach(System.out::println);
        System.out.println();

System.out.println("========== STAMPA TUTTI I SUPER-HOST ==========");
        database.daCancellare(pippo,giovanni);
        System.out.println(Arrays.toString(database.printSuperHost()));
System.out.println();

System.out.println("========== STAMPA 5 UTENTI CON PIU' GIORNI PRENOTATI NEL MESE PRECEDENTE ==========");
        service.topPrenotation().forEach(System.out::println);
System.out.println();

System.out.println("========== STAMPA LA MEDIA DEI POSTI LETTO DI TUTTE LE ABITAZIONI ==========");
        System.out.println("La media di posti letto per abitazione è: " + service.averageBeds());
    }
}