package it.develhope.javaAvanzato.autogestione2;

import java.util.ArrayList;
import java.util.List;

public class Host {

    private String username;
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

    public String printSuperHost(){
        if (this.numPrenotazioni >= 100){
            return  "[ Hai totalizzato "+ this.numPrenotazioni +" prenotazioni ]\n" +
            "<<Congratulazioni, sei un SUPER-HOST!>>";
        }else return  "[ Hai totalizzato "+ this.numPrenotazioni +" prenotazioni, ancora "+
                (100 - this.numPrenotazioni) +" prenotazioni e diventerai un SUPER-HOST! ]";
    }
    public void casaHost(List list, Abitazione abitazione){
        list.add(abitazione);
    }

    public int getNumPrenotazioni() { return numPrenotazioni; }

    public int getCodiceHost() { return codiceHost; }

    public void setCodiceHost(int codiceHost) { this.codiceHost = codiceHost; }

    public String getUsername() { return username; }

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

    public String printDetailsHost() {
        return "Host "+ this.username + " {" +
                "codiceHost = " + this.codiceHost +
                ", numPrenotazioni = " + this.numPrenotazioni +
                "}\n" + printSuperHost();
    }
    @Deprecated
    public void printArray(){ listFeedback.forEach(System.out::println); }
}
