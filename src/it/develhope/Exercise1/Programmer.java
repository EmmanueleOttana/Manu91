package it.develhope.Exercise1;

public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;

    public static void drinkCoffe() {
        System.out.println("Espresso is the secret!");
    }
    public static void printDetails(String name, int age) {
        System.out.println(name+" is a "+age+" yo programmer");
        drinkCoffe();
    }
    public static void asGlasses(String name, boolean wearsGlasses) {
        System.out.println(name+" wearing glasses? "+wearsGlasses);
    }


}