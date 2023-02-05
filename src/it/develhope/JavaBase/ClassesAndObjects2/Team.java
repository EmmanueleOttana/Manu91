package it.develhope.JavaBase.ClassesAndObjects2;

public class Team {
    public String teamName;

    public Programmer p1 = new Programmer();
    public Programmer p2 = new Programmer();
    public void printTeamDetails(){
        System.out.println("The team name is " + teamName);
    }
}