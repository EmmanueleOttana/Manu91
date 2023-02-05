package it.develhope.JavaBase.Static;

public class Tester {
    public static void main(String[] args) {
        Employee emma = new Employee("Emma","Watson","Hollywood 7");
        Employee scar = new Employee("Scarlett","Johansson","New street 10");

        Badge badgeEmma = new Badge(emma);
        Badge badgeScar = new Badge(scar);

        badgeEmma.showBadgeDetails();
        badgeScar.showBadgeDetails();

    }
}
