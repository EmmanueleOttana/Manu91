package it.develhope.Exercise2;

public class Team {
    public String teamName;

    public Programmer p1 = new Programmer();
    public Programmer p2 = new Programmer();
    public static void printTeamDetails(){
        System.out.println("The team name is " + Competition.teamA.teamName);
        System.out.println(Competition.teamA.p1.printProgrammerDetails());
        System.out.println(Competition.teamA.p2.printProgrammerDetails());
        System.out.println("The team name is " + Competition.teamB.teamName);
        System.out.println(Competition.teamB.p1.printProgrammerDetails());
        System.out.println(Competition.teamB.p2.printProgrammerDetails());
    }
}