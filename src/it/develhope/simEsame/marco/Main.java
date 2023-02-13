package it.develhope.simEsame.marco;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Skill fuoco = new Skill("Mano di fuoco",300,3);
        Skill acqua = new Skill("Vortice d'acqua",250,2);
        Skill vento = new Skill("tornado",500,5);
        Skill terra = new Skill("Macigno",300,2);

        Warrior artu = new Warrior("Pendragon",4000,2,500);
        Wizard merlino = new Wizard("mago",4000,3,700);

        artu.attack(merlino,vento);
        merlino.attack(artu,fuoco);

        System.out.println(artu.getLifePoints());
        System.out.println(merlino.getLifePoints());

    }
}