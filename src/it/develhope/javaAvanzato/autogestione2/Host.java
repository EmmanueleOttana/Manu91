package it.develhope.javaAvanzato.autogestione2;

import java.util.ArrayList;
import java.util.List;

public class Host {

    String username;
    private int codiceHost;
    private int numPrenotazioni = 0;
    private List <Integer> listFeedback = new ArrayList<>();
    private double punteggioFeedback;
    private List <Abitazione> Case = new ArrayList<>();

    public Host(String username) {
        this.username = username;
        Piattaforma.generatoreID++;
        this.codiceHost = Piattaforma.generatoreID;
    }

    public void setNumPrenotazioni() {
        this.numPrenotazioni ++;
    }

    public void printSuperHost(){
        if (this.numPrenotazioni >= 100){
            System.out.println("Hai totalizzato "+ this.numPrenotazioni +" prenotazioni");
            System.out.println("Congratulazioni, sei un SUPER-HOST!");
        }else System.out.println("Hai totalizzato "+ this.numPrenotazioni +" prenotazioni, ancora "+
                (100 - this.numPrenotazioni) +" prenotazioni e diventerai un SUPER-HOST!" );
    }
    public void casaHost(List list, Abitazione abitazione){
        list.add(abitazione);
    }

    public int getNumPrenotazioni() { return numPrenotazioni; }

    public int getCodiceHost() { return codiceHost; }

    public void setCodiceHost(int codiceHost) { this.codiceHost = codiceHost; }

    public double getPunteggioFeedback() {
        return punteggioFeedback;
    }
    public void setPunteggioFeedback(){
        double punteggioTot = 0.00;
        for ( int value : listFeedback ) {
            punteggioTot += value;
        }
        punteggioTot = punteggioTot / this.numPrenotazioni;
        this.punteggioFeedback = punteggioTot;
    }
    public void setListFeedback(int listFeedback) {
        this.listFeedback.add(listFeedback);
    }

    @Deprecated
    public void printDetailsHost() {
        System.out.println("Host "+ this.username + "{" +
                "codiceHost = " + codiceHost +
                ", numPrenotazioni = " + numPrenotazioni +
                '}');
        printSuperHost();
    }
    @Deprecated
    public void printArray(){
        listFeedback.forEach(x -> System.out.println(x));
    }
}
