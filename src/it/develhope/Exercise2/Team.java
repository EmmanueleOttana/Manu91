package it.develhope.Exercise2;

public class Team extends Competition {
    public String teamName;

    public Programmer p1 = new Programmer();
    public Programmer p2 = new Programmer();
    public static void printTeamDetails(){
        System.out.println("The team name is " + teamA.teamName);
        System.out.println(teamA.p1.printProgrammerDetails());
        System.out.println(teamA.p2.printProgrammerDetails());
        System.out.println("The team name is " + teamB.teamName);
        System.out.println(teamB.p1.printProgrammerDetails());
        System.out.println(teamB.p2.printProgrammerDetails());
    }
}