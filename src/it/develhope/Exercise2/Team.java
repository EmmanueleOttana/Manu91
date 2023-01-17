package it.develhope.Exercise2;

public class Team {
    public static Competition competition = new Competition();
    public String teamName;
    public Programmer p1 = new Programmer();
    public Programmer p2 = new Programmer();
    public static void printTeamDetails(){
        System.out.println("The team name is " + competition.getTimeNameA());
        competition.getTeamA();
        System.out.println("The team name is " + competition.getTimeNameB());
        competition.getTeamB();
    }
}
