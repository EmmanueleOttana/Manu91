package it.develhope.simEsame.marco;

import java.util.List;

public class Warrior extends Character {

    int strength;

    public Warrior(String name, int lifePoints, int manaPoints, int strenght) {
        super(name, lifePoints, manaPoints);
        this.strength = strenght;
    }

    public int getStrength() { return strength; }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void attack(Character pg, Skill s) {
        pg.lifePoints -= (s.damage + strength);
    }

}