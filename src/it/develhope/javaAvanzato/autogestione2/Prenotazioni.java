package it.develhope.javaAvanzato.autogestione2;
import java.time.LocalDateTime;

public class Prenotazioni {

    private int idUnivoco;
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;
    private Abitazione abitazionePrenotata;
    private Host proprietario;
    private Utente ospite;

    public Prenotazioni( Utente ospite, Abitazione abitazionePrenotata, LocalDateTime dataInizio, LocalDateTime dataFine) {
        this.ospite = ospite;
        this.abitazionePrenotata = abitazionePrenotata;
        this.proprietario = abitazionePrenotata.proprietario;
        Piattaforma.generatoreID++;
        this.idUnivoco = Piattaforma.generatoreID;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        abitazionePrenotata.proprietario.setNumPrenotazioni();
    }

    public int getIdUnivoco() { return idUnivoco; }

    public void setIdUnivoco(int idUnivoco) { this.idUnivoco = idUnivoco; }

    public LocalDateTime getDataInizio() { return dataInizio; }

    public void setDataInizio(LocalDateTime dataInizio) { this.dataInizio = dataInizio; }

    public LocalDateTime getDataFine() { return dataFine; }

    public void setDataFine(LocalDateTime dataFine) { this.dataFine = dataFine; }

    public Abitazione getCasaPrenotata() { return abitazionePrenotata; }

    public void setCasaPrenotata(Abitazione abitazionePrenotata) { this.abitazionePrenotata = abitazionePrenotata; }

    public Utente getOspite() { return ospite; }

    public void setOspite(Utente ospite) { this.ospite = ospite; }

    public void hostTopPren(Host host){

    }
}