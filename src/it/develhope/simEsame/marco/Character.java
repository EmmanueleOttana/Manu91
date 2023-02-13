package it.develhope.simEsame.marco;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    String name;
    int lifePoints;
    int manaPoints;
    List <Skill> skills = new ArrayList<>();

    public Character(String name, int lifePoints, int manaPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.skills.clear();
    }

    public String getName() { return name; }

    public int getLifePoints() { return lifePoints; }

    public int getManaPoints() { return manaPoints; }

    public List getSkills() { return skills; }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }
    public void addSkill(Skill s){
        skills.add(s);
    }

    public Skill getSkill(int i){
        return (Skill) skills.get(i);
    }

    public boolean isAlive(){
        if (lifePoints > 0){
            return true;
        }else return false;
    }
    public abstract void attack(Character pg, Skill s);
}
