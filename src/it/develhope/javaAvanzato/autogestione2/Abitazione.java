package it.develhope.javaAvanzato.autogestione2;

public class Abitazione {
    private int id;
    private String nomeLocale;
    private String indirizzo;
    private int numLocali;
    private int numPostiLetto;
    private int piano;
    private double costoGiornaliero;
    Host proprietario;
    Utente affittuario;
    Database database;

    public Abitazione(String nomeLocale,
                      String indirizzo,
                      int numLocali,
                      int numPostiLetto,
                      int piano,
                      double prezzo,
                      Host proprietario)
    {
        Piattaforma.generatoreID++;
        this.id = Piattaforma.generatoreID;
        this.nomeLocale = nomeLocale;
        this.indirizzo = indirizzo;
        this.numLocali = numLocali;
        this.numPostiLetto = numPostiLetto;
        this.piano = piano;
        this.costoGiornaliero = prezzo;
        this.proprietario = proprietario;

    }
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNomeLocale() { return nomeLocale; }

    public void setNomeLocale(String nomeLocale) { this.nomeLocale = nomeLocale; }

    public String getIndirizzo() { return indirizzo; }

    public void setIndirizzo(String indirizzo) { this.indirizzo = indirizzo; }

    public int getNumLocali() { return numLocali; }

    public void setNumLocali(int numLocali) { this.numLocali = numLocali; }

    public int getNumPostiLetto() { return numPostiLetto; }

    public void setNumPostiLetto(int numPostiLetto) { this.numPostiLetto = numPostiLetto; }

    public int getPiano() { return piano; }

    public void setPiano(int piano) { this.piano = piano; }
    public double getCostoGiornaliero() { return costoGiornaliero; }

    @Deprecated
    public void printDetailsHouse() {
        System.out.println("id = " + id +
                ", nomeLocale = '" + nomeLocale + '\'' +
                ", indirizzo = '" + indirizzo + '\'' +
                ", numLocali = " + numLocali +
                ", numPostiLetto = " + numPostiLetto +
                ", piano = " + piano +
                ", costoGiornaliero € = " + costoGiornaliero +
                ", proprietario = " + proprietario.username +
                '}');
    }

}
