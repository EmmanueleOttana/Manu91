package it.develhope.firstMyProject;
public class Main {

    private static void battle(Personages p1, Personages p2) {

        for (int i = 0; p2.lifePoint > 0 || p1.lifePoint > 0; i++) {
            if (i % 2 == 0) {
                p1.attack(p2);
                System.out.println(p1.name + " ha attaccato " + p2.name + " portando i suoi life points a " + p2.lifePoint);
                if (p2.lifePoint <= 0) {
                    System.out.println(p2.name + " ha perso!");
                    break;
                }
            } else {
                p2.attack(p1);
                System.out.println(p2.name + " ha attaccato " + p1.name + " portando i suoi life points a " + p1.lifePoint);
                if (p2.lifePoint <= 0) {
                    System.out.println(p2.name + " ha perso!");
                    break;
                } else if (p1.lifePoint <= 0) {
                    System.out.println(p1.name + " ha perso!");
                    break;
                }
            }
        }
    }
        public static void main (String[]args){

            Personages wizard = new Personages("Merlino", new Personages().powerOfWater, 3);
            Personages warrior = new Personages("Lancillotto", new Personages().powerOfEarth, 3);
            Personages archer = new Personages("Robin hood", new Personages().powerOfWind, 3);
            Personages dragon = new Personages("Drax", new Personages().powerOfFire, 3);

            battle(archer,dragon);
            battle(warrior,wizard);
        }

    }

