package it.develhope.simEsame.checkpoint2;

import java.sql.*;

public class Checkpoint2_2 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/simcheck";
        String user = "developer";
        String password = "passwordhere";
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement = conn.createStatement();

        System.out.println("====================================================");
        ResultSet resultSet_A = statement.executeQuery("SELECT nome, cognome FROM simcheck.studente WHERE dataNascita > '1998-01-01'");
        System.out.println("Stampa nome e cognome degli studenti nati dopo il 1998");
        while (resultSet_A.next()){
            System.out.print(resultSet_A.getString("nome")+" ");
            System.out.println(resultSet_A.getString("cognome"));
        }
        System.out.println("====================================================");

        ResultSet resultSet_B = statement.executeQuery("SELECT nome, cognome FROM simcheck.professore WHERE anniEsperienza >= 10");
        System.out.println("Stampa nome e cognome dei professori che hanno" +
                " almeno 10 anni di esperienza");
        while (resultSet_B.next()){
            System.out.print(resultSet_B.getString("nome")+" ");
            System.out.println(resultSet_B.getString("cognome"));
        }
        System.out.println("====================================================");

        ResultSet resultSet_C = statement.executeQuery("SELECT esame.dataEsame FROM simcheck.esame WHERE esame.nomeCorso = 'Programmatore'");
        System.out.println("Stampa le date degli esami del corso “programmazione");
        while (resultSet_C.next()){
            System.out.println(resultSet_C.getString("dataEsame"));
        }
        System.out.println("====================================================");

        ResultSet resultSet_D = statement.executeQuery("SELECT nomeCorso FROM simcheck.esame WHERE studente_matr = 1");
        System.out.println("Stampa i nomi dei corsi degli esami" +
                " effettuati dall’utente con matricola = 1");
        while (resultSet_D.next()){
            System.out.println(resultSet_D.getString("nomeCorso"));
        }
        System.out.println("====================================================");

        ResultSet resultSet_E = statement.executeQuery("SELECT professore.cognome FROM simcheck.professore JOIN simcheck.esame WHERE esame.studente_matr = 1 AND esame.professore_id = professore.id");
        System.out.println("Stampa i cognomi dei professori con cui" +
                " lo studente con matricola = 1 ha svolto almeno un esame");
        while (resultSet_E.next()){
            System.out.println(resultSet_E.getString("cognome"));
        }
        System.out.println("====================================================");


    }
}