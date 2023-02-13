package it.develhope.simEsame.marco;

public class Skill {
    String name;
    int damage;
    int mana;

    public Skill(String name, int damage, int mana) {
        this.name = name;
        this.damage = damage;
        this.mana = mana;
    }

    public String getName() { return name; }

    public int getDamage() { return damage; }

    public void setDamage(int damage) {
        if (damage >= 0) { this.damage = damage; }
    }

    public int getMana() { return mana; }

    public void setMana(int mana) {
        if (mana >= 0) { this.mana = mana; }
    }

}
