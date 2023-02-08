package it.develhope.javaAvanzato.wildCards1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List <Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(((double) Math.round(Math.random()*1000))/100);
        individualMarksListLisa.add(((double) Math.round(Math.random()*1000))/100);

        List <Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add((int) (Math.random()*10));
        projectMarksListJeremy.add((int) (Math.random()*10));

        Student lisa = new Student("Lisa","Stuart",Student.getAverageMark(individualMarksListLisa));
        Student jeremy = new Student("Jeremy","Green",Student.getAverageMark(projectMarksListJeremy));

        System.out.println(lisa.toString());
        System.out.println(jeremy.toString());

        System.out.println("First vote Lisa " + individualMarksListLisa.get(0));
        System.out.println("Second vote Lisa " + individualMarksListLisa.get(1));
        System.out.println("First vote Jeremy " + projectMarksListJeremy.get(0));
        System.out.println("Second vote Jeremy " + projectMarksListJeremy.get(1));

    }
}
