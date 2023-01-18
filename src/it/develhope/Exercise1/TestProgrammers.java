package it.develhope.Exercise1;

public class TestProgrammers {
    public static void main(String args[]){
        Programmer p1 = new Programmer();
        Programmer p2 = new Programmer();
        p1.name = "Emmanuele";
        p1.age = 31;
        p2.name = "Daniela";
        p2.age = 29;
        p2.wearsGlasses = false;

        p1.drinkCoffe();
        p1.printDetails();
        p2.printDetails();
        p2.asGlasses();
    }
}
