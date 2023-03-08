package it.develhope.javaAvanzato.autogestione2;

public class Feedback {
    private int idFeedback;
    private String titolo;
    private String testo;
    private int punteggio;

    public Feedback(int idFeedback, String titolo, String testo, int punteggio) {
        this.idFeedback = idFeedback;
        this.titolo = titolo;
        this.testo = testo;
        this.punteggio = punteggio;
    }

    public int getIdFeedback() { return idFeedback; }

    public void setIdFeedback(int idFeedback) { this.idFeedback = idFeedback; }

    public String getTitolo() { return titolo; }

    public void setTitolo(String titolo) { this.titolo = titolo; }

    public String getTesto() { return testo; }

    public void setTesto(String testo) { this.testo = testo; }

    public int getPunteggio() { return punteggio; }

    public void setPunteggio(int punteggio) { this.punteggio = punteggio; }

    public void setPunteggioFeedback (){
        switch (punteggio) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
        }
    }

}
