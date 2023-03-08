package it.develhope.javaAvanzato.autogestione2;

public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String indirizzo;
    private int idUtente;
    private int idFeedback;

    public Utente(String nome, String cognome, String email, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.indirizzo = indirizzo;
        Piattaforma.generatoreID ++;
        this.idUtente = Piattaforma.generatoreID;
    }

    public void feedback(Host proprietario, Abitazione casa, String titolo, String testo, int punteggio_1a5){
        if (punteggio_1a5 > 0 && punteggio_1a5 < 6 ) {
            Piattaforma.generatoreID ++;
            this.idFeedback = Piattaforma.generatoreID;
            proprietario.setListFeedback(punteggio_1a5);
            System.out.print("Feedback di "+this.nome+": "+"al proprietario " + proprietario.username +
                    " per l'abitazione ''"+casa.getNomeLocale()+"''{ " + titolo.toUpperCase() + " }");
            System.out.println("{ " + testo + " }");
        }else System.out.println("Valore punteggio feedback errato!");
    }

    public String getNome() { return nome; }

    public String getCognome() { return cognome; }

    public String getEmail() { return email; }

    public String getIndirizzo() { return indirizzo; }

    public int getIdFeedback() { return idFeedback; }

    @Deprecated
    public void printDetailsUtente() {
        System.out.println("Utente{ " +
                "nome = " + nome +
                ", cognome = " + cognome +
                ", email = " + email +
                ", indirizzo = " + indirizzo +
                ", idUtente = " + idUtente +
                ", idFeedback = " + idFeedback +
                '}');
    }
}
