package it.develhope.firstMyProject;

public class Personages extends Skill {
    String name;
    int power;
    int level;
    int lifePoint = 20000;

    public Personages(){}

    public Personages(String name, int skill, int level) {
        this.name = name;
        this.level = level;
        this.power = skill;
    }
    protected int attack(Personages p1) {
        return p1.lifePoint = p1.lifePoint - (this.power * this.level);
    }

}