package it.develhope.javaAvanzato.autogestione2;

import java.util.ArrayList;
import java.util.List;

public class Database {

    protected List <Abitazione> abitaziones = new ArrayList<>();
    protected List <Utente> utentis = new ArrayList<>();
    protected List <Host> proprietaris = new ArrayList<>();
    protected List <Prenotazioni> prenotazionis = new ArrayList<>();
    protected List <Feedback> feedbacks = new ArrayList<>();
    protected List <Host> superHost = new ArrayList<>();

    public void aggCasa(Abitazione abitazione){ abitaziones.add(abitazione); }
    public void aggUtente(Utente utente){ utentis.add(utente); }
    public void aggHost(Host host){ proprietaris.add(host); }
    public void aggPrenotazioni(Prenotazioni prenotazioni){ prenotazionis.add(prenotazioni); }
    public void aggFeedback(Feedback feedback){ feedbacks.add(feedback); }

    public void rimuoviCasa(Abitazione casa) {
        for (int i = 0; i < abitaziones.size(); i++) {
            if (abitaziones.get(i) == casa) { abitaziones.remove(i); }
            else { System.out.println("Errore.. Casa non trovata!!"); }
        }
    }
    public void rimuoviUtente(Utente utente) {
        for (int i = 0; i < utentis.size(); i++) {
            if (utentis.get(i) == utente) { utentis.remove(i); }
            else { System.out.println("Errore.. Utente non trovato!!"); }
        }
    }
    public void rimuoviHost(Host host) {
        for (int i = 0; i < proprietaris.size(); i++) {
            if (proprietaris.get(i) == host) { proprietaris.remove(i); }
            else { System.out.println("Errore.. Host non trovato!!"); }
        }
    }
    public void rimuoviPrenotazione(Prenotazioni prenotazione) {
        for (int i = 0; i < prenotazionis.size(); i++) {
            if (prenotazionis.get(i) == prenotazione) { prenotazionis.remove(i); }
            else { System.out.println("Errore.. Prenotazione non trovata!!"); }
        }
    }
    public void rimuoviFeedback(Feedback feedback) {
        for (int i = 0; i < feedbacks.size(); i++) {
            if (feedbacks.get(i) == feedback) { feedbacks.remove(i); }
            else { System.out.println("Errore.. Feedback non trovato!!"); }
        }
    }
    public void rimuoviSuperHost(Host supHost) {
        for (int i = 0; i < superHost.size(); i++) {
            if (superHost.get(i) == supHost) { superHost.remove(i); }
            else { System.out.println("Errore.. SuperHost non trovato!!"); }
        }
    }
    public List<Abitazione> getCasas() {
        return abitaziones;
    }

    public List<Utente> getUtentis() {
        return utentis;
    }

    public List<Host> getProprietaris() {
        return proprietaris;
    }

    public List<Prenotazioni> getPrenotazionis() {
        return prenotazionis;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

}