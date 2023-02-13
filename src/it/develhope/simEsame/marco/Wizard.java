package it.develhope.simEsame.marco;

import java.util.List;

public class Wizard extends Character{

    int abilityPower;

    public Wizard(String name, int lifePoints, int manaPoints, int abilityPower) {
        super(name, lifePoints, manaPoints);
        this.abilityPower = abilityPower;
    }

    public int getAbilityPower() { return abilityPower; }

    public void setAbilityPower(int abilityPower) { this.abilityPower = abilityPower; }

    @Override
    public void attack(Character pg, Skill s) {
        pg.lifePoints -= (s.damage*abilityPower)/2;
    }

}
