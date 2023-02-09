package it.develhope.simEsame.marco;

import java.util.ArrayList;
import java.util.List;

public class Skill {
    String name;
    int lifePoints;
    int manaPoints;
    List <Skill> skills = new ArrayList<>();

    public Skill(String name, int damage, int mana) {
        this.name = name;
        this.lifePoints = damage;
        this.manaPoints = mana;
    }

    public String getName() { return name; }

    public int getLifePoints() { return lifePoints; }

    public void setLifePoints(int lifePoints) { this.lifePoints = lifePoints; }

    public int getManaPoints() { return manaPoints; }

    public void setManaPoints(int manaPoints) { this.manaPoints = manaPoints; }

    public void addSkill(Skill s){
        skills.add(s);
    }

    public Skill getSkill(int i){
        return skills.get(i);
    }

    public boolean isAlive(){
        if (lifePoints > 0){
            return true;
        }else return false;
    }


}
