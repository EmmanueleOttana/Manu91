package it.develhope.Exercise2;

public class Competition {
    //Creazione team
    public static Team teamA = new Team();
    public static Team teamB = new Team();

    public static void main(String[] args) {
        //Assegnazione nome
        teamA.teamName = "Ravenclaw";
        teamB.teamName = "Hufflepuff";

        //Assegnazione dettagli programmatori
        teamA.p1.name = "Emmanuele"; teamA.p1.programmingLanguage = "Java"; teamA.p1.yearsOfExperience = 7;
        teamA.p2.name = "Daniela"; teamA.p2.programmingLanguage = "Javascript"; teamA.p2.yearsOfExperience = 10;
        teamB.p1.name = "Luca"; teamB.p1.programmingLanguage = "C++"; teamB.p1.yearsOfExperience = 4;
        teamB.p2.name = "Elisa"; teamB.p2.programmingLanguage = "Python"; teamB.p2.yearsOfExperience = 8;

        //Stampa
        CompetitionRules.printRules();
        teamA.printTeamDetails();
        System.out.println(teamA.p1.printProgrammerDetails());
        System.out.println(teamA.p2.printProgrammerDetails());
        teamB.printTeamDetails();
        System.out.println(teamB.p1.printProgrammerDetails());
        System.out.println(teamB.p2.printProgrammerDetails());
    }
}